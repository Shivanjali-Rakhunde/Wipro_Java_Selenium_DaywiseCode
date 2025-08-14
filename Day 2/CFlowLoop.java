class CFlowLoop {
    public static void main(String[] args) {
        // Simple for loop
        System.out.println();
        System.out.println("Increment For Loop");
        System.out.println("---------------");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println("I: " + i);
        }

        // Decrement for loop
        System.out.println();
        System.out.println("Decrement For Loop");
        System.out.println("------------------");
        System.out.println();
        for (int i = 5; i >= 1; i--) {
            System.out.println("I: " + i);
        }

        int[] arr = new int[4];
        arr[0] = 333;
        arr[1] = 3;
        arr[2] = 33;
        arr[3] = 933;

        // iterate thru the array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }

        // iterate using enhanced for loop
        System.out.println();
        System.out.println("Enhanced For Loop");
        System.out.println("-----------------");
        System.out.println();
        for (int arrayElement : arr) {
            System.out.println(arrayElement);
        }

        // Nested for loop
        System.out.println();
        System.out.println("Nested For Loop");
        System.out.println("---------------");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println("I: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("   J: " + j);
            }
        }

        // While loop
        System.out.println();
        System.out.println("While Loop");
        System.out.println("----------");
        System.out.println();
        int t = 1;
        while (t <= 5) {
            System.out.println("T: " + t);
            t++;
        }

        // Nested while loop
        System.out.println();
        System.out.println("Nested While Loop");
        System.out.println("-----------------");
        System.out.println();
        int r = 1;
        while (r <= 5) {
            System.out.println("R: " + r);
            int s = 1;
            while (s <= 3) {
                System.out.println("  S: " + s);
                s++;
            }
            r++;
        }
    }
}

