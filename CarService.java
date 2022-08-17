package CarService;
import HomeWork.HomewWorkEnum.Mark;
import HomeWork.Car;

public class CarService {
    public void markCarsShow (Car[] cars, Mark mark) {
        for (Car car: cars) {
            if (car.getMark() == mark) {
                System.out.println(car);
            }
        }
    }
}
