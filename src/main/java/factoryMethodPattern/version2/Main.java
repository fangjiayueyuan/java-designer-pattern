package factoryMethodPattern.version2;

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

            if(block.equals("Circle")){
                BlockFactorySystem blockFactorySystem = new BlockFactorySystem(new CircleBlockFactory(), blockCount);
                blockFactorySystem.createBlockFactory(blockCount, new CircleBlockFactory());
            } else if (block.equals("Square")) {
                BlockFactorySystem blockFactorySystem = new BlockFactorySystem(new SquareBlockFactory(), blockCount);
                blockFactorySystem.createBlockFactory(blockCount, new SquareBlockFactory());
            }
        }


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
    Block buildBlock();
}

class CircleBlockFactory implements BlockFactory{ // CircleBlockFactory只用来制造Block实体，而不去执行其方法，执行方法的步骤由客户端触发

    @Override
    public Block buildBlock() {
        return new Circle();
    }
}

class SquareBlockFactory implements BlockFactory{

    @Override
    public Block buildBlock() {
        return new Square();
    }
}

class BlockFactorySystem{
    private final BlockFactory blockFactory;
    private final int count;

    public BlockFactorySystem(BlockFactory blockFactory, int count){
        this.blockFactory = blockFactory;
        this.count = count;
    }

    public void createBlockFactory(int count, BlockFactory blockFactory){
        for(int i = 0;i<count;i++){
            Block block = blockFactory.buildBlock();
            block.draw();
        }
    }
}




