package 인터페이스추상클래스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 버튼처리부품 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == b1)
		System.out.println("버튼을 눌렀음.");
	}

}
