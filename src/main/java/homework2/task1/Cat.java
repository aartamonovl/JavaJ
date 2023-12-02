package homework2.task1;

public class Cat extends Animal{
    private String love;
    private String lovelyPlace;

    public Cat(String name, int age, String love, String lovelyPlace) {
        super(name, age);
        this.love = love;
        this.lovelyPlace = lovelyPlace;
    }

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getLovelyPlace() {
        return lovelyPlace;
    }

    public void setLovelyPlace(String lovelyPlace) {
        this.lovelyPlace = lovelyPlace;
    }

    public void makeSound(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "love='" + love + '\'' +
                ", lovelyPlace='" + lovelyPlace + '\'' +
                "} " + super.toString();
    }
}
