class A {
    public static void main(String[] args) {
        String str = "Jabalpur, Jagdalpur, Nagpur, Kanpur";

        // String[] arr = str.split(",");
        String[] arr = str.split(", ");

        for(String s : arr) {
            System.out.println(s);
        }
    }
}