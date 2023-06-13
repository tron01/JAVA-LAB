//prgm -5  to check  a matrix is symmetric or not.
import java.util.Scanner;
class SMatrix{
    int a[][];
    int n; 
    int b[][];
    int x,y,count=0;
    void ReadArray(){
     
  
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the row of the matrix:");
    x=s.nextInt();
    System.out.println("Enter the column of the matrix:");
    y=s.nextInt();
    
    a=new int[x][y];
    b=new int[x][y];

    System.out.println("Enter the elements  matrix:");
    for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
        a[i][j]=s.nextInt();

    }
    }
 

  }

void PrintArray(){
      
      System.out.println("  Elements of A:");
      for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){           
        System.out.print(a[i][j] +" ");
      }
       System.out.println();
    }
 }

void SymArray(){
    
  if(x!=y){
   System.out.println("Row and column size should same  matrix and its transpose for checking  symmertric or not!!");
}else{
        
        for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
        b[i][j]=a[j][i];
        }
       }
        System.out.println("  Matrix after Transpose  :");
        for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){           
        System.out.print(b[i][j] +" ");
                      }
       System.out.println();
      }

        for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
          if(a[i][j]!=b[i][j]) {
             count=count+1;
             break;
         }
        }
      }
    if(count==0){
      System.out.println("Matrix is Symmetric");
    }else{
      System.out.println("Matrix is not Symmetric");
    }
    
  }
   

}

    public static void main(String args[]){
SMatrix obj =new SMatrix();
obj.ReadArray();
obj.PrintArray();
obj.SymArray();
    }
}