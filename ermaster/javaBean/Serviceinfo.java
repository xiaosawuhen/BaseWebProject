package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 服务详细表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Serviceinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long siid;

	/** 服务表. */
	private Services services;

	/** 服务开始时间. */
	private Date startTime;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Serviceinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param siid
	 *            ID
	 */
	public void setSiid(Long siid) {
		this.siid = siid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getSiid() {
		return this.siid;
	}

	/**
	 * Set the 服务表.
	 * 
	 * @param services
	 *            服务表
	 */
	public void setServices(Services services) {
		this.services = services;
	}

	/**
	 * Get the 服务表.
	 * 
	 * @return 服务表
	 */
	public Services getServices() {
		return this.services;
	}

	/**
	 * Set the 服务开始时间.
	 * 
	 * @param startTime
	 *            服务开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * Get the 服务开始时间.
	 * 
	 * @return 服务开始时间
	 */
	public Date getStartTime() {
		return this.startTime;
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
		result = prime * result + ((siid == null) ? 0 : siid.hashCode());
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
		Serviceinfo other = (Serviceinfo) obj;
		if (siid == null) {
			if (other.siid != null) {
				return false;
			}
		} else if (!siid.equals(other.siid)) {
			return false;
		}
		return true;
	}

}
