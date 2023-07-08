package Saska_Ilic_JavaTest;

public class Zadatak1 {
    public static int najmanjiOdCetiri(int[] niz1, int[] niz2, int[] niz3, int[] niz4){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < niz1.length; i++) {
            if(niz1[i] < min)
                min = niz1[i];
        }
        for (int i = 0; i < niz2.length; i++) {
            if(niz2[i] < min)
                min = niz2[i];
        }
        for (int i = 0; i < niz3.length; i++) {
            if(niz3[i] < min)
                min = niz3[i];
        }
        for (int i = 0; i < niz4.length; i++) {
            if(niz4[i] < min)
                min = niz4[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] niz1 = {1 , 2 , 3 , 4 , 5};
        int[] niz2 = {6 , 7 , -1 , 0};
        int[] niz3 = {9 , 10};
        int[] niz4 = {11, 12};

        System.out.println(najmanjiOdCetiri(niz1, niz2, niz3, niz4));

        int[] nizz1 = {5 , 4 , 3 , 2 , 1 , 0 , -1 , -2};
        int[] nizz2 = {-3 , -4};
        int[] nizz3 = {-5};
        int[] nizz4 = {-5};

        System.out.println(najmanjiOdCetiri(nizz1, nizz2, nizz3, nizz4));
    }
}
/*
1. [40] Napisati funkciju najmanjiOdCetiri koja prima 4 niza celih brojeva i
        vraca najmanji broj medju ta 4 prosledjena niza.*/
