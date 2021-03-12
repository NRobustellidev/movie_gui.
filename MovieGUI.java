// GUI based version of the MovieQuote application from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovieGUI extends JFrame implements ActionListener
{
	
	// Instance variables for this class
	Font aFont = new Font("Verdana", Font.BOLD, 24);
	JLabel quote = new JLabel("Hello there! General Kenobi!");
	JLabel movie = new JLabel("");
	JButton button = new JButton("Show Movie");
	
	// Create a custom constructor for this class
	public MovieGUI()
	{
		super("Movie Quote App");
		setSize(550, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));
		setVisible(true);
		quote.setFont(aFont);
		movie.setFont(aFont);
		button.setBackground(Color.RED);
		add(quote);
		add(button);
		add(movie);
		button.addActionListener(this);
	}
	
	// Event handling method
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		movie.setText("Star Wars: Revenge of the Sith (2005)");
	}
	
	public static void main(String[] args)
	{
		MovieGUI aFrame = new MovieGUI();
	}
}