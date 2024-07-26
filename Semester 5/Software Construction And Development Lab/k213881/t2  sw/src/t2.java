import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frame extends JFrame implements ActionListener{
    JTextField txn,txa,txe;
    JLabel v;
    JButton b;
    frame(){
        setTitle("Student Registration Form");
        setBounds(9, 9, 400, 300);
        Container con=getContentPane();
        con.setLayout(null);
        JLabel n=new JLabel("NAME");
        n.setBounds(110, 90, 210, 30);
        con.add(n);
        txn=new JTextField();
        txn.setBounds(170, 90, 210, 30);
        con.add(txn);
        JLabel a=new JLabel("AGE");
        a.setBounds(110, 120, 210, 30);
        con.add(a);
        txa=new JTextField();
        txa.setBounds(170, 120, 210, 30);
        con.add(txa);
        JLabel e=new JLabel("EMAIL");
        e.setBounds(110, 150, 210, 30);
        con.add(e);
        txe=new JTextField();
        txe.setBounds(170, 150, 210, 30);
        con.add(txe);
        b=new JButton("SUBMIT");
        b.setBounds(170, 180, 210, 30);
        con.add(b);
        v=new JLabel();
        v.setBounds(170, 210, 210, 30);
        con.add(v);
        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String n=txn.getText();
        String ag=txa.getText();
        String em=txe.getText();
        if(!n.equals("")&&!ag.equals("")&&!em.equals("")){
            if(e.getSource()==b){
                txn.setText(" ");
                txa.setText(" ");
                txe.setText(" ");
                v.setText("REGISTERED SUCCESSFULLY!!!");
            } }
    }  }
public class t2 {
    public static void main(String[] args) {
        frame fra=new frame();
    } }