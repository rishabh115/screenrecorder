package com.confusedbox.screenrecorder;

import android.content.Context;

import com.snappydb.DB;
import com.snappydb.DBFactory;

public class Utils {
    public static final String STATUS="status";
    public static boolean checkStatus(Context context)
    {
        try
        {
            DB snappyDB= DBFactory.open(context);
            if (snappyDB.exists(STATUS))
            {
                return snappyDB.getBoolean(STATUS);
            }
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
        return false;
    }
    public static void turnOn(Context context)
    {
        try
        {
            DB snappyDB= DBFactory.open(context);
            snappyDB.putBoolean(STATUS,true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void turnOff(Context context)
    {
        try
        {
            DB snappyDB= DBFactory.open(context);
            snappyDB.putBoolean(STATUS,false);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
