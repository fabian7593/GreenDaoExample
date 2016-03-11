package com.example.keybellsoft.greendaoexample.GreenDao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import testDb.DaoMaster;
import testDb.DaoSession;

/**
 * Created by Frosquivel Developer on 10/03/2015.
 * Fabián Rosales Esquivel
 */
public class DbHelper {

    private SQLiteDatabase db;
    //ORM GreenDAO
    private DaoMaster daoMaster;
    public DaoSession daoSession;

    public DbHelper(Context pAppContext) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(pAppContext, "TestApp", null);
        db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

}
