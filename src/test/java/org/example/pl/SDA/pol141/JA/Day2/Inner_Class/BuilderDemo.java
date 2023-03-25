package org.example.pl.SDA.pol141.JA.Day2.Inner_Class;

import java.time.LocalDateTime;

public class BuilderDemo {
    public static void main(String[] args) {
        Message.Builder builder = new Message.Builder();
        final Message message = builder.build();
        builder.content("Hello").createdAt(LocalDateTime.now()).build();
        System.out.println(message.getContent());
    }
}
