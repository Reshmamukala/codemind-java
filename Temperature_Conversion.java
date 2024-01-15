import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float f=sc.nextInt();
        float c;
        c=32+(f*9/5);
        System.out.printf("%.2f",c);
    }
}