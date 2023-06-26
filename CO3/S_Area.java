import java.util.*;

class S_Area {


void  area(int l,int b){
System.out.println("Area of Rectangle"+l*b);
}

void  area(int l){
System.out.println("Area of square"+l*l);
}

public static void main(String args[]){
    S_Area obj =new S_Area();
    obj.area(12,20);
    obj.area(5);
}


}