class A {
    public static void main(String[] args) {
        String str = "Mohan-22,Sohan-32,Rohan-12,Ganesh-28";

        String[] arr = str.split("\\d\\d");
        
        for(String a : arr) {
            System.out.println(a);
        }
    }
}