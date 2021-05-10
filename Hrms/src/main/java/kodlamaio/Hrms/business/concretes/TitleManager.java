package kodlamaio.Hrms.business.concretes;

import kodlamaio.Hrms.business.abstracts.TitleService;
import kodlamaio.Hrms.dataAccess.abstracts.TitleDao;
import kodlamaio.Hrms.entities.concretes.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleManager implements TitleService {
    final
    TitleDao titleDao;

    public TitleManager(TitleDao titleDao) {
        super();
        this.titleDao = titleDao;
    }

    @Override
    public List<Title> getAll() {
        return titleDao.findAll();
    }
}
