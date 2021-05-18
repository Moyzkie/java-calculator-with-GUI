import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

class MyFrame extends JFrame implements ActionListener {
        //NAG LAGAY AKO NG MGA OBJECT NA MAY ACCESS MODIFIER
        //NA PRIVATE KAPAG WALA ITO HINDI KA MAKAKABUO NG OBJECT 
        //TULAD NG MGA BUTTON AT TEXTBOX AT IBA PA. 
        private Container c;
        private JButton btn;
        private JButton btn1;
        private JButton btn2;
        private JButton btn3;
        private JButton btn4;
        private JButton btn5;
        private JButton btn6;
        private JButton btn7;
        private JButton btn8;
        private JButton btn9;
        private JButton btnD;
        private JButton btnDT;
        private JButton btnE;
        private JButton btnM;
        private JButton btnMn;
        private JButton btnP;
        private JPanel jPanel1;
        private JPanel jPanel2;
        private JTextField jTextField2;
        private JLabel jLabel1;
        private JButton btnE1;
         
        //NAG DECLEAR AKO NG VARIABLE NA MAY DATA TYPE NA DOUBLE AT INTEGER
        //PARA SA CALCULATION NA ATING GAGAWIN
        double num,ans;
        
        int calculation;
        
        //GUMAWA AKO NG METHOD NA OPERATION AT SA LOOB NITO AY MAY RO-ONG 
        // SWITCH STATEMENT UPANG MAKAPILI TAYO NG OPERATION NA ATING GAGAWIN
        //SA PAG COMPUTE 
         public void Operation(){
            
          switch(calculation)
          {
          	  //KAPAG ANG VALUE NI CALCULATION AY 1 BABASAHIN NYA ANG LAMAN 
          	  //NI CASE 1
              case 1: // addtion 
                   ans = num + Double.parseDouble(jTextField2.getText());
                   jTextField2.setText(Double.toString(ans));
                   break;
              //KAPAG ANG VALUE NI CALCULATION AY 2 BABASAHIN NYA ANG LAMAN 
          	  //NI CASE 2    
              case 2: // Subtraction 
                   ans = num - Double.parseDouble(jTextField2.getText());
                   jTextField2.setText(Double.toString(ans));
                   break; 
               //KAPAG ANG VALUE NI CALCULATION AY 3 BABASAHIN NYA ANG LAMAN 
          	  //NI CASE 3     
              case 3: // Multiplication 
                   ans = num * Double.parseDouble(jTextField2.getText());
                   jTextField2.setText(Double.toString(ans));
                   break;
               //KAPAG ANG VALUE NI CALCULATION AY 4 BABASAHIN NYA ANG LAMAN 
          	  //NI CASE 4
              case 4: // Divition 
                   ans = num / Double.parseDouble(jTextField2.getText());
                   jTextField2.setText(Double.toString(ans));
                   break;
          }
        }
  public MyFrame(){
  	    //SA LINE NA ITO BUMO-O NA AKO DITO NG MGA OBJECT 
        //KASAMA NA DITO ANG MGA POSITIONNING NG MGA BUTTON
  	    //AT TEXTBOXT
        jPanel1 = new JPanel();
        btn8 = new JButton();
        btn7 = new JButton();
        btn9 = new JButton();
        btnD = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btnM = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btnMn = new JButton();
        btnDT = new JButton();
        btn = new JButton();
        btnE = new JButton();
        btnP = new JButton();
        btnE1 = new JButton();
        jPanel2 = new JPanel();
        jTextField2 = new JTextField();   
        jLabel1 = new JLabel();
     
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(339, 380));
        setResizable(false);
        getContentPane().setLayout(null);
        setVisible(true);
        setTitle("Calculator");
        getContentPane().setLayout(null);
        c = getContentPane(); 
        c.setLayout(null);
        jPanel1.setBackground(new Color(6, 18, 5));
        jPanel1.setLayout(null);
     
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(339, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new Color(6, 18, 5));
        jPanel1.setLayout(null);

        btn8.setBackground(new Color(6, 18, 5));
        btn8.setFont(new Font("Century Gothic", 0, 36)); 
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        jPanel1.add(btn8);
        btn8.setBounds(80, 0, 80, 60);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 8 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 8
            jTextField2.setText(jTextField2.getText()+ "8");
            
        } 
        });

        btn7.setBackground(new Color(6, 18, 5));
        btn7.setFont(new Font("Century Gothic", 0, 36)); 
        btn7.setForeground(new Color(255, 255, 255));
        btn7.setText("7");
        jPanel1.add(btn7);
        btn7.setBounds(0, 0, 80, 60);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 7 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 7
            jTextField2.setText(jTextField2.getText()+ "7");
            
        } 
        });

        btn9.setBackground(new Color(6, 18, 5));
        btn9.setFont(new Font("Century Gothic", 0, 36)); 
        btn9.setForeground(new Color(255, 255, 255));
        btn9.setText("9");
        jPanel1.add(btn9);
        btn9.setBounds(160, 0, 80, 60);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
             //KAPAG NA CLICK KO DAW SI BUTTON 9 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 9
            jTextField2.setText(jTextField2.getText()+ "9");
            
        } 
        });

        btnD.setBackground(new Color(213, 150, 5));
        btnD.setFont(new Font("Century Gothic", 0, 36)); 
        btnD.setForeground(new Color(255, 255, 255));
        btnD.setText("\\");
        jPanel1.add(btnD);
        btnD.setBounds(240, 0, 80, 60);
        btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON NA DIVITION ANG MAGIGING
            //VALUE NI CALCULATION AY 4 KAYA ANG PIPILIIN NYA NA 
            //OPERATION AY DIVISION DAHIL ANG LAMAN NGA CASE 4 NATIN
            //DON SA TAAS AY NAKA DIVISION OPERATOR.
            // AT ANG MAGIGING LAMAN NG VARIABLE NUM AY MANG GAGALING SA
            // jTextField2 NA KINONVERT SA DOUBLE PARA HINDI MAG KAKA
            //ERROR DAHIL ANG LAMAN NI jTextField2 AY ISANG STRING KYA
            //KAILANGAN MO SYANG I CONVERT SA DOUBLE DAHIL ANG VARIABLE
            //NUM AY NAKA DOUBLE DATA TYPE.
            num = Double.parseDouble(jTextField2.getText());
            calculation = 4;
            jTextField2.setText("");
            jLabel1.setText(num+"/");
            
        } 
        });

        btn4.setBackground(new Color(6, 18, 5));
        btn4.setFont(new Font("Century Gothic", 0, 36)); 
        btn4.setForeground(new Color(255, 255, 255));
        btn4.setText("4");
        jPanel1.add(btn4);
        btn4.setBounds(0, 60, 80, 60);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 4 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 4
            jTextField2.setText(jTextField2.getText()+ "4");
            
        } 
        });

        btn5.setBackground(new Color(6, 18, 5));
        btn5.setFont(new Font("Century Gothic", 0, 36)); 
        btn5.setForeground(new Color(255, 255, 255));
        btn5.setText("5");
        jPanel1.add(btn5);
        btn5.setBounds(80, 60, 80, 60);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 5 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 5
            jTextField2.setText(jTextField2.getText()+ "5");
            
        } 
        });

        btn6.setBackground(new Color(6, 18, 5));
        btn6.setFont(new Font("Century Gothic", 0, 36)); 
        btn6.setForeground(new Color(255, 255, 255));
        btn6.setText("6");
        jPanel1.add(btn6);
        btn6.setBounds(160, 60, 80, 60);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 6 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 6
            jTextField2.setText(jTextField2.getText()+ "6");
            
        } 
        });

        btnM.setBackground(new Color(213, 150, 5));
        btnM.setFont(new Font("Century Gothic", 0, 36)); 
        btnM.setForeground(new Color(255, 255, 255));
        btnM.setText("X");
        jPanel1.add(btnM);
        btnM.setBounds(240, 60, 80, 60);
        btnM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON NA MULTIPLICATION ANG MAGIGING
            //VALUE NI CALCULATION AY 3 KAYA ANG PIPILIIN NYA NA 
            //OPERATION AY MULTIPLICATION DAHIL ANG LAMAN NGA CASE 3 NATIN
            //DON SA TAAS AY NAKA MULTIPLICATION OPERATOR.
            // AT ANG MAGIGING LAMAN NG VARIABLE NUM AY MANG GAGALING SA
            // jTextField2 NA KINONVERT SA DOUBLE PARA HINDI MAG KAKA
            //ERROR DAHIL ANG LAMAN NI jTextField2 AY ISANG STRING KYA
            //KAILANGAN MO SYANG I CONVERT SA DOUBLE DAHIL ANG VARIABLE
            //NUM AY NAKA DOUBLE DATA TYPE.
            num = Double.parseDouble(jTextField2.getText());
            calculation = 3;
            jTextField2.setText("");
            jLabel1.setText(num+"*");
            
        } 
        });

        btn1.setBackground(new Color(6, 18, 5));
        btn1.setFont(new Font ("Century Gothic", 0, 36)); 
        btn1.setForeground(new Color(255, 255, 255));
        btn1.setText("1");
        jPanel1.add(btn1);
        btn1.setBounds(0, 120, 80, 60);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 1 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 1
            jTextField2.setText(jTextField2.getText()+ "1");
            
        } 
        });

        btn2.setBackground(new Color(6, 18, 5));
        btn2.setFont(new Font("Century Gothic", 0, 36)); 
        btn2.setForeground(new Color(255, 255, 255));
        btn2.setText("2");
        jPanel1.add(btn2);
        btn2.setBounds(80, 120, 80, 60);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 2 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 2
            jTextField2.setText(jTextField2.getText()+ "2");
            
        } 
        });

        btn3.setBackground(new Color(6, 18, 5));
        btn3.setFont(new Font("Century Gothic", 0, 36)); 
        btn3.setForeground(new  Color(255, 255, 255));
        btn3.setText("3");
        jPanel1.add(btn3);
        btn3.setBounds(160, 120, 80, 60);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO DAW SI BUTTON 3 AY MAG KAKAROON NG
            //LAMAN ANG TEXTBOX NG 3
            jTextField2.setText(jTextField2.getText()+ "3");
            
        } 
        });

        btnMn.setBackground(new  Color(213, 150, 5));
        btnMn.setFont(new  Font("Century Gothic", 0, 36)); 
        btnMn.setForeground(new Color(255, 255, 255));
        btnMn.setText("-");
        jPanel1.add(btnMn);
        btnMn.setBounds(240, 120, 80, 60);
        btnMn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON NA MINUS ANG MAGIGING
            //VALUE NI CALCULATION AY 2 KAYA ANG PIPILIIN NYA NA 
            //OPERATION AY SUBTRACTION DAHIL ANG LAMAN NGA CASE 2 NATIN
            //DON SA TAAS AY NAKA SUBTRACTION OPERATOR.
            // AT ANG MAGIGING LAMAN NG VARIABLE NUM AY MANG GAGALING SA
            // jTextField2 NA KINONVERT SA DOUBLE PARA HINDI MAG KAKA
            //ERROR DAHIL ANG LAMAN NI jTextField2 AY ISANG STRING KYA
            //KAILANGAN MO SYANG I CONVERT SA DOUBLE DAHIL ANG VARIABLE
            //NUM AY NAKA DOUBLE DATA TYPE.
            num = Double.parseDouble(jTextField2.getText());
            calculation = 2;
            jTextField2.setText("");
            jLabel1.setText(num+"-");
            
        } 
        });

        btnDT.setBackground(new Color(6, 18, 5));
        btnDT.setFont(new Font("Century Gothic", 0, 36)); 
        btnDT.setForeground(new Color(255, 255, 255));
        btnDT.setText(".");
        jPanel1.add(btnDT);
        btnDT.setBounds(0, 180, 80, 60);
        btnDT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
              //KAPAG NA CLICK KO ANG BUTTON . AY MAGKAKARON NG
              // LAMAN ANG TEXTBOX NG .
              jTextField2.setText(jTextField2.getText()+".");
        } 
        });

        btn.setBackground(new Color(6, 18, 5));
        btn.setFont(new Font("Century Gothic", 0, 36)); 
        btn.setForeground(new Color(255, 255, 255));
        btn.setText("0");
        jPanel1.add(btn);
        btn.setBounds(80, 180, 80, 60);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON 0 AY MAGKAKARON NG
            // LAMAN ANG TEXTBOX NG 0
            jTextField2.setText(jTextField2.getText()+ "0");
            
        } 
        });

        btnE.setBackground(new Color(6, 18, 5));
        btnE.setFont(new Font("Century Gothic", 0, 36)); 
        btnE.setForeground(new Color(255, 255, 255));
        btnE.setText("C");
        jPanel1.add(btnE);
        btnE.setBounds(160, 180, 80, 60);
        btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON CLEARE AY MAWAWALA ANG
            //LAMAN NI  jTextField2.
            jTextField2.setText("");   
        } 
        });
         

        btnP.setBackground(new Color(213, 150, 5));
        btnP.setFont(new Font("Century Gothic", 0, 36)); 
        btnP.setForeground(new Color(255, 255, 255));
        btnP.setText("+");
        jPanel1.add(btnP);
        btnP.setBounds(240, 180, 80, 60);
        btnP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            //KAPAG NA CLICK KO ANG BUTTON NA ADDITION ANG MAGIGING
            //VALUE NI CALCULATION AY 1 KAYA ANG PIPILIIN NYA NA 
            //OPERATION AY ADDTION DAHIL ANG LAMAN NGA CASE 1 NATIN
            //DON SA TAAS AY NAKA ADDITION OPERATOR.
            // AT ANG MAGIGING LAMAN NG VARIABLE NUM AY MANG GAGALING SA
            // jTextField2 NA KINONVERT SA DOUBLE PARA HINDI MAG KAKA
            //ERROR DAHIL ANG LAMAN NI jTextField2 AY ISANG STRING KYA
            //KAILANGAN MO SYANG I CONVERT SA DOUBLE DAHIL ANG VARIABLE
            //NUM AY NAKA DOUBLE DATA TYPE.
            num = Double.parseDouble(jTextField2.getText());
            calculation = 1;
            jTextField2.setText("");
            jLabel1.setText(num+"+");
            
        } 
        });
         btnE1.setBackground(new Color(213, 150, 5));
         btnE1.setFont(new Font("Century Gothic", 0, 36)); // NOI18N
         btnE1.setForeground(new Color(255, 255, 255));
         btnE1.setText("=");
         jPanel1.add(btnE1);
         btnE1.setBounds(0, 240, 320, 60);
         btnE1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
            // PAG NA CLICK DAW SI EQUALS AY KUKUNIN NYA ANG
            // MAGIGING LAMAN NI OPERATION AT ANG LAMAN NI  jLabel1
            // AY MAWAWALA.
            Operation();
            jLabel1.setText("");
            
        } 
        });
     
        jPanel2.setBackground(new Color(13,56,8));
        jPanel2.setLayout(null);

        jTextField2.setBackground(new Color(13,56,8));
        jTextField2.setFont(new Font("Century Gothic", 0, 36)); 
        jTextField2.setForeground(new Color(255, 255, 255));
        jTextField2.setText("0");
        jTextField2.setHorizontalAlignment(JTextField.RIGHT);
        jTextField2.setBorder(null);
        
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 320, 300);

           
        jPanel2.add(jTextField2);
        jTextField2.setBounds(0, 50, 320, 50);
        jTextField2.setEditable(false);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 320, 100);
        
         jLabel1.setBackground(new Color(13, 56, 8));
         jLabel1.setFont(new Font("Century Gothic", 0, 36)); // NOI18N
         jLabel1.setForeground(new Color(213, 150, 5));
         jLabel1.setHorizontalAlignment(SwingConstants.RIGHT);
         jPanel2.add(jLabel1);
         jLabel1.setBounds(0, 10, 320, 40);

         getContentPane().add(jPanel2);
         jPanel2.setBounds(0, 0, 320, 100);
   }
 
    public void actionPerformed(ActionEvent e) {
       
    }
  }

  
    public class Calculator { 
   
    public static void main(String[] args) 
    { 

    //PANG PA GANDA LANG NG GRAPHICS TO
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //DRIVE CODE
        MyFrame f = new MyFrame(); 
     
    } 
}