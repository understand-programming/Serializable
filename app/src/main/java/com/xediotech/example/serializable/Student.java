package com.xediotech.example.serializable;

import java.io.Serializable;

/**
 * Created by KHAN on 26/05/15.
 */
public class Student implements Serializable {


    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    String mFirstName;
    String mLastName;

    public Student() {

    }



}
