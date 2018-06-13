package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-11 15:18:13
 */
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/****/
	private String companyId;
	/**公司编码**/
	private String companyCode;
	/**公司名称**/
	private String companyName;
	/**公司联系人**/
	private String contacts;
	/**联系电话**/
	private String telephone;
	/**角色id**/
	private String roleId;
	/**备注**/
	private String remark;

	/**
	 * 设置：
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：公司编码
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * 获取：公司编码
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * 设置：公司名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：公司名称
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：公司联系人
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	 * 获取：公司联系人
	 */
	public String getContacts() {
		return contacts;
	}
	/**
	 * 设置：联系电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：角色id
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色id
	 */
	public String getRoleId() {
		return roleId;
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
