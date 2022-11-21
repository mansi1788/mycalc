import java.awt.*;
import java.awt.event.*;
class MyCalc extends WindowAdapter implements ActionListener{
    Frame f;
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
    double xd;
    double num1,num2,check;
    MyCalc(){
        f= new Frame("MY CALCULATOR");
        l1=new Label();
        l1.setBackground(Color.LIGHT_GRAY);
        f.setSize(360,500);
        f.setLayout(null);
        f.setVisible(true);



        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bneg=new Button("+/-");
        bpts=new Button(".");
        bback=new Button("back");
        badd=new Button("+");
        bsub=new Button("-");
        bmult=new Button("*");
        bdiv=new Button("/");
        bmod=new Button("%");
        bcalc=new Button("=");
        bclr=new Button("CE");

        l1.setBounds(50,50,260,60);
        b1.setBounds(50,340,50,50);
        b2.setBounds(120,340,50,50);
        b3.setBounds(190,340,50,50);
        b4.setBounds(50,270,50,50);
        b5.setBounds(120,270,50,50);
        b6.setBounds(190,270,50,50);
        b7.setBounds(50,200,50,50);
        b8.setBounds(120,200,50,50);
        b9.setBounds(190,200,50,50);
        b0.setBounds(120,410,50,50);
        bneg.setBounds(50,410,50,50);
        bpts.setBounds(190,410,50,50);
        bback.setBounds(120,130,50,50);
        badd.setBounds(260,340,50,50);
        bsub.setBounds(260,270,50,50);
        bmult.setBounds(260,200,50,50);
        bdiv.setBounds(260,130,50,50);
        bmod.setBounds(190,130,50,50);
        bcalc.setBounds(245,410,65,50);
        bclr.setBounds(50,130,65,50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bpts.addActionListener(this);
        bneg.addActionListener(this);
        bback.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);
        f.addWindowListener(this);

        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        f.add(bmod);
        f.add(bmult);
        f.add(bdiv);
        f.add(bmod);
        f.add(bcalc);
        f.add(bclr);
        f.add(bpts);
        f.add(bneg);
        f.add(bback);
    }
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }
    public void actionPerformed(ActionEvent e){
        String n,n2;
        if(e.getSource()==b1){
            n2=l1.getText();
            n=n2+"1";
            l1.setText(n);
        }
        if(e.getSource()==b2){
            n2=l1.getText();
            n=n2+"2";
            l1.setText(n);
        }
        if(e.getSource()==b3){
            n2=l1.getText();
            n=n2+"3";
            l1.setText(n);
        }
        if(e.getSource()==b4){
            n2=l1.getText();
            n=n2+"4";
            l1.setText(n);
        }
        if(e.getSource()==b5){
            n2=l1.getText();
            n=n2+"5";
            l1.setText(n);
        }
        if(e.getSource()==b6){
            n2=l1.getText();
            n=n2+"6";
            l1.setText(n);
        }
        if(e.getSource()==b7){
            n2=l1.getText();
            n=n2+"7";
            l1.setText(n);
        }
        if(e.getSource()==b8){
            n2=l1.getText();
            n=n2+"8";
            l1.setText(n);
        }
        if(e.getSource()==b9){
            n2=l1.getText();
            n=n2+"9";
            l1.setText(n);
        }
        if(e.getSource()==b0){
            n2=l1.getText();
            n=n2+"0";
            l1.setText(n);
        }

        if(e.getSource()==bpts){
            n2=l1.getText();
            n=n2+".";
            l1.setText(n);
        }
        if(e.getSource()==bneg){
            n2=l1.getText();
            n="-"+n2;
            l1.setText(n);
        }
        if(e.getSource()==badd){
            try{
                num1=Double.parseDouble(l1.getText());
            }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            n="";
            l1.setText(n);
            check=1;
        }
        if(e.getSource()==bback){
            n2=l1.getText();
            try{
                n=n2.substring(0, n2.length()-1);
            }catch(StringIndexOutOfBoundsException f){return;}
            l1.setText(n);
        }
        if(e.getSource()==bsub){
            try{
                num1=Double.parseDouble(l1.getText());
            }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            n="";
            l1.setText(n);
            check=2;
        }
        if(e.getSource()==bmult){
            try{
                num1=Double.parseDouble(l1.getText());
            }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            n="";
            l1.setText(n);
            check=3;
        }
        if(e.getSource()==bdiv){
            try{
                num1=Double.parseDouble(l1.getText());
            }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            n="";
            l1.setText(n);
            check=4;
        }
        if(e.getSource()==bmod){
            try{
                num1=Double.parseDouble(l1.getText());
            }catch(NumberFormatException f){
                l1.setText("Invalid Format");
                return;
            }
            n="";
            l1.setText(n);
            check=5;
        }
        if(e.getSource()==bcalc){
            try{
                num2=Double.parseDouble(l1.getText());
            }catch(Exception f){
                l1.setText("ENTER NUMBER FIRST ");
                return;
            }
            if(check==1)
                xd =num1+num2;
            if(check==2)
                xd =num1-num2;
            if(check==3)
                xd =num1*num2;
            if(check==4)
                xd =num1/num2;
            if(check==5)
                xd =num1%num2;
            l1.setText(String.valueOf(xd));
        }
        if(e.getSource()==bclr){
            num1=0;
            num2=0;
            check=0;
            xd=0;
            n="";
            l1.setText(n);
        }
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}