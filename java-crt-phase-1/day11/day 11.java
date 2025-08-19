
// StackUsingArray.java
public class StackUsingArray {
 private static final int MAX = 3;
 private int[] stack;
 private int top;
 
 // Constructor to initialize the stack
 public StackUsingArray() {
 stack = new int[MAX];
 top = -1;
 }
 
 // Method to push an element onto the stack
 public void push(int value) {
 if (top == MAX - 1) {
 System.out.println("Stack is full (Overflow).");
 } else {
 stack[++top] = value;
 System.out.println(value);
 }
 }
 
 // Method to pop an element from the stack
 public void pop() {
 if (top == -1) {
 System.out.println("Stack is empty (Underflow).");
 } else {

 System.out.println("Popped element: " + stack[top--]);
 }
 }
 
 // Method to peek at the top element
 public void peek() {
 if (top == -1) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Top element: " + stack[top]);
 }
 }
 
 // Method to check if stack is empty
 public boolean isEmpty() {
 return top == -1;
 }
 
 // Method to check if stack is full
 public boolean isFull() {
 return top == MAX - 1;
 }
 
 // Method to display stack elements
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 System.out.print("Stack elements: ");
 for (int i = top; i >= 0; i--) {
 System.out.print(stack[i] + " ");
 }
 System.out.println();
 }
 }
 
 // Main method to test the stack implementation
 public static void main(String[] args) {
 StackUsingArray stack = new StackUsingArray();
 
 System.out.println("=== Stack Implementation Using Arrays ===\n");
 
 // Push elements
 stack.push(10);

 stack.push(20);
 stack.push(30);
 
 // Display stack
 stack.display();
 
 // Peek at top element
 stack.peek();
 
 // Pop element
 stack.pop();
 
 // Display stack after pop
 stack.display();
 
 // Test overflow condition
 System.out.println("\nTesting overflow condition:");
 stack.push(40);
 stack.push(50); // This should cause overflow
 }
}
// StackUsingLinkedList.java
// Node class to represent each element in the stack
class Node {
 int data;
 Node next;

 
 // Constructor
 public Node(int data) {
 this.data = data;
 this.next = null;
 }
}
public class StackUsingLinkedList {
 private Node top;
 
 // Constructor to initialize the stack
 public StackUsingLinkedList() {
 this.top = null;
 }
 
 // Method to push an element onto the stack
 public void push(int value) {
 Node newNode = new Node(value);
 newNode.next = top;
 top = newNode;
 System.out.println(value);
 }
 
 // Method to pop an element from the stack
 public void pop() {
 if (top == null) {
 System.out.println("Stack is empty (Underflow).");
 } else {
 System.out.println("Popped element: " + top.data);
 top = top.next;
 // Java automatically handles memory deallocation (garbage collection)
 }
 }
 
 // Method to peek at the top element
 public void peek() {
 if (top == null) {
 System.out.println("Stack is empty.");
 } else {
 System.out.println("Top element: " + top.data);
 }
 }
 

 // Method to check if stack is empty
 public boolean isEmpty() {
 return top == null;
 }
 
 // Method to display stack elements
 public void display() {
 if (isEmpty()) {
 System.out.println("Stack is empty.");
 } else {
 Node temp = top;
 System.out.print("Stack elements: ");
 while (temp != null) {
 System.out.print(temp.data + " ");
 temp = temp.next;
 }
 System.out.println();
 }
 }
 
 // Method to clear the entire stack
 public void clear() {
 top = null;
 System.out.println("Stack cleared successfully!");
 }
 
 // Main method to test the stack implementation
 public static void main(String[] args) {
 StackUsingLinkedList stack = new StackUsingLinkedList();
 
 System.out.println("=== Stack Implementation Using Linked List ===\n");
 
 // Push elements
 stack.push(100);
 stack.push(200);
 stack.push(300);
 
 // Display stack
 stack.display();
 
 // Peek at top element
 stack.peek();
 
 // Pop element
 stack.pop();
 
 // Display stack after pop
 stack.display();
 
 // Additional operations
 System.out.println("\nAdditional Operations:");
 System.out.println("Is stack empty? " + stack.isEmpty());
 
 // Test more operations
 stack.push(400);
 stack.push(500);
 stack.display();
 
 // Clear stack
 stack.clear();
 stack.display();
 
 // Test underflow condition
 System.out.println("\nTesting underflow condition:");
 stack.pop();
 }
}

