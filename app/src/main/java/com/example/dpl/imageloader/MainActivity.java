package com.example.dpl.imageloader;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

public class MainActivity extends AppCompatActivity {
    private ImageLoader loader;
    private ImageView iv_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loader=ImageLoader.getInstance();//ImageLoader实例化
        iv_img= (ImageView) this.findViewById(R.id.image);
       // String url="file:///"+"本地地址";//本地地址调用
//        loader.displayImage("https://www.baidu.com/img/bd_logo1.png",iv_img);
        //图片加载时候带加载情况的监听
        loader.displayImage("http://img.1985t.com/uploads/attaches/2017/09/130403-u6ZEL1d.jpg", iv_img, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String s, View view) {
                Log.i("info","onLoadingStarted");
            }

            @Override
            public void onLoadingFailed(String s, View view, FailReason failReason) {
                Log.i("info","onLoadingFailed");

            }

            @Override
            public void onLoadingComplete(String s, View view, Bitmap bitmap) {
                Log.i("info","onLoadingComplete");

            }

            @Override
            public void onLoadingCancelled(String s, View view) {
                Log.i("info","onLoadingCancelled");

            }
        });
    }
}
