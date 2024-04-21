package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.UserModel;
import models.ViewTransitionModelInterface;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class EditUserController
{
  
    UserModel model;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> PostView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, UserModel newModel)
	{
  	ViewModel=newViewModel;
  	model = newModel;
	}

    @FXML
    private TextField EditBioTextField;

    @FXML
    private TextField EditUsernameTextField;

    @FXML
    void onClickCommit(ActionEvent event) {
    	if(EditBioTextField.textProperty().get()!="")
    	{
    		model.setBio(EditBioTextField.textProperty().get());
    	}
    	if(EditUsernameTextField.textProperty().get()!="")
    	{
    		model.setName(EditUsernameTextField.textProperty().get());
    	}
    	ViewModel.showUser();
    }

    @FXML
    void onClickDelete(ActionEvent event) {

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