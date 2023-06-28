public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String sex;
    private Integer IQ;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Integer age, String sex, Integer IQ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.IQ = IQ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", IQ=" + IQ +
                '}';
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


