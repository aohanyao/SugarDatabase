package com.aohanyao.sugar.db.converter;

import android.database.Cursor;

import com.aohanyao.sugar.db.sqlite.ColumnDbType;

/**
 * Author: wyouflf
 * Date: 13-11-4
 * Time: 下午8:57
 * Des : 数据库列转换接口
 */
public interface ColumnConverter<T> {

    /**
     * 获取属性值
     *
     * @param cursor 数据游标
     * @param index  下标
     * @return 类泛型
     */
    T getFieldValue(final Cursor cursor, int index);

    /**
     * 将类属性转换为数据库值
     *
     * @param fieldValue 类属性
     * @return
     */
    Object fieldValue2DbValue(T fieldValue);

    /**
     * 数据库列类型
     *
     * @return
     */
    ColumnDbType getColumnDbType();
}
