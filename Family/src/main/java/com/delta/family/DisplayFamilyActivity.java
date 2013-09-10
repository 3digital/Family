package com.delta.family;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleCursorTreeAdapter;
import android.widget.SimpleExpandableListAdapter;

import java.util.List;
import java.util.Map;

public class DisplayFamilyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_family);

        ListView listView = (ListView)findViewById(R.id.family_list_view);

        FamilyMember[] family = new FamilyMember[]{
          new FamilyMember("Papa", 42, "5120001"),
          new FamilyMember("Mama", 40, "5120001"),
          new FamilyMember("Bro", 17, "5120001"),
          new FamilyMember("Sis", 14, "5120001"),
          new FamilyMember("Baby", 3, "5120001")
        };

        ListAdapter adapter = new ArrayAdapter<FamilyMember>(getApplicationContext(), R.layout.family_member_info, family);

        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display_family, menu);
        return true;
    }
    
}
