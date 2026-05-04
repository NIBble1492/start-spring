package com.back.domain.post.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Post {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private int id; // INT
    private final String title; // varchar(255)
    @Column(columnDefinition = "TEXT")
    private final String content;

    public Post() {
        this.title = "";
        this.content = "";
    }
}
