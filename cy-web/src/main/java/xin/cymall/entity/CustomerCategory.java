package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 客户分类表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 16:50:10
 */
public class CustomerCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String id;
	/**分类编码**/
	private String code;
	/**分类名称**/
	private String name;
	/**上级ID**/
	private String parentId;
	/**公司Id**/
	private String companyId;
	/**价格体系**/
	private String psId;

	/**
	 * 设置：主键ID
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：分类编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：分类编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：分类名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：分类名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：上级ID
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：上级ID
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：公司Id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司Id
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：价格体系
	 */
	public void setPsId(String psId) {
		this.psId = psId;
	}
	/**
	 * 获取：价格体系
	 */
	public String getPsId() {
		return psId;
	}

    public void setState(String stateValue) {
    }
}
