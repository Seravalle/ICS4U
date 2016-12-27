package seravalle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * 
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener {

	int mouseX = 0;
	int mouseY = 0;

	int width = 1375;
	int height = 700;
	

	/**
	 * The number of balls on the screen.
	 */
	int numBalls = 20;
/**
 * number of lives 
 */
	int lives = 3;

	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 10;
	/**
	 * An array of balls.
	 */
	ArrayList<FlashingBall> ball = new ArrayList<FlashingBall>();

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();

	}

	public GamePanel() {
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);

		for (int i = 0; i < numBalls; i++) {
			ball.add(new FlashingBall(1000, 50, 0, width, 0, height));
			ball.get(i).setXSpeed(Math.random() * 16 - 8);
			ball.get(i).setYSpeed(Math.random() * 16 - 8);
			ball.get(i).setColor(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}

		addMouseMotionListener(this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		

		while (true) {
		
				this.requestFocus();
				numLives(getGraphics());

				for (int i = 0; i < ball.size(); i++) {
					if (hit(ball.get(i))) {
						lives--;
						for (i = 0; i < ball.size(); i++) {
							ball.get(i).stopThread();
							numLives(getGraphics());
						}

						this.setBackground(Color.RED);
						addBall();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for (i = 0; i < ball.size(); i++) {
							ball.get(i).startThread();
							numLives(getGraphics());
						}

						this.setBackground(Color.WHITE);
					}
				}

				repaint();
				try {
					Thread.sleep(pauseDuration);
				} catch (InterruptedException e) {
				}
			}
		}
	

	/**
	 * Checks if the ball and the mouse hit 
	 * @param ball
	 * @return
	 */
	public boolean hit(FlashingBall ball) {
		int radius = ball.getRadius();
		double xDistance = mouseX - ball.getX();
		double yDistance = mouseY - ball.getY();
		double hyp = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));

		return hyp <= radius;
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball.get(i).draw(g);
		}

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

		mouseX = arg0.getX();
		mouseY = arg0.getY();
		repaint();
	}

	/**
	 * Stops all the balls 
	 * @param g
	 */
	public void gameOver(Graphics g) {
		g.setColor(Color.BLACK);
		
		g.setFont(new Font("New Times Roman", 100, 100));
		g.drawString("Game Over", 500, 500);
		this.setBackground(Color.RED);
		for (int i = 0; i < ball.size(); i++) {
			ball.get(i).stopThread();

		}
		
	}


/**
 * displays the number of lives and calls game over when the lives are at zero
 * @param g
 */
	public void numLives(Graphics g) {
		if (lives > 0) {
			g.setColor(Color.BLACK);
			g.drawString("Lives:", 100, 100);
			g.setFont(new Font("New Times Roman", 50 , 50));
			g.drawString(Integer.toString(lives), 250, 100);
		} else {
			gameOver(getGraphics());


		}

	}
/**
 * adds 2 new balls
 */
	public void addBall() {
		numBalls+=2;
		for (int i = 0; i < numBalls; i++) {
			ball.add(new FlashingBall(1000, 50, 0, width, 0, height));
			ball.get(i).setXSpeed(Math.random() * 16 - 8);
			ball.get(i).setYSpeed(Math.random() * 16 - 8);
			ball.get(i).setColor(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}
	}
}
