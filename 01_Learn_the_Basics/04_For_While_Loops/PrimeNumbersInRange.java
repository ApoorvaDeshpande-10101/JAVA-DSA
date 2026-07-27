import java.util.Scanner;
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no. in range:");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd no. in range:");
        int n2 = sc.nextInt();

        for(int i=n1;i<=n2;i++){

            if(i<2)
                continue;
            
            boolean flag=false;

            for(int j=2;j<i;j++){
                if(i % j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
