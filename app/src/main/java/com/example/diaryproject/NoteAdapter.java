package com.example.diaryproject;

import android.media.Image;
import android.net.Uri;
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

        ImageView picExistsImageView;
        ImageView picuImageView2;

        ImageView weatherImageView;
        ImageView weatherImageView2;

        TextView contentTextView;
        TextView contentTextView2;

        TextView locaTextView;
        TextView locaTextView2;

        TextView dataTextView;
        TextView dataTextView2;



        public ViewHolder(@NonNull View itemView, NoteAdapter adapter, int layoutType) {
            super(itemView);
            layout1 = itemView.findViewById(R.id.layout1);
            layout2 = itemView.findViewById(R.id.layout2);

            moodImageView = itemView.findViewById(R.id.moodImageView);
            moodImageView2 = itemView.findViewById(R.id.moodImageView2);

            picExistsImageView = itemView.findViewById(R.id.pictureExistsImageView);
            picuImageView2 = itemView.findViewById(R.id.pictureImageView2);

            weatherImageView = itemView.findViewById(R.id.weatherImageView);
            weatherImageView2 = itemView.findViewById(R.id.weatherImageView2);

            contentTextView = itemView.findViewById(R.id.contentsTextView);
            contentTextView2 = itemView.findViewById(R.id.contentsTextView2);

            locaTextView = itemView.findViewById(R.id.locationTextView);
            locaTextView2 = itemView.findViewById(R.id.locationTextView2);

            dataTextView = itemView.findViewById(R.id.dateTextView);
            dataTextView2 = itemView.findViewById(R.id.dateTextView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    if(listener == null){
                        listener.onItemClick(ViewHolder.this, v, position);
                    }
                }
            });
            setLayoutType(layoutType);
        }

        public void setItem(Note item) {
            String mood = item.getMood();
            int moodIndex = Integer.parseInt(mood);
            setMoodImage(moodIndex);

            String picturePath = item.getPicture();
            if(picturePath != null && picturePath.equals("")) {
                picExistsImageView.setVisibility(View.VISIBLE);
                picuImageView2.setVisibility(View.VISIBLE);
                picuImageView2.setImageURI(Uri.parse("file://" + picturePath));

            } else {
                picExistsImageView.setVisibility(View.GONE);
                picuImageView2.setVisibility(View.GONE);
                picuImageView2.setImageResource(R.drawable.ic_no_pictures);
            }
        }

        private void setMoodImage(int moodIndex) {
        }


        public void setLayoutType(int layoutType) {
        }


    }
    }
