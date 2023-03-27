package com.rux.ruchat;

public class ChatItem {
    public static final int TYPE_RECV = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;

    public ChatItem(String content,int type){
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
