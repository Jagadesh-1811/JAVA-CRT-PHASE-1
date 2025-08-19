// If Statements


import java.util.Scanner;
class if_statement {
 public static void main(String[] args) {
 int age;
 System.out.println("Enter your age :");
 Scanner in = new Scanner(System.in);
 age = in.nextInt();
 if(age >= 18) {
 System.out.println("You are eligible for Vote");
 }
 }
}
//nested if 
public class NestedIf {

 public static void main(String[] args) {
 int x = 30;
 int y = 10;
 if (x > y) {
 System.out.println("x is greater than y");
 
 if (x > 20) {
 System.out.println("x is also greater than 20");
 } else {
 System.out.println("x is not greater than 20");
 }
 } else if (x < y) {
 System.out.println("x is less than y");
 } else {
 System.out.println("x is equal to y");
 }
 }
}
//Insurance Eligibility
import java.util.Scanner;
class Insurance {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the Marital status (M/U):");
 char Marital = in.next().charAt(0);
 
 if (Marital == 'u' || Marital == 'U') {
 System.out.println("Enter the Gender (M/F):");
 char Gender = in.next().charAt(0);
 System.out.println("Enter the Age:");
 int Age = in.nextInt();
 
 if ((Gender == 'M' || Gender == 'm') && Age >= 30) {
 System.out.println("You are Eligible for Insurance");
 } else if ((Gender == 'F' || Gender == 'f') && Age >= 25) {
 System.out.println("You are Eligible for Insurance");
 } else {
 System.out.println("You are not Eligible for insurance");
 }
 } else if (Marital == 'm' || Marital == 'M') {
 System.out.println("You are Eligible for Insurance");
 } else {
 System.out.println("Invalid Input");
 }

 }
}
//Switch case 
import java.util.Scanner;
class Calculator {
 public static void main(String[] args) {
 int ch, n1, n2;
 System.out.println("1.Addition");
 System.out.println("2.Subtraction");
 System.out.println("3.Multiplication");
 System.out.println("4.Division");
 System.out.println("Enter your choice : ");
 
 Scanner in = new Scanner(System.in);
 ch = in.nextInt();
 System.out.println("Enter two operands: ");
 n1 = in.nextInt();
 n2 = in.nextInt();
 
 switch (ch) {
 case 1:
 System.out.println("sum = " + (n1 + n2));
 break;
 case 2:
 System.out.println("sub = " + (n1 - n2));
 break;
 case 3:
 System.out.println("mul = " + (n1 * n2));
 break;
 case 4:
 System.out.println("division = " + (n1 / n2));
 break;
 default:
 System.out.println("Error! Select only from 1 to 4");
 }
 }
}
\\ vowel checker with switch case
class VowelChecker {
 public static void main(String args[]) {
 char ch = 'E';
 switch (ch) {
 case 'a':
 case 'e':
 case 'i':
 case 'o':
 case 'u':
 case 'A':
 case 'E':
 case 'I':
 case 'O':
 case 'U':
 System.out.println("It is a vowel");
 break;
 default:
 System.out.println("It is not a vowel");
 }
 }
}
//While Loop:
import java.util.Scanner;
class while_loop {
 public static void main(String[] args) {
 System.out.println("Enter the Limit :");
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 int i = 1;
 while(i <= n) {
 System.out.println(i);
 i++;
 }
 }
}
//do while 
import java.util.Scanner;
class do_while {
 public static void main(String[] args) {
 System.out.println("Enter the Limit :");
 Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 int i = 1;
 do {
 System.out.println(i);
 i++;
 } while(i <= n);
 }
}

// restaurant order management 
import java.util.Scanner;
class Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        char moreorders='Y';
        System.out.print("welcome to the ANDHRA SPICY RESTURANT");
        while (moreorders=='Y'||moreorders=='y'){
            System.out.print("\n1.CHICKKEN BRIYANI-₹250\n 2.CHICKEN65-₹150\n 3.MUTTON BRIYANI-₹350\n 4.BUTTER NAN(2p)-₹50\n 5.MUTTONKEEMA(CURRY)-₹200\n6.payment online\n");
            System.out.println("enter the choice");
            int choice=sc.nextInt();
            System.out.println("enter the quantity");
            int qty=sc.nextInt();
             int itemt=0;
                switch(choice){
                    case 1:itemt=250*qty;
                    System.out.println("Added: CHICKKEN BRIYANI x " + qty + " = ₹" + itemt);
                        break;
                    case 2:itemt=150*qty;
                    System.out.println("Added: x CHICKEN65" + qty + " = ₹" + itemt);
                        break;
                    case 3:itemt=350*qty;
                    System.out.println("Added: x MUTTON BRIYANI" + qty + " = ₹" + itemt);
                        break;
                    case 4:itemt=50*qty;
                    System.out.println("Added: x BUTTER NAN(2p)" + qty + " = ₹" + itemt);
                        break;
                    case 5:itemt=200*qty;
                    System.out.println("Added: x MUTTONKEEMA(CURRY)" + qty + " = ₹" + itemt);
                        break;
                    default:
                    System.out.println("invaild statement");
                        break;
                }
                if(itemt>0){
                    total+=itemt;
                }
                System.out.print("Do you want to order more? (Y/N): ");
                 System.out.println("Total Amount: ₹" + total);
                 System.out.println("Thank you for visiting!");
        
    }
}
import java.util.Scanner;
class Main {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int originalpwd=2004;
 for(int i=1;i<=3;i++){
 System.out.print("Enter your current password:");
 int currentpwd=sc.nextInt();
 if(originalpwd==currentpwd){
 int balance=0;
 while(true){
 System.out.println("welcome to SBI ATM");
 System.out.print(" 1) Check Balance\n 2) Deposit\n 3) WithDrawl\n 4) Exit\n ");
 System.out.print("Enter your choice :");
 int choice=sc.nextInt();
 switch(choice){
 case 1:
 System.out.println("your bank balance:" + balance);
 break;
 case 2:
 System.out.print("Deposit your amount :");
 float deposit=sc.nextFloat();
 balance+=deposit;
 break;
 case 3:
 System.out.print("Enter the withdrawal amount :");
 float withdrawl=sc.nextFloat();
 balance-=withdrawl;
 break;
 case 4:
 System.out.print("Thank you for choosing us visit again");
 break;
 default:
 System.out.print("Please enter the valid choice");
 
 }
 if(choice==4){
 break;
 }
 }
 break;
 }
 else{
 if(i != 3){
 System.out.println("You had entered wrong pwd "+ i+" attempt");
 }
 else{
 System.out.print("Timed out.You can try after 24hrs");
 }
 }
 }
 }
}

