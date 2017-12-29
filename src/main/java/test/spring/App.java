package test.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * -Dspring.profiles.active="develop, default"
 */
public class App{
    public static void main( String[] args ){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //ctx.getEnvironment().setActiveProfiles("default");
        ctx.load("context.xml");
        ctx.refresh();
        ctx.close();
    }
}
