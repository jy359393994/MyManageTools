package com.lzw.iframe;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;


import com.lzw.Item;
import com.lzw.MyJInternalFrame;
import com.lzw.dao.Dao;

public class Xiaoshoudanframe extends MyJInternalFrame{

	private JTextField piaohao = new JTextField();
	private JComboBox kehu = new JComboBox();
	private JTextField lianxiren = new JTextField();
	private JComboBox jsfs = new JComboBox();
	private JTextField shijian = new JTextField();
	private JComboBox jsr = null;
	private JTextField pzsl = new JTextField("0");
	private JTextField hpzs = new JTextField("0");
	private JTextField hjje = new JTextField("0");
	private JTextField ysjl = new JTextField();
	private JTextField czry = new JTextField();
	private JButton tianjia = null;
	private JButton xiaoshou = null;
	private Date date;
	
	public Xiaoshoudanframe(String title){
		super(title);
		setTitle(title);
		init();
	}
	
	private void init(){
		setLayout(new GridBagLayout());
		setComponent(new JLabel("销售票号:"), 0, 0, 1, 0, false);
		piaohao.setFocusable(false);
		setComponent(piaohao, 1, 0, 1, 140, true);
		setComponent(new JLabel("客户:"), 2, 0, 1, 0, false);
		kehu.setFocusable(false);
		kehu.setPreferredSize(new Dimension(160, 21));
		kehu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		setComponent(kehu, 3, 0, 1, 0, true);
		setComponent(new JLabel("联系人:"), 4, 0, 1, 0, false);
		lianxiren.setFocusable(false);
		lianxiren.setPreferredSize(new Dimension(80, 21));
		setComponent(lianxiren, 5, 0, 1, 0, true);
		setComponent(new JLabel("结算方式:"), 0, 1, 1, 0, false);
		jsfs.setFocusable(false);
		jsfs.setPreferredSize(new Dimension(160, 21));
		jsfs.addItem("现金");
		jsfs.addItem("支票");
		jsfs.setEditable(true);		
		setComponent(jsfs, 1, 1, 1, 0, true);
		setComponent(new JLabel("销售时间:"), 2, 1, 1, 0, false);
		shijian.setFocusable(false);
		shijian.setPreferredSize(new Dimension(160, 21));
		date = new Date();
		shijian.setText(date.toLocaleString());		
		setComponent(shijian, 3, 1, 1, 0, true);
		setComponent(new JLabel("经手人"), 4, 1, 1, 0, false);
		setComponent(getJsrComboBox(), 5, 1, 1, 0, true);
		
	}
	
	private void setComponent(JComponent component,int gridx,int gridy,int gridwidth,int ipadx,boolean fill){
		
		final GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = gridx;
		gridBagConstraints.gridy = gridy;
		if(gridwidth > 1){
			gridBagConstraints.gridwidth = gridwidth;
		}
		if(ipadx > 0){
			gridBagConstraints.ipadx = ipadx;
		}
		gridBagConstraints.insets = new Insets(5,1,3,1);
		if(fill){
			gridBagConstraints.fill = gridBagConstraints.HORIZONTAL;
		}
		getContentPane().add(component,gridBagConstraints);
		
	}
	
	private JComboBox getJsrComboBox(){
		if(jsr == null){
			jsr = new JComboBox();
			List<String> czyList = Dao.getJsr();
			int i = 0;
			for(String str:czyList){
				String id = String.valueOf(i);
				String name = str;
				Item item = new Item(id,name);
				item.setId(id + "");
				item.setName(name);
				jsr.addItem(item);
				i++;
			}
		}
		return jsr;
	}
	
	private void initTable(){
		String[] columnNames = {"商品名称","商品编号","供应商","产地","单位","规格","单价","数量"};
		
	}
}
