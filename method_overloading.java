/*Method Overloading -> With method overloading, multiple methods can have the same name
 with different parameters: */

/*public class method_overloading{
   static int plusmethod(int x, int y){
    return x + y;
   }
   static double plusDoubleMethod(double x , double y ){
    return x + y;
   }
    public static void main(String[]args) {
        int sum = plusmethod(10, 20);
        double sumTwo = plusDoubleMethod(4.3, 6.26);
        System.out.println(sum);
        System.out.println(sumTwo);
    }
}

/* ------------------------------------ - ----------------------------------- */
public class method_overloading{
    static int plusmethod(int x, int y){
     return x + y;
    }
    static double plusDoubleMethod(double x , double y ){
     return x + y;
    }
     public static void main(String[]args) {
         int sum = plusmethod(10, 20);
         double sumTwo = plusDoubleMethod(4.3, 6.26);
         System.out.println(sum);
         System.out.println(sumTwo);

     }
    }
