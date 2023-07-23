/*
define 2 classes ; one for generating fibonacci numbers and other for
 displaying even numbers in a given range . Implement using threads.(Runnable Interface).
*/

import java.util.Scanner;

import java.util.*;

class fibonacci implements Runnable {
    int l;

    fibonacci(int n) {
        l = n;
    }

    public void run() {
        
        int c;
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 0; i <= l; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

class even implements Runnable {
    int l;

    even(int n) {
        l = n;
    }

    public void run() {
        for (int i = 0; i <= l; i++) {
            if (i % 2 == 0)
                System.out.print(i + "  ");
        }
        System.out.println("");

    }

}

class Qnt2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit  for fib:");
        int l = sc.nextInt();
         System.out.println("Enter Limit  for even :");
        int l2 = sc.nextInt();
        fibonacci f = new fibonacci(l);
        Thread T1 = new Thread(f);
        T1.start();
        even e = new even(l2);
        Thread T2 = new Thread(e);
        T2.start();
    }
}

/**
Enter Limit :
4
0  2  4
0 1 1 2 3 5 8

 */