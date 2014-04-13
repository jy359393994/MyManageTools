package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class JbzlMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mSpzlglItem;
	private JMenuItem mKhzlglItem;
	private JMenuItem mGyszlglItem;
	private JMenuItem mJsrszItem;
	public JbzlMenu(DesktopPane desktoppane,JLabel label){
		super("基本资料(B)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_B);
		add(getspzlglItem());
		add(getkhzlglItem());
		add(getgyszlglItem());
		add(getjsrszItem());
	}
	
	public JMenuItem getspzlglItem(){
		
		if(mSpzlglItem == null){
			mSpzlglItem = new JMenuItem("商品资料管理");
		}
		return mSpzlglItem;
	}
	public JMenuItem getkhzlglItem(){
		
		if(mKhzlglItem == null){
			mKhzlglItem = new JMenuItem("客户资料管理");
		}
		return mKhzlglItem;
	}
	public JMenuItem getgyszlglItem(){
		
		if(mGyszlglItem == null){
			mGyszlglItem = new JMenuItem("供应商资料管理");
		}
		return mGyszlglItem;
	}
	private JMenuItem getjsrszItem(){
		
		if(mJsrszItem == null){
			mJsrszItem = new JMenuItem("经手人设置");
		}
		return mJsrszItem;
	}	
}
