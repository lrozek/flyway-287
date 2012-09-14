package pl.lucas.flyway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.lucas.flyway.migration.Migrator;

public class Main {

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext( "classpath:/application-context.xml" );
        Migrator migrator = applicationContext.getBean( Migrator.class );
        migrator.migrate();
    }
}
