package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 项目�??称.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Projectinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** PIID. */
	private Long piid;

	/** PIID. */
	private Long pid;

	/** 开始时间. */
	private Date startTime;

	/** 结�?�时间. */
	private Date endTime;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Projectinfo() {
	}

	/**
	 * Set the PIID.
	 * 
	 * @param piid
	 *            PIID
	 */
	public void setPiid(Long piid) {
		this.piid = piid;
	}

	/**
	 * Get the PIID.
	 * 
	 * @return PIID
	 */
	public Long getPiid() {
		return this.piid;
	}

	/**
	 * @return the pid
	 */
	public Long getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(Long pid) {
		this.pid = pid;
	}

	/**
	 * Set the 开始时间.
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * Get the 开始时间.
	 * 
	 * @return 开始时间
	 */
	public Date getStartTime() {
		return this.startTime;
	}

	/**
	 * Set the 结�?�时间.
	 * 
	 * @param endTime
	 *            结�?�时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * Get the 结�?�时间.
	 * 
	 * @return 结�?�时间
	 */
	public Date getEndTime() {
		return this.endTime;
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
		result = prime * result + ((piid == null) ? 0 : piid.hashCode());
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
		Projectinfo other = (Projectinfo) obj;
		if (piid == null) {
			if (other.piid != null) {
				return false;
			}
		} else if (!piid.equals(other.piid)) {
			return false;
		}
		return true;
	}

}
