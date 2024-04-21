package Views;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.Post;
import models.UserModel;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.util.StringConverter;
import  javafx.util.converter.*;
public class UserController
{
  
    UserModel model;
    ViewTransitionModelInterface ViewModel;

  
    public void setModel(ViewTransitionModelInterface newViewModel, UserModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;
      Bindings.bindBidirectional(UsernameLabel.textProperty(),
    	        model.getName());
      Bindings.bindBidirectional(DisplayBioLabel.textProperty(),
    		  model.getBio());
      StringConverter<Number> fmt = new NumberStringConverter();
      Bindings.bindBidirectional(FollowerTextLabel.textProperty(),
    		  model.getFollowers(), fmt);
      Bindings.bindBidirectional(FollowingTextLabel.textProperty(),
	  model.getFollowing(), fmt); model.getPosts().clear();
	  model.createPost(model.getName().get(), "4/16/2024", "Daily Log 2", "Today I smelt the flowers and it made me think about recursion. Why I thought about recursion... idk. But I now hate flowers.", "totallyreallinktostuffandthings.com");     
	  model.createPost(model.getName().get(), "4/15/2024", "Daily Log 1", "I'm new here. Hopefully I make some new lie long friends and find some really cool oppertunites", "totallyreallinktostuffandthings.com");     
	  UserPostsListView.setItems(model.getPosts());
    }

    @FXML
    private ListView<BorderPane> UserPostsListView;
    @FXML
    private Label DisplayBioLabel;

    @FXML
    private Label FollowerTextLabel;

    @FXML
    private Label FollowingTextLabel;
    @FXML
    private Label UsernameLabel;

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
    	System.out.println("Clicked on Edit");
    	ViewModel.showEditUser(model);
    }



}