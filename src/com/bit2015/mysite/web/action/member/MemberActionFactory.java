package com.bit2015.mysite.web.action.member;

import com.bit2015.mysite.web.action.main.IndexAction;
import com.bit2015.web.action.Action;
import com.bit2015.web.action.ActionFactory;

public class MemberActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		if( "joinform".equals( actionName ) ) {
			action = new JoinFormAction();
		} else if( "joinsuccess".equals( actionName ) ) {
			action = new JoinSuccessAction();
		} else if( "join".equals( actionName ) ) {
			action = new JoinAction();
		} else {
			// error 처리 
			action = new IndexAction();
		}
		
		return action;
	}

}
