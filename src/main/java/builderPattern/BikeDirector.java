package builderPattern;

/**
 * @projectName: java-design-patter
 * @package: builderPattern
 * @className: BikeDirector
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/2/25 22:02
 * @version: 1.0
 */
public class BikeDirector {
    public String construct(BikeBuilder bikeBuilder){

        return bikeBuilder.buildFrame() +
                " " +
                bikeBuilder.buildTire();
    }
}
