interface X {

}

class A implements X {
    public static void main(String[] args) {
        X t = new A();

        System.out.println(t);
    }
}