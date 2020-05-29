/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldsportcompanybank_client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Old Sport Company
 */
public class Client extends JFrame implements ActionListener {

    //componenti dell'interfaccia client
    private JPanel Bonifici;
    private JTextField CVC_CVV;
    private JLabel Data;
    private JTextField Data1, Data2, Data3, Data4, Data5, Data6, Data7;
    private JMenu Help;
    private JLabel IBAN;
    private JTextField Importo1, Importo2, Importo3, Importo4, Importo5, Importo6, Importo7;
    private JMenu Impostazioni;
    private JPanel Interfaccia;
    private JTextField Intestatario;
    private JMenuBar Menu;
    private JTextField NomeMittente;
    private JLabel Nominativi;
    private JTextField NumeroCarta;
    private JTextField NumeroIBAN;
    private JLabel Saldo;
    private JTextField ScadenzaCarta;
    private JTextField Somma;
    private JTextField SommaBonifico;
    private JMenu Termina;
    private JLabel TransazioneData, TransazioneDettagli, TransazioneImporto;
    private JPanel Transazioni;
    private JButton Trasferimento;
    private JButton Versamento;
    private JTextField Versamento1, Versamento2, Versamento3, Versamento4, Versamento5, Versamento6;
    private JLabel jLabel2;
    private JTextField jTextField7;

    //componenti della registrazione
    private JButton Button_annulla, Button_conferma;
    private JLabel Label_CAP, Label_CF, Label_cellulare, Label_citta, Label_cognome, Label_confermaMail, Label_confermaPass;
    private JLabel Label_dataNascita, Label_indirizzo, Label_luogoNascita, Label_nome, Label_provincia;
    private JPanel Registrazione;
    private JTextField Registrazione_CAP, Registrazione_CF, Registrazione_anno, Registrazione_cellulare, Registrazione_citta;
    private JTextField Registrazione_cognome, Registrazione_confermaMail, Registrazione_confermaPass, Registrazione_giorno;
    private JTextField Registrazione_indirizzo, Registrazione_mail, Registrazione_mese, Registrazione_nascita, Registrazione_nome;
    private JTextField Registrazione_password, Registrazione_provincia;

    //componenti del login
    private JButton Button_login, Login_registrati;
    private JLabel Frase;
    private JPanel Login;
    private JTextField Login_mail, Login_password;

    //componenti comuni
    private JLabel Label_mail, Label_password;

    public Client() {

    }

    public void Interfaccia() {

        Interfaccia = new JPanel();
        Data = new JLabel();
        Nominativi = new JLabel();
        IBAN = new JLabel();
        Bonifici = new JPanel();
        Versamento = new JButton();
        Trasferimento = new JButton();
        NumeroIBAN = new JTextField();
        Intestatario = new JTextField();
        NomeMittente = new JTextField();
        SommaBonifico = new JTextField();
        NumeroCarta = new JTextField();
        Somma = new JTextField();
        ScadenzaCarta = new JTextField();
        CVC_CVV = new JTextField();
        Transazioni = new JPanel();
        TransazioneImporto = new JLabel();
        TransazioneData = new JLabel();
        TransazioneDettagli = new JLabel();
        Saldo = new JLabel();
        jLabel2 = new JLabel();
        Versamento2 = new JTextField();
        Versamento4 = new JTextField();
        Versamento5 = new JTextField();
        Versamento3 = new JTextField();
        Versamento1 = new JTextField();
        Versamento6 = new JTextField();
        jTextField7 = new JTextField();
        Data1 = new JTextField();
        Data3 = new JTextField();
        Importo4 = new JTextField();
        Importo3 = new JTextField();
        Importo1 = new JTextField();
        Importo2 = new JTextField();
        Data2 = new JTextField();
        Data4 = new JTextField();
        Data5 = new JTextField();
        Importo5 = new JTextField();
        Importo6 = new JTextField();
        Data6 = new JTextField();
        Data7 = new JTextField();
        Importo7 = new JTextField();
        Menu = new JMenuBar();
        Termina = new JMenu();
        Impostazioni = new JMenu();
        Help = new JMenu();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Data.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Nominativi.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Nominativi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IBAN.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        IBAN.setToolTipText("");
        IBAN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Bonifici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Versamento.setText("Versamento");
        Versamento.addActionListener(this);

        Trasferimento.setText("Trasferimento");
        Trasferimento.addActionListener(this);

        NumeroIBAN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Intestatario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        NomeMittente.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        SommaBonifico.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        NumeroCarta.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        Somma.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        ScadenzaCarta.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        CVC_CVV.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        javax.swing.GroupLayout BonificiLayout = new javax.swing.GroupLayout(Bonifici);
        Bonifici.setLayout(BonificiLayout);
        BonificiLayout.setHorizontalGroup(
                BonificiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BonificiLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(BonificiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CVC_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ScadenzaCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Somma, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NumeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SommaBonifico, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NomeMittente, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Intestatario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NumeroIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(BonificiLayout.createSequentialGroup()
                                                .addGroup(BonificiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Versamento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Trasferimento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        BonificiLayout.setVerticalGroup(
                BonificiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BonificiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(NomeMittente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumeroIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SommaBonifico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Intestatario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Versamento)
                                .addGap(25, 25, 25)
                                .addComponent(NumeroCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Somma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScadenzaCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CVC_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Trasferimento)
                                .addContainerGap(41, Short.MAX_VALUE))
        );

        Transazioni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TransazioneImporto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TransazioneImporto.setText(" IMPORTO");
        TransazioneImporto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TransazioneData.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TransazioneData.setText("   DATA");
        TransazioneData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TransazioneDettagli.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        TransazioneDettagli.setText("   VERSAMENTI");
        TransazioneDettagli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Saldo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Saldo.setText("SALDO");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Versamento6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Data7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Importo7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        javax.swing.GroupLayout TransazioniLayout = new javax.swing.GroupLayout(Transazioni);
        Transazioni.setLayout(TransazioniLayout);
        TransazioniLayout.setHorizontalGroup(
                TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransazioniLayout.createSequentialGroup()
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Versamento5)
                                        .addComponent(Versamento4)
                                        .addComponent(Versamento3)
                                        .addComponent(Versamento2)
                                        .addComponent(Versamento1)
                                        .addComponent(TransazioneDettagli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                                        .addComponent(Versamento6)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TransazioniLayout.createSequentialGroup()
                                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Data4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(TransazioneData, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                                .addComponent(Data1)
                                                                .addComponent(Data3)
                                                                .addComponent(Data2))
                                                        .addComponent(Data7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(TransazioneImporto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(Importo3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Importo1)
                                                                .addComponent(Importo2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Importo4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(Importo7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(TransazioniLayout.createSequentialGroup()
                                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Data5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Data6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Importo6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Importo5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        TransazioniLayout.setVerticalGroup(
                TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransazioniLayout.createSequentialGroup()
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TransazioneImporto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(TransazioneDettagli, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                        .addComponent(TransazioneData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Versamento6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Data7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importo7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(TransazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Saldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout InterfacciaLayout = new javax.swing.GroupLayout(Interfaccia);
        Interfaccia.setLayout(InterfacciaLayout);
        InterfacciaLayout.setHorizontalGroup(
                InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InterfacciaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(InterfacciaLayout.createSequentialGroup()
                                                .addComponent(IBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                                                .addComponent(Nominativi, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(198, 198, 198)
                                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(InterfacciaLayout.createSequentialGroup()
                                                .addComponent(Bonifici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Transazioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        InterfacciaLayout.setVerticalGroup(
                InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(InterfacciaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Nominativi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(IBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(InterfacciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Bonifici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Transazioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Termina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Termina.setText("Termina");
        Termina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Termina.addActionListener(this);
        Menu.add(Termina);

        Impostazioni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Impostazioni.setText("Impostazioni");
        Impostazioni.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Impostazioni.addActionListener(this);
        Menu.add(Impostazioni);

        Help.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Help.setText("Help (?)");
        Help.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Help.addActionListener(this);
        Menu.add(Help);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Interfaccia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(Interfaccia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setVisible(true);
        pack();
    }

    public void Registrazione() {
        Registrazione = new JPanel();
        Label_mail = new JLabel();
        Label_password = new JLabel();
        Label_confermaMail = new JLabel();
        Label_CF = new JLabel();
        Label_confermaPass = new JLabel();
        Label_luogoNascita = new JLabel();
        Label_dataNascita = new JLabel();
        Label_nome = new JLabel();
        Label_indirizzo = new JLabel();
        Label_cognome = new JLabel();
        Label_CAP = new JLabel();
        Registrazione_mail = new JTextField();
        Registrazione_CAP = new JTextField();
        Label_provincia = new JLabel();
        Label_citta = new JLabel();
        Label_cellulare = new JLabel();
        Registrazione_password = new JTextField();
        Registrazione_CF = new JTextField();
        Registrazione_confermaMail = new JTextField();
        Registrazione_nome = new JTextField();
        Registrazione_confermaPass = new JTextField();
        Registrazione_cognome = new JTextField();
        Registrazione_giorno = new JTextField();
        Registrazione_nascita = new JTextField();
        Registrazione_provincia = new JTextField();
        Registrazione_indirizzo = new JTextField();
        Registrazione_citta = new JTextField();
        Registrazione_cellulare = new JTextField();
        Registrazione_mese = new JTextField();
        Registrazione_anno = new JTextField();
        Button_conferma = new JButton();
        Button_annulla = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_mail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_mail.setText("E-mail:");

        Label_password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_password.setText("Password:");

        Label_confermaMail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_confermaMail.setText("Conferma E-mail:");

        Label_CF.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_CF.setText("Codice fiscale:");

        Label_confermaPass.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_confermaPass.setText("Conferma Password:");

        Label_luogoNascita.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_luogoNascita.setText("Luogo di nascita:");
        Label_luogoNascita.setToolTipText("");

        Label_dataNascita.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_dataNascita.setText("Data di nascita:");

        Label_nome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_nome.setText("Nome:");

        Label_indirizzo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_indirizzo.setText("Indirizzo:");

        Label_cognome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_cognome.setText("Cognome:");

        Label_CAP.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_CAP.setText("CAP:");

        Registrazione_mail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_CAP.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Label_provincia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_provincia.setText("Provincia:");

        Label_citta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_citta.setText("Città:");

        Label_cellulare.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_cellulare.setText("Cellulare:");

        Registrazione_password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_CF.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_confermaMail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_nome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_confermaPass.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_cognome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_giorno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_nascita.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_provincia.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_indirizzo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_citta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_cellulare.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_mese.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Registrazione_anno.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Button_conferma.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Button_conferma.setText("Conferma");
        Button_conferma.addActionListener(this);

        Button_annulla.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Button_annulla.setText("Annulla");
        Button_annulla.addActionListener(this);

        javax.swing.GroupLayout RegistrazioneLayout = new javax.swing.GroupLayout(Registrazione);
        Registrazione.setLayout(RegistrazioneLayout);
        RegistrazioneLayout.setHorizontalGroup(
                RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_mail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_mail))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_confermaMail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_confermaMail))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_password)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_password))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_confermaPass)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_confermaPass))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_CF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_CF))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_nome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_nome))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_cognome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_cognome))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_dataNascita)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_giorno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_mese, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_anno))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_luogoNascita)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_nascita))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_indirizzo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_indirizzo))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_citta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_citta))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_cellulare)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_cellulare))
                                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                                .addComponent(Label_CAP)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_CAP)
                                                .addGap(18, 18, 18)
                                                .addComponent(Label_provincia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Registrazione_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(Button_conferma)
                                .addGap(18, 18, 18)
                                .addComponent(Button_annulla)
                                .addContainerGap(102, Short.MAX_VALUE))
        );
        RegistrazioneLayout.setVerticalGroup(
                RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrazioneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_mail)
                                        .addComponent(Registrazione_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_confermaMail)
                                        .addComponent(Registrazione_confermaMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_password)
                                        .addComponent(Registrazione_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_confermaPass)
                                        .addComponent(Registrazione_confermaPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_CF)
                                        .addComponent(Registrazione_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_nome)
                                        .addComponent(Registrazione_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_cognome)
                                        .addComponent(Registrazione_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_dataNascita)
                                        .addComponent(Registrazione_giorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Registrazione_anno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Registrazione_mese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_luogoNascita)
                                        .addComponent(Registrazione_nascita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_indirizzo)
                                        .addComponent(Registrazione_indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_CAP)
                                        .addComponent(Registrazione_CAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_provincia)
                                        .addComponent(Registrazione_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Label_citta)
                                        .addComponent(Registrazione_citta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_cellulare)
                                        .addComponent(Registrazione_cellulare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistrazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Button_annulla)
                                        .addComponent(Button_conferma))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Registrazione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Registrazione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setVisible(true);
        pack();
    }

    public void Login() {
        Login = new JPanel();
        Label_mail = new JLabel();
        Login_mail = new JTextField();
        Label_password = new JLabel();
        Login_password = new JTextField();
        Button_login = new JButton();
        Frase = new JLabel();
        Login_registrati = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_mail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_mail.setText("E-mail:");

        Login_mail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Label_password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Label_password.setText("Password:");

        Login_password.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        Button_login.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Button_login.setText("Login");
        Button_login.addActionListener(this);

        Frase.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Frase.setText("Se non hai ancora un conto ");

        Login_registrati.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Login_registrati.setText("Registrati");
        Login_registrati.addActionListener(this);

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginLayout.createSequentialGroup()
                                                .addComponent(Label_mail)
                                                .addGap(15, 15, 15)
                                                .addComponent(Login_mail))
                                        .addGroup(LoginLayout.createSequentialGroup()
                                                .addComponent(Label_password)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Login_password))
                                        .addGroup(LoginLayout.createSequentialGroup()
                                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Button_login)
                                                        .addComponent(Frase))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Login_registrati)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        LoginLayout.setVerticalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Login_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Label_mail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Label_password)
                                        .addComponent(Login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Frase)
                                        .addComponent(Login_registrati))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        setVisible(true);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
