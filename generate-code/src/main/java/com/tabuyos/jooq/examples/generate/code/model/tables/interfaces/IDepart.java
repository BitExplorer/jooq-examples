/*
 * This file is generated by jOOQ.
 */
package com.tabuyos.jooq.examples.generate.code.model.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

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
    name = "depart",
    schema = "tabuyos",
    uniqueConstraints = {
        @UniqueConstraint(name = "KEY_depart_PRIMARY", columnNames = { "id" })
    }
)
public interface IDepart extends Serializable {

    /**
     * Setter for <code>tabuyos.depart.id</code>. user id
     */
    public void setId(Integer value);

    /**
     * Getter for <code>tabuyos.depart.id</code>. user id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, precision = 10)
    public Integer getId();

    /**
     * Setter for <code>tabuyos.depart.name</code>. user name
     */
    public void setName(String value);

    /**
     * Getter for <code>tabuyos.depart.name</code>. user name
     */
    @Column(name = "name", nullable = false, length = 20)
    public String getName();

    /**
     * Setter for <code>tabuyos.depart.age</code>. user age
     */
    public void setAge(Integer value);

    /**
     * Getter for <code>tabuyos.depart.age</code>. user age
     */
    @Column(name = "age", precision = 10)
    public Integer getAge();

    /**
     * Setter for <code>tabuyos.depart.local</code>. user gender
     */
    public void setLocal(Integer value);

    /**
     * Getter for <code>tabuyos.depart.local</code>. user gender
     */
    @Column(name = "local", precision = 10)
    public Integer getLocal();

    /**
     * Setter for <code>tabuyos.depart.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value);

    /**
     * Getter for <code>tabuyos.depart.create_time</code>.
     */
    @Column(name = "create_time", nullable = false)
    public LocalDateTime getCreateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IDepart
     */
    public void from(IDepart from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IDepart
     */
    public <E extends IDepart> E into(E into);
}
