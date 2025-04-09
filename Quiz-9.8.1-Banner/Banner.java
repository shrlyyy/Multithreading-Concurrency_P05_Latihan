import javax.swing.*;
import java.awt.*;

public class Banner extends JFrame {
    private JLabel label;
    private String text;

    public Banner(String text) {
        this.text = text;

        label = new JLabel(text);
        label.setFont(new Font("Georgia", Font.ITALIC, 25));
        label.setForeground(new Color(130, 140, 81));

        JPanel panel = new JPanel();
        panel.setBackground(new Color(245, 245, 220));
        panel.add(label);

        add(panel);
        setSize(300, 100);
        setTitle("Banner-Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        new Thread(new BannerThread()).start();
    }

    private class BannerThread implements Runnable {
        public void run() {
            while (true) {
                try {
                    label.setText(text);
                    Thread.sleep(1000);
                    text = text.substring(1) + text.charAt(0); // Rotate the text
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Banner("Sherly Agnesya :) ");
    }
}