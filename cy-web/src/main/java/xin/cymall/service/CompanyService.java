package xin.cymall.service;

import xin.cymall.entity.Company;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-11 15:18:13
 */
public interface CompanyService {
	
	Company get(String companyId);
	
	List<Company> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Company company);
	
	void update(Company company);
	
	void delete(String companyId);
	
	void deleteBatch(String[] companyIds);

    void updateState(String[] ids, String stateValue);
}
