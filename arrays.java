/*public class arrays{
    public static void main(String[] args){
        int [] marks = {90, 45, 67, 89, 88};
        float [] markss = {25.6f, 55.67f, 99.09f, 12,1f};
        String[] students = {"Husain", "Himanshu", "Kuldeep","Jayant"};
        System.out.println(marks[3]);
        System.out.println(markss[2]);
        System.out.println(students[1]);

        // length property give the length of array
        System.out.println(marks.length);
        System.out.println(markss.length);
        System.out.println(students.length);  
    }
}

/* ------------------------------------ - ----------------------------------- */
//accesing array by loops

public class arrays{
    public static void main(String[] args){
        int [] marks = {10,20,30,40,50,60};
        System.out.println(" The total length of array is: " +marks.length);

    // displaying arrays by Naive Way
    System.out.println("Displaying array by Naive Way");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
    System.out.println(marks[5]);

    //displaying array for loops
    System.out.println("Displaying array by for loop");
    for(int i = 0 ; i < marks.length ; i++){
        System.out.println(marks[i]);
    }

    // reverse order for displaying element of array
    System.out.println("Displaying elements in reverse order");
    for(int i = marks.length-1 ; i>=0 ; i--){
    System.out.println(marks[i]);
    }
    //using "for-each" loop (important)
    System.out.println("Using for-each loop for displaying element and this is the easiest way: ");
    for (int elements : marks) {// yha elements ke jgh pe kuch v likh skte h ..
    System.out.println(elements);
    
    }

 }
}

/* ----------------------------- -for each loop ----------------------------- */
/*
 SYNTAX->

        for (type variable : arrayname) {
         /block of codes
         /block of codes
        }


    for(type variable ke jgh pe kuch v likh skte h : aur yha pe array ka name rhegaa){
        ------
        ------
        ------
    }

 */