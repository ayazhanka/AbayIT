package HomeWork;
import HomeWork.HomewWorkEnum.Mark;
import HomeWork.HomewWorkEnum.Model;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    private int id;
    private Mark mark;
    private Model model;
    private LocalDate buildDate;
    private String color;
    private int price;
    private int number;

    public Car(int id, LocalDate buildDate, String color, int price, int number, Mark mark, Model model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.buildDate = buildDate;
        this.color = color;
        this.price = price;
        this.number = number;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }



    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


    public LocalDate getBuildDate() {
        return buildDate;
    }
    public void setBuildDate(LocalDate buildDate) {
        this.buildDate = buildDate;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Mark getMark() {
        return mark;
    }
    public void setMark(Mark mark) {
        this.mark = mark;
    }
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null | getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (!Objects.equals(buildDate, car.buildDate)) return false;
        if (!Objects.equals(price, car.price)) return false;
        if (!Objects.equals(number, car.number)) return false;
        if (mark != car.mark) return false;
        if (model != car.model) return false;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buildDate != null ? buildDate.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", buildDate=" + buildDate +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                ", number=" + number + '\'' +
                '}';
    }
}
