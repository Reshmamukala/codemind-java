import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=18)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}