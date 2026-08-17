class A {
    public static void main(String[] args) {
        String str = "vikramaditya";

        int searchIndex = 0;
        searchIndex = str.indexOf('a', searchIndex);

        while(searchIndex != -1) {
            System.out.println(searchIndex);
            searchIndex = str.indexOf('a', searchIndex+1);
        }

        // for( ;searchIndex != -1; ) {
        //     System.out.println(searchIndex);
        //     searchIndex = str.indexOf('a', searchIndex+1);
        // }
    }
}