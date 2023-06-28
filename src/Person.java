public class Person {
    private String firstName;
    private String lastName;
    //private String patronymic;

    public Person() {
    }

    public Person(String firstName, String lastName/*, String patronymic*/) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя = '" + firstName + '\'' +
                ", Фамилия = '" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean compare(String name) {
        if (getLastName().equals(name)) {
            System.out.println(true);
            return true;
        }

        System.out.println(false);
        return false;
    }
//    public void add(String firstName, String lastName){
//        Person person1 = new Person(firstName, lastName);
//    }

}


