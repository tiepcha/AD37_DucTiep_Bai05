package com.example.ad37_ductiep_bai05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {
    RcvAdapter rcvAdapter;
    List<Contact> listContact;
    Contact ct1,ct2,ct3,ct4,ct5,ct6,ct7,ct8,ct9,ct10,ct11,ct12,ct13,ct14,ct15;
    RecyclerView RcvContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ArrayList<String> listtimect1 = new ArrayList<>();
        ArrayList<String> listtimect2 = new ArrayList<>();
        ArrayList<String> listtimect3 = new ArrayList<>();
        ArrayList<String> listtimect4 = new ArrayList<>();
        ArrayList<String> listtimect5= new ArrayList<>();
        ArrayList<String> listtimect6 = new ArrayList<>();
        ArrayList<String> listtimect7 = new ArrayList<>();
        ArrayList<String> listtimect8 = new ArrayList<>();
        ArrayList<String> listtimect9 = new ArrayList<>();
        ArrayList<String> listtimect10 = new ArrayList<>();
        ArrayList<String> listtimect11 = new ArrayList<>();
        ArrayList<String> listtimect12 = new ArrayList<>();
        ArrayList<String> listtimect13 = new ArrayList<>();
        ArrayList<String> listtimect14 = new ArrayList<>();
        ArrayList<String> listtimect15 = new ArrayList<>();

        RcvContact = findViewById(R.id.RcvContact);







        listContact = new ArrayList<>();
        ct1 = new Contact("Tony Stark" , "09111111111",listtimect1,"Mobile", "tony",1);
        ct2 = new Contact("Bruce Banner" , "09111111122",listtimect2,"Skype", "banner" ,1);
        ct3 = new Contact("Thor" , "09111111133",listtimect3,"Bifröst", "Thor" ,1);
        ct4 = new Contact("Peter Parker" , "09111111144",listtimect4,"Mobile", "peter" ,1);
        ct5 = new Contact("Thanos" , "09111111155",listtimect5,"Mobile", "thanos",2 );
        ct6 = new Contact("Grooooooot" , "Groooot",listtimect6,"Groot", "groot" ,2);
        ct7 = new Contact("Steve Rogers" , "09111111177",listtimect7,"Mobile", "steve",0 );
        ct8 = new Contact("Natasha Romanoff" , "09111111188",listtimect8,"Mobile", "nat" ,2);
        ct9 = new Contact("Stephen Strange" , "09111111199",listtimect9,"Telepathy", "dr",2 );
        ct10 = new Contact("Stan Lee" , "09111111100",listtimect10,"Mobile", "stan" ,2);
        ct11 = new Contact("Donald Trump" , "32745345133451",listtimect11,"Mobile", "trump",1 );
        ct12 = new Contact("Vladimir Putin" , "4254323409278",listtimect12,"Mobile", "putin" ,1);
        ct13 = new Contact("Tap Can Binh" , "143482048202",listtimect13,"Mobile", "binh" ,0);
        ct14 = new Contact("Ria Sakuxxx" , "437804952095",listtimect14,"Mobile", "ria",2 );
        ct15 = new Contact("Sir Alex" , "234524523402",listtimect15,"Mobile", "sir",1 );

        listtimect1.add("13/8/2019");
        listtimect2.add("15/8/2019");
        listtimect3.add("12/8/2019");
        listtimect4.add("2/8/2019");
        listtimect5.add("12/8/2019");
        listtimect6.add("Groooooot");
        listtimect7.add("7/8/2019");
        listtimect8.add("4/8/2019");
        listtimect9.add("24/8/2019");
        listtimect10.add("29/8/2019");
        listtimect11.add("11/8/2019");
        listtimect12.add("5/8/2019");
        listtimect13.add("30/8/2019");
        listtimect14.add("21/8/2019");
        listtimect15.add("12/8/2019");
        listtimect1.add("9/2/2019");
        listtimect2.add("9/2/2019");
        listtimect3.add("9/2/2019");
        listtimect4.add("9/2/2019");
        listtimect5.add("9/2/2019");
        listtimect6.add("9/2/2019");
        listtimect7.add("9/2/2019");
        listtimect8.add("9/2/2019");
        listtimect9.add("9/2/2019");
        listtimect10.add("9/2/2019");
        listtimect11.add("9/2/2019");
        listtimect12.add("9/2/2019");
        listtimect13.add("9/2/2019");
        listtimect14.add("9/2/2019");
        listtimect15.add("9/2/2019");
        listtimect1.add("17/8/2019");
        listtimect2.add("17/8/2019");
        listtimect3.add("17/8/2019");
        listtimect4.add("17/8/2019");
        listtimect5.add("17/8/2019");
        listtimect6.add("17/8/2019");
        listtimect7.add("17/8/2019");
        listtimect8.add("17/8/2019");
        listtimect9.add("17/8/2019");
        listtimect10.add("17/8/2019");
        listtimect11.add("17/8/2019");
        listtimect12.add("17/8/2019");
        listtimect13.add("17/8/2019");
        listtimect14.add("17/8/2019");
        listtimect15.add("17/8/2019");
        listtimect1.add("22/9/2019");
        listtimect2.add("22/9/2019");
        listtimect3.add("22/9/2019");
        listtimect4.add("22/9/2019");
        listtimect5.add("22/9/2019");
        listtimect6.add("22/9/2019");
        listtimect7.add("22/9/2019");
        listtimect8.add("22/9/2019");
        listtimect9.add("22/9/2019");
        listtimect10.add("22/9/2019");
        listtimect11.add("22/9/2019");
        listtimect12.add("22/9/2019");
        listtimect13.add("22/9/2019");
        listtimect14.add("22/9/2019");
        listtimect15.add("22/9/2019");





        listContact.add(ct1);
        listContact.add(ct2);
        listContact.add(ct3);
        listContact.add(ct4);
        listContact.add(ct5);
        listContact.add(ct6);
        listContact.add(ct7);
        listContact.add(ct8);
        listContact.add(ct9);
        listContact.add(ct10);
        listContact.add(ct11);
        listContact.add(ct12);
        listContact.add(ct13);
        listContact.add(ct14);
        listContact.add(ct15);



        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL, false);

        rcvAdapter = new RcvAdapter(listContact);

        rcvAdapter.setIonClickContact(new IonClickContact() {
            @Override
            public void onClickRelativeLayout(Contact contact) {



                 Intent   intent = new Intent(RcvContact.getContext(), ItemActivity.class);
                    intent.putExtra("contact",contact);

                    intent.putExtra("listcontact", (Serializable) contact.getTime());

                  startActivity(intent);
        }

            @Override
            public void onClickLinearLayout(Food food) {

            }


        });

        RcvContact.setLayoutManager(layoutManager);
        RcvContact.setAdapter(rcvAdapter);





    }


    }

