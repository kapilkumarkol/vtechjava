class A {
    public static void main(String[] args) {
        int[][][] x = new int[2][][];


        x[0] = new int[][]{{9,2,7},{3,5,7}};
        x[1] = new int[][]{{2,8},{5,2},{11,12}};


        for(int[][] y : x) {
            for(int[] z : y) {
                for(int k : z) {
                    System.out.print(k+" ");
                }
                System.out.print(" - ");
            }
            System.out.println();
        }

        // for(int i=0; i<x.length; i++) {
        //     for(int j=0; j<x[i].length; j++) {
        //         for(int k=0; k < x[i][j].length; k++) {
        //             System.out.print(x[i][j][k]+" ");
        //         }
        //         System.out.print(" - ");
        //     }

        //     System.out.println();
        // }
    }
}