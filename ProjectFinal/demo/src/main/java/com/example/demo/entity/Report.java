package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Reports")
@Table(name = "Reports", schema = "PUBLIC")
@NamedQueries({
        @NamedQuery(name = "Reports.getAll", query = "SELECT s FROM Reports s"),
})
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report_seq")
    @Column(name = "report_id", updatable = false, nullable = false)
    private Long id;
    @Column
    private String object;
    @Column
    private String description;
    @Column
    private LocalDateTime dateTime;

    public Report(){}

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Report(Long id, String  object, String description){
        this.id = id;
        this.description = description;
        this.object = object;
        this.dateTime = LocalDateTime.now();
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
