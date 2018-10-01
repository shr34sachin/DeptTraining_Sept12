package com.example.sachinshrestha.depttraining_sept12.mero_database_sharedpref_package;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MeroDatabaseHelper extends SQLiteOpenHelper {

    private final static String DB_NAME = "SHARE_DATABASE.db";
    private final static int version = 3;
    private Context context;
    private final static String TABLE_NAME = "MERO_SHARE_MARKET";
    private final static String COL1 = "id";
    private final static String COL2 = "symbol";
    private final static String COL3 = "price";
    private final static String COL4 = "kitta";

//    String queryTableCreateGarne = "CREATE TABLE MERO_SHARE_MARKET" +
//            "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
//            "symbol VARCHAR, price INTEGER, kitta INTEGER)";

    public MeroDatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, version);
        this.context = context;
        Toast.makeText(context, "inside constructor", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String queryTableCreate = "CREATE TABLE " + TABLE_NAME + "(" +
                COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                COL2 + " VARCHAR," +
                COL3 + " INTEGER," +
                COL4 + " INTEGER)";
        db.execSQL(queryTableCreate);
        Toast.makeText(context, "db created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String queryDrop = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(queryDrop);

        onCreate(db);
        Toast.makeText(context, "upgraded", Toast.LENGTH_SHORT).show();
    }

    public boolean InsertDataDatabase(SQLiteDatabase db,String symbol,int price, int kitta){
        ContentValues content = new ContentValues();
        content.put(COL2,symbol);
        content.put(COL3,price);
        content.put(COL4,kitta);

        long retVal = db.insert(TABLE_NAME,null,content);
        if(retVal == -1) return false;
        else return true;
    }

    public Cursor GetAllData(SQLiteDatabase db){
        String[] colNames = {COL2, COL3, COL4};
        Cursor cursor = db.query(TABLE_NAME,colNames,null,
                null,null,null,null);

        return cursor;
    }

}
