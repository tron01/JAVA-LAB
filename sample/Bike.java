class Bike{
    String name;
    int year;

    Bike(String n,int y){
    name =n;
    year= y; 
    }
    void show(){
        System.out.println("Name :"+name);
        System.out.println("Year:"+year);
    }
public static void main(String args[]){


Bike b1 =new Bike("TVS",1990);
b1.name ="AAA";
b1.year =2022;

b1.show();

Bike b2=new Bike("Bmw",2001);
b2.show();

}
}