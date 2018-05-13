package id.brainmaster.iso20022;

import id.brainmaster.iso20022.model.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableWebFlux
@ComponentScan(basePackages = {"id.brainmaster.iso20022.controller","id.brainmaster.iso20022.service", "id.brainmaster.iso20022.model"})
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public JAXBContext getJaxbContext() throws JAXBException {
        return JAXBContext.newInstance(Document.class);
    }
}
