package com.invoice.dao;

import com.invoice.entry.BaseData;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:43
 */
public interface IBaseDataDao {

    //通过点击编辑去修改数据库中的发票基础信息表中的数据
    int updateBaseDate(BaseData baseData);
}
