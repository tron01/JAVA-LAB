
class Complex{
    int real,img;

    Complex(int r, int i){
        real=r;
        img=i;
    }
    void display(){
        System.out.println();
    }
  public static Complex add(Complex n, Complex n2){
    Complex result =new Complex(0,0);
    result.real=n1.real+n2.real;
    result.img=n1.img +n2.img;
    return result;
  }

public static void main(String[] args){
    Complex c1 =new Complex(4,6);
    Complex c2 =new Complex(4,4);
    System.out.println("First complex number.");
    c1.display();
    System.out.println("Second Complex number.");
    c2.display();
    Complex result=add(c1,c2);
    System.out.print("Addition of two complex number")
    result.display();

}
}
