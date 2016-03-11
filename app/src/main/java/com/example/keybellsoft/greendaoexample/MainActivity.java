package com.example.keybellsoft.greendaoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.keybellsoft.greendaoexample.GreenDao.DbHelper;

import java.util.ArrayList;

import testDb.Person;
import testDb.Profession;

public class MainActivity extends AppCompatActivity {

    private DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DbHelper(this);

        Profession profession = new Profession();
        profession.setId_profession(1);
        profession.setProfession_name("Developer");
        dbHelper.daoSession.getProfessionDao().insert(profession);

        Person person = new Person();
        person.setId_person(1);
        person.setPerson_name("Esteban ");
        person.setPerson_last_name("Rosales Esquivel");
        //person.setId_profession(profession.getId_profession());
        person.setId_profession(44);
        dbHelper.daoSession.getPersonDao().insert(person);

        dbHelper.daoSession.getPersonDao().loadAll();



        /*// [C]reate
        User user = new User();
        userDao.insert(user);
        System.out.println("Inserted: " + user.getEmail());

        // [R]ead
        userDao.load(1);
        userDao.loadAll();

        // [U]pdate
        user.setEmail("newEmail@me.com");
        userDao.update(user);

        // [D]elete
        userDao.delete(user);
        userDao.deleteAll();*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
