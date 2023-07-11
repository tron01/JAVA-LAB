class MyExp1 extends Exception{
MyExp1(String s){
    super(s);
}
}
public class MyDemoExp {

    public static void main(String args[])
    {
        try {
           
            throw new MyExp1("haiiiii MyException");
        }
        catch (MyExp1 ex) {
            System.out.println("MyException Caught");
 
        
            System.out.println(ex.getMessage());
        }
        finally{
             System.out.println("I will run always");
        }
        
    }
}