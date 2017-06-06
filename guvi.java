    import java.util.Scanner;
    public class Postive_Negative
    {
        public static void main(String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            n = s.nextInt();
            n=n%2;
            if(n == 0)
            {
                System.out.println("The given number "+n+" is even");
            }
            else if(n !=0)
            {
                System.out.println("The given number "+n+" is odd");
            }
            else
            {
                System.out.println("The given number "+n+" is neither even nor odd");
            }
        }
    }
