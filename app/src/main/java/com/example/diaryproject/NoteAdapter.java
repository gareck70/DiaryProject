package com.example.diaryproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder>
        implements OnNoteItemClickListener {

    ArrayList<Note> items = new ArrayList<Note>();
    OnNoteItemClickListener listener;
    int layoutType = 0;



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.note_item, parent, false);

        return new ViewHolder(itemView, this, layoutType);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder viewHolder, int position) {
        Note item = items.get(position);
        viewHolder.setItem(item);
        viewHolder.setLayoutType(layoutType);
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public void addItem(Note item){
        items.add(item);
    }

    public void setItem(ArrayList<Note> item) {
        this.items = items;
    }

    public Note getItem(int position){
        return items.get(position);
    }

    @Override
    public void onItemClick(NoteAdapter.ViewHolder holder, View view, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout layout1;
        LinearLayout layout2;

        ImageView moodImageView;
        ImageView moodImageView2;

        ImageView picuImageView;
        ImageView picuImageView2;

        TextView contentTextView;
        TextView contentTextView2;

        TextView locaTextView;
        TextView locaTextView2;

        TextView dataTextView;
        TextView dataTextView2;


        public ViewHolder(@NonNull View itemView, NoteAdapter adapter, int layoutType) {
            super(itemView);
        }



        public void setLayoutType(int layoutType) {
        }

        public void setItem(Note item) {
        }
    }
    }
