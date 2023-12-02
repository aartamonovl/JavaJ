package homework2.task1;

public class Dog extends Animal{
    private String size;
    private String woolLength;

    public Dog(String name, int age, String size, String woolLength) {
        super(name, age);
        this.size = size;
        this.woolLength = woolLength;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWoolLength() {
        return woolLength;
    }

    public void setWoolLength(String woolLength) {
        this.woolLength = woolLength;
    }

    public void makeSound(){
        System.out.println("Wof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                ", woolLength='" + woolLength + '\'' +
                "} " + super.toString();
    }
}
