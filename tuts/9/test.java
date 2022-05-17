import java.util.Scanner;
public class test {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter x: ");
int x = input.nextInt();
System.out.print("Enter y: ");
int y = input.nextInt();
try{
int z = x/y;
System.out.println("x / y = " + z);
} catch(ArithmeticException e){
System.out.println(e.getMessage());
}
System.out.print("Enter side1, side2, and side3: ");
int side1 = input.nextInt();
int side2 = input.nextInt();
int side3 = input.nextInt();
try{
Triangle t1 = new Triangle(side1, side2, side3);
System.out.println("Triengle type: " + t1.getTriType());
}catch (IllegalArgumentException e){
System.out.println("Error creating the triangle!");
System.out.println(e.getMessage());
}catch (Exception e){
System.out.println("Error getting the triangle type!");
System.out.println(e.getMessage());
}
}
}