package info.androidhive.firebase;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter <CustomAdapter.MovViewHolder> {
    private List<contacts> contactsList;
    private Context context;

    public CustomAdapter(List<contacts> contactsList, Context context){
        this.contactsList = contactsList;
        this.context=context;
    }

    @NonNull
    @Override
    public MovViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        return new MovViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MovViewHolder holder, final int position) {
        holder.name.setText(contactsList.get(position).getName());
        holder.num.setText(contactsList.get(position).getNum());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class MovViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public  TextView num;

        public MovViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.t1);
            num = (TextView) itemView.findViewById(R.id.t2);
        }
    }
}
