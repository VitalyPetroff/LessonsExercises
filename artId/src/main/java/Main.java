import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {

    public static void main(String[] args) {
        Person vP = new Person();
        Car volvo = new Car();
        Animal cat = new Animal("Lisa");

        get("/getPerson", (request, responce) -> vP.toString());
        get("/getCar", (request, response) -> volvo.toString());
        get("/getAnimal", ((request, response) -> cat.toString()));


        post("/getPerson", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return vP.toString();
            }
        });

        post("/getCar", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return volvo.toString();
            }
        });

        post("/getAnimal", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return cat.toString();
            }
        });
    }
}
