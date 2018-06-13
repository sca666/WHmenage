package xin.cymall.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:36:05
 */
public class Commodity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**主键ID**/
	private String commodityId;
	/** 商品分类id**/
	private String categoryId;
	/**商品code**/
	private String code;
	/**商品名称**/
	private String name;
	/**计量单位编码**/
	private String unitCode;
	/**规格型号**/
	private String spec;
	/**备注**/
	private String remark;

	/**
	 * 设置：主键ID
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取：主键ID
	 */
	public String getCommodityId() {
		return commodityId;
	}
	/**
	 * 设置： 商品分类id
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取： 商品分类id
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：商品code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：商品code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：计量单位编码
	 */
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	/**
	 * 获取：计量单位编码
	 */
	public String getUnitCode() {
		return unitCode;
	}
	/**
	 * 设置：规格型号
	 */
	public void setSpec(String spec) {
		this.spec = spec;
	}
	/**
	 * 获取：规格型号
	 */
	public String getSpec() {
		return spec;
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
