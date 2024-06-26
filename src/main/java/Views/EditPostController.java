package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.Post;
import models.ViewTransitionModelInterface;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class EditPostController
{
  
	Post post;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> PostView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, Post newPost)
	{
  	ViewModel=newViewModel;
  	post = newPost;
	}
    @FXML
    private TextField EditBodyTextField;

    @FXML
    private TextField EditLinkTextField;

    @FXML
    private TextField EditTitleTextField;

    @FXML
    void onClickCommit(ActionEvent event) {
    	
    	if(EditBodyTextField.textProperty().get()!="")
    	{
    		post.setJobText(EditBodyTextField.textProperty());
    		System.out.println("Wrote in Body");
    	}
    	if(EditLinkTextField.textProperty().get()!="")
    	{
    		post.setJobLink(EditLinkTextField.textProperty());
    		System.out.println("Wrote in Link");
    	}
    	if(EditTitleTextField.textProperty().get()!="")
    	{
    		post.setJobTitle(EditTitleTextField.textProperty());
    		System.out.println("Wrote in Title");
    	}
    	ViewModel.showUser();
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