package com.bml67.android.a67thmilestonebml;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class fdhandler  extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 5;
    private static final String DATABASE_NAME = "favourites.db";
    private static final String TABLE = "favoriteevent";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_name = "name";
    private static final String COLUMN_time = "time";
    private static final String COLUMN_place = "place";


    fdhandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "Create TABLE " + TABLE + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_name + " TEXT, " + COLUMN_time + " TEXT, " + COLUMN_place + " TEXT "  + ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }

    void addfavouriteevent(favouritesdatabase database) {
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE + " WHERE " + COLUMN_name + "=\"" + database.get_name() + "\";";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.getCount() == 0) {
            ContentValues values = new ContentValues();
            values.put(COLUMN_name, database.get_name());
            values.put(COLUMN_time, database.get_time());
            values.put(COLUMN_place, database.get_place());
            db.insert(TABLE, null, values);
        }
        cursor.close();
        db.close();
    }

    public void deleteEvent(String name) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE + " WHERE " + COLUMN_name + "=\"" + name + "\";");
    }

    String[] retrievename() {
        String dbString[] = null;
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE + " WHERE 1;";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
        int l = c.getCount();
        if (l != 0) {
            dbString = new String[l];
            int x = 0;
            while (x != l) {
                if (c.getString(c.getColumnIndex("name")) != null) {
                    dbString[x] = c.getString(c.getColumnIndex("name"));
                    c.moveToNext();
                    x++;
                }
            }
        }
        c.close();
        return dbString;
    }

    String[] retrievetime() {
        String dbString[] = null;
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE + " WHERE 1;";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
        int l = c.getCount();
        if (l != 0) {
            dbString = new String[l];
            int x = 0;
            while (x != l) {
                if (c.getString(c.getColumnIndex("time")) != null) {
                    dbString[x] = c.getString(c.getColumnIndex("time"));
                    c.moveToNext();
                    x++;
                }
            }
        }
        c.close();
        return dbString;
    }
    String[] retrieveplace() {
        String dbString[] = null;
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE + " WHERE 1;";
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
        int l = c.getCount();
        if (l != 0) {
            dbString = new String[l];
            int x = 0;
            while (x != l) {
                if (c.getString(c.getColumnIndex("place")) != null) {
                    dbString[x] = c.getString(c.getColumnIndex("place"));
                    c.moveToNext();
                    x++;
                }
            }
        }
        c.close();
        return dbString;
    }
}
