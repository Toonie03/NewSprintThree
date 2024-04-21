package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.JobsModel;
import models.Post;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.util.StringConverter;
import  javafx.util.converter.*;

public class FeedController
{
  
    FeedModel model;
	ViewTransitionModelInterface ViewModel;
	

    @FXML
    private ListView<BorderPane> PostView = new ListView(); 
	public void setModel(ViewTransitionModelInterface newViewModel, FeedModel newModel)
	{
  	ViewModel=newViewModel;
  	model = newModel;
  	refresh();
  	

	}

	public void refresh()
	{
		int PostSize = model.getPosts().size();
		model.getPosts().clear();
		for(int i=0;i<PostSize;i++)
		{
			model.createPost(model.getPostData().get(i).getPoster().get(), model.getPostData().get(i).getPostDate().get(), 
					model.getPostData().get(i).getJobTitle().get(), model.getPostData().get(i).getJobTitle().get(),
					model.getPostData().get(i).getJobLink().get());
		}
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
  	
  	@FXML
  	void onClickEdit(ActionEvent event)
  	{
  		Post selectedPost = getPost();
  		System.out.println("Clicked on Edit");
  		ViewModel.showEditPost(selectedPost);
  	}

  	public Post getPost()
  	{
  		int PostIndex = PostView.getSelectionModel().getSelectedIndex();
  		Post wantedPost = model.getPostData().get(PostIndex);
  		return wantedPost;
  	}



}