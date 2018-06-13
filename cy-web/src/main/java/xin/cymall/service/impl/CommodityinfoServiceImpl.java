package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CommodityinfoDao;
import xin.cymall.entity.Commodityinfo;
import xin.cymall.service.CommodityinfoService;




@Service("commodityinfoService")
@Transactional
public class CommodityinfoServiceImpl implements CommodityinfoService {
	@Autowired
	private CommodityinfoDao commodityinfoDao;
	
	@Override
	public Commodityinfo get(String id){
		return commodityinfoDao.get(id);
	}

	@Override
	public List<Commodityinfo> getList(Map<String, Object> map){
		return commodityinfoDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return commodityinfoDao.getCount(map);
	}

	@Override
	public void save(Commodityinfo commodityinfo){
		commodityinfoDao.save(commodityinfo);
	}

	@Override
	public void update(Commodityinfo commodityinfo){
		commodityinfoDao.update(commodityinfo);
	}

	@Override
	public void delete(String id){
		commodityinfoDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		commodityinfoDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Commodityinfo commodityinfo=get(id);
			commodityinfo.setState(stateValue);

            update(commodityinfo);
        }
    }
	
}
