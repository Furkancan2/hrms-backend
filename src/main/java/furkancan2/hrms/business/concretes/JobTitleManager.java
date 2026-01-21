package furkancan2.hrms.business.concretes;

import furkancan2.hrms.business.abstracts.JobTitleService;
import furkancan2.hrms.core.utilities.results.DataResult;
import furkancan2.hrms.core.utilities.results.Result;
import furkancan2.hrms.core.utilities.results.SuccessDataResult;
import furkancan2.hrms.core.utilities.results.SuccessResult;
import furkancan2.hrms.dataAccess.abstracts.JobTitleDao;
import furkancan2.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>
                (this.jobTitleDao.findAll(), "List of job positions");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("Job position added");
    }
}