enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class A {
    public static void main(String[] args) {
        Days day = new Days();
        // error: enum types may not be instantiated
    }
}