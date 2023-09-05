package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.Person;

public class Author extends Person{
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String fullName() {
        return getName();
    }
}
