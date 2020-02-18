public class Fan {
    int slow = 1, medium = 2, fast = 3;
    private int speed = slow;
    private boolean nowSpan = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isNowSpan() {
        return nowSpan;
    }

    public void setNowSpan(boolean nowSpan) {
        this.nowSpan = nowSpan;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
