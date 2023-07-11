import java.util.Scanner;


class UserExp  {

public static void main(){
   
   try {
        String username="Abhi";
        String password ="123";
        String uname,pass;
        Scanner s =new Scanner();

        System.out.println("Enter the user name:");
        uname=s.next();

        System.out.println("Enter the user password:");
        pass =s.next();
            if(username !=uname){
                throw new UnameError("User name is not correct");
            }
            if(password !=pass){
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

UnameError(String s){
super(s);
}

}

class PassError extends Exception {

PassError(String s){
super(s);
}

}
