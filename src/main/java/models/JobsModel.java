package models;

import java.util.ArrayList;

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
	ArrayList<Post> postData = new ArrayList<Post>();
    public JobsModel(Stage givenStage)
    {
   	 stage = givenStage;
   	 createJob("Mia Tomillo", "4/16/2024", "CS Tutor", "Looking for someone to be a tutor for me as my classes are getting really hard. Will pay upto 40$ an hour and will need atleast 5 hours of help a week. Click the link below to apply", "totallyreallinktostuffandthings.com");
    }
    
    public ObservableList<BorderPane> getJobs()
    {
    	return Jobs;
    }
    public ArrayList<Post> getPostData()
    {
    	return postData;
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
    	postData.add(newJob);
    	
    }
    
    
    
}
