package com.panxun.signature;

import android.app.*;
import android.os.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		SignCheck signCheck = new SignCheck(this,"签名sha1值");
		if(signCheck.check()) {
			//TODO 签名正常
		}else                {
			//TODO 签名不正确
			new AlertDialog.Builder(this).setMessage("请前往官方渠道下载正版 app， http://.....").setPositiveButton("确定",null).show();
		}
		
		
    }
	
	
	
}
