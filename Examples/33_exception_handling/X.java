class A {
    public static void main(String[] args) {
        
        if(args.length == 0) {
            throw new EmptyCommandLineException();
        }
    }
}

// Custom Exception Class : Checked Exception
class EmptyCommandLineException extends Exception {

}