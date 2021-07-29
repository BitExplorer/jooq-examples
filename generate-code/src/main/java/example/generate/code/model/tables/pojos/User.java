/*
 * This file is generated by jOOQ.
 */
package example.generate.code.model.tables.pojos;


import example.generate.code.model.tables.interfaces.IUser;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(
    name = "user",
    schema = "public",
    uniqueConstraints = {
        @UniqueConstraint(name = "user_pkey", columnNames = { "id" })
    }
)
public class User implements IUser {

    private static final long serialVersionUID = -1440021610;

    private Long      id;
    private String    name;
    private Integer   age;
    private String    gender;
    private LocalDate birthday;

    public User() {}

    public User(IUser value) {
        this.id = value.getId();
        this.name = value.getName();
        this.age = value.getAge();
        this.gender = value.getGender();
        this.birthday = value.getBirthday();
    }

    public User(
        Long      id,
        String    name,
        Integer   age,
        String    gender,
        LocalDate birthday
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 64)
    @Override
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.user.id</code>.
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.user.name</code>.
     */
    @Column(name = "name")
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>public.user.name</code>.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>public.user.age</code>.
     */
    @Column(name = "age", precision = 32)
    @Override
    public Integer getAge() {
        return this.age;
    }

    /**
     * Setter for <code>public.user.age</code>.
     */
    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter for <code>public.user.gender</code>.
     */
    @Column(name = "gender")
    @Override
    public String getGender() {
        return this.gender;
    }

    /**
     * Setter for <code>public.user.gender</code>.
     */
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Getter for <code>public.user.birthday</code>.
     */
    @Column(name = "birthday")
    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }

    /**
     * Setter for <code>public.user.birthday</code>.
     */
    @Override
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(age);
        sb.append(", ").append(gender);
        sb.append(", ").append(birthday);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUser from) {
        setId(from.getId());
        setName(from.getName());
        setAge(from.getAge());
        setGender(from.getGender());
        setBirthday(from.getBirthday());
    }

    @Override
    public <E extends IUser> E into(E into) {
        into.from(this);
        return into;
    }
}
