package com.example.resonance.stub;

import java.util.ArrayList;

import com.example.resonance.vo.FriendListVO;
import com.example.resonance.vo.FriendVO;

/**
 *Class <code>TestVOs.java</code> ����׮�еĲ�������.
 *
 * @author never
 * @date 2014-2-3
 */
public class TestVOs {
    public static long USERID = 100;    //���ڲ��Ը���userID�������ѵ�ID��
    public static String KEY = "key";   //���ڲ��Ը��ݹؼ����������ѵĹؼ���.
    
    public static String login_id = "1";  //������֤��½���û�ID.
    public static String login_password = "1";  //������֤��½���û�����.
    
    
	public ArrayList<FriendVO> friendVOs = new ArrayList<FriendVO>();
    
	public FriendListVO friendListVO = null;
	
	public TestVOs() {
		FriendVO friendVO1 = new FriendVO("T","","��ɮ","makefriendsContent1");
		friendVOs.add(friendVO1);
		FriendVO friendVO2 = new FriendVO("Z","","��ʦ��","makefriendsContent2");
		friendVOs.add(friendVO2);
		FriendVO friendVO3 = new FriendVO("A","","����","makefriendsContent3");
		friendVOs.add(friendVO3);
		FriendVO friendVO4 = new FriendVO("S","","�����","makefriendsContent4");
		friendVOs.add(friendVO4);
		FriendVO friendVO5 = new FriendVO("X","","С��","makefriendsContent5");
		friendVOs.add(friendVO5);
		FriendVO friendVO6 = new FriendVO("D","","���","makefriendsContent6");
		friendVOs.add(friendVO6);
		FriendVO friendVO7 = new FriendVO("D","","����","makefriendsContent7");
		friendVOs.add(friendVO7);
		FriendVO friendVO8 = new FriendVO("L","","����","makefriendsContent8");
		friendVOs.add(friendVO8);
		FriendVO friendVO9 = new FriendVO("L","","����","makefriendsContent9");
		friendVOs.add(friendVO9);
		FriendVO friendVO10 = new FriendVO("N","","��ú","makefriendsContent10");
		friendVOs.add(friendVO10);
		FriendVO friendVO11 = new FriendVO("B","","Bob","makefriendsContent11");
		friendVOs.add(friendVO11);
		FriendVO friendVO12 = new FriendVO("Q","","ǿǿ","makefriendsContent12");
		friendVOs.add(friendVO12);
		FriendVO friendVO13 = new FriendVO("Z","","��ǿ","makefriendsContent13");
		friendVOs.add(friendVO13);
		FriendVO friendVO14 = new FriendVO("W","","��ΰ��","makefriendsContent14");
		friendVOs.add(friendVO14);
		FriendVO friendVO15 = new FriendVO("C","","��","makefriendsContent15");
		friendVOs.add(friendVO15);
		FriendVO friendVO16 = new FriendVO("H","","Heimi","makefriendsContent16");
		friendVOs.add(friendVO16);
		FriendVO friendVO17 = new FriendVO("R","","rose","makefriendsContent17");
		friendVOs.add(friendVO17);
		friendListVO = new FriendListVO(friendVOs);
		
	}
}
