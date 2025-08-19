//class & object in java 
class Rectangle
{
int length,width;
void getDetails(int x,int y){ 
length = x;
width = y;
}
int area(){
int a = length * width; 
return a;
}
2
}
class class_object{
public static void main(String [] args){ 
Rectangle o1 = new Rectangle(); 
o1.length = 10;
o1.width = 20;
System.out.println("Area of Rectangle :"+o1.area());
Rectangle o2 = new Rectangle(); 
o2.getDetails(20,30);
System.out.println("Area of Rectangle :"+o2.area());
} }
//Data Hiding Getter and Setter in java 
class ShapeRectangle
{
3
private int length,width;
int area(){
int a = length * width; 
return a;
}
}
class class_object {
public static void main(String[] args) { 
ShapeRectangle o1 = new ShapeRectangle(); 
o1.length = 10;
o1.width = 20;
System.out.println("Area of Rectangle :" + o1.area());
}
}
//Data Hiding Getter and Setter in java(in private) 
class ShapeRectangle
{
private int length,width;
//Getter Method 
int getLength() { 
return length;
4
}
int getWidth() { 
return width;
}
//Setter Method 
void setLength(int l){
if(l > 0) 
length = l; 
else
length = 0;
}
void setWidth(int w){ 
if(w > 0)
width = w; 
else
width = 0;
}
int area(){
int a = length * width; 
return a;
}
}
class get_set{
public static void main(String [] args){ 
ShapeRectangle o1 = new ShapeRectangle(); 
o1.setLength(-10);
5
o1.setWidth(20);
System.out.println("Length :"+ o1.getLength()); 
System.out.println("Width :"+ o1.getWidth()); 
System.out.println("Area of Rectangle :"+ o1.area());
}
}
//Constructor in java 
class RectangleShape{ 
int length , width;
RectangleShape() { 
System.out.println("Constructor Called"); 
length = 2;
width = 10;
}
int area() {
int a = length * width ; 
return a;
}
}
6
class constructor {
public static void main(String[] args) { 
RectangleShape o1 = new RectangleShape();
System.out.println("Area of Rectangle : "+ o1.area());
}
}
//Parameterized Constructor & Constructor Overloading 
class Box
{
float length , breadth; 
public Box(){ //Default
length = 2;
breadth = 5;
}
public Box(float x,float y) // Parameterized
{
7
length = x; 
breadth = y;
}
Box(float x)
{
length = breadth = x;
}
float area(){
return length+breadth;
}
}
class Constructor_Overloading {
public static void main(String[] args) { 
Box o = new Box(); 
System.out.println("Area : "+ o.area());
Box o1 = new Box(3,6); 
System.out.println("Area : "+ o1.area());
Box o2 = new Box(3); 
System.out.println("Area : "+ o2.area());
}
}
////Array of object 
class Student
{
public int roll_no; 
public String name;
Student(int roll_no,String name)
{
this.roll_no = roll_no; 
this.name = name;
}
void print()
{
System.out.println("Name : "+name); 
System.out.println("Roll No : "+roll_no); 
System.out.println("..............................");
}
}
class array_objects {
9
public static void main(String[] args) {
Student o = new Student(525111,"Narayana"); 
o.print();
Student o1 = new Student(525621,"Subbu"); 
o1.print();
}
}
*/
/*
//Array of object 
class Student
{
public int roll_no; 
public String name;
Student(int roll_no,String name)
{
this.roll_no = roll_no; 
this.name = name;
}
void print()
{
System.out.println("Name : "+name); 
System.out.println("Roll No : "+roll_no);

System.out.println("..............................");
}
}
class array_objects {
public static void main(String[] args) { 
Student[] o;
o = new Student[5];
o[0] = new Student(10,"Rarayana"); 
o[1] = new Student(11,"Hare_Ram"); 
o[2] = new Student(12,"Raman"); 
o[3] = new Student(13,"Subbu"); 
o[4] = new Student(14,"Kovidha"); 
for (int i=0 ;i< o.length; i++)
o[i].print();
}
//Single Inheritance in java
//Example (son can access father asserts) 
class Father {

public void house() {
System.out.println("Have Own 2BHK House.");
}
}
class Son extends Father
{
public void car()
{
System.out.println("Have Own Audi car.");
}
}
class single_inheritance {
public static void main(String[] args) { 
Son o = new Son();
o.car();
o.house();
}
}//Multilevel Inheritance in java
//Example (Son can access father and Grandfather assert also ) 
class GrandFather {
public void house() { 
System.out.println("3 BHK House.");
}
}
class Father extends GrandFather { 
public void land() {
System.out.println("5 Arcs of Land.");
}
}
class Son extends Father { 
public void Car() {
System.out.println("Own Audi car.");
}
}
class multilevel {
public static void main(String[] args) { 
Son o = new Son();
o.Car();
o.house();
o.land();
}
}
abstract class shape{ 
abstract void draw(); 
void message(){
System.out.println("Message from Shape");
}
}
class rectangleshape extends shape
{
void draw(){
System.out.println("Draw Rectangle using length & Breadth");
}
}
class abstractDemo {
public static void main(String [] args){ 
rectangleshape o = new rectangleshape(); 
o.draw();
o.message();
}
}
//Example for Abstract class
abstract class Mobile{ 
void VoiceCall(){
System.out.println("You can Make Voice Call");
}
abstract void camera(); 
abstract void touchDisplay();
}
class samsung extends Mobile { 
void camera() {
System.out.println("64 Mega pixel Camera");
}
void touchDisplay() { 
System.out.println("5.5 inch Display");
}
void fingerPrint() {
System.out.println("In the Display fast finger sensor");
}

}
class Nokia extends Mobile
{
void camera(){
System.out.println("2 Mega pixel Camera");
}
void touchDisplay(){ 
System.out.println("4.8 inch Display");
}
}
class abstractDemo2 {
public static void main (String args[]){ 
samsung M32 = new samsung(); 
M32.VoiceCall(); 
M32.touchDisplay();
M32.camera(); 
M32.fingerPrint();
System.out.println("...............................");
Nokia N1 = new Nokia(); 
N1.VoiceCall(); 
N1.touchDisplay(); 
N1.camera();
}
}
interface Animal{
void sound(); 
void sleep();
}
class Dog implements Animal{
@Override
public void sound() {
System.out.println("The Dog sounds like : Woof");
19
}
@Override
public void sleep() { 
System.out.println("Dog sleeping");
}
}
class interfaceDemo {
public static void main(String [] args){ 
Dog o = new Dog();
o.sound();
o.sleep();
}
}
//Interface problems2
class Phone{
void voicecall(){ 
System.out.println("Make Voicecalls");
20
}
void sms(){
System.out.println("We can send sms");
}
}
interface Camera{ 
void click(); 
void record();
}
interface Player{ 
void play(); 
void pause(); 
void stop();
}
class Smartphone extends Phone implements Camera,Player
{
public void click(){
System.out.println("You Can make multiple click");
}
public void record(){
System.out.println("You can record Videos");
}
public void play(){ 
System.out.println("Play the songs");
}
public void pause(){
21
System.out.println("Pause the songs");
}
public void stop(){
System.out.println("you have options to stop the song");
}
}
class interfaceDemo2 {
public static void main(String [] args){ 
Smartphone o = new Smartphone(); 
o.voicecall();
o.sms();
o.click();
o.record();
o.play();
o.pause();
o.stop();
}
}
