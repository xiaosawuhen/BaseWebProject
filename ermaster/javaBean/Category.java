package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 种类.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Category implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long ctid;

	/** 公司. */
	private Company company;

	/** 名称. */
	private String name;

	/** 简单描述. */
	private String shortDescription;

	/** 描述. */
	private String description;

	/** remark01. */
	private String remark01;

	/** remark02. */
	private String remark02;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of 类别详细信息. */
	private Set<Categoryinfo> categoryinfoSet;

	/** The set of 项目表. */
	private Set<Project> projectSet;

	/**
	 * Constructor.
	 */
	public Category() {
		this.projectSet = new HashSet<Project>();
		this.categoryinfoSet = new HashSet<Categoryinfo>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param ctid
	 *            ID
	 */
	public void setCtid(Long ctid) {
		this.ctid = ctid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getCtid() {
		return this.ctid;
	}

	/**
	 * Set the 公司.
	 * 
	 * @param company
	 *            公司
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * Get the 公司.
	 * 
	 * @return 公司
	 */
	public Company getCompany() {
		return this.company;
	}

	/**
	 * Set the 名称.
	 * 
	 * @param name
	 *            名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the 名称.
	 * 
	 * @return 名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the 简单描述.
	 * 
	 * @param shortDescription
	 *            简单描述
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * Get the 简单描述.
	 * 
	 * @return 简单描述
	 */
	public String getShortDescription() {
		return this.shortDescription;
	}

	/**
	 * Set the 描述.
	 * 
	 * @param description
	 *            描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the 描述.
	 * 
	 * @return 描述
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the remark01.
	 * 
	 * @param remark01
	 *            remark01
	 */
	public void setRemark01(String remark01) {
		this.remark01 = remark01;
	}

	/**
	 * Get the remark01.
	 * 
	 * @return remark01
	 */
	public String getRemark01() {
		return this.remark01;
	}

	/**
	 * Set the remark02.
	 * 
	 * @param remark02
	 *            remark02
	 */
	public void setRemark02(String remark02) {
		this.remark02 = remark02;
	}

	/**
	 * Get the remark02.
	 * 
	 * @return remark02
	 */
	public String getRemark02() {
		return this.remark02;
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
	 * Set the set of the 类别详细信息.
	 * 
	 * @param categoryinfoSet
	 *            The set of 类别详细信息
	 */
	public void setCategoryinfoSet(Set<Categoryinfo> categoryinfoSet) {
		this.categoryinfoSet = categoryinfoSet;
	}

	/**
	 * Add the 类别详细信息.
	 * 
	 * @param categoryinfo
	 *            类别详细信息
	 */
	public void addCategoryinfo(Categoryinfo categoryinfo) {
		this.categoryinfoSet.add(categoryinfo);
	}

	/**
	 * Get the set of the 类别详细信息.
	 * 
	 * @return The set of 类别详细信息
	 */
	public Set<Categoryinfo> getCategoryinfoSet() {
		return this.categoryinfoSet;
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
		result = prime * result + ((ctid == null) ? 0 : ctid.hashCode());
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
		Category other = (Category) obj;
		if (ctid == null) {
			if (other.ctid != null) {
				return false;
			}
		} else if (!ctid.equals(other.ctid)) {
			return false;
		}
		return true;
	}

}
