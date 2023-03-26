package com.synchrony.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class UserModel {
    //mark id as primary key
    @Id
//defining id as column name
    @Column
    private int userIdd;
    //defining name as column name
    @Column
    private String uswrName;
    //defining age as column name
    @Column
    private String password;
}
