package entity;

@HumanAnnotation(name = "Строитель")
public class Human {
    private static String type = "Гуманоид";
    private String name = "Вася";
    private final int money = 100;

//    public Human(int money) {
//        this.money = money;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", money=" + money +
                "}, type = " + type;
    }
}
