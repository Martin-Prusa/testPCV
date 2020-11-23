package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej délku pole: ");
        int delkaPole = sc.nextInt();
        int[] pole = new int[delkaPole];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = sc.nextInt();
        }
        int nejvetsi = pole[0];
        int nejmensi = pole[0];
        double prumer = 0;
        for (int i = 0; i < pole.length; i++) {
            if(pole[i]<nejmensi)
                nejmensi = pole[i];
            else if(pole[i]>nejvetsi)
                nejvetsi = pole[i];
            prumer += pole[i];
        }
        prumer -= nejvetsi+nejmensi;
        System.out.println("Největší: "+nejvetsi);
        System.out.println("Nejmenší: "+nejmensi);
        prumer = prumer / (pole.length - 2);
        System.out.println("Průměr:"+prumer );
    }
}
