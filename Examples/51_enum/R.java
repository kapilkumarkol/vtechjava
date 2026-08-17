enum Lassi {
    SMALL, MEDIUM, LARGE 
}

class A {
    public static void main(String[] args) {
        Lassi[] lassi = Lassi.values();

        for(Lassi ls : lassi) {
            System.out.println(ls);
        }
    }
}