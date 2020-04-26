package com.getan.mobilely0424.base;

/**
 * Created by Administrator on 2020/4/26.
 * 邮箱：405181076@qq.com
 */
/*public class test {

    /*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public interface IModel {

    }

    public interface IPresenter<V extends IView> {
        *//**
         * 绑定
         *
         * @param view
         *//*
        void attachView(V view);

        *//**
         * 防止内存的泄漏, 清除Presenter与Activity之间的绑定
         *//*
        void detachView();

        *//**
         * @return 获取View
         *//*
        V getIView();
    }

    public interface IView {

    }
    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*

    public class LoginContract {
        public interface LoginView {
            String getUserName();

            String getPwd();

            void loginSuccess(LoginBean loginBean); // 登录成功，展示数据

            void loginFail(String failMsg);
        }

        public interface LoginPresenter {
            void login(String name, String pwd); // 业务逻辑
        }
    }

    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public class LoginModel extends BaseModel {
        private boolean isLogin = false;

        public boolean login(@NonNull String username, @NonNull String pwd, @NonNull final DataListener
                listener) {        // 此处推荐使用 RxJava + Retrofit 进行网络请求
            // 网络请求成功 isLogin = true; listener.successInfo(articles);
            // 网络请求失败 isLogin = false; listener.failInfo(str);
            return isLogin;
        }    // 通过接口产生信息回调

        public interface DataListener<T> {
            void successInfo(T result);

            void failInfo(String result);
        }
    }

    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public class BaseModel implements IModel {
        // 做一些数据处理, 网路请求的初始化操作
    }

    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public class LoginPresenter extends BasePresenter<LoginActivity> implements
            LoginContract.LoginPresenter {
        @Override
        public void login(String name, String pwd) {
            if (!getIView().checkNull()) {
                ((LoginModel) getiModelMap().get("login")).login(name, pwd, new LoginModel
                        .DataListener<LoginBean>() {
                    @Override
                    public void successInfo(LoginBean result) {
                        getIView().loginSuccess(result); // 成功
                    }

                    @Override
                    public void failInfo(String result) {
                        getIView().loginFail(result); // 失败
                    }
                });
            }
        }

        @Override
        public HashMap<String, IModel> getiModelMap() {
            return loadModelMap(new LoginModel());
        }

        @Override
        public HashMap<String, IModel> loadModelMap(IModel... models) {
            HashMap<String, IModel> map = new HashMap<>();
            map.put("login", models[0]);
            return map;
        }
    }

    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public abstract class BasePresenter<V extends IView> implements IPresenter {
        private WeakReference<V> mViewRef; // View接口类型的弱引用

        *//**
         * 建立关联
         *
         * @param iview
         *//*
        @Override
        public void attachView(IView iview) {
            mViewRef = new WeakReference(iview);
        }

        *//**
         * 解除关联
         *//*
        @Override
        public void detachView() {
            if (mViewRef != null) {
                mViewRef.clear();
                mViewRef = null;
            }
        }

        *//**
         * 获取View
         *
         * @return
         *//*
        @Override
        public V getIView() {
            return mViewRef.get();
        }

        *//**
         * 判断是否与View建立了关联
         *
         * @return 建立则返回true
         *//*
        public boolean isViewAttached() {
            return mViewRef != null && mViewRef.get() != null;
        }

        public abstract HashMap<String, IModel> getiModelMap();

        *//**
         * @param models
         * @return 添加多个model, 如有需要
         *//*
        public abstract HashMap<String, IModel> loadModelMap(IModel... models);
    }

    *//*aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa*//*
    public class LoginActivity extends AppCompatActivity implements IView, LoginContract.LoginView {
        LoginPresenter mPresenter;    // 代码省略

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            if (mPresenter != null) {
                mPresenter.attachView(this);
            }        // 代码省略
            // 请求数据，当请求成功后，调用 LoginContract.LoginView 的 loginSuccess 方法将数据传递给 View
            mPresenter.login(getUserName(), getPwd());
        }    // 代码省略

        @Override
        public void loginSuccess(LoginBean loginBean) {        // 更新UI
        }

        @Override
        public void loginFail(String failMsg) {
        }

        *//**
         * 注意MVP与Activity、Fragment生命周期的处理
         *//*
        @Override
        protected void onDestroy() {
            super.onDestroy();
            if (mPresenter != null) {
                mPresenter.detachView();
            }
        }
    }

   *//* 作者：浮云间
    链接：http://www.imooc.com/article/79004
    来源：慕课网*//*
}*/
