package com.rux.ruchat;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private List<ChatItem> msgList = new LinkedList<>();
    public void SendMsg(ChatItem msg){
        msgList.add(msg);
        //DO DB operation
    }

    public List<ChatItem> getMsgList() {
        return msgList;
    }
}

