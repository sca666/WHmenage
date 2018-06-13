package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 16:50:10
 */
public class Warehousesettlement implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String housesetId;
	/**公司id**/
	private String companyId;
	/**仓库id**/
	private String warehoustId;
	/**商品id**/
	private String commodityId;
	/**出库数量**/
	private String outputnum;
	/**入库单id**/
	private String inputId;
	/**出库单id**/
	private String outputId;
	/**入库时间**/
	private Date intputDate;
	/**出库时间**/
	private Date outputDate;
	/**存放天数**/
	private String depositDays;
	/**基本仓租类型**/
	private String basicrentId;
	/**加租仓租类型**/
	private String raiserentId;
	/**结算状态**/
	private String settlementStatus;
	/**应付金额**/
	private String totalMoney;
	/**已付金额**/
	private String paidMoney;
	/**未付金额**/
	private String unpidMoney;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setHousesetId(String housesetId) {
		this.housesetId = housesetId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getHousesetId() {
		return housesetId;
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
	 * 设置：仓库id
	 */
	public void setWarehoustId(String warehoustId) {
		this.warehoustId = warehoustId;
	}
	/**
	 * 获取：仓库id
	 */
	public String getWarehoustId() {
		return warehoustId;
	}
	/**
	 * 设置：商品id
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodityId() {
		return commodityId;
	}
	/**
	 * 设置：出库数量
	 */
	public void setOutputnum(String outputnum) {
		this.outputnum = outputnum;
	}
	/**
	 * 获取：出库数量
	 */
	public String getOutputnum() {
		return outputnum;
	}
	/**
	 * 设置：入库单id
	 */
	public void setInputId(String inputId) {
		this.inputId = inputId;
	}
	/**
	 * 获取：入库单id
	 */
	public String getInputId() {
		return inputId;
	}
	/**
	 * 设置：出库单id
	 */
	public void setOutputId(String outputId) {
		this.outputId = outputId;
	}
	/**
	 * 获取：出库单id
	 */
	public String getOutputId() {
		return outputId;
	}
	/**
	 * 设置：入库时间
	 */
	public void setIntputDate(Date intputDate) {
		this.intputDate = intputDate;
	}
	/**
	 * 获取：入库时间
	 */
	public Date getIntputDate() {
		return intputDate;
	}
	/**
	 * 设置：出库时间
	 */
	public void setOutputDate(Date outputDate) {
		this.outputDate = outputDate;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getOutputDate() {
		return outputDate;
	}
	/**
	 * 设置：存放天数
	 */
	public void setDepositDays(String depositDays) {
		this.depositDays = depositDays;
	}
	/**
	 * 获取：存放天数
	 */
	public String getDepositDays() {
		return depositDays;
	}
	/**
	 * 设置：基本仓租类型
	 */
	public void setBasicrentId(String basicrentId) {
		this.basicrentId = basicrentId;
	}
	/**
	 * 获取：基本仓租类型
	 */
	public String getBasicrentId() {
		return basicrentId;
	}
	/**
	 * 设置：加租仓租类型
	 */
	public void setRaiserentId(String raiserentId) {
		this.raiserentId = raiserentId;
	}
	/**
	 * 获取：加租仓租类型
	 */
	public String getRaiserentId() {
		return raiserentId;
	}
	/**
	 * 设置：结算状态
	 */
	public void setSettlementStatus(String settlementStatus) {
		this.settlementStatus = settlementStatus;
	}
	/**
	 * 获取：结算状态
	 */
	public String getSettlementStatus() {
		return settlementStatus;
	}
	/**
	 * 设置：应付金额
	 */
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	/**
	 * 获取：应付金额
	 */
	public String getTotalMoney() {
		return totalMoney;
	}
	/**
	 * 设置：已付金额
	 */
	public void setPaidMoney(String paidMoney) {
		this.paidMoney = paidMoney;
	}
	/**
	 * 获取：已付金额
	 */
	public String getPaidMoney() {
		return paidMoney;
	}
	/**
	 * 设置：未付金额
	 */
	public void setUnpidMoney(String unpidMoney) {
		this.unpidMoney = unpidMoney;
	}
	/**
	 * 获取：未付金额
	 */
	public String getUnpidMoney() {
		return unpidMoney;
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
