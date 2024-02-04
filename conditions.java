/* ----------------------------------- if ----------------------------------- */

/*Use 'if' to specify a block of code to be executed, if a specified condition is true*/

 /*public class conditions {
     public static void main(String[] args){
         int num1 = 10;
         if(num1 > 9){
             System.out.println("Yes the num is greater than 9");

         }

     }
    
 }
/* ------------------------------------ - ----------------------------------- */
 /*public class conditions {
     public static void main(String[] args){
         if(20 > 19){
             System.out.println("Yes the num is greater than 19");

         }

     }
    
 }
/* ------------------------------------ - ----------------------------------- */
 /*public class conditions{
     public static void main(String[] args){
         int myNum1 = 500;
         int myNum2 = 700;
         if(myNum1 < myNum2){
             System.out.println(" Yeah myNum1 is less than myNum2");

         }
     }
 }

/* --------------------------------- if else -------------------------------- */
//Use else to specify a block of code to be executed, if the same condition is false.

 /*public class conditions{
     public static void main(String[] args){
         int a = 999;
         int b = 888;
         if(a<b){
             System.out.println("True");
             }
            
             else{
                 System.out.println("False");
         }
     }
 }

/* ------------------------------------ - ----------------------------------- */

/*public class conditions{
    public static void main(String[] args){
        int time = 20;
        if(time > 15){
            System.out.println("Good Morning");
            }

            else{
                System.out.println("Good Evening");
        }
    }
} 

/* --------------------------------- else if -------------------------------- */
/*Use else if to specify a new condition to test, if the first condition is false*/

// public class conditions{
//     public static void main(String[] args){
//         int age = 23;
//         if(age > 25){
//             System.out.println("you are older");
//         }
//         else if (age <= 25){
//             System.out.println("you are younger");
//         }
//         else{
//             System.out.println("invalid age");
//         }
//     }
// }
/* --------------------------------user innput else if ladder ---- - ----------------------------------- */

  /*   import java.util.Scanner;

public class conditions{
    public static void main(String[] args){
        int age;
        System.out.println("Enter Age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
       
        if (age > 50){
            System.out.println("You are experienced");

        }
       else if(age > 40){
        System.out.println("You are semi experienced");

       }
       else if (age > 30 ){
        System.out.println("You are semi-semi experienced");

       }
       else{
        System.out.println("You are not experienced");
       }

    }
}    */

/* ------------------------------------ switch case() ----------------------------------- */

/* 
-> The switch expression is evaluated once.
-> The value of the expression is compared with the values of each case.
-> If there is a match, the associated block of code is executed.
-> The break and default keywords are optional. 
-> Switch case ka use tb hota h jb hme alag alag alternative     choices bnani ho ek given variavle k liye

*/
/* ------------------------------------ . ----------------------------------- */
/* 
public class Switchh{
    public static void main(String[]args){
        int days = 4;
        switch(days){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5 :
            System.out.println("Friday");
            break;
            default: 
            System.out.println("GOOD DAY");
            
        }
    }
} 
//Note that if the default statement is used as the last statement  in a switch block, it does not need a break

/* ------------------------------------ . ----------------------------------- */
/* 
public class Switchh {
    public static void main(String[] args) {
      String days = "Wednesday";
      switch (days) {
        case "Monday":
          System.out.println("HELLO");
          break;
        case "Tuesday":
          System.out.println("HOW ARE YOU");
          break;
        case "Wednesday":
          System.out.println("SUCH A GOOD DAY IT IS");
          break;
        case "Thursday":
          System.out.println("BORING DAY");
          break;
        case "Friday":
          System.out.println("HAPPY FRIDAY");
          break;
        case "Saturday":
          System.out.println("OFF DAY");
          break;
        case "Sunday":
          System.out.println("Sunday");
          break;
      }
    }
  }

/* ------------------------------------ . ----------------------------------- */

 /* import java.util.Scanner;

public class Switchh{
  public static void main(String[] args){
    int age;
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    switch(age){
      case 18:
      System.out.println("You are an adult");
      break;
      case 25:
      System.out.println("You are getting a job");
      break;
      case 60:
      System.out.println("You are retired");
      break;
     default:
      System.out.println("Now enjoy your life");
      break;

    }
   -> break  keyword === break keyword completely exits the loop.
   -> continue keyword === continue statement skips the particular iteration of the loop.
  
  }
}

/* ------------------------------------ - ----------------------------------- */


import java.util.Scanner;

public class conditions{
  public static void main(String[] args){
   byte a , b , c;
    System.out.println("Enter your Physics marks");
    Scanner sc = new Scanner(System.in);
    a = sc.nextByte();
  
    System.out.println("Enter your Chemistry marks");
    b = sc.nextByte();

    System.out.println("Enter your Maths marks");
    c = sc.nextByte();
    float average = (a+b+c)/3 ;
    System.out.println("Your percentage is " + average);
    if(average >= 40 && a>= 33 && b>=33 && c>= 33){
      System.out.println("Congratulation you are pass");
    }
    else{
      System.out.println("Sorry! You are failed.");
    }
  }
}



