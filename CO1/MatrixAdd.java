// prgm -4 matrix addition
import java.util.Scanner;
class MatrixAdd{
    int a[][];
    int b[][];
    int c[][];
    
int size;
void ReadM(){
    

   Scanner s =new Scanner(System.in);
    System.out.println("Enter the size of array:");
    size=s.nextInt();
    a=new int[size][size];
    b=new int[size][size];
    System.out.println("Enter the elements 1st matrix:");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        a[i][j]=s.nextInt();

    }
    }

    System.out.println("Enter the elements 2nd matrix:");
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        b[i][j]=s.nextInt();

    }
    }
}
void AddM(){
    c=new int[size][size];
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
        c[i][j]=a[i][j]+b[i][j];

    }
    }

}
void PrintM(){
 System.out.println("  Elements of A:");
      for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){           
        System.out.print(a[i][j] +" ");
      }
       System.out.println();
    }
System.out.println("  Elements of B:");
      for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){           
        System.out.print(b[i][j] +" ");
      }
       System.out.println();
    }
System.out.println("  Elements of C:");
      for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){           
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