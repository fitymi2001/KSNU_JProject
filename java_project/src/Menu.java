import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Menu extends JFrame {
    private JButton home;
    private JButton home1;
    private JButton search;
    private JButton search1;
    private JButton hospital;
    private JButton hospital1;
    private JButton profile;
    private JButton profile1;
    private JButton logout;
    private JButton logout1;
    private JButton item;
    private JButton item1;

    Menu() {
        this.setResizable(false);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(800,  600 * 8 / 5));
        this.setSize(800, 600 * 8 / 5);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        panel.setLayout(null);

        
        //Login login = new Login();
        //panel.add(login);
        
        
        //newPanel.setBackground(Color.WHITE); // 배경색을 설정할 수 있습니다 (필요에 따라 사용자 정의 가능)
        //panel.add(newPanel);
        
        
        JButton logo = createButton("images/Petdabang.jpg", 250, 10, 298, 65);
        JButton logoB = createButton("images/LogoB_button1.png", 13, 110, 43,45);
        home = createButton("images/home_button1.png", 13, 230, 43, 30);
        home1 = createButton("images/home_button2.png", 13, 230, 43, 30);
        search = createButton("images/search_button1.png", 13, 310, 43, 30);
        search1 = createButton("images/search_button2.png", 13, 310, 43, 30);
        hospital = createButton("images/hospital_button1.png", 13, 390, 43, 40);
        hospital1 = createButton("images/hospital_button2.png", 13, 390, 43, 40);
        item = createButton("images/item_button1.png", 10, 470, 50, 50);
        item1 = createButton("images/item_button2.png", 10, 470, 50, 50);
        profile = createButton("images/profile_button1.png", 13, 700, 43, 50);
        profile1 = createButton("images/profile_button2.png", 13, 700, 43, 50);
        logout = createButton("images/logout_button1.png", 10, 790, 50, 50);
        logout1 = createButton("images/logout_button2.png", 10, 790, 50, 50);
        
        
        panel.add(logo);
        panel.add(logoB);
        panel.add(home);
        panel.add(search);
        panel.add(hospital);
        panel.add(item);
        panel.add(profile);
        panel.add(logout);

        this.add(panel, BorderLayout.CENTER);
        
        // home 버튼 클릭 이벤트 처리
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(home);
                panel.add(home1);
                panel.repaint();
            }
        });

        // home 버튼 마우스 이벤트 처리
        home.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                home.setIcon(new ImageIcon("images/home_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                home.setIcon(new ImageIcon("images/home_button1.png"));
            }
        });

        // search 버튼 클릭 이벤트 처리
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(search);
                panel.add(search1);
                panel.repaint();
            }
        });

        // search 버튼 마우스 이벤트 처리
        search.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                search.setIcon(new ImageIcon("images/search_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                search.setIcon(new ImageIcon("images/search_button1.png"));
            }
        });

        // hospital 버튼 클릭 이벤트 처리
        hospital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(hospital);
                panel.add(hospital1);
                panel.repaint();
            }
        });

        // hospital 버튼 마우스 이벤트 처리
        hospital.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hospital.setIcon(new ImageIcon("images/hospital_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hospital.setIcon(new ImageIcon("images/hospital_button1.png"));
            }
        });
        
     // profile 버튼 마우스 이벤트 처리
        profile.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                profile.setIcon(new ImageIcon("images/profile_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                profile.setIcon(new ImageIcon("images/profile_button1.png"));
            }
        });
        
     // logout 버튼 클릭 이벤트 처리
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(logout);
                panel.add(logout1);
                panel.repaint();
                // logout 버튼 클릭 이벤트를 처리할 코드를 추가하세요
            }
        });
        
     // logout 버튼 마우스 이벤트 처리
        logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logout.setIcon(new ImageIcon("images/logout_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logout.setIcon(new ImageIcon("images/logout_button1.png"));
            }
        });
        
        item.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(item);
                panel.add(item1);
                panel.repaint();
                // Add your code to handle the "item" button click event here
            }
        });
        
        item.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                item.setIcon(new ImageIcon("images/item_button2.png"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                item.setIcon(new ImageIcon("images/item_button1.png"));
            }
        });
        
     
        
    }

    private JButton createButton(String imagePath, int x, int y, int width, int height) {
        JButton button = new JButton(new ImageIcon(imagePath));
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        return button;
    }

    class MyPanel extends JPanel {
        MyPanel() {   
            setBackground(Color.WHITE);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(75, 80, 75, 600 * 8 / 5);
            g.setColor(Color.GRAY);
            g.drawLine(0, 80, 800, 80);
        }
    }
}