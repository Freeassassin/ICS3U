import java.awt.EventQueue;

import javax.swing.JFrame;

public class MohammadzadehF_RPSGame {

	private JFrame RPSGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MohammadzadehF_RPSGame window = new MohammadzadehF_RPSGame();
					window.RPSGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MohammadzadehF_RPSGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		RPSGame = new JFrame();
		RPSGame.setBounds(100, 100, 450, 300);
		RPSGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RPSGame.getContentPane().setLayout(null);
	}

}
