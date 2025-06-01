package com.abes.rms.daoImp;

import java.util.ArrayList;

import com.abes.rms.dao.*;
import com.abes.rms.dto.*;
import com.abes.rms.util.CollectionsUtil;

public class AdminImpDAO implements AdminDAO{

	@Override
	public boolean isAdminPresent(String userID, String pass) {
		if(CollectionsUtil.admin.getId().equals(userID) && CollectionsUtil.admin.getPass().equals(pass)) return true;
		return false;
	}
	
	@Override
	public Admin getAdmin(String userID, String pass) {
		if(CollectionsUtil.admin.getId().equals(userID) && CollectionsUtil.admin.getPass().equals(pass)) return CollectionsUtil.admin;
		return null;
	}
	
	@Override
	public ArrayList<RegularUser> showUsers() {
		return CollectionsUtil.users;
	}

}
