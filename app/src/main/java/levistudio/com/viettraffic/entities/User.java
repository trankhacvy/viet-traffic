package levistudio.com.viettraffic.entities;

/**
 * Created by Levi on 7/24/2016.
 */

public class User {
    private String name;
    private int age;
    private boolean sex;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
