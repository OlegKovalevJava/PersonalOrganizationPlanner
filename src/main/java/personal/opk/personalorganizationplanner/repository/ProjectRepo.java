package personal.opk.personalorganizationplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.opk.personalorganizationplanner.entity.ProjectEntity;
import java.util.UUID;

public interface ProjectRepo extends JpaRepository<ProjectEntity, UUID> {
}
