package HomeWork.HomewWorkEnum;

public enum Mark {

    BMW("BMW"), MERS("Mersedes");
    private String name;
    private int id;

    Mark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
