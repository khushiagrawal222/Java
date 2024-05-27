import java.util.Scanner;
     public class power {
     public static void main( String [] args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int ans=1;
     //2^3
     //2*2*2
     for(int i=1; i<=b; i++){
        ans=ans*a;
     }
     System.out.println(ans);
     }
}