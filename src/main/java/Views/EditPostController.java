package Views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.ViewTransitionModelInterface;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class EditPostController
{
  
    FeedModel model;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> PostView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, FeedModel newModel)
	{
  	ViewModel=newViewModel;
  	model = newModel;
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