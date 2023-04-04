import java.util.Scanner;
class Array2dim{
  
  int [][]a;

  void ReadArray(){
    a=new int[3][3];
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the elements:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        a[i][j]=s.nextInt();

    }
    }

  }
  void PrintArray(){
      System.out.println(" Elements are:");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){           
        System.out.print(a[i][j] +" ");
      }
       System.out.println();
    }
    }
  void FindArr(){
    int n;
    int c=0;
    System.out.println(" Enter the  Elements to search:");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        if(a[i][j]==n){
             c=c+1;
        }         
    }}

    if(c>0){
        System.out.println(" Element found"); 
            
        }else{
            System.out.println(" Element Not found"); 
        }
    
  }
 
    public static void main(String args[]){
Array2dim obj =new Array2dim();
obj.ReadArray();
obj.PrintArray();
obj.FindArr();
    }
}