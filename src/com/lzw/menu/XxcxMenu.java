package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class XxcxMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mXscxItem;
	private JMenuItem mSpcxItem;
	private JMenuItem mXsphItem;
	
	public XxcxMenu(DesktopPane desktoppane,JLabel label){
		super("信息查询(C)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_C);	
		mXscxItem = new JMenuItem("销售查询");
		ImageIcon xscxicon = new ImageIcon("images/xiaoshou_chaxun.png");
		mXscxItem.setIcon(xscxicon);
		mSpcxItem = new JMenuItem("商品查询");
		ImageIcon spcxicon = new ImageIcon("images/shangpin_chaxun.png");
		mSpcxItem.setIcon(spcxicon);
		mXsphItem = new JMenuItem("销售排行");
		ImageIcon xsphicon = new ImageIcon("images/xiaoshou_paihang.png");
		mXsphItem.setIcon(xsphicon);
		add(getxscxItem());
		add(getspcxItem());
		add(getxsphItem());
	}
	
	private JMenuItem getxscxItem(){
		return mXscxItem;
	}

	public JMenuItem getspcxItem(){
		return mSpcxItem;
	}
	
	public JMenuItem getxsphItem(){
		return mXsphItem;
	}
}
