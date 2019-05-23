package com.spiralsnail.sunflower.domain;

import com.spiralsnail.sunflower.base.BaseString;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 *     用户模型
 *
 * @author liuyong
 * @version User.java, v 0.1 2019年05月20日 23:54
 */
@Setter
@Getter
public class User extends BaseString {

    /** serId */
    private static final long serialVersionUID = -4339519098003658298L;

    // 用户ID
    private long userId;

    // 账户名(唯一，企业对应到企业全称)
    private String accountName;

    // 昵称
    private String nickname;

    // 真名(企业对应到法人姓名)
    private String realname;

    // 身份证号
    private String idCardNumber;

    // 密码
    private String password;

    // 邮箱
    private String email;

    // 年龄
    private int age;

    // 性别
    private String sex;

    // 角色(ADMIN,OLD,YOUNG,COMMITTEE,COMPANY)
    private String role;

    // 手机
    private String telphone;

    // 用户简介
    private String briefIntroduction;

    // 激活码
    private String activateCode;

    // 状态(0 表示可用，1 表示不可用)
    private int state;

    // 头像图片URL
    private String headPicUrl;

    // 企业营业执照图片URL
    private String bizLicencePicUrl;

    // 所在地理位置社区名
    private String posCommunityName;

    // 所在兴趣社区名
    private String likeCommunityName;

    // 创建日期
    private Date gmtCreate;

    // 修改日期
    private Date gmtModify;
}
