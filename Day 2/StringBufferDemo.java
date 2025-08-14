public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");      // "Hello World"
        sb.insert(5, ",");        // "Hello, World"
        sb.replace(0, 5, "Hi");   // "Hi, World"
        sb.delete(3, 5);          // "Hi, rld"
        sb.reverse();             // "dlr ,iH"

        System.out.println(sb);   // Output: dlr ,iH
    }
}

