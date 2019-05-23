package com.spiralsnail.sunflower.domain.lifeservice;

import java.util.Date;

import com.spiralsnail.sunflower.domain.Organization;
import com.spiralsnail.sunflower.domain.User;
import com.spiralsnail.sunflower.base.BaseString;

/**
 * 生活服务模型
 *
 * @author liuyong
 *         2017-03-19 13:57
 *         com.spiralsnail.sunflower.domain.lifeservice.Service.java
 */
public class Service extends BaseString {

    //服务ID
    private long serviceId;

    //服务名
    private String serviceName;

    //服务详情
    private String serviceDetail;

    //分类(旅游，健康养生，医疗，护理)
    private String category;

    //报酬
    private int amount;

    //地址
    private String address;

    //手机号
    private String telphone;

    //相关图片
    private String relatedPicUrl;

    //性质(producer or consumer) TODO 待废弃
    private String nature;

    //热度(6 个级别 0,1,2,3,4,5默认为 2)
    private int hotLevel = 2;

    //创建时间
    private Date gmtCreate;

    //更新时间
    private Date gmtModify;

    //发布者
    private User publisher;

    //服务提供者
    private Organization producer;

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public User getPublisher() {
        return publisher;
    }

    public void setPublisher(User publisher) {
        this.publisher = publisher;
    }

    public String getRelatedPicUrl() {
        return relatedPicUrl;
    }

    public void setRelatedPicUrl(String relatedPicUrl) {
        this.relatedPicUrl = relatedPicUrl;
    }


    


    public Organization getProducer() {
		return producer;
	}

	public void setProducer(Organization producer) {
		this.producer = producer;
	}

	public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHotLevel() {
        return hotLevel;
    }

    public void setHotLevel(int hotLevel) {
        this.hotLevel = hotLevel;
    }
}
