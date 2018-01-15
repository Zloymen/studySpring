package test.spring.service;


import test.spring.entity.Contact;

import java.util.List;

public interface ContactService extends IForseService {
    void addPerson(Contact person);
    List<Contact> listPeople();
}
