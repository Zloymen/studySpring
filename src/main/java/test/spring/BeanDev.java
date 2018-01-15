package test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import test.spring.service.ContactService;

public class BeanDev {

    private ContactService personService;

    @Autowired
    public BeanDev(ContactService personService){
        this.personService = personService;
    }


    public BeanDev() {
        System.out.println("create dev");
    }
}
