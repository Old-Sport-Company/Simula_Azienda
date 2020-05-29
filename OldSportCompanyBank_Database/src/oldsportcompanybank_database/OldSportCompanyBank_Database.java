/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldsportcompanybank_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Old Sport Company
 */
public class OldSportCompanyBank_Database implements oldsportcompanybank_database.Query {

    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/test";
    private static String usingDB = "test";
    private static String user = "root";
    private static String password = "";

    String nomeTable;
    ArrayList<ArrayList<String>> campiTabelle = new ArrayList<>();
    ArrayList<ArrayList<String>> tipiCampiTabelle = new ArrayList<>();
    ArrayList<String> tabelle = new ArrayList<>();
    ArrayList<String> tipoCampi = new ArrayList<>();
    ArrayList<String> listaCampi = new ArrayList<>();
    ArrayList<Integer> sceltaCampi = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    static Connection c = null;
    static Statement s = null;

    public OldSportCompanyBank_Database() {
        try {
            //Caricare il driver "MySQL JDBC Driver"
            Class.forName(driver);
            //Creare una connessione a MySQL
            c = DriverManager.getConnection(url, user, password);
            //Imposto autocommit a true (transazioni)
            c.setAutoCommit(true);
            //Preparare uno statement (creo lo statement e imposto la query)
            s = c.createStatement();
            /*Se la query restituisce dei dati a questo punto
                preparo un Resultset
                tratto i dati in esso presenti
             */
        } catch (ClassNotFoundException ex) {
            System.err.println("Errore: non si trova il driver JDBC di MyQSL nel path indicato");
            System.err.println(ex.getMessage());
        } catch (SQLException ex) {
            System.err.println("Errore: eccecione creata dal DB");
            //Bisogna creare un metodo che traduca il codice di errore di MySQL 
            showSQLException(ex);
        }
    }

    @Override
    public void createDB() {
        try {
            System.out.println("Inserisci il nome del DataBase");
            String nome = sc.next();
            String query = "CREATE DATABASE " + nome;
            try {
                s.execute(query);
            } catch (SQLException ex) {
                System.err.println("Errore: errore nell'esecuzione della query");
                showSQLException(ex);
            }
        } finally {
            System.out.println("Si dovrebbe chiudere la connesione");
            try {
                s.close();
            } catch (SQLException ex) {
                System.err.println("Errore");
                System.err.println(ex.getMessage());
                showSQLException(ex);
            }
            try {
                c.close();
            } catch (SQLException ex) {
                System.err.println("Errore");
                System.err.println(ex.getMessage());
                showSQLException(ex);
            }
        }
    }

    public void createDB(String nome) {
        try {
            String query = "CREATE DATABASE " + nome;
            try {
                s.execute(query);
            } catch (SQLException ex) {
                System.err.println("Errore: errore nell'esecuzione della query");
                showSQLException(ex);
            }
        } finally {
            System.out.println("Si dovrebbe chiudere la connesione");
            try {
                s.close();
            } catch (SQLException ex) {
                System.err.println("Errore");
                System.err.println(ex.getMessage());
                showSQLException(ex);
            }
            try {
                c.close();
            } catch (SQLException ex) {
                System.err.println("Errore");
                System.err.println(ex.getMessage());
                showSQLException(ex);
            }
        }
    }

    @Override
    public void connect() {
        System.out.println("Quale DB vuoi usare?");
        String nome = sc.next();
        try {
            Class.forName(driver);
            c = DriverManager.getConnection(url, user, password);
            c.setAutoCommit(true);
            s = c.createStatement();
            s.execute("USE " + nome + ";");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void createTable() {
        try {
            String query = "CREATE TABLE";
            int numero;
            System.out.println("Come vuoi chiamare la tabella?");
            nomeTable = sc.next();
            tabelle.add(nomeTable);
            query = query + " " + nomeTable + " (";
            System.out.println("Quanti parametri vuoi mettere nella tabella?");
            numero = sc.nextInt();
            for (int i = 0; i < numero; i++) {
                int scelta;
                System.out.println("Come vuoi chiamare il " + (i + 1) + "° campo?");
                String campo = sc.next();
                listaCampi.add(campo);
                query = query + campo + " ";
                System.out.println("Di che tipo è?");
                do {
                    System.out.println("1.INT");
                    System.out.println("2.VARCHAR");
                    System.out.println("3.DATE");
                    scelta = sc.nextInt();
                    switch (scelta) {
                        case 1:
                            query = query + "INT";
                            tipoCampi.add("INT");
                            break;
                        case 2:
                            int b;
                            System.out.println("Di quanti caratteri massimi deve essere il campo?");
                            b = sc.nextInt();
                            System.out.println("Inserisci un valore numerico");
                            query = query + "VARCHAR(" + b + ")";
                            tipoCampi.add("VARCHAR");
                            break;
                        case 3:
                            query = query + "DATE";
                            tipoCampi.add("DATE");
                            break;
                        default:
                            System.out.println("Opzione non esistente!");
                            break;
                    }
                } while (scelta < 1 || scelta > 3);
                if (i < (numero - 1)) {
                    query = query + ", ";
                }
            }
            query = query + ");";
            s.execute(query);
            campiTabelle.add(listaCampi);
            tipiCampiTabelle.add(tipoCampi);
        } catch (SQLException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void insert() {
        String query = "INSERT INTO ";
        System.out.println("Lista delle tabelle");
        for (int i = 0; i < tabelle.size(); i++) {
            System.out.println((i + 1) + " " + tabelle.get(i));
        }
        System.out.println("In quale tabella vuoi aggiungere i dati?");
        int scelta = sc.nextInt();
        query = query + tabelle.get(scelta - 1) + " VALUES (";
        System.out.println("Inserisci i dati per " + tabelle.get(scelta - 1));
        for (int i = 0; i < campiTabelle.get(scelta - 1).size(); i++) {
            System.out.print("Inserisci " + campiTabelle.get(scelta - 1).get(i));
            //for (int j = 0; j < tipiCampiTabelle.get(scelta - 1).size(); j++) {
            System.out.println(", tipo: " + tipiCampiTabelle.get(scelta - 1).get(i));
            switch (tipiCampiTabelle.get(scelta - 1).get(i)) {
                case "INT":
                    query = query + "'" + sc.nextInt() + "'";
                    break;
                case "VARCHAR":
                    query = query + "'" + sc.next() + "'";
                case "DATE":
                    query = query + "'" + sc.next() + "'";
            }
            if (i != tipiCampiTabelle.get(scelta - 1).size() - 1) {
                query = query + ",";
            } else {
                query = query + ");";
            }
            //}
        }
        try {
            s.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modifyTable() {

    }

    @Override
    public void modify() {

    }

    @Override
    public void select() {
        String query;
        int nCampi;
        for (int i = 0; i < listaCampi.size(); i++) {
            System.out.println((i + 1) + "." + listaCampi.get(i));
        }
        System.out.println("Di quanti campi vuoi le informaioni");
        nCampi = sc.nextInt();
        System.out.println("Di quali campi vuoi le informaioni");
        String s;
        try {

        } catch (Exception e) {
        }
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void quit() {
        try {
            s.close();
        } catch (SQLException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(OldSportCompanyBank_Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showSQLException(java.sql.SQLException e) {
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
