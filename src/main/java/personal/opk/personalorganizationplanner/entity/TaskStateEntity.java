package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "task_state")
public class TaskStateEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;

    private Long ordinal;

    private Instant createdAt = Instant.now();

    @OneToMany
    private List<TaskEntity> tasks;
}
