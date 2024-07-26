import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class t3 implements ActionListener{
    JTextField txt;
    JFrame f;

    JButton[] bt=new JButton[10];
    JButton[] btn=new JButton[7];
    JButton a,s,m,d,de,eq;
    JPanel p;
    Font fn=new Font("Yellow",Font.BOLD,23);
    char op;
    double n1=0,m1=0,v=0;
    public t3(){
        f= new JFrame("SIMPLE CALCULATOR");
        f.setSize(350,500);
        f.setLayout(null);
        txt=new JTextField();
        txt.setBounds(60, 35, 310, 60);
        txt.setFont(fn);
        txt.setEditable(false);
        a=new JButton("+");
        s=new JButton("-");
        m=new JButton("*");
        d=new JButton("/");
        de=new JButton(".");
        eq=new JButton("=");
        btn[0]=a;
        btn[1]=s;
        btn[2]=m;
        btn[3]=d;
        btn[4]=de;
        btn[5]=eq;
        //btn[6]=c;
        btn[0].addActionListener(this);
        btn[0].setFont(fn);
        btn[1].addActionListener(this);
        btn[1].setFont(fn);
        btn[2].addActionListener(this);
        btn[2].setFont(fn);
        btn[3].addActionListener(this);
        btn[3].setFont(fn);
        btn[4].addActionListener(this);
        btn[4].setFont(fn);
        btn[5].addActionListener(this);
        btn[5].setFont(fn);
        bt[0]=new JButton(String.valueOf(0));
        bt[0].addActionListener(this);
        bt[0].setFont(fn);
        bt[1]=new JButton(String.valueOf(1));
        bt[1].addActionListener(this);
        bt[1].setFont(fn);
        bt[2]=new JButton(String.valueOf(2));
        bt[2].addActionListener(this);
        bt[2].setFont(fn);
        bt[3]=new JButton(String.valueOf(3));
        bt[3].addActionListener(this);
        bt[3].setFont(fn);
        bt[4]=new JButton(String.valueOf(4));
        bt[4].addActionListener(this);
        bt[4].setFont(fn);
        bt[5]=new JButton(String.valueOf(5));
        bt[5].addActionListener(this);
        bt[5].setFont(fn);
        bt[6]=new JButton(String.valueOf(6));
        bt[6].addActionListener(this);
        bt[6].setFont(fn);
        bt[7]=new JButton(String.valueOf(7));
        bt[7].addActionListener(this);
        bt[7].setFont(fn);
        bt[8]=new JButton(String.valueOf(8));
        bt[8].addActionListener(this);
        bt[8].setFont(fn);
        bt[9]=new JButton(String.valueOf(9));
        bt[9].addActionListener(this);
        bt[9].setFont(fn);
        //c.setBounds(130,440,160,60);
        p=new JPanel();
        p.setBounds(60, 110, 310, 310);
        p.setLayout(new GridLayout(4,4,5,5));
        p.add(bt[1]);
        p.add(bt[2]);
        p.add(bt[3]);
        p.add(a);
        p.add(bt[4]);
        p.add(bt[5]);
        p.add(bt[6]);
        p.add(s);
        p.add(bt[7]);
        p.add(bt[8]);
        p.add(bt[9]);
        p.add(m);
        p.add(de);
        p.add(bt[0]);
        p.add(eq);
        p.add(d);
        f.add(p);
        f.add(txt);
        f.setVisible(true); }
    public static void main(String[] args){
        t3 d=new t3(); }
    @Override
    public void actionPerformed(ActionEvent ae){
        for(int x=0;x<10;x++){
            if(ae.getSource()==bt[x]){
                txt.setText(txt.getText().concat(String.valueOf(x))); } }
        if(ae.getSource()==de){
            txt.setText(txt.getText().concat(".")); }
        if(ae.getSource()==a){
            n1=Double.parseDouble(txt.getText());
            op='+';
            txt.setText("+"); }
        if(ae.getSource()==s){
            n1=Double.parseDouble(txt.getText());
            op='-';
            txt.setText("-"); }
        if(ae.getSource()==m){
            n1=Double.parseDouble(txt.getText());
            op='*';
            txt.setText("*"); }
        if(ae.getSource()==d){
            n1=Double.parseDouble(txt.getText());
            op='/';
            txt.setText("/"); }
        if(ae.getSource()==eq){
            m1=Double.parseDouble(txt.getText());
            switch (op){
                case '+' -> v=n1+m1;
                case '-' -> v=n1-m1;
                case '*' -> v=n1*m1;
                case '/' -> v=n1/m1;  }
            txt.setText(String.valueOf(v));
            n1=v;  }
    }   }