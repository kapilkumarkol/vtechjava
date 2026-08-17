import java.io.Serializable;

class MyAddress extends Address implements Serializable{        
    MyAddress(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
