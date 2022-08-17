package HomeWork.HomewWorkEnum;

public enum Model {
    X5("x5"), TAYCAN("Taycan");
    private String name1;
    private int id;

    Model(String name) {
        this.name1 = name1;
    }

    public String getName() {
        return name1;
    }
}
