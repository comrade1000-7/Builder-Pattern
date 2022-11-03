public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public boolean hasAge () {
        return age >= 0;
    }

    public boolean hasAddress () {
        return getAddress() != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        if (!hasAge()) {
            throw new IllegalArgumentException("Age unknown");
        }
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddressCity (String city) {
        address = city;
    }

    public void happyBirthday() {
        if (age >= 0) {
            age += 1;
        }
    }

    public PersonBuilder newChildBuilder () {
        return new PersonBuilder()
                .setSurname(getSurname())
                .setAge(0)
                .setAddress(getAddress());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}
