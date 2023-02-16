import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;




public class Menu extends JFrame implements ActionListener {
   JButton button;
   JButton button1;
   ImageIcon image;
   JLabel background;

    Menu() {

        image = new ImageIcon("Snake_can_be_completed.gif");
        background = new JLabel("", image, JLabel.CENTER);
        background.setVisible(true);
        background.setBounds(0,0,299,200);


        JLabel text_field = new JLabel();
        text_field.setBackground(Color.GREEN);
        text_field.setFont(new Font("Times New Roman",Font.BOLD,20));
        text_field.setText("Snake");
        text_field.setHorizontalAlignment(JLabel.CENTER);
        text_field.setOpaque(true);
        text_field.setVisible(true);



        JPanel title_panel = new JPanel();
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,299,50);
        title_panel.add(text_field);



        button = new JButton();
        button.setBounds(25,75,100,25);
        button.setFont(new Font("Arial",Font.BOLD,15));
        button.setText("Play");
        button.setBackground(Color.GREEN);
        button.addActionListener(this);
        button.setOpaque(true);
        button.setVisible(true);


        button1 = new JButton();
        button1.setBounds(150,75,100,25);
        button1.setFont(new Font("Arial",Font.BOLD,15));
        button1.setText("Exit");
        button1.setBackground(Color.RED);
        button1.addActionListener(this);
        button1.setOpaque(true);

        JPanel UpBound = new JPanel();
        UpBound.setLayout(new BorderLayout());
        UpBound.setBounds(0,100,299,200);
        UpBound.add(background);

        this.setTitle("Game Menu");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(299,299);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        this.add(UpBound);
        this.add(title_panel);
        this.add(button1);
        this.add(button);


    }

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

   @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            close();
        }
        if(e.getSource() == button){
            close();
            new GameFrame();

        }
    }

}
