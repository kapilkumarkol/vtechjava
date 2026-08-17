class A{
    public static void main(String[] args) {
        
        //Case 1:
        // int[] x = new int[3];
        // x[0] = 12;
        // x[1] = 13;
        // x[2] = 14;

        //Case 2:
        //int[] x = new int[] {12, 14, 15, 16, 17};
        
        //Case 3:
        int[] x = {5, 3, 1};

        for(int t=0; t < x.length; t++) {
            System.out.println(x[t]);
        }
    }
}