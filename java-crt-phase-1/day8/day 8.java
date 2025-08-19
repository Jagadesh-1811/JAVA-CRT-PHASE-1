public class LinearSearch {
 
 // Linear search method
 public static int linearSearch(int[] arr, int target) {
 // Iterate through the array
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] == target) { // Check if current element is the target
 return i; // Return the index if found
 }
 }
 return -1; // Return -1 if target is not found
 }
 
 public static void main(String[] args) {

 // Initialize the array and the target element
 int[] arr = {10, 23, 45, 60, 12, 5};
 int target = 45; // The element we are searching for
 
 // Call linearSearch method
 int result = linearSearch(arr, target);
 
 // Check the result and print the output
 if (result != -1) {
 System.out.println("Element found at index " + result);
 } else {
 System.out.println("Element not found");
 }
 }
}
public class BinarySearch {
 
 // Binary search method
 public static int binarySearch(int[] array, int key) {
 int l = 0; // Lower bound of the search interval
 int u = array.length - 1; // Upper bound of the search interval
 
 while (l <= u) {
 int mid = (l + u) / 2; // Calculate the middle index
 
 if (array[mid] == key) {
 return mid; // Key found at index mid
 } else if (array[mid] < key) {
 l = mid + 1; // Search in the right half
 } else {
 u = mid - 1; // Search in the left half
 }
 }
 
 return -1; // Key not found
 }
 
 public static void main(String[] args) {
 int[] array = {-11, 4, 6, 9, 33, 45}; // Sorted array
 int key = 45; // Key to search for
 
 // Perform binary search
 int result = binarySearch(array, key);
 
 // Display the result
 if (result != -1) {

 System.out.println("Found at index " + result);
 } else {
 System.out.println("Not Found");
 }
 }
}
public class sort {
 
 public static void main(String[] args) {
 int[] arr = {5, 4, 3, 2, 1}; // Input array
 int n = arr.length; // Size of the array
 int temp; // Temporary variable for swapping
 int swapCount = 0; // Counter to track the number of swaps

 
 // Bubble Sort Algorithm
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - i - 1; j++) {
 if (arr[j] > arr[j + 1]) {
 // Swap arr[j] and arr[j + 1]
 temp = arr[j];
 arr[j] = arr[j + 1];
 arr[j + 1] = temp;
 swapCount++; // Increment the swap counter
 }
 }
 }
 
 // Print the sorted array
 System.out.print("Array in ascending order: ");
 for (int i = 0; i < n; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println("\nSwapcount: " + swapCount); // Print the total number of swaps
 }
}
public class SelectionSort {
 
 public static void main(String[] args) {
 int[] arr = {20, 12, 10, 15, 2}; // Input array
 int n = arr.length; // Size of the array
 int temp; // Temporary variable for swapping
 int swapCount = 0; // Counter to track the number of swaps
 
 

 // Selection Sort Algorithm
 for (int i = 0; i < n - 1; i++) {
 int min = i; // Assume the current index is the minimum
 
 for (int j = i + 1; j < n; j++) {
 if (arr[j] < arr[min]) {
 min = j; // Update the index of the minimum element
 }
 }
 
 // Swap the found minimum element with the element at index i
 if (min != i) {
 temp = arr[i];
 arr[i] = arr[min];
 arr[min] = temp;
 swapCount++; // Increment the swap counter
 }
 }
 
 // Output the sorted array
 System.out.println("Sorted array in ascending order:");
 for (int i = 0; i < n; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println("\nSwapcount: " + swapCount); // Print the number of swaps
 }
 
 }
}
