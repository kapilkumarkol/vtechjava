class A {
    public static void main(String[] args) {
        String str = "om";
        int[] arr = {12, 45, 67};
        
        try {
            if(12>13) {
                System.out.println(str.charAt(2));
            } else {
                System.out.println(arr[3]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Golu");
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Bablu");
        } 
    }
}