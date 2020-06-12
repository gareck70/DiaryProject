package com.example.diaryproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onItemClick(NoteAdapter.ViewHolder holder, View view, int position) {

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    }
}
