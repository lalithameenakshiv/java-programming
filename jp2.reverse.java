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

