import java.util.Scanner;
public class SumofDigits{
    public static void main(String [ ] args){
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}