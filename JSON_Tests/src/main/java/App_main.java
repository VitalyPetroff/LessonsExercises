import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App_main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("Вася", 33);
        String userInfo = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(userInfo);

//        String basePath = new File("").getAbsolutePath();
//        String jsonPath = basePath + "/User.json";
        String jsonPath = "User.json";
        mapper.writeValue(new File(jsonPath), user);


        User newUser = mapper.readValue(new File(jsonPath), User.class);
        newUser.setAge(18);
        newUser.setName("Петя");
        String newUserInfo = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(newUser);
        System.out.println(newUserInfo);
    }
}