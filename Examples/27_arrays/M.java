class A {
    public static void main(String[] args) {
        int[][] x = {{23,45,12},{1,2},{11,12,13,14,15},{45,89}};
        int[][] y = new int[x.length][];

        for(int i=0; i<y.length; i++) {
            y[i] = new int[x[i].length];
            for(int j=0;j<y[i].length;j++){
                y[i][j] = x[i][j];
            }
        }

        for(int i=0; i<y.length; i++) {
            for(int j=0;j<y[i].length;j++){
                System.out.print(y[i][j]+" ");
            }

            System.out.println();
        }
    }
}