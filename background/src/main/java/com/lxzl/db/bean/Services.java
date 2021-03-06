package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 服务表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Services implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long sid;

	/** 公司. */
	private Long cid;

	/** 名称. */
	private String name;

	/** 描述. */
	private String description;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of 项目表. */
	private Set<Project> projectSet;

	/** The set of 服务详细表. */
	private Set<Serviceinfo> serviceinfoSet;

	/**
	 * Constructor.
	 */
	public Services() {
		this.projectSet = new HashSet<Project>();
		this.serviceinfoSet = new HashSet<Serviceinfo>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param sid
	 *            ID
	 */
	public void setSid(Long sid) {
		this.sid = sid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getSid() {
		return this.sid;
	}

	/**
	 * @return the cid
	 */
	public Long getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(Long cid) {
		this.cid = cid;
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
	 * Set the set of the 服务详细表.
	 * 
	 * @param serviceinfoSet
	 *            The set of 服务详细表
	 */
	public void setServiceinfoSet(Set<Serviceinfo> serviceinfoSet) {
		this.serviceinfoSet = serviceinfoSet;
	}

	/**
	 * Add the 服务详细表.
	 * 
	 * @param serviceinfo
	 *            服务详细表
	 */
	public void addServiceinfo(Serviceinfo serviceinfo) {
		this.serviceinfoSet.add(serviceinfo);
	}

	/**
	 * Get the set of the 服务详细表.
	 * 
	 * @return The set of 服务详细表
	 */
	public Set<Serviceinfo> getServiceinfoSet() {
		return this.serviceinfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
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
		Services other = (Services) obj;
		if (sid == null) {
			if (other.sid != null) {
				return false;
			}
		} else if (!sid.equals(other.sid)) {
			return false;
		}
		return true;
	}

}
