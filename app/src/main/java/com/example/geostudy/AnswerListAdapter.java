package com.example.geostudy;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AnswerListAdapter extends BaseAdapter {
    Context context;
    ArrayList<AnswerItem> answerItems;
    ListView listView;

    public AnswerListAdapter(Context context, ArrayList<AnswerItem> answerItems, ListView listView) {
        this.context = context;
        this.answerItems = answerItems;
        this.listView = listView;
    }

    @Override
    public int getCount() {
        return answerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return answerItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_answer_item, parent, false);
        }

        TextView answerText = convertView.findViewById(R.id.answer_text);
        ImageView answerIcon = convertView.findViewById(R.id.answer_icon);
        AnswerItem item = answerItems.get(position);
        answerText.setText(item.region);
        if (item.flag){
            answerIcon.setImageResource(R.drawable.round_check_24);
        } else{
            answerIcon.setImageResource(R.drawable.round_clear_24);
        }
        return convertView;
    }

    public void insert(AnswerItem item) {
        answerItems.add(0, item);
//        notifyDataSetChanged();
        ((Activity)context).runOnUiThread(() -> {
            notifyDataSetChanged();
        });
    }

    public void animateFirstItem(ListView listView) {
        final View firstItem = listView.getChildAt(0);
        if (firstItem != null) {
            DisplayMetrics metrics = context.getResources().getDisplayMetrics();
            float dpToPx = metrics.density;

            ObjectAnimator animator = ObjectAnimator.ofFloat(firstItem, "translationY",
                    -dpToPx * 70f, 0f);
            animator.setDuration(500).start();
        }
        System.out.println("animated");
    }
}
