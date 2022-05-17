import java.util.Scanner;
public class recursor {
public static int fibbonacci(int x){
if(x == 0) return 0;
if(x == 1) return 1;
return fibbonacci(x-1) + fibbonacci(x-2);
}
public static int gcd(int x, int y){
if(y == 0) return x;
return gcd(y, x%y);
}
public static double product(int x, int y){
if(y == 0) return 0;
else if(y < 0)
return -x + product(x, y+1);
else
return x + product(x, y-1);
}
public static double power(int x, int y){
if(y == 0) return 1;
else if(y < 0)
return 1.0/x * power(x, y+1);
else
return x * power(x, y-1);
}
public static void main(String [] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter a number to find its fibbonacci: ");
int num = input.nextInt();
System.out.println("The fibbonacci of " + num + " is: " + fibbonacci(num));
System.out.print("Enter x and y to find their gcd: ");
int x = input.nextInt(); int y = input.nextInt();
System.out.println("The gcd of x and y is: " + gcd(x,y));
System.out.print("Enter x and y to find their product: ");
x = input.nextInt(); y = input.nextInt();
System.out.println("x * y = " + product(x,y));
System.out.print("Enter x and y to find x^y: ");
x = input.nextInt(); y = input.nextInt();
System.out.println("x ^ y = " + power(x,y));
}
}