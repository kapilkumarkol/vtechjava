// java A <Enter>
// java A om golu <Enter>
// java A om sinha golu gupta ram singh <Enter>
// java A "om sinha" "golu gupta" "ram singh" <Enter>

class A {
    public static void main(String[] args) {
        System.out.println(args);
        System.out.println(args.length);

        for(String y : args) {
            System.out.println(y);
        }
    }
}