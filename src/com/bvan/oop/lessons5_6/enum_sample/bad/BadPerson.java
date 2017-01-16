package com.bvan.oop.lessons5_6.enum_sample.bad;

/**
 * @author bvanchuhov
 */
public class BadPerson {

    public static final int FEMALE = 1;
    public static final int MALE = 2;
    public static final int UNDEFINED = 3;

    private final String name;
    private final int age;
    private final int gender;

    public BadPerson(String name, int age, int gender) {
        checkGender(gender);
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void checkGender(int gender) {
        if (gender < 1 || gender > 3) {
            throw new IllegalArgumentException("incorrect gender: " + gender);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getGenderName() {
        switch (gender) {
            case MALE: return "male";
            case FEMALE: return "female";
            default:
            case UNDEFINED: return "unknown";
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + getGenderName() +
                '}';
    }
}
