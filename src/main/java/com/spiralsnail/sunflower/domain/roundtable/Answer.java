package com.spiralsnail.sunflower.domain.roundtable;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 圆桌回答模型
 *
 * @author liuyong 2017-03-19 11:25 com.spiralsnail.sunflower.domain.roundtable.Answer.java
 */
public class Answer extends BaseString {

    /** serId */
    private static final long serialVersionUID = 1368156282611205385L;

    // 回答ID
    private long ansId;

    // 回答内容
    private String content;

    // 创建时间
    private Date gmtCreate;

    // 更新时间
    private Date gmtModify;

    // 所属用户
    private User author;

    // 所属问题
    private Question question;

}
