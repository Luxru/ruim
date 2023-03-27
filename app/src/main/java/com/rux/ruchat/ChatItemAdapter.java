package com.rux.ruchat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class ChatItemAdapter extends RecyclerView.Adapter<ChatItemAdapter.ViewHolder> {
        private List<ChatItem> localDataSet;
        /**
         * Provide a reference to the type of views that you are using
         * (custom ViewHolder).
         */
        public static class ViewHolder extends RecyclerView.ViewHolder {
            private final LinearLayout leftLayout;
            private final LinearLayout rightLayouy;
            private final TextView leftMsg;
            private final TextView rightMsg;

            public ViewHolder(View view) {
                super(view);
                // Define click listener for the ViewHolder's View

                leftLayout =  view.findViewById(R.id.chatItemLeftLayout);
                rightLayouy =  view.findViewById(R.id.chatItemRightLayout);
                leftMsg = view.findViewById(R.id.chatItemLeftTextView);
                rightMsg = view.findViewById(R.id.chatItemRightTextView);
            }

            public LinearLayout getLeftLayout() {
                return leftLayout;
            }

            public LinearLayout getRightLayouy() {
                return rightLayouy;
            }

            public TextView getLeftMsg() {
                return leftMsg;
            }

            public TextView getRightMsg() {
                return rightMsg;
            }
        }

        /**
         * Initialize the dataset of the Adapter.
         *
         * @param dataSet String[] containing the data to populate views to be used
         * by RecyclerView.
         */
        public ChatItemAdapter(List<ChatItem> dataSet) {
            localDataSet = dataSet;
        }

        // Create new views (invoked by the layout manager)
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            // Create a new view, which defines the UI of the list item
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.chat_row_item, viewGroup, false);
            return new ViewHolder(view);
        }

        // Replace the contents of a view (invoked by the layout manager)
        @Override
        public void onBindViewHolder(ViewHolder viewHolder, final int position) {

            ChatItem item = localDataSet.get(position);
            if(item.getType()==ChatItem.TYPE_RECV){
                viewHolder.getLeftLayout().setVisibility(View.VISIBLE);
                viewHolder.getRightLayouy().setVisibility(View.GONE);
                viewHolder.getLeftMsg().setText(item.getContent());
            }else{
                viewHolder.getRightLayouy().setVisibility(View.VISIBLE);
                viewHolder.getLeftLayout().setVisibility(View.GONE);
                viewHolder.getRightMsg().setText(item.getContent());
            }
        }

        // Return the size of your dataset (invoked by the layout manager)
        @Override
        public int getItemCount() {
            return localDataSet.size();
        }

}
