package com.lzw.login;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoginPanel extends JPanel{
	public int width;
	public int heght;
	private Image image;
	public LoginPanel(){
		ImageIcon icon = new ImageIcon("images/login.jpg");
		image = icon.getImage();
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
			g.drawImage(image, width, heght, this);
	}
}
