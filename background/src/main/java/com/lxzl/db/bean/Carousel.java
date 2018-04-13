package com.lxzl.db.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Model class of 公司展示画布表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Carousel implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long caid;

	/** 公司. */
	private Long cid;

	/** 名称. */
	private String name;

	/** 简单描述. */
	private String shortDescription;

	/** 描述. */
	private String description;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/** The set of 公司画布信息表. */
	private Set<Carouselinfo> carouselinfoSet;

	/**
	 * Constructor.
	 */
	public Carousel() {
		this.carouselinfoSet = new HashSet<Carouselinfo>();
	}

	/**
	 * Set the ID.
	 * 
	 * @param caid
	 *            ID
	 */
	public void setCaid(Long caid) {
		this.caid = caid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getCaid() {
		return this.caid;
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
	 * Set the set of the 公司画布信息表.
	 * 
	 * @param carouselinfoSet
	 *            The set of 公司画布信息表
	 */
	public void setCarouselinfoSet(Set<Carouselinfo> carouselinfoSet) {
		this.carouselinfoSet = carouselinfoSet;
	}

	/**
	 * Add the 公司画布信息表.
	 * 
	 * @param carouselinfo
	 *            公司画布信息表
	 */
	public void addCarouselinfo(Carouselinfo carouselinfo) {
		this.carouselinfoSet.add(carouselinfo);
	}

	/**
	 * Get the set of the 公司画布信息表.
	 * 
	 * @return The set of 公司画布信息表
	 */
	public Set<Carouselinfo> getCarouselinfoSet() {
		return this.carouselinfoSet;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caid == null) ? 0 : caid.hashCode());
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
		Carousel other = (Carousel) obj;
		if (caid == null) {
			if (other.caid != null) {
				return false;
			}
		} else if (!caid.equals(other.caid)) {
			return false;
		}
		return true;
	}

}
