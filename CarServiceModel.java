package CarService;
import HomeWork.HomewWorkEnum.Model;
import HomeWork.Car;

public class CarServiceModel {
    public void modelCarsShow (Car[] cars, Model model) {
        for (Car car: cars) {
            if (car.getModel() == model) {
                System.out.println(car);
            }
        }
    }
}
