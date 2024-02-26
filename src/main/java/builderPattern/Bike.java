package builderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: java-designer-pattern
 * @package: builderPattern
 * @className: Bike
 * @author: fangjiayueyuan
 * @description: 产品类
 * @date: 2024/2/26 14:34
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bike {
    private String frame;
    private String tire;
}
