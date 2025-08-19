//TYPE CASTING IN JAVA
class casting { 
    public static void main(String[] args) { 
        int a = 10; 
        double b = a; 
        System.out.println("Int  :" + a); 
        System.out.println("Double  :" + b); 
    } 
}

//Double to Integer (Narrowing) 
class casting { 
    public static void main(String[] args) { 
        double d = 25.5385; 
        int c = (int)d; 
        System.out.println("Double  :" + d); 
        System.out.println("Int  :" + c); 
    } 
}
//Arithmetic Operators 
class add { 
    public static void main(String[] args) { 
        int a = 123, b = 10; 
        System.out.println("Addition : " + (a + b)); 
        System.out.println("Subtraction  : " + (a - b)); 
        System.out.println("Multiplication  : " + (a * b)); 

 
        System.out.println("Division : " + (a / b)); 
        System.out.println("Modulo : " + (a % b)); 
    } 
} 
//assignment opertors
class Assignment { 
    public static void main(String[] args) { 
        int a = 123; 
        System.out.println(a);    // 123 
        a += 10; 
        System.out.println(a);    // 133 
        a -= 10; 
        System.out.println(a);    // 123 
        a *= 10; 
        System.out.println(a);    // 1230 
        a /= 10; 
        System.out.println(a);    // 123 
        a %= 10; 
        System.out.println(a);    // 3 

 
    } 
} 

//reational opertors
class relational { 
    public static void main(String[] args) { 
        int a = 110, b = 109; 
        System.out.println("Equal to :" + (a == b)); 
        System.out.println("Not equal :" + (a != b)); 
        System.out.println("Greater than :" + (a > b)); 
        System.out.println("Less than :" + (a < b)); 
        System.out.println("Greater than or equal :" + (a >= b)); 
        System.out.println("Less than or equal :" + (a <= b)); 
    } 
} 
//conditional operators
class conditional { 
    public static void main(String args[]) { 
        int a = 45, b = 35, c; 
        c = a > b ? a : b; 
        System.out.println("The Greatest Number is :" + c); 
    } 
} 

//Bitwise operators
class Bitwise { 
    public static void main(String[] args) { 
        int a = 10, b = 2; 
        System.out.println("Bitwise AND & :" + (a & b)); 
        System.out.println("Bitwise OR | :" + (a | b)); 
        System.out.println("Bitwise XOR ^ :" + (a ^ b)); 
        System.out.println("Complement ~ :" + (~a)); 
        System.out.println("Right shift >> :" + (a >> b)); 
        System.out.println("Left shift << :" + (a << b)); 
    } 
}