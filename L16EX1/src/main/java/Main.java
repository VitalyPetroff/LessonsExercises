import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        get("/simpleGet", (request, responce) -> "Request");
        post("/simplePost", (request, responce) -> "PostRequestHaHa");
    }
}