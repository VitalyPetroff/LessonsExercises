import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        Model model = Model.read();
        post("/addMessage", (request, response) -> model.addMessage(request.body()));
        get("/view", (request, response) -> model.getMessage());
    }
}