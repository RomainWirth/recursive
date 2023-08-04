package fr.campus.recursive;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Main {
    // récursivité factorielle
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
//    Factorielle factorial = new Factorielle();

    // Suite de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

    // Conjecture de Syracuse
    public static int syracuse(int N, int i) {
        if (i == 0) {
            return N;
        } else {
            int result = syracuse(N, i-1);
            if (result%2 == 0) { // => n est pair
                return result/2;
            } else { // => n est impair
                return result * 3 + 1;
            }
        }
    }

    // PGCD
    public static int pgcd(int a, int b) {
        if (b != 0) {
            return pgcd(b, a%b);
        } else {
            return a;
        }
    }

    public static void main(String[]args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ecrire un nombre n : ");
        int n = userInput.nextInt();
//        System.out.println("Recursive factorial : " + factorial(n));
//        System.out.println("Fibonacci : " + fibonacci(n));
        System.out.println("Ecrire un nombre i : ");
        int i = userInput.nextInt();
//        System.out.println(syracuse(n, i));
        System.out.println(pgcd(n, i));
    }
}
