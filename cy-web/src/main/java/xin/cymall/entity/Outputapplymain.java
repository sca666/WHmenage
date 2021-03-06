package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 出库申请单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:04
 */
public class Outputapplymain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String outputapplymainId;
	/**出库申请表单号**/
	private String outputapplymainRef;
	/**公司id**/
	private String companyId;
	/**录单人id**/
	private String outputUserId;
	/**录单时间**/
	private Date outputDate;
	/**单据状态**/
	private String billStatus;
	/**审核人id**/
	private String confirmUserId;
	/**审核时间**/
	private Date confirmDate;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setOutputapplymainId(String outputapplymainId) {
		this.outputapplymainId = outputapplymainId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getOutputapplymainId() {
		return outputapplymainId;
	}
	/**
	 * 设置：出库申请表单号
	 */
	public void setOutputapplymainRef(String outputapplymainRef) {
		this.outputapplymainRef = outputapplymainRef;
	}
	/**
	 * 获取：出库申请表单号
	 */
	public String getOutputapplymainRef() {
		return outputapplymainRef;
	}
	/**
	 * 设置：公司id
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：公司id
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：录单人id
	 */
	public void setOutputUserId(String outputUserId) {
		this.outputUserId = outputUserId;
	}
	/**
	 * 获取：录单人id
	 */
	public String getOutputUserId() {
		return outputUserId;
	}
	/**
	 * 设置：录单时间
	 */
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	/**
	 * 获取：录单时间
	 */
	public Date getOutputDate() {
		return outputDate;
	}
	/**
	 * 设置：单据状态
	 */
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	/**
	 * 获取：单据状态
	 */
	public String getBillStatus() {
		return billStatus;
	}
	/**
	 * 设置：审核人id
	 */
	public void setConfirmUserId(String confirmUserId) {
		this.confirmUserId = confirmUserId;
	}
	/**
	 * 获取：审核人id
	 */
	public String getConfirmUserId() {
		return confirmUserId;
	}
	/**
	 * 设置：审核时间
	 */
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}
	/**
	 * 获取：审核时间
	 */
	public Date getConfirmDate() {
		return confirmDate;
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
