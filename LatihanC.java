/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LatihanC {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("input.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                String[] words = line.trim().split("\\s+");

                for (String w : words) {
                    if (!w.isEmpty()) {
                        map.put(w, map.getOrDefault(w, 0) + 1);
                    }
                }
            }

            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("count.txt"))) {
                for (String key : map.keySet()) {
                    writer.write(key + ":" + map.get(key));
                    writer.newLine();
                }
            }

            System.out.println("Word count telah disimpan ke count.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
