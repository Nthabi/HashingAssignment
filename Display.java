import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

  
public class Display 
{
   private ImageIcon picture;
   private JLabel searchLabel;
   private JFrame box;
   private JButton searchButton;
   private JPanel panelSearcButton;
   private JTextField text;
   HashTable hashSch =new HashTable(); //instance of the class
   BufferedImage img;
   
   public void CreateGui()
   {
      //Color of plane and text
      Color color = new Color(4,0,0);
            
      box = new JFrame("Picture Display");
      box.setVisible(true);
      box.setSize(600,600);
      box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      box.setLayout(new GridLayout(3,1));
      
      
      
      //heading panel
      JPanel panelHeading = new JPanel();
      panelHeading.setSize(600,200);
      Font headingFont = new Font("TimesRoman", Font.BOLD+Font.ITALIC, 120);
      JLabel labHeading = new JLabel("#InstaVibes");
      labHeading.setFont(headingFont);
      panelHeading.setBackground(Color.PINK);
      panelHeading.add(labHeading);
      box.add(panelHeading);
      
      //TextField plane
      JPanel panelEnter = new JPanel();
      panelEnter.setBackground(Color.WHITE);
      //layout of textField plane
      CardLayout layout = new CardLayout();
      layout.setHgap(65);
      layout.setVgap(65);
      panelEnter.setSize(600,200);
      panelEnter.setLayout(layout);
      JPanel buttonPanel = new JPanel(new FlowLayout());
      Font buttonFont = new Font("Tahoma", Font.BOLD+Font.ITALIC, 20);    
      JPanel textBoxPanel = new JPanel(new FlowLayout());
      textBoxPanel.setBackground(Color.GRAY);
      textBoxPanel.setSize(20,60);
      JLabel label =new JLabel("Enter Name of Picture:");
      label.setFont(buttonFont);
      textBoxPanel.add(label);
      text = new JTextField(10);
      textBoxPanel.add(text);
      panelEnter.add("Text", textBoxPanel);
      box.add(panelEnter);
      
      
      //Panel button
      panelSearcButton = new JPanel();
      panelSearcButton.setBackground(Color.WHITE);
      searchButton = new JButton("Search");
      searchButton.setFont(buttonFont);
      searchButton.setBackground(Color.lightGray);
      panelSearcButton.setSize(600,200);
      panelSearcButton.add(searchButton);
      box.add(panelSearcButton);
      searchButton.addActionListener( new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
   {
         
         String name = text.getText().trim()+".jpg";
         text.setText("");
         hashSch.putKey();
         Hashtable table = hashSch.hash; //call to the Hashtable instance variable
         String comparison = hashSch.searchPic(name,table);
         if(comparison.equals(name))
         {
            JFrame picFrame = new JFrame();
            picFrame.setSize(100,100);
            try {
            img = ImageIO.read(new File(name));
            } catch (IOException et) {
               System.out.println("ya");
            }
            JLabel labPic =new JLabel(new ImageIcon(img));
            
            picFrame.add(labPic);
            picFrame.setVisible(true);
            
         }
   }
      });
      
      
   }
   
    
   public static void main(String[] args)
   {
      Display gui = new Display();
      gui.CreateGui();
   }    
   
}