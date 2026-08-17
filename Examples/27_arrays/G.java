class A {
    public static void main(String[] args) {
        int[][][] x = new int[2][][];


        x[0] = new int[2][3];
        x[1] = new int[3][2];

        // System.out.println(x[0][1][0]);
        // System.out.println(x[1][2]);
        // System.out.println(x[1][1][1]);

        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][1][0]);
    }
}