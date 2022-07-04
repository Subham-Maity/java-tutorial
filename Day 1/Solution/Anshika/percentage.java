import java.util.Scanner;
public class abc{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your physics marks");
        float physics = scan.nextFloat();
        System.out.println("Enter your chemistry marks");
        float chemistry = scan.nextFloat();
        System.out.println("Enter your math marks");
        float math = scan.nextFloat();
        System.out.println("Enter your bio marks");
        float bio = scan.nextFloat();
        System.out.println("Enter your bengali marks:");
        float bengali = scan.nextFloat();

        float percentage = ((physics + chemistry + math + bio + bengali)/500)*100;
        System.out.println("percentage :");
        System.out.println(percentage);
    }

}