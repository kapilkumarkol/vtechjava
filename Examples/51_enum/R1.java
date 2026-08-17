enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class A {
    public static void main(String[] args) {
        Days[] days = Days.values();
        
        for(Days day : days) {
            System.out.println(day);
        }
    }
}