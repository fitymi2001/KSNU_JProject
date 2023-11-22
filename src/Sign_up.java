import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Sign_up extends JPanel {
    private JTextField usernameField, userNikenameField, emailField, userIdField;
    private JPasswordField passwordField;
    private JButton signUpButton;
    private JButton login;
    private JButton home;
    private JTextArea text,textOr;

    Color siennaColor = new Color(255, 100, 051);
    int x = 100;
    public Sign_up() {
        setBounds(100, 100, 400, 410);
        setBackground(Color.WHITE);
        setLayout(null); // 절대 위치 지정

        home = createimgButton("images/Petdabang.jpg", x, 75, 300, 70);
        text = createTextArea(" 반려동물의 사진과 동영상을 보려면 가입하세요.",x, 170, 300, 25);
        login = createButton("로그인 화면으로 돌아가기 ", x, 200, 300, 40);
        login.setBackground(siennaColor);
        login.setContentAreaFilled(true);
        textOr = createTextArea("  또는",x+130, 265, 40, 30);

        userIdField = createTextField("  전화번호, 사용자 이름 또는 이메일", x, 300, 300, 50);
        usernameField = createTextField("  성명", x, 360, 300, 50);
        userNikenameField = createTextField(" 사용자 이름 ", x, 420, 300, 50);
        passwordField = createPasswordField("      ", x, 480, 300, 50);
        signUpButton = createButton("가입", x, 540, 300, 40);
        signUpButton.setBackground(siennaColor);
        signUpButton.setContentAreaFilled(true);
        
        text.setFont(new Font("맑은고딕", Font.ITALIC, 13)); // 폰트 크기 변경
        text.setForeground(Color.GRAY); // 텍스트 색상 변경
        add(usernameField);
        add(userIdField);
        add(passwordField);
        add(userNikenameField);
        add(textOr);
        add(signUpButton);
        add(home);
        add(text);
        add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main menu = new Main();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Sign_up.this);
                menu.setVisible(true);
                frame.dispose();
                frame.add(menu);
               
                
            }
            
        });
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signUp();
            }
        });
    }

    private JTextField createTextField(String text, int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x, y, width, height);
        textField.setText(text);
        return textField;
    }

    private JTextArea createTextArea(String text1, int x, int y, int width, int height) {
        JTextArea area = new JTextArea();
        area.setBounds(x, y, width, height);
        area.setText(text1);
        return area;
    }

    private JPasswordField createPasswordField(String text, int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x, y, width, height);
        passwordField.setText(text);
        return passwordField;
    }

    private JButton createimgButton(String imagePath, int x, int y, int width, int height) {
        JButton button = new JButton(new ImageIcon(imagePath));
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        return button;
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setFocusPainted(true);
      
        return button;
    }

    private void signUp() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String phoneNumber = userNikenameField.getText();
        String email = emailField.getText();

        // 여기에서 회원가입 처리를 수행하거나, 필요한 경우 데이터를 출력합니다.

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("회원가입");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Sign_up());
        frame.pack();
        frame.setSize(500, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        int topX = 50;
        int topY =50;
        int bottomX = 450;
        int bottomY = 600;

        g.drawLine(topX+50, 275, bottomX-50, 275);
        g.drawLine(topX, topY, topX, bottomY); // 왼쪽 세로선
        g.drawLine(topX, topY, bottomX, topY); // 위 가로선
        
        g.drawLine(bottomX, topY, bottomX, bottomY); // 오른쪽 세로선
        g.drawLine(topX, bottomY, bottomX, bottomY); // 아래 가로선
    }
}
