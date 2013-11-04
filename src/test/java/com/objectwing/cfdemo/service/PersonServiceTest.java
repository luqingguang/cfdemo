package com.objectwing.cfdemo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.objectwing.cfdemo.domain.Person;
import com.objectwing.cfdemo.service.PersonService;
import com.objectwing.cfdemo.service.config.ServicesConfiguration;

import javax.sql.DataSource;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("default")
@ContextConfiguration
public class PersonServiceTest {


    @Autowired
    private PersonService personService;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private DataSource dataSource;

    Date signupDate = new Date();

    String name = "Josh Long";

    String loginName = "joshlong@cn.ibm.com";
    
    String password = "password";

    JdbcTemplate jdbcTemplate;


    @Configuration
    @Import({ServicesConfiguration.class})
    public static class PersonServiceTestConfiguration {
        // noop we just want the beans in the ServicesConfiguration class
    }


    @Before
    public void before() throws Exception {

        jdbcTemplate = new JdbcTemplate(dataSource);

        TransactionTemplate transactionTemplate = new TransactionTemplate(this.transactionManager);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                jdbcTemplate.execute("delete from PERSON");
            }
        });
    }

    @Test
    public void testCreatingPeoples() {
        Person person = personService.createPerson(this.name, this.loginName,this.password, this.signupDate);
        assertNotNull("the person can't be null", person);
        assertEquals(person.getName(), this.name);
        assertEquals(person.getLoginName(), this.loginName);
        assertEquals(person.getSignupDate(), this.signupDate);
    }

    @Test
    public void testUpdatingAPeople() throws Exception {
    	 Person person = personService.createPerson(this.name, this.loginName,this.password, this.signupDate);
         assertNotNull("the person can't be null", person);
         assertEquals(person.getName(), this.name);
         assertEquals(person.getLoginName(), this.loginName);
         assertEquals(person.getSignupDate(), this.signupDate);

        personService.updatePerson(person.getId(), "Joshua", person.getPassword(), person.getSignupDate());

        person = personService.getPersonById(person.getId());
        assertEquals(person.getName(), "Joshua");

    }

    @Test
    public void testSearchingForPeoples() throws Exception {
        Person person = personService.createPerson(this.name, this.loginName,this.password, this.signupDate);

        assertEquals(1, personService.search("josh").size());
    }
}
