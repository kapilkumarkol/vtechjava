class A {
    public static void main(String[] args) {
        
        //Case 1: NOT OK
        // int[][] x;        
        // x = {{4, 5, 1, 2, 3}, {11, 12}, {21, 22, 23}};
        
        //Case 2: OK
        int[][] x;        
        x = new int[][]{{4, 5, 1, 2, 3, 17}, {11, 12, 304}, {21, 22, 23, 99}};        
    }
}