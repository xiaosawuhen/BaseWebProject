package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 用户信息表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Customerlevelinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long cliid;

	/** 用户信息表. */
	private Customer customer;

	/** 用户级别. */
	private Customerlevel customerlevel;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Customerlevelinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param cliid
	 *            ID
	 */
	public void setCliid(Long cliid) {
		this.cliid = cliid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getCliid() {
		return this.cliid;
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
	 * Set the 用户级别.
	 * 
	 * @param customerlevel
	 *            用户级别
	 */
	public void setCustomerlevel(Customerlevel customerlevel) {
		this.customerlevel = customerlevel;
	}

	/**
	 * Get the 用户级别.
	 * 
	 * @return 用户级别
	 */
	public Customerlevel getCustomerlevel() {
		return this.customerlevel;
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
		result = prime * result + ((cliid == null) ? 0 : cliid.hashCode());
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
		Customerlevelinfo other = (Customerlevelinfo) obj;
		if (cliid == null) {
			if (other.cliid != null) {
				return false;
			}
		} else if (!cliid.equals(other.cliid)) {
			return false;
		}
		return true;
	}

}