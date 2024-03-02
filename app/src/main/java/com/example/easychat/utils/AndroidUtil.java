package com.example.easychat.utils;

import android.content.Context;
import android.widget.Toast;

public class AndroidUtil {

    public static void showToast(Context contex, String message){
        Toast.makeText(contex, message, Toast.LENGTH_SHORT).show();
    }

}
