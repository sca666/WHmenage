package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanyDao;
import xin.cymall.entity.Company;
import xin.cymall.service.CompanyService;




@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public Company get(String companyId){
		return companyDao.get(companyId);
	}

	@Override
	public List<Company> getList(Map<String, Object> map){
		return companyDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companyDao.getCount(map);
	}

	@Override
	public void save(Company company){
		companyDao.save(company);
	}

	@Override
	public void update(Company company){
		companyDao.update(company);
	}

	@Override
	public void delete(String companyId){
		companyDao.delete(companyId);
	}

	@Override
	public void deleteBatch(String[] companyIds){
		companyDao.deleteBatch(companyIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Company company=get(id);
			company.setState(stateValue);
            update(company);
        }
    }
	
}
