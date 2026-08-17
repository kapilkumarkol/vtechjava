interface W {
    void pro();

    void info();
}

class A implements W {
    public void pro() {
        System.out.println("Hello");
    }
}