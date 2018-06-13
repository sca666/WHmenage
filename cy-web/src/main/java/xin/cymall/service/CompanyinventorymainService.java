package xin.cymall.service;

import xin.cymall.entity.Companyinventorymain;

import java.util.List;
import java.util.Map;

/**
 * 客户的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:04
 */
public interface CompanyinventorymainService {
	
	Companyinventorymain get(String cominvenmId);
	
	List<Companyinventorymain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Companyinventorymain companyinventorymain);
	
	void update(Companyinventorymain companyinventorymain);
	
	void delete(String cominvenmId);
	
	void deleteBatch(String[] cominvenmIds);

    void updateState(String[] ids, String stateValue);
}
