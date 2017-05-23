package com.zyzs.ewin.xunfei.base;

import android.app.Application;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * XunFei
 * com.zyzs.ewin.xunfei.base
 * BaseApplication
 * <p>
 * Created by Stiven on 2017/5/22.
 * Copyright © 2017 ZYZS-TECH. All rights reserved.
 */

public class BaseApplication extends Application{

    @Override
    public void onCreate() {
        StringBuffer param = new StringBuffer();
        param.append("appid=5922a85d");
        param.append(",");
        // 设置使用v5+
        param.append(SpeechConstant.ENGINE_MODE+"="+SpeechConstant.MODE_MSC);
        SpeechUtility.createUtility(BaseApplication.this, param.toString());
        super.onCreate();
    }
}
