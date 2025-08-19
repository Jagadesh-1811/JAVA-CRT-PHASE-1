// enhanced for loop
class Enhanced_for {
 public static void main(String[] args) {
 int number[] = {10, 20, 30, 40, 50};
 for(int n : number) {
 System.out.println(n);
 }
 }
}
//Star Pattern Program:
class Nested_forloop {
 public static void main(String[] args) {
 int i, j;
 for(i = 1; i <= 5; i++) {
 for(j = 1; j <= i; j++) {
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}
//break 
class break_example {
 public static void main(String[] args) {
 int i;
 for(i = 1; i <= 10; i++) {
 System.out.println(i);
 if (i == 8)
 break;
 }
 }
}
//Break and Continue Together:
class break_continue {
 public static void main(String[] args) {
 int i;
 for(i = 1; i <= 10; i++) {
 if(i == 5)
 continue;
 System.out.println(i);
 if (i == 8)
 break;
 }
 }
}
// Simple Star Triangle
class StarTriangle {
 public static void main(String[] args) {
 int i, j;
 for (i = 0; i <= 5; i++) {
 for (j = 0; j <= i; j++) {
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}
//Number Repetition Triangle
import java.util.Scanner;
class NumberRepetition {
 public static void main(String[] args) {
 int i, j, rows;
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
18
 rows = in.nextInt();
 
 for (i = 0; i <= rows; i++) {
 for (j = 0; j <= i; j++) {
 System.out.print(i);
 }
 System.out.println("");
 }
 }
}
//Right-Aligned Star Triangl
import java.util.Scanner;
class RightAlignedTriangle {
 public static void main(String[] args) {
 int i, j, n;
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 n = in.nextInt();
 
 for (i = 0; i <= n; i++) {
 for (j = 0; j <= n; j++) {
 if ((i + j) < n)
 System.out.print(" ");
 else
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}
// Inverted Star Triangle
import java.util.Scanner;
class InvertedTriangle {
 public static void main(String[] args) {
 int i, j, n;
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 n = in.nextInt();
 
 for (i = 1; i <= n; i++) {
 for (j = n; j >= i; j--) {
 System.out.print("*");
 }
 System.out.println("");
 }
 }
}
// Continuous Number Triangle
class ContinuousNumbers {
 public static void main(String[] args) {
 int number = 1, i, j;
 
 for (i = 1; i <= 5; i++) {
 for (j = 1; j <= i; j++) {
 System.out.print(" " + number);
 number++;
 }
21
 System.out.println("");
 }
 }
}
//Centered Number Triangle
import java.util.Scanner;
class CenteredTriangle {
 public static void main(String[] args) {
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 
 for (int i = 1; i <= n; i++) {
 // Print leading spaces for centering
 for (int k = 1; k <= (n - i); k++) {
 System.out.print(" ");
 }
 // Print numbers
 for (j = 1; j <= i; j++) {
 System.out.print(" " + i);
 }
 System.out.println("");
 }
 }
}
// Inverted Number Pyramid
import java.util.Scanner;
class InvertedPyramid {
 public static void main(String[] args) {
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 
 for (i = n; i >= 1; i--) {
 // Print leading spaces
 for (int k = 1; k <= (n - i); k++) {
 System.out.print(" ");
 }
 // Print numbers (2*i-1 times for pyramid effect)
 for (int j = 1; j <= 2 * i - 1; j++) {
 System.out.print(i);
 }
 System.out.println("");
 }
 }
}
//ASCII Values
import java.util.Scanner;
class vote {
 public static void main(String[] args) {
 int letter = 65, i, j,rows;
 System.out.println("Enter the number of rows : ");
 Scanner in = new Scanner(System.in);
 rows = in.nextInt();
 for (i = 0; i <= rows; i++) {
 for (j = 0; j <= i; j++) {
 System.out.print((char)(letter + j)+" ");
 }
 System.out.println("");
 }
 }
}
//ASCII Values
import java.util.Scanner;
class ASCIIDisplay {
 public static void main(String[] args) {
 char a = 'z';
 
 // Convert lowercase 'z' to uppercase 'Z'
 System.out.print((a) + ":" + (char)(a - 32));
 }
}


