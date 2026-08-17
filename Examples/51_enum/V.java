enum LassiSize {
    SMALL(300, "SM"), MEDIUM(600, "MD"), LARGE(1000, "LG");
    
    private int ml;
    private String label;

    LassiSize(int ml, String label) {
        this.ml = ml;
        this.label = label;
    }

    int getMl() {
        return ml;
    }

    String getLabel() {
        return label;
    }
}

class A {
    public static void main(String[] args) {
        LassiSize size = LassiSize.MEDIUM;

        System.out.println(size);
        System.out.println(size.getMl()+" ml");
        System.out.println("Label: "+size.getLabel());
    }
}

