package test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import test.spring.service.ContactService;

public class BeanDefault {

    private ContactService personService;

    @Autowired
    public BeanDefault(ContactService personService){
        this.personService = personService;
    }

    public BeanDefault() {
        System.out.println("create default");
    }
}
