import java.util.Scanner;
public class class1 {
    public static void main(String[] args) {
        /*Note page - 1*/

           // Pascal Conversion -  Classes name always starts with a capital letter example: Main, MyScanner , HelloWorld
         // Camel Case - First letter of each word is capital example: main, myScanner, helloWorld
        // Snake Case - Each word is separated by underscore example: main_myScanner_helloWorld

        //Variable naming - Use camel case for variables and use snake case for methods and classes example : name2 , name2_firstName
        //This is wrong you can't start with a number example - 2name , 2name_firstName , 2name_firstName_lastName






     /*    Note page - 2
     range is a collection of numbers from 0 to n-1 where n is the length of the array.
     byte	1 byte	Stores whole numbers from -128 to 127
     short	2 bytes	Stores whole numbers from -32,768 to 32,767
     int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
     long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
     double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
     boolean	1 bit	Stores true or false values
     char	2 bytes	Stores a single character/letter or ASCII values*/
        byte myNum = 100;//byte is a signed 8 bit integer
        System.out.println(myNum);
        short myNum2 = 5000;//short is a signed 16 bit integer
        System.out.println(myNum2);
        int myNum3 = 100000;//int is a signed 32 bit integer
        System.out.println(myNum3);
        long myNum4 = 10000000000L;//long is a signed 64 bit integer
        System.out.println(myNum4);
        float myNum5 = 100.5f;//float is a 32 bit floating point number
        System.out.println(myNum5);
        double myNum6 = 100.5;//double is a 64 bit floating point number
        System.out.println(myNum6);
        boolean myNum7 = true;//boolean is a 1 bit integer
        System.out.println(myNum7);
        char myNum8 = 'a';//char is a 16 bit integer
        System.out.println(myNum8);
        char myNum9 = '\u0041';//char is a 16 bit integer
        System.out.println(myNum9);


       /* Note page - 2*/
        //for scanner class you have to import java.util.Scanner in your java file top of the file
        //system.in is a special file that is used to read input from the user
        Scanner myScanner = new Scanner(System.in); //creating a new scanner object called myScanner
        int myNum10 = myScanner.nextInt(); //nextInt() is a method that takes in an integer and returns an integer
        float myNum11 = myScanner.nextFloat();//nextFloat() is a method that takes in a float and returns a float
        double myNum12 = myScanner.nextDouble();//nextDouble() is a method that takes in a double and returns a double
        String myNum13 = myScanner.nextLine();//nextLine() is a method that takes in a string and returns a string
        char myNum14 = myScanner.nextLine().charAt(0);//nextLine() is a method that takes in a string and returns a string
        long myNum15 = myScanner.nextLong();//nextLong() is a method that takes in a long and returns a long
        boolean myNum16 = myScanner.nextBoolean();//nextBoolean() is a method that takes in a boolean and returns a boolean
        Short myNum17 = myScanner.nextShort();//nextShort() is a method that takes in a short and returns a short
        Byte myNum18 = myScanner.nextByte();//nextByte() is a method that takes in a byte and returns a byte
        System.out.println(myNum10);//prints out the integer that was inputted by the user
        System.out.println(myNum11);//prints out the float that was inputted by the user
        System.out.println(myNum12);//prints out the double that was inputted by the user
        System.out.println(myNum13);//prints out the string that was inputted by the user
        System.out.println(myNum14);//prints out the character that was inputted by the user
        System.out.println(myNum15);//prints out the long that was inputted by the user
        System.out.println(myNum16);//prints out the boolean that was inputted by the user
        System.out.println(myNum17);//prints out the short that was inputted by the user
        System.out.println(myNum18);//prints out the byte that was inputted by the user


      //operand operator and result example -
        int myNum19 = 10;//10 is an integer and is the operand
        int myNum20 = 20;//20 is an integer and is the operand
        int myNum21 = myNum19 + myNum20;//addition is the operator
        System.out.println(myNum21); //prints out 30 and is the result





/*      Note Page  - 3
        Types of operators :


        Arithmetic Operators :

        Arithmetic operators are used to perform mathematical operations such as addition, division, etc on expressions.
        Arithmetic operators cannot work with Booleans. % operator can work on floats and doubles.
                 Let x=7 and y=2
                + (Addition)	Used to add two numbers	x + y = 9
                - (Subtraction)	Used to subtract the right-hand side value from the left-hand side value	x - y = 5
                * (Multiplication)	Used to multiply two values.	x * y = 14
                / (Division)	Used to divide left-hand Value by right-hand value.	x / y = 3
                % (Modulus)	Used to print the remainder after dividing the left-hand side value from the right-hand side value.	x % y = 1
                ++ (Increment)	Increases the value of operand by 1.	x++ = 8
                -- (Decrement)	Decreases the value of operand by 1.	y-- =  1


        Comparison Operators :
       As the name suggests, these operators are used to compare two operands.
                 Let x=7 and y=2

                Operator	                          Description	Example
                == (Equal to)	Checks if two operands are equal. Returns a boolean value.	x == y --> False
                != (Not equal	Checks if two operands are not equal. Returns a boolean value.	x != y --> True
                > (Greater than)	Checks if the left-hand side value is greater than the right-hand side value. Returns a boolean value.	x > y --> True
                < (Less than)	Checks if the left-hand side value is smaller than the right-hand side value. Returns a boolean value.	x < y --> False
                >=(Greater than or equal to)	Checks if the left-hand side value is greater than or equal to the right-hand side value. Returns a boolean value.	x >= y --> True
                <= (Less than or equal to)	Checks if the left-hand side value is less than or equal to the right-hand side value. Returns a boolean value.	x <= y -->False



        Logical Operators :
        These operators determine the logic in an expression containing two or more values or variables.
                  Let x = 8 and y =2
                 && (logical and)	Returns true if both operands are true.
                 x<y && x!=y --> True

                || (logical or)	Returns true if any of the operand is true.	x<y && x==y --> True
                ! (logical not)	Returns true if the result of the expression is false and vice-versa !(x<y && x==y) --> False

        Bitwise Operators :
        These operators perform the operations on every bit of a number.
                Let x =2 and y=3. So 2 in binary is 100, and 3 is 011.

                Operator 	Description	Example
                & (bitwise and)	1&1 =1, 0&1=0,1&0=0,1&1=1, 0&0 =0	(A & B) = (100 & 011) = 000
                | (bitwise or)	1&0 =1, 0&1=1,1&1=1, 0&0=0	(A | B)  = (100 | 011 ) = 111
                ^ (bitwise XOR)	1&0 =1, 0&1=1,1&1=0, 0&0=0	(A ^ B) = (100 ^ 011 ) = 111
                << (left shift)	This operator moves the value left by the number of bits specified. 	13<<2 = 52(decimal)
                >> (right shift)	This operator moves the value left by the number of bits specified. 	13>>2 = 3(decimal)


        Precedence of operators
        The operators are applied and evaluated based on precedence. For example, (+, -) has less precedence compared to (*, /). Hence * and / are evaluated first.

        In case we like to change this order, we use parenthesis ().*/




      //Arithmetic Operator Example
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b) ); // prints out 30
        System.out.println("a - b = " + (a - b) ); // prints out -10
        System.out.println("a * b = " + (a * b) ); // prints out 200
        System.out.println("b / a = " + (b / a) ); // prints out 2
        System.out.println("b % a = " + (b % a) ); // prints out 0
        System.out.println("c % a = " + (c % a) ); // prints out 5
        System.out.println("a++   = " +  (a++) ); // prints out 10
        System.out.println("a-- = " + (a--) ); // prints out 11


        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) ); // prints out 25
        System.out.println("++d   = " +  (++d) ); // prints out 27




        //Comparison Operator Example
        int x = 10;
        int y = 20;
        int z = 25;
        int w = 25;
        System.out.println("x == y = " + (x == y) ); // prints out false
        System.out.println("x != y = " + (x != y) ); // prints out true
        System.out.println("x > y = " + (x > y) ); // prints out false
        System.out.println("x < y = " + (x < y) ); // prints out true
        System.out.println("x >= y = " + (x >= y) ); // prints out false
        System.out.println("x <= y = " + (x <= y) ); // prints out true
        System.out.println("x == z = " + (x == z) ); // prints out false
        System.out.println("x != z = " + (x != z) ); // prints out true
        System.out.println("x > z = " + (x > z) ); // prints out false
        System.out.println("x < z = " + (x < z) ); // prints out true
        System.out.println("x >= z = " + (x >= z) ); // prints out false
        System.out.println("x <= z = " + (x <= z) ); // prints out true
        
        
        
        //Logical Operator Example
        int x1 = 10;
        int y1 = 20;
        System.out.println("x1 < y1 && x1 != y1 = " + (x1 < y1 && x1 != y1) ); // prints out true
        System.out.println("x1 < y1 || x1 != y1 = " + (x1 < y1 || x1 != y1) ); // prints out true
        System.out.println("!(x1 < y1 && x1 != y1) = " + (!(x1 < y1 && x1 != y1)) ); // prints out false
        
        
        //Bitwise Operator Example
        int x2 = 10;
        int y2 = 3;
        System.out.println("x2 & y2 = " + (x2 & y2) ); // prints out 0
        System.out.println("x2 | y2 = " + (x2 | y2) ); // prints out 11
        System.out.println("x2 ^ y2 = " + (x2 ^ y2) ); // prints out 11
        System.out.println("x2 << 2 = " + (x2 << 2) ); // prints out 40
        System.out.println("x2 >> 2 = " + (x2 >> 2) ); // prints out 0
        
        
        //Precedence of operators
        int x3 = 10;
        int y3 = 20;
        int z3 = 25;
        int w3 = 25;
        System.out.println("x3 + y3 = " + (x3 + y3) ); // prints out 30
        System.out.println("x3 - y3 = " + (x3 - y3) ); // prints out -10
        System.out.println("x3 * y3 = " + (x3 * y3) ); // prints out 200
        System.out.println("y3 / x3 = " + (y3 / x3) ); // prints out 2
        System.out.println("y3 % x3 = " + (y3 % x3) ); // prints out 0
        System.out.println("z3 % x3 = " + (z3 % x3) ); // prints out 5
        System.out.println("x3++   = " +  (x3++) ); // prints out 10
        System.out.println("x3-- = " + (x3--) ); // prints out 11
        System.out.println("y3++   = " +  (y3++) ); // prints out 20
        System.out.println("y3-- = " + (y3--) ); // prints out 19
        System.out.println("z3++   = " +  (z3++) ); // prints out 25
        System.out.println("z3-- = " + (z3--) ); // prints out 24
        
        
        //Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) ); // prints out 25
        System.out.println("++d   = " +  (++d) ); // prints out 27
        
    }
}


