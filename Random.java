import java.util.*;
class Number
{
    public static void main(String args[])
    {
        int i;
        Random random = new Random();
        Scanner s=new Scanner(System.in);
        int x=random.nextInt(1000);
        System.out.println("enter number of attempts");
        int n=s.nextInt();
        System.out.println("Let's begin the Game !");

        for(i=0;i<n;i++){
         System.out.println("enter a number between 0 to 1000");
        int num=s.nextInt();
        if(num==x)
        {
           System.out.println("Yay ! You guessed the right number and it is "+x+""); 
           break;
        }
        else if(num<x && i!=n)
        {
            System.out.println("Oops! Wrong Answer !!, The number is greater than " +num+ "");
            
        }
        else if(num>x  && i!=n)
        {
            System.out.println("Oops! Wrong Answer!! , The number is smaller than "+num+"");
        }
        }
        if(i==n)
        System.out.println("Yours trails are over !!");
        System.out.println("The correct number is , "+x+ "");

    }
}