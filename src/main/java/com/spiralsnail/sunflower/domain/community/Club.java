package com.spiralsnail.sunflower.domain.community;

import com.google.common.collect.Sets;
import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

/**
 * 俱乐部模型
 * 
 * @author liuyong
 * @version Club.java, v 0.1 2019年05月20日 23:51
 */
@Setter
@Getter
public class Club extends BaseString {

    /** serId */
    private static final long serialVersionUID = -9151961727143246200L;

    // 俱乐部ID
    private long clubId;

    // 俱乐部名称
    private String name;

    // 俱乐部口号
    private String slogan;

    // 俱乐部详情
    private String detail;

    // 俱乐部分类
    private String rootCategory;

    // 俱乐部二级分类
    private String subCategory;

    // 俱乐部图片URL
    private String picUrl;

    // 动态个数
    private int postsCount;

    // 关注者
    private Set<User> followers = Sets.newHashSet();

    // 创建者
    private User creator;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

}
