class Matrix{
    int x[][] ;
    Matrix (){
        x=new int[][]{{1,2,3},{5,6,7}}; 
    }
     void PrintArray(){
        System.out.println(" Elements Are:");
         for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
                  System.out.println(x[i][j]);
                     }
                    }
     }
       public static void main (String args[]){
    Matrix obj =new Matrix();
    obj.PrintArray();
    }
}