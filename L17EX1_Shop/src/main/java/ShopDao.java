import Model.Shop;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ShopDao {
    String jsonPath;
    ObjectMapper mapper = new ObjectMapper();

    public ShopDao(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public void write(Shop shop) {
        try {
            mapper.writeValue(new File(jsonPath), shop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Shop read(){
        Shop shop;
        try {
             shop = mapper.readValue(new File(jsonPath), Shop.class);
        } catch (IOException e) {
            shop = new Shop();
        }
        return shop;
    }
}