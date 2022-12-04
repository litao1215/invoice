package com.invoice.biz;

import com.invoice.entry.BaseData;
import com.invoice.entry.Total;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:34
 */
public interface IBaseDataBiz {
    //判断是否显示成功
    BaseData queryone(BaseData baseData);

    //通过企业ID查询发票抬头及地址信息一栏
    Total queryByEpId(Total total);

    //判断是否修改成功
    boolean modifyBaseDate(BaseData baseData);

}
