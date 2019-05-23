package com.spiralsnail.sunflower.domain.lifeservice;

import java.util.Date;

import com.spiralsnail.sunflower.base.BaseString;
import com.spiralsnail.sunflower.domain.User;

/**
 * 工作室模型
 *
 * @author liuyong 2017-03-29 20:32 com.spiralsnail.sunflower.domain.lifeservice.WorkRoom.java
 */
public class WorkRoom extends BaseString {

    /** serId */
    private static final long serialVersionUID = -5517707553651660327L;

    // 工作室ID
    private long workRoomId;

    // 工作室名称
    private String workRoomName;

    // 工作室类别(画室，形体室，书法室，录音棚，其他)
    private String category;

    // 工作室详情
    private String workRoomDetail;

    // 作品URL
    private String productUrl;

    // 审核状态(0 为未通过， 1 为通过)
    private int state;

    // 热度(5 个级别 0,1,2,3,4，默认为 2)
    private int hotLevel = 2;

    // 创建日期
    private Date gmtCreate;

    // 修改日期
    private Date gmtModify;

    // 开办者
    private User creator;

}
