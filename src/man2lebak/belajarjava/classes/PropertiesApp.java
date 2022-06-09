package man2lebak.belajarjava.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        // menload file properties
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.proerties"));

            System.out.println(properties.getProperty("first.name"));
            System.out.println(properties.getProperty("last.name"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File tidak ditemukan!");
        } catch (IOException exception) {
            System.out.println("Gagal load data dar file!");
        }

        // membuat file properties
        try {
            Properties properties = new Properties();

            properties.put("host", "localhost");
            properties.put("port","8080");

            properties.store(new FileOutputStream("konfigurasi.properties"), "");

            System.out.println("\nSukses menyimpan file properties");

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Error membuat file propeties");
        } catch (IOException ioException) {
            System.out.println("Error menyimpan file");
        }
    }
}
