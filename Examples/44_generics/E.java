import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        Rental<Car> r1 = new Rental<Car>();

        Car c1 = new Car();
        r1.addRecord(c1); 
        Car c2 = new Car();
        r1.addRecord(c2);  

        Car x = r1.getRecord();
    }
}


class Car { }

class Bus { }

class Rental<T> {
    ArrayList<T> records = new ArrayList<T>();

    void addRecord(T t) {
        records.add(t);
    }

    T getRecord() {
        return records.get(0);
    }
}



/* 
class CarRental {
    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car getCar() {
        return cars.get(0);
    }
}


class BusRental {
    ArrayList<Bus> buses = new ArrayList<Bus>();

    void addBus(Bus bus) {
        buses.add(bus);
    }

    Bus getBus() {
        return buses.get(0);
    }
}

*/