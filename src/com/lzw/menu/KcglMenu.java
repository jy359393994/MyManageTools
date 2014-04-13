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
	private JMenuItem mJgtzItem;
	public KcglMenu(DesktopPane desktoppane,JLabel label){
		super("库存管理(K)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_K);	
		add(getkcpdItem());
		add(getjgtzItem());
	}
	
	public JMenuItem getkcpdItem(){
		
		if(mKcpdItem == null){
			mKcpdItem = new JMenuItem("库存盘点");
		}
		return mKcpdItem;
	}
	
	public JMenuItem getjgtzItem(){
		
		if(mJgtzItem == null){
			mJgtzItem = new JMenuItem("价格调整");
		}
		return mJgtzItem;
	}

}
