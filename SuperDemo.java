class Base
{
    public int A;
    
    public Base()
    {
        System.out.println("Inside Base default constructor");
        this.A=11;
    }
    public Base(int i)
    {
        System.out.println("Inside Base parameterisred constructor");
        this.A=i;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }

}

class Derived extends Base  // class Derived : publuc Base
{   
    public int X;
    
    public Derived()
    {
        super(11);
        System.out.println("Inside Derived constructor");
        this.X=51;
        
    }
    public void gun()
    {
        System.out.println("Inside Derived gun");
        System.out.println("Value of A : "+super.A);  
        super.fun();
    }
}

class SuperDemo
{
    public static void main (String Arg[])
    {
        Derived dobj = new Derived();  // No casting
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        
        System.out.println(dobj.X);
       

    }
}