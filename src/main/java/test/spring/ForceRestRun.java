package test.spring;

import org.springframework.context.support.GenericXmlApplicationContext;
import test.spring.entity.Case;
import test.spring.service.CaseService;
import test.spring.service.ContactService;
import test.spring.service.UserService;

public class ForceRestRun {
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

        Case newCase = new Case();

        //0057F000001jZFuQAM
        //newCase.setCreatedById("0057F000001jZFuQAM");
        newCase.setDescription("insert test case");
        newCase.setPriority("High");
        newCase.setStatus("Working");
        newCase.setSubject("query for M2M support");
        newCase.setReason("reason M2M ");
        newCase.setOrigin("Web");

        caseService.add(newCase);

        System.out.println("list cases");
        for (Case oneCase :  caseService.getAll()){
            System.out.println(oneCase);
        }

/*        System.out.println("list users");
        for (User one :  userService.getAll()){
            System.out.println(one);
        }*/

        /*System.out.println("Metadata case");
        DescribeSObject describeSObject = userService.getMetaData();
        for(DescribeSObject.Field field : describeSObject.getFields()){
            System.out.println(field.getName() + " = " + field.getType() + " = " + field.getSoapType());
            for(String reference : field.getReferenceTo()){
                System.out.println(reference);
            }
        }*/


        ctx.close();
    }
}
