class A {
    public static void main(String[] args) {
        System.out.println("A");
        if(args.length == 0) {
            try {
                throw new EmptyCommandLineException();
            } catch(EmptyCommandLineException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
    }
}

// Custom Exception Class : Checked Exception
class EmptyCommandLineException extends Exception {

}