/*public class method {
    static void myMethod(){
        System.out.println("hello my name is husain ahmad");
    }
    public static void main(String[] args){
        myMethod();
    }
    
    
} */


/* ------------------------------------ - ----------------------------------- */
// public class method{
//     static void myAnotherMethod(){
//         System.out.println("Learn the methods");
//     }
//     public static void main(String[] args){
//         myAnotherMethod();
//     }
// }


/* ------------------------------------ single parameter ----------------------------------- */
/* public class method{
    static void myMethods(String name){
        System.out.println(name + " is a good boy");
    }                                              
    public static void main(String[] args){
        myMethods("Husain");
        myMethods("Irshad");
        myMethods("Saad");
    }
}

/* ------------------------------------ multiple parameters ----------------------------------- */
/*public class method{
    static void myMethod(String name , int age){
        System.out.println(name + " is " +age );
    }
    public static void main(String[]  args){
        myMethod("Husain", 22);
        myMethod("Husain", 22);
        myMethod("Husain", 22);
    }
} 

/* ------------------------------------ Return value ----------------------------------- */
/*Return Values
The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:*/

   
// public class method{
//     static int myMethod(int x){
//         return 5+x;
//     }
//     public static void main(String[] args) {
//         System.out.println(myMethod(5));
//     }                                 // output wil be 10
    
// }
/* ------------------------------------ - ----------------------------------- */
// public class method{
//     static int myMethod(int x, int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println(myMethod(5, 10));
//     }                                 // output wil be 15
    
// }
/* ----------------------------------- or ----------------------------------- */
// public class method{
//     static int myMethod(int x, int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         int sum = myMethod(5, 10);
//         System.out.println(sum);
//     }                                 // output wil be 15
    
// }
/* ------------------------------------method with if else----------------------------------- */

 public class method{
     static void myMethods(int age){
         if(age < 18 ){
             System.out.println("you are eligible");
         }
         else{
             System.out.println("you are not eligible");
         }
       
         }
         public static void main(String[] args){
             myMethods(20);

     }

 }
