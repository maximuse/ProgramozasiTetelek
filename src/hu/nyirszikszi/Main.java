package hu.nyirszikszi;

import java.util.Arrays;

import hu.nyirszikszi.tetelek.Tetelek;

public class Main {

    public static void main(String[] args) {
       int[] a = {6, 3, 7, 1, 10, 5, 11, 2, 8, -1, 9, 4, 0};
       System.out.println("Tomb: " + Arrays.toString(a));
       System.out.println("Tomb hossza: " + a.length + "\n");

        Tetelek t = new Tetelek(a);
        System.out.println("Osszegzes: " + t.getOsszegzes());
        System.out.println("Megszamlalas: " + t.getMegszamlalas());
        System.out.println("Eldontes: " + t.getEldontes());
        System.out.println("Kivalasztas: " + t.getKivalasztas());
        System.out.println("Kereses: " + t.getKereses());
        System.out.println("Min: " + t.getMin());
        System.out.println("Max: " + t.getMax());
        System.out.println("Kivalogatas: " + t.getKivalogatas());
        System.out.println("Szetvalogatas: " + t.getSzetvalogatas());
    }
}