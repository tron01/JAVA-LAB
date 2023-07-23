import java.util.*;
class MyException extends Exception {
    public MyException(String str) {
        System.out.println(str);
    }
}

class Exception2 {
    public static void main(String args[]) {
        int no;
        int i;
        int temp, count = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Total numbers");
        no = sc.nextInt();
        for (i = 0; i < no; i++) {
            try {
                temp = sc.nextInt();
                if (temp >= 0) {
                    sum += temp;
                    count += 1;
                } else {
                    throw new MyException("Number is Negative");
                }
            } catch (MyException ex) {
                System.out.println("EXCEPTION OCCURED -ve number entered");
            }
        }
        System.out.print("Average : ");
        System.out.println(sum / count);

    }
}
2/**
Total numbers
4
1
2
-1
Number is Negative
EXCEPTION OCCURED -ve number entered
5
Average : 2
 */