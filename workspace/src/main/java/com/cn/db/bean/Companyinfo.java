package com.cn.db.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 公司详细信息.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class Companyinfo implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	private Long ciid;

	/** 公司. */
	private Company company;

	/** 地址. */
	private String address;

	/** 电话. */
	private String tel;

	/** 传真. */
	private String fax;

	/** 邮箱. */
	private String mail;

	/** 创建日期. */
	private Date createTime;

	/** 更新日期. */
	private Date updateTime;

	/**
	 * Constructor.
	 */
	public Companyinfo() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param ciid
	 *            ID
	 */
	public void setCiid(Long ciid) {
		this.ciid = ciid;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Long getCiid() {
		return this.ciid;
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
	 * Set the 地址.
	 * 
	 * @param address
	 *            地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Get the 地址.
	 * 
	 * @return 地址
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Set the 电话.
	 * 
	 * @param tel
	 *            电话
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * Get the 电话.
	 * 
	 * @return 电话
	 */
	public String getTel() {
		return this.tel;
	}

	/**
	 * Set the 传真.
	 * 
	 * @param fax
	 *            传真
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * Get the 传真.
	 * 
	 * @return 传真
	 */
	public String getFax() {
		return this.fax;
	}

	/**
	 * Set the 邮箱.
	 * 
	 * @param mail
	 *            邮箱
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Get the 邮箱.
	 * 
	 * @return 邮箱
	 */
	public String getMail() {
		return this.mail;
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
		result = prime * result + ((ciid == null) ? 0 : ciid.hashCode());
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
		Companyinfo other = (Companyinfo) obj;
		if (ciid == null) {
			if (other.ciid != null) {
				return false;
			}
		} else if (!ciid.equals(other.ciid)) {
			return false;
		}
		return true;
	}

}
