class A {
    public static void main(String[] args) {
        byte b = 89;

        short s = 340;

        int i = 12000;

        char c = 51;

        long l = 23;

        double d = 2.34;

        int[] x = {b, s, i, c};

        for(int j=0; j < x.length; j++) {
            System.out.println(x[j]);
        }
    }
}