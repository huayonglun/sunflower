package com.spiralsnail.sunflower.domain;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;

import lombok.Getter;
import lombok.Setter;

/**
 *     组织模型
 *
 * @author liuyong
 * @version Organization.java, v 0.1 2019年05月20日 23:55
 */
@Setter
@Getter
public class Organization extends BaseString {

    /** serId */
    private static final long serialVersionUID = 1163337703770919761L;

    // ID
    private long orgId;

    // 组织名称，对应到注册时的账户名
    private String name;

    // 组织分类（企业，媒体，公益组织，协会）
    private String category;

    // 组织简介
    private String briefIntroduction;

    // 主要业务
    private String biz;

    // 地址
    private String address;

    // 联系邮箱
    private String email;

    // 联系电话
    private String tel;

    // 审核状态
    private int state;

    // 组织环境图片
    private String envPicUrl;

    // 组织产品图片
    private String productPicUrl;

    // 组织活动图片
    private String activityPicUrl;

    private Date gmtCreate;

    private Date gmtModify;

}
