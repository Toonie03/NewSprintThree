
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ListView?>
<?import javafx.scene.layout.BorderPane?>
<?import javafx.scene.layout.TilePane?>
<BorderPane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/21" xmlns:fx="http://javafx.com/fxml/1" fx:controller="Views.FeedController">
  <left>
     <TilePane prefHeight="400.0" prefWidth="102.0" vgap="25.0" BorderPane.alignment="CENTER">
        <children>
           <Button mnemonicParsing="false" onAction="#onClickUser" prefHeight="50.0" prefWidth="58.0" text="User" />
           <Button mnemonicParsing="false" onAction="#onClickHome" prefHeight="50.0" prefWidth="58.0" text="Home" />
           <Button mnemonicParsing="false" onAction="#onClickJobs" prefHeight="50.0" prefWidth="58.0" text="Jobs" />
           <Button mnemonicParsing="false" onAction="#onClickSearch" prefHeight="50.0" prefWidth="58.0" text="Search" />
        </children>
        <padding>
           <Insets left="20.0" top="50.0" />
        </padding>
     </TilePane>
  </left>
  <center>
     <ListView prefHeight="200.0" prefWidth="200.0" BorderPane.alignment="CENTER" />
  </center>
</BorderPane>
