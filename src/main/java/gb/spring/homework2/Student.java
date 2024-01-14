package gb.spring.homework2;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Student {
    private static Long idCounter = 1L;
    private final long id;
    private String name;
    private String groupName;

    @JsonCreator
    public Student(String name, String groupName) {
        this.id = idCounter++;
        this.name = name;
        this.groupName = groupName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
