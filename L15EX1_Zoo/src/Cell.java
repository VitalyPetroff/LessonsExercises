public class Cell {
    private String nameOfAnimal;
    private boolean wasteContent = false;

    public void cellFilling(){
        wasteContent = true;
    }

    public void cellCleaning(){
        wasteContent = false;
    }

    public boolean cellStatus(){
        return wasteContent;
    }
}
