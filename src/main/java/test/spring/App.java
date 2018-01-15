package test.spring;

import com.force.api.DescribeSObject;
import org.springframework.context.support.GenericXmlApplicationContext;
import test.spring.entity.User;
import test.spring.service.CaseService;
import test.spring.service.ContactService;
import test.spring.service.UserService;

/**
 *
 * -Dspring.profiles.active="develop, default"
 */
public class App{
    public static void main( String[] args ){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("default");
        ctx.load("context.xml");
        ctx.refresh();
        Object objectPersonService = ctx.getBean(ContactService.class);
        ContactService personService = (ContactService) objectPersonService;

/*        System.out.println("list persons");
        for (Person person :  personService.listPeople()){
            System.out.println(person);
        }*/

        Object objectCaseService = ctx.getBean(CaseService.class);
        CaseService caseService = (CaseService) objectCaseService;

        Object objectUserService = ctx.getBean(UserService.class);
        UserService userService = (UserService) objectUserService;

/*        System.out.println("list cases");
        for (Case oneCase :  caseService.getAll()){
            System.out.println(oneCase);
        }*/

        System.out.println("list users");
        for (User one :  userService.getAll()){
            System.out.println(one);
        }

        System.out.println("Metadata case");
        DescribeSObject describeSObject = userService.getMetaData();
        for(DescribeSObject.Field field : describeSObject.getFields()){
            System.out.println(field.getName() + " = " + field.getType() + " = " + field.getSoapType());
            for(String reference : field.getReferenceTo()){
                System.out.println(reference);
            }
        }


        ctx.close();
    }
}
