class A {
    public static void main(String[] args) {
        int[] x = {44, 22, 77, 11, 99};

        // ----------------------        
        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        
        int halfLen = x.length/2;
        
        for(int i=0; i < halfLen; i++) {
            x[i] = x[i] + x[x.length-i-1];
            x[x.length-i-1] = x[i] - x[x.length-i-1];
            x[i] = x[i] - x[x.length-i-1];

        }  

        System.out.println("+++++++++++++++++");

        for(int i=0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }

        // ----------------------
    }
}