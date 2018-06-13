package xin.cymall.service;

import xin.cymall.entity.Companysettlement;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 16:50:10
 */
public interface CompanysettlementService {
	
	Companysettlement get(String comsetId);
	
	List<Companysettlement> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Companysettlement companysettlement);
	
	void update(Companysettlement companysettlement);
	
	void delete(String comsetId);
	
	void deleteBatch(String[] comsetIds);

    void updateState(String[] ids, String stateValue);
}
