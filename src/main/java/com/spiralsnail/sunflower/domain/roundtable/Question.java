package com.spiralsnail.sunflower.domain.roundtable;

import java.util.Date;
import java.util.Set;

import com.google.common.collect.Sets;
import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 圆桌问题模型
 *
 * @author liuyong 2017-03-19 11:21 com.spiralsnail.sunflower.domain.roundtable.Question.java
 */
public class Question extends BaseString {

    /** serId */
    private static final long serialVersionUID = -6782938351399841313L;

    // 问题ID
    private long quesId;

    // 问题标题
    private String title;

    // 问题内容
    private String content;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 所属用户
    private User author;

    // 所属圆桌
    private Talk talk;

    // 答案集合
    private Set<Answer> answers = Sets.newHashSet();

}
