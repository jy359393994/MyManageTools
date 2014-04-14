package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;

public class JbzlMenu extends JMenu{
	private MyDesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mSpzlglItem;
	private JMenuItem mKhzlglItem;
	private JMenuItem mGyszlglItem;
	private JMenuItem mJsrszItem;
	public JbzlMenu(MyDesktopPane desktoppane,JLabel label){
		super("基本资料(B)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_B);
		mSpzlglItem = new JMenuItem("商品资料管理");
		ImageIcon spzlicon = new ImageIcon("images/shangpin_guanli.png");
		mSpzlglItem.setIcon(spzlicon);
		mKhzlglItem = new JMenuItem("客户资料管理");
		ImageIcon khzlicon = new ImageIcon("images/kehu_guanli.png");
		mKhzlglItem.setIcon(khzlicon);
		mGyszlglItem = new JMenuItem("供应商资料管理");
		ImageIcon gysizlcon = new ImageIcon("images/gys_guanli.png");
		mGyszlglItem.setIcon(gysizlcon);
		mJsrszItem = new JMenuItem("经手人设置");
		ImageIcon jsricon = new ImageIcon("images/jsr_shezhi.png");
		mJsrszItem.setIcon(jsricon);
		add(getspzlglItem());
		add(getkhzlglItem());
		add(getgyszlglItem());
		add(getjsrszItem());
	}
	
	public JMenuItem getspzlglItem(){
		return mSpzlglItem;
	}
	public JMenuItem getkhzlglItem(){
		return mKhzlglItem;
	}
	public JMenuItem getgyszlglItem(){
		return mGyszlglItem;
	}
	private JMenuItem getjsrszItem(){
		return mJsrszItem;
	}	
}
