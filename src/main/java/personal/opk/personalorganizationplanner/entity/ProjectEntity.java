package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project")
public class ProjectEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String name;

    @Builder.Default
    private Instant createAt = Instant.now();

    @Builder.Default
    @OneToMany
    private List<TaskStateEntity> taskStates = new ArrayList<>();
}
