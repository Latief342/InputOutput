/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan kalimat: ");
        String line = br.readLine().trim();

        if (line.isEmpty()) {
            System.out.println("Jumlah kata: 0");
        } else {
            String[] words = line.split("\\s+");
            System.out.println("Jumlah kata: " + words.length);
        }
    }
}
