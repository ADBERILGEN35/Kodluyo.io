package kodlamaio.Hrms.business.concretes;


import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.*;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertsDao;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobAdvertisementManager implements JobAdvertisementService {
    private final JobAdvertsDao jobAdvertsDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertsDao jobAdvertsDao) {
        this.jobAdvertsDao = jobAdvertsDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getJobAdvertisement() {
        if ((long) this.jobAdvertsDao.findAll().size() > 0) {
            return new SuccessDataResult<>(this.jobAdvertsDao.findAll(), "Success: Tüm iş ilanları listelendi.");
        }
        return new WarningDataResult<>(this.jobAdvertsDao.findAll(), "Warning: Herhangi bir iş ilanı bulunamadı!");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getActiveJobAdvertisement() {
        if ((long) this.jobAdvertsDao.findAllByIsActiveTrue().size() > 0) {
            return new SuccessDataResult<>(
                    this.jobAdvertsDao.findAllByIsActiveTrue(),
                    "Success: Aktif tüm iş ilanları listelendi!");
        }
        return new WarningDataResult<>(
                this.jobAdvertsDao.findAllByIsActiveTrue(),
                "Warning: Aktif iş ilanı bulunamadı!");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getActiveJobAdvertisementForEmployer(String companyName) {
        if ((long) this.jobAdvertsDao.getJobAdvertByIsActiveTrueAndEmployer_CompanyName(companyName).size() > 0) {
            return new SuccessDataResult<>(this.jobAdvertsDao.getJobAdvertByIsActiveTrueAndEmployer_CompanyName(
                    companyName), "Success: Şirket'e ait tüm ilanlar listelendi!");
        }

        return new WarningDataResult<>(
                this.jobAdvertsDao.getJobAdvertByIsActiveTrueAndEmployer_CompanyName(companyName),
                "Warning: Şirket'e ait herhangi bir ilan bulunamadı!");

    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllByIsActiveTrue() {
        Sort sort = Sort.by(Sort.Direction.DESC, "airdate");
        if ((long) this.jobAdvertsDao.findAllByIsActiveTrue(sort).size() > 0) {
            return new SuccessDataResult<>(
                    this.jobAdvertsDao.findAllByIsActiveTrue(sort),
                    "Success: Aktif tüm iş ilanları yayınlanma tarihine göre listelendi!");
        }
        return new WarningDataResult<>(
                this.jobAdvertsDao.findAllByIsActiveTrue(sort),
                "Warning: Aktif iş ilanı bulunamadı!");
    }


    @Override
    public Result deactiveJobAdvertisement(int jobAdvertId) {
        this.jobAdvertsDao.deactiveJobAdvert(jobAdvertId);
        return new SuccessResult("Success: İlan başarıyla inaktif edildi!");
    }

    @Override
    public Result addJobAdvert(JobAdvertisement jobAdvert) {
        this.jobAdvertsDao.save(jobAdvert);
        return new SuccessResult("Success: İlan sisteme eklendi!");
    }
}