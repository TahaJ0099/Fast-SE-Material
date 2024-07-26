package com.example.t3;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class t3 extends Application implements EventHandler<ActionEvent>{
    @Override
    public void start(Stage ps){
        ps.setTitle("SIMPLE CALCULATOR");
        HBox a=new HBox();
        HBox b=new HBox();
        HBox c=new HBox();
        HBox d=new HBox();
        HBox e=new HBox();
        HBox f=new HBox();
        HBox g=new HBox();
        VBox av=new VBox();
        l=new Label("");
        la = new Label("");
        lb=new Label("");
        lc=new Label("");
        b1=new Button("7");
        b1.setOnAction(this);
        b2=new Button("8");
        b2.setOnAction(this);
        b3=new Button("9");
        b3.setOnAction(this);
        b4=new Button("*");
        b4.setOnAction(this);
        b5=new Button("4");
        b5.setOnAction(this);
        b6=new Button("5");
        b6.setOnAction(this);
        b7=new Button("6");
        b7.setOnAction(this);
        b8=new Button("/");
        b8.setOnAction(this);
        b9=new Button("1");
        b9.setOnAction(this);
        b10=new Button("2");
        b10.setOnAction(this);
        b11=new Button("3");
        b11.setOnAction(this);
        b12=new Button("+");
        b12.setOnAction(this);
        b13=new Button("0");
        b13.setOnAction(this);
        b14=new Button("-");
        b14.setOnAction(this);
        b15=new Button("=");
        b15.setOnAction(this);
        b16=new Button("C");
        b16.setOnAction(this);
        b.getChildren().add(l);
        b.getChildren().add(la);
        b.getChildren().add(lb);
        c.getChildren().add(lc);
        d.getChildren().add(b1);
        d.getChildren().add(b2);
        d.getChildren().add(b3);
        d.getChildren().add(b16);
        d.setSpacing(25);
        e.getChildren().add(b5);
        e.getChildren().add(b6);
        e.getChildren().add(b7);
        e.getChildren().add(b4);
        e.setSpacing(25);
        f.getChildren().add(b9);
        f.getChildren().add(b10);
        f.getChildren().add(b11);
        f.getChildren().add(b8);
        f.setSpacing(25);
        g.getChildren().add(b13);
        g.getChildren().add(b14);
        g.getChildren().add(b12);
        g.getChildren().add(b15);
        g.setSpacing(25);
        av.getChildren().add(a);
        av.getChildren().add(b);
        av.getChildren().add(c);
        av.getChildren().add(d);
        av.getChildren().add(e);
        av.getChildren().add(f);
        av.getChildren().add(g);
        av.setSpacing(15);
        Scene sc=new Scene(av);
        ps.setScene(sc);
        ps.setWidth(260);
        ps.setHeight(310);
        ps.show();  }
    Label l,la,lb,lc;
    Button b1,b2,b3,b4;
    Button b5,b6,b7,b8;
    Button b9,b10,b11,b12;
    Button b13,b14,b15,b16;
    public void handle(ActionEvent ae){
        String m=b4.getText();
        String d=b8.getText();
        String a=b12.getText();
        String s=b14.getText();
        String d1=l.getText();
        String ch=la.getText();
        String d2=lb.getText();
        int re;
        if(ae.getSource()==b3&&d1.equals("")){
            l.setText("9"); }
        else if(ae.getSource()==b3&&d2.equals("")){
            lb.setText("9"); }
        if(ae.getSource()==b2&&d1.equals("")){
            l.setText("8"); }
        else if(ae.getSource()==b2&&d2.equals("")){
            lb.setText("8"); }
        if(ae.getSource()==b1&&d1.equals("")){
            l.setText("7"); }
        else if(ae.getSource()==b1&&d2.equals("")){
            lb.setText("7"); }
        if(ae.getSource()==b7&&d1.equals("")){
            l.setText("6"); }
        else if(ae.getSource()==b7&&d2.equals("")){
            lb.setText("6"); }
        if(ae.getSource()==b6&&d1.equals("")){
            l.setText("5"); }
        else if(ae.getSource()==b6&&d2.equals("")){
            lb.setText("5"); }
        if(ae.getSource()==b5&&d1.equals("")){
            l.setText("4"); }
        else if(ae.getSource()==b5&&d2.equals("")){
            lb.setText("4"); }
        if(ae.getSource()==b11&&d1.equals("")){
            l.setText("3"); }
        else if(ae.getSource()==b11&&d2.equals("")){
            lb.setText("3"); }
        if(ae.getSource()==b10&&d1.equals("")){
            l.setText("2"); }
        else if(ae.getSource()==b10&&d2.equals("")){
            lb.setText("2"); }
        if(ae.getSource()==b9&&d1.equals("")){
            l.setText("1"); }
        else if(ae.getSource()==b9&&d2.equals("")){
            lb.setText("1"); }
        if(ae.getSource()==b13&&d1.equals("")){
            l.setText("0"); }
        else if(ae.getSource()==b13&&d2.equals("")){
            lb.setText("0"); }
        if(ae.getSource()==b4){
            la.setText("*"); }
        if(ae.getSource()==b8){
            la.setText("/"); }
        if(ae.getSource()==b12){
            la.setText("+"); }
        if(ae.getSource()==b14){
            la.setText("-"); }
        try{
            if(ae.getSource()==b15){
                int di1=Integer.parseInt(l.getText());
                int di2=Integer.parseInt(lb.getText());
                if(ch.equals("+")){
                    re=di1+di2;
                    String rx=String.valueOf(re);
                    lc.setText(rx); }
                if(ch.equals("-")){
                    re=di1-di2;
                    String rx=String.valueOf(re);
                    lc.setText(rx); }
                if(ch.equals("*")){
                    re=di1*di2;
                    String r1=String.valueOf(re);
                    lc.setText(r1); }
                if(ch.equals("/")){
                    float div1=Float.parseFloat(l.getText());
                    float div2=Float.parseFloat(lb.getText());
                    float rd=div1/div2;
                    String rx=String.valueOf(rd);
                    lc.setText(rx); }
            }
        }
        catch(ArithmeticException e){
            lc.setText("Infinity"); }
        if(ae.getSource()==b16){
            l.setText("");
            la.setText("");
            lb.setText("");
            lc.setText(""); }
    }
    public static void main(String[] args) {
        launch(args); }
}