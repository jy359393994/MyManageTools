package com.lzw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import com.lzw.menu.JbzlMenu;
import com.lzw.menu.JhglMenu;
import com.lzw.menu.KcglMenu;
import com.lzw.menu.XsglMenu;
import com.lzw.menu.XtwhMenu;
import com.lzw.menu.XxcxMenu;

public class ToolBar extends JToolBar{
	private MenuBar mMenuBar;
	private JLabel mJLabel;
	public ToolBar(MenuBar menubar,JLabel label){
		mMenuBar = menubar;
		mJLabel = label;
		init();
	}
	 private void init(){
		setFloatable(false);
		add(CreateItemButton(mMenuBar.getjhglMenu().getjhdItem())); 
		add(CreateItemButton(mMenuBar.getxsglMenu().getxsdItem())); 
		add(CreateItemButton(mMenuBar.getkcglMenu().getkcpdItem()));
		add(CreateItemButton(mMenuBar.getkcglMenu().getjgtzItem()));
		add(CreateItemButton(mMenuBar.getxxcxMenu().getspcxItem()));
		add(CreateItemButton(mMenuBar.getjbzlMenu().getspzlglItem()));
		add(CreateItemButton(mMenuBar.getjbzlMenu().getkhzlglItem()));
		add(CreateItemButton(mMenuBar.getjbzlMenu().getgyszlglItem()));
		add(CreateItemButton(mMenuBar.getxtwhMenu().getexitItem()));
	 }
	 
	 
	 private JButton CreateItemButton(final JMenuItem item){
		 JButton button = new JButton();
		 button.setText(item.getText());
		 button.setIcon(item.getIcon());
		 button.setFocusable(false);
		 button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				item.doClick();
			}
			 
		 });
		 return button;		 
	 }
}
