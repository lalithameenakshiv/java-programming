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

//13.arr
 import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int arr[]= new int [size];
      for(int i =0;i<size;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<size;i++){
        System.out.print(arr[i]+"");
      }
      
    }
} 
//14.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int product = 1;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Product of array elements = " + product);
    }
}
//15.odd even
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
    }
}
//16.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        int evenSum = 0;
        int oddSum = 0;

       
        arr[0] = sc.nextInt();
        int max = arr[0];

        if(arr[0] % 2 == 0) {
            evenSum += arr[0];
        } else {
            oddSum += arr[0];
        }

       
        for(int i = 1; i < size; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }

            
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Maximum Element = " + max);
    }
}

//17
public class Main {
    public static void main(String[] args) {
        
        int[] arr = {10, 25, 5, 80, 30};
        
        int max = arr[0];   
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Maximum number is: " + max);
    }
}

//18
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();   
        int arr[] = new int[size]; 
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 1; i < size; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
//19 2d
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rsize = sc.nextInt();
        int csize = sc.nextInt();

        int arr[][] = new int[rsize][csize];

        
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 //20 add corner elements
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rsize = sc.nextInt();
        int csize = sc.nextInt();
        int arr[][] = new int[rsize][csize];

        
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                if(i == 0 || j == 0 || i == rsize-1 || j == csize-1){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}

//21 Diagonal elements left
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int rsize = sc.nextInt();
        int csize = sc.nextInt();

        int arr[][] = new int[rsize][csize];

        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}

//22.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rsize = sc.nextInt();
        int csize = sc.nextInt();

        if (rsize != csize) {
            System.out.println("Please enter a square matrix!");
            return;
        }

        int size = rsize;
        int arr[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];           // main diagonal
            sum += arr[i][size - 1 - i]; // secondary diagonal
        }

        // Avoid double-counting the center element for odd-sized matrices
        if (size % 2 != 0) {
            sum -= arr[size / 2][size / 2];
        }

        System.out.println(sum);
    }
}

//23linera seacrh
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int search = sc.nextInt();
      boolean indicate = false;
      for(int i=0;i<n;i++){
        if(arr[i]==search){
          indicate = true;
           System.out.println(i+1 +" position");
           break;
        }
      }
      if(indicate==false){
         System.out.println("no data present");
      
      }
    }
}

//24 binary search
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];   
        
        for(int i = 0; i < n; i++){   
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);   
        
        int search = sc.nextInt();
        int start = 0, end = n - 1;
        boolean f = false;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(arr[mid] == search){
                System.out.println(mid + " present");
                f = true;
                break;
            }
            else if(search > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        
        if(f == false){
            System.out.println("no data");
        }
    }
}

//24 bubble sort
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];   
        
        for(int i = 0; i < n; i++){   
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}

25.selection sort
  import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];   
        
        for(int i = 0; i < n; i++){   
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
          int minindex=i;
          for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minindex]){
              minindex=j;
            }
          }
          int temp = arr[i];
          arr[i]=arr[minindex];
          arr[minindex]=temp;
        }
        System.out.println(Arrays.toString(arr));
}
}

//26. even odd max
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];   
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int evenmax = Integer.MIN_VALUE;
        int oddmax = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                if(arr[i] > evenmax){
                    evenmax = arr[i];
                }
            }
            else{
                if(arr[i] > oddmax){
                    oddmax = arr[i];
                }
            }
        }
        System.out.println("Maximum Even: " + evenmax);
        System.out.println("Maximum Odd: " + oddmax);
    }
}
//27.methods with arg with return type
import java.util.*;
public class Main {
    
      public static boolean prime(int a){
        int count=0;
        for(int i=1;i<a;i++){
          if(a%i==0){
            count++;
          }
        }
        if(count==2){
          return true;
        }
        else{
          return false;
        }
      }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        System.out.println(prime(num));
        System.out.println(prime(num1));
      }
}
//28 with arg without return type
  import java.util.*;
public class Main {
    
      public void prime(int a){
        int count=0;
        for(int i=1;i<a;i++){
          if(a%i==0){
            count++;
          }
        }
        if(count==2){
          System.out.println(true);
        }
        else{
          System.out.println(false);
        }
      }
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        Main m = new Main();
        m.prime(num);
        m.prime(num1);
      }
}
//29.without arg with retuen type
import java.util.*;
public class Main{
    public static boolean prime(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
          return false;
        }
    }
	public static void main(String[] args) {
	   System.out.println(prime());
	   System.out.println(prime());
	  
	}
}

//30.
import java.util.*;
public class Main{
    public static boolean prime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
        return false;
        }
    }
    
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int r = n%10;
            rev = rev * 10 + r;
            n= n/10;
        }
        return rev;
    }
    
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 int num = sc.nextInt();
	 if(prime(num)==true){
	     int rev = reverse(num);
	     if(prime(rev)==true){
	         System.out.println("Twisted");
	     }
	     else{
	          System.out.println("not Twisted");
	     }
	 }
	 else{
	          System.out.println("not prime");
	     }
	 }
	
	}
//31 initialization
class Student {
    int reg;
    String name;

    void assign(int r, String n) {
        reg = r;
        name = n;
    }

    void print() {
        System.out.println(reg + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student m1 = new Student();
        m1.assign(101, "arun");

        Student m2 = new Student();
        m2.assign(102, "karthick");

        m1.print();
        m2.print();
    }
}
//32.hw do
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double units = sc.nextDouble();
        double bill = 0;

        if (units <= 50) {
            bill = units * 1;
        } 
        else if (units <= 150) {
            bill = (50 * 1) + (units - 50) * 2;
        } 
        else if (units <= 250) {
            bill = (50 * 1) + (100 * 2) + (units - 150) * 3;
        } 
        else {
            bill = (50 * 1) + (100 * 2) + (100 * 3) + (units - 250) * 4;
        }

        // Add 20% surcharge if bill > 150
        if (bill > 150) {
            bill = bill + (bill * 0.20);
        }

        // Round to nearest integer
        System.out.println(Math.round(bill));
    }
}
//33
class node{
  int data;
  node next;
}
public class main{
  public static void main(String[] args){
    node n1 = new node();
    n1.data=10;
    node n2 = new node();
    n2.data=20;
    n1.next=n2;
    node n3 = new node();
    n3.data = 30;
    n2.next= n3;
    System.out.println(n1.data+" "+n2.data+" "+n3.data);
     System.out.println(n1.data+" "+n1.next.data+" "+n1.next.next.data);
    
  
  }
}
//34 singly linked list
class node{
  int data;
  node next;
  node(int d){
    data=d;
    next=null;
  }
}
class singlylinkedlist{
  node head = null;
  node tail = null;
  void add(int data){
    node newnode = new node(data);
    if(head==null){
      head=tail=newnode;
    }
    else{
      tail.next=newnode;
      tail=newnode;
    }
  }
  void display(){
    node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }
}
public class main{
 public static void main (String[] args) {
  singlylinkedlist s = new singlylinkedlist();
  s.add(100);
  s.display();
  s.add(200);
  s.display();
  s.add(300);
  s.display();
}
}
//35.
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SinglyLinkedList {
    int size = 0;
    Node head = null;
    Node tail = null;

    // Add at end
    void add(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    // Add at beginning
    void addAtBeg(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    // Add at specific position
    void addAtPos(int data, int pos) {

        if (pos <= 0 || pos > size + 1) {
            System.out.println("Please enter a valid position");
            return;
        }

        if (pos == 1) {
            addAtBeg(data);
            return;
        }

        if (pos == size + 1) {
            add(data);
            return;
        }

        Node newnode = new Node(data);
        size++;

        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList s = new SinglyLinkedList();

        s.add(100);
        s.add(200);
        s.add(300);

        s.addAtBeg(400);
        s.display();

        s.addAtPos(500, 3);
        s.display();

        s.addAtPos(600, 1);
        s.display();

        s.addAtPos(700, 2);
        s.display();

        System.out.println("Size of list: " + s.size);
    }
}
//36
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
		data=d;
		next=null;
	}
}
class singlylinkedlist {
	int size=0;
	Node head=null;
	Node tail=null;
	void add(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
	}

	void addatbeg(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
		}
	}

	void addatpos(int data,int pos) {
		if(pos<=0 || pos>size+1) {
			System.out.println("please enter a valid pos");
			return;
		}
		if(pos==1) {
			addatbeg(data);
			return;
		}
		if(pos==size+1) {
			add(data);
			return;
		}
		Node newnode = new Node(data);
		if(head==null) {
			head=tail=newnode;
		}
		else {
			Node temp=head;
			for(int i=1; i<pos-1; i++) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
			size++;

		}
	}
	
	
	
	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		singlylinkedlist s  = new singlylinkedlist();
		boolean a= true;
	
	    while(a){
	   System.out.println("Enter 1- beg , 2-at pos 3-last 4-display 0-exit");
	        int val = sc.nextInt();
	        switch(val){
	            case 0 :
	                a=false;
	                break;
	            case 1:
	                s.addatbeg(sc.nextInt());
	                break;
	           case 2:
	               System.out.println("Enter data,position");
	               s.addatpos(sc.nextInt(),sc.nextInt());
	               break;
	           case 3 :
	               s.add(sc.nextInt());
	               break;
	           default:
	           s.display();
	        }     
	    }

	}
}
//37
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int d) {
		data=d;
		next=null;
	}
}
class singlylinkedlist {
	int size=0;
	Node head=null;
	Node tail=null;
	void add(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=newnode;
		}
	}

	void deleteatlast() {
		if(head==null) {
			System.out.println("No element to delete");
			return;
		}
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		tail=temp;
		tail.next=null;
		size--;

	}

	void deleteatbeg() {
		if(head==null) {
			System.out.println("No element to delete");
			return;
		}
		head = head.next;
		size--;
	}

	void deleteatpos(int pos) {
		if(pos<=0 || pos>size) {
			System.out.println("please enter a valid pos");
			return;
		}
		if(pos==1) {
			deleteatbeg();
			return;
		}
		if(pos==size) {
			deleteatlast();
			return;
		}

		Node temp = head;
		for(int i=1; i<pos-1; i++) {
			temp=temp.next;
		}
		Node temp1=temp.next;
		temp.next = temp1.next;
		size--;

	}



	void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		singlylinkedlist s  = new singlylinkedlist();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.display();
		s.deleteatlast();
		s.display();
		s.deleteatbeg();
		s.display();
		s.deleteatpos(9);
		s.display();

	}
}
//38
class Node{
    Node prev;
    int data;
    Node next;
    
    Node(int data){
        prev=null;
        this.data=data;
        next=null;
    }
}
class Doublylinkedlist{
    Node head=null;
    Node tail=null;
    int size=0;
    
    void addatlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=tail=newnode;
        }
        else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
    }
    
	void display() {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		System.out.println();
	}
    
    
}

public class Main
{
	public static void main(String[] args) {
	Doublylinkedlist d = new Doublylinkedlist();
	d.addatlast(100);
	d.addatlast(200);
	d.addatlast(300);
	d.addatlast(400);
	d.display();
	
	}
}

//39
import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}

}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}

	void deleteatlast() {
		if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}

		if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
		size--;
	}
	void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(30);
		d.addatlast(40);
		d.display();
		d.deleteatlast();
		d.display();
		d.deleteatlast();
		d.display();
	}
}


//40
import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}

}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}
	
		void deleteatlast() {
		if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}

		if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
		size--;
	}
	
	 void deleteatbeg(){
        	if(head==null) {
			System.out.println("There is no element to delete");
			return;
		}
			if(head==tail) {
			head=tail=null;
			System.out.println("All data deleted");
		}
		else{
		    head=head.next;
		    head.prev=null;
		}
		size--;
    }
    
	void deleteatpos(int pos){
	    if(pos<=0 || pos>size){
	        System.out.println("Invalid pos");
	        return;
	    }
	    if(pos==1){
	        deleteatbeg();
	        return;
	    }
	    if(pos==size){
	       deleteatlast();
	        return;
	    }
	    Node temp=head;
	    for(int i=1;i<pos-1;i++){
	        temp=temp.next;
	    }
	    Node temp1=temp.next;
	    temp.next=temp1.next;
	    temp.next.prev=temp;
	    size--;
	}

   

	void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(10);
		d.addatlast(20);
		d.addatlast(30);
		d.addatlast(40);
		d.display();
		d.deleteatpos(3);
		d.deleteatpos(2);
		d.display();
	}
}

//41
import java.util.*;
class Node {
	int data;
	Node prev;
	Node next;
	Node(int data) {
		this.data = data;
		prev=null;
		next=null;
	}
}

class Doublylinkedlist {
	Node head=null;
	Node tail=null;
	int size=0;

	void addatlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(head==null) {
			head=tail=newnode;
		}
		else {
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}

	}

	void search(int d) {
		if(head==null) {
			System.out.println("There is no data to search");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==d) {
				System.out.println("Data found");
				return;
			}
			temp=temp.next;
		}
		System.out.println("There is no data");
	}
	void updation(int pos,int d) {
		if(pos<=0 || pos>size) {
			System.out.println("Invalid pos");
			return;
		}
		if(pos==1) {
			head.data=d;
			return;
		}
		if(pos==size) {
			tail.data=d;
			return;
		}
		Node temp = head;
		for(int i=1; i<pos; i++) {
			temp=temp.next;
		}
		temp.data=d;

	}
	
		void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("There is no element to print");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
}
public class Main {
	public static void main(String[] args) {
		Doublylinkedlist d = new Doublylinkedlist();
		d.addatlast(10);
		d.addatlast(20);
		d.addatlast(30);
		d.addatlast(40);
// 		d.search(90);
		d.updation(2,200);
		d.display();
	}
}

//42
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Circularsinglylinkedlist {
    Node head = null;
    Node tail = null;
    int size = 0;

    // Add at last
    void addatlast(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            tail.next = head;
        } else {
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }

    // Add at beginning
    void addatbeg(int data) {
        Node newnode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newnode;
            tail.next = head;
        } else {
            newnode.next = head;
            head = newnode;
            tail.next = head;
        }
    }

    // Delete last
    void deleteatlast() {
        if (head == null) {
            System.out.println("No element to delete");
            return;
        }

        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = head;
        size--;
    }

    // Display
    void display() {
        if (head == null) {
            System.out.println("There is no element to print");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Circularsinglylinkedlist c = new Circularsinglylinkedlist();

        c.addatlast(10);
        c.addatlast(20);
        c.addatlast(30);
        c.addatbeg(40);

        c.display();
    }
}




                                  














