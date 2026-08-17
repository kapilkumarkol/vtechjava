class A {
    public static void main(String[] args) {
        String str = "om is my best friend and he is a good guy and he is a good singer";

        int searchIndex = str.length();

        while(true) {
            searchIndex = str.lastIndexOf("is", searchIndex-1);
            if(searchIndex!=-1)
                System.out.println(searchIndex);
            else
                break;
        }
    }
}