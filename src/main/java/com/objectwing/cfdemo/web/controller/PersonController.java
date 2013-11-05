package com.objectwing.cfdemo.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.objectwing.cfdemo.domain.Person;
import com.objectwing.cfdemo.service.PersonService;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Controller
public class PersonController {
    private Logger log = Logger.getLogger(getClass());

    @Autowired  private PersonService personService;

    public static final String PERSON_ENTRY_URL = "/person";
    public static final String PERSON_SEARCH_URL = "/person/search";
    public static final String PERSON_BY_ID_ENTRY_URL = PERSON_ENTRY_URL + "/{id}";

    @ResponseBody
    @RequestMapping(value = PERSON_SEARCH_URL, method = RequestMethod.GET)
    public Collection<Person> search(@RequestParam("q") String query) throws Exception {
        Collection<Person> persons = personService.search(query);
        if (log.isDebugEnabled())
            log.debug(String.format("retrieved %s results for search query '%s'", Integer.toString(persons.size()), query));
        return persons;
    }

    @ResponseBody
    @RequestMapping(value = PERSON_BY_ID_ENTRY_URL, method = RequestMethod.GET)
    public Person personById(@PathVariable  Integer id) {
        return this.personService.getPersonById(id);
    }

    @ResponseBody
    @RequestMapping(value = PERSON_ENTRY_URL, method = RequestMethod.GET)
    public List<Person> persons() {
        return this.personService.getAllPersons();
    }

    @ResponseBody
    @RequestMapping(value = PERSON_ENTRY_URL, method = RequestMethod.POST)
    public Integer addPerson(@RequestParam String name, @RequestParam String loginName
    		,@RequestParam String password) {
        return personService.createPerson(name, loginName, password, new Date()).getPersonId();
    }

    @ResponseBody
    @RequestMapping(value = PERSON_BY_ID_ENTRY_URL, method = RequestMethod.PUT)
    public Integer updatePerson(@PathVariable  Integer id, @RequestBody Person person) {
        personService.updatePerson(id, person.getName(), person.getPassword(), person.getSignupDate());
        return id;
    }
}