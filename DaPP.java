import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Stack;
import java.util.Random;
import java.awt.Color;
import java.util.Scanner;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.EventQueue;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border .Border;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class pat1 extends JFrame
{
    pat1(String title)
    {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
         JPanel pnlLayout=new JPanel();
         pnlLayout.setLayout(new GridLayout(5,2));
         JPanel  pnlcode=new JPanel();
         ((FlowLayout)pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
         pnlcode.add(new JLabel("DESIGNER APPLICATION"));
         pnlLayout.add(pnlcode); 
         pnlcode=new JPanel();
       
        ((FlowLayout) pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
         pnlcode.add(new JLabel("YOU CAN CHOOSE THE GIVEN FORMATS"));
         pnlLayout.add(pnlcode);
         pnlcode=new JPanel();
         ActionListener al;
        al=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                newJFrame1();
            }
        };
        JButton btncoder=new JButton("TRIANGLE");
        btncoder.addActionListener(al);
        pnlcode.add(btncoder);
      
        
       
        al=new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
             newJFrame();   
        }
    };
    JButton btndecoder=new JButton("STAR");
    btndecoder.addActionListener(al);
    pnlcode.add(btndecoder);
    al=new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            newJFrame2();
        }
    };
    JButton btnmirror=new JButton("MIRROR");
    btnmirror.addActionListener(al);
    pnlcode.add(btnmirror);
    al=new ActionListener()
    {
         @Override
         public void actionPerformed(ActionEvent ae)
         {
             newJFrame3();
            }
        };
    JButton btnpyramid=new JButton("PYRAMID");
    btnpyramid.addActionListener(al);
    pnlcode.add(btnpyramid);      
    pnlLayout.add(pnlcode); 
    pnlcode=new JPanel();
    ((FlowLayout)pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
    pnlcode.add(new JLabel("DEVELOPER : ATISHAY JAIN"));
    Border border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);                                                                                   
    pnlcode.setBorder(border);
    pnlLayout.add(pnlcode);
    al=new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            AboutFrame();
        }
    };
    pnlcode=new JPanel();
    JButton btnabout=new JButton("ABOUT");
    btnabout.addActionListener(al);
    pnlcode.add(btnabout);
    pnlLayout.add(pnlcode);
    setContentPane(pnlLayout);
    setSize(500,200);
    setResizable(false);
     setVisible(true);
       
    }
    void newJFrame1()
    {
        JFrame frame=new JFrame("TRIANGLE");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel pnlLayout=new JPanel();
                ((FlowLayout)pnlLayout.getLayout()).setAlignment(FlowLayout.CENTER);
                JPanel pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                JLabel label=new JLabel("enter your name");
                label.setFont(new Font("Courier New",Font.ITALIC,12));
                label.setForeground(Color.RED);
                pnlTemp.add(label);
                final JTextField txtLetter=new JTextField(10);
                txtLetter.setToolTipText("Enter english word");
                pnlTemp.add(txtLetter);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("YOUR NAME"));
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                final JTextArea txtresult=new JTextArea(10,14);
                txtresult.setToolTipText("Don't enter anything in this field");
                pnlTemp.add(txtresult);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ActionListener al;
                al=new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent ae)
                    {
                        
                        String name;
                        String value=txtLetter.getText();
                        for(int i=0;i<value.length();i++)
                        {
                            for(int j=0;j<=i;j++)
                            {
                                String substring=value.substring(j,j+1);
                                txtresult.append(substring);
                               
                                
                            }
                            txtresult.append("\n");
                        }
                            
                        
                    }
                };
               
               JButton btnconvert=new JButton("Convert");
                btnconvert.addActionListener(al);
                pnlTemp.add(btnconvert);
                Border border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
                pnlTemp.setBorder(border);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                frame.setContentPane(pnlLayout);
               frame.setSize(600,300);
               frame.setVisible(true);
     
    }
    void newJFrame()
    {
        JFrame frame=new JFrame("STAR");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel pnlLayout=new JPanel();
                ((FlowLayout)pnlLayout.getLayout()).setAlignment(FlowLayout.LEFT);
                JPanel pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                final JTextField txtLetter=new JTextField(20);
                txtLetter.setToolTipText("Enter english word");
                pnlTemp.add(txtLetter);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("RESULT"));
                final JTextArea txtresult=new JTextArea(30,40);
                txtresult.setToolTipText("Don't enter anything in this field");
                pnlTemp.add(txtresult);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ActionListener al;
                al=new ActionListener()
                   {
                     @Override
                    public void actionPerformed(ActionEvent ae)
                    {
                          Stack lifo=new Stack();
                         int a,j,k,l,p;
                         String str=txtLetter.getText();
                         txtresult.setFont(new Font("Monospaced",Font.BOLD,16));
                         txtresult.setForeground(Color.RED);
                         p=str.length()-2;
                         String substring;
                         StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(i==str.length()-1)
            {
                for(a=0;a<str.length();a++)
                {
                    if(a==str.length()-1)
                    {
                         substring=str.substring(a,a+1);
                        sb.append(" "+substring+" ");
                    }
                    else
                    {
                        substring=str.substring(a,a+1);
                    sb.append(substring);
                }
                    if(a<str.length()-1)
                    {
                      substring=str.substring(a,a+1);
                    lifo.push(substring);
                }
            }
                while(!lifo.isEmpty())
                {
                    sb.append(lifo.pop());
                    
                }
            }
            else
            {
            for(j=1;j<=i+1;j++)
            {
                sb.append(" ");
            }
            for(k=1;k<=3;k++)
            {
                substring=str.substring(i,i+1);
                sb.append(substring);
                for(l=1;l<=p;l++)
                {
                    sb.append(" ");
                }
            }
            p--;
            sb.append("\n");
        }
    }
    sb.append("\n");     
      int q=1;
    for(int i=str.length()-2;i>=0;i--)
    {
        for(j=i;j>=-0;j--)
        {
            
            sb.append(" ");
        }
        for(k=1;k<=3;k++)
        {
            substring=str.substring(i,i+1);
            sb.append(substring);
            for(l=1;l<q;l++)
            {
                sb.append(" ");
            }
        }
        q++;
        sb.append("\n");
    }
    String s=sb.toString();
    txtresult.setText(s );
                }
            };
               
               JButton btnconvert=new JButton("Convert");
                btnconvert.addActionListener(al);
                pnlTemp.add(btnconvert);
                Border border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
                pnlTemp.setBorder(border);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                frame.setContentPane(pnlLayout);
               frame.setSize(800,800);
               frame.setResizable(false);
               frame.setVisible(true);
    }
      void newJFrame2()
        {
            JFrame frame=new JFrame("MIRROR");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel pnlLayout=new JPanel();
                ((FlowLayout)pnlLayout.getLayout()).setAlignment(FlowLayout.LEFT);
                JPanel pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("ENTER YOUR NAME"));
                final JTextField txtLetter=new JTextField(20);
                txtLetter.setToolTipText("Enter english word");
                pnlTemp.add(txtLetter);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("RESULT"));
                final JTextArea txtresult=new JTextArea(30,40);
                txtresult.setToolTipText("Don't enter anything in this field");
                pnlTemp.add(txtresult);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ActionListener al;
                al=new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent ae)
                    {
                        Stack lifo=new Stack();
        int i,j,k,p=1,l;
        String str=txtLetter.getText();
         txtresult.setFont(new Font("Monospaced",Font.BOLD,16));
        String substring;
        StringBuilder sb=new StringBuilder();
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                substring=str.substring(j,j+1);
                sb.append(substring);
            }
                for(k=p;k<=str.length()*2-1;k++)
                {
                    sb.append(" ");
                }
                for( l=0;l<=i;l++)
                {
                    substring=str.substring(l,l+1);
                    lifo.push(substring);
                }
                while(!lifo.isEmpty())
                {
                   sb.append(lifo.pop().toString());
                }
                
            
            p=p+2;
           sb.append("\n");
        }
        p=3;
        for(i=str.length()-2;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                substring=str.substring(j,j+1);
              sb.append(substring);
            }
            for(k=p;k>=1;k--)
            {
               sb.append(" ");
            }
            for(l=0;l<=i;l++)
            {
                substring=str.substring(l,l+1);
                lifo.push(substring);
            }
            while(!lifo.isEmpty())
             {
              sb.append(lifo.pop().toString());
            }
            p=p+2;
          sb.append("\n");
        }
        String s=sb.toString();
        txtresult.setText(s);
                    }
                };
                  JButton btnconvert=new JButton("Convert");
                btnconvert.addActionListener(al);
                pnlTemp.add(btnconvert);
                Border border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
                pnlTemp.setBorder(border);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                frame.setContentPane(pnlLayout);
               frame.setSize(800,800);
               frame.setResizable(false);
               frame.setVisible(true);
        }
        void newJFrame3()
        {
           JFrame frame=new JFrame("PYRAMID");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel pnlLayout=new JPanel();
                ((FlowLayout)pnlLayout.getLayout()).setAlignment(FlowLayout.LEFT);
                JPanel pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("ENTER YOUR NAME"));
                final JTextField txtLetter=new JTextField(20);
                txtLetter.setToolTipText("Enter english word");
                pnlTemp.add(txtLetter);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ((FlowLayout)pnlTemp.getLayout()).setAlignment(FlowLayout.LEFT);
                pnlTemp.add(new JLabel("RESULT"));
                final JTextArea txtresult=new JTextArea(30,40);
                txtresult.setToolTipText("Don't enter anything in this field");
                pnlTemp.add(txtresult);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                ActionListener al;
                al=new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent ae)
                    {
        Stack lifo=new Stack();
       int i,j,k,p,q,r;
       String nm=txtLetter.getText();
       p=nm.length();
       txtresult.setFont(new Font("Monospaced",Font.BOLD,16));
       r=1;
       String substring;
       StringBuffer sb=new StringBuffer();
       for(i=0;i<nm.length();i++)
       {
           for(j=0;j<=i;j++)
           {
               substring=nm.substring(j,j+1);
              lifo.push(substring);
            }
            for(k=1;k<=p;k++)
            {
                sb.append(" ");
            }
             while(!lifo.isEmpty())
        {
            sb.append(lifo.pop().toString());
        }
        if(i>0)
          {
              for(q=1;q<r;q++)
             { 
                 substring =nm.substring(q,q+1);
                sb.append(substring);
             }
          }
            sb.append("\n");
            p--;
            r++;
        }
        String s=sb.toString();
        txtresult.setText(s);
         }
        };
         
       JButton btnconvert=new JButton("Convert");
                btnconvert.addActionListener(al);
                pnlTemp.add(btnconvert);
                Border border=BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
                pnlTemp.setBorder(border);
                pnlLayout.add(pnlTemp);
                pnlTemp=new JPanel();
                frame.setContentPane(pnlLayout);
               frame.setSize(800,800);
               frame.setResizable(false);
               frame.setVisible(true);
    }
    void AboutFrame()
    {
        JFrame frame=new JFrame("ABOUT");
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
         JPanel pnlLayout=new JPanel();
         pnlLayout.setLayout(new GridLayout(5,2));
         JPanel  pnlcode=new JPanel();
         ((FlowLayout)pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
         pnlcode.add(new JLabel("DESIGNER APPLICATION vs 1.0"));
         pnlLayout.add(pnlcode); 
         pnlcode=new JPanel();
         ((FlowLayout)pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
         pnlcode.add(new JLabel("ABOUT US"));
         pnlLayout.add(pnlcode);
         pnlcode=new JPanel();
           ((FlowLayout)pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
          JLabel label=new JLabel("Designer Application offers creative styles to design your name");
           label.setFont(new Font("Monospaced",Font.BOLD,16));
           pnlcode.add(label);
         pnlLayout.add(pnlcode);
         pnlcode=new JPanel();
          
        ((FlowLayout) pnlcode.getLayout()).setAlignment(FlowLayout.CENTER);
          label=new JLabel("COPYRIGHT: ATISHAY JAIN");
            label.setFont(new Font("Monospaced",Font.BOLD,16));
            pnlcode.add(label);
         pnlLayout.add(pnlcode);
         pnlcode=new JPanel();
         pnlLayout.add(pnlcode);
    frame.setContentPane(pnlLayout);
    frame.setSize(700,500);
    frame.setResizable(false);
    frame.setVisible(true);
       
    }
    public static void main(String[] args)
    {
        Runnable r=new Runnable()
        {
            @Override
            public void run()
            {
                new pat1("DESIGNER APPLICATION");
            }
        };
        EventQueue.invokeLater(r);
    }
}
