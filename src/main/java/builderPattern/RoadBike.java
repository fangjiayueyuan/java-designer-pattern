package builderPattern;

/**
 * @projectName: java-design-patter
 * @package: builderPattern
 * @className: RoadBike
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/2/25 22:00
 * @version: 1.0
 */
public class RoadBike implements BikeBuilder {
    @Override
    public String buildFrame() {
        return "Carbon Frame";
    }
    @Override
    public String buildTire() {
        return "Slim Tries";
    }

    @Override
    public Bike getResult() {
        Bike bike = new Bike();
        bike.setFrame(buildFrame());
        bike.setTire(buildTire());
        return bike;
    }
}
