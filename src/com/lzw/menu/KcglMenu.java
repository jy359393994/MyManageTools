package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;
import com.lzw.MyMenuItemObserver;

public class KcglMenu extends JMenu{
	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mJLabel;
	private JMenuItem mKcpdItem;
	private JMenuItem mJgtzItem;
	public KcglMenu(MyMenuItemObserver itemobserver,JLabel label){
		super("库存管理(K)");
		mMebuItemObserver = itemobserver;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_K);	
		mKcpdItem = new MyJMenuItem("库存盘点", "images/kucun_pandian.png", mMebuItemObserver);
		mJgtzItem = new MyJMenuItem("价格调整", "images/jiage_tiaozheng.png", mMebuItemObserver);
/*		mKcpdItem = new JMenuItem("库存盘点");
		ImageIcon kcpdicon = new ImageIcon("images/kucun_pandian.png");
		mKcpdItem.setIcon(kcpdicon);
		mJgtzItem = new JMenuItem("价格调整");
		ImageIcon jgtzicon = new ImageIcon("images/jiage_tiaozheng.png");
		mJgtzItem.setIcon(jgtzicon);*/
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
