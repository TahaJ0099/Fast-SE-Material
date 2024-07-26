package com.example.t1;
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
public class t1 extends Application{
    @Override
    public void start(Stage ps) {
        HBox p=new HBox();
        HBox q=new HBox();
        HBox r=new HBox();
        VBox pa=new VBox();
        Label n=new Label("NAME");
        Label ph=new Label("PHONE");
        Label a=new Label("ADDRESS");
        TextField txn=new TextField();
        txn.setMaxWidth(230);
        TextField txp=new TextField();
        txp.setMaxWidth(230);
        TextField txa=new TextField();
        txa.setMaxWidth(230);
        Label n1=new Label(" ");
        Label a1=new Label(" ");
        Label p1=new Label(" ");
        Button b=new Button("SUBMIT");
        b.setMaxWidth(200);
        pa.setSpacing(10);
        p.getChildren().add(txn);
        p.getChildren().add(n1);
        p.setSpacing(10);
        q.getChildren().add(txp);
        q.getChildren().add(p1);
        q.setSpacing(10);
        r.getChildren().add(txa);
        r.getChildren().add(a1);
        r.setSpacing(10);
        pa.getChildren().add(n);
        pa.getChildren().add(p);
        pa.getChildren().add(ph);
        pa.getChildren().add(q);
        pa.getChildren().add(a);
        pa.getChildren().add(r);
        pa.getChildren().add(b);
        Label re=new Label();
        Label la=new Label();
        Label lb=new Label();
        Label lc=new Label();
        pa.getChildren().add(re);
        pa.getChildren().add(la);
        pa.getChildren().add(lb);
        pa.getChildren().add(lc);
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                String n=txn.getText();
                String p=txp.getText();
                String a=txa.getText();
                if(ae.getSource()==b){
                    if(!n.equals("")){
                        n1.setText(""); }
                    if(!p.equals(""))  {
                        p1.setText(""); }
                    if(!a.equals(""))  {
                        a1.setText(""); }
                    if(!n.equals("")&&!p.equals("")&&!a.equals("")){
                        la.setText("NAME = "+n);
                        lb.setText("PHONE = "+p);
                        lc.setText("ADDRESS = "+a);
                        txn.setText("");
                        txp.setText("");
                        txa.setText("");
                    }
                }
                if(ae.getSource()==b){
                    if(n.equals("")){
                        n1.setText("name not filled"); }
                    else  if(p.equals("")){
                        p1.setText("phone no not filled"); }
                    else if(a.equals("")){
                        a1.setText("address not filled"); }
                } }
        });
        Scene sc=new Scene(pa);
        ps.setScene(sc);
        ps.setTitle("ADDRESS BOOK");
        ps.setWidth(510);
        ps.setHeight(610);
        ps.show();}
    public static void main(String[] args) {
        launch(args);
    }
}