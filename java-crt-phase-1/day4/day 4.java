//Factorial number
import java.util.Scanner;
class Factorialnum {
 public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int i,f,n;
 System.out.print("Enter the number :");
 n = in.nextInt();
 f = 1;
 for(i=1 ;i<=n ;i++){
 f = f*i;
 }
 System.out.println("Factorial of"+n+" is :"+f);
 }
}
//Fibonaccci
import java.util.Scanner;
class Fibonaccci {
 public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int a = -1, b = 1 , i,c,n;
 System.out.print("Enter the number :");
 n = in.nextInt();//5
 for (i=1 ;i<=n ;i++){//1<=5 2<=5 3<=5 4<=5 5<=5

 c = a+b;//-1+1=0 1+0=1 0+1=1 1+1=2 1+2=3
 System.out.print(c+" ");//0 1 1 2 3
 a = b;//1 0 1 1 2
 b = c;//0 1 1 2 3
 }
 }
}
//primenum
import java.util.Scanner;
class primenum {
 public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int n,f=0,i;
 System.out.print("Enter the number :");
 n = in.nextInt();
 for (i=1 ;i<=n ;i++){
 if(n % i==0){
 f++;
 }
 }
 if(f == 2){
 System.out.println(n+"is a Prime number"); }
 else{
 System.out.println(n+"It's not a Prime number"); }
}
}
//Primenum 1to 100
class primenum {
 public static void main(String[] args){
 int n,f=0,i;
 for( n=1; n<=100 ;n++){
 for (i=1 ;i<=n ;i++){
 if(n % i==0){
 f++;
 }
 }
 if(f == 2){
 System.out.println(n+"is a Prime number"); 
 }
 f = 0;
 }
 }
}
//perfect number
class perfactnum {
 public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int n,sum=0,i;
 System.out.print("Enter the number :");
 n = in.nextInt();
 for(i=1 ;i<n ;i++){
 if(n%i==0){
 sum += i; 
 }
 }
 if(sum == n){
 System.out.print(n+"is a perfect number :");
 }
 else{

 System.out.print(n+"It's not a perfect number :");
 } } }
\\static method
class MethodTypes {
 static int staticVar = 100;
 int nonStaticVar = 200;
 
 // Static method
 public static void staticMethod() {
 System.out.println("Static method called");
 System.out.println("Static variable: " + staticVar);
 // System.out.println(nonStaticVar); // Error: Cannot access nonstatic

 }
 
 //static method
 public void nonStaticMethod() {
 System.out.println("Non-static method called");
 System.out.println("Static variable: " + staticVar); // OK
 System.out.println("Non-static variable: " + nonStaticVar); // OK
 }
}
public class MethodTypeExample {
 public static void main(String[] args) {
 // Calling static method - no object needed
 MethodTypes.staticMethod();
 
 // Calling non-static method - object needed
 MethodTypes obj = new MethodTypes();
 obj.nonStaticMethod();

 }
}
//Type of User Define Methods in java
class Methods
{
 //No Return without arguments
 public void add()
 {
 int a = 123;
 int b = 10;
 System.out.println("Addition : "+(a+b));
 }
}
class function {
 public static void main(String[] args) {
 Methods o = new Methods();
 o.add();
 }
}
//All Four Types of Methods

class Methods
{
 //Type 1: No Return without arguments
 public void add()
 {
 int a = 123;
 int b = 10;
 System.out.println("Addition : "+(a+b));
 }
 
 //Type 2: No Return with Arguments
 public void sub(int x, int y){
 System.out.println("Subtraction : "+(x - y));
 }
 
 //Type 3: Return Without Arguments
 public int mul(){
32
 int a = 123;
 int b = 10;
 return a * b;
 }
 
 //Type 4: Return With Arguments
 public float div(int x, int y){
 return (float)x / y; // Cast to float for decimal result
 }
}
class function {
 public static void main(String[] args) {
 Methods o = new Methods();
 
 // Calling Type 1 method
 o.add();
 
 // Calling Type 2 method
 o.sub(123, 10);
 
 // Calling Type 3 method
 System.out.println("Mul : " + o.mul());
 
 // Calling Type 4 method
 System.out.println("Division : " + o.div(123, 10));
 }
}
\\Math Methods
public class MathMethods {
 public static void main(String[] args) {
 System.out.println("Max: " + Math.max(10, 20)); // 20
 System.out.println("Min: " + Math.min(10, 20)); // 10
 System.out.println("Absolute: " + Math.abs(-15)); // 15
 System.out.println("Square root: " + Math.sqrt(16)); // 4.0
 System.out.println("Power: " + Math.pow(2, 3)); // 8.0
 System.out.println("Random: " + Math.random()); // Random 
decimal
 }
}
//method overloading
class Calculator {
 // Method 1: Two integers
 public int add(int a, int b) {
 return a + b;
 }
 
 // Method 2: Three integers
 public int add(int a, int b, int c) {
 return a + b + c;
 }
 
 // Method 3: Two doubles
 public double add(double a, double b) {
 return a + b;
 }
 
 // Method 4: Two strings
 public String add(String a, String b) {
 return a + b;
 }
}
public class OverloadingExample {
 public static void main(String[] args) {
 Calculator calc = new Calculator();
 
 System.out.println("Two ints: " + calc.add(5, 3)); // 8
 System.out.println("Three ints: " + calc.add(5, 3, 2)); // 10
 System.out.println("Two doubles: " + calc.add(5.5, 3.3)); // 8.8
 System.out.println("Two strings: " + calc.add("Hello", "World")); 
// HelloWorld
 }
}
//Recursive Methods
class RecursiveExample {
 public static int factorial(int n) {
 if (n <= 1) {
 return 1;
 } else {
 return n * factorial(n - 1);
 }
 }
 public static void main(String[] args) {
 System.out.println("Factorial of 5: " + factorial(5)); // 120
 }

}
