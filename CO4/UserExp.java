import java.util.Scanner;


class UserExp  {

public static void main(String[]  args){
        String  username="123";
        String  password ="123";
        String  uname,pass;
   try {
        
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the user name:");
        uname=s.next();

        System.out.println("Enter the user password:");
        pass =s.next();
            if(username != uname){
                throw new UnameError("User name is not correct");
            }
            if(password != pass){
                throw new PassError("password is not correct");
            }
           
        } catch (UnameError ex ) {
           System.out.println(ex.getMessage());
            
        }
        catch(PassError e){
             System.out.println(e.getMessage());
        }
        

   


}
}


class UnameError extends Exception {

UnameError(String s1){
super(s1);
}

}

class PassError extends Exception {

PassError(String s2){
super(s2);
}

}
