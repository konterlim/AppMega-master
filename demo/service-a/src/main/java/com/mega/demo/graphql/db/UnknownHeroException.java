package com.mega.demo.graphql.db;

@SuppressWarnings("serial")
public class UnknownHeroException extends Exception {

    public UnknownHeroException(String message) {
        super(message);
    }
}
