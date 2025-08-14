class Impl {
    public static void main(String[] args) {

        String str = "Welcome";

        // String length and basic operations
        System.out.println("Length: " + str.length());
        System.out.println("Character at position 3: " + str.charAt(3));
        System.out.println("Substring (0,3): " + str.substring(0, 3));

        // String comparison
        System.out.println("Equals 'Welcome': " + "Welcome".equals(str));
        System.out.println("Equals Ignore Case 'welcome': " + "welcome".equalsIgnoreCase(str));
        System.out.println("CompareTo 'Welcome': " + "Welcome".compareTo(str));

        // Search and transform
        System.out.println("Contains 'come': " + str.contains("come"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trim example: " + "hello ".trim());
        System.out.println("Replace 'W' with 'M': " + str.replace("W", "M"));
        System.out.println("Index of 'c': " + str.indexOf('c'));
        System.out.println("isEmpty: " + str.isEmpty());

        // -------------------------------
        // Immutable String Example
        // -------------------------------
        String s = "Hello";
        s.concat(" World");
        System.out.println(s); // Output: Hello (unchanged, because String is immutable)

        s = s.concat(" World");
        System.out.println(s); // Output: Hello World (new string assigned to s)

        // -------------------------------
        // StringBuffer - Mutable Example
        // -------------------------------
        StringBuffer sb = new StringBuffer("Hello"); // with initial string
        sb.append("World");                         // Append
        System.out.println(sb);

        sb.insert(1, "Java");                       // Insert at index 1
        System.out.println(sb);

        sb.replace(0, 5, "Hi");                     // Replace from index 0 to 5
        System.out.println(sb);

        sb.delete(0, 2);                            // Delete first 2 characters
        System.out.println(sb);

        sb.reverse();                               // Reverse the string
        System.out.println(sb);

        System.out.println("Capacity: " + sb.capacity()); // Internal buffer capacity
        sb.setCharAt(0, 'T');                       // Modify character at index 0
        System.out.println(sb);
    }
}

