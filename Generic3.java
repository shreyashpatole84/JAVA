class Generic3
{
    public static void main(String Arg[])
    {
       Demo <Integer> obj1 = new Demo<Integer>();
       obj1.Accept(11);
       obj1.Display();

       Demo <Double> obj2 = new Demo<Double>();
       obj2.Accept(10.56);
       obj2java.Display();    }
}

class Demo <T>
    {
        public T value;

        public void Accept(T no)
        {
            value = no;
        }
        public void Display()
        {
            System.out.println(value);
        }
    }
    
