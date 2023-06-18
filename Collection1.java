import java.util.*;

class Collection1
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String,Integer>();

        hobj.put("C programming",990);

        hobj.put("C++ programming",990);

        hobj.put("Java programming",990);

        hobj.put("Python programming",990);

        System.out.println("Book price of java"+hobj.get("Java programming"));
        hobj.remove("C++ programming");

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }

    }
}