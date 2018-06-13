package xin.cymall.service;

import xin.cymall.entity.Commodityinfo;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-07 14:24:30
 */
public interface CommodityinfoService {
	
	Commodityinfo get(String id);
	
	List<Commodityinfo> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Commodityinfo commodityinfo);
	
	void update(Commodityinfo commodityinfo);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
