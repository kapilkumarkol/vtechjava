class A {
    public static void main(String[] args) {
        char[] x = {'m','o','h','a','n',' ','i','s',' ','a',' ','g','o','o','d',' ','b','o','y'};

        int count = 0;

        for(int i=0; i < x.length; i++) {
            if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u') {
                count++;
            }
        }

        System.out.println(count);
    }
}