import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
public class AfterGameOver extends JFrame implements ActionListener{

    JPanel title_panel;
    JButton goToMenu;
    JButton playAgain;
    Snake snake;
    AfterGameOver(){
        JLabel text_field = new JLabel();
        text_field.setBackground(Color.GREEN);
        text_field.setFont(new Font("Times New Roman",Font.BOLD,19));
        text_field.setText("What do you want to do next?");
        text_field.setHorizontalAlignment(JLabel.CENTER);
        text_field.setOpaque(true);
        text_field.setVisible(true);
        
        title_panel = new JPanel();
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,250,50);
        title_panel.add(text_field);
        
        goToMenu = new JButton();
        goToMenu.setBounds(75,125,100,25);
        goToMenu.setFont(new Font("Arial",Font.BOLD,12));
        goToMenu.setText("Menu");
        goToMenu.setBackground(Color.RED);
        goToMenu.addActionListener(this);
        goToMenu.setOpaque(true);
        goToMenu.setVisible(true);
        
        playAgain = new JButton();
        playAgain.setBounds(75,75,100,25);
        playAgain.setFont(new Font("Arial",Font.BOLD,12));
        playAgain.setText("Play Again");
        playAgain.setBackground(Color.GREEN);
        playAgain.addActionListener(this);
        playAgain.setOpaque(true);
        playAgain.setVisible(true);
        


        this.setTitle("What to do?");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(250,250);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.add(playAgain);
        this.add(goToMenu);
        this.add(title_panel);
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==playAgain){
            close();
            new GameFrame();

        }
        else if (e.getSource()==goToMenu){
            close();
            new Menu();
        }
    }
}
