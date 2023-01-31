package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel>arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        //To set Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.d, "A", "9876543210")); //setting 1st index of
        arrContacts.add(new ContactModel(R.drawable.contact2, "B", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact3, "C", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact4, "D", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact5, "E", "9876543210")); //setting 1st index of
        arrContacts.add(new ContactModel(R.drawable.d, "F", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact2, "G", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact3, "H", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact4, "I", "9876543210")); //setting 1st index of
        arrContacts.add(new ContactModel(R.drawable.contact5, "J", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.d, "K", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact2, "L", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact3, "M", "9876543210")); //setting 1st index of
        arrContacts.add(new ContactModel(R.drawable.contact4, "N", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact5, "O", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.d, "P", "9876543210"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);






    }
}