package aplikasirentalbuku79.model;

public class Novelis extends Author{
    private int age;
    private String country;

    public Novelis(String name, int age, String country) {
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
