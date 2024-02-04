/* --------------------------------- nextInt() -------------------------------- */
 /*import java.util.Scanner;

 public class input {
     public static void main(String[] args){
         System.out.println("Taking input from the user");
         Scanner husain = new Scanner(System.in);
         System.out.println("Enter the firat number");
         int a = husain.nextInt();
         System.out.println("Enter the second number");
         int b = husain.nextInt();
         int sum = a + b;
         System.out.println("The total sum of number is: " + sum);

     }
    
 }

/* ----------------------------------nextInt()--------------------------------------- */

  /* import java.util.Scanner;

 public class input{
     public static void main(String[] args){
        System.out.println("Enter the num1");
        Scanner hero = new Scanner(System.in);
        int x = hero.nextInt();
        System.out.println("enter the num2");
        int y = hero.nextInt();
        int z = x+y;
        System.out.println("The added numbers are: " +z); 


     }
}
        */

/* ------------------------------- nextFloat() --------------------------------- */

// import java.util.Scanner;

//  public class input{
//      public static void main(String[] args){
//         System.out.println("Enter the num1");
//         Scanner hero = new Scanner(System.in);
//         float x = hero.nextFloat();
//         System.out.println("enter the num2");
//         float y = hero.nextFloat();
//         float z = x+y;
//         System.out.println("The added numbers are: " +z); 


//      }
// }

/* ------------------------------------ - ----------------------------------- */

/*
 sc.next() // ye sirf sentence ke first word ko print krega
 sc.nextLine() // ye pure sentence ko print krega
*/

// import java.util.Scanner;

// public class input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // String str = sc.next();  agr ek v whitespace rhega sentence me to print nhi krega .next() method
//         String str = sc.nextLine(); //pure sentence ko print krega whitespace ke sath
//         System.out.println(str);
//     }
// }

/* ---------------------------------- example ---------------------------------- */

 import java.util.Scanner;

// public class input{
//     public static void main(String[] args){
//         System.out.println("enter the first numbers: ");
//         Scanner x = new Scanner(System.in);
//         int a = x.nextInt();
//         System.out.println("enter the second numbers: ");
//         int b = x.nextInt();
//         int sum = a + b;
//         System.out.println("The sum is : " +sum);

//     }
// }

/* ------------------------------------ - ----------------------------------- */



//  import java.util.Scanner;
 public class input {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("marks in mathematics out of 100 is");
         double a = sc.nextDouble();
         System.out.println("marks in physics out of 100 is");
         double b = sc.nextDouble();
         System.out.println("marks in chemistry out of 80 is");
         double c = sc.nextDouble();
         System.out.println("your percentage is ");

                 double percentage = (a + b + c)/280 * 100;
         System.out.println(percentage);
     }
 }