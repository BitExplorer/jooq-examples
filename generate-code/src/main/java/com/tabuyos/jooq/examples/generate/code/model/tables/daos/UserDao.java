/*
 * This file is generated by jOOQ.
 */
package com.tabuyos.jooq.examples.generate.code.model.tables.daos;


import com.tabuyos.jooq.examples.generate.code.model.tables.User;
import com.tabuyos.jooq.examples.generate.code.model.tables.records.UserRecord;

import java.time.LocalDate;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class UserDao extends DAOImpl<UserRecord, com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(User.USER, com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User.class, configuration);
    }

    @Override
    public Long getId(com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchRangeOfId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(User.USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchById(Long... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User fetchOneById(Long value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchByName(String... values) {
        return fetch(User.USER.NAME, values);
    }

    /**
     * Fetch records that have <code>age BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchRangeOfAge(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(User.USER.AGE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>age IN (values)</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchByAge(Integer... values) {
        return fetch(User.USER.AGE, values);
    }

    /**
     * Fetch records that have <code>gender BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchRangeOfGender(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.GENDER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>gender IN (values)</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchByGender(String... values) {
        return fetch(User.USER.GENDER, values);
    }

    /**
     * Fetch records that have <code>birthday BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchRangeOfBirthday(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(User.USER.BIRTHDAY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>birthday IN (values)</code>
     */
    public List<com.tabuyos.jooq.examples.generate.code.model.tables.pojos.User> fetchByBirthday(LocalDate... values) {
        return fetch(User.USER.BIRTHDAY, values);
    }
}
