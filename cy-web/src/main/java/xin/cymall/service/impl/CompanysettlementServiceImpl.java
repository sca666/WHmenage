package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanysettlementDao;
import xin.cymall.entity.Companysettlement;
import xin.cymall.service.CompanysettlementService;




@Service("companysettlementService")
@Transactional
public class CompanysettlementServiceImpl implements CompanysettlementService {
	@Autowired
	private CompanysettlementDao companysettlementDao;
	
	@Override
	public Companysettlement get(String comsetId){
		return companysettlementDao.get(comsetId);
	}

	@Override
	public List<Companysettlement> getList(Map<String, Object> map){
		return companysettlementDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companysettlementDao.getCount(map);
	}

	@Override
	public void save(Companysettlement companysettlement){
		companysettlementDao.save(companysettlement);
	}

	@Override
	public void update(Companysettlement companysettlement){
		companysettlementDao.update(companysettlement);
	}

	@Override
	public void delete(String comsetId){
		companysettlementDao.delete(comsetId);
	}

	@Override
	public void deleteBatch(String[] comsetIds){
		companysettlementDao.deleteBatch(comsetIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Companysettlement companysettlement=get(id);
			companysettlement.setState(stateValue);
            update(companysettlement);
        }
    }
	
}
