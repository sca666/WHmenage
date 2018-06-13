package xin.cymall.service;

import xin.cymall.entity.Outputdetail;

import java.util.List;
import java.util.Map;

/**
 * 出库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:04
 */
public interface OutputdetailService {
	
	Outputdetail get(String outputdetailId);
	
	List<Outputdetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Outputdetail outputdetail);
	
	void update(Outputdetail outputdetail);
	
	void delete(String outputdetailId);
	
	void deleteBatch(String[] outputdetailIds);

    void updateState(String[] ids, String stateValue);
}
