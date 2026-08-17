enum LassiSize {
    SMALL(300), MEDIUM(600), LARGE(1000);
    
    int ml;

    LassiSize(int ml) {
        this.ml = ml;
    }
}

class A {
    public static void main(String[] args) {
        LassiSize size = LassiSize.MEDIUM;

        System.out.println(size);
        System.out.println(size.ml+" ml");
    }
}

