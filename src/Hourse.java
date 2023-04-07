public class Hourse  extends Animals{
    private String color;


    public Hourse(String weight, int age, String gender, String nockName) {
        super(weight, age, gender, nockName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hourse: " +
                "color: " + color + "\n"+super.toString();
    }
}

