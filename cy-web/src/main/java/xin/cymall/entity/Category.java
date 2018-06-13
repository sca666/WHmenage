package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品分类
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:05
 */
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String categoryId;
	/**商品分类编码**/
	private String code;
	/**商品分类名称**/
	private String name;
	/**商品分类父类id**/
	private String parentId;
	/**商品分类全名**/
	private String fullName;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：商品分类编码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：商品分类编码
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：商品分类名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品分类名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品分类父类id
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：商品分类父类id
	 */
	public String getParentId() {
		return parentId;
	}
	/**
	 * 设置：商品分类全名
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * 获取：商品分类全名
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}

    public void setState(String stateValue) {
    }
}
