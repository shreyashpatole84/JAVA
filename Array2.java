
class Array2
{
    public static void main(String Arg[])
    {
        int Arr[][] = new int[3][4];
        /*
        Arr is 2 dimensional array 
        which contains 3 one dimentional array
        each one dimentional array contains 4 elements
        each element is of type integer
         */
        Arr[0][0]=10;
        Arr[0][2]=20;
        Arr[0][3]=30;
        Arr[0][4]=40;

        Arr[1][0]=50;
        Arr[1][2]=60;
        Arr[1][3]=70;
        Arr[1][4]=80;

        Arr[2][0]=90;
        Arr[2][2]=100;
        Arr[2][3]=110;
        Arr[2][4]=120;

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);
        System.out.println(Arr[1].length);
        System.out.println(Arr[2].length);
    }
}