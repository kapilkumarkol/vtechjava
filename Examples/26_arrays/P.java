class A {
    public static void main(String[] args) {
        int[][] x = new int[2][3];       

        System.out.println(x.length);
        
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i].length);
        }
    }
}