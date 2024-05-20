package RequestionForm;
import java.awt.*;
import javax.swing.*;

public class GUIInterface extends JFrame{
	GUIInterface(){
		setTitle("RequestionFormGUI");
		
		// 닫기 버튼 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		
		GridLayout layout = new GridLayout(5, 1);
		c.setLayout(layout);
		
		JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel row3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel row4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		// 컴포넌트 생성
		//skinType
		JLabel name1 = new JLabel("피부타입");
		JRadioButton light = new JRadioButton("라이트");
		JRadioButton bright = new JRadioButton("브라이트");
		JRadioButton mute = new JRadioButton("뮤트");
		JRadioButton deep = new JRadioButton("딥");
		
		ButtonGroup skinType = new ButtonGroup();
		
		skinType.add(light);
		skinType.add(bright);
		skinType.add(mute);
		skinType.add(deep);
		
		row1.add(name1);
		row1.add(light);
		row1.add(bright);
		row1.add(mute);
		row1.add(deep);

		
		//height & weight
		JLabel name2 = new JLabel("키");
		JTextField height = new JTextField("		");
		JLabel name3 = new JLabel("몸무게");
		JTextField weight = new JTextField("		");
		
		row2.add(name2);
		row2.add(height);
		row2.add(name3);
		row2.add(weight);
		
		
		c.add(row1);
		c.add(row2);
		
		
		//favorFit
		JLabel name4 = new JLabel("선호하는 핏");
		JRadioButton nomal = new JRadioButton("노멀핏");
		JRadioButton over = new JRadioButton("오버핏");
		JRadioButton slim = new JRadioButton("슬림핏");
		
		ButtonGroup favorFit = new ButtonGroup();
		
		favorFit.add(nomal);
		favorFit.add(over);
		favorFit.add(slim);
		
		row3.add(name4);
		row3.add(nomal);
		row3.add(over);
		row3.add(slim);
		
		
		//favorColor
		JLabel name5 = new JLabel("선호하는 컬러");
		JRadioButton red = new JRadioButton("빨간색");
		JRadioButton blue = new JRadioButton("파란색");
		JRadioButton green = new JRadioButton("초록색");
		JRadioButton white = new JRadioButton("흰색");
		JRadioButton black = new JRadioButton("검은색");
		JRadioButton orange = new JRadioButton("주황색");
				
		ButtonGroup favorColor = new ButtonGroup();
				
		favorColor.add(red);
		favorColor.add(blue);
		favorColor.add(green);
		favorColor.add(white);
		favorColor.add(black);
		favorColor.add(orange);
				
		row4.add(name5);
		row4.add(red);
		row4.add(blue);
		row4.add(green);
		row4.add(white);
		row4.add(black);
		row4.add(orange);
		
		
		// 제출 버튼
		JButton request = new JButton("코디 제안 요청하기");
		
		c.add(row1);
		c.add(row2);
		c.add(row3);
		c.add(row4);
		c.add(request);
		
		setSize(600, 400);
		
		setVisible(true);
	}
}