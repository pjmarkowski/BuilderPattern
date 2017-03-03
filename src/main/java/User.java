public class User{
    private final String name;
    private final String surname;
    private final String email;
    private final int age;
    private final String city;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.age = builder.age;
        this.city = builder.city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private String email;
        private int age;
        private String city;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder city(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}