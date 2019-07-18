package com.example.et.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 500052376 on 11/6/2018.
 */
public class adapter extends ArrayAdapter<Item> {
    private Context mContext;
    private List<Item> songinfolist = new ArrayList<>();
    private List<Item> artistinfolist = new ArrayList<>();
    private List<Item> albuminfolist = new ArrayList<>();

    public adapter(Context context, ArrayList<Item> list) {
        super(context, 0, list);
        mContext = context;
        songinfolist = list;
        artistinfolist = list;
        albuminfolist = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        Item currentsong = songinfolist.get(position);
        Item currentartist = artistinfolist.get(position);
        Item currentalbum = albuminfolist.get(position);
        TextView image = (TextView) listItem.findViewById(R.id.text1);
        image.setText(currentartist.getmArtist());
        TextView name = (TextView) listItem.findViewById(R.id.text1);
        name.setText(currentsong.getmSong());
        TextView release = (TextView) listItem.findViewById(R.id.text1);
        release.setText(currentalbum.getmAlbum());
        return listItem;
    }
}
