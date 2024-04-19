package models;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

public class SearchModel 
{
	Stage stage;

	ObservableList<User> Users = 
		      FXCollections.observableArrayList();
	
	public SearchModel(Stage givenStage)
	{
		stage = givenStage;
	}

	public ObservableList<User> getUsers()
	{
		return Users;
	}

	
	
	public void populatePage()
	{
		
	}
	
	
}







