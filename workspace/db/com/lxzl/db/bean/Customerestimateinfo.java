package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 用户评价表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Customerestimateinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long ceiid;

	/** 用户信息表. */
	private Customer customer;

	/** 评价等级表. */
	private Customerestimatelevel customerestimatelevel;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Customerestimateinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param ceiid
	 *            ID
	 */
	public void setCeiid(Long ceiid) {
		this.ceiid = ceiid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getCeiid() {
		return this.ceiid;
	}

	/**
	 * Set the 用户信息表.
	 * 
	 * @param customer
	 *            用户信息表
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Get the 用户信息表.
	 * 
	 * @return 用户信息表
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * Set the 评价等级表.
	 * 
	 * @param customerestimatelevel
	 *            评价等级表
	 */
	public void setCustomerestimatelevel(Customerestimatelevel customerestimatelevel) {
		this.customerestimatelevel = customerestimatelevel;
	}

	/**
	 * Get the 评价等级表.
	 * 
	 * @return 评价等级表
	 */
	public Customerestimatelevel getCustomerestimatelevel() {
		return this.customerestimatelevel;
	}

	/**
	 * Set the 创建日期.
	 * 
	 * @param createTime
	 *            创建日期
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * Get the 创建日期.
	 * 
	 * @return 创建日期
	 */
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * Set the 更新日期.
	 * 
	 * @param updateTime
	 *            更新日期
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * Get the 更新日期.
	 * 
	 * @return 更新日期
	 */
	public Date getUpdateTime() {
		return this.updateTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ceiid == null) ? 0 : ceiid.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Customerestimateinfo other = (Customerestimateinfo) obj;
		if (ceiid == null) {
			if (other.ceiid != null) {
				return false;
			}
		} else if (!ceiid.equals(other.ceiid)) {
			return false;
		}
		return true;
	}

}
