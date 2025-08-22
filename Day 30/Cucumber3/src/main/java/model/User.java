package model;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return name + " (" + age + ") - " + email;
    }

    // Equals and hashCode for testing purposes
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + email.hashCode();
    }
}
