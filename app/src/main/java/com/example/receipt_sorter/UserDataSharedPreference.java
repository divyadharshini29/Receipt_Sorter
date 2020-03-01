package com.example.receipt_sorter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
public class UserDataSharedPreference {
    SharedPreferences s;
    private User u;


    public UserDataSharedPreference(Context context,String SP_NAME) {

            this.s = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);


    }



    public boolean writeData(User u)
    {


        Editor e=s.edit();
        e.putString("fname",u.getFname());
        e.putString("lname",u.getLname());
        e.putString("dob" ,u.getDob().toString());
        e.putString("email",u.getEmail().toString());
        e.putString("pwd",u.getPassword());
        if(e.commit())
            return true;
        else
            return false;
    }
    public User retrieveData()
    {
        User u=new User();
        u.setFname(s.getString("fname",""));//second param is default value;
        u.setFname(s.getString("lname",""));
        u.setFname(s.getString("dob",""));
        u.setFname(s.getString("email",""));
        u.setFname(s.getString("pwd",""));
        return u;

    }

}
