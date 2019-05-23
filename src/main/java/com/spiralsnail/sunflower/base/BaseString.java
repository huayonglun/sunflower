package com.spiralsnail.sunflower.base;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *    字符串基类
 *
 * @author liuyong
 * @version BaseString.java, v 0.1 2019年05月21日 00:30
 */

public class BaseString implements Serializable {

    /** serId */
    private static final long serialVersionUID = 4623748445652575746L;

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
