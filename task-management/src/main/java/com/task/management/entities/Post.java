package com.task.management.entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String date;
}
