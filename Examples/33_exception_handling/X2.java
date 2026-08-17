class A {
    public static void main(String[] args) throws EmptyCommandLineException {
        System.out.println("A");
        if(args.length == 0) {
            throw new EmptyCommandLineException();
        }
        System.out.println("B");
    }
}

// Custom Exception Class : Checked Exception
class EmptyCommandLineException extends Exception {

}