public class Stock {

    private String nameOfStock;
    private int priceOfStock = 100;
    private int rentPrice = 1;
    private int maxVolume = 10;
    private int occupiedVolume = 0;

    public Stock(String nameOfStock, int maxVolume) {
        this.nameOfStock = nameOfStock;
        this.maxVolume = maxVolume;
    }

    public void stockLoading(int volume){
        if (volume > (maxVolume - occupiedVolume)){
            System.out.println("Материала в объеме " + volume + " на склад не влезет!");
        } else {
            occupiedVolume += volume;
        }
    }

    public void stockUnloading(int volume){
        if (volume > occupiedVolume){
            System.out.println("На складе нет столько материала");
        } else {
            occupiedVolume -= volume;
        }
    }

    public int rentCalculation(){
        return occupiedVolume * rentPrice;
    }

    public void printStockInfo() {
        double loadingPercentage = (double)(occupiedVolume) / maxVolume * 100;
        System.out.println("Name of stock: " + nameOfStock +
                "\npriceOfStock = " + priceOfStock +
                "\nmax volume = " + maxVolume +
                "\nloading percentage = " + loadingPercentage);
    }
}
