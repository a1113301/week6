import java.util.Scanner;

class Animal {
    String name;
    double height;
    double weight;
    double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("名字: " + name);
        System.out.println("身高: " + height + " meters");
        System.out.println("體重: " + weight + " kg");
        System.out.println("速度: " + speed + " meters/minute");
    }

    public String getName() {
        return name;
    }

    public double distance(double x, double y) {
        double distance = 0.5 * y * Math.pow(x / 60, 2) + speed * x / 60;
        return distance;
    }

    public double distance(double x) {
        double distance = speed * x;
        return distance;
    }
}

public class A1113301_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Animal("安娜", 1.7, 48, 120);
        animals[3] = new Animal("愛沙", 1.7, 50, 120);

        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }

         Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print("請輸入" + animal.getName() + "跑步時間（分鐘）：");
            double x = scanner.nextDouble();

            System.out.print("請輸入" + animal.getName() + "加速度（公尺/秒^2），不輸入則預設為0：");
            double y = scanner.nextDouble();

            if (y != 0) {
                System.out.println(animal.getName() + "跑了" + animal.distance(x, y) + "公尺。");
            } else {
                System.out.println(animal.getName() + "跑了" + animal.distance(x) + "公尺。");
            }
        }
    }
}
