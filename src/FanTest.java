

class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setNowSpan(true);
        System.out.println("Fan1: " + fan1.isNowSpan());
        fan1.setColor("yellow");
        System.out.println("Fan color is: " + fan1.getColor());
        fan1.setRadius(10);
        System.out.println("Fan radius is: " + fan1.getRadius());
        fan1.setSpeed(fan1.fast);
        System.out.println("Fan speed is: " + fan1.getSpeed());

        fan2.setNowSpan(false);
        System.out.println("Fan2: " + fan2.isNowSpan());
        fan2.setSpeed(fan2.medium);
        System.out.println("Fan speed is: " + fan2.getSpeed());
        fan2.setRadius(5);
        System.out.println("Fan radius is: " + fan2.getRadius());
        fan2.setColor("blue");
        System.out.println("Fan color is: " + fan2.getColor());


    }

}