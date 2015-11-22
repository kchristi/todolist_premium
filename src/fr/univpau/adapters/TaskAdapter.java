package fr.univpau.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import fr.univpau.business.Task;
import fr.univpau.todolist_premium.R;

public class TaskAdapter extends ArrayAdapter<Task> {
	List<Task> itemList;
	
	
	public TaskAdapter(Context context, List<Task> objects) {
		super(context, 0, objects);
		// TODO Auto-generated constructor stub
		itemList=objects;
	}
	
	@Override
	public View getView (int position, View convertView, ViewGroup parent){
		
		View view = convertView;
		
		if(view==null){
			 LayoutInflater layouInflater;
	         layouInflater = LayoutInflater.from(getContext());
	         view = layouInflater.inflate(R.layout.todo_list_item, parent, false);
		}
		
		Task task = itemList.get(position);

	    if (task != null) {
	    	CheckBox itemCheck = (CheckBox) view.findViewById(R.id.itemCheck);
	    	TextView taskName = (TextView) view.findViewById(R.id.taskName);
	    	TextView taskDate = (TextView) view.findViewById(R.id.taskDate);
	    	
	    	taskName.setText(task.getTaskName());
	    	taskDate.setText(task.getTaskDate().toGMTString());
	    }
	        
		
		return view;
		
	}
	
}
