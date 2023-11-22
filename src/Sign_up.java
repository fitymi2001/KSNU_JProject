import javax.swing.*;
import java.awt.*;

public class Sign_up extends JPanel {
    private JButton sign;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField PhonenumberField;
    private JTextField emailField;
    private JTextArea title;
    
    public Sign_up() {
        setBounds(76, 81, 800 - 76, (600 * 8 / 5) - 81);
        setBackground(Color.WHITE);
        setLayout(null); // 절대 위치 지정

        //입력 박스
        usernameField = createTextField("성명",250, 210, 200, 30);
        PhonenumberField = createTextField("전화번호",250, 290, 200, 30);
        emailField = createTextField("이메일 주소",250, 330, 200, 30);
        passwordField = createPasswordField("                       ",250, 250, 200, 30);
        
        // 텍스트 상자
        title = createTextArea("Sign Up",265, 130, 180, 100);
        title.setFont(new java.awt.Font("휴먼편지체", 1, 48)); // NOI18N
        //버튼
        sign = createButton("가입", 220, 390, 270, 40);
        
        
        //this.add(emailField);
        this.add(usernameField);
        this.add(passwordField);
        this.add(emailField);
        this.add(PhonenumberField);
        this.add(title);
        this.add(sign);
        
    }

    private JTextField createTextField(String text, int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        //textField.setBorder(new RoundedBorder(Color.BLACK, 10, 10));
        textField.setText(text);
        return textField;
    }

    private JPasswordField createPasswordField(String text, int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, width, height);
        passwordField.setText(text);
        return passwordField;
    }

    private JTextArea createTextArea(String text1,int x, int y, int width, int height) {
        JTextArea area = new JTextArea();
        area.setBounds(x, y, width, height);
        area.setText(text1);
        return area;
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        //button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        return button;
    }

    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        int topX = 150;
        int topY = 100;
        int bottomX = 550;
        int bottomY = 450;

        g.drawLine(topX, topY, topX, bottomY); // 왼쪽 세로선
        g.drawLine(topX, topY, bottomX, topY); // 위 가로선
        g.drawLine(bottomX, topY, bottomX, bottomY); // 오른쪽 세로선
        g.drawLine(topX, bottomY, bottomX, bottomY); // 아래 가로선
    }
}