import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int mid=(num/10)%10;
        if(mid%3==0){
            System.out.println("Trendy number");
        }
        else{
            System.out.println("Not a Trendy number");
        }
    }
}