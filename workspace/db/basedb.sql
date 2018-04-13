SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS CarouselInfo;
DROP TABLE IF EXISTS Carousel;
DROP TABLE IF EXISTS CompanyEmployeeInfo;
DROP TABLE IF EXISTS CompanyInfo;
DROP TABLE IF EXISTS Credential;
DROP TABLE IF EXISTS CustomerCompanyInfo;
DROP TABLE IF EXISTS NewsInfo;
DROP TABLE IF EXISTS News;
DROP TABLE IF EXISTS PartnerInfo;
DROP TABLE IF EXISTS Partners;
DROP TABLE IF EXISTS ProjectEmployeeInfo;
DROP TABLE IF EXISTS ProjectInfo;
DROP TABLE IF EXISTS Project;
DROP TABLE IF EXISTS ServiceInfo;
DROP TABLE IF EXISTS Services;
DROP TABLE IF EXISTS Company;
DROP TABLE IF EXISTS CustomerEstimateInfo;
DROP TABLE IF EXISTS CustomerInfo;
DROP TABLE IF EXISTS CustomerLevelInfo;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS CustomerEstimateLevel;
DROP TABLE IF EXISTS CustomerLevel;
DROP TABLE IF EXISTS EmployeeInfo;
DROP TABLE IF EXISTS EmployeeLevelInfo;
DROP TABLE IF EXISTS EmployeeStatusInfo;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS EmployeeLevel;
DROP TABLE IF EXISTS EmployeeStatus;




/* Create Tables */

CREATE TABLE Carousel
(
	caid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	name varchar(50),
	short_description varchar(500),
	description text,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (caid)
);


CREATE TABLE CarouselInfo
(
	caiid bigint NOT NULL AUTO_INCREMENT,
	caid bigint NOT NULL,
	img_url varchar(200),
	link_url varchar(200),
	priority int,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (caiid)
);


CREATE TABLE Company
(
	-- 公司的唯一标识
	cid bigint NOT NULL AUTO_INCREMENT COMMENT '公司的唯一标识',
	-- 公司名称
	name varchar(20) COMMENT '公司名称',
	-- 公司介绍
	description varchar(500) COMMENT '公司介绍',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (cid)
);


CREATE TABLE CompanyEmployeeInfo
(
	ceiid bigint NOT NULL AUTO_INCREMENT,
	-- 职工唯一标识
	eid bigint NOT NULL COMMENT '职工唯一标识',
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (ceiid)
);


CREATE TABLE CompanyInfo
(
	ciid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	address varchar(100),
	tel varchar(20),
	fax varchar(20),
	mail varchar(50),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (ciid)
);


CREATE TABLE Credential
(
	crid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 证书名称
	name varchar(50) COMMENT '证书名称',
	img_url varchar(50),
	description text,
	end_date date,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (crid)
);


CREATE TABLE Customer
(
	-- 用户ID
	cid bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
	-- 用户名称
	name varchar(50) COMMENT '用户名称',
	-- 用户年龄
	age smallint COMMENT '用户年龄',
	-- 性别
	sex varchar(1) COMMENT '性别',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (cid)
);


CREATE TABLE CustomerCompanyInfo
(
	cciid bigint NOT NULL AUTO_INCREMENT,
	-- 用户ID
	cid bigint NOT NULL COMMENT '用户ID',
	-- 公司的唯一标识
	ccid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (cciid)
);


CREATE TABLE CustomerEstimateInfo
(
	-- 流水号
	ceiid bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 用户ID
	cid bigint NOT NULL COMMENT '用户ID',
	celid bigint NOT NULL,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (ceiid)
);


CREATE TABLE CustomerEstimateLevel
(
	celid bigint NOT NULL AUTO_INCREMENT,
	-- 评价分数
	grade bigint COMMENT '评价分数',
	-- 评价类型
	type varchar(10) COMMENT '评价类型',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (celid)
);


CREATE TABLE CustomerInfo
(
	-- 客户详细信息ID
	ciid bigint NOT NULL AUTO_INCREMENT COMMENT '客户详细信息ID',
	-- 用户ID
	cid bigint NOT NULL COMMENT '用户ID',
	-- 别名
	alias_name varchar(20) COMMENT '别名',
	-- 密码
	pwd varchar(20) COMMENT '密码',
	img_url varchar(100),
	-- 手机号
	phone varchar(20) COMMENT '手机号',
	email varchar(50),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (ciid)
);


CREATE TABLE CustomerLevel
(
	-- 流水号
	clid bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 级别标识
	level int COMMENT '级别标识',
	-- 级别名称
	name varchar(25) COMMENT '级别名称',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (clid),
	UNIQUE (level)
);


CREATE TABLE CustomerLevelInfo
(
	-- 流水号
	cliid bigint NOT NULL AUTO_INCREMENT COMMENT '流水号',
	-- 用户ID
	cid bigint NOT NULL COMMENT '用户ID',
	-- 流水号
	clid bigint NOT NULL COMMENT '流水号',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (cliid)
);


CREATE TABLE Employee
(
	-- 职工唯一标识
	eid bigint NOT NULL AUTO_INCREMENT COMMENT '职工唯一标识',
	-- 职工姓名
	name varchar(20) COMMENT '职工姓名',
	-- 职工年龄
	age int COMMENT '职工年龄',
	-- 职工性别
	sex varchar(1) COMMENT '职工性别',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (eid)
);


CREATE TABLE EmployeeInfo
(
	-- 员工ID
	eiid bigint NOT NULL AUTO_INCREMENT COMMENT '员工ID',
	-- 职工唯一标识
	eid bigint NOT NULL COMMENT '职工唯一标识',
	-- 员工别名
	alias_name varchar(20) COMMENT '员工别名',
	img_url varchar(100),
	-- 员工密码
	pwd varchar(20) COMMENT '员工密码',
	-- 员工手机号
	phone varchar(20) COMMENT '员工手机号',
	-- 员工邮箱
	email varchar(50) COMMENT '员工邮箱',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (eiid)
);


CREATE TABLE EmployeeLevel
(
	-- 员工级别ID
	elid bigint NOT NULL AUTO_INCREMENT COMMENT '员工级别ID',
	level varchar(1),
	name varchar(20),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (elid)
);


CREATE TABLE EmployeeLevelInfo
(
	eliid bigint NOT NULL AUTO_INCREMENT,
	-- 员工级别ID
	elid bigint NOT NULL COMMENT '员工级别ID',
	-- 职工唯一标识
	eid bigint NOT NULL COMMENT '职工唯一标识',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (eliid)
);


CREATE TABLE EmployeeStatus
(
	esid bigint NOT NULL AUTO_INCREMENT,
	-- 1:在职
	-- 2:离职
	-- 3:休假
	status varchar(1) COMMENT '1:在职
2:离职
3:休假',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (esid)
);


CREATE TABLE EmployeeStatusInfo
(
	esiid bigint NOT NULL AUTO_INCREMENT,
	esid bigint NOT NULL,
	-- 职工唯一标识
	eid bigint NOT NULL COMMENT '职工唯一标识',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (esiid)
);


CREATE TABLE News
(
	nid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	title varchar(20),
	description varchar(200),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (nid)
);


CREATE TABLE NewsInfo
(
	niid bigint NOT NULL AUTO_INCREMENT,
	nid bigint NOT NULL,
	img_url varchar(100),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (niid)
);


CREATE TABLE PartnerInfo
(
	piid bigint NOT NULL AUTO_INCREMENT,
	pid bigint NOT NULL,
	img_url varchar(200),
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (piid)
);


CREATE TABLE Partners
(
	pid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	name varchar(50),
	description text,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (pid)
);


CREATE TABLE Project
(
	pid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	sid bigint NOT NULL,
	-- 项目名称
	name varchar(30) COMMENT '项目名称',
	-- 项目描述
	description varchar(500) COMMENT '项目描述',
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (pid)
);


CREATE TABLE ProjectEmployeeInfo
(
	peiid bigint NOT NULL AUTO_INCREMENT,
	-- 职工唯一标识
	eid bigint NOT NULL COMMENT '职工唯一标识',
	pid bigint NOT NULL,
	start_time datetime,
	end_time datetime,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (peiid)
);


CREATE TABLE ProjectInfo
(
	piid bigint NOT NULL AUTO_INCREMENT,
	pid bigint NOT NULL,
	img_url varchar(100),
	start_time datetime,
	end_time datetime,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (piid)
);


CREATE TABLE ServiceInfo
(
	siid bigint NOT NULL AUTO_INCREMENT,
	sid bigint NOT NULL,
	img_url varchar(100),
	start_time datetime,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (siid)
);


CREATE TABLE Services
(
	sid bigint NOT NULL AUTO_INCREMENT,
	-- 公司的唯一标识
	cid bigint NOT NULL COMMENT '公司的唯一标识',
	-- 服务名称
	name varchar(50) COMMENT '服务名称',
	description varchar(500) NOT NULL,
	-- 创建日期
	create_time datetime COMMENT '创建日期',
	update_time datetime,
	PRIMARY KEY (sid)
);



