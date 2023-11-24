public class Animal {

    private int totalFeet;
    private String color;

    public Animal(int totalFeet, String color) {
        this.totalFeet = totalFeet;
        this.color = color;
    }

    public int getTotalFeet() {
        return totalFeet;
    }

    public void setTotalFeet(int totalFeet) {
        this.totalFeet = totalFeet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
