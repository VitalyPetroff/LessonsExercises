import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        get("/view", (request, response) -> model.getMessage());
        post("/addMessage", (request, response) -> model.addMessage(request.body()));
    }
}