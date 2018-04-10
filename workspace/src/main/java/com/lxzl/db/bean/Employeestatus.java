package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of �?�工状�?表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Employeestatus implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long esid;

	/** �?�工状�?. */
	private String status;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of �?�工状�?信�?�表. */
	private Set<Employeestatusinfo> employeestatusinfoSet;

	/**
	 * Constructor.
	 */
	public Employeestatus() {
		this.employeestatusinfoSet = new HashSet<Employeestatusinfo>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param esid
	 *            ID
	 */
	public void setEsid(Long esid) {
		this.esid = esid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getEsid() {
		return this.esid;
	}

	/**
	 * Set the �?�工状�?.
	 * 
	 * @param status
	 *            �?�工状�?
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Get the �?�工状�?.
	 * 
	 * @return �?�工状�?
	 */
	public String getStatus() {
		return this.status;
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
	 * Set the set of the �?�工状�?信�?�表.
	 * 
	 * @param employeestatusinfoSet
	 *            The set of �?�工状�?信�?�表
	 */
	public void setEmployeestatusinfoSet(Set<Employeestatusinfo> employeestatusinfoSet) {
		this.employeestatusinfoSet = employeestatusinfoSet;
	}

	/**
	 * Add the �?�工状�?信�?�表.
	 * 
	 * @param employeestatusinfo
	 *            �?�工状�?信�?�表
	 */
	public void addEmployeestatusinfo(Employeestatusinfo employeestatusinfo) {
		this.employeestatusinfoSet.add(employeestatusinfo);
	}

	/**
	 * Get the set of the �?�工状�?信�?�表.
	 * 
	 * @return The set of �?�工状�?信�?�表
	 */
	public Set<Employeestatusinfo> getEmployeestatusinfoSet() {
		return this.employeestatusinfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((esid == null) ? 0 : esid.hashCode());
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
		Employeestatus other = (Employeestatus) obj;
		if (esid == null) {
			if (other.esid != null) {
				return false;
			}
		} else if (!esid.equals(other.esid)) {
			return false;
		}
		return true;
	}

}
