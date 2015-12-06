package jmsgears.com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jms_m on 12/6/2015.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTitles;
        public TextView mUserNames;
        public TextView mKarma;
        public ViewHolder(View view) {
            super(view);
            View itemView = view.findViewById(R.id.relativeLayout);
            mKarma = (TextView)itemView.findViewById(R.id.tvKarma);
            mUserNames = (TextView)itemView.findViewById(R.id.tvUserName);
            mTitles = (TextView)itemView.findViewById(R.id.tvTitle);

        }
    }

    private String[] titles;
    private String[] userNames;
    private int[] karma;

    public MyAdapter(String[] titles, String[] userNames, int[] karma) {
        this.titles = titles;
        this.userNames = userNames;
        this.karma = karma;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mKarma.setText(Integer.toString(karma[position]));
        holder.mUserNames.setText(userNames[position]);
        holder.mTitles.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
