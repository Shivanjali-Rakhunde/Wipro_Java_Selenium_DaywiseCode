public class BitwiseOp {
   public static void main(String[] args){
int a=5; // 00000101
int onescomplement = ~a; //11111010 
System.out.println("Value of a is: "+a);

//1's complement
System.out.println("a 1's complement: "+onescomplement);

//2's complement
int twoscomplement = onescomplement+1;
System.out.println("a 2's complement: "+twoscomplement);
   }
}

