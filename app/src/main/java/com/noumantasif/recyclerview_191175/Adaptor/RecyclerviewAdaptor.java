package com.noumantasif.recyclerview_191175.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.noumantasif.recyclerview_191175.Model.Student;
import com.noumantasif.recyclerview_191175.R;

import java.util.List;

public class RecyclerviewAdaptor extends RecyclerView.Adapter<RecyclerviewAdaptor.ViewHolder> {

    List<Student> studentList;
   Context context;

    public RecyclerviewAdaptor(List<Student> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerviewAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdaptor.ViewHolder holder, int position) {
Student student=studentList.get(position);
holder.txtName.setText(student.getName());
holder.txtRollNo.setText(student.getRollNo());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

TextView txtName,txtRollNo;
ImageView img1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
          txtName=itemView.findViewById(R.id.std_1);
          txtRollNo=itemView.findViewById(R.id.txtRollno);
          img1=itemView.findViewById(R.id.img_1);
          itemView.setOnClickListener(this);
          img1.setOnLongClickListener(new View.OnLongClickListener() {
              @Override


              public boolean onLongClick(View v) {
                  String msg = "Successfully Deleted";
                  studentList.remove(getAdapterPosition());
                  notifyItemRemoved(getAdapterPosition());



                  Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();

                  return false;
              }
          });
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,studentList.get(getAdapterPosition()).getName(),Toast.LENGTH_LONG);


        }
    }
}
