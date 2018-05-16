package com.example.randomwriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import sun.misc.Cache;

import javax.annotation.Resource;

public class Randomwriter{
    private final long id;

    private final String content;

    public Randomwriter(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
