package builderPattern;

/**
 * @projectName: java-design-patter
 * @package: builderPattern
 * @className: MoutainBike
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/2/25 21:56
 * @version: 1.0
 */
public class MountainBike implements BikeBuilder {
    @Override
    public String buildFrame() {
        return "Aluminum Frame";
    }

    @Override
    public String buildTire() {
        return "Knobby Tires";
    }

    @Override
    public Bike getResult(){
        Bike bike = new Bike();
        bike.setFrame(buildFrame());
        bike.setTire(buildTire());
        return bike;
    }
}
