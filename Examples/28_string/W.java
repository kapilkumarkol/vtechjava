class A {
    public static void main(String[] args) {
        String str = "Jabalpur , Jagdalpur, Nagpur ,Kanpur,Raipur";

        String[] arr = str.split(",");

        for(String s : arr) {
            // System.out.println(">"+s+"<");
            System.out.println(">"+s.trim()+"<");
        }
    }
}