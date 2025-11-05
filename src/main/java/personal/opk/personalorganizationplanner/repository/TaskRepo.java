package personal.opk.personalorganizationplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.opk.personalorganizationplanner.entity.TaskEntity;
import java.util.UUID;

public interface TaskRepo extends JpaRepository<TaskEntity, UUID> {
}
