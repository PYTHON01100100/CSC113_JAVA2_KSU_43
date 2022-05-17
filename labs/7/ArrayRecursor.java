import java.util.Scanner;
public class ArrayRecursor {
public static int fill(int [] array, Scanner s){
return fill(array, s, 0);
}
private static int fill(int [] array, Scanner s, int start){
if(start == array.length) return 0;
System.out.print("Enter a number: ");
int temp = s.nextInt();
if(temp == -1)
return 0;
else{
array[start] = temp;
return 1 + fill(array, s, start+1);
}
}
public static int count(int [] array){
return count(array, 0);
}
private static int count(int [] array, int start){
if(start == array.length || array[start] == -1)
return 0;
else
return 1 + count(array, start+1);
}
public static int sum(int [] array){
return sum(array, 0);
}
private static int sum(int [] array, int start){
if(start == array.length || array[start] == -1)
return 0;
else{
return array[start] + sum(array, start+1);
}
}
public static void print(int array[]){
System.out.print("[");
print(array, 0);
System.out.println("]");
}
private static void print(int array[], int start){
System.out.print(array[start]);
if(start + 1 != array.length && array[start+1] != -1){
System.out.print(", ");
print(array, start+1);
}
}
public static void printReverse(int array[]){
System.out.print("[");
printReverse(array, 0);
System.out.println("]");
}
private static void printReverse(int array[], int start){
if(start + 1 != array.length && array[start+1] != -1){
printReverse(array, start+1);
System.out.print(", ");
}
System.out.print(array[start]);
}
public static void main(String [] args){
Scanner input = new Scanner(System.in);
int [] array = new int[10];
for(int i = 0; i < array.length; i++)
array[i] = -1;
int choice = 0;
do{
System.out.println("1) Fill new array.");
System.out.println("2) Count elements.");
System.out.println("3) Calculate sum of elements.");
System.out.println("4) Print the array.");
System.out.println("5) Print the array in reverse order");
System.out.println("6) Quit.");
System.out.print("Enter a choice: ");
choice = input.nextInt();
switch(choice){
case 1:
for(int i = 0; i < array.length; i++)
array[i] = -1;
fill(array, input);
break;
case 2:
System.out.println("Number of elements: " + count(array));
break;
case 3:
System.out.println("The sum is: " + sum(array));
break;
case 4:
System.out.println("The array is: ");
print(array);
break;
case 5:
System.out.println("The array in reverse is: ");
printReverse(array);
}
}while(choice != 6);
System.out.println("Bye!");
}
}