import java.util.Scanner;
public class Pallnum {
    public static void main(String[] args){
        int num,rev=0,d,copy;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number");
        num=a.nextInt();
        copy=num;
        while(num!=0){
            d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        if(copy==rev){
           System.out.println("Given number is a pallindrome");
        }
        else{
           System.out.println("Given number is not a pallindrome");
        }
    }
  }
