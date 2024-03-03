package templatePattern.version1;

import java.util.Scanner;

/**
 * @projectName: java-designer-pattern
 * @package: templatePattern
 * @className: Main
 * @author: fangjiayueyuan
 * @description: 模板方法 https://kamacoder.com/problempage.php?pid=1087
 * @date: 2024/2/27 10:21
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Integer n = scanner.nextInt();
            Coffee coffee;
            if(n == 1){
                coffee  = new AmericanCoffee();
            }else{
                coffee = new Latte();
            }
            coffee.makeCoffee();
            System.out.println();
        }

    }
}

abstract class Coffee{
    public final void makeCoffee(){
        label();
        grindingCoffeeBeans(); // 研磨咖啡豆
        brewing(); // 冲泡咖啡
        addingCondiments(); // 添加调料
    }
    abstract void label(); // 添加咖啡标签
    abstract void grindingCoffeeBeans(); // 研磨咖啡豆
    abstract void brewing(); // 冲泡咖啡
    abstract void addingCondiments(); // 添加调料
}

class AmericanCoffee extends Coffee{
    @Override
    void label() {
        System.out.println("Making American Coffee:");
    }

    @Override
    void grindingCoffeeBeans() {
        System.out.println("Grinding coffee beans");
    }

    @Override
    void brewing() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addingCondiments() {
        System.out.println("Adding condiments");
    }

}
class Latte extends Coffee{

    @Override
    void label() {
        System.out.println("Making Latte:");
    }

    @Override
    void grindingCoffeeBeans() {
        System.out.println("Grinding coffee beans");
    }

    @Override
    void brewing() {
        System.out.println("Brewing coffee");
    }

    @Override
    void addingCondiments() {
        System.out.println("Adding milk");
        System.out.println("Adding condiments");
    }
}