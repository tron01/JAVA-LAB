import java.util.Scanner;

class UsernameException extends Exception {
 
 public UsernameException(String str) {
    System.out.println(str);
 }
}


public class UserExp {

 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  String username, password;
  String uname="gkv";
  String pwd="1234";

  
  System.out.print("Enter username :: ");
  username = s.nextLine();
  
  System.out.print("Enter password :: ");
  password = s.nextLine();

  
  try {
   if((username.equals(uname)) && (password.equals(pwd)))
    System.out.println("LOGIN SUCCESS");
   
   else
    throw new UsernameException("User name  or password not  matching !!!");
   
  }
  catch (UsernameException u) {
    System.out.println("EXCEPTION OCCURED ");
  }
 }
}

/*
Enter username :: gkv
Enter password :: 1234
LOGIN SUCCESS
*/