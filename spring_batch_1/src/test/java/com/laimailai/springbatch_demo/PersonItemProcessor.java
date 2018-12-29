/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.laimailai.springbatch_demo;

import com.laimailai.springbatch_demo.entity.Person;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author sus
 * @version PersonItemProcessor.java, v 0.1 2018-12-29 14:50 sus
 */
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    public String inputFile;

    public PersonItemProcessor() {
    }

    public PersonItemProcessor(String inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public Person process(Person person) {
        System.out.println("handle person " + person.getName());
        return person;
    }
}
