package com.rest.rest.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "server")
@Data
public class Student {
    private String id;
    private String name;
    private String language;
    private String frameWork;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(String id, String name, String language, String frameWork) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.frameWork = frameWork;
    }
}
