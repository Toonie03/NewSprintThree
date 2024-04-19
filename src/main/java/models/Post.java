package models;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class Post {

	StringProperty Poster;
	StringProperty PostDate;
	StringProperty JobTitle;
	StringProperty JobText;
	StringProperty JobLink;
	BorderPane Holder = new BorderPane();
	Stage stage;


	public Post(StringProperty poster, StringProperty postDate, StringProperty jobTitle, StringProperty jobText,
			StringProperty jobLink, Stage stage) {
		super();
		Poster = poster;
		PostDate = postDate;
		JobTitle = jobTitle;
		JobText = jobText;
		JobLink = jobLink;
		stage=stage;
	}


	public StringProperty getPoster() {
		return Poster;
	}


	public void setPoster(StringProperty poster) {
		Poster = poster;
	}


	public StringProperty getPostDate() {
		return PostDate;
	}


	public void setPostDate(StringProperty postDate) {
		PostDate = postDate;
	}


	public StringProperty getJobTitle() {
		return JobTitle;
	}


	public void setJobTitle(StringProperty jobTitle) {
		JobTitle = jobTitle;
	}


	public StringProperty getJobText() {
		return JobText;
	}


	public void setJobText(StringProperty jobText) {
		JobText = jobText;
	}


	public StringProperty getJobLink() {
		return JobLink;
	}


	public void setJobLink(StringProperty jobLink) {
		JobLink = jobLink;
	}


	public BorderPane getHolder() {
		return Holder;
	}


	public void setHolder(BorderPane holder) {
		Holder = holder;
	}


	public HBox setTop()
	{
		HBox top = new HBox();
		Label username = new Label();
		Label date = new Label();
		username.setText(Poster.get());
		date.setText(getPostDate().get());
		username.setMinWidth(411);;
		top.getChildren().addAll(username,date);
		return top;
	}
	
	public VBox setCenter(Pane View)
	{
		VBox body = new VBox();
		Label title = new Label(getJobTitle().get());
		Label text = new Label(getJobText().get());
		title.setStyle("-fx-font-weight: bold");
		text.maxWidth(300);
		System.out.println("Text Wrap is " + text.wrapTextProperty().get());
		body.getChildren().addAll(title, text);
		return body;
	}
	
	public Label setBottom()
	{
		Label webLink = new Label();
		webLink.setText(getJobLink().get());
		return webLink;
	}


	
	
}
