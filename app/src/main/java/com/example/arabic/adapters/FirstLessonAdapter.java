package com.example.arabic.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.arabic.model.Lesson1;
import com.example.arabicapp.R;

import java.util.List;

public class FirstLessonAdapter extends RecyclerView.Adapter<FirstLessonAdapter.Vh> {

    List<Lesson1> lesson1List;
    Context context;

    public FirstLessonAdapter(List<Lesson1> lesson1List, Context context) {
        this.lesson1List = lesson1List;
        this.context = context;
    }

    @NonNull
    @Override
    public Vh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.first_items, parent, false);
        return new Vh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vh holder, int position) {
        Lesson1 lesson1 = lesson1List.get(position);
        holder.Arabic.setImageResource(lesson1.getArabic());
        holder.sound.setText(lesson1.getSound());
        holder.Uzbek.setText(lesson1.getUzbek());
    }

    @Override
    public int getItemCount() {
        return lesson1List.size();
    }

    public class Vh extends RecyclerView.ViewHolder {
        ImageView Arabic;

        TextView  sound, Uzbek;

        public Vh(@NonNull View itemView) {
            super(itemView);

            Arabic = itemView.findViewById(R.id.arabic);
            sound = itemView.findViewById(R.id.sound);
            Uzbek = itemView.findViewById(R.id.uzbek);
        }
    }
}
