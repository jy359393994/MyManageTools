package com.lzw.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import com.lzw.MyDesktopPane;
import com.lzw.ItemActionListener;
import com.lzw.iframe.Jinhuodanframe;

public class JhglMenu extends JMenu{
	
	private MyDesktopPane mDesktopPane;
	private JLabel mLabel;
	private JMenuItem mJhdItem;
	private JMenuItem mJhthItem;
	public JhglMenu(MyDesktopPane desktopPane,JLabel label){
		super("进货管理(J)");
		mDesktopPane = desktopPane;
		mLabel = label;
		init();
	}
	
	private void init(){
		setMnemonic(KeyEvent.VK_J);
		mJhdItem = new JMenuItem("进货单");
		ImageIcon jhdicon = new ImageIcon("images/jinhuodan.png");
		mJhdItem.setIcon(jhdicon);
		mJhdItem.addActionListener(new ItemActionListener("进货单", mDesktopPane));
		add(mJhdItem);
		mJhthItem = new JMenuItem("进货退货");
		ImageIcon jhthicon = new ImageIcon("images/jinhuo_tuihuo.png");
		mJhthItem.setIcon(jhthicon);
		add(getjhthItem());
	}
	
	public JMenuItem getjhdItem(){
		return mJhdItem;
	}
	
	private JMenuItem getjhthItem(){
		return mJhthItem;
	}
	
	
	
}
