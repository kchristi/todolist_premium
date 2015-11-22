package fr.univpau.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.univpau.adapters.TaskAdapter;
import fr.univpau.business.Task;
import fr.univpau.listeners.AddItemButtonListener;
import fr.univpau.todolist_premium.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class TODOListView extends Activity {
	EditText itemText; 
	ImageButton add_item_button;
	AddItemButtonListener add_item_button_listener;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<Task> taskList= new ArrayList<Task>();
        /*
        Task t1 = new Task("Test1", new Date(2015, 3, 4, 5, 36, 53));
        taskList.add(t1);
        */
        
        ListView listView= (ListView) findViewById(R.id.listView);
        
        TaskAdapter taskAdapter = new TaskAdapter(this, taskList);
        listView.setAdapter(taskAdapter);
        
        
        itemText = (EditText) findViewById(R.id.editText_source);
        add_item_button_listener = new AddItemButtonListener(taskList,itemText,taskAdapter);
        
        add_item_button=(ImageButton) findViewById(R.id.add_button);
        add_item_button.setOnClickListener(add_item_button_listener);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.todo_menu, menu);
        return true;
    }
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.menu_preference:
            // Comportement du bouton "Preference"
            return true;
        case R.id.menu_vider:
            // Comportement du bouton "Vider"
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
    
}
