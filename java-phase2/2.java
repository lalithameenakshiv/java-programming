1.//get the input for all data types and print the values
(byte,short,int,float,long,double,char,string)
  PROGRAM:
  import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      byte a = scan.nextByte();
      short b = scan.nextShort();
      int c = scan.nextInt(); 
      float d = scan.nextFloat();
      long e = scan.nextLong();
      double f = scan.nextDouble();
      String str1 = scan.next();
      scan.nextLine();//getting string input b/w some values
      String str2 = scan.nextLine();
      char ch = scan.next().charAt(0);

      System.out.println(a+""+b);
      System.out.println(c+""+d);
      System.out.println(e+""+f);
      System.out.println(str1+""+str2);
      System.out.println(ch);
      
    }
}
OUTPUT
  1030
8060.3
123456780.9
lalithahp
j

2.//Sum of digits
  PROGRAM
  import java.util.*;
   public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
    int a = scan.nextInt();
    int sum = 0;
    while(a>0){
      int r = a%10;
    sum=sum+r;
    a=a/10;
    
    }
      System.out.println(sum);
OUTPUT
  2

3.//reversal digit
PROGRAM
import java.util.*;
   public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
    int a = scan.nextInt();
    int rev = 0;
    while(a>0){
      int r = a%10;
    rev=rev*10+r;
    a=a/10;
    
    }
      System.out.println(rev);
      
    }
}
output
987

4.//palindrome or not
  
PROGRAM
  import java.util.*;
   public class Main {
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
    int a = scan.nextInt();
    int temp = a; 
    int rev = 0;
    while(a>0){
      int r = a%10;
    rev=rev*10+r;
    a=a/10;
    
    }
    if(rev==temp){
      System.out.println("palindrome");
    }
    else{
   System.out.println("not a palindrome");   
    }
      
      
    }
}



      
    }
}
OUTPUT
 not a palindrome 

