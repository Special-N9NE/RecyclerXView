package org.nine.recyclerxview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerXView extends FrameLayout {
    Context context;
    TextView textView;
    ProgressBar progressbar;

    private String emptyText = "There is no data";
    private boolean isLoading = true;
    private RecyclerView rv;

    public RecyclerXView(@NonNull Context context) {
        super(context);
        this.context = context;
        init();
    }

    public RecyclerXView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public RecyclerXView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    public String getEmptyText() {
        return emptyText;
    }

    public void setEmptyText(String emptyText) {
        this.emptyText = emptyText;
        textView.setText(emptyText);
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
        if (isLoading)
            progressbar.setVisibility(VISIBLE);
        else
            progressbar.setVisibility(GONE);
    }

    void init() {
        View v = LayoutInflater.from(context).inflate(R.layout.view, this, true);
        textView = v.findViewById(R.id.tv);
        progressbar = v.findViewById(R.id.pb);
        rv = v.findViewById(R.id.rv);

        setEmptyText(emptyText);
    }


    public void setLayoutManager(@Nullable RecyclerView.LayoutManager layout) {
        setLoading(true);
        if (layout != null)
            rv.setLayoutManager(layout);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {

        setLoading(false);
        if (adapter != null) {
            if (adapter.getItemCount() == 0) {
                textView.setVisibility(VISIBLE);
            }
        }
        rv.setAdapter(adapter);
    }

    public RecyclerView listBuilder() {
        return rv;
    }
}
