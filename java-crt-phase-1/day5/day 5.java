// Basic array operations

import java.util.Scanner;
class Array {
public static void main(String[] args) {
int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
// Accessing specific element
System.out.println(a[2]); // Output: 30
// Print all elements using traditional for loop
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
}
// Print all elements using enhanced for loop
for (int element : a) {
System.out.println(element);
}
}
}

//Array declaration and initialization

import java.util.Scanner;
class ArrayDeclaration {
public static void main(String[] args) {
// Method 1: Separate declaration and allocation
int b[];
b = new int[5];
// Method 2: Combined declaration and allocation
2
int[] c = new int[5];
// Default values demonstration
for (int element : b) {
System.out.println(element); // Output: 0 (default for int)
}
// Taking input from user
Scanner in = new Scanner(System.in);
for(int i = 0; i < 5; i++) {
System.out.println("Enter the Number : ");
c[i] = in.nextInt();
}
for (int element : c) {
System.out.println(element);
}
}
}


// Array Rotation programs

import java.util.Scanner;
class ArrayRotation {
public static void main(String[] args) {
int arr[] = {-2, -4, 3, 5, 7};
int n = arr.length;
int first = arr[0];
// Shift all elements one position left
for (int i = 0; i < n-1; i++){
arr[i] = arr[i+1];
}
arr[n-1] = first;
for(int e : arr){
System.out.print(" " + e);
}
}
}

//Move First Element to Last (With Swap)

class ArraySwapRotation {
public static void main(String[] args) {
int arr[] = {-2, -4, 3, 5, 7};
int n = arr.length;
3
for (int i = 0; i < n-1; i++){
int temp = arr[i];
arr[i] = arr[i+1];
arr[i+1] = temp;
}
for(int e : arr){
System.out.print(" " + e);
}
}
}

//Move Last Element to First
class LastToFirst {
public static void main(String[] args) {
int arr[] = {-2, -4, 3, 5, 7};
int n = arr.length;
int last = arr[n-1];
for (int i = n-1; i > 0; i--){
arr[i] = arr[i-1];
}
arr[0] = last;
for(int e : arr){
System.out.print(" " + e);
}
}
}

//4.Matrix Operations
//Matrix Multiplication
import java.util.Scanner;
class MatrixMultiplication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Rows: ");
int r = sc.nextInt();
System.out.print("Enter the Columns: ");
int c = sc.nextInt();
int[][] a = new int[r][c];
int[][] b = new int[r][c];
int[][] result = new int[r][c];
// Input for matrix A
for(int i = 0; i < r; i++){
4
for(int j = 0; j < c; j++){
System.out.print("Enter the ["+i+"]["+j+"] a matrix: ");
a[i][j] = sc.nextInt();
}
}
// Input for matrix B
for(int i = 0; i < r; i++){
for(int j = 0; j < c; j++){
System.out.print("Enter the ["+i+"]["+j+"] b matrix: ");
b[i][j] = sc.nextInt();
}
}
// Matrix multiplication and display
for(int i = 0; i < r; i++){
for(int j = 0; j < c; j++){
for(int k = 0; k < c; k++){
result[i][j] += a[i][k] * b[k][j];
}
System.out.print(result[i][j] + " ");
}
System.out.println();
}
}
}

// 2D Arrays and Jagged Arrays
//Regular 2D Array
class TwoDArray {
public static void main(String[] args) {
int a[][] = {
{10, 20, 30},
{40, 50, 60},
{70, 80, 90}
5
};
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(" " + a[i][j]);
}
System.out.println("");
}
}
}


//Jagged Array (Irregular 2D Array)
class JaggedArray {
public static void main(String[] args) {
// Jagged array - rows can have different lengths
int a[][] = {
{10, 20, 30, 40}, // 4 elements
{40, 50, 60}, // 3 elements
{70, 80, 90, 50} // 4 elements
};
// Traditional nested loops
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
System.out.print(" " + a[i][j]);
}
System.out.println("");
}
// Enhanced for loop version
for(int[] row : a){
for(int element : row) {
System.out.print(" " + element);
}
System.out.println("");
}
}
}


//Array Algorithms
//Finding Minimum and Maximum Elements
import java.util.*;
class MinMaxFinder {
public static void main(String[] args) {
int a[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};
// Using built-in sort function
Arrays.sort(a);
// After sorting: first element = minimum, last element = maximum
System.out.println("min-" + a[0] + " max-" + a[a.length-1]);
}
}


//
//Sorting Array in Ascending Order (Bubble Sort)
import java.util.Arrays;
class AscendingOrder {
public static void main(String[] args) {
int[] a = {8, 6, 4, 29, 2, 16, 78};
System.out.println("Before Sort: " + Arrays.toString(a));
// Bubble sort implementation
for(int i = 0; i < a.length; i++) {
for (int j = i + 1; j < a.length; j++) {
if (a[i] > a[j]) {
int temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
System.out.println("After Sort: " + Arrays.toString(a));
}
}

//Separating Negative and Positive Numbers
import java.util.*;
public class NegativePositiveSeparator {
public static void move(int[] arr) {
Arrays.sort(arr); // Sorts in ascending order
}
public static void main(String[] args) {
int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
move(arr);
for (int e : arr)
System.out.print(e + " ");
}
}


//String Character Analysis
//Counting Different Character Types
class CharacterAnalyzer {
public static void main(String[] args) {
int upper = 0, lower = 0, space = 0, digit = 0, symbol = 0;
String s = "Hi Hello CSD & AIDS**146";
for(char c : s.toCharArray()){
if(Character.isUpperCase(c)){
upper++;
}
else if(Character.isLowerCase(c)){
lower++;
}
else if(Character.isDigit(c)){
7
digit++;
}
else if(Character.isSpace(c)){
space++;
}
else{
symbol++;
}
}
System.out.println("Upper: " + upper);
System.out.println("Lower: " + lower);
System.out.println("Digit: " + digit);
System.out.println("Space: " + space);
System.out.println("Symbol: " + symbol);
}
}


//








