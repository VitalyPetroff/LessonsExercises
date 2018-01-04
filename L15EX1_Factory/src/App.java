public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("Склад №1", 100);
        stock.stockLoading(12);
        stock.printStockInfo();
        stock.stockLoading(15);
        stock.printStockInfo();
    }
}
