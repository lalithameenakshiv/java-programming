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

5.// samll to caps
PROGRAM
  import java.util.*;

public class Main {
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      char ch = scan.next().charAt(0);
      if(ch>='A' && ch<='Z'){
        System.out.println((char)(ch+32));
      }
      else if(ch>='a' && ch<='z'){
        System.out.println((char)(ch-32));
    }
    else{
      System.out.println(ch); 
    }
      }
     
    
}

OUTPUT
  S
//6.leap year
  PROGRAM
  import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int year = scan.nextInt();
      if((year%4==0 && year %100!=0)||year%400==0){
       System.out.println("leap year"); 
      }
      else{
        System.out.println("not a leap year");
      }
    }
}

OUTPUT
  not a leap year

//7.Factor numbers
PROGRAM
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int factor = scan.nextInt();
      for(int i =1;i<=10;i++){
        if(factor % i == 0){
          System.out.println(i + "");
        }
      }
    }
 }  
OUTPUT
1
2
3
4
5
6
10

//8.count
PROGRAM
 import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int count = 0;
      for(int i =2;i<=num/2;i++){
        if(num % i == 0){
          count++;
        }
      }
      System.out.println(count+2);
    }
 }
OUTPUT
  12

//9.prime or not
PROGRAM
  import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int count = 0;
      for(int i =2;i<=num/2;i++){
        if(num % i == 0){
          count++;
        
        }
      }
        if(count==2){
         System.out.println("prime"); 
        }
        else{
          System.out.println("not prime");
        }
        
    }
 }
OUTPUT
 not prime 

//10.finding factorial
PROGRAM
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int mul = 1;

        for (int i = 1; i <= num; i++) {
            mul = mul * i;
        }

        System.out.println(mul);
    }
}
OUTPUT
  720

//11.fibonaaci series
PROGRAM
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
           int a = 0, b = 1, c;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
OUTPUT
 Enter number of terms: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765

//12.base power
PROGRAM
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;

        for(int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}
OUTPUT
1679616

//13.
      
       
