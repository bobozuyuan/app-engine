package com.appengine.task.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Authors: sofn
 * Version: 1.0  Created at 2015-10-12 00:12.
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String description;
    @Column(name = "uid", nullable = false)
    public long uid;

    public Task(String title, String description, long uid) {
        this.title = title;
        this.description = description;
        this.uid = uid;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
}
