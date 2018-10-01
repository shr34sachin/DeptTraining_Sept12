package com.example.sachinshrestha.depttraining_sept12.database_sharedpreference_package_test;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class DatabaseTestSQLite extends SQLiteOpenHelper {

    private static final String DB_NAME = "myDB.db";
    private static final String TABLE_NAME = "STUDENT_DB";
    private static final String COL1 = "id";
    private static final String COL2 = "name";
    private static final String COL3 = "crn";
    private static final String COL4 = "faculty";
    private static final int my_version = 1;
    private Context context;

    public DatabaseTestSQLite(@Nullable Context context) {
        super(context, DB_NAME, null, my_version);
        this.context = context;
        Toast.makeText(context, "constructor created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createQuery = "CREATE TABLE " + TABLE_NAME + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COL2 + " VARCHAR,"
                + COL3 + " INTEGER,"
                + COL4 + " VARCHAR)";

        db.execSQL(createQuery);
        Toast.makeText(context, "db created", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropQuery);

        onCreate(db);
        Toast.makeText(context, "upgrading", Toast.LENGTH_SHORT).show();
    }

    public boolean InsertData(SQLiteDatabase db, String name, int crn, String faculty){
        ContentValues content = new ContentValues();
        content.put(COL2, name);
        content.put(COL3,crn);
        content.put(COL4, faculty);

        long ret = db.insert(TABLE_NAME, null, content);
        if (ret == -1) return false;
        else return true;
    }

    public Cursor GetAllData(SQLiteDatabase db){
        String[] colNames = {COL2,COL3,COL4};

        Cursor cursor = db.query(TABLE_NAME,colNames,null,null,null,null,null);
        return cursor;
    }

    public Cursor GetData(SQLiteDatabase db,String chooseCol, String[] val){
        String[] colNames = {COL2,COL3,COL4};

        Cursor cursor = db.query(TABLE_NAME,colNames,chooseCol + "=?",val,null,null,null);
        return cursor;
    }

    public int updateData(SQLiteDatabase db, String col2Change, String[] val){
        ContentValues content = new ContentValues();
        content.put("name","ll");
        content.put("crn",34);
        content.put("faculty","ele");
        return db.update(TABLE_NAME,content,col2Change + "=?",val);
    }


}
