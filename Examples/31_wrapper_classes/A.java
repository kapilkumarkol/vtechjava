class A {
    public static void main(String[] args) {
        // int x = 'A';
        Integer x = 'A';
        // conversion then boxingis not allowed... 

        System.out.println(x);
    }
}

// A.java:4: error: incompatible types: char cannot be converted to Integer
//         Integer x = 'A';
//                     ^
// 1 error