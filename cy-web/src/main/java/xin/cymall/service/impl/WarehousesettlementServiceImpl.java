package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.WarehousesettlementDao;
import xin.cymall.entity.Warehousesettlement;
import xin.cymall.service.WarehousesettlementService;




@Service("warehousesettlementService")
@Transactional
public class WarehousesettlementServiceImpl implements WarehousesettlementService {
	@Autowired
	private WarehousesettlementDao warehousesettlementDao;
	
	@Override
	public Warehousesettlement get(String housesetId){
		return warehousesettlementDao.get(housesetId);
	}

	@Override
	public List<Warehousesettlement> getList(Map<String, Object> map){
		return warehousesettlementDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return warehousesettlementDao.getCount(map);
	}

	@Override
	public void save(Warehousesettlement warehousesettlement){
		warehousesettlementDao.save(warehousesettlement);
	}

	@Override
	public void update(Warehousesettlement warehousesettlement){
		warehousesettlementDao.update(warehousesettlement);
	}

	@Override
	public void delete(String housesetId){
		warehousesettlementDao.delete(housesetId);
	}

	@Override
	public void deleteBatch(String[] housesetIds){
		warehousesettlementDao.deleteBatch(housesetIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Warehousesettlement warehousesettlement=get(id);
			warehousesettlement.setState(stateValue);
            update(warehousesettlement);
        }
    }
	
}
