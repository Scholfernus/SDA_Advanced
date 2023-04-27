package org.example.ZadaniaProgramowaniePDF.MyProjects;

public class Person {
    public String name;
    public String city;
    public int age;
    public String sex;

    public Person() {
    }

    public Person(String name, String city, int age, String sex) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
