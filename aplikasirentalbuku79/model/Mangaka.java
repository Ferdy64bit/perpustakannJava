package aplikasirentalbuku79.model;

public class Mangaka extends Author{
    private int age;
    private String country;

    public Mangaka(String name, int age, String country) {
        super(name);
        this.age = age;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
