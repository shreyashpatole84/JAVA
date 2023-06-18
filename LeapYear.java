import java.util.*;
class LeapYear
{
     public static void main(String Arg[])
    {
    Scanner sobj = new Scanner(System.in);
    System.out.println("enter the year");
    int year = sobj.nextInt();
    if ((year%4)==0)
    {
        System.out.println("Year is leap year");
    }
    else
    {
        System.out.println("Year is not leap year");
    }
    
}
}