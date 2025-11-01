package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public List<TaskStateEntity> getTaskStates() {
        return taskStates;
    }

    public void setTaskStates(List<TaskStateEntity> taskStates) {
        this.taskStates = taskStates;
    }
}
