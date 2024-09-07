import java.util.*;
public class linearSearch
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        System.out.println("Enter a value to be searched: ");
        int num = sc.nextInt();
        int k=0;
        for(int i = 0;i<5;i++){
            if(num==a[i])
            k=1;
        }
        if(k==1)
            System.out.println("The number is present.");
        else
            System.out.println("The number is not present.");
    }
}
