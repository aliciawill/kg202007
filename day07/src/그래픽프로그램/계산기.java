package �׷������α׷�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ���� {

	public static void main(String[] args) {
//		Ʋ���� ��ǰ �ʿ�
		JFrame f = new JFrame();
		f.setSize(470, 550);
//		��ư ��ǰ 1�� �ʿ�
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mul = new JButton("x");
		JButton div = new JButton("/");
//		��ġ ���ִ� ��ǰ �ʿ�
		FlowLayout flow = new FlowLayout();
//		���� Ű���ִ� ��ǰ �ʿ�
		Font font = new Font("�ü�", 1, 50);
//
//		����(����1, ����2, �̹��� �� ��) 3�� �� ��ǰ �ʿ�
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel("����1");
		JLabel l3 = new JLabel("����2");
		JLabel l4 = new JLabel("���>> ");
//		�Է¶� 2�� JTextField ��ǰ �ʿ�
		JTextField	t1 = new JTextField(5);
		JTextField	t2 = new JTextField(5);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(mul);
		f.add(div);
		f.add(l4);
		f.setLayout(flow);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		mul.setFont(font);
		div.setFont(font);
		l4.setFont(font);
		ImageIcon icon = new ImageIcon("cal.png");
		l1.setIcon(icon);
		//minus, mul, div button���� ��������.
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		plus.setBackground(Color.green);
		minus.setBackground(Color.green);
		mul.setBackground(Color.green);
		div.setBackground(Color.green);
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է�: t1, t2���� �Է��� �� ������ �´�.
				String data1 = t1.getText();//"200"
				String data2 = t2.getText();//"100"
				//ó��: ���ϱ� ó��
				int n1 = Integer.parseInt(data1);
				int n2 = Integer.parseInt(data2);
				int result = n1 + n2;
				//���: ����� ���
				//Integer.parseInt()
				//String result2 = String.valueOf(result);
				l4.setText(result + "");
				//JOptionPane.showMessageDialog(f, result);
			}
		});
		f.setVisible(true);
	}
}





