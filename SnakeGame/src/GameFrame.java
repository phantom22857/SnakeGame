import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {
    public Snake snake;

    GameFrame() {
        snake = new Snake();
        this.add(snake);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        if (!snake.running) {
            snake.gameOver(getGraphics());
            close();
            new AfterGameOver();
        }
    }
        public void close() {
            WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        }
    }

