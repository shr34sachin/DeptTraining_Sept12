package com.example.sachinshrestha.depttraining_sept12;

import android.util.Log;

public class MeroContructor {

    final static String TAG = "TAG_CONSTRUCTOR";

//    MeroContructor(){
//
//    }

    MeroContructor(){
        Log.d(TAG,"Constructor created");
    }

    MeroContructor(int x, int y){
        Log.d(TAG,"x=" + x + " y=" + y);
    }

}
