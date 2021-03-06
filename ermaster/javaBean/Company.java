package com.cn.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 公司.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Company implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 公司ID. */
	private Long cid;

	/** 公司名称. */
	private String name;

	/** 公司介绍. */
	private String description;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of 公司职工信息表. */
	private Set<Companyemployeeinfo> companyemployeeinfoSet;

	/** The set of 公司详细信息. */
	private Set<Companyinfo> companyinfoSet;

	/** The set of 公司客户信息表. */
	private Set<Customercompanyinfo> customercompanyinfoSet;

	/** The set of 项目表. */
	private Set<Project> projectSet;

	/**
	 * Constructor.
	 */
	public Company() {
		this.companyemployeeinfoSet = new HashSet<Companyemployeeinfo>();
		this.companyinfoSet = new HashSet<Companyinfo>();
		this.customercompanyinfoSet = new HashSet<Customercompanyinfo>();
		this.projectSet = new HashSet<Project>();
	}

	/**
	 * Set the 公司ID.
	 * 
	 * @param cid
	 *            公司ID
	 */
	public void setCid(Long cid) {
		this.cid = cid;
	}

	/**
	 * Get the 公司ID.
	 * 
	 * @return 公司ID
	 */
	public Long getCid() {
		return this.cid;
	}

	/**
	 * Set the 公司名称.
	 * 
	 * @param name
	 *            公司名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 公司名称.
	 * 
	 * @return 公司名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 公司介绍.
	 * 
	 * @param description
	 *            公司介绍
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the 公司介绍.
	 * 
	 * @return 公司介绍
	 */
	public String getDescription() {
		return this.description;
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
	 * Set the set of the 公司职工信息表.
	 * 
	 * @param companyemployeeinfoSet
	 *            The set of 公司职工信息表
	 */
	public void setCompanyemployeeinfoSet(Set<Companyemployeeinfo> companyemployeeinfoSet) {
		this.companyemployeeinfoSet = companyemployeeinfoSet;
	}

	/**
	 * Add the 公司职工信息表.
	 * 
	 * @param companyemployeeinfo
	 *            公司职工信息表
	 */
	public void addCompanyemployeeinfo(Companyemployeeinfo companyemployeeinfo) {
		this.companyemployeeinfoSet.add(companyemployeeinfo);
	}

	/**
	 * Get the set of the 公司职工信息表.
	 * 
	 * @return The set of 公司职工信息表
	 */
	public Set<Companyemployeeinfo> getCompanyemployeeinfoSet() {
		return this.companyemployeeinfoSet;
	}

	/**
	 * Set the set of the 公司详细信息.
	 * 
	 * @param companyinfoSet
	 *            The set of 公司详细信息
	 */
	public void setCompanyinfoSet(Set<Companyinfo> companyinfoSet) {
		this.companyinfoSet = companyinfoSet;
	}

	/**
	 * Add the 公司详细信息.
	 * 
	 * @param companyinfo
	 *            公司详细信息
	 */
	public void addCompanyinfo(Companyinfo companyinfo) {
		this.companyinfoSet.add(companyinfo);
	}

	/**
	 * Get the set of the 公司详细信息.
	 * 
	 * @return The set of 公司详细信息
	 */
	public Set<Companyinfo> getCompanyinfoSet() {
		return this.companyinfoSet;
	}

	/**
	 * Set the set of the 公司客户信息表.
	 * 
	 * @param customercompanyinfoSet
	 *            The set of 公司客户信息表
	 */
	public void setCustomercompanyinfoSet(Set<Customercompanyinfo> customercompanyinfoSet) {
		this.customercompanyinfoSet = customercompanyinfoSet;
	}

	/**
	 * Add the 公司客户信息表.
	 * 
	 * @param customercompanyinfo
	 *            公司客户信息表
	 */
	public void addCustomercompanyinfo(Customercompanyinfo customercompanyinfo) {
		this.customercompanyinfoSet.add(customercompanyinfo);
	}

	/**
	 * Get the set of the 公司客户信息表.
	 * 
	 * @return The set of 公司客户信息表
	 */
	public Set<Customercompanyinfo> getCustomercompanyinfoSet() {
		return this.customercompanyinfoSet;
	}

	/**
	 * Set the set of the 项目表.
	 * 
	 * @param projectSet
	 *            The set of 项目表
	 */
	public void setProjectSet(Set<Project> projectSet) {
		this.projectSet = projectSet;
	}

	/**
	 * Add the 项目表.
	 * 
	 * @param project
	 *            项目表
	 */
	public void addProject(Project project) {
		this.projectSet.add(project);
	}

	/**
	 * Get the set of the 项目表.
	 * 
	 * @return The set of 项目表
	 */
	public Set<Project> getProjectSet() {
		return this.projectSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
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
		Company other = (Company) obj;
		if (cid == null) {
			if (other.cid != null) {
				return false;
			}
		} else if (!cid.equals(other.cid)) {
			return false;
		}
		return true;
	}

}
