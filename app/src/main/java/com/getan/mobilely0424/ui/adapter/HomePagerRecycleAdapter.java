package com.getan.mobilely0424.ui.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.getan.mobilely0424.R;
import com.getan.mobilely0424.model.bean.CateNewsListBean;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2020/4/28.
 * 邮箱：405181076@qq.com
 */
public class HomePagerRecycleAdapter extends RecyclerView.Adapter<HomePagerRecycleAdapter.InnerHolder> {
    private List<CateNewsListBean.DataBean.NewsListBean> mList = new ArrayList<>();

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cate_list, parent, false);

        return new InnerHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePagerRecycleAdapter.InnerHolder holder, int position) {
/*?????????????????????????????如果我们setText()方法里是int型的话，
会调 setText(int resid)这个方法，
而不是 setText(CharSequence text)
所以才会出现Resources$NotFoundException: String resource ID 这种错误*/
        //Logger.d("item中的新聞標題++==" + mList.get(position).getTitle());
        String title = mList.get(position).getTitle();
        holder.mTextView_title.setText(title);
        int praise = mList.get(position).getPraise();
        String p = String.valueOf(praise);
        holder.item_tv3_lift.setText(p);
        holder.item_tv3_middle.setText(String.valueOf(mList.get(position).getMtime()));
        holder.item_tv3_right.setText(String.valueOf(mList.get(position).getViews()));

        Glide.with(holder.itemView).load(mList.get(position).getResubImage_p()).into(holder.mImageView);

        holder.item_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

            }
        });
        /*holder.mTextView_title.setText(mList.get(position).getTitle());
        holder.item_tv3_lift.setText(mList.get(position).getPraise());
        holder.item_tv3_middle.setText(mList.get(position).getMtime());
        holder.item_tv3_lift.setText(mList.get(position).getViews());*/
        //Glide.with(this).
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setData(CateNewsListBean.DataBean data) {
        mList.clear();
        List<CateNewsListBean.DataBean.NewsListBean> list = data.getNews_list();
        mList.addAll(list);
        notifyDataSetChanged();
    }

    public void addMoreData(CateNewsListBean.DataBean data) {
        int old_size = mList.size();
        List<CateNewsListBean.DataBean.NewsListBean> news_list_more = data.getNews_list();
        mList.addAll(news_list_more);
        Logger.d("加载更多的数据给过来了");
        //Logger.d("加载更多的数据==="+news_list_more.get(1).getTitle());
        Logger.d("加载更多的数据的原始条目数==="+old_size+"////"+"更多数据的条目数=="+news_list_more.size()+"新的总条目数=="+mList.size());
        //notifyItemRangeInserted(old_size,news_list_more.size());
        notifyItemRangeChanged(old_size,news_list_more.size());
        //notifyDataSetChanged();
    }

  /*  public void setData(CateNewsListBean.DataBean.NewsListBean listBean) {
        mList.clear();
        mList.addAll((Collection<? extends CateNewsListBean.DataBean.NewsListBean>) listBean);
        notifyDataSetChanged();

    }*/


    public class InnerHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_list)
        LinearLayout item_list;
        @BindView(R.id.item_img_cate_list)
        ImageView mImageView;
        @BindView(R.id.item_tv_title)
        TextView mTextView_title;
        /*@BindView(R.id.item_tv_price)
        TextView mTextView_price;*/
        @BindView(R.id.item_tv3_lift)
        TextView item_tv3_lift;
        @BindView(R.id.item_tv3_middle)
        TextView item_tv3_middle;
        @BindView(R.id.item_tv3_right)
        TextView item_tv3_right;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            /*mTextView_title = itemView.findViewById(R.id.item_tv_title);
            item_tv3_lift = itemView.findViewById(R.id.item_tv3_lift);
            item_tv3_middle = itemView.findViewById(R.id.item_tv3_middle);
            item_tv3_right = itemView.findViewById(R.id.item_tv3_right);*/
        }
    }
}
