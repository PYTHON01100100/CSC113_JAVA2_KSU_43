import java.util.Scanner;
public class recursor {
//from last tutorial
public static double power(int x, int y){
if(y == 0) return 1;
else if(y < 0)
return 1.0/x * power(x, y+1);
else
return x * power(x, y-1);
}
public static int digitCount(int x){
if(x == 0)
return 0;
else
return 1 + digitCount(x/10);
}
public static int digitSum(int x){
if(x == 0)
return 0;
else
return x%10 + digitSum(x/10);
}
public static int reverseDigits(int x){
if(x == 0)
return 0;
else{
int digit = x%10;
return digit * ((int) power(10, digitCount(x/10)))
+ reverseDigits(x/10);
}
}
public static int reverseDigits2(int x){
return reverseDigits2(x, digitCount(x));
}
private static int reverseDigits2(int x, int nbDigits){
if(x == 0)
return 0;
else{
int digit = x%10;
return digit * ((int) power(10,nbDigits-1))
+ reverseDigits2(x/10, nbDigits-1);
}
}
public static int reverseDigits3(int x){
return reverseDigits3(x, 0);
}
private static int reverseDigits3(int x, int temp){
if(x == 0)
return temp;
temp = temp * 10 + x%10;
return reverseDigits3(x/10, temp);
}
public static boolean isPalindrome(int x){
int digits = digitCount(x);
return isPalindrome(x, x, digits);
}
private static boolean isPalindrome(int x, int remain, int digits){
if(remain < 10) return x%10 == remain;
int a = remain%10;
int b = (int)(x/power(10,digits-1))%10;
if(a == b)
return isPalindrome(x, remain/10, digits-1);
else
return false;
}
public static int toBinary(int x){
if(x == 0)
return 0;
if(x%2 == 1)
return 1 + toBinary(x/2) * 10;
else
return 0 + toBinary(x/2) * 10;
}
public static void main(String[] args) {
System.out.println("The number 871623 has "
+ digitCount(871623) + " digits");
System.out.println("The sum of the digits of 1234 is: "
+ digitSum(1234));
System.out.println("The reverse digits of 12345 is: "
+ reverseDigits(12345));
System.out.println("The reverse digits of 12345 is: "
+ reverseDigits3(12345));
System.out.println("Is 8769678 palindrome? "
+ isPalindrome(8769678));
System.out.println("Is 87691 palindrome? "
+ isPalindrome(87691));
System.out.println("The number 43 in binary = "
+ toBinary(43));
}
}