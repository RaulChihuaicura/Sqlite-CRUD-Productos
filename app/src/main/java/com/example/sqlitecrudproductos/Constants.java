package com.example.sqlitecrudproductos;

public class Constants {

    // db name
    public static final String DB_NAME = "PRODUCT_INFO_DB";
    // db version
    public static final int DB_VERSION = 1;
    // db table
    public static final String TABLE_NAME = "PRODUCT_INFO_TABLE";
    // table columns
    public static final String C_ID = "ID";
    public static final String C_NAME = "NAME";
    public static final String C_COST = "COST";
    public static final String C_QUANTITY = "QUANTITY";
    public static final String C_IMAGE = "IMAGE";
    public static final String C_ADD_TIMESTAMP = "ADD_TIMESTAMP";
    public static final String C_UPDATE_TIMESTAMP = "UPDATE_TIMESTAMP";
    //create query for table
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + C_ID + " INSERT PRIMARY KEY AUTOINCREMENT,"
            + C_NAME + " TEXT,"
            + C_COST + " TEXT,"
            + C_QUANTITY + "TEXT,"
            + C_IMAGE + " TEXT,"
            + C_ADD_TIMESTAMP + " TEXT,"
            + C_UPDATE_TIMESTAMP + " TEXT"
            + ");";
}
