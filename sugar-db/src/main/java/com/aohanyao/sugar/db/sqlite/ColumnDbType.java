package com.aohanyao.sugar.db.sqlite;

/**
 * Created by wyouflf on 14-2-20.
 * 数据库 列类型
 */
public enum ColumnDbType {
    /**数字*/
    INTEGER("INTEGER"),
    /**保持不变*/
    REAL("REAL"),
    /**文本*/
    TEXT("TEXT"),
    /**长数据*/
    BLOB("BLOB");

    private String value;

    ColumnDbType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
