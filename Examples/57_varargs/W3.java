class A {
    static void pro(String...[] x) {  //NOT OK
        for(String[] e : x) {
            for(String w : e) {
                System.out.print(w+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] arr = {
            {"a","b","c","d"},
            {"x","y","z","#"}
        };    

        pro(arr);
    }
}