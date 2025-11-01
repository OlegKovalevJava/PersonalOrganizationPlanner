package personal.opk.personalorganizationplanner.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class TaskEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
}
