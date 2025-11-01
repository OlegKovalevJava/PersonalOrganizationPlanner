package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class TaskStateEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;

    private String description;

    @OneToMany
    private List<TaskStateEntity> taskStates;
}
