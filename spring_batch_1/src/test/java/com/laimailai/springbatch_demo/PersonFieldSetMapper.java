/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.laimailai.springbatch_demo;

import com.laimailai.springbatch_demo.entity.Person;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

/**
 * @author sus
 * @version PersonFieldSetMapper.java, v 0.1 2018-12-29 14:50 sus
 */
public class PersonFieldSetMapper implements FieldSetMapper<Person> {

    @Override
    public Person mapFieldSet(FieldSet fieldSet) {
        String name = fieldSet.readRawString("name");
        int age = fieldSet.readInt("age");
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}
