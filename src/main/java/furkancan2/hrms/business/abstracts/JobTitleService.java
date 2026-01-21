package furkancan2.hrms.business.abstracts;

import furkancan2.hrms.core.utilities.results.DataResult;
import furkancan2.hrms.core.utilities.results.Result;
import furkancan2.hrms.entities.concretes.JobTitle;
import java.util.List;

public interface JobTitleService {
    DataResult<List<JobTitle>> getAll();

    Result add(JobTitle jobTitle);

}