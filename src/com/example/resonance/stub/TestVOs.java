package com.example.resonance.stub;

import java.util.ArrayList;

import com.example.resonance.vo.FriendListVO;
import com.example.resonance.vo.FriendVO;

/**
 *Class <code>TestVOs.java</code> 用于桩中的测试数据.
 *
 * @author never
 * @date 2014-2-3
 */
public class TestVOs {
    public static long USERID = 100;    //用于测试根据userID搜索好友的ID。
    public static String KEY = "key";   //用于测试根据关键字搜索好友的关键字.
    
    public static String login_id = "1";  //用于验证登陆的用户ID.
    public static String login_password = "1";  //用于验证登陆的用户密码.
    
    
	public ArrayList<FriendVO> friendVOs = new ArrayList<FriendVO>();
    
	public FriendListVO friendListVO = null;
	
	public TestVOs() {
		FriendVO friendVO1 = new FriendVO("T","","唐僧","makefriendsContent1");
		friendVOs.add(friendVO1);
		FriendVO friendVO2 = new FriendVO("Z","","猪师弟","makefriendsContent2");
		friendVOs.add(friendVO2);
		FriendVO friendVO3 = new FriendVO("A","","阿呆","makefriendsContent3");
		friendVOs.add(friendVO3);
		FriendVO friendVO4 = new FriendVO("S","","孙悟空","makefriendsContent4");
		friendVOs.add(friendVO4);
		FriendVO friendVO5 = new FriendVO("X","","小明","makefriendsContent5");
		friendVOs.add(friendVO5);
		FriendVO friendVO6 = new FriendVO("D","","大哥","makefriendsContent6");
		friendVOs.add(friendVO6);
		FriendVO friendVO7 = new FriendVO("D","","董策","makefriendsContent7");
		friendVOs.add(friendVO7);
		FriendVO friendVO8 = new FriendVO("L","","丽丽","makefriendsContent8");
		friendVOs.add(friendVO8);
		FriendVO friendVO9 = new FriendVO("L","","丽君","makefriendsContent9");
		friendVOs.add(friendVO9);
		FriendVO friendVO10 = new FriendVO("N","","泥煤","makefriendsContent10");
		friendVOs.add(friendVO10);
		FriendVO friendVO11 = new FriendVO("B","","Bob","makefriendsContent11");
		friendVOs.add(friendVO11);
		FriendVO friendVO12 = new FriendVO("Q","","强强","makefriendsContent12");
		friendVOs.add(friendVO12);
		FriendVO friendVO13 = new FriendVO("Z","","周强","makefriendsContent13");
		friendVOs.add(friendVO13);
		FriendVO friendVO14 = new FriendVO("W","","王伟洋","makefriendsContent14");
		friendVOs.add(friendVO14);
		FriendVO friendVO15 = new FriendVO("C","","陈","makefriendsContent15");
		friendVOs.add(friendVO15);
		FriendVO friendVO16 = new FriendVO("H","","Heimi","makefriendsContent16");
		friendVOs.add(friendVO16);
		FriendVO friendVO17 = new FriendVO("R","","rose","makefriendsContent17");
		friendVOs.add(friendVO17);
		friendListVO = new FriendListVO(friendVOs);
		
	}
}
