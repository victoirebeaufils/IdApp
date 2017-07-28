package com.example.idstudent.failedstartuplessons;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {
    boolean following = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment frag = new Frag1();
        FragmentManager fm = getFragmentManager();

        fm.beginTransaction().replace(R.id.mainFrame, frag).commit();

    }
    public void openActivity(View view){

        Fragment frag = new Frag1();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.mainFrame, frag).commit();
        setTitle("Start-up fails");
    }
    public void openSearch(View view){

        Fragment frag = new Frag2();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.mainFrame,frag).commit();
        setTitle("SEARCH");
    }
    public void openProfile(View view){
        Fragment frag = new frag3();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.mainFrame,frag).commit();
        setTitle("PROFILE");
    }
    public void follow(View view){
        Button followButton = (Button) findViewById(R.id.follow);
        if(following){
            followButton.setText("Follow");
            following = false;
        }
        else{
        followButton.setText("Following");
        following = true;
        } }
public void openCompany(View view){
    Fragment frag = new Frag4();
    FragmentManager fm = getFragmentManager();
    fm.beginTransaction().replace(R.id.mainFrame,frag).commit();
    setTitle("Company");
}

    public void openComment(View view){
        Fragment frag = new frag5();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.mainFrame,frag).commit();
        setTitle("Comments");
    }

    public void openMessages(View view){
        Fragment frag = new Frag6();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.mainFrame,frag).commit();
        setTitle("Messages");
    }
    public void openMessagesMenu(View view){

        Fragment frag = new MessageMenuFragment();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.message_tabs, frag).commit();
        setTitle("Start-up fails");
    }

    public void openGroups(View view){

        Fragment frag = new Groups();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.message_tabs, frag).commit();
        setTitle("Start-up fails");
    }
    public void openSettingsMessages(View view){
        Fragment frag = new Settings();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.message_tabs, frag).commit();
        setTitle("Start-up fails");
    }
    public void openChatRoom(View view) {
        Intent myIntent = new Intent(MainActivity.this, MessageService.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void openPost(View view) {
        Fragment frag = new Settings();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.button_post, frag).commit();
        setTitle("Start-up fails");
    }
    public void openAudio(View view) {
        Fragment frag = new Audio();

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.picture_post, frag).commit();
        setTitle("Start-up fails");
    }
}

