package com.example.demojooq;

import com.example.demojooq.repositorys.PersonRepository;
import org.jooq.generated.tables.records.PersonsRecord;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJooqApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DemoJooqApplicationTests.class);

    @Autowired
    PersonRepository personRepository;

    @Test
    void select() {
        PersonsRecord person = personRepository.selectByPersonPassport("1234 123456");
        logger.info(person.toString());
    }

}
