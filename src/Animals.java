public class Animals {
    private String weight;
    private int age;
    private String  gender;
    private  String nockName;

    public Animals() {
    }

    public Animals(String weight, int age, String gender, String nockName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nockName = nockName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNockName() {
        return nockName;
    }

    public void setNockName(String nockName) {
        this.nockName = nockName;
    }

    @Override
    public String toString() {
        return "Animals:" +" + "+"\n"+
                "weight: " + weight + "\n" +
                "age: " + age +"\n"+
                "genderL: " + gender + "\n" +
                "nockName: " + nockName + "\n";
    }
}
