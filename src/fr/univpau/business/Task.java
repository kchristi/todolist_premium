package fr.univpau.business;

import java.util.Date;

public class Task {
	private String taskName;
	private Date taskDate;
	
	public Task(String taskName, Date taskDate){
		this.taskName=taskName;
		this.taskDate=taskDate;
	}
	
	public String getTaskName(){
		return taskName;
	}
	
	public Date getTaskDate(){
		return taskDate;
	}
	
	public void setTaskName(String taskName){
		this.taskName=taskName;
	}
	
	public void setTaskDate(Date taskDate){
		this.taskDate=taskDate;
	}
}
