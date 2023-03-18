package com.hillel.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserPojo {
    private String name;
    private String job;

    public CreateUserPojo(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "CreateUserPojo{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
