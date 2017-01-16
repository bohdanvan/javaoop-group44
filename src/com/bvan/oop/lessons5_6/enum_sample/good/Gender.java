package com.bvan.oop.lessons5_6.enum_sample.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNDEFINED("unknown");

    private final String genderName;

    public static boolean isGender(String genderName) {
        for (Gender gender : Gender.values()) {
            if (gender.name().equals(genderName)) {
                return true;
            }
        }
        return false;
    }

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
