package com.example.sezarencryption;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner taryici = new Scanner(System.in);
        System.out.println("Şifrelemek için bir metin giriniz");
        String metin = taryici.next();
        int anahtar = 3;
        String sifrelenmisMetin = sifrele(metin, anahtar);
        System.out.println("Sifrelenmis metin: " + sifrelenmisMetin);
    }

    public static String sifrele(String metin, int anahtar) {
        String sifreliMetin = "";
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if (karakter >= 'a' && karakter <= 'z') {
                karakter = (char) (karakter + anahtar);
                if (karakter > 'z') {
                    karakter = (char) (karakter - 26);
                }
            } else if (karakter >= 'A' && karakter <= 'Z') {
                karakter = (char) (karakter + anahtar);
                if (karakter > 'Z') {
                    karakter = (char) (karakter - 26);
                }
            }
            sifreliMetin += karakter;
        }
        return sifreliMetin;
    }

}
