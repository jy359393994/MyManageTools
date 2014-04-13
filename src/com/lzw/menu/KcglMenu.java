package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class KcglMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mKcpdItem;
	private JMenuItem mJgglItem;
	public KcglMenu(DesktopPane desktoppane,JLabel label){
		super("库存管理(K)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_K);	
		add(getkcpdItem());
		add(getjgglItem());
	}
	
	public JMenuItem getkcpdItem(){
		
		if(mKcpdItem == null){
			mKcpdItem = new JMenuItem("库存盘点");
		}
		return mKcpdItem;
	}
	
	public JMenuItem getjgglItem(){
		
		if(mJgglItem == null){
			mJgglItem = new JMenuItem("价格管理");
		}
		return mJgglItem;
	}

}
