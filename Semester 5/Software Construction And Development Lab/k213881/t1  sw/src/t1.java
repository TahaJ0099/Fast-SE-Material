import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class t1{
    public static void main(String[] args){
        JFrame f=new JFrame();
        Container con=f.getContentPane();
        con.setLayout(null);
        JLabel n1=new JLabel("NAME ");
        n1.setBounds(110, 90, 210, 30);
        con.add(n1);
        JTextField txn=new JTextField();
        txn.setBounds(170, 90, 210, 30);
        con.add(txn);
        JLabel a1=new JLabel("ADDRESS");
        a1.setBounds(110, 120, 210, 30);
        con.add(a1);
        JTextField txa=new JTextField();
        txa.setBounds(170, 120, 210, 30);
        con.add(txa);
        JLabel p1=new JLabel("PHONE ");
        p1.setBounds(110, 150, 210, 30);
        con.add(p1);
        JTextField txp=new JTextField();
        txp.setBounds(170, 150, 210, 30);
        con.add(txp);
        f.setTitle("Address Book");
        f.setBounds(9, 9, 400, 300);
        f.setVisible(true);
        JButton b=new JButton("SUBMIT");
        b.setBounds(170, 180, 210, 30);
        con.add(b);
        JLabel  na,ad,ph;
        na=new JLabel();
        na.setBounds(170, 240, 210, 30);
        con.add(na);
        ad=new JLabel();
        ad.setBounds(170, 270, 210, 30);
        con.add(ad);
        ph=new JLabel();
        ph.setBounds(170, 300, 210, 30);
        con.add(ph);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String n=txn.getText();
                String a=txa.getText();
                String p=txp.getText();
                if(!n.equals("")&&!a.equals("")&&!p.equals("") ){
                    if(ae.getSource()==b){
                        na.setText("NAME = "+txn.getText());
                        ad.setText("ADDRESS = "+txa.getText());
                        ph.setText("PHONE = "+txp.getText());
                    }  }
            }
        });
    }  }