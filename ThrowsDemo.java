class ThrowsDemo
{
    public float Division(int No1,int No2) throws ArithmeticException
    {
        return No1/No2;
    }
}
class ThrowsDemo
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        float ret = 0.0f;
        try
        {
            ret obj.Division(11,0);
        }

        System.out.println(ret);
    }
}
