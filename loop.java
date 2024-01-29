/* ------------------------------- while-loop ------------------------------- */

/* public class loop{
    public static void main(String[] args){
        int i = 0;
        while(i < 5){
        System.out.println(i);
        i++;
        }
    }
} */


/* ------------------------------------do-while loop ----------------------------------- */
/*The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.*/

/*public class loop {
    public static void main(String[] args) {
      int i = 0;
      do {
        System.out.println(i);
        i++;
      }
      while (i < 5);  
    }
  }
  
/* ------------------------------------ for loop ----------------------------------- */

/*Syntax

for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

The example below will print the numbers 0 to 4: */
/*public class loop{
    public static void main(String[] args){
        
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

    }
}

/*Example explained
Statement 1 sets a variable before the loop starts (int i = 0).

Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

Statement 3 increases a value (i++) each time the code block in the loop has been executed*/

/* ------------------------------------ . ----------------------------------- */
public class loop{
  public static void main(String[] args){
    for(int i = 0; i < 20; i=i+2){
      System.out.println(i);
    }
  }
}

/* ------------------------------------ for each ----------------------------------- */
