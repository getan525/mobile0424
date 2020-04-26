package com.getan.mobilely0424.utils;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class Constants {

    /**
     * URL定义类</p>
     *
     * @description 该类主要是存放一些URL地址
     */

        public static final String URL = "http://shouji.lyd.com.cn/";
        // public static final String URL = "http://zsly.lyd.com.cn/";
        /** 日报首页接口 */
        public static final String EPAPERURL = URL + "paper/service/getPeriods/";
        /** 电子报所有版面接口 */
        public static final String PAGEURL = URL + "paper/service/getPeriod/";
        /** 电子报版面接口 */
        public static final String GETLAYOUT = URL + "paper/service/getLayout/";
        /** 商城端口 */
        // public static final String PORT_URL =
        // "http://115.28.35.65:8888/MobileLY/";
        // public static final String PORT_URL = "http://172.16.1.151/MobileLY/";
        public static final String PORT_URL = "http://zslyapi.lyd.com.cn/MobileLY/";
        /** 获取商品列表 */
        public static final String GOODLISTURL = PORT_URL
                + "index.php/phone_goods/goods_list";
        /** 商城首页图片轮播 */
        public static final String MALL_CAROUSEL = PORT_URL
                + "index.php/phone_slide/list_slide";
        /** 商品详情页1 */
        public static final String GOODDETAIL_TOP = PORT_URL
                + "index.php/phone_goods/goods_detail/";
        /** 商品详情页2 */
        public static final String GOODDETAIL_BOTTOM = PORT_URL
                + "index.php/phone_goods/goods_detail_page/";
        /** 添加用户地址信息 */
        public static final String ADD_ADDRESS = PORT_URL
                + "index.php/phone_addr/create_addr?";
        /** 修改用户地址信息 */
        public static final String UPDATE_ADDRESS = PORT_URL
                + "index.php/phone_addr/up_addr?";
        /** 生成订单 */
        public static final String CREAT_ORDER = PORT_URL
                + "index.php/phone_order/create_order?";
        /** 购物车列表 */
        public static final String SHOPCAR_LIST = PORT_URL
                + "index.php/phone_cart/query_list/";
        /** 购物车支付接口 */
        public static final String MALL_SHOPPING = PORT_URL
                + "public/phone_alipay/alipayapi.php?";
        /** 订单详情 */
        public static final String ORDER_DETAIL = PORT_URL
                + "index.php/phone_order/queryform/";
        /** 购物车删除 */
        public static final String DEL_SHOPCAR = PORT_URL
                + "index.php/phone_cart/del_cart?";
        /** 购物车添加 */
        public static final String ADD_SHOPCAR = PORT_URL
                + "index.php/phone_cart/create_cart?";
        /** 修改购物车 */
        public static final String CHANGE_SHOPCAR = PORT_URL
                + "index.php/phone_cart/up_cart?";
        /** 修改订单状态 */
        public static final String CHANGE_ORDER = PORT_URL
                + "index.php/phone_order/update_phone_order/";
        /** 获取用户地址信息 */
        public static final String GET_ADDRESS = PORT_URL
                + "index.php/phone_addr/queryform/";
        /** 获取购物车数量 */
        public static final String SHOPCAR_NUMBER = PORT_URL
                + "index.php/phone_cart/all_count_cart/";
        /** 我的订单列表 */
        public static final String ORDER_LIST = PORT_URL
                + "index.php/phone_order/index/";
        /** 获取商品详细信息 */
        public static final String GET_GOODS = PORT_URL
                + "index.php/phone_goods/get_goods/";

        /** 推荐分类接口 */
        public static final String NEWSCATEURL = URL + "tools/service/getNewsCate";
        /** 推荐分类新闻列表接口 */
        public static final String NEWSLISTURL = URL + "tools/service/getNewsList";
        /** 新闻详情 页面 */
        public static final String ARTIURL = URL + "tools/test/getArti";
        /** 新闻详情页数据接口 */
        public static final String ARTIINFOURL = URL + "tools/service/getNewsInfo";
        /** 添加收藏 */
        public static final String ADDCOLLECTURL = URL + "tools/user/addFavorite";
        /** 取消收藏 */
        public static final String DELCOLLECTURL = URL + "tools/user/delFavorite";
        /** 添加评论 */
        public static final String ADDCOMMENT = URL + "tools/user/addPost";
        /** 删除收藏 */
        public static final String Delete_COLL = URL + "tools/user/delFavorite";
        /** 推荐图片轮播 */
        public static final String ADVURL = URL + "tools/client/focusimg/news";
        /** 收藏列表 */
        public static final String ADD_CLOO = URL + "tools/user/getFavoriteList";

        /** 取COOKI */
        public static final String ADD_COLL = URL + "tools/user/getCsrfToken/";

        /** 增加返回 */
        public static final String ADD_COOKI = URL + "tools/user/getFavoriteList";
        /** 增加返回 */
        public static final String ADD_FEEDBACK = URL + "tools/user/getCsrfToken";
        /** 提交 */
        public static final String TIJIAO = URL + "tools/user/addComment";
        /** 检查更新 */
        public static final String JCGX = URL + "tools/client/version/android";
        /** 注销 */
        public static final String CANCEL = URL + "tools/user/loginOut";

        /** 获取图片 */
        public static final String GET_DEPT_IMAGES = URL
                + "tools/client/focusimg/people/0";

        /** 获取区域 */
        public static final String GET_AREA_LIST = URL + "tools/people/getAreaList";

        /** 获取部门分类详情 */
        public static final String GET_DEPT_CATE = URL + "tools/people/getDeptCate";

        /** 获取部门列表 */
        public static final String GET_DEPT_LIST = URL
                + "tools/people/getDeptList/";

        /** 获取部门问题列表 */
        public static final String GET_DEPT_QUE_LIST = URL
                + "tools/people/getDeptQueList";

        /** 获取问题搜索列表 */
        public static final String GET_SEARCH_LIST = URL
                + "tools/people/getSearchList";

        /** 获取发布问题部门列表 */
        public static final String GET_PUB_DEPT_LIST = URL
                + "tools/people/getPubDeptList";

        /** 上传民声图片 */
        public static final String PUB_IMAGE = URL + "tools/people/pubImage";

        /** 获取我的呼声 */
        public static final String GET_MY_QUE_LIST = URL
                + "tools/people/getMyQueList";
        /** 提问 */
        public static final String PUQUESTION = URL + "tools/people/pubQuestion";
        /** 民生评论 */
        public static final String ADD_POST = URL + "tools/people/addPost";
        /** 验证手机号是否存在 */
        public static final String CHECKPHONEEXIST = URL
                + "tools/user/checkPhoneExist/";
        /** 验证用户名是否存在 */
        public static final String CHECKUNAMEEXIST = URL
                + "tools/user/checkUnameExist/";
        /** 同时验证用户名和手机号是否存在 */
        public static final String CHECKREGISTER = URL + "tools/user/checkRegister";
        /** 发送短信接口 */
        public static final String SENDPHONECODE = URL
                + "tools/user/sendPhoneCode/";
        /** 获取接口交互验证串接口 */
        public static final String GETCSRFTOKEN = URL + "tools/user/getCsrfToken";
        /** 用户登陆 接口 */
        public static final String PHONELOGIN = URL + "tools/user/phoneLogin";
        /** 验证用户登陆状态 */
        public static final String ISLOGIN = URL + "tools/user/isLogin";
        /** 用户注册接口 */
        public static final String REGISTER = URL + "tools/user/register";
        /** 用户找回密码接口 */
        public static final String FINDPWD = URL + "tools/user/findPwd";
        /** 天气预报查询接口 */
        public static final String WEATHER = "http://api.map.baidu.com/telematics/v3/weather";
        /** 快递查询接口 */
        public static final String KUAIDI = "http://www.kuaidi100.com/query";
        /** 电子报详情数据 */
        public static final String GETARTICLE = URL + "paper/service/getArticle";
        /** 民生标题图片 */
        public static final String TELIMG = URL + "tools/client/focusimg/people";
        /** 分享默认标题图片 */
        public static final String DEFAULTSHAREIMAGE = "http://zslyapi.lyd.com.cn:8888/MobileLY/public/ic_launcher_2.png";
        /** 分享链接 */
        public static final String SHAREITURL = URL;
        /** 消息列表 */
        public static final String MESSURL = URL + "tools/user/getUserMsgList";
        public static final String DELMESS = URL + "tools/msg/delUserMsg";

    public static String deviceId="";
}
