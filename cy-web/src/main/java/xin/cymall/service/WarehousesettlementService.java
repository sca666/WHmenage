package xin.cymall.service;

import xin.cymall.entity.Warehousesettlement;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 16:50:10
 */
public interface WarehousesettlementService {
	
	Warehousesettlement get(String housesetId);
	
	List<Warehousesettlement> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Warehousesettlement warehousesettlement);
	
	void update(Warehousesettlement warehousesettlement);
	
	void delete(String housesetId);
	
	void deleteBatch(String[] housesetIds);

    void updateState(String[] ids, String stateValue);
}
