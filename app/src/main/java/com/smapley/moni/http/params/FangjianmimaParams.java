package com.smapley.moni.http.params;


import com.smapley.moni.util.MyData;

import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;

/**
 * Created by smapley on 16/1/25.
 */
public class FangjianmimaParams extends RequestParams {

    public FangjianmimaParams(String mima, String onlyid) {
        super(MyData.URL_fangjianmima);
        addBodyParameter("mima", mima);
        addBodyParameter("onlyid", onlyid);
        try {
            LogUtil.d(toJSONString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
