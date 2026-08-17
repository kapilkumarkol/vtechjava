class A {
    public static void main(String[] args) {
        byte x = 34;
        byte y = 'A';
        // byte z = 128;
        //narrowing conversion - (explicit type casting expected)
        // but this case is special one : the type casting will be taken care by java itself...

        Byte a = 23;
                //(23)int->conversion->(23)byte->Boxing->Byte(23)
        // Byte b = 128;

        // byte range: -128 to 127
    }
}