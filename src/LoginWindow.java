import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame implements ActionListener {



    //testUser

    User testUser = new User("Chris","doopa", "example@exmp.com", "Male", "Warsaw","Poland");

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Icon
    ImageIcon icon = new ImageIcon("Assets/HotChatIcon.png");

    //Frame components
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userNameTextField = new JTextField();
    JPasswordField userPasswordTextField = new JPasswordField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JButton registerButton = new JButton("Register");

    //Container
    Container container = getContentPane();

    public LoginWindow(int width, int height, String title) {

        this.setSize(width,height);
        this.setTitle(title);
        this.setIconImage(icon.getImage());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();


    }



    public static void main(String [] args){
        Globals.loginWindow = new LoginWindow(370,600,"Welcome to HotChatApp!");
    }



    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        usernameLabel.setBounds(50, 150, 100,30);
        passwordLabel.setBounds(50,220,100,30);
        userNameTextField.setBounds(150,150,150,30);
        userPasswordTextField.setBounds(150,220,150,30);
        showPassword.setBounds(150,250,150,30);
        loginButton.setBounds(50,300,100,30);
        resetButton.setBounds(200,300,100,30);
        registerButton.setBounds(100,380,140,30);
    }

    public void addComponentsToContainer() {
        container.add(usernameLabel);
        container.add(passwordLabel);
        container.add(userNameTextField);
        container.add(userPasswordTextField);
        container.add(loginButton);
        container.add(showPassword);
        container.add(resetButton);
        container.add(registerButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        registerButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {

            String userText = userNameTextField.getText();
            String userPassword = userPasswordTextField.getText();


            if(userText.equalsIgnoreCase(testUser.getLogin()) && userPassword.equalsIgnoreCase(testUser.getPassword())) {
                JOptionPane.showMessageDialog(this,"Login Successful!");
            }else {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }


        }

        if (e.getSource() == resetButton) {
            userNameTextField.setText("");
            userPasswordTextField.setText("");
        }

        if(e.getSource() == showPassword) {
            if(showPassword.isSelected()) {
                userPasswordTextField.setEchoChar((char) 0);
            } else {
                userPasswordTextField.setEchoChar('*');
            }
        }

        if(e.getSource() == registerButton){
            Globals.registerFormWindow = new RegisterFormWindow(380,550,"Register to HotChat");
            Globals.loginWindow.dispose();
        }


    }
}
