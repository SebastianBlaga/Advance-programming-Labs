package com.company;

import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog catalog)
        throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))){
            oos.writeObject(catalog);
        }
        catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    public static void Catalog load(String path)
        throws InvalidCatalogException {
        try ( var oin = new ObjectInputStream(
                new FileInputStream(path))){
            oin.readObject(path);

        }


    }

    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(doc);
        }
    }
}
