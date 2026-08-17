class A {
    public static void main(String[] args) {
        int[] y[] = {{1,2,3}, {11, 12}};

        for(int[] x : y){
            for(int z : x) {
                System.out.print(z+" ");
            }
            System.out.println();
        }
    }
}