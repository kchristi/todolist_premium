package fr.univpau.listeners;

import java.util.Date;
import java.util.List;

import fr.univpau.adapters.TaskAdapter;
import fr.univpau.business.Task;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class AddItemButtonListener implements OnClickListener {
	private List<Task> taskList;
	private EditText itemText;
	private TaskAdapter taskAdapater;
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		Task newTask= new Task(itemText.getText().toString(), new Date());
		taskList.add(newTask);
		taskAdapater.notifyDataSetChanged();
		
		Context context = taskAdapater.getContext();
		CharSequence text = "Tâche ajouté !";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
	}
	
	public AddItemButtonListener(List<Task> taskList,EditText itemText, TaskAdapter taskAdapater){
		this.taskList=taskList;
		this.itemText=itemText;
		this.taskAdapater=taskAdapater;
	}

}
