import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherApplicationGUI extends JFrame {

    public WeatherApplicationGUI() {
        super("Weather App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 650);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        addGuiComponents();
    }


    private void addGuiComponents(){
        JTextField searchField = new JTextField();
        searchField.setBounds(15,15,351,45);
        searchField.setFont(new Font("Dialog",Font.PLAIN,24));
        add(searchField);

        JButton searchButton = new JButton(loadImage("src/main/resources/search.png"));
        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375,13,47,45);
        add(searchButton);
    }

    private ImageIcon loadImage(String resourcePath){
        try{
            BufferedImage image = ImageIO.read(new File(resourcePath));

            return new ImageIcon(image);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
