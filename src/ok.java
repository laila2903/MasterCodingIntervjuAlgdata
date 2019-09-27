import javax.swing.*;
import java.util.Arrays;

public class ok {

    String [] large = new String[100];

    public static void findLaila (String [] a){
        //long starttime = System.currentTimeMillis();
        for (int i = 0; i < a.length; ++i){
            if (a[i]=="laila"){
                System.out.println("Found laila");
            }
        }
        //long endtime = System.currentTimeMillis();
        //long timeElapsed = endtime-starttime;
        //System.out.println("Call to find laila took "+timeElapsed+" ms");
    }

    /**
     * Her vil loopen basically spørre "Er dette laila, ved neste bit av array er dette laila osv.....Og hver sånn sammen
     * ligning er en operasjon, siden a = 100, så vil loopen spørre for hver elemnt om det er laila, altså 100 elemnter
     * så vi ser at antall operasjoner er lik antall elemnet og vi får en linær forhold mellom dem y = n, altså er dette
     * en O(n) kompleksitet eller linear time. Stor O er avhengig av antall elemnter linært.
     * 1) Big O snakker alltid om worst case
     * 2) Man fjerner alltid konstantene
     * 3) Different terms for inputs, her er det slik at hvis det er to forskjellige inputs ( int [] a, int [] b) så vil O(a+b) siden det er to hel uavhengig input
     * 4) Drop non dominants
     */

    public static void compressfirstbox(int [] a){
        System.out.println(a[0]);
    }

    /**
     * i denne funksjonen ser man at uansett hvor stor a [] er, så vil uansett funksjonen bare kjøre sout på box lik 0
     * her ser man at kjøretid på metoden har ingenting med antall elemnter som kommer inn, den har en konstant tid uansett
     * med andre or er dette en 0(1) kompleksitet.
     */

    public static void funChallenge (int [] b){
        int a = 10; //O(1)
        a = 50 + 3; //O(1)

        for (int i = 0; i<b.length; ++i){ //O(n)  //løkker er O(n) som oftest
            // anotherfunction(); // O(n), er avhengig av antall elementer
            boolean stranger = true; // O(n), er avhengig av antall elementer
            ++a; // O(n), er avhengig av antall elementer
        }
        //return a; // O(1) , returneres bare en gang på slutten
    }

    // Vi har 1 + 1 +1 +n + n+n+n = 3 + 4n ...... BIG = O(3+4n) blir simplifisert til O(n)

    // Log all pairs of array
    int [] box = {1,2,3,4,5};

    public static void LogAllPairsOfArray ( int [] array){
        for (int i = 0; i<array.length; ++i){
            for( int j = 0; j<array.length; ++j){
                System.out.print(i);
                System.out.print(j);
            }
        }
    }

    /**
     * Når man ser for-loops som er inni hverandre så må man gange n med hverandre, mens hvis det er to uavhengige for loops er det bare å plusse n med hverandre
     * i dette eksemplet får vi n*n som er lik n^2. Som oftest er nøstet loops eller loops inni hverandre av orden O(n^2), kvadratisk tid.
     */

    public static void printAllNumbersThenAllPariSum (int [] numbers){
        System.out.println("These are the numbers: ");
        for (int number:numbers) {
            System.out.println(number);
        }
        System.out.println("and these are their sums ");
        for (int firstnumber:numbers) {
            for (int secondnumber:numbers) {
                System.out.println(firstnumber+secondnumber);
            }
        }
    }


String [] strings = {"a","b","c","d"};

    /**
     * Antar:
     * 1) 4 elementer som tar 4 hyller i RAM, altså 4*4 bit = 16 bytes lagring
     */



    public static void main(String[] args) {
        int [] box = {1,2,3,4,5};
    printAllNumbersThenAllPariSum(box);









    }

}














