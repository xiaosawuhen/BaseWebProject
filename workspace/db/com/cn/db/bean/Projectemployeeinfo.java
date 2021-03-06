package com.cn.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 项目职工信息表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Projectemployeeinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long peiid;

	/** 职工信息表. */
	private Employee employee;

	/** 项目表. */
	private Project project;

	/** 开始时间. */
	private Date startTime;

	/** 结束时间. */
	private Date endTime;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Projectemployeeinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param peiid
	 *            ID
	 */
	public void setPeiid(Long peiid) {
		this.peiid = peiid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getPeiid() {
		return this.peiid;
	}

	/**
	 * Set the 职工信息表.
	 * 
	 * @param employee
	 *            职工信息表
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Get the 职工信息表.
	 * 
	 * @return 职工信息表
	 */
	public Employee getEmployee() {
		return this.employee;
	}

	/**
	 * Set the 项目表.
	 * 
	 * @param project
	 *            项目表
	 */
	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * Get the 项目表.
	 * 
	 * @return 项目表
	 */
	public Project getProject() {
		return this.project;
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
	 * Set the 结束时间.
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * Get the 结束时间.
	 * 
	 * @return 结束时间
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
		result = prime * result + ((peiid == null) ? 0 : peiid.hashCode());
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
		Projectemployeeinfo other = (Projectemployeeinfo) obj;
		if (peiid == null) {
			if (other.peiid != null) {
				return false;
			}
		} else if (!peiid.equals(other.peiid)) {
			return false;
		}
		return true;
	}

}
