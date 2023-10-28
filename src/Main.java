import java.awt.Dimension;
//import javax.swing.JFrame;
import javax.swing.*;

public class Main {
   public static void main(String[] args) {
      JPanel panel = new JPanel();
      JFrame frame = new JFrame();
      
      //panel.add(new JLabel("Welcome thus lecture"));
      frame.add(panel);
      
      frame.setResizable(true); //크기 고정
      frame.setVisible(true);
      frame.setPreferredSize(new Dimension(560,547*8/5));
      frame.setSize(560,547*8/5); //창 크기
      frame.setLocationRelativeTo(null);  //화면 중앙
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 다른 프레임 초기화 및 구성 요소를 여기에 추가할 수 있습니다.
      
   }
}