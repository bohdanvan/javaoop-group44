package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private final long id;
    private final String fullName;
    private final int age;

    private User(Builder builder) {
        this.id = builder.id;
        this.fullName = builder.name;
        this.age = builder.age;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(fullName, user.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private long id = IdGenerator.generateId();
        private String name;
        private int age;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
