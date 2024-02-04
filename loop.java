/* ------------------------------- while-loop ------------------------------- */
 /*public class loop{
    public static void main(String[] args){
        int i = 0;
        while(i < 5){
        System.out.println(i);
        i++;
        }
    }
} */
//while loop tbtk chlega tbtk condition false na ho jaye...

//while -> checks the condition and execute the code


/* ------------------------------------do-while loop ----------------------------------- */
// do-while-> Executes the code and then checks the condition.

//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

// public class loop {
//     public static void main(String[] args) {
//       int i = 0;
//       do {
//         System.out.println(i);
//         i++;
//       }
//       while (i < 5);  
//     }
//   }
  
/* ------------------------------------ = ----------------------------------- */
 /*public class loop {
       public static void main(String[] args) {
         int i = 10;
         do {
           System.out.println(i);
           i++;
         }
         while (i < 5);  
       }
     }
     //here output will be 10 because do  while loop execute atleast one time even if the given condition is false..
    
    
/* ------------------------------------ - ----------------------------------- */
public class loop{
  public static void main(String[] args){
    int n = 10;
   for(int i = 0; i<n; i++){//so in output we will get the first 10 odd values.
    System.out.println(2*i+1);
// 2i + 1 -> for getting odd values
// 2i  -> for getting even values
   }
  }
}
















/* ------------------------------------ for loop ----------------------------------- */

// Syntax

// for (statement 1; statement 2; statement 3) {
   // code block to be executed
// }
/* 
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


/*public class loop{
  public static void main(String[] args){
    for(int i = 0; i < 20; i=i+2){
      System.out.println(i);
    }
  }
}  */

/* ------------------------------------ for each ----------------------------------- */
