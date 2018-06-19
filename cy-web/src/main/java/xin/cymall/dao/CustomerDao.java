package xin.cymall.dao;

import xin.cymall.entity.Customer;

import java.util.List;

/**
 * 客户表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:04
 */
public interface CustomerDao extends BaseDao<Customer> {

    List<Customer> getList2();
}
