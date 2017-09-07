package com.example.brian.intro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by Brian on 2017/08/15.
 */

public class ContecntAdapter extends RecyclerView.Adapter<ContecntAdapter.MyVewholder> {

    Context context;
    List<Contact> ContactList;

    //a constructor for the class ContecntAdapter
    public ContecntAdapter( Context context, List<Contact>ContactList)
    {
        this.context = context;
        this.ContactList = ContactList;
    }

    //Here you need to implement a  diplaying layout e.g XML layout
    //in this i am calling
    @Override
    public MyVewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        //parent false on the layout if its static
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_display_custom,parent,false);

        MyVewholder viewHolder = new MyVewholder(view);


        return viewHolder;
    }


    //getting values from the TextView Via access Modifies on Contact
    @Override
    public void onBindViewHolder(MyVewholder holder, int position) {

        final Contact mycontact = ContactList.get(position);

        //values from contact class
        holder.MYname.setText(mycontact.getName());
        holder.MYsurname.setText(mycontact.getSurname());
        holder.MYemail.setText(mycontact.getEmail());
        holder.MYnumber.setText(mycontact.getNumber());
        holder.MYimage.setImageResource(mycontact.getMyImage());

        //Maps
        holder.lat = mycontact.getMyLat();
        holder.lng = mycontact.getMyLng();

        //Set setOnClickListener on the Card View
        holder.myCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(context,MapsActivity.class);
                context.startActivity(x);

                //Passing the info from Current window to next clicked window
                Intent intent = new Intent(context, MapsActivity.class);
                intent.putExtra("name",mycontact);
                //intent.putExtra("Email",mycontact);
                context.startActivity(intent);
            }
        });
    }

    //Displaying the Item based on the size of the array
    //in this we getting the size of the list base on its length
    @Override
    public int getItemCount() {
        return ContactList.size();
    }

    //getting Reference(id) of the TextView from the display XML  contact_display_custom

    public class MyVewholder extends RecyclerView.ViewHolder {

        TextView MYname,MYsurname,MYemail,MYnumber;
        CardView myCard;
        ImageView MYimage;
        int lat, lng;

        public MyVewholder(View itemView)
        {
            super(itemView);

            //Getting/referencing the TextView with their relevant ID
            MYname = (TextView)itemView.findViewById(R.id.Name);
            MYsurname = (TextView)itemView.findViewById(R.id.Surname);
            MYemail = (TextView)itemView.findViewById(R.id.Email);
            MYnumber = (TextView)itemView.findViewById(R.id.Number);
            myCard = (CardView)itemView.findViewById(R.id.myCardView);
            MYimage= (ImageView)itemView.findViewById(R.id.theimage);
            lat = 0;
            lng = 0;
        }
    }
}
