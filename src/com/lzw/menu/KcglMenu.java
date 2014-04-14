package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;

public class KcglMenu extends JMenu{
	private MyDesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mKcpdItem;
	private JMenuItem mJgtzItem;
	public KcglMenu(MyDesktopPane desktoppane,JLabel label){
		super("库存管理(K)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_K);	
		mKcpdItem = new JMenuItem("库存盘点");
		ImageIcon kcpdicon = new ImageIcon("images/kucun_pandian.png");
		mKcpdItem.setIcon(kcpdicon);
		mJgtzItem = new JMenuItem("价格调整");
		ImageIcon jgtzicon = new ImageIcon("images/jiage_tiaozheng.png");
		mJgtzItem.setIcon(jgtzicon);
		add(getkcpdItem());
		add(getjgtzItem());
	}
	
	public JMenuItem getkcpdItem(){
		return mKcpdItem;
	}
	
	public JMenuItem getjgtzItem(){
		return mJgtzItem;
	}

}
