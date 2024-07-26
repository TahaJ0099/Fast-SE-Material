package com.example.ta2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class ta2 extends Application{
    @Override
    public void start(Stage ps){
        HBox p=new HBox();
        HBox q=new HBox();
        HBox r=new HBox();
        HBox s=new HBox();
        VBox pa=new VBox();
        Label n=new Label("NAME ");
        Label a=new Label("AGE ");
        Label e=new Label("EMAIL");
        TextField txn=new TextField();
        txn.setMaxWidth(230);
        TextField txa=new TextField();
        txa.setMaxWidth(230);
        TextField txe=new TextField();
        txe.setMaxWidth(230);
        Label n1=new Label(" ");
        Label a1=new Label(" ");
        Label e1=new Label(" ");
        Button b=new Button("REGISTER");
        b.setMaxWidth(200);
        pa.setSpacing(10);
        p.getChildren().add(n);
        p.getChildren().add(txn);
        p.getChildren().add(n1);
        p.setSpacing(10);
        q.getChildren().add(a);
        q.getChildren().add(txa);
        q.getChildren().add(a1);
        q.setSpacing(10);
        r.getChildren().add(e);
        r.getChildren().add(txe);
        r.getChildren().add(e1);
        r.setSpacing(10);
        s.getChildren().add(b);
        pa.getChildren().add(p);
        pa.getChildren().add(q);
        pa.getChildren().add(r);
        pa.getChildren().add(s);
        pa.setSpacing(20);
        Label l=new Label();
        pa.getChildren().add(l);
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae) {
                String n=txn.getText();
                String p=txa.getText();
                String a=txe.getText();
                if(ae.getSource()==b){
                    if(!n.equals("")){
                        n1.setText(""); }
                    if(!p.equals(""))  {
                        e1.setText(""); }
                    if(!a.equals("")){
                        a1.setText(""); }
                    if(!n.equals("")&&!p.equals("")&&!a.equals("")){
                        l.setText("REGISTERED SUCESSFULLY!!!");
                        txn.setText("");
                        txe.setText("");
                        txa.setText("");
                    } }
                if(ae.getSource()==b){
                    if(n.equals("")){
                        n1.setText("name is null"); }
                    else  if(p.equals("")){
                        a1.setText("age is null"); }
                    else if(a.equals("")){
                        e1.setText("email is null"); }
                } }
        });
        Scene sc=new Scene(pa);
        ps.setScene(sc);
        ps.setTitle("STUDENT REGISTRATION FORM");
        ps.setWidth(600);
        ps.setHeight(400);
        ps.show(); }
    public static void main(String[] args) {
        launch(args); }
}