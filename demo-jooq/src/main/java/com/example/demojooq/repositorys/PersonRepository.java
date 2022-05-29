package com.example.demojooq.repositorys;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.Persons;
import org.jooq.generated.tables.records.PersonsRecord;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PersonRepository 

    private final DSLContext dsl;

    public PersonsRecord selectByPersonPassport(String passportSerial) {
        return dsl.selectFrom(Persons.PERSONS)
                .where(Persons.PERSONS.PASSPORT_SERIAL.eq(passportSerial))
                .fetchOne();
    }

//    public void insertInto(int id, String name, String surname) {
//        dsl.insertInto(Persons.PERSONS)
//                .values(id, name, surname)
//                .execute();
//    }
}
