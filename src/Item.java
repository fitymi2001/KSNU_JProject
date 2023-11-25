import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Item extends JPanel {
    private JButton item1;
    private JButton[] itemButtons;
    private final int SMALL_WIDTH = 120;
    private final int SMALL_HEIGHT = 120;
    private final int LARGE_WIDTH = 160;
    private final int LARGE_HEIGHT = 160;

    public Item() {
        setBackground(Color.white);
        setLayout(null);

        item1 = createimgButton("images/hot item.png", 130, 10, 400, 120);
        add(item1);

        // 9개의 이미지 버튼 생성
        itemButtons = new JButton[9];

        int startX = 75;
        int startY = 200;
        int buttonSpacing = 70;
        int buttonIndex = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                itemButtons[i * 3 + j] = createimgButton("images/item" + buttonIndex + ".jpg",
                        startX + j * (SMALL_WIDTH + buttonSpacing),
                        startY + i * (SMALL_HEIGHT + buttonSpacing),
                        SMALL_WIDTH, SMALL_HEIGHT);
                add(itemButtons[i * 3 + j]);

                int finalButtonIndex = buttonIndex;
                // itemButtons에 ActionListener 추가
                itemButtons[i * 3 + j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // 각 버튼에 다른 링크 지정
                        switch (finalButtonIndex) {
                            case 1:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/150008?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            case 2:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/149735?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            case 3:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/149819?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            case 4:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/38846?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=Y");
                                break;
                            case 5:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/28364?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=Y");
                                break;
                            case 6:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/38878?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=Y");
                                break;
                            case 7:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/36620?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            case 8:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/36625?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            case 9:
                                openWebpage("https://m.pet-friends.co.kr/product/detail/36619?GIF+%EC%97%AC%EB%B6%80=N&fromAd=N&listUiType=&rccode=&%EB%AC%B6%EC%9D%8C%EC%83%81%ED%92%88+%EC%97%AC%EB%B6%80=N");
                                break;
                            	
                            default:
                                break;
                        }
                    }
                });

                // itemButtons에 마우스 이벤트 추가
                itemButtons[i * 3 + j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        // 마우스를 가져다 대었을 때의 효과 (이미지 커지게)
                        itemButtons[finalButtonIndex - 1].setIcon(new ImageIcon("images/item" + finalButtonIndex + ".jpg"));
                        itemButtons[finalButtonIndex - 1].setSize(LARGE_WIDTH, LARGE_HEIGHT);
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        // 마우스가 벗어났을 때의 효과 (이미지 크기 원래대로)
                        itemButtons[finalButtonIndex - 1].setIcon(new ImageIcon("images/item" + finalButtonIndex + ".jpg"));
                        itemButtons[finalButtonIndex - 1].setSize(SMALL_WIDTH, SMALL_HEIGHT);
                    }
                });

                buttonIndex++;
            }
        }
    }

    private JButton createimgButton(String imagePath, int x, int y, int width, int height) {
        JButton button = new JButton(new ImageIcon(imagePath));
        button.setBounds(x, y, width, height);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        return button;
    }

    // 특정 URL로 이동하는 메서드
    private void openWebpage(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
