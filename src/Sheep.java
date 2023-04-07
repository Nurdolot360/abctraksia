public class Sheep extends Animals  {

    public Sheep(String weight, int age, String gender, String nockName) {
        super(weight, age, gender, nockName);
    }

    @Override
    public String toString() {
        return "Sheep: " + super.toString();
    }
}
