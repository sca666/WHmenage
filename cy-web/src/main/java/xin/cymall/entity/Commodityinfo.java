package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-07 14:24:30
 */
public class Commodityinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/****/
	private String id;
	/****/
	private String commodityid;
	/****/
	private String commodityname;
	/****/
	private String commoditytype;
	/****/
	private String uint;
	/****/
	private String remark;

	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCommodityid(String commodityid) {
		this.commodityid = commodityid;
	}
	/**
	 * 获取：
	 */
	public String getCommodityid() {
		return commodityid;
	}
	/**
	 * 设置：
	 */
	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname;
	}
	/**
	 * 获取：
	 */
	public String getCommodityname() {
		return commodityname;
	}
	/**
	 * 设置：
	 */
	public void setCommoditytype(String commoditytype) {
		this.commoditytype = commoditytype;
	}
	/**
	 * 获取：
	 */
	public String getCommoditytype() {
		return commoditytype;
	}
	/**
	 * 设置：
	 */
	public void setUint(String uint) {
		this.uint = uint;
	}
	/**
	 * 获取：
	 */
	public String getUint() {
		return uint;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}

    public void setState(String stateValue) {
    }
}
