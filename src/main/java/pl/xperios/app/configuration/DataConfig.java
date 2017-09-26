package pl.xperios.app.configuration;

import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.spring.SpringExceptionTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.querydsl.SimpleEntityPathResolver;
import org.springframework.data.querydsl.binding.QuerydslBindingsFactory;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

    @Autowired
    @Bean
    SQLQueryFactory sqlQueryFactory(DataSource dataSource) {
        return new SQLQueryFactory(querydslConfiguration(), new TransactionAwareDataSourceProxy(dataSource));
    }

    private com.querydsl.sql.Configuration querydslConfiguration() {
        SQLTemplates templates = MySQLTemplates.builder().build();
        com.querydsl.sql.Configuration configuration = new com.querydsl.sql.Configuration(templates);
        configuration.setExceptionTranslator(new SpringExceptionTranslator());

        return configuration;
    }


}