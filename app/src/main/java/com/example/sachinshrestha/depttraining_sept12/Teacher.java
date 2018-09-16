package com.example.sachinshrestha.depttraining_sept12;

import android.util.Log;

public class Teacher extends MeroAbstractClaa implements MeroInterface,MeroInterface2{

    final static String TAG = "TAG_TEACHER";
    static String college;
    int age;
    String name;
    String sex;
    String faculty;


    Teacher(){}
    Teacher(int age, String name, String sex, String faculty){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.faculty = faculty;
    }

    void teaching(){
        Log.d(TAG, name + " is teaching.");
    }

    void salary(){
        Log.d(TAG,"as per college rules");
    }

    int FindArea(int length){
        return (length * length);
    }

    int FindArea(int length, int breadth){
        return  (length * breadth);
    }

    @Override
    void PrepareLogSheet() {

    }

    @Override
    void PrepareLogSheet1() {

    }

    @Override
    void PrepareLogSheet2() {

    }

    @Override
    public void Interface1() {

    }

    @Override
    public void Interface2() {

    }

    @Override
    public void Interface3() {

    }

    @Override
    public void Interface4() {

    }
}
