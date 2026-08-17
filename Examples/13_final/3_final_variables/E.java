class A {
    public static void main(String[] args) {
        // t is a local variable ...
        int t;  // uninitialized variable
        String h = "om";

        // System.out.println(t); // you can't access an uninitialized variable... 
        //you must initialize such variable before access...
        
        System.out.println(h);
    }
}

// variable t might not have been initialized