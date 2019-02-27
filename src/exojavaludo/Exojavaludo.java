/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exojavaludo;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import views.DescriptionPersonnage;

/**
 *
 * @author afort
 */
public class Exojavaludo {

    /**
     * Connect to a sample database
     *
     * @param fileName the database file name
     */
    public static void createNewDatabase(String fileName) {

        String appDataPath = System.getenv("appdata");
        String pathOfBDD = appDataPath + "\\Exojavaludo";
        new File(pathOfBDD).mkdirs();
        String url = "jdbc:sqlite:" + pathOfBDD + "\\" + fileName;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Le nom du driver utilisé est : " + meta.getDriverName());
                System.out.println("Une nouvelle Base de données à été crée : " + pathOfBDD + "\\" + fileName);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DescriptionPersonnage DescriptionPersonnage = new DescriptionPersonnage();
    }

}
