class A {
    static void pro(String[] a, String... b) {
        for(String x : a) {
            System.out.println(x);
        }

        System.out.println("++++++++++++++++++");

        for(String y : b) {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        pro("jay", "ram", "ramesh", "pappu");
    }
}

// error: incompatible types: String cannot be converted to String[]