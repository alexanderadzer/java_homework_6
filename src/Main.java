import java.lang.reflect.Array;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[8];
//        exOne(person);
//        exTwo(person);

        exThree();

    }

    /*��������� �������� �� ���������� ������ ���������.
    ������� ������ �� 8 ����������� Person.
    ������� � ��� ��������� ������ ��������� ���������� ����(�.�. ���������� � ����������� ������,
    ���������� �� ����������������� ����� � �������). ���������� ������� ������ ���� ��������� � ����������
    �� ������������.
    ����� ���������� ������� ����������, ����� use-friendly ������� ���������� � ������ Person � ������� �
    ��������� ������� �������� � �������.
    */
    public static void exOne(Person[] person){
        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < person.length; i++) {
            System.out.println("������� ���:");
            String firstName = scanner.nextLine();
            System.out.println("������� �������:");
            String lastName = scanner.nextLine();
            person[i] = new Person(firstName,lastName);
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }



   /* ������ �2(�� ������ ����������)
    ��������� ������� ���������� �������������.

            1.�� �������� ������������� ������� � Person ����������� � ������������ �������-������.
2.����� �������������� ������ � Person(���������� ���������� ������)
3.����� ������� � ������� Person, ������ ��, � ������� ��������� ������� ��������� ����� � ������ 1.
*/
    public static void exTwo(Person[] person){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �������");
        String lastName = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < person.length; i++) {
            if (person[i].getLastName().equals(lastName)){
                System.out.println(person[i].toString());
            }
        }
    }

   /* ������ �3
    ������ � �������������

    ������� ��� ������, �������� ���:
    - Person � ������: firstName, lastName, age, sex, IQ. ���� firstName � lastName ������ ���� ��������� ���
     �������������� � ����������
    - Student(������ Person) � ������: groupId, specName, markArray(������ ������ ������������� �������,
    �� �� ������ 10 ���������), isBanned(boolean ����)

    � ������ Main ��������� ������� ������ Student � ������ Person. � ������ �� 5 �����������.
     ��� ������� �� ����������� ��������� ������
    �������� �� ��� ����(����� ����������� ��� ����� set ������).*/
    public static void exThree(){
       Person person1 = new Person("�������","��������",19,"Male",120);
       Person person2 = new Person("����","������",14,"Male",122);
       Person person3 = new Person("����","������",18,"Male",110);
       Person person4 = new Person("�������","��������",16,"Male",121);
       Person person5 = new Person("�����","�������",17,"Male",160);
        Person[] personExThree = {person1,person2,person3,person4,person5};
        System.out.println(personExThree);

        for (int i = 0; i < personExThree.length; i++) {
            System.out.println(personExThree[i].toString());

        }

      Student student1 = new Student("���������","�����������",15,"Male",120,333,
              "IT", randomArray(10),false);
      Student student2 = new Student("�����","�������",16,"Male",130,331,
              "IT", randomArray(10),false);
      Student student3 = new Student("��������","�����",17,"Male",140,335,
              "IT", randomArray(10),false);
      Student student4 = new Student("��������","����������",18,"Male",150,332,
              "IT", randomArray(10),false);
      Student student5 = new Student("�������","���������",19,"Male",110,332,
              "IT", randomArray(10),false);
        Student[] student ={student1,student2,student3,student4,student5};
        System.out.println(student);

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].toString());
        }
    }

    public static Integer[] randomArray(Integer number){
        Integer[] list = new Integer[number];
        for (int i=0; i<list.length; i++){
            int n = (int)(Math.random()*9 + 1);
            list[i] = n;
        }

        return list;
    }
}

