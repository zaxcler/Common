package com.zaxcler.common.widget;

import android.content.Context;
import android.view.View;

import com.zaxcler.common.adapter.DragAdapter;

import java.util.List;

/**
 * Created by zaxcler on 16-5-30.
 */
public class ChannelDragAdapter extends DragAdapter {
    public ChannelDragAdapter(Context context, List channelList, int resource) {
        super(context, channelList, resource);
    }

    @Override
    public void setData(View view, int position) {

    }
}
