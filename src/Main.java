import java.lang.reflect.Array;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[8];
//        exOne(person);
//        exTwo(person);

        exThree();

    }

    /*Используя материал из предыдущей работы требуется.
    Создать массив из 8 экземпляров Person.
    Фамилию и имя требуется задать используя консольный ввод(т.е. передавать в конструктор данные,
    полученные от пользовательского ввода в консоль). Консольные диалоги должны быть построены с ориентиром
    на пользователя.
    После заполнения массива элементами, также use-friendly вывести информацию о каждом Person в консоль с
    указанием индекса элемента в массиве.
    */
    public static void exOne(Person[] person){
        Scanner scanner = new Scanner(System.in);

        for (int i= 0; i < person.length; i++) {
            System.out.println("Введите имя:");
            String firstName = scanner.nextLine();
            System.out.println("Введите фамилию:");
            String lastName = scanner.nextLine();
            person[i] = new Person(firstName,lastName);
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }



   /* Задача №2(на основе предыдущей)
    Требуется сделать фильтрацию пользователей.

            1.До процесса инициализации массива с Person запрашиваем у пользователя фамилию-фильтр.
2.Далее инициализируем массив с Person(аналогично предыдущей задачи)
3.Далее выводим в консоль Person, только те, у которых совпадает фамилия указанная ранее в пункте 1.
*/
    public static void exTwo(Person[] person){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String lastName = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < person.length; i++) {
            if (person[i].getLastName().equals(lastName)){
                System.out.println(person[i].toString());
            }
        }
    }

   /* Задача №3
    Работа с наследованием

    Создать два класса, согласно ООП:
    - Person с полями: firstName, lastName, age, sex, IQ. Поля firstName и lastName должны быть запрещены для
     редактирования в дальнейшем
    - Student(предок Person) с полями: groupId, specName, markArray(массив оценок произвольного размера,
    но не меньше 10 элементов), isBanned(boolean поле)

    В классе Main требуется создать массив Student и массив Person. В каждом по 5 экземпляров.
     Для каждого из экземпляров требуется задать
    значения во все поля(через конструктор или через set методы).*/
    public static void exThree(){
       Person person1 = new Person("Виталий","Витальев",19,"Male",120);
       Person person2 = new Person("Петр","Петров",14,"Male",122);
       Person person3 = new Person("Иван","Иванов",18,"Male",110);
       Person person4 = new Person("Николай","Николаев",16,"Male",121);
       Person person5 = new Person("Сидор","Сидоров",17,"Male",160);
        Person[] personExThree = {person1,person2,person3,person4,person5};
        System.out.println(personExThree);

        for (int i = 0; i < personExThree.length; i++) {
            System.out.println(personExThree[i].toString());

        }

      Student student1 = new Student("Александр","Александров",15,"Male",120,333,
              "IT", randomArray(10),false);
      Student student2 = new Student("Захар","Захаров",16,"Male",130,331,
              "IT", randomArray(10),false);
      Student student3 = new Student("Геннадий","Дашко",17,"Male",140,335,
              "IT", randomArray(10),false);
      Student student4 = new Student("Аристарх","Аристархов",18,"Male",150,332,
              "IT", randomArray(10),false);
      Student student5 = new Student("Архимед","Архимедов",19,"Male",110,332,
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

