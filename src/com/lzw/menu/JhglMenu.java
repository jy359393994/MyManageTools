package com.lzw.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import com.lzw.DesktopPane;
import com.lzw.ItemActionListener;
import com.lzw.iframe.Jinhuodanframe;

public class JhglMenu extends JMenu{
	
	private DesktopPane mDesktopPane;
	private JLabel mLabel;
	private JMenuItem mJhdItem;
	private JMenuItem mJhthItem;
	public JhglMenu(DesktopPane desktopPane,JLabel label){
		super("进货管理(J)");
		mDesktopPane = desktopPane;
		mLabel = label;
		init();
	}
	
	private void init(){
		setMnemonic(KeyEvent.VK_J);
		add(getjhdItem());
		add(getjhthItem());
	}
	
	public JMenuItem getjhdItem(){
		
		if(mJhdItem == null){
			mJhdItem = new JMenuItem("进货单");
			Jinhuodanframe jhdframe = new Jinhuodanframe("进货单");
			mJhdItem.addActionListener(new ItemActionListener(jhdframe, "进货单", mDesktopPane));
		}
		return mJhdItem;
	}
	
	private JMenuItem getjhthItem(){
		
		if(mJhthItem == null){
			mJhthItem = new JMenuItem("进货退货");
		}
		return mJhthItem;
	}
	
	
	
}
