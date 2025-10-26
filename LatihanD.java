/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

import java.io.*;

public class LatihanD {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CopyFileBinary <source> <destination>");
            return;
        }

        String source = args[0];
        String dest = args[1];

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Copy selesai!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
