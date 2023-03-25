package org.example.pl.SDA.pol141.JA.Day2.Inner_Class;

import java.time.LocalDateTime;

public class Message {
    private String content;
    private LocalDateTime createdAt;
    private String subject;

    private Message(String content, LocalDateTime createdAt, String subject) {
        this.content = content;
        this.createdAt = createdAt;
        this.subject = subject;
    }


    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public static class Builder {
        private String content;
        private LocalDateTime createdAt;
        private String subject;

        public Builder() {
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder createdAt(LocalDateTime local) {
            this.createdAt = local;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Message build() {
            return new Message(content, createdAt, subject);
        }

    }
}
