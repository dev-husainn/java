/* ------------------------------- Data Types ------------------------------- */

 public class datatypes {
    public static void main(String[] args) {
       int myNum = 5;               // integer (whole number)
      float myFloatNum = 5.99f;    // floating point number
      char myLetter = 'D';         // character
      boolean myBool = true;       // boolean
     String myText = "Hello";     // String    
     System.out.println(myNum);
     System.out.println(myFloatNum);
     System.out.println(myLetter);
     System.out.println(myBool);
     System.out.println(myText);
   }
}
  
/* ------------------------------------ x ----------------------------------- */
Integer Types-------

Byte->
The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
public class datatypes {
  public static void main(String[] args) {
    byte myNum = 100;
    System.out.println(myNum);  
  }
}

Short->
The short data type can store whole numbers from -32768 to 32767:


Int->>>
The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
public class datatypes {
  public static void main(String[] args) {
    int myNum = 100000;
    System.out.println(myNum);  
  }
}

Long->
The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
public class datatypes {
  public static void main(String[] args) {
    long myNum = 15000000000L;
    System.out.println(myNum);  
  }
}


Floating Point Types->
You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.

The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
public class datatypes {
  public static void main(String[] args) {
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);  
  }
}


Boolean Types->>
Very often in programming, you will need a data type that can only have one of two values, like:

YES / NO
ON / OFF
TRUE / FALSE
For this, Java has a boolean data type, which can only take the values true or false:
public class datatypes {
  public static void main(String[] args) {
    boolean isJavaFun = true;
    boolean isFishTasty = false;    
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
  }
}

Characters->>
The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':

public class datatypes {
  public static void main(String[] args) {
    char myGrade = 'B';
    System.out.println(myGrade);
  }
}


Strings->>>
The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
public class datatypes{
  public static void main(String[] args) {
    String greeting = "Hello World";
    System.out.println(greeting);
  }
}


*/

/* ------------------------------------ x ----------------------------------- */
public class datatypes {
    public static void main(String[] args) {
      char myVar1 = 65, myVar2 = 66, myVar3 = 67;
      System.out.println(myVar1);
      System.out.println(myVar2);
      System.out.println(myVar3);
    }
  }
  

  /* ------------------------- Non Primitve Data Type ------------------------- */
  *Non-Primitive Data Types-->
Non-primitive data types are called reference types because they refer to objects.Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.*/
