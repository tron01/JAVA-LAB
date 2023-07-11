class myExp{
    public static void main(String args[]){
      
      try{
        int a=10,b=0,c;
        c = a/b;
        System.out.print("the number c:"+c);
      }catch(Exception e){

System.out.print(e);
      }


    }
}


/**
 
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at myExp.main(myExp.java:4)

 */

/**
 java.lang.ArithmeticException: / by zero 
 */