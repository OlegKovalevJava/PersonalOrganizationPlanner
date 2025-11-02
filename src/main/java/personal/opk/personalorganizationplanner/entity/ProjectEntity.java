package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "project")
public class ProjectEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;

    private Instant createAt = Instant.now();

    @OneToMany
    private List<TaskStateEntity> taskStates;
}
