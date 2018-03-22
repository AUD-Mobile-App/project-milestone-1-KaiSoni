package com.example.a1508027853.audbucketlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 1508027853 on 3/21/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    // Initialize the variables to be used
    private List<ListItems> myLists;
    private Context myContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // Initialize variables
        private TextView listDateView;
        private CheckBox listCheckBox;
        public ViewHolder(View itemView) {
            super(itemView);
            // Define the variables to be used
            listDateView = (TextView) itemView.findViewById(R.id.item_date);
            listCheckBox = (CheckBox) itemView.findViewById(R.id.checkBox);
        }
    }

    // Constructor for RecyclerAdapter
    public RecyclerAdapter(Context context, List<ListItems> lists) {
        myLists = lists;
        myContext = context;
    }

    // Inflating the layout from the XML and returning the Holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View inflatedListView = inflater.inflate(R.layout.recyclerview, parent, false);
        ViewHolder viewHolder = new ViewHolder(inflatedListView);
        return viewHolder;
    }

    // Populating data into the item through the Holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        ListItems listItem = myLists.get(position);

        TextView dateView = holder.listDateView;
        CheckBox checkBx = holder.listCheckBox;

        dateView.setText(listItem.getDate());
        checkBx.setChecked(listItem.isCompleted());
        checkBx.setText(listItem.getTitle());

        // If check box is checked perform the following operations
        checkBx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    // Functionality to be Added
                }
            }
        });
    }

    // Gets the Item count and returns it
    @Override
    public int getItemCount() {
        return myLists.size();
    }

}


