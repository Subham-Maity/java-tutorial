import java.util.Scanner;
public class mile{
public static void  main (String[] args){
double kilometers;
System.out.println("Enter the kilometers");
Scanner scan = new Scanner(System.in);
kilometers = scan.nextDouble();
double miles = (kilometers * 0.621371);
System.out.println("miles");
System.out.println(miles);

}


}