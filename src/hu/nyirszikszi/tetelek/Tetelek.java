package hu.nyirszikszi.tetelek;

import java.util.ArrayList;

public class Tetelek {
    private int[] t;

    public Tetelek(int[] t) {
        this.t = t;
    }

    public int[] getT() {
        return t;
    }

    public void setT(int[] t) {
        this.t = t;
    }

    public int getOsszegzes() {
        int osszeg = 0;

        for (int i=0; i<t.length; i++) {
            osszeg += this.t[i];
        }

        return osszeg;
    }

    public int getMegszamlalas() {
        int db = 0;

        for (int i=0; i<t.length; i++) {
            if (this.t[i] % 2 == 0) {
                db++;
            }
        }

        return db;
    }

    public boolean getEldontes() {
        int n = 0;
        int keresettElem = 8;
        boolean eredmeny = false;

        while (n<t.length && eredmeny!=true) {
            if (this.t[n] == keresettElem) {
                eredmeny = true;
            }

            n++;
        }

        return eredmeny;
    }

    public int getKivalasztas() {
        int keresettElem = 1;
        int n = 0;

        for (int i=0; i<t.length; i++) {
            if (this.t[i] == keresettElem) {
                n = i+1;
            }
        }

        return n;
    }

    public String getKereses() {
        int keresettElem = 4;
        boolean letezikE = false;
        int n = 0;

        while(n<t.length && letezikE!=true) {
            if (this.t[n] == keresettElem) {
                letezikE = true;
            }

            n++;
        }

        if (letezikE == true) {
            return letezikE + " (" + n + ")";
        }
        else {
            return letezikE + "";
        }
    }

    public int getMin() {
        int min = this.t[0];

        for (int i=0; i<t.length; i++) {
            if (min > this.t[i]) {
                min = this.t[i];
            }
        }

        return min;
    }

    public int getMax() {
        int max = this.t[0];

        for (int i=0; i<t.length; i++) {
            if (max < this.t[i]) {
                max = this.t[i];
            }
        }

        return max;
    }

    public ArrayList getKivalogatas() {
        ArrayList lista = new ArrayList();

        for (int i=0; i<t.length; i++) {
            if (this.t[i]%3==0) {
                lista.add(this.t[i]);
            }
        }

        return lista;
    }

    public String getSzetvalogatas() {
        ArrayList paros = new ArrayList();
        ArrayList paratlan = new ArrayList();

        for (int i=0; i<t.length; i++) {
            if (this.t[i]%2==0) {
                paros.add(this.t[i]);
            }
            else {
                paratlan.add(this.t[i]);
            }
        }

        return "paros: " + paros.toString() + " paratlan: " + paratlan.toString();
    }
}