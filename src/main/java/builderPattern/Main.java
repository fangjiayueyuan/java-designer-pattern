package builderPattern;

import java.util.Scanner;

/**
 * @projectName: java-design-patter
 * @package: builderPattern
 * @className: Main
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/2/25 22:07
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BikeDirector bikeDirector = new BikeDirector();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            if(type.equals("mountain")){
                System.out.println(bikeDirector.construct(new MountainBike()));
            }else{
                System.out.println(bikeDirector.construct(new MountainBike()));
            }
        }
    }
}
