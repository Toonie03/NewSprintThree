package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.JobsModel;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.util.StringConverter;
import  javafx.util.converter.*;

public class EditPostContorller
{
  
    FeedModel model;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> PostView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, FeedModel newModel)
	{
  	ViewModel=newViewModel;
  	model = newModel;
  	model.getPosts().clear();
  	model.createPost("william.bailey", "4/17/2024", "Please Register for Databases", "Hi Students. No one has signed up to take databases, and that makes me super sad. I promise it is a fun course! Please register today!", "https://www.centre.edu/academics/course-catalog");
  	model.createPost("michael.bradshaw", "4/17/2024", "CSC 270 Now Full!", "Attention students, all seats for the Fall 2024 section of Data Structures is now full. Please check out other course offerings below.", "https://www.centre.edu/academics/course-catalog");
  	model.createPost("michael.bradshaw", "4/18/2024", "CSC 270 New Section!", "Attention students, more seats have opened up in Data Structures for the fall. Register below!", "https://www.centre.edu/academics/course-catalog");
  	PostView.setItems(model.getPosts());
  	

	}

	
  	@FXML
  	void onClickHome(ActionEvent event) {
   	   System.out.println("Clicked on Home");
 		   ViewModel.showHome();
  	}

  	@FXML
  	void onClickJobs(ActionEvent event) {
   	 System.out.println("Clicked on Jobs");
 		 ViewModel.showJobs();
  	}

    @FXML
    void onClickSearch(ActionEvent event) {
    	System.out.println("Clicked on Search");
    	ViewModel.showSearch();
    }

  	@FXML
  	void onClickUser(ActionEvent event) {
 		 System.out.println("Clicked on User");
 		 ViewModel.showUser();
  	}




}