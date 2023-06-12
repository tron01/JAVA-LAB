//prgm -5  to check  a matrix is symmetric or not.
import java.util.Scanner;
class SMatrix{
    int a[][];
    int n; 
    void ReadArray(){
     
    System.out.println("Enter the size of the matrix:");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    a=new int[n][n];
    System.out.println("Enter the elements  matrix:");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        a[i][j]=s.nextInt();

    }
    }
  }

    void PrintArray(){
      
      System.out.println("  Elements of A:");
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){           
        System.out.print(a[i][j] +" ");
      }
       System.out.println();
    }
    }
      void SymArray(){
      
      System.out.println("  Elements of A in :");
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){           
        System.out.print(a[j][i] +" ");
      }
       System.out.println();
    }
    }
    public static void main(String args[]){
SMatrix obj =new SMatrix();
obj.ReadArray();
obj.PrintArray();
obj.SymArray();
    }
}