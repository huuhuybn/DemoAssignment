package vn.edu.poly.demoassignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import vn.edu.poly.demoassignment.R;
import vn.edu.poly.demoassignment.model.Wallpaper;

public class HomeAdapter extends Adapter<HomeAdapter.HomeHolder> {

    public static final int HEADER = 1;
    public static final int ITEM = 0;

    private Context context;
    private List<Wallpaper> wallpapers;

    public HomeAdapter(Context context, List<Wallpaper> wallpapers) {
        this.context = context;
        this.wallpapers = wallpapers;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 5 == 0)
            return HEADER;
        else return ITEM;
    }

    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        if (getItemViewType(i) == HEADER) {
            view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.header, viewGroup, false);
        }
        return new HomeHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder homeHolder, int i) {
        if (HEADER == getItemViewType(i)) {

        } else {

        }
    }

    @Override
    public int getItemCount() {
        return wallpapers.size();
    }

    public class HomeHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public Button btnMore;

        public HomeHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            btnMore = itemView.findViewById(R.id.btnMore);

        }
    }
}
