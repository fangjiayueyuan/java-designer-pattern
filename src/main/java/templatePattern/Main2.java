package templatePattern;

import java.util.Scanner;

/**
 * @projectName: java-designer-pattern
 * @package: templatePattern
 * @className: Main2
 * @author: fangjiayueyuan
 * @description: 名词类的用作属性，在构造函数中进行初始化
 * @date: 2024/2/28 11:40
 * @version: 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            Integer n = scanner.nextInt();
            Coffee coffee = null;
            if(n == 1){
                coffee  = new AmericanCoffee("American Coffee");
            }else{
                coffee = new Latte("Latte");
            }
            coffee.makeCoffee();
        }
    }
}

abstract class Coffee{
    private String coffeeName;

    /**
     * 添加构造函数
    **/
    public Coffee(String coffeeName){
        this.coffeeName = coffeeName;
    }
    public final void makeCoffee(){
        System.out.println("Make "+coffeeName+":");
        grindingCoffeeBeans(); // 研磨咖啡豆
        brewing(); // 冲泡咖啡
        addingCondiments(); // 添加调料
        System.out.println();
    }
    abstract void grindingCoffeeBeans(); // 研磨咖啡豆
    abstract void brewing(); // 冲泡咖啡
    abstract void addingCondiments(); // 添加调料
}

class AmericanCoffee extends Coffee{

    /**
     * 添加构造函数
     * @param coffeeName
     */
    public AmericanCoffee(String coffeeName) {
        super(coffeeName);
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

    /**
     * 添加构造函数
     * @param coffeeName
     */
    public Latte(String coffeeName) {
        super(coffeeName);
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