import java.util.Scanner;
class Array1dim{
  
  int []a;

  void ReadArray(){
    a=new int[5];
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the elements:");
    for(int i=0;i<5;i++){
        a[i]=s.nextInt();

    }

  }
  void PrintArray(){
      System.out.println(" Elements are:");
      for(int i=0;i<5;i++){
        System.out.println(a[i]);
      }
  }
  void FindArr(){
    int n;
    int c=0;
    System.out.println(" Enter the  Elements to search:");
    Scanner s =new Scanner(System.in);
    n=s.nextInt();
    for(int i=0;i<5;i++){
        if(a[i]==n){
             c=c+1;
             
    }}
    if(c>0){
        System.out.println(" Element found"); 
            
        }else{
            System.out.println(" Element Not found"); 
        }
    
  }
 
    public static void main(String args[]){
Array1dim obj =new Array1dim();
obj.ReadArray();
obj.PrintArray();
obj.FindArr();
    }
}