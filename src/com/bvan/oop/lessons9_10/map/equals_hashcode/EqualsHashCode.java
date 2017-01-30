package com.bvan.oop.lessons9_10.map.equals_hashcode;

/**
 * @author bvanchuhov
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        A x = new A(10, "Hello");
        A y = new A(10, "Hello");
        A z = new A(20, "Hello");

        System.out.println(x.equals(x)); // true
        System.out.println(x.equals(y)); // true
        System.out.println(y.equals(x)); // true
        System.out.println(x.equals(z)); // false
        System.out.println();

        System.out.println(x.hashCode() == x.hashCode()); // true
        System.out.println(x.hashCode() == y.hashCode()); // true
        System.out.println(x.hashCode() == z.hashCode()); // false (true when collision)
        System.out.println();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
    }
}

class A {
    private final int x;
    private final String s;

    public A(int x, String s) {
        this.x = x;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (x != a.x) return false;
        return s != null ? s.equals(a.s) : a.s == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (s != null ? s.hashCode() : 0);
        return result;
    }
}
