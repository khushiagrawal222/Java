import java.util.Scanner;
public class reverse{
    public static void main(String [ ] args){
        System.out.println("Enter number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //1234
        //0*10+4
        //4*10+3
        
        int ans=0;
        while(n>0){
            ans=ans*10+n%10;
            n=n/10;
        }
        System.out.println(ans);
    }
}