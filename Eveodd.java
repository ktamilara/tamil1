import java.util.Scanner;
class Eveodd
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number");
        n = s.nextInt();
        if(n%2==0)
        {
            System.out.println("The given number "+n+" is even");
        }
        else 
        {
            System.out.println("The given number "+n+" is odd");
        }
        
    }
}
