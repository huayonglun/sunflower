package com.spiralsnail.sunflower.domain.roundtable;

import java.util.Date;
import java.util.Set;

import com.google.common.collect.Sets;
import com.spiralsnail.sunflower.base.BaseString;

/**
 * 圆桌讨论模型
 *
 * @author liuyong 2017-03-19 10:33 com.spiralsnail.sunflower.domain.Talk.java
 */
public class Talk extends BaseString {

    /** serId */
    private static final long serialVersionUID = 2365470377302493415L;

    // 圆桌ID
    private long talkId;

    // 圆桌名
    private String talkName;

    // 圆桌详情
    private String talkDetail;

    // 圆桌显示级别
    private int showLevel;

    // 圆桌图片 URL
    private String picUrl;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 讨论集合
    private Set<Discussion> discussions = Sets.newHashSet();

    // 问题集合
    private Set<Question> questions = Sets.newHashSet();

}
