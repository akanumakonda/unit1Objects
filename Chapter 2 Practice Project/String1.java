
public class String1
{
    public static void main(String[] args)
    {
        String greeting = "Hello, World";
        int n = greeting.length();
        
        System.out.println( "length of string: " + n);
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        /* Upper case method does not change river, it just makes a new string which is then assigned to another variable*/
        System.out.println( "river: " + river + " bigRiver: "+ bigRiver );
        
    }
}
/* can cocatenate other types of things with strings, and the value will be converted to a string
 */

