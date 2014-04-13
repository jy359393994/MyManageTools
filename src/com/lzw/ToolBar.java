package com.lzw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

import com.lzw.menu.JbzlMenu;
import com.lzw.menu.JhglMenu;
import com.lzw.menu.KcglMenu;
import com.lzw.menu.XsglMenu;
import com.lzw.menu.XtwhMenu;
import com.lzw.menu.XxcxMenu;

public class ToolBar extends JToolBar{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	public ToolBar(DesktopPane desktoppane,JLabel label){
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	 private void init(){
		 setFloatable(false);
		JhglMenu jhglmenu = new JhglMenu(mDesktopPane,mJLabel);
		add(CreateItemButton(jhglmenu.getjhdItem())); 
		XsglMenu xsglmenu = new XsglMenu(mDesktopPane, mJLabel);
		add(CreateItemButton(xsglmenu.getxsdItem())); 
		KcglMenu kcgl = new KcglMenu(mDesktopPane, mJLabel);
		add(CreateItemButton(kcgl.getkcpdItem()));
		add(CreateItemButton(kcgl.getjgtzItem()));
		XxcxMenu xxcxmenu = new XxcxMenu(mDesktopPane, mJLabel);
		add(CreateItemButton(xxcxmenu.getspcxItem()));
		JbzlMenu jbzlmenu = new JbzlMenu(mDesktopPane, mJLabel);
		add(CreateItemButton(jbzlmenu.getspzlglItem()));
		add(CreateItemButton(jbzlmenu.getkhzlglItem()));
		add(CreateItemButton(jbzlmenu.getgyszlglItem()));
		XtwhMenu xtwhmenu = new XtwhMenu(mDesktopPane, mJLabel);
		add(CreateItemButton(xtwhmenu.getexitItem()));
	 }
	 
	 
	 private JButton CreateItemButton(final JMenuItem item){
		 JButton button = new JButton();
		 button.setText(item.getText());
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
