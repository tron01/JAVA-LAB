
import java.util.Scanner; 
class  SArray {
   
    int arr[]= new int[5];;  
   
    void ReadArray(){
    System.out.print("Enter the Elements:");

    Scanner s =new Scanner(System.in);
    for(int i=0;i<5;i++){
        arr[i] = s.nextInt();
    }
    }
    void PrintArray(){
        System.out.println(" Elements Are:");
     for(int i=0;i<5;i++){
       System.out.println(arr[i]);
    }
    }

    public static void main (String args[]){
    SArray obj =new SArray();
    obj.ReadArray();
    obj.PrintArray();
    }
}