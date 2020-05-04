package com.getan.mobilely0424.utils;

/**
 * Created by Administrator on 2020/4/28.
 * 邮箱：405181076@qq.com
 */
public class UrlUtils {
    public static String creatCateListUrl(String cate){
        //return "tools/service/getNewsList/"+cate+"/"+cateid+"/"+null+"/"+10;
        return "tools/service/getNewsList/"+cate;
    }

    public static String creatCateListMoreUrl(String cate, int curpage){
        //return "tools/service/getNewsList/"+cate+"/"+cateid+"/"+null+"/"+10;
        return "tools/service/getNewsList/"+cate+"/"+curpage;
    }
}
