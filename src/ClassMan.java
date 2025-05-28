public class ClassMan {

    private String name;
    private int age;
    private String Complexion;

    ClassMan(String name, int age, String complexion) {
        this.name = name;
        this.age = age;
        this.Complexion = complexion;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "My name is " + name + ". I am " + age + " years old. I live in this town.";
    }
}
