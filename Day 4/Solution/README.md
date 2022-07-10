# Solved by Anshika

### Program 1

```java
import java.util.*;
  public class lowercase {
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Input a String");
   String line = scan.nextLine();
   line = line.toLowerCase();
   System.out.println(line);
  }
}
```
******************************

### Program 2

```java
public class underscore{
  public static void main(String[] args) {
  String name = "Anshika is a good girl";
  String replaceString = name.replace("a", "d");
  System.out.println("String after replacing spaces with given character");
  System.out.println(replaceString);
  }
}

```

******************************

### Program 3

```java
import java.util.Scanner;
public class CodeXam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String sentences = sc.nextLine();
        String sentence = "Dear <|name|>, Thanks a lot!";
        sentence =  sentence.replace("<|name|>", sentences);
        System.out.println(sentence);
    }
}
```
******************************
### Program 4

```java
import java.util.*;
public class class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Sentence ");
        String str1 = sc.nextLine();
        System.out.println(str1.indexOf("  "));
        System.out.println(str1.indexOf("   "));
    }
}

```

******************************

### Program 5

```java
public class whitespace {
 public static void main(String[] args){
  String name1="          ";
    if( name1.isEmpty() && !name1.trim().isEmpty()){
         System.out.println("String is not empty or not whitespace ");}
    else{
          System.out.println("String is whitespace");
       }
     }
}

public class abs1 {
    public static void main(String[] args){
     String name1="          ";
       if(name1.trim().isEmpty()){
            System.out.println("String is whitespace ");}
       else{
             System.out.println("String is not empty or not whitespace");
          }
   }
}
```
******************************
### Program 6

```java
import java.util.*;
 
public class CodeXam {
    public static void main(String args[]) {
        System.out.println("Enter Your Gmail");
        Scanner sc = new Scanner (System.in);
        String email = sc.next();
        String userName = "";
 
        /* //You can use this too
 
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        */
 
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@')
                break;
               userName = userName+email.charAt(i);
        }
 
        System.out.println("Your username is: " + userName);
    }
}
```

******************************
### Program 7

```java
public class trim {
   public static void main (String[] args){
     String s1 = " Hi Anshika";
     System.out.println(s1.trim());

  }

    
}

```

******************************

### Program 8

```java

public class length {
   public static void main (String[] args){
     String name = "Anshika";
     System.out.println("The size of the string is "+ name.length());
    }
     
 }
```
******************************


### Program 9


```java
public class substring {
public static void main(String [] args){
    String name= "Anshika Das";
    System.out.println(name.substring(0,6));
    }
    
}
```
******************************

### Program 10

```java

public class replace {
  public static void main(String[] args){
    String name = "janshika";
    String new_name = name.replace('j', 'n');
    System.out.println(new_name);
  } 
}

```
******************************

### Program 11


```java

public class strt {
public static void main(String[]args){
    String name = "Anshika";
    System.out.println(name.startsWith("An"));
   }
    
}

```
******************************

### Program 12


```java
public class ka {
public static void main(String[] args){
   String name = "Anshika";
   System.out.println(name.endsWith("ka"));
}
    
}

```
******************************

### Program 13

```java

import java.util.*;
public class if_false{
   public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   String name = "Anshika";
    System.out.println(name.charAt(2));

}
}

```


******************************

### Program 14


```java
public class specified {
public static void main(String[] args){

    String name = "Anshika";
    System.out.println (name.indexOf("s"));
    
}
}
```

******************************

### Program 15

```java

public class last {
public static void main(String[] args){
    String name = "Anshika";
    System.out.println(name.lastIndexOf("n"));
}
    
}
```
******************************


### Program 16

```java

public class equal {
    public static void main(String[] args){
    String name = "Anshika";
    System.out.println(name.equals("Anshika"));
    }
    
}
```

******************************

### Program 17


```java

public class ignore {
    public static void main(String[] args){
    String name = "Anshika";
    System.out.println(name.equalsIgnoreCase("Anshika"));
    }
    
}
```
******************************

### Program 18

```java

public class sub {

public static void main(String[] args){
     String name = "Anshika";
     System.out.println(name.substring(5) );
  }
    
}
```