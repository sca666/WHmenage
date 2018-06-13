package xin.cymall.service;

import xin.cymall.entity.Category;

import java.util.List;
import java.util.Map;

/**
 * 商品分类
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:05
 */
public interface CategoryService {
	
	Category get(String categoryId);
	
	List<Category> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Category category);
	
	void update(Category category);
	
	void delete(String categoryId);
	
	void deleteBatch(String[] categoryIds);

    void updateState(String[] ids, String stateValue);
}
