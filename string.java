 /*public class string{
    public static void main(String[] args){

        String name = "ABCDEF";

        System.out.println(name.length());   //length me indexing ka use nhi hota h.

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.replace('C', 'X'));

        System.out.println(name.replace("EF", "haha"));

        System.out.println(name.indexOf('D')); //yha index of A is 0, a B is 1, C is 2 , so on and , F is 5.

        System.out.println(name.substring(1, 5));

        System.out.println(name.toString());

        System.out.println(name.charAt(4));

        System.out.println(name.equals("ABCDEF"));

        System.out.println(name.equals("ABCDEFGHIJ"));

        System.out.println(name.equalsIgnoreCase("abcdef"));


    }
}            */

/* -------------------------------------------------------------------------------------------------------- */

// public class string{
//     public static void main(String[] args){
//         String myName =  "Jonathon";
//         String myNameTwo = " from Js";
//         System.out.println(myName.concat(myNameTwo));

//     }
// }
//  concat() adds the two  variable togetther.

/* ----------------------------------- -- ----------------------------------- */
// public class string{
//     public static void main(String[] args){
//         System.out.println("The trim method removes all the whitespaces");
//         String names = "                       HARRY                 ";
//         System.out.println(names.trim());


//     }

// }

/* ------------------------------------ - ----------------------------------- */

// public class string{
//     public static void main(String[] args){
//         String letter = "Dear <|name|>, thanks a lot!";
//         letter = letter.replace("<|name|>", "Hassan");
//         System.out.println(letter);

//     }
// }

public class string{
    public static void main(String[] args){
String myString = "This string contains         double and triple spaces";
System.out.println(myString.indexOf("  "));//yha output 20 aayega bcoz double and triple   spaces 20 pe occur kr rhi h.
System.out.println(myString.indexOf("   "));

    }
}