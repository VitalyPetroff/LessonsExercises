public class Visitor extends Person{

    private int mood = 5; // настроение
    private int budget = 5;

    public Visitor(String name) {
        super(name);
    }

    public boolean cellVisitation(Cell cell){
        if (!cell.cellStatus()){
            mood -= 1;
        } else {
            mood += 1;
            budget -= 1;
        }
        if ((mood == 0) || (budget == 0)){
            return false;   // посетитель ушёл из зоопарка
        } else {
            return true; // посетитель остался в зоопарке
        }
    }
}