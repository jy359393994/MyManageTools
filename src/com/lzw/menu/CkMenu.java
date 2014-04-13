package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class CkMenu extends JMenu{

	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mCkcdItem;
	private JMenuItem mQbgbItem;
	private JMenuItem mQbzxhItem;
	private JMenuItem mQbhyItem;
	public CkMenu(DesktopPane desktoppane,JLabel label){
		super("窗口(W)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_W);	
		mCkcdItem = new JMenuItem("窗口层叠");
		ImageIcon ckcdicon = new ImageIcon("images/chuangkou_pingpu.png");
		mCkcdItem.setIcon(ckcdicon);
		mQbgbItem = new JMenuItem("全部关闭");
		ImageIcon qbgbicon = new ImageIcon("images/quanbu_guanbi.png");
		mQbgbItem.setIcon(qbgbicon);
		mQbzxhItem = new JMenuItem("全部最小化");
		ImageIcon qbzxhicon = new ImageIcon("images/quanbu_zuixiaohua.png");
		mQbzxhItem.setIcon(qbzxhicon);
		mQbhyItem = new JMenuItem("全部还原");
		ImageIcon qbhyicon = new ImageIcon("images/quanbu_huanyuan.png");
		mQbhyItem.setIcon(qbhyicon);
		add(getckcdItem());
		add(getqbgbItem());
		add(getqbzxhItem());
		add(getqbhyItem());
	}
	
	private JMenuItem getckcdItem(){
		return mCkcdItem;
	}
	
	private JMenuItem getqbgbItem(){
		return mQbgbItem;
	}
	
	private JMenuItem getqbzxhItem(){
		return mQbzxhItem;
	}	
	private JMenuItem getqbhyItem(){
		return mQbhyItem;
	}	
	
}
