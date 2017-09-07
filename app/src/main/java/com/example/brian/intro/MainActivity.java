package com.example.brian.intro;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView MyRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casting
        MyRecycleView = (RecyclerView)findViewById(R.id.MyRecycleListView);


        //Applying the Layout manager to recycler View e.g LinearLayout GridLayout
        MyRecycleView.setLayoutManager(new LinearLayoutManager(this));

        //An ArrayList on the Contact class for array size
        ArrayList<Contact> arrayList = new ArrayList<>();

        //assigning contact adapter to the list array
        ContecntAdapter myContecntAdapter = new ContecntAdapter(this,arrayList);

        //Calling the adapter for display
        MyRecycleView.setAdapter(myContecntAdapter);

        //Initializing Values to the contact class variable
        Contact myContact =  new Contact();
        Contact myContact1 =  new Contact();
        Contact myContact2 =  new Contact();
        Contact myContact3 =  new Contact();
        Contact myContact4 =  new Contact();
        Contact myContact5 =  new Contact();
        Contact myContact6 =  new Contact();


        myContact.setName("East Rand");
        myContact.setSurname("Boksburg");
        myContact.setEmail("East of Johannesburg");
        myContact.setNumber("30 kilometres away Johannesburg/ 40 minutes drive");
        myContact.setMyImage(R.drawable.eastrand);
        myContact.setMyLat((int) -26.2325897);
        myContact.setMyLng((int) 28.2409671);

        myContact1.setName("Johnasburg City");
        myContact1.setSurname("Central City");
        myContact1.setEmail("South of Midrand and Sandton");
        myContact1.setNumber("30 kilometres away from Boksburg / 35 minutes drive");
        myContact1.setMyImage(R.drawable.johnasburg);
        myContact1.setMyLat((int) -26.2041028);
        myContact1.setMyLng((int) 28.0473051);

        myContact2.setName("Germiston City");
        myContact2.setSurname("Central City");
        myContact2.setEmail("East of Johnasburg");
        myContact2.setNumber("30 kilometres away from Boksburg / 35 minutes drive");
        myContact2.setMyImage(R.drawable.gemiston);
        myContact2.setMyLat((int) -26.2258734);
        myContact2.setMyLng((int) 28.1707794);

        myContact3.setName("Nelspruit City");
        myContact3.setSurname("Mpumalanga Mbombela");
        myContact3.setEmail("East of South Africa");
        myContact3.setNumber("360 kilometres away from Gauteng / 3H30 minutes drive");
        myContact3.setMyImage(R.drawable.nelspruit);

        myContact4.setName("Sandton City");
        myContact4.setSurname("Central City");
        myContact4.setEmail("North of Johannesburg");
        myContact4.setNumber("15 kilometres away from Johannesburg / 20 minutes drive");
        myContact4.setMyImage(R.drawable.sandton);
        myContact4.setMyLat((int)  -26.1075663);
        myContact4.setMyLng((int) 28.0567007);

        myContact5.setName("Tembisa");
        myContact5.setSurname("Kasi");
        myContact5.setEmail("North of Johannesburg and Midrand");
        myContact5.setNumber("30 kilometres away from Johannesburg / 45 minutes drive");
        myContact5.setMyImage(R.drawable.tembisa);
        myContact5.setMyLat((int)  -26.1075663);
        myContact5.setMyLng((int) 28.0567007);


        myContact6.setName("Acornhoek");
        myContact6.setSurname("Central shopping centre");
        myContact6.setEmail("Mpumalanga Province");
        myContact6.setNumber("450 kilometres away from Johannesburg / 5H30 minutes drive");
        myContact6.setMyImage(R.drawable.acornhoek);
        myContact5.setMyLat((int)  -26.0063121);
        myContact5.setMyLng((int) 28.2108827);


        //calling the class for display
        arrayList.add(myContact);
        arrayList.add(myContact1);
        arrayList.add(myContact2);
        arrayList.add(myContact3);
        arrayList.add(myContact4);
        arrayList.add(myContact5);
        arrayList.add(myContact6);


    }
}