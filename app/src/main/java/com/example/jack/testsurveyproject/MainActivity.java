package com.example.jack.testsurveyproject;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToMain();
    }

    public void goToMain(){
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        MainScreen menu_fragment = MainScreen.newInstance();
        transaction.replace(R.id.Activity,menu_fragment);
        transaction.commit();

    }

    public void CreateSurvey(){
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CreateSurvey surveyFrag = CreateSurvey.newInstance();
        transaction.replace(R.id.Activity,surveyFrag);
        transaction.commit();

    }
    public void CreateTest(){
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        CreateTest testFrag = CreateTest.newInstance();
        transaction.replace(R.id.Activity,testFrag);
        transaction.commit();

    }

}
