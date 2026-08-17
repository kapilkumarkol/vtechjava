class A {
    public static void main(String[] args) {
        int[][][] x = new int[2][][];


        x[0] = new int[][]{{9,2,7},{3,5,7}};
        x[1] = new int[][]{{2,8},{5,2},{11,12}};

        System.out.println(x[1][0][1]);
    }
}