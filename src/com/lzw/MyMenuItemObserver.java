package com.lzw;
import javax.swing.JInternalFrame;
import com.lzw.iframe.Gyszlglframe;
import com.lzw.iframe.Jiagetiaozhengframe;
import com.lzw.iframe.Jinhuodanframe;
import com.lzw.iframe.Jinhuotuihuoframe;
import com.lzw.iframe.Jsrszframe;
import com.lzw.iframe.Kehuzlglframe;
import com.lzw.iframe.Kucunpandainframe;
import com.lzw.iframe.Mimaxiugaiframe;
import com.lzw.iframe.Shangpingchaxunframe;
import com.lzw.iframe.Shangpinzlglframe;
import com.lzw.iframe.Shujubeifenframe;
import com.lzw.iframe.Tuichuxitongframe;
import com.lzw.iframe.Xiaoshouchaxunframe;
import com.lzw.iframe.Xiaoshoudanframe;
import com.lzw.iframe.Xiaoshoupaihangframe;
import com.lzw.iframe.Xiaoshoutuihuoframe;
import com.lzw.menu.MyJMenuItem.MenuItemObserver;

public class MyMenuItemObserver implements MenuItemObserver{

	private JInternalFrame miframe;
	private MyDesktopPane mDesktopPane;	
	public MyMenuItemObserver(MyDesktopPane deskTopPane)
	{
		mDesktopPane = deskTopPane;
	}
	
	@Override
	public void onClick(String title) {
		// TODO Auto-generated method stub
		System.out.println("in the actionPerformed method of ItemActionListener");
		JInternalFrame[] allFrames = mDesktopPane.getAllFrames();
		int titleBarHight = 20*allFrames.length;
		int x = 20 + titleBarHight;
		int y = x;
		int width = 300;
		int height = 200;
		boolean result = isFrameCreated(allFrames, title);
		if(miframe == null || miframe.isClosed()||!result){
			System.out.println("the miframe is not null or open");
			if("进货单".equals(title)){
				miframe = new Jinhuodanframe(title);	
				System.out.println("创建进货单窗体");
			}
			else if("进货退货".equals(title)){
				miframe = new Jinhuotuihuoframe(title);
				System.out.println("创建进货退货窗体");
			}			 
			else if("销售单".equals(title)){
				miframe = new Xiaoshoudanframe(title);
				System.out.println("创建销售单窗体");
			}
			else if("销售退货".equals(title)){
				miframe = new Xiaoshoutuihuoframe(title);
				System.out.println("创建销售退货窗体");
			}
			else if("库存盘点".equals(title)){
				miframe = new Kucunpandainframe(title);
				System.out.println("创建库存盘点窗体");
			}
		   else if("价格调整".equals(title)){
				miframe = new Jiagetiaozhengframe(title);
				System.out.println("创建价格调整窗体");
			}
			else if("数据库备份与恢复".equals(title)){
				miframe = new Shujubeifenframe(title);
				System.out.println("创建数据库备份与恢复窗体");
			}
			else if("密码修改".equals(title)){
				miframe = new Mimaxiugaiframe(title);
				System.out.println("创建密码修改窗体");
			}
			else if("退出系统".equals(title)){
				miframe = new Tuichuxitongframe(title);
				System.out.println("创建退出系统窗体");
			}
			else if("销售查询".equals(title)){
				miframe = new Xiaoshouchaxunframe(title);
				System.out.println("创建销售查询窗体");
			}
			else if("商品查询".equals(title)){
				miframe = new Shangpingchaxunframe(title);
				System.out.println("创建商品查询窗体");
			}
			else if("销售排行".equals(title)){
				miframe = new Xiaoshoupaihangframe(title);
				System.out.println("创建销售排行窗体");
			}
			else if("商品资料管理".equals(title)){
				miframe = new Shangpinzlglframe(title);
				System.out.println("创建商品资料管理窗体");
			}
			else if("客户资料管理".equals(title)){
				miframe = new Kehuzlglframe(title);
				System.out.println("创建客户资料管理窗体");
			}
			else if("供应商资料管理".equals(title)){
				miframe = new Gyszlglframe(title);
				System.out.println("创建供应商资料管理窗体");
			}
			else if("经手人设置".equals(title)){
				miframe = new Jsrszframe(title);
				System.out.println("创建经手人设置窗体");
			}
/*			else if("经手人设置".equals(title)){
				miframe = new Jsrszframe(title);
				System.out.println("创建经手人设置窗体");
			}*/
			
			miframe.setBounds(x, y, width, height);
			miframe.setVisible(true);
			miframe.setRequestFocusEnabled(true);
			mDesktopPane.add(miframe);
			mDesktopPane.selectFrame(false);
			
		}
		miframe.toFront();
//		mDesktopPane.selectFrame(false);
		System.out.println("title is not 进货单");
		System.out.println(title);	
	}
		
	private boolean isFrameCreated(JInternalFrame[] allFrames,String title){
		boolean result = false;
		for(JInternalFrame frame:allFrames){
			if(title.equals(frame.getTitle())){
				result = true;
				frame.dispose();
				miframe = null;
//				mDesktopPane.setSelectedFrame(frame);
				break;
			}
		}
		return result;
	}
	
	
}
