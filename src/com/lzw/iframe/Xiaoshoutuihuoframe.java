package com.lzw.iframe;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.lzw.MyJInternalFrame;

public class Xiaoshoutuihuoframe extends MyJInternalFrame{
	private JTable mtable = null;

	private JTextField piaohao = null;
	private JComboBox kehu = null;
	private JTextField lianxiren = null;
	private JComboBox jiesuanfangshi = null;
	private JTextField tuihuoshijian = null;
	private JComboBox jingshouren = null;
	
	public Xiaoshoutuihuoframe(String title){
		super(title);
		setTitle(title);
		init();
	}
	
	private void init(){
		
	}
}
