package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

class ImageAdapter extends PagerAdapter {

    Context mContext;



    ImageAdapter(Context context){
        this.mContext = context;
    }
    private int[] sliderImage = new int[]{
            R.drawable.slide4,
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,

    };

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImage[position]);
        ((ViewPager) container).addView(imageView,0);
        return imageView;
    }

    @Override
    public int getCount() {
        return sliderImage.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
}
