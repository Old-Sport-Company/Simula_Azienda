/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldsportcompanybank_database;

/**
 *
 * @author Old Sport Company
 */
public interface Query {

    public void createDB();

    public void connect();

    public void createTable();

    public void insert();

    public void modifyTable();

    public void modify();

    public void select();

    public void quit();

    public void delete();
}
