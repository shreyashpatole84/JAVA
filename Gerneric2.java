class Generic2
{
    public static void main(String Arg[])
    {
        Integer A[] = {10,20,30,40};
        Float B[] = {50.10f,60.20f,70.30f};
        Double c[] ={50.45,60.45,70.45};
        Display(A);
        Display(B);
        Display(c);
    }
    public static <T>void Display(T Arg[])
    {
        for( T no : Arr)
        {
            System.out.println(no);
        }
    }
    
}