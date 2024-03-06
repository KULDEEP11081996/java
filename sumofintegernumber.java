import java.util.*;
public class sumofintegernumber {
    public static void main(String[] args) {
        int sum=0;
        int num=0;
        Scanner sc=new Scanner(System.in);
        do{
            sum+=num;
            System.out.println("Enter the number:");
            num=sc.nextInt();
        }
        while(num>=0);
        System.out.println("sum="+sum);
        
    }
    
}
output
java -cp /tmp/GaW4vvjsfS sumofintegernumber
Enter the number:
48
Enter the number:
78
Enter the number:
96
Enter the number:
-4
sum=222

