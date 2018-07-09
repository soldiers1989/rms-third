package com.jzfq.rms.third.test.linkQueue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "test_queue")
public class DemoObject {
    @Id
    @JsonIgnore
    private String id;
    @Indexed
    private String name;
    @Indexed
    private String age;


    public DemoObject(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
