package com.spiralsnail.sunflower.domain.roundtable;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 圆桌讨论模型
 *
 * @author liuyong 2017-03-19 10:40 com.spiralsnail.sunflower.domain.roundtable.Discussion.java
 */
public class Discussion extends BaseString {

    /** serId */
    private static final long serialVersionUID = 6501350713430856797L;

    // 讨论ID
    private long disId;

    // 讨论内容
    private String content;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 所属用户
    private User author;

    // 所属圆桌
    private Talk talk;

}
