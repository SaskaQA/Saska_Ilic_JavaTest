package Saska_Ilic_JavaTest;

public class Zadatak2 {
    public static boolean daLiSuIsti(double[] niz1, double[] niz2, double[] niz3){
        if(niz1.length != niz2.length || niz2.length != niz3.length)
            return false;
        for (int i = 0; i < niz1.length; i++) {
            if(niz1[i] != niz2[i])
                return false;
            if(niz2[i] != niz3[i])
                return false;
        }
        return true;
    }
    public static boolean daLiSuIstiOgledalo(double[] niz1, double[] niz2){
        if(niz1.length != niz2.length)
            return false;
        for (int i = 0; i < niz1.length; i++) {
            if(niz1[i] != niz2[niz2.length - i -1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        double[] niz1 = {2};
        double[] niz2 = {2};
        double[] niz3 = {2};

        System.out.println(daLiSuIsti(niz1, niz2, niz3));

        double[] noviNiz1 = {3};
        double[] noviNiz2 = {3};
        System.out.println(daLiSuIstiOgledalo(noviNiz1, noviNiz2));
    }
}
/*
(a) [15] Napisati funkciju daLiSuIsti koja prima 3 niza realnih brojeva i
        vraca odgovor na pitanje da li su oni medjusobno jednaki.

(b) [25] Napisati funkciju daLiSuIstiOgledalo koja prima 2 niza realnih
        brojeva i vraca odgovor na pitanje da li su oni isti u slucaju kada drugi
        niz posmatramo od pozadi.
        */