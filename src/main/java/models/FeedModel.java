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
import javafx.stage.Stage;


public class FeedModel {

    Stage stage;
	ObservableList<BorderPane> visiblePosts = 
		      FXCollections.observableArrayList();
	ArrayList<Post> postData = new ArrayList<Post>();
    
    public FeedModel(Stage givenStage)
    {
   	 stage = givenStage;
 	createPost("william.bailey", "4/17/2024", "Please Register for Databases", "Hi Students. No one has signed up to take databases, and that makes me super sad. I promise it is a fun course! Please register today!", "https://www.centre.edu/academics/course-catalog");
  	createPost("michael.bradshaw", "4/17/2024", "CSC 270 Now Full!", "Attention students, all seats for the Fall 2024 section of Data Structures is now full. Please check out other course offerings below.", "https://www.centre.edu/academics/course-catalog");
  	createPost("michael.bradshaw", "4/18/2024", "CSC 270 New Section!", "Attention students, more seats have opened up in Data Structures for the fall. Register below!", "https://www.centre.edu/academics/course-catalog");
 
    }
    
    public ObservableList<BorderPane> getPosts()
    {
    	return visiblePosts;
    }
    public ArrayList<Post> getPostData()
    {
    	return postData;
    }

    public void createPost(String name, String date, String title, String text, String link)
    {
    	StringProperty givenName = new SimpleStringProperty(name);
    	StringProperty givenDate = new SimpleStringProperty(date);
    	StringProperty givenTitle = new SimpleStringProperty(title);
    	StringProperty givenText = new SimpleStringProperty(text);
    	StringProperty givenLink = new SimpleStringProperty(link);
    	Post newJob = new Post(givenName, givenDate,givenTitle,givenText,givenLink,stage);
    	BorderPane JobPost = new BorderPane();
    	JobPost.setTop(newJob.setTop());
    	JobPost.setCenter(newJob.setCenter(JobPost));
    	JobPost.setBottom(newJob.setBottom());
    	visiblePosts.add(JobPost);
    	postData.add(newJob);
    	
    }
    
    
    
}
