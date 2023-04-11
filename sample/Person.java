class Person{

    String name;
    int age;
    String sex;
    String height;
    String Weight;

    void eat(String s1){
System.out.println(s1);
    }
    void fight(String s1){
System.out.println(s1);
    }
    
public static void main(String args[]){

Person obj =new Person();
obj.eat("KFC");
obj.fight("WWE");

    }
}