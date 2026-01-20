package furkancan2.hrms.business.abstracts;

import furkancan2.hrms.entities.concretes.JobTitle;
import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}