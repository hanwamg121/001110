import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
import javax.swing.JFrame;
 
 
/**
 * 全屏的窗口
 * @author EX-QINCIDONG001
 *
 */
public class reader {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		fullWindow1();
		//fullWindow2();
	}
	
	/**
	 * 全屏窗口，这个还是可以看到标题栏。
	 */
	public static void fullWindow2() {
		final JFrame frame = new JFrame();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(dim);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseAdapter(){
			// 双击退出
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					frame.dispose();
				}
			}
		});
	}
	/**
	 * 全屏窗口，无标题栏。
	 */
	public static void fullWindow1() {
		final JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.getGraphicsConfiguration().getDevice().setFullScreenWindow(frame);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new MouseAdapter(){
			// 双击退出
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					frame.dispose();
				}
			}
		});
	}
}

