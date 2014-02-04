package com.example.resonance.utils;

import java.util.Comparator;

import com.example.resonance.vo.FriendVO;


@SuppressWarnings("rawtypes")
public class PinyinComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		String str1 = PinyinUtils.getPingYin(((FriendVO)o1).getBeginWord());
		String str2 = PinyinUtils.getPingYin(((FriendVO)o2).getBeginWord());
		return str1.compareTo(str2);
	}

}
