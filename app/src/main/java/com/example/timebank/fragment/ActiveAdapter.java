package com.example.timebank.fragment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.timebank.Bean.ActiveCard;
import com.example.timebank.R;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class ActiveAdapter extends RecyclerView.Adapter<ActiveAdapter.ViewHolder>  {

    private Context mContext;
    private List<ActiveCard> ActiveList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardview;
        TextView item_tv;
        TextView item_time;

        public ViewHolder(View view){
            super(view);
            cardview = (CardView) view;
            item_tv = (TextView) view.findViewById(R.id.item_tv);
            item_time = (TextView) view.findViewById(R.id.item_time);
        }
    }
    public void ItemAdapter(List<ActiveCard> activeList){
        ActiveList = activeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        if(mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.active_adapter,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ActiveCard activeitem = ActiveList.get(position);
        holder.item_tv.setText(activeitem.getTitle());
        holder.item_time.setText(activeitem.getTime());

    }

    @Override
    public int getItemCount(){
        return ActiveList.size();
    }

    public static Bitmap getHttpBitmap(String url){
        URL myFileURL;
        Bitmap bitmap=null;
        try{
            myFileURL = new URL(url);
            //获得连接
            HttpURLConnection conn=(HttpURLConnection)myFileURL.openConnection();
            //设置超时时间为6000毫秒，conn.setConnectionTiem(0);表示没有时间限制
            conn.setConnectTimeout(6000);
            //连接设置获得数据流
            conn.setDoInput(true);
            //不使用缓存
            conn.setUseCaches(false);
            //这句可有可无，没有影响
            //conn.connect();
            //得到数据流
            InputStream is = conn.getInputStream();
            //解析得到图片
            bitmap = BitmapFactory.decodeStream(is);
            //关闭数据流
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bitmap;
    }
}


