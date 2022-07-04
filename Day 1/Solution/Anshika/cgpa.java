import java.util.Scanner;
public class cgpa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the eng marks");
    float eng = scan.nextFloat();
    System.out.println("Enter the math marks");
    float math = scan.nextFloat();
    System.out.println("Enter the bio marks");
    float bio = scan.nextFloat();
    float cgpa = ((eng + math + bio) / 30);
    System.out.println("cgpa");
    System.out.println(cgpa);

  }

}