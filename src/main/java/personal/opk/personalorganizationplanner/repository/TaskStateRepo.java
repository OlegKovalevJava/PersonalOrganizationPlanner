package personal.opk.personalorganizationplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.opk.personalorganizationplanner.entity.TaskStateEntity;
import java.util.UUID;

public interface TaskStateRepo extends JpaRepository<TaskStateEntity, UUID> {
}
