import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        CarRental cr = new CarRental();  
        System.out.println(cr.cars.size()); 
        Car c1 = new Car();
        cr.addCar(c1); 
        Car c2 = new Car();
        cr.addCar(c2);
        Car x = cr.getCar(); 
    }
}


class Car { }

class CarRental {
    ArrayList<Car> cars = new ArrayList<Car>();

    void addCar(Car car) {
        cars.add(car);
    }

    Car getCar() {
        return cars.get(0);
    }
}

class Bus { }

class BusRental {
    ArrayList<Bus> buses = new ArrayList<Bus>();

    void addBus(Bus bus) {
        buses.add(bus);
    }

    Bus getBus() {
        return buses.get(0);
    }
}