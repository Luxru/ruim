package com.rux.ruchat;

import java.util.ArrayList;
import java.util.List;

public class MainActivityUiState {
    private  static  final int UID_1 = 1;
    private  static  final int UID_0 = 0;

    private  int uid;
    private  List<ChatItem> itemList;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setItemList(List<ChatItem> itemList) {
        this.itemList = itemList;
    }

    public List<ChatItem> getItemList() {
        return itemList;
    }

    public int getUid() {
        return uid;
    }
}
