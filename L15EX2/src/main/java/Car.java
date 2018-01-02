public class Car {

    private String Model;

    Car(){
        Model = "Volvo";
    }

    @Override
    public String toString() {
        return ("Model = " + Model);
    }
}
