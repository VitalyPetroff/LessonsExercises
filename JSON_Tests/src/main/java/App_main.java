import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App_main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("Вася", 33);
        String path = "d:\\HOME-COMP\\Projects\\REPOSITORIUM\\LessonsExercises\\JSON_Tests\\userInfo.json";

        String userInfo = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);

        mapper.writeValue(new File(path), user);
        System.out.println(userInfo);

        User newUser = mapper.readValue(new File(path), User.class);
//        mapper.writeValue(new File("d:\\HOME-COMP\\Projects\\REPOSITORIUM\\LessonsExercises\\JSON_Tests\\NewUser.json"),
//                newUser);

//        User newUser = mapper.readValue(str, User.class);
        String newUserInfo = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(newUser);
        System.out.println(newUserInfo);
    }
}