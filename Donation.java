import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y>x)
            System.out.println(y-x);
    }
}