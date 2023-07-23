// c03 -prgm 4
import java.util.Scanner;
class Publisher{
    String publisher;
    Publisher(String pub){
        this.publisher=pub;
    }
}
class Book extends Publisher{
    String book;
    Book(String pub,String boo){
        super(pub);
        book=boo;

    }
}
class Literature extends Book{
    String category;
    Literature(String pub, String boo){
        super(pub, boo);
    }
    void display(){
        System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+book);
    }
}
class Fiction extends Book{
    Fiction(String pub, String boo){
        super(pub, boo);
    }
    void display(){
        System.out.println("Publisher :"+publisher);
        System.out.println("Book :"+book);
    }
}
public class bookDetails{
    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Literature Books");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Literature arr[]=new Literature[num];
        System.out.println("\n Enter the Literature Book Details\n");
        int x = 0,j=0;
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<num;i++)
        {
            x = i +1;
            System.out.println("\n"+x+").");
            System.out.println("\n Book : ");
            String boo =sc.next();
            System.out.println("\n Publisher: ");
            String pub =sc.next();
        
            arr[i]=new Literature(boo,pub);
        }
        System.out.println("\nEnter the No. of Fiction Books");
        int num1 = sc1.nextInt();
        Fiction arr1[]=new Fiction[num1];
        System.out.println("\n Enter the Fiction Book Details\n");
        int x1 = 0,j1=0;
        for(int i =0;i<num1;i++)
        {
            x1 = i +1;
            System.out.println("\n"+x1+")");
            System.out.println("\n Book : ");
            String boo =sc.next();
            System.out.println("\n Publisher: ");
            String pub =sc.next();
        
            arr1[i]=new Fiction(boo,pub);
        }
        sc.close();
        sc1.close();
        System.out.println("------------------------------------------------");
        System.out.println("\nInformations of all the Literature Books");
        for(int i=0;i<num;i++){
            j=i+1;
            System.out.println("\n"+j+").");
            arr[i].display();
            
        }
        System.out.println("------------------------------------------------");
        System.out.println("\nInformations of all the Fiction Books");
        for(int i=0;i<num1;i++){
            j1=i+1;
            System.out.println("\n"+j1+").");
            arr1[i].display();
            
        }
        
        System.out.println("------------------------------------------------");
     sc1.close();
     }
    
    }

    /**
Enter the No. of Literature Books
1

 Enter the Literature Book Details


1).

 Book :
abcd

 Publisher:
a1

Enter the No. of Fiction Books
2

 Enter the Fiction Book Details


1)

 Book :
xyz

 Publisher:
a2

2)

 Book :
xyw

 Publisher:
a3
------------------------------------------------

Informations of all the Literature Books

1).
Publisher :abcd
Book :a1
------------------------------------------------

Informations of all the Fiction Books

1).
Publisher :xyz
Book :a2

2).
Publisher :xyw
Book :a3


 */