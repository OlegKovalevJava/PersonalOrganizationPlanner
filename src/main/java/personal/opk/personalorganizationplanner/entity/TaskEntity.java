package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;

    private Instant createdAt = Instant.now();

    private String description;
}
