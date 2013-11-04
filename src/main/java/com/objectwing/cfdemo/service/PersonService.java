package com.objectwing.cfdemo.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.objectwing.cfdemo.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
@SuppressWarnings("unchecked")
@Transactional
public class PersonService {

    static private final String CUSTOMERS_REGION = "persons";

    @PersistenceContext
    private EntityManager em;

    public Person createPerson(String name, String loginName, String password, Date signupDate) {
        Person person = new Person();
        person.setName(name);
        person.setLoginName(loginName);
        person.setPassword(password);
        person.setSignupDate(signupDate);
        em.persist(person);
        return person;
    }

    public Collection<Person> search(String name) {
        String sqlName = ("%" + name + "%").toLowerCase();
        String sql = "select c.* from person c where (LOWER( c.name ) LIKE :name )";
        return em.createNativeQuery(sql, Person.class)
                .setParameter("name", sqlName)               
                .getResultList();
    }


    @Transactional(readOnly = true)
    public List<Person> getAllPersons() {
        return em.createQuery("SELECT * FROM " + Person.class.getName()).getResultList();
    }


    @Cacheable(CUSTOMERS_REGION)
    @Transactional(readOnly = true)
    public Person getPersonById(Integer id) {
        return em.find(Person.class, id);
    }

    @CacheEvict(CUSTOMERS_REGION)
    public void deletePerson(Integer id) {
        Person person = getPersonById(id);
        em.remove(person);
    }

    @CacheEvict(value = CUSTOMERS_REGION, key = "#id")
    public void updatePerson(Integer id, String name, String password, Date birthday) {
        Person person = getPersonById(id);
        person.setName(name);
        person.setSignupDate(birthday);
        person.setPassword(password);        
        em.merge(person);
    }
}
