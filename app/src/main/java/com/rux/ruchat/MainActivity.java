package com.rux.ruchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout mTextInputLayout;
    private TextInputEditText mTextInputEditText;
    private RecyclerView mRecyclerView;
    private MainActivityViewModel mMainActivityViewModel;
    private ChatItemAdapter mChatItemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mChatItemAdapter = new ChatItemAdapter(mMainActivityViewModel.getMsgList());
        mTextInputLayout = findViewById(R.id.mainTextField);
        mTextInputEditText = findViewById(R.id.mainEditText);
        mRecyclerView = findViewById(R.id.recycleList);
        mRecyclerView.setAdapter(mChatItemAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mTextInputLayout.setEndIconOnClickListener(view -> {
            mMainActivityViewModel.SendMsg(new ChatItem(mTextInputEditText.getText().toString(),mMainActivityViewModel.getMsgList().size()%2));
            mChatItemAdapter.notifyItemInserted(mMainActivityViewModel.getMsgList().size()-1);
            mRecyclerView.scrollToPosition(mMainActivityViewModel.getMsgList().size()-1);
        });
    }
}