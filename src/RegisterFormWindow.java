import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class RegisterFormWindow extends JFrame implements ActionListener {

    String usersFile = "Users.txt";

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
    JButton registerButton = new JButton("Register");
    JButton resetButton = new JButton("Reset");

    //Container
    Container container = getContentPane();


    public RegisterFormWindow(int width, int height, String title) {

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
        loginTextField.setBounds(180,43,165,23);
        passwordTextField.setBounds(180,93,165,23);
        emailTextField.setBounds(180,143,165,23);
        genderComboBox.setBounds(180,193,165,23);
        cityTextField.setBounds(180,243,165,23);
        countryComboBox.setBounds(180,293,165,23);
        registerButton.setBounds(70,400,100,35);
        resetButton.setBounds(200,400,100,35);

    }

    public void addComponentsToFrame() {
        container.add(loginLabel);
        container.add(passwordLabel);
        container.add(emailLabel);
        container.add(genderLabel);
        container.add(cityLabel);
        container.add(countryLabel);
        container.add(loginTextField);
        container.add(passwordTextField);
        container.add(emailTextField);
        container.add(genderComboBox);
        container.add(cityTextField);
        container.add(countryComboBox);
        container.add(registerButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        resetButton.addActionListener(this);
        registerButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerButton) {
            
        }

    }
}
