class A { 
    static class B {
        private void pro() {
            System.out.println("pro...!!!");
        }
    }

    public static void main(String[] args) {
        B x = new B();
        x.pro();
    }
}