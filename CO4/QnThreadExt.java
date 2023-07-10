/*
define 2 classes ; one for generating multi table of 5 and
 other for displaying first N prime Number
,Implement using threads (Threads class) 
*/
import java.util.Scanner;

 class PrimeNumbers extends Thread {
 int count;
 int primeCount = 0;
    PrimeNumbers(int count){
    this.count=count;
    }
 public void run() {
            for(int i=1;primeCount<count;i++){
            boolean isPrime=true;
                if(i==1)
                {
                i++;
                }
            for (int j=2;j<i;j++){
                if(i%j==0){
                isPrime = false;
                break;
                }
            }
            if (isPrime){
                System.out.println("Prime Number : "+i);
                primeCount++;
             }
         }
 }
}


class MultiTable5 extends Thread {
 int count;
 MultiTable5(int count){
 this.count=count;
 }
 public void run() {
 for (int i=0;i<=count;i++){
 System.out.println("5 x "+i+" = "+(5*i));
 }
 }
}


public class QnThreadExt {
        public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        int primeCount,multipleCount;
        System.out.println("Enter number of Prime Numbers to be listed : ");
        primeCount = scanner.nextInt();
        System.out.println("Enter number of Multiples of 5 to be listed : ");
        multipleCount = scanner.nextInt();
        PrimeNumbers thread1 = new PrimeNumbers(primeCount);
        thread1.start();
        MultiTable5 thread2 = new MultiTable5(multipleCount);
        thread2.start();
        }
}

/*
Enter number of Prime Numbers to be listed :
10
Enter number of Multiples of 5 to be listed :
5
Prime Number : 2
Prime Number : 3
Prime Number : 5
Prime Number : 7
Prime Number : 11
Prime Number : 13
Prime Number : 17
Prime Number : 19
Prime Number : 23
Prime Number : 29
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
*/