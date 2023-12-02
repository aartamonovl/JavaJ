package homework2.task2.models;

import homework2.task2.Column;

import java.util.UUID;

@homework2.task2.Entity
public class Entity {

    @Column(name = "id", primaryKey = true)
    private UUID id;

}
