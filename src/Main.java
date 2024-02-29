
// Ali Eren KÖSE 29/02/2024 04:08

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // paternin başlangıç ve bitiş sayısını iste , kaydet.
        System.out.print("Patternin başlangiç sayısını giriniz : ");
        int number = input.nextInt();
        System.out.print("Pattern : ");
        patternDown(number,number);
    }

    static int patternDown(int numberDown, int numberUp) {
        // sayıyı 0<= olana kadar 5 eksilt ve sıfır olduğunda artttırma patternine yönelt
        System.out.print(numberDown + " ");
        if (numberDown > 0){
            numberDown -= 5;
            return patternDown(numberDown,numberUp);
        }else {
            return patternUp(numberDown,numberUp);
        }
    }
    // sayıyı ilk girilen sayıya kadar 5 arttır ve eşit olunca dur
    static int patternUp(int numberDown , int numberUp){
        if (numberDown < numberUp) {
            numberDown += 5;
            System.out.print(numberDown + " ");
            return patternUp(numberDown,numberUp);
        }
        else
            return numberDown;
    }
}
