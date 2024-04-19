
package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UserModel
{
  Stage stage;
  StringProperty FirstName = new SimpleStringProperty();
  StringProperty LastName = new SimpleStringProperty();
  StringProperty WholeName = new SimpleStringProperty();
  StringProperty Bio = new SimpleStringProperty();
  IntegerProperty Followers = new SimpleIntegerProperty();
  IntegerProperty Following = new SimpleIntegerProperty();
  ObservableList<BorderPane> Posts = 
		      FXCollections.observableArrayList();
  
  public UserModel(Stage givenStage)
  {
    stage = givenStage;
  }
  
  public StringProperty getName()
  {
	  setFirstName("John");
	  setLastName("Doe");
	  WholeName.set(FirstName.get()+" "+LastName.get());
	  return WholeName;
  }
  
  public void setFirstName(String str)
  {
	  FirstName.setValue(str);
  }
  
  public void setLastName(String str)
  {
	  LastName.setValue(str);
  }
  
  public void setBio(String str)
  {
	  Bio.setValue(str);
  }
  
  public StringProperty getBio()
  {
	  setBio("I am a computer scientist with a heavy interest in chemestry");
	  return Bio;
  }
  
  public IntegerProperty getFollowers()
  {
	  Followers.setValue(5);
	  return Followers;
  }
  public IntegerProperty getFollowing()
  {
	  Following.setValue(10);
	  return Following;
  }
  public void populatePage()
  {
	  
  }
  
  public ObservableList<BorderPane> getPosts()
  {
  	return Posts;
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
  	Posts.add(JobPost);
  	
  }
  
}
