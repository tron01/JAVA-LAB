// prgm- 6
class Product {
    int price;
    String pname;
    int pcode;

    Product(int id,String n, int pr){
    price =pr;
    pname=n;
    pcode =id;
    }
    void display(){
    System.out.println("id:"+pcode);
    System.out.println("name:"+pname);
    System.out.println("price:"+price);
    }


  static void lowest(int p1,int p2,int p3){
   if(p1 > p2 && p1 >p3){
     System.out.println("p1 greater");
   } else if(p2>p3){

 System.out.println("p2 greater");
   }else{
 System.out.println("p3 greater");
   }
   }

   public static  void main(String args[]) {
    Product p[]=new Product[3];
     p[0]=new Product(1,"p1",2000);
     p[1]=new Product(2,"p2",1000);
      p[2]=new Product(3,"p3",400);
    p[0].display();
    System.out.println("---------------------");
    p[1].display();
     System.out.println("---------------------");
    p[2].display();
    lowest(p[0].price,p[1].price,p[2].price);

   }  
}