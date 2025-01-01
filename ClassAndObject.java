// Object -  it is an instance of class ,it is a real-word entity that has state and behaviour. In other words, an object is a tangible thing that can be touch and feel, like a car or chair, etc. are the example of objects. if any thing hasstate  behaviour , identity its called object

// Class - it is a blueprint or template for creating objects
// Inheritance - it is a mechanism in which one class can inherit properties and methods from another class
// Polymorphism - it is the ability of an object to take on multiple forms
// Encapsulation - it is the idea of bundling data, or it means hiding the implementation details
// Abstraction - it is the concept of showing only necessary information to the outside world while hiding th

class Car{
    public String getModel(String model){

        String m = model;
        return m;
    }

    public String getType(String type){
        String t = type;
        return t;
    }

    public int getYear(int year){
        int y = year;
        return y;
    }

    public String[] Display(String model , String Type , int Year){
        String[] details = {model,Type,String.valueOf(Year)};
        return details;
    } 
}

public class ClassAndObject {
    public static void main(String[] args) {

       String model = "Toyota";
        String type = "Sedan";
       int year = 2020;
        Car car = new Car();
        String[] details = car.Display(model , type , year);
        System.out.println("Model: " + details[0] + " Type: " + details[1] + " Year: " + details[2]);
    }
}