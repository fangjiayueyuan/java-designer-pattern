package factoryMethodPattern.version1;

import java.util.Scanner;

/**
 * @projectName: java-design-patter
 * @package: factoryMethodPattern.version1
 * @className: Main
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/3/3 11:40
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i<n;i++){
            String[] s = scanner.nextLine().split(" ");
            String block = s[0]; // 积木形状
            int blockCount= Integer.parseInt(s[1]); // 积木数量
            Block blockProduct = null;
            if(block.equals("Circle")){
                blockProduct = new Circle();
            } else if (block.equals("Square")) {
                blockProduct = new Square();
            }
            for(int j = 0; j<blockCount ;j++){
                if(blockProduct!=null){
                    blockProduct.draw();
                }
            }
        }
//        System.out.println("程序运行end...");

    }
}

interface Block{
    void draw();
}

class Circle implements Block{

    @Override
    public void draw() {
        System.out.println("Circle Block");
    }
}
class Square implements Block{

    @Override
    public void draw() {
        System.out.println("Square Block");
    }
}

interface BlockFactory{
    void buildBlock();
}

class CircleBlockFactory implements BlockFactory{

    @Override
    public void buildBlock() {
        Circle circle = new Circle();
        circle.draw();
    }
}

class SquareBlockFactory implements BlockFactory{

    @Override
    public void buildBlock() {
        Square square = new Square();
        square.draw();
    }
}




