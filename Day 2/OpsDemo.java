public class OpsDemo{
public static void main(String[] args){
int a=10,b=5;
System.out.println("Arithmetic Operators");
System.out.println("--------------------");

System.out.println("Addition: "+(a+b));
System.out.println("Subtraction: "+(a-b));
System.out.println("Multiplication: "+(a*b));
System.out.println("Division: "+(a/b));
System.out.println("Modulus: "+(a%b));

System.out.println();
System.out.println("Relational Operators");
System.out.println("--------------------");
System.out.println("if a==b: "+(a==b));
System.out.println("if a!=b: "+(a!=b));
System.out.println("if a>b: "+(a>b));
System.out.println("if a<b: "+(a<b));
System.out.println("if a>=b: "+(a>=b));
System.out.println("if a<=b: "+(a<=b));

System.out.println();
System.out.println("Logical Operators");
System.out.println("--------------------");
System.out.println("Logical AND &&: "+(a<5 && b<10));
System.out.println("Logical OR ||: "+(a>5 || b<10));
System.out.println("Logical NOT !: "+!(a==b));

System.out.println();
System.out.println("Assignment Operators");
System.out.println("--------------------");
a +=20; //a = 30
a -=10; // a = 20 
a *=30; // a = 600
a /=50; // a = 12
a %=8; // a = 4
System.out.println("A: "+a);

System.out.println();
System.out.println("Unary Operators");
System.out.println("--------------------");
System.out.println("A: "+(-a));
a++; // post increment
++a; // pre increment
++a;
++a;
a++; // a=9
System.out.println("New value of A: "+(a));
int c;
c= ++a; // a++; c=a;
a++;
++a;
c=a++; // c=a; a++;
++a;
c=a; //c =14
System.out.println("C: "+c);

c= --a; // a=13; c=13
--a; //a=12
a--; //a=11
c= a--; //c=11; a=10
a++; //a=11
c=a++; //c=11; a=12
System.out.println("New C: "+c);

System.out.println();
System.out.println("Bitwisw Operators");
System.out.println("--------------------");
a=5; //00000101

//11111010 ---> 1's complement
//11111011 ---> 2's complement    
b=3;
System.out.println("a bitwise b(a&b): "+(a&b));
System.out.println("a bitwise b(a|b): "+(a|b));
System.out.println("a bitwise b(a^b): "+(a^b));
System.out.println("a leftshift by 1 bit(a<<1): "+(a<<1));
System.out.println("a rightshift by 1 bit(a>>1): "+(a>>1));
System.out.println("a 1's complement: "+(~a));
}
}

   



