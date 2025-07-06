package strings;

import java.util.StringTokenizer;

public class StringBasics {
    public static void main(String[] args) {

        /*
         * STRING ARE IMMUTABLE !! - always creating a new object, only the references are updated
         * String Literal
         * Static memory - String Pool (inside Heap Memory)
         * strLit in stack refering to String Pool obj
        */

        String strLit = "Saurabh";
        strLit.concat("Singh"); // did not assign the result to any variable
        System.out.println(strLit); // prints only "Saurabh" as we did not update the reference

        /*
         * Using 'new' keyword
         * Heap Memory
         * str in stack refering to Heap Memory obj
        */

        String str = new String("Sonali");
        System.out.println(str);

        String lit = "Hello";
        String lit2 = new String("Hello");
        System.out.println(lit == lit2); // lit is pointing to string pool; lit2 is pointing to heap;
        System.out.println(lit.equals(lit2)); // eqauls compares the value in both memories "Hello" which is same
        String lit3 = "Hello";
        System.out.println(lit == lit3); // points to same obj in string pool
        System.out.println(lit.equals(lit3)); // values are same
        String lit4 = new String("Hello");
        System.out.println(lit2 == lit4); // points to different obj in heap memory
        System.out.println(lit2.equals(lit4)); // values are same

        /*
         * A = 65; Z = 90
         * a = 97; z = 122
         * 0 = 48; 9 = 57
         * rest are special characters
         * 
         * ASCII RELATION TRICKS
         * 'a' - 'A' = 32 > 'A' + 32 = 'a'
        */

        byte[] ascii = {65, 75, 90};
        String byteToStr = new String(ascii);
        System.out.println(byteToStr);

        String byteToStr2 = new String(ascii, 1, 2);
        System.out.println(byteToStr2);

        // Character Array
        char[] charArr = {'S', 'o', 'n', 'a'};
        String charToStr = new String(charArr);
        System.out.println(charToStr);

        String charToStr2 = new String(charToStr);
        System.out.println(charToStr2);

        /*
         * STRING BUFFER ---------------------------------------------------------------------------
         * Mutable - modify without creating new obj
         * Thread safe/synchronized
        */

        StringBuffer s = new StringBuffer();
        StringBuffer s1 = new StringBuffer(20);
        StringBuffer s2 = new StringBuffer("using string literal");
        s.append("String");
        s.append(" ");
        s.append("Buffer");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        /*
         * length()
         * capacity() - default capacity of buffer is 16, if increases then it increases its space (oldcapacity * 2) + 2
         * delete(begInd, endInd)
         * deleteCharAt()
         * ensureCapacity()
         * substring()
         * toString()
         * trimToSize()
        */

        System.out.println(s2.charAt(6));
        System.out.println(s2.insert(5, " concept"));
        System.out.println(s2.replace(1, 2, "nothing"));
        System.out.println(s2.reverse());

        /*
         * STRING BUILDER -----------------------------------------------------------------------------
         * Mutable
         * Not thread safe
         * Fast and memory effecient
         * java.lang.Object > java.lang > Class StringBuilder
         * same operations as of StringBuffer
        */

        StringBuilder sb = new StringBuilder("Hola!");
        System.out.println(sb);
        sb.append(" This is awesome.");
        System.out.println(sb);

        String sbToStr = sb.toString();
        System.out.println(sbToStr);

        System.out.println(sb.length());
        sb.setCharAt(5, 'X');
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);

        /*
         * STRING TOKENIZER ----------------------------------------------------------------------------
         * used to break string into tokens
         * 'whitespace' is default delimiter
        */

        String text = "Hello, how have you been?";
        StringTokenizer st = new StringTokenizer(text);
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        } 
        StringTokenizer st1 = new StringTokenizer(text, ",");
        while(st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        } 
        StringTokenizer st2 = new StringTokenizer(text, ",", true);
        while(st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        } 

        /*
         * countTokens()
         * hasMoreTokens()
         * nextElement()
         * hasMoreElements()
         * nextToken()
        */
    }
}
