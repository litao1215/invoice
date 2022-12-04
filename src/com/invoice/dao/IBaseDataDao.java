package com.invoice.dao;

import com.invoice.entry.BaseData;
import com.invoice.entry.Total;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:43
 */
public interface IBaseDataDao {
    //查询表里的全部信息
    BaseData selectOne(BaseData baseData);

    //通过企业ID查询发票抬头及地址信息一栏
    Total selectByEpId(int enterpriseid);

    //通过点击编辑去修改数据库中的发票基础信息表中的数据
    int updateBaseDate(BaseData baseData);
}
