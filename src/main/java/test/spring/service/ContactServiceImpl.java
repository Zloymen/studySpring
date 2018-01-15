package test.spring.service;

import com.force.api.QueryResult;
import org.springframework.stereotype.Service;
import test.spring.entity.Contact;

import java.util.List;

@Service
public class ContactServiceImpl extends ForseService implements ContactService {


    public void addPerson(Contact person) {
        getForceApi().createSObject("Contact", person);
    }

    public List<Contact> listPeople() {
        QueryResult<Contact> res = getForceApi().query("SELECT Id, FirstName, LastName FROM Contact", Contact.class);
        return res.getRecords();
    }

    public void removePerson(String id) {
        getForceApi().deleteSObject("Contact", id);
    }

    String getType() {
        return "Contact";
    }
}
