package Saska_Ilic_JavaTest;

public class Zadatak3 {
    public static void prostiBrojevi(int n){
        boolean prost = false;
        for (int t = 2; t <= n; t++) {
            for (int j = 2; j <= t; j++) {
                if(t % j == 0 && t != j) {
                    System.out.println(t + " je slozen");
                    prost = false;
                    break;
                }else{
                    prost = true;
                }
            }
            if (prost) {
                System.out.println(t + " je prost");
            }
        }
    }
    public static void main(String[] args) {
        int n = 21;
        prostiBrojevi(n);

    }
}
/*3. [25] Napisati funkciju prostiBrojevi koja za zadati ceo broj n, 2 < n ≤ 50,
        ispisuje za svaki broj t, 2 ≤ t ≤ n poruku oblika:
        1 "<t> je prost "; ako je t prost broj
        2 "<t> je slozen "; ako t nije prost broj
OBJASNJENJE:
Broj je prost ako je deljiv samo sa 1 i sa samim sobom.
Broj x je deljiv brojem y ako je ostatak operacije x/y jedank 0.
        */
