  //Armstrong program
package Mypackage;
import java.util.Scanner;
public class Armstrong {                            //sum of cubes of each digit equal to that number
    public static void main(String[] args){
        int n,rem,sum=0,temp;
      Scanner a=new Scanner(System.in);
      System.out.println("Enter a number");
       n=a.nextInt();
       temp=n;
       while(n>0){
           rem=n%10;
           sum=sum+(rem*rem*rem);
           n=n/10;
       }
       if(temp==sum){
           System.out.println("Given number is a Armstrongnumber");
           }
       else{
           System.out.println("Given number not a Armstrongnumber");
       }
    }
}
