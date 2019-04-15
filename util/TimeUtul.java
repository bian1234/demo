package com.hld.util;

import java.util.Date;

public class TimeUtul {


    /**
     * @TODO:  long时间戳转时间
     * @author:ykbian@qq.com
     * @date:2019/4/13 14:50
     * @param:
     * @return:
     */
    public Date getDate(Long l){
        Date date = new Date(l);
        return date;
    }


    /**
     * @TODO:  时间转long时间戳
     * @author:ykbian@qq.com
     * @date:2019/4/13 14:51
     * @param:
     * @return:
     */
    public long getLong(Date date){
        long l = date.getTime();
        return l;
    }

}
