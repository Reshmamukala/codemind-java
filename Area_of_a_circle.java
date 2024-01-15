import java.util.Scanner;
public class num
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        double pie=3.14;
        double area;
        area=pie*n*n;
        System.out.printf("%.2f",area);
    }
}