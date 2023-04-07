public class Cow extends Animals{


    public Cow(String weight, int age, String gender, String nockName) {
        super(weight, age, gender, nockName);
    }

    @Override
    public String toString() {
        return "Cow: " +super.toString();
    }
}
