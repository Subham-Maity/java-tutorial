## 1. Print if a number is prime or not (Input n from the user). (without creating a method or recursion using if-else and for loop or do while loop only)

```
 Note : To find if a number is prime, why is checking till n/2 ?
            
Well, whenever you find a number which is Prime or not , you check it till n/2. That is true, and there is no problem checking it till n. But we don’t check it because there is no possibility of getting a number x which is divisible by n and which lies on the second half of the number (n/2).
 
Let’s check what I am talking about.
 
Consider the number 17. Check whether it is prime or not.
 
17%2≠0 (%=Modulus or Remainder)
 
17%3≠0
 
17%4≠0
 
17%5≠0
 
17%6≠0
 
17%7≠0
 
17%8≠0
 
17%9≠0 (Consider this which lies on the second half in the n/2).
 
You won’t find any more numbers which can produce the result.
 
The minimum number that can be divided by 17 is 2, and if you divide 17/9 which can’t give you the number which is less than 2. (We don’t consider 1 as minimum since 1 is divisible with every other number).
 
So, it is a waste of time to check further for any other number, or it is an inefficient algorithm in terms of computer programming.
```



## 2. Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user

### Hints
```
avg = (subject1 + subject2 + subject3)/3.0
        If Conditions: avg>=40 && subject1>=33 && subject2>=33 && subject3>=33
           print"Congratulations, You have been promoted"
        Else print"Sorry, You have not been promoted! Please try again."
```

## 3. Calculate income tax paid by you to the government as per the slabs mentioned below:

```
Income Slab	              Tax
2.5L – 5.0L  	        5% 
5.0L – 10.0L 	        20%
Above 10.0L               30%
Note that there is no tax below 2.5L. Take the input amount as input from the user.


```


## 4. Write a program to find whether a year entered by the user is a leap year or not.

### Hints

```
Check if the year is divisible by 400 or 4 but not 100, DISPLAY "is a leap year",
Otherwise, DISPLAY ": is not a leap year.""
```


## 5. Encrypt a grade by adding a number to it. Decrypt it to show the correct grade.

Write a program for the first user to input his/her exam grade. Now the program asks for a code number to encrypt your grade by adding the number with your grade. Now the program asks you if you want to decrypt your grade press y or if no type n (note: Y/y or N/n case must be ignored and user can type the capital letter or small letter your program should understand)and if yes program will start decrypting your grade and show you your original grade otherwise program will print “ sorry sir/mam, we can't crack your grade “

### Hint 
```
Java: 1. First take input as a char (letter like: A B C D ) 
      2. Take an input as an integer value 
      3. Type cast them because if we do any operation between char and int, it returns int (it’s called numaric Promotion Rules 
01.Byte + Short = Int  
02.Short + Int  = Int
03.Long + Float = Float
04.Character + Int = Int (here we use this)
05.Character + Short = Int
06.Long + Double = Double
07.Float + Double = Double)So we just have to cast them into char 
      4. Take an input as a string value (yes for y No for n) 
      6.we check the input letter(y/n) and also ignore case by equalsIgnoreCase 
      7. Type cast again and do this: Your given grade - Your given number 
```


## 6. (Escape sequence) format the following sentence using escape sequence characters only

### Hint

```
So here we did like this
Java :
Escape Sequence :
 
\t  Inserts a tab in the text at this point.
\b  Inserts a backspace in the text at this point.
\n  Inserts a newline in the text at this point.
\r  Inserts a carriage return in the text at this point.
\f  Inserts a form feed in the text at this point.
\'  Inserts a single quote character in the text at this point.
\"  Inserts a double quote character in the text at this point.
\\  Inserts a backslash character in the text at this point.
 
Python :
 
\'	Single Quote
\”    Double Quote	
\\	Backslash	
\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed	
\ooo	Octal value	
\xhh	Hex value
```

## 7. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on

### Hint 
```
Java: using the case switch and take the integer input from the user and print according to the number
```

## 8. Make a Calculator. Take 2 integer numbers (a & b) from the user and an operation as follows

### Hint 

```
Press 1 : + (Addition) a + b 
Press 2 : - (Subtraction) a - b 
Press 3 : * (Multiplication) a * b 
Press 4 : / (Division) a / b 
Press 5 : % (Modulo or remainder) a % b 
Calculate the result according to the operation given and display it to the user

using case switch and take the integer input from the user and operation to them as 
the instructions are given in the question 
```

## Create a simple Rock, Paper Scissors game

### Hint

```
So here we did like this
Rules and Main approach:
 Rock wins against scissors
 paper wins against rock
 scissors wins against paper
 Here 0 = ROCK 1 = Paper 2 = Scissors, 
If
Case 1 When user enter 0 Rock(0) wins against scissors(2) so user_input == 0 && comp_input == 2 So user win here
Case 2 When user enter 1 paper(1) wins against rock(0) so user_input == 1 && comp_input == 0 So user win 
Case 3 When user enter 2 scissors(2) wins against paper(1) so user_input == 2 && comp_input == 1 So user win
Else Any other case(except case1/case2/case3) computer win 
 
 
 
 
In java :
I use switch case and first make scanner class and random method 
Step 1: For user (scanner class takes input as 0 1 2)
       
Step 2: For pc (scanner class takes input as 0 1 2) scanner class takes input from the random method(where bound is 3)
Step 3:I use while loop for 3 times game play
Step 4: Total 3 case for user and total 3 case for Pc
Step 5:Now I compare the cases between user and pc
For user win
Case 1 When user enter 0 Rock(0) wins against scissors(2) so user_input == 0 && comp_input == 2 So user win here
Case 2 When user enter 1 paper(1) wins against rock(0) so user_input == 1 && comp_input == 0 So user win 
Case 3 When user enter 2 scissors(2) wins against paper(1) so user_input == 2 && comp_input == 1 So user win
For pc win
Any other case(except case1/case2/case3) computer win 
Step 6:Now just print the counter for how many times user win
```