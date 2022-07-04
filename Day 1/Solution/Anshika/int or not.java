/*import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}*/


import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()== true) {
          System.out.println("Your number is an integer");
        } else {
            System.out.println("You did not enter a number");
        }
    }
}