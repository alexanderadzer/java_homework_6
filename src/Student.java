import java.util.Arrays;

public class Student extends Person {
    private Integer groupId;
    private String specName;
    private Integer[] markArray;
    private boolean isBanned;

    public Student(String firstName, String lastName, Integer age, String sex, Integer IQ, Integer groupId,
                   String specName, Integer[] markArray, boolean isBanned) {
        super(firstName, lastName, age, sex, IQ);
        this.groupId = groupId;
        this.specName = specName;
        this.markArray = markArray;
        this.isBanned = isBanned;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupId=" + groupId +
                ", specName='" + specName + '\'' +
                ", markArray=" + Arrays.toString(markArray) +
                ", isBanned=" + isBanned +
                '}';
    }
}
