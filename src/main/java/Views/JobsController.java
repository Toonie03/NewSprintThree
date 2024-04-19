package Views;

import javafx.beans.binding.Bindings;
import models.Post;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.JobsModel;
import models.UserModel;
import models.ViewTransitionModelInterface;

public class JobsController {
    
    JobsModel model;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> JobView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, JobsModel newModel)
	{
  	ViewModel=newViewModel;
  	model = newModel;
  	model.getJobs().clear();
  	model.createJob("Mia Tomillo", "4/16/2024", "CS Tutor", "Looking for someone to be a tutor for me as my classes are getting really hard. Will pay upto 40$ an hour and will need atleast 5 hours of help a week. Click the link below to apply", "totallyreallinktostuffandthings.com");
  	JobView.setItems(model.getJobs());
  	

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
