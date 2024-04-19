package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class JobsModel {

    Stage stage;
	ObservableList<BorderPane> Jobs = 
		      FXCollections.observableArrayList();
    
    public JobsModel(Stage givenStage)
    {
   	 stage = givenStage;
    }
    
    public ObservableList<BorderPane> getJobs()
    {
    	return Jobs;
    }

    public void createJob(String name, String date, String title, String text, String link)
    {
    	StringProperty givenName = new SimpleStringProperty(name);
    	StringProperty givenDate = new SimpleStringProperty(date);
    	StringProperty givenTitle = new SimpleStringProperty(title);
    	StringProperty givenText = new SimpleStringProperty(text);
    	StringProperty givenLink = new SimpleStringProperty(link);
    	Post newJob = new Post(givenName, givenDate,givenTitle,givenText,givenLink, stage);
    	BorderPane JobPost = new BorderPane();
    	JobPost.setTop(newJob.setTop());
    	JobPost.setCenter(newJob.setCenter(JobPost));
    	JobPost.setBottom(newJob.setBottom());
    	Jobs.add(JobPost);
    	System.out.println("Added a job");
    	
    }
    
    
    
}
