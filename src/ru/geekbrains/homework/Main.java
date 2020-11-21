package ru.geekbrains.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Task 1:
        byte[] buf = new byte[70];

        try (FileInputStream in = new FileInputStream("demo.txt")) {
            int count;
            while ((count = in.read(buf)) > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.print(buf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Task 2://

        List<InputStream> al = new ArrayList<>();
        SequenceInputStream seq = null;
        try (FileInputStream in1 = new FileInputStream("1.txt");
             FileInputStream in2 = new FileInputStream("2.txt");
             FileInputStream in3 = new FileInputStream("3.txt");
             FileInputStream in4 = new FileInputStream("4.txt");
             FileInputStream in5 = new FileInputStream("5.txt");

             FileOutputStream out = new FileOutputStream("6.txt")) {
            al.add(in1);
            al.add(in2);
            al.add(in3);
            al.add(in4);
            al.add(in5);
            Enumeration<InputStream> list = Collections.enumeration(al);
            seq = new SequenceInputStream(list);
            int rb = seq.read();
            while (rb != -1) {
                out.write(rb);
                rb = seq.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                seq.close();
            } catch (IOException e) {
            }



        }
    }
}

