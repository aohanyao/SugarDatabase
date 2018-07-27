package com.aohanyao.sugar.db.example;

import com.aohanyao.sugar.db.annotation.Column;
import com.aohanyao.sugar.db.annotation.Table;

@Table(name = "sugar_department")
public class Department {
    @Column(name = "id", isId = true)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;
}
