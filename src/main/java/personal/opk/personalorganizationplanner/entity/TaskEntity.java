package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
