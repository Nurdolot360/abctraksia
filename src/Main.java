import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cow[] cows = {
            new Cow("100",4,"J","BOS"),
        new Cow("110",3,"M","liko"),
                new Cow("70",2,"M","Turei"),
                new Cow("90",5,"M","Lok"),
                new Cow("200",6,"J","MIK")};
        for (Cow cow:cows) {
            System.out.println(cow);
        }
        Sheep[] sheep = {
                new Sheep("40",3,"M","kiko"),
                new Sheep("50",4,"M","kiki"),
        };
        for (Sheep sheep1: sheep) {
            System.out.println(sheep1);
        }
        Hourse[] hourses = {
                new Hourse("200",3,"M","loki"),
                new Hourse("170",2,"J","kolik")
        };
        for (Hourse hourse : hourses) {
            System.out.println(hourse);
        }
        Farm farm = new Farm("Gagarina","Dastan",cows,hourses,sheep);
       Farm farm1 = new Farm("Maladieva","Joni",cows,hourses,sheep);
        System.out.println(farm);
            System.out.println(farm1);
        }

    }
