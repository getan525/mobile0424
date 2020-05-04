package com.getan.mobilely0424.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2020/4/28.
 * 邮箱：405181076@qq.com
 */
public class CateNewsListBean {

    /**
     * result : success
     * data : {"time_stmp":1587972600,"time_last":"2020-04-27 15:30:00","cate":"news_all","cateId":1,"curpage":1,"time":1587972998,"pagesize":3,"news_list":[{"id":"997739","subTitle":"全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加","pubTime":"1587900765","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png","subImage":"images/202004/26/26194001_9015.png","sid":"2","cateId":"1","views":3960,"replies":"0","title":"全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加","showType":"0","picIds":"","ptime":"2020-04-26 19:32:45","mtime":"昨天","detailUrl":"http://shouji.lyd.com.cn/n/997739","imageList":["https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/298/00300329863_7ce7215c.png","praise":76,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200426/cross662122_105767.mp3"},{"id":"997818","subTitle":"洛阳网《百姓呼声》每日简报（4月26日）","pubTime":"1587958709","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27114501_7078.jpg","subImage":"images/202004/27/27114501_7078.jpg","sid":"2","cateId":"1","views":445,"replies":"0","title":"洛阳网《百姓呼声》每日简报（4月26日）","showType":"0","picIds":"","ptime":"2020-04-27 11:38:29","mtime":"3小时前","detailUrl":"http://shouji.lyd.com.cn/n/997818","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27114501_7078.jpg"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/300/00300330001_1fb2a110.jpg","praise":1,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross665378_106188.mp3"},{"id":"997762","subTitle":"\u201c云赏牡丹\u201d：外地网友感受到洛阳人对家乡的热爱","pubTime":"1587947858","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27084001_1268.jpg","subImage":"images/202004/27/27084001_1268.jpg","sid":"2","cateId":"1","views":271,"replies":"0","title":"\u201c云赏牡丹\u201d：外地网友感受到洛阳人对家乡的热爱","showType":"0","picIds":"","ptime":"2020-04-27 08:37:38","mtime":"6小时前","detailUrl":"http://shouji.lyd.com.cn/n/997762","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27084001_1268.jpg"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/299/00300329934_b79c1ea0.jpg","praise":3,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross664595_105864.mp3"},{"id":"997760","subTitle":"集中学习研讨县（市）片区推进会在偃师召开","pubTime":"1587947478","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27083501_2121.png","subImage":"images/202004/27/27083501_2121.png","sid":"2","cateId":"1","views":451,"replies":"0","title":"集中学习研讨县（市）片区推进会在偃师召开","showType":"0","picIds":"","ptime":"2020-04-27 08:31:18","mtime":"7小时前","detailUrl":"http://shouji.lyd.com.cn/n/997760","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27083501_2121.png"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/299/00300329932_b95be98a.png","praise":3,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross664553_105858.mp3"}],"uid":0}
     */

    private String result;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * time_stmp : 1587972600
         * time_last : 2020-04-27 15:30:00
         * cate : news_all
         * cateId : 1
         * curpage : 1
         * time : 1587972998
         * pagesize : 3
         * news_list : [{"id":"997739","subTitle":"全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加","pubTime":"1587900765","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png","subImage":"images/202004/26/26194001_9015.png","sid":"2","cateId":"1","views":3960,"replies":"0","title":"全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加","showType":"0","picIds":"","ptime":"2020-04-26 19:32:45","mtime":"昨天","detailUrl":"http://shouji.lyd.com.cn/n/997739","imageList":["https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/298/00300329863_7ce7215c.png","praise":76,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200426/cross662122_105767.mp3"},{"id":"997818","subTitle":"洛阳网《百姓呼声》每日简报（4月26日）","pubTime":"1587958709","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27114501_7078.jpg","subImage":"images/202004/27/27114501_7078.jpg","sid":"2","cateId":"1","views":445,"replies":"0","title":"洛阳网《百姓呼声》每日简报（4月26日）","showType":"0","picIds":"","ptime":"2020-04-27 11:38:29","mtime":"3小时前","detailUrl":"http://shouji.lyd.com.cn/n/997818","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27114501_7078.jpg"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/300/00300330001_1fb2a110.jpg","praise":1,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross665378_106188.mp3"},{"id":"997762","subTitle":"\u201c云赏牡丹\u201d：外地网友感受到洛阳人对家乡的热爱","pubTime":"1587947858","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27084001_1268.jpg","subImage":"images/202004/27/27084001_1268.jpg","sid":"2","cateId":"1","views":271,"replies":"0","title":"\u201c云赏牡丹\u201d：外地网友感受到洛阳人对家乡的热爱","showType":"0","picIds":"","ptime":"2020-04-27 08:37:38","mtime":"6小时前","detailUrl":"http://shouji.lyd.com.cn/n/997762","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27084001_1268.jpg"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/299/00300329934_b79c1ea0.jpg","praise":3,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross664595_105864.mp3"},{"id":"997760","subTitle":"集中学习研讨县（市）片区推进会在偃师召开","pubTime":"1587947478","source":"　","resubImage":"https://shouji.lyd.com.cn/tools/images/202004/27/27083501_2121.png","subImage":"images/202004/27/27083501_2121.png","sid":"2","cateId":"1","views":451,"replies":"0","title":"集中学习研讨县（市）片区推进会在偃师召开","showType":"0","picIds":"","ptime":"2020-04-27 08:31:18","mtime":"7小时前","detailUrl":"http://shouji.lyd.com.cn/n/997760","imageList":["https://shouji.lyd.com.cn/tools/images/202004/27/27083501_2121.png"],"resubImage_p":"http://news.lyd.com.cn/pic/003/003/299/00300329932_b95be98a.png","praise":3,"audioPath":"http://shouji.lyd.com.cn/tools/audio/tts/20200427/cross664553_105858.mp3"}]
         * uid : 0
         */

        private int time_stmp;
        private String time_last;
        private String cate;
        private int cateId;
        private int curpage;
        private int time;
        private int pagesize;
        private int uid;
        private List<NewsListBean> news_list;

        public int getTime_stmp() {
            return time_stmp;
        }

        public void setTime_stmp(int time_stmp) {
            this.time_stmp = time_stmp;
        }

        public String getTime_last() {
            return time_last;
        }

        public void setTime_last(String time_last) {
            this.time_last = time_last;
        }

        public String getCate() {
            return cate;
        }

        public void setCate(String cate) {
            this.cate = cate;
        }

        public int getCateId() {
            return cateId;
        }

        public void setCateId(int cateId) {
            this.cateId = cateId;
        }

        public int getCurpage() {
            return curpage;
        }

        public void setCurpage(int curpage) {
            this.curpage = curpage;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getPagesize() {
            return pagesize;
        }

        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public List<NewsListBean> getNews_list() {
            return news_list;
        }

        public void setNews_list(List<NewsListBean> news_list) {
            this.news_list = news_list;
        }

        public static class NewsListBean {
            /**
             * id : 997739
             * subTitle : 全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加
             * pubTime : 1587900765
             * source : 　
             * resubImage : https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png
             * subImage : images/202004/26/26194001_9015.png
             * sid : 2
             * cateId : 1
             * views : 3960
             * replies : 0
             * title : 全省文化旅游重大项目集中开工仪式在洛举行  李亚、何金平等参加
             * showType : 0
             * picIds :
             * ptime : 2020-04-26 19:32:45
             * mtime : 昨天
             * detailUrl : http://shouji.lyd.com.cn/n/997739
             * imageList : ["https://shouji.lyd.com.cn/tools/images/202004/26/26194001_9015.png"]
             * resubImage_p : http://news.lyd.com.cn/pic/003/003/298/00300329863_7ce7215c.png
             * praise : 76
             * audioPath : http://shouji.lyd.com.cn/tools/audio/tts/20200426/cross662122_105767.mp3
             */

            private String id;
            private String subTitle;
            private String pubTime;
            private String source;
            private String resubImage;
            private String subImage;
            private String sid;
            private String cateId;
            private int views;
            private String replies;
            private String title;
            private String showType;
            private String picIds;
            private String ptime;
            private String mtime;
            private String detailUrl;
            private String resubImage_p;
            private int praise;
            private String audioPath;
            private List<String> imageList;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getSubTitle() {
                return subTitle;
            }

            public void setSubTitle(String subTitle) {
                this.subTitle = subTitle;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getResubImage() {
                return resubImage;
            }

            public void setResubImage(String resubImage) {
                this.resubImage = resubImage;
            }

            public String getSubImage() {
                return subImage;
            }

            public void setSubImage(String subImage) {
                this.subImage = subImage;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getCateId() {
                return cateId;
            }

            public void setCateId(String cateId) {
                this.cateId = cateId;
            }

            public int getViews() {
                return views;
            }

            public void setViews(int views) {
                this.views = views;
            }

            public String getReplies() {
                return replies;
            }

            public void setReplies(String replies) {
                this.replies = replies;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getShowType() {
                return showType;
            }

            public void setShowType(String showType) {
                this.showType = showType;
            }

            public String getPicIds() {
                return picIds;
            }

            public void setPicIds(String picIds) {
                this.picIds = picIds;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public String getMtime() {
                return mtime;
            }

            public void setMtime(String mtime) {
                this.mtime = mtime;
            }

            public String getDetailUrl() {
                return detailUrl;
            }

            public void setDetailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
            }

            public String getResubImage_p() {
                return resubImage_p;
            }

            public void setResubImage_p(String resubImage_p) {
                this.resubImage_p = resubImage_p;
            }

            public int getPraise() {
                return praise;
            }

            public void setPraise(int praise) {
                this.praise = praise;
            }

            public String getAudioPath() {
                return audioPath;
            }

            public void setAudioPath(String audioPath) {
                this.audioPath = audioPath;
            }

            public List<String> getImageList() {
                return imageList;
            }

            public void setImageList(List<String> imageList) {
                this.imageList = imageList;
            }
        }
    }
}
