//c03 -prgm -3
class ePerson{
    
    public static void main(String[] args) {
    P_Techer obj[] = new P_Techer[2];
       obj[0] =new P_Techer("john","male","Kochi",21,101,10000,"Apple","MCA",122,"CA","java");
      
       obj[1] =new P_Techer("Joby","male","Kochi",21,201,20000,"google","MCA",322,"CA","C++");  
       obj[0].display();
       System.out.println("..........................................");
       obj[1].display();
    }
}

class Person{
    String Name,Gender,Address;
    int age;
    Person(String n,String g,String A,int Age){
        this.Name =n;
        this.Gender =g;
        this.Address =A;
        this.age=Age;
    }
    void display(){
        System.out.println("Name   : " + this.Name);
        System.out.println("Gender    : " + this.Gender);
        System.out.println("Address : " + this.Address);
        System.out.println("age  : " + this.age);
    }

}
class Emp extends Person {
    int Empid,salary;
    String company_Name,Qualification;

    Emp(String n ,String  g,String A,int Age,int id,int sal ,String c_name,String Qual){
        super(n,g,A,Age); 
        this.Empid =id;
        this.salary =sal;
        this.company_Name =c_name;
        this.Qualification=Qual; 
         }

    void display(){
        super.display();
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Company Name    : " + this.company_Name);
        System.out.println("Qualification : " + this.Qualification);
        System.out.println("Salary  : " + this.salary);
    }


}
class  P_Techer extends Emp{
String Department, Subject;
int Teacher_id;

            P_Techer(String n ,String  g,String A,int Age,int id,int sal,String c_name,String Qual ,int t_id ,String dep ,String sub){
               super(n,g,A,Age,id,sal,c_name,Qual); 
               this.Department =dep;
               this.Teacher_id =t_id;
               this.Subject = sub;
            }
            void display(){   
                    super.display();
                    System.out.println("Dept Name : " + this.Department);
                    System.out.println("Subject Name : " + this.Subject);
                    
            }

}