package com.evsendo.console;

import com.evsendo.core.Person;
import com.evsendo.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class App {
    private static PersonService personService = new PersonService();
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello");

        Person person = new Person();
        person.setFirstName("Evgeny");
        person.setSecondName("Sendo");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person fromJSON = personService.parse(json);
        System.out.println(fromJSON);
    }
}
