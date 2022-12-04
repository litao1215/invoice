package com.invoice.biz.impl;

import com.invoice.biz.IBaseDataBiz;
import com.invoice.dao.impl.BaseDataDaoImpl;
import com.invoice.entry.BaseData;
import com.invoice.entry.Total;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:36
 */
public class BaseDataBizImpl implements IBaseDataBiz {
    BaseDataDaoImpl bddi=new BaseDataDaoImpl();

    @Override
    public BaseData queryone(BaseData baseData) {
        return bddi.selectOne(baseData);
    }

    @Override
    public Total queryByEpId(Total total) {
        return bddi.selectByEpId(total.getEnterpriseid());
    }

    @Override
    public boolean modifyBaseDate(BaseData baseData) {
        return bddi.updateBaseDate(baseData)==0?false:true;
    }

}
