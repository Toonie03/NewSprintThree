package Views;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.FeedModel;
import models.SearchModel;
import models.User;
import models.ViewTransitionModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.util.StringConverter;
import  javafx.util.converter.*;

public class SearchController
{
  
    SearchModel model;
    ViewTransitionModelInterface ViewModel;
    @FXML
    private ListView<User>UserView = new ListView<User>();
  
    public void setModel(ViewTransitionModelInterface newViewModel, SearchModel newModel)
    {
      ViewModel=newViewModel;
      model = newModel;    
      model.getUsers().clear();
      addUser("Rashawn", "follower");
      addUser("Mia","following");
      addUser("william.bailey", "following");
      addUser("micheal.bradshaw","following");
      addUser("bing","company");
      addUser("google","company");
      addUser("python","skill");
      addUser("java","skill");
      UserView.setItems(model.getUsers());
//      Bindings.bindBidirectional(UserNameLabel.textProperty(),
//  	        model.getUserName());
//      
//      Bindings.bindBidirectional(PostTitleLabel.textProperty(),
//    	        model.getPostTitle());
//      
//      Bindings.bindBidirectional(PostContentLabel.textProperty(),
//    	        model.getPostContent());
//      
//      Bindings.bindBidirectional(PostDateLabel.textProperty(),
//    	        model.getPostDate());
//      
//      Bindings.bindBidirectional(ExternalWebLinkLabel.textProperty(),
//    	        model.getExternalWebLink());
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
    	System.out.println("Clicked on Jobs");
    	ViewModel.showSearch();
    }

    @FXML
    void onClickUser(ActionEvent event) {
    	System.out.println("Clicked on User");
    	ViewModel.showUser();
    }
    
    public void addUser(String str, String type)
    {
    	User newUser = new User(str,type);
    	model.getUsers().add(newUser);
    }

    @FXML
    void onClickClear(ActionEvent event) {
    	System.out.println("Clicked on Clear");
    	UserView.setItems(model.getUsers());
    }
    @FXML
    void onClickSkills(ActionEvent event) {
    	System.out.println("Clicked on Skills");
    	ObservableList<User> FilteredUsers = 
  		      FXCollections.observableArrayList();
    	for(int i=0;i<model.getUsers().size();i++)
    	{
    		if(model.getUsers().get(i).getType()=="skill")
    		{
    			FilteredUsers.add(model.getUsers().get(i));
    		}
    	}
    	UserView.setItems(FilteredUsers);
    }

    @FXML
    void onClickCompanies(ActionEvent event) {
    	System.out.println("Clicked on companies");
    	ObservableList<User> FilteredUsers = 
    		      FXCollections.observableArrayList();
      	for(int i=0;i<model.getUsers().size();i++)
      	{
      		if(model.getUsers().get(i).getType()=="company")
      		{
      			FilteredUsers.add(model.getUsers().get(i));
      		}
      	}
      	UserView.setItems(FilteredUsers);
    }
    @FXML
    void onClickFollowers(ActionEvent event) {
    	System.out.println("Clicked on followers");
    	ObservableList<User> FilteredUsers = 
  		      FXCollections.observableArrayList();
    	for(int i=0;i<model.getUsers().size();i++)
    	{
    		if(model.getUsers().get(i).getType()=="follower")
    		{
    			FilteredUsers.add(model.getUsers().get(i));
    		}
    	}
    	UserView.setItems(FilteredUsers);
    }

    @FXML
    void onClickFollowing(ActionEvent event) {
    	System.out.println("Clicked on following");
    	ObservableList<User> FilteredUsers = 
    		      FXCollections.observableArrayList();
      	for(int i=0;i<model.getUsers().size();i++)
      	{
      		if(model.getUsers().get(i).getType()=="following")
      		{
      			FilteredUsers.add(model.getUsers().get(i));
      		}
      	}
      	UserView.setItems(FilteredUsers);
    }


}