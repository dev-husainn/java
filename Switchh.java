/* 
-> The switch expression is evaluated once.
-> The value of the expression is compared with the values of each case.
-> If there is a match, the associated block of code is executed.
-> The break and default keywords are optional. */

/* ------------------------------------ . ----------------------------------- */

/*public class Switchh{
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
} */
//Note that if the default statement is used as the last statement  in a switch block, it does not need a break

/* ------------------------------------ . ----------------------------------- */

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
