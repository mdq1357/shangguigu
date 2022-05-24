package day09.mdqexer;

public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle c = new Circle();
        obj.printAreas(c,5);
        System.out.println("当前半径为：" + c.radius);
    }
    public void printAreas(Circle c,int time){
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println("半径为：" + c.radius + "\t面积为：" + c.findArea(c.radius));

        }
        c.radius = i;
    }
}
