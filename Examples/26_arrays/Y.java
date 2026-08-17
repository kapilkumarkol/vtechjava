class A {
    public static void main(String[] args) {
        Student[] x = {
                        new Student("om", 7, new Address(new City("Jabalpur"), new State("MP"))), 
                        new Student("ram", 12, new Address(new City("Jaipur"), new State("Rajasthan"))), 
                        new Student("golu", 17, new Address(new City("Mumbai"), new State("MH")))
                      };

        // System.out.println(x[1].age);              
        System.out.println(x[1].address.state.stateName);              
    }    
}

class Student {
    String name;
    int age;
    Address address;

    Student(String name, int age, Address address) {
        this.name = name;
        this.age  = age;
        this.address = address;
    }
}

class Address {
    City city;
    State state;

    Address(City city, State state) {
        this.city = city;
        this.state = state;
    }
}

class City {
    String cityName;

    City(String cityName) {
        this.cityName = cityName;
    } 
}

class State {
    String stateName;

    State(String stateName) {
        this.stateName = stateName;
    }
}