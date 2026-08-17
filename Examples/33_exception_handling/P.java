class A {
    public static void main(String[] args) {
        System.out.println("A");
        
        try {
            System.out.println("B");            
        } 
        System.out.println(1); 
        catch(Exception e) {
            System.out.println("C");            
        } 
        System.out.println(1);
        finally {
            System.out.println("D");            
        }
        System.out.println("E");
    }
}

// P.java:5: error: 'try' without 'catch', 'finally' or resource declarations
//         try {
//         ^
// P.java:9: error: 'catch' without 'try'
//         catch(Exception e) {
//         ^
// P.java:13: error: 'finally' without 'try'
//         finally {
//         ^
// 3 errors