package com.savely.geostudy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Документация к классу. AnswerListAdapter - класс-адаптер для RecyclerView списка ответов пользователя.
 * Элементы списка содержат информацию о последнем вопросе (регионе/стране) и  правильности ответа.
 */
public class AnswerListAdapter extends RecyclerView.Adapter<AnswerListAdapter.AnswerViewHolder> {
    Context context;
    ArrayList<AnswerItem> answerItems;

    public static class AnswerViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout item;
        public AnswerViewHolder(View view) {
            super(view);
            item = view.findViewById(R.id.answer_item);
        }
    }

    public AnswerListAdapter(ArrayList<AnswerItem> answerItems, Context context ) {
        this.answerItems = answerItems;
        this.context = context;
    }

    @NonNull
    @Override
    public AnswerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_answer_item, parent, false);
        return new AnswerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnswerListAdapter.AnswerViewHolder holder, int position){
        TextView answerText = holder.item.findViewById(R.id.answer_text);
        ImageView answerIcon = holder.item.findViewById(R.id.answer_icon);
        AnswerItem item = answerItems.get(position);
        answerText.setText(item.region);
        if (item.flag){
            answerIcon.setImageResource(R.drawable.round_check_24);
        } else{
            answerIcon.setImageResource(R.drawable.round_clear_24);
        }
    }

    @Override
    public int getItemCount() {
        return answerItems.size();
    }

    /**
     * Метод для обновления списка ответов путем добавления нового элемента в начало.
     * @param item новый элемент списка.
     */
    public void insert(AnswerItem item) {
        answerItems.add(0, item);
        ((Activity)context).runOnUiThread(() -> {
            notifyDataSetChanged();
        });
    }
}
