package com.lzw.menu;

import java.awt.event.KeyEvent;

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
		add(getckcdItem());
		add(getqbgbItem());
		add(getqbzxhItem());
		add(getqbhyItem());
	}
	
	private JMenuItem getckcdItem(){
		
		if(mCkcdItem == null){
			mCkcdItem = new JMenuItem("窗口层叠");
		}
		return mCkcdItem;
	}
	
	private JMenuItem getqbgbItem(){
		
		if(mQbgbItem == null){
			mQbgbItem = new JMenuItem("全部关闭");
		}
		return mQbgbItem;
	}
	
	private JMenuItem getqbzxhItem(){
		
		if(mQbzxhItem == null){
			mQbzxhItem = new JMenuItem("全部最小化");
		}
		return mQbzxhItem;
	}	
	private JMenuItem getqbhyItem(){
		
		if(mQbhyItem == null){
			mQbhyItem = new JMenuItem("全部还原");
		}
		return mQbhyItem;
	}	
	
}
