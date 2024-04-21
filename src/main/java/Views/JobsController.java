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
  	refresh();
  	

	}

	public void refresh()
	{
		int PostSize = model.getJobs().size();
		model.getJobs().clear();
		for(int i=0;i<PostSize;i++)
		{
			model.createJob(model.getPostData().get(i).getPoster().get(), model.getPostData().get(i).getPostDate().get(), 
					model.getPostData().get(i).getJobTitle().get(), model.getPostData().get(i).getJobTitle().get(),
					model.getPostData().get(i).getJobLink().get());
		}
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
  	@FXML
  	void onClickEdit(ActionEvent event)
  	{
  		Post selectedPost = getPost();
  		System.out.println("Clicked on Edit");
  		ViewModel.showEditPost(selectedPost);
  	}

  	public Post getPost()
  	{
  		int PostIndex = JobView.getSelectionModel().getSelectedIndex();
  		Post wantedPost = model.getPostData().get(PostIndex);
  		return wantedPost;
  	}

  	
}
