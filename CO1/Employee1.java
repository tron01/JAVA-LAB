import java.util.Scanner;

class Employee1 {
 int eNo;
 String eName="";
 float eSalary;
 
 public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the Employee No :: ");
  eNo = in.nextInt();
  System.out.print("Enter the Employee name :: ");
  eName = in.next();
  System.out.print("Enter the salary :: ");
  eSalary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee No = " + eNo);
  System.out.println("Employee name = " + eName);
  System.out.println("Employee salary = " + eSalary);
 }
public static void main(String[] args) {
  
  System.out.println("Enter the no. of employees");
Scanner sc = new Scanner(System.in);   
int n=sc.nextInt();
  Employee1 e[] = new Employee1[n];
        for (int i = 0; i < n; i++) {
        	e[i] = new Employee1();
	
  	e[i].getInput();
    }
  System.out.println("********************************");
    System.out.println("**** Data Entered as below ****");
  
    for(int i=0; i<n; i++) {
   
   	e[i].display();
    }
System.out.print("\nEnter  the employee number to search: ");
        int searchENo = sc.nextInt();
        int flag = 0;

        for(Employee1 employee : e){
            if (employee.eNo == searchENo) {
                System.out.println("\nEmployee details found:");
                employee.display();
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Employee not found");
    }  
} 

/*
Enter the no. of employees
2
Enter the Employee No :: 11
Enter the Employee name :: ASHIL
Enter the salary :: 100
Enter the Employee No :: 12
Enter the Employee name :: ANAND
Enter the salary :: 10000
********************************
**** Data Entered as below ****
Employee No = 11
Employee name = ASHIL
Employee salary = 100.0
Employee No = 12
Employee name = ANAND
Employee salary = 10000.0

Enter  the employee number to search: 12

Employee details found:
Employee No = 12
Employee name = ANAND
Employee salary = 10000.0


*/ 