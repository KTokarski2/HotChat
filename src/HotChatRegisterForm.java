import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotChatRegisterForm extends JFrame implements ActionListener {

    //Icon
    ImageIcon icon = new ImageIcon("Assets/HotChatIcon.png");

    //ComboBoxArrays
    String [] gender = {"Male","Female","Agender","Androgyne",
                         "Androgynous", "Bigender", "Cis"     };
    String [] country = {"Poland", "Germany", "USA", "Russia", "China"};

    //FrameComponents
    JLabel loginLabel = new JLabel("Login");
    JLabel passwordLabel = new JLabel("Password");
    JLabel emailLabel = new JLabel("Email");
    JLabel genderLabel = new JLabel("Gender");
    JLabel cityLabel = new JLabel("City");
    JLabel countryLabel = new JLabel("Country");
    JTextField loginTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JTextField emailTextField = new JTextField();
    JTextField cityTextField = new JTextField();
    JComboBox genderComboBox = new JComboBox(gender);
    JComboBox countryComboBox = new JComboBox(country);

    //Container
    Container container = getContentPane();


    public HotChatRegisterForm (int width, int height, String title) {

        this.setSize(width,height);
        this.setTitle(title);
        this.setIconImage(icon.getImage());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        setLayoutManager();
        addComponentsToFrame();
        setLocationAndSize();
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        loginLabel.setBounds(20,20,40,70);
        passwordLabel.setBounds(20,70,80,70);
        emailLabel.setBounds(20,120,100,70);
        genderLabel.setBounds(20,170,140,70);
        cityLabel.setBounds(20,220,100,70);
        countryLabel.setBounds(20,270,100,70);

    }

    public void addComponentsToFrame() {
        container.add(loginLabel);
        container.add(passwordLabel);
        container.add(emailLabel);
        container.add(genderLabel);
        container.add(cityLabel);
        container.add(countryLabel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
