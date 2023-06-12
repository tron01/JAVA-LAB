// prgm -4 matrix addition
import java.util.Scanner;
class MatrixAdd{
    int a[][];
    int b[][];
    int c[][];
    

void ReadM(){
    a=new int[3][3];
    b=new int[3][3];

   Scanner s =new Scanner(System.in);
    System.out.println("Enter the elements 1st matrix:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        a[i][j]=s.nextInt();

    }
    }

    System.out.println("Enter the elements 2nd matrix:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        b[i][j]=s.nextInt();

    }
    }
}
void AddM(){
    c=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        c[i][j]=a[i][j]+b[i][j];

    }
    }

}
void PrintM(){
 System.out.println("  Elements of A:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){           
        System.out.print(a[i][j] +" ");
      }
       System.out.println();
    }
System.out.println("  Elements of B:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){           
        System.out.print(b[i][j] +" ");
      }
       System.out.println();
    }
System.out.println("  Elements of C:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){           
        System.out.print(c[i][j] +" ");
      }
       System.out.println();
    }
}
public static void main (String args[]){
MatrixAdd obj =new MatrixAdd();
obj.ReadM();
obj.AddM();
obj.PrintM();
    }
}