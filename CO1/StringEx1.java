//prgm -1 string manipulations
class StringEx1{
    public static void main (String args[]){
        String s1 ="hello ";
        String s2 ="world";
        String s3 =new String("SNGCE");
        
        System.out.println(s1+" "+s2); 
        System.out.println("Length of s1 :"+s1.length());
        System.out.println(s1.replace('l','e')); 
        System.out.println(s1.concat(s2)); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.toUpperCase()); 
        System.out.println(s1.substring(0,1)); 

    }
}