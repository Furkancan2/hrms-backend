package furkancan2.hrms.dataAccess.abstracts;

import furkancan2.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {


}