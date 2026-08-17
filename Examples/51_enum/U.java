enum LassiSize {
    SMALL(300, "SM"), MEDIUM(600, "MD"), LARGE(1000, "LG");
    
    int ml;
    String label;

    LassiSize(int ml, String label) {
        this.ml = ml;
        this.label = label;
    }
}

class A {
    public static void main(String[] args) {
        LassiSize size = LassiSize.MEDIUM;

        System.out.println(size);
        System.out.println(size.ml+" ml");
        System.out.println("Label: "+size.label);
    }
}

