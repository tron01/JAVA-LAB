//c04 - prgm 1 part -2

import java.util.Scanner;

import arithmetic.Sum;
import arithmetic.Div;
import arithmetic.Mul;
import arithmetic.Sub;
import java.util.*;
public class arithmetic_operation {
    public static void main(String []args)
    {
         Scanner sc = new Scanner(System.in);
        
        
      
         int n;
        while (true) {
             System.out.println("1:ADDITION");
              System.out.println("2:DIVITION");
            System.out.println("3:SUBSTRACTION");
            System.out.println("4:MULTIPLICATION");
            System.out.println("5:EXIT");
            System.out.println("Enter Your choice ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                Sum sm = new Sum();
                    sm.operation();
                    break;
                case 2:
                Div d = new Div();
                    d.operation();
                    break;
                case 3:
                 
        Sub sb = new Sub();
                    sb.operation();
                    break;
                case 4:
               Mul m = new Mul();
                    m.operation();
                    break;
                case 5:
                    System.out.println("Exiting the Program");
                    System.exit(0);
                default:
                    System.out.println("invalid! choice");

            }
        }

    }




    }



        
        /**
        
1:ADDITION
2:DIVITION
3:SUBSTRACTION
4:MULTIPLICATION
5:EXIT
Enter Your choice
1
Enter the 1 st number : 2
Enter the 2 nd number : 3
SUM :5
1:ADDITION
2:DIVITION
3:SUBSTRACTION
4:MULTIPLICATION
5:EXIT
Enter Your choice
3
Enter the 1 st number : 33
Enter the 2 nd number : 11
DIFFERENCE :22
1:ADDITION
2:DIVITION
3:SUBSTRACTION
4:MULTIPLICATION
5:EXIT
Enter Your choice
3
Enter the 1 st number : 42
Enter the 2 nd number : 10
DIFFERENCE :32
1:ADDITION
2:DIVITION
3:SUBSTRACTION
4:MULTIPLICATION
5:EXIT
Enter Your choice
4
Enter the 1 st number : 2
Enter the 2 nd number : 6
MULTIPLICATION RESULT :12
1:ADDITION
2:DIVITION
3:SUBSTRACTION
4:MULTIPLICATION
5:EXIT
Enter Your choice
5
Exiting the Program 
 */
      
           
           
      