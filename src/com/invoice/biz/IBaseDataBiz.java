package com.invoice.biz;

import com.invoice.entry.BaseData;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:34
 */
public interface IBaseDataBiz {

    //判断是否修改成功
    boolean modifyBaseDate(BaseData baseData);
}
