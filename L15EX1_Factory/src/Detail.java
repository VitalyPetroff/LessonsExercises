public class Detail {

    private String nameOfDetaiil; // название детали
    private int valueOfMaterial; // стоимость материалов
    private int valueOfMaking;  // стоимость работ
    private int income;     // прибыль от продажи

    public void printDetailInfo() {
        String str = "Название детали: " + nameOfDetaiil +
                " стоимость материалов: " + valueOfMaterial +
                " стоимость работ :" + valueOfMaking;
        System.out.println(str);
    }

    public int detailMaking(Stock stock){

    }
}
