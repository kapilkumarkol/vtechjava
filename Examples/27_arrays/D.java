class A {
    public static void main(String[] args) {
        // int[][] x = {{4, 5, 1, 2, 3}, {11, 12}, {21, 22, 23}};
        int[][] x = new int[][]{{4, 5, 1, 2, 3, 17}, {11, 12, 304}, {21, 22, 23, 99}};

        //Case 1:
        // for(int i=0;i<x.length;i++) {
        //     for(int j=0;j<x[i].length;j++) {
        //         System.out.print(x[i][j]+" ");
        //     }

        //     System.out.println();
        // }
        
        //Case 2:
        // for(int[] y : x) {
        //     for(int z : y) {
        //         System.out.print(z+"-");
        //     }

        //     System.out.println();
        // }
    }
}