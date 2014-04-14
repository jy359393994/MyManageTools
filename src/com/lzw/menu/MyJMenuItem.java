package com.lzw.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

import com.lzw.ItemActionListener;

public class MyJMenuItem extends JMenuItem{
	private String mTitle;
	private String mIconPath;
	private MenuItemObserver mObserver;
	
	public MyJMenuItem(String title, String iconPath, MenuItemObserver observer)
	{
		mTitle = title;
		mIconPath = iconPath;
		mObserver = observer;
		
		ImageIcon icon = new ImageIcon(mIconPath);
		setIcon(icon);
		addActionListener(new ItemActionListener());
	}
	
	public interface MenuItemObserver
	{
		public void onClick(String title);
	}
	
	private class ItemActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (mObserver!=null)
			{
				mObserver.onClick(mTitle);
			}
		}
		
	}
}
