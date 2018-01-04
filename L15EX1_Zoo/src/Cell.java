public class Cell {
    private String nameOfAnimal;
    private boolean wasteContent = false;

    public void Filling(){
        wasteContent = true;
    }

    public void Cleaning(){
        wasteContent = false;
    }

    public boolean cellStatus(){
        return wasteContent;
    }
}
