# Class 5 - Code for Given Notes
*************
##  made by Subham
******************


## And Or Not Example :-


### Example 1
```java
public class class1{
    public static  void main(String[]args){
        //or operator 
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        System.out.println(c); //true



        //and operator
        boolean d = true;
        boolean e = false;
        boolean f = d && e;
        System.out.println(f); //false


        //not operator
        boolean g = true;
        boolean h = !g;
        System.out.println(h); //false


        //xor operator
        boolean i = true;
        boolean j = false;
        boolean k = i ^ j;
        System.out.println(k); //true


    }
}
```



### Example 2
```java
public class class1{
    public static  void main(String[]args){
        //And Operator Example 1
        int a = 1;
        int b = 2;
        int c = a & b;
        System.out.println(c); // 0
        //because 1 in binary is 0001 and 2 in binary is 0010
        //zero represents false and one represents true
        //so 1&2 is 0 because 1 is false and 2 is true so it is zero
        //so output is 0



        //or Operator Example 1
        int a1 = 1;
        int b1 = 2;
        int c1 = a1 | b1;
        System.out.println(c1); // 3
        //because 1 in binary is 0001 and 2 in binary is 0010
        //zero represents false and one represents true
        //so 1|2 is 3 because 1 is true and 2 is true so it is three


        //not Operator Example 1
        int a2 = 1;
        int b2 = 2;
        int c2 = ~a2;
        System.out.println(c2); // -2
        //because 1 in binary is 0001 and 2 in binary is 0010
        //zero represents false and one represents true
        //so ~1 is -2 because 1 is true and 2 is false so it is -2
        
        
        //xor Operator Example 1
        int a3 = 1;
        int b3 = 2;
        int c3 = a3 ^ b3;
        System.out.println(c3); // 3
        //because 1 in binary is 0001 and 2 in binary is 0010
        //zero represents false and one represents true
        //so 1^2 is 3 because 1 is true and 2 is true so it is three
        
    }
}
```


## All Escape Sequences Example :-

```java
public class class1{
    public static  void main(String[]args){
       //All escape sequence examples
         //\n new line
      System.out.println("Hello World\n");
        //\a alert
        //\b backspace
        System.out.println("Hello World\b");
        //\f form feed
        System.out.println("Hello World\f");
        //\r carriage return
        System.out.println("Hello World\r");
        //\t tab
        System.out.println("Hello World\t");
        //\v vertical tab
        //\0 null
        System.out.println("Hello World\0");
        //\u unicode
        System.out.println("Hello World\u0041");
        //\x hexadecimal



        /* */ //multi line comment
        
        /*
         A paragraph is a series of sentences that are organized and coherent, 
         and are all related to a single topic. Almost every piece of writing you 
         do that is longer than a few sentences should be organized into paragraphs.
         */
        
        //single line comment
       //A paragraph is a series of sentences that are organized and coherent, 
       // and are all related to a single topic. Almost every piece of writing
        // you do that is longer than a few sentences should be organized into paragraphs.
        
        /**  */ //Documentation comment
        /** A paragraph is a series of sentences that are organized and coherent,
        and are all related to a single topic. Almost every piece of writing you
        do that is longer than a few sentences should be organized into paragraphs.*/



    }
}
```



## if statement example 
```java
public class class1{
    public static  void main(String[]args){
        //if else statement example
        int a = 10;
        int b = 20;
        if(a>b){
            System.out.println("a is greater than b");
        }
    }
}
```

## if else statement example 
```java
public class class1{
    public static  void main(String[]args){
      //if statement example 
        int a = 10;
        int b = 20;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
```

## if else if statement example 
```java
public class class1{
    public static  void main(String[]args){
        //if else if statement example
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a>c){
            System.out.println("a is greater than c");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
```

## switch statement example 
```java
public class class1{
    public static  void main(String[]args){
        //switch statement example
        int a = 10;
        switch(a){
            case 10:
                System.out.println("a is 10");
                break;
            case 20:
                System.out.println("a is 20");
                break;
            case 30:
                System.out.println("a is 30");
                break;
            default:
                System.out.println("a is not 10,20,30");
        }
    }
}
```

## var and val example 
```java
public class class1{
    public static  void main(String[]args){
        //var is used to declare variable in java 
        var a = 10;
        System.out.println(a);
        
    }
}
```

## hasNextLine example 
```java
import java.util.*;

public class class1 {
    public static void main(String[] argv)
            throws Exception
    {

        String s = "Subham 2 Xam";

        // new scanner with the
        // specified String Object
        Scanner scanner = new Scanner(s);

        // use US locale to interpret Lines in a string
        scanner.useLocale(Locale.US);

        // iterate till end
        while (scanner.hasNextLine()) {

            // print what is scanned
            System.out.println(scanner.nextLine());
        }

        // close the scanner
        scanner.close();
    }
}
```