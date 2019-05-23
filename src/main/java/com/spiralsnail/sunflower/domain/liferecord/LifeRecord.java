package com.spiralsnail.sunflower.domain.liferecord;

import java.util.Date;
import java.util.Set;

import com.google.common.collect.Sets;
import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 生活记录分享模型
 *
 * @author liuyong 2017-03-24 16:33 com.spiralsnail.sunflower.domain.liferecord.LifeRecord.java
 */
public class LifeRecord extends BaseString {

    /** serId */
    private static final long serialVersionUID = 1327332100605356154L;

    // 记录ID
    private long recordId;

    // 记录标题
    private String title;

    // 记录内容
    private String content;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 发布者
    private User author;

    // 评论集合
    private Set<RecordComment> recordComments = Sets.newHashSet();

}
