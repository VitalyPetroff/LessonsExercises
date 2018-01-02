public abstract class Detail {

    private String nameOfDetaiil; // название детали
    private int valueOfMaterial; // стоимость материалов
    private int valueOfMaking;  // стоимость работ
    private int income;     // прибыль от продажи

    @Override
    public String toString() {
        System.out.println("Название детали: " + nameOfDetaiil +
                " стоимость материалов: " + valueOfMaterial +
                " стоимость работ :" + valueOfMaking);
    }

    public abstract int detailMaking();
}
