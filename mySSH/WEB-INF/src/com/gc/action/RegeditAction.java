/*
 * Created on 2006-5-15
 * TODO
 * author:gf
 */
package com.gc.action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.struts.action.*;
import com.gc.service.Regedit;
import com.gc.vo.User;

public class RegeditAction extends Action {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Regedit regedit;

	public Regedit getRegedit() {
		return regedit;
	}

	public void setRegedit(Regedit regedit) {
		this.regedit = regedit;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		getRegedit().saveUser((User) form);
		request.setAttribute("user", (User) form);
		return mapping.findForward("success");
	}
}
