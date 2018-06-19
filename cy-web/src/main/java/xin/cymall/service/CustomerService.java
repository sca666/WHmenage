package xin.cymall.service;

import xin.cymall.entity.Customer;

import java.util.List;
import java.util.Map;

/**
 * 客户表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:04
 */
public interface CustomerService {
	
	Customer get(String id);
	
	List<Customer> getList(Map<String, Object> map);

	List<Customer> getList2();
	
	int getCount(Map<String, Object> map);
	
	void save(Customer customer);
	
	void update(Customer customer);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
