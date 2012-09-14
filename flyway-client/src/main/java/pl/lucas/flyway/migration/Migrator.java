package pl.lucas.flyway.migration;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.googlecode.flyway.core.Flyway;

@Component
public class Migrator {

    static Logger logger = LoggerFactory.getLogger( Migrator.class );

    @Autowired
    private DataSource dataSource;

    static {
        logger.info( "loading migrator" );
    }

    public void migrate() {
        Flyway flyway = new Flyway();
        flyway.setDataSource( dataSource );
        flyway.migrate();
    }
}
