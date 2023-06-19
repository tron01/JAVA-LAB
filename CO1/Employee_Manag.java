import java.util.Scanner;

class Employe{
    private int eNo;
    private String eName;
    private double eSalary;
    Employe(int eNo,eName,eSalary){
        this.eNo =eNo;
        this.eName=eName;
        this.eSalary=eSalary;
    }
    public int getEno(){
        return eNo;

    }
    public String getName(){
        return eName;

    }
    public double getSalary(){
        return eSalary;

    }
}
public class Employee_Manag(){
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enetr the number of Employees:");
        int n=s.nextInt();
        Employe [] employees =new Employe[n];
        for(int i=0;i<n;i++){

            System.out.println("Enter the details for employee"+(i+1));
            System.out.print("eNo:");
            int eNo=s.nextInt();
            System.out.print("eSalary:");
            String eName=s.nextDouble();
            employees[i] =new Employe(eNo,eName,eSalary);

        }
        System.out.print("Enter the employee number to search for:")
        int searchNo =s.nextInt();
        boolean found=false;
        for(Employe employe:employees){
            if(employees.getEno()=searchNo){
                System.out.println("Employee found:");
                System.out.println("eNo:"+employee.getEno());
                System.out.println("eName:"+employee.getName());
                System.out.println("eSalary:"+employee.getSalary());
                found=true;
                break;

            }
        }
        if(!found){
            System.out.println ("Employee not found!");

        }
        s.close();

    }
}