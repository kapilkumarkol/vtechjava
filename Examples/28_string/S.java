class A {
    public static void main(String[] args) {
        String str = "mohan is a good boy";

        String[] x = str.split(" ");

        for(String y : x) {
            System.out.println(y);
        }

        System.out.println(str);
    }
}