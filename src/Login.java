import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Login extends JPanel {
    private JButton login;
    private JButton signUp;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextArea text;
    private JTextArea textOr;
    private JButton title;
    Color siennaColor = new Color( 255
    		,153
    		 ,051);
    public Login() {
        setBounds(750, 200, 400, 410);
        
        setBackground(Color.WHITE);
        setLayout(null); // 절대 위치 지정
        

        // 
        usernameField = createTextField("  전화번호, 사용자 이름 또는 이메일",200-150, 210-100+10, 300, 50);
        passwordField = createPasswordField("                    ",200-150, 260-100+10, 300, 50);
        // 텍스트 상자
        usernameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameField.getText().equals("  전화번호, 사용자 이름 또는 이메일")) {
                    usernameField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText("  전화번호, 사용자 이름 또는 이메일");
                }
            }
        });
        // 비밀번호
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passwordField.getText().equals("                    ")) {
                   passwordField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passwordField.getText().isEmpty()) {
                   passwordField.setText("                    ");
                } 
            }
        });
        
        //버튼
        login = createButton("로그인", 200-150, 330-100+10, 300, 40);
        login.setBackground(siennaColor);
        login.setContentAreaFilled(true);
        text = createTextArea("계정이 없으신가요",250-150, 425-100+10, 100, 50);
        signUp = createButton("회원가입", 350-140, 420-100+10, 100, 30);
        title = createimgButton("images/Petdabang.jpg", 200-115, 25+10, 230, 70);
        textOr = createTextArea("  또는",330-150, 390-100+10, 40, 30);
        

        this.add(usernameField);
        this.add(passwordField);
        this.add(textOr);
        this.add(text);
        this.add(login);
        this.add(signUp);
        this.add(title);
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                   Menu menu = new Menu();
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Login.this);
                    menu.setVisible(true);
                    frame.dispose();
                    frame.setContentPane(menu);
                    frame.revalidate();
                    frame.repaint();
                
            }
        });
        
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Menu menu = new Menu();
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Login.this);
                menu.setVisible(true);
                frame.dispose();
                frame.setContentPane(menu);
                frame.revalidate();
                frame.repaint();
                
              
            }
            
        });
        
        
        
        
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
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setFocusPainted(true);
      
        return button;
    }
    private JButton createimgButton(String imagePath, int x, int y, int width, int height) {
        JButton button = new JButton(new ImageIcon(imagePath));
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        return button;
    }

    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        int topX = 0;
        int topY =0;
        int bottomX = 399;
        int bottomY = 409;

        g.drawLine(topX, topY, topX, bottomY); // 왼쪽 세로선
        g.drawLine(topX, topY, bottomX, topY); // 위 가로선

        g.drawLine(topX+50, bottomY-100, bottomX-50, bottomY-100);
        
        
        g.drawLine(bottomX, topY, bottomX, bottomY); // 오른쪽 세로선
        g.drawLine(topX, bottomY, bottomX, bottomY); // 아래 가로선
    }
}