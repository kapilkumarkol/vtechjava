class A {
    public static void main(String[] args) {
        int[][] x = new int[3][2];       
        
        x[0][0] = 9;
        x[0][1] = 3;

        x[1][0] = 12;
        x[1][1] = 5;

        x[2][0] = 21;
        x[2][1] = 5;

        for(int[] y : x) {
            for(int z : y) {
                System.out.print(z+" -");
            }   
            System.out.println();
        }

        // for(int i=0; i < x.length; i++) {
        //     for(int j=0; j < x[i].length; j++) {
        //         // System.out.print("("+i+","+j+")");
        //         System.out.print(x[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}