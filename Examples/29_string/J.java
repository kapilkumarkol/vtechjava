class A {
    public static void main(String[] args) {
        String s = "om, ram, sohum, ganesh, dinesh";

        String[] arr = s.split(", ");

        for(String r : arr) {
            System.out.println(r);        
        }

        String t = String.join(", ", arr);

        System.out.println(t);
    }
}