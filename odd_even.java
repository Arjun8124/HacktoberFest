import java.util.Scanner;
public class odd_even{
  public static void main(String[] args){
    Scanner read=new Scanner(System.in);
    int a=read.nextInt();
    if(a%2==0){
      System.out.println("The number is EVEN");
    }
    else{
      System.out.println("The number is ODD");
    }
  }
}  
    