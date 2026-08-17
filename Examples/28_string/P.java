class A {
    public static void main(String[] args) {
        String str = "om is my friend and he is a good guy and he is a good singer";

        System.out.println(str.lastIndexOf("is"));
        System.out.println(str.lastIndexOf("is", 43));
        System.out.println(str.lastIndexOf("is", 22));
    }
}