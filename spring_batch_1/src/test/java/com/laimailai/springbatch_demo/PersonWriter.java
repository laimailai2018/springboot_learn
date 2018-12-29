/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.laimailai.springbatch_demo;

import com.laimailai.springbatch_demo.entity.Person;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @author sus
 * @version PersonWriter.java, v 0.1 2018-12-29 14:50 sus
 */
public class PersonWriter implements ItemWriter<Person> {
    @Override
    public void write(List<? extends Person> list) throws Exception {
        for (Person person : list) {
            System.out.println(person.getName());
        }
    }
}
