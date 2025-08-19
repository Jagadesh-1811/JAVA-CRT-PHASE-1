//singly linked list 
public class linked {
// Define the node class
static class Node {
 int data;
 Node next;
 
 // Constructor to initialize a node
 Node(int data) {
 this.data = data;
 this.next = null;
 }
}
// Head of the linked list
private Node head;

// Constructor to initialize an empty list
public linked() {
 head = null;
}
// Function to insert a node at the beginning
public void insertAtBegin(int data) {
 // Create a new node
 Node newNode = new Node(data);
 
 // Link the new node to the current head
 newNode.next = head;
 
 // Update the head to point to the new node
 head = newNode;
}
// Function to display the linked list
public void displayList() {
 Node temp = this.head;
 System.out.print("Linked list: ");
 
 while (temp != null) {
 System.out.print(temp.data + " -> ");
 temp = temp.next;
 }
 System.out.println("NULL");
}
// Main method to test the linked list
public static void main(String[] args) {
 // Create a new linked list instance
 linked l = new linked();
 
 // Insert nodes at the beginning
 l.insertAtBegin(10);
 l.insertAtBegin(20);
 l.insertAtBegin(30);
 
 // Display the linked list
 l.displayList();
}
}
//Method to insert a node at the end
public void insertAtEnd(int data) {
 Node newNode = new Node(data);
 
 // If the list is empty, make the new node as head
 if (head == null) {
 head = newNode;
 return;
 }
 
 // Traverse to the last node
 Node temp = head;
 while (temp.next != null) {
 temp = temp.next;
 }
 
 // Link the new node to the last node
 temp.next = newNode;
}
// Method to insert a node at a specific position
public void insertAtPos(int data, int position) {
 // If position is 0, insert at the beginning
 if (position == 0) {
 newNode.next = head;
 head = newNode;
 return;
 }
 
 Node newNode = new Node(data);
 Node temp = head;
 
 // Traverse to the position before where we want to insert
 for (int i = 0; i < position - 1 && temp != null; i++) {
 temp = temp.next;
 }
 
 // If position is beyond the list length
 if (temp == null) {

 System.out.println("Position out of bounds. Inserting at the end.");
 insertAtEnd(data);
 return;
 }
 
 // Insert the new node
 newNode.next = temp.next;
 temp.next = newNode;
}
// Function to delete the first node
 public void deleteAtBegin() {
 if (head == null) {
 System.out.println("List is empty");
 return;
 }
 
 Node temp = head; // Store the current head
 head = temp.next; // Update the head to the next node
 System.out.println("Deleted " + temp.data + " from beginning");
 // Note: In Java, garbage collection automatically handles memory cleanup
 // No need to manually free memory like in C
 }
// Method to delete the last node
 public void deleteAtEnd() {
 if (head == null) {
 System.out.println("List is empty");
 return;
 }
 
 // If there's only one node
 if (head.next == null) {
 System.out.println("Deleted " + head.data + " from end");
 head = null;
 return;
 }
 
 // Traverse to the second last node
 Node temp = head;
 while (temp.next.next != null) {
 temp = temp.next;

 }
 
 System.out.println("Deleted " + temp.next.data + " from end");
 temp.next = null; // Remove the last node
 }
 
//Method to delete a node at specific position (0-indexed)
public void deleteAtPosition(int position) {
 if (head == null) {
 System.out.println("List is empty");
 return;
 }
 
 Node temp = head;
 
 // Traverse to the node before the position to be deleted
 for (int i = 0; i < position - 1 && temp != null; i++) {
 temp = temp.next;
 }
 
 // If position is beyond the list length
 if (temp == null || temp.next == null) {
 System.out.println("Position out of bounds");
 return;
 }
 
 Node nodeToDelete = temp.next;
 temp.next = nodeToDelete.next;
 System.out.println("Deleted " + nodeToDelete.data + " from position " + position);
}
//Programs for Doubly Linked List Operations
//1. Insert at the Beginning
class Node {
int data;
Node next;
Node prev;
// Constructor
public Node(int data) {
 this.data = data;
 this.next = null;
 this.prev = null;
}
}
//Doubly Linked List class
class DoublyLinkedList {
private Node head;
// Constructor to initialize empty list
public DoublyLinkedList() {
 this.head = null;
}
// Function to insert a node at the beginning
public void insertAtBegin(int data) {
 // Create a new node
 Node newNode = new Node(data);
 
 // Link the new node to the current head
 newNode.next = head;
 
 // If the list is not empty, update the previous pointer of the current head
 if (head != null) {
 head.prev = newNode;
 }
 
 // Update the head to point to the new node
 head = newNode;
}
// Function to display the list in forward direction
public void displayList() {
 Node temp = head;
 while (temp != null) {
 System.out.print(temp.data + " <-> ");
 temp = temp.next;
 }
 System.out.println("NULL");
}
}
public class linked{
public static void main(String[] args) {
 // Initialize an empty list
 DoublyLinkedList list = new DoublyLinkedList();
 
 // Insert nodes at the beginning
 list.insertAtBegin(10);
 list.insertAtBegin(20);
 list.insertAtBegin(30);
 
 // Display the linked list
 System.out.print("Doubly Linked List: ");
 list.displayList();
}
}// Function to insert a node at the end
 public void insertAtEnd(int data) {
 // Create a new node
 Node newNode = new Node(data);
 
 // If the list is empty, make the new node the head
 if (head == null) {
 head = newNode;
 return;
 }
 
 // Traverse to the last node
 Node temp = head;
 while (temp.next != null) {
 temp = temp.next;
 }
 
 // Link the new node to the last node
 temp.next = newNode;
 newNode.prev = temp;
 }
// Function to delete the first node
public void deleteAtBegin() {
 if (head == null) {
 System.out.println("List is empty!");
 return;
 }
 
 // Store the current head in a temporary variable
 Node temp = head;
 
 // Update the head to point to the next node
 head = temp.next;
 
 // If the list is not empty, update the previous pointer of the new head
 if (head != null) {

 head.prev = null;
 }
 
 // Java's garbage collector will handle memory deallocation
 temp = null;
 }
// Function to delete the last node
 public void deleteAtEnd() {
 if (head == null) {
 System.out.println("List is empty!");
 return;
 }
 
 // Traverse to the last node
 Node temp = head;
 while (temp.next != null) {
 temp = temp.next;
 }
 
 // If the list has only one node, set the head to null
 if (temp.prev == null) {
 head = null;
 } else {
 // Unlink the last node
 temp.prev.next = null;
 }
 
 // Java's garbage collector will handle memory deallocation
 temp = null;
 }
