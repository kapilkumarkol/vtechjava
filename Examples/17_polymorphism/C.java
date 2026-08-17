class Vehicle { }

class Bus extends Vehicle { }

class Car extends Vehicle {  }

class SportsCar extends Car { }

class Apple { }

class A {
    public static void main(String[] args) {
        Vehicle v = new SportsCar();

        //Case 6:
        // if(v instanceof Apple) {
        //     System.out.println("SportsCar object IS-A Bus");
        // }

        //Case 5:
        // if(v instanceof Bus) {
        //     System.out.println("SportsCar object IS-A Bus");
        // } else {
        //     System.out.println("SportsCar object IS-NOT-A Bus");
        // }
        
        
        //Case 4:
        // if(v instanceof Object) {
        //     System.out.println("SportsCar object IS-A Object");
        // }


        //Case 3:
        // if(v instanceof Vehicle) {
        //     System.out.println("SportsCar object IS-A Vehicle");
        // }


        //Case 2:
        // if(v instanceof Car) {
        //     System.out.println("SportsCar object IS-A Car");
        // }

        //Case 1:
        // if(v instanceof SportsCar) {
        //     System.out.println("SportsCar object IS-A SportsCar");
        // }
    }
}