class A {
    public static void main(String[] args) {
        int[] x = new int[5];

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        
        x[0] = 3;
        x[1] = 76;
        x[2] = 13;
        x[3] = 53;
        x[4] = 90;
        
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
    }
}