package com.example.demo;

import java.io.Console;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.DoubleDataModel;
import com.example.demo.model.Dropdown_model;
import com.example.demo.model.IC_LOCATION_MASTER_Dropdown;
import com.example.demo.model.IC_PERIOD_MST_Dropdown;
import com.example.demo.model.IC_ZONE_MST_Dropdown;
import com.example.demo.model.TotalSumModel;
import com.example.demo.model.dpd_MOD_ACC_REC_CAT_REPORT5;
import com.example.demo.model.dpd_MOD_ACC_REC_CAT_REPORT6;

import oracle.jdbc.OracleTypes;

@Controller
public class MainControllerIC {
	@Resource
	ICDao icDao;
	@Resource
	IConvDao i;
	@Resource
	ICONVDaoRafi iconvDaoRafi;
	@Resource
	IConvergeDaoSurovi convergeDaoSurovi;
	@Resource
	RowSqlDao rowSqlDao;

	 /*
	 String yearCode = "";
	 String zoneCode = "";
	 String circleCode = "";
	 String zoneName = "";
	 String circleName = "";*/

	SimpleJdbcCall getAllStatesJdbcCall;
	SimpleJdbcCall getAllStatesJdbcCall1;
	SimpleJdbcCall getAllStatesJdbcCall2;
	SimpleJdbcCall getAllStatesJdbcCall3;
	SimpleJdbcCall getAllStatesJdbcCall4;
	SimpleJdbcCall getAllStatesJdbcCall5;
	SimpleJdbcCall getAllStatesJdbcCall6;
	SimpleJdbcCall getAllStatesJdbcCall7;
	SimpleJdbcCall getAllStatesJdbcCall8;
	SimpleJdbcCall getAllStatesJdbcCall9;
	SimpleJdbcCall getAllStatesJdbcCall101;
	SimpleJdbcCall getAllStatesJdbcCall102;
	SimpleJdbcCall getAllStatesJdbcCall103;
	SimpleJdbcCall getAllStatesJdbcCall104;
	SimpleJdbcCall getAllStatesJdbcCall105;
	SimpleJdbcCall getAllStatesJdbcCall106;
	SimpleJdbcCall getAllStatesJdbcCall107;
	SimpleJdbcCall getAllStatesJdbcCall108;
	SimpleJdbcCall getAllStatesJdbcCall109;
	SimpleJdbcCall getAllStatesJdbcCall110;

	SimpleJdbcCall getAllStatesJdbcCall111;
	SimpleJdbcCall getAllStatesJdbcCall112;
	SimpleJdbcCall getAllStatesJdbcCall113;
	SimpleJdbcCall getAllStatesJdbcCall114;
	SimpleJdbcCall getAllStatesJdbcCall115;
	SimpleJdbcCall getAllStatesJdbcCall116;
	SimpleJdbcCall getAllStatesJdbcCall117;
	SimpleJdbcCall getAllStatesJdbcCall118;
	SimpleJdbcCall getAllStatesJdbcCall119;
	SimpleJdbcCall getAllStatesJdbcCall120;

	SimpleJdbcCall getAllStatesJdbcCall121;
	SimpleJdbcCall getAllStatesJdbcCall122;
	SimpleJdbcCall getAllStatesJdbcCall123;
	SimpleJdbcCall getAllStatesJdbcCall124;
	SimpleJdbcCall getAllStatesJdbcCall125;
	SimpleJdbcCall getAllStatesJdbcCall126;

	SimpleJdbcCall getAllStatesJdbcCall217;
	SimpleJdbcCall getAllStatesJdbcCall219;
	SimpleJdbcCall getAllStatesJdbcCall220;

	SimpleJdbcCall getAllStatesJdbcCall300;
	SimpleJdbcCall getAllStatesJdbcCall301;
	SimpleJdbcCall getAllStatesJdbcCall302;

	SimpleJdbcCall getAllStatesJdbcCall400;
	SimpleJdbcCall getAllStatesJdbcCall401;
	SimpleJdbcCall getAllStatesJdbcCall402;
	SimpleJdbcCall getAllStatesJdbcCall403;
	SimpleJdbcCall getAllStatesJdbcCall404;
	SimpleJdbcCall getAllStatesJdbcCall405;
	SimpleJdbcCall getAllStatesJdbcCall406;
	SimpleJdbcCall getAllStatesJdbcCall407;
	SimpleJdbcCall getAllStatesJdbcCall408;
	SimpleJdbcCall getAllStatesJdbcCall409;
	SimpleJdbcCall getAllStatesJdbcCall410;
	SimpleJdbcCall getAllStatesJdbcCall411;
	SimpleJdbcCall getAllStatesJdbcCall412;
	SimpleJdbcCall getAllStatesJdbcCall413;
	SimpleJdbcCall getAllStatesJdbcCall414;
	SimpleJdbcCall getAllStatesJdbcCall415;
	SimpleJdbcCall getAllStatesJdbcCall416;

	SimpleJdbcCall getAllStatesJdbcCall517;
	SimpleJdbcCall getAllStatesJdbcCall518;
	
	SimpleJdbcCall getAllStatesJdbcCall520;

	SimpleJdbcCall getAllStatesJdbcCall521;
	SimpleJdbcCall getAllStatesJdbcCall522;
	SimpleJdbcCall getAllStatesJdbcCall523;
	SimpleJdbcCall getAllStatesJdbcCall524;

	SimpleJdbcCall getAllStatesJdbcCall1000;
	SimpleJdbcCall functionJdbcCall1;
	SimpleJdbcCall functionJdbcCall2;
	SimpleJdbcCall functionJdbcCall3;

	public MainControllerIC(DataSource dataSource) {
		this.getAllStatesJdbcCall = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall7 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall8 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall9 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall101 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall102 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall103 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall104 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall105 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall106 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall107 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall108 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall109 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall110 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall111 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall112 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall113 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall114 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall115 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall116 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall117 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall118 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall119 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall120 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall121 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall122 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall123 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall124 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall125 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall126 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall217 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall219 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall220 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall300 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall301 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall302 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall400 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall401 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall402 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall403 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall404 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall405 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall406 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall407 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall408 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall409 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall410 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall411 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall412 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall413 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall414 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall415 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall416 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall517 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall518 = new SimpleJdbcCall(dataSource);
		
		this.getAllStatesJdbcCall520 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall521 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall522 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall523 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall524 = new SimpleJdbcCall(dataSource);
		

		this.getAllStatesJdbcCall1000 = new SimpleJdbcCall(dataSource);
		this.functionJdbcCall1 = new SimpleJdbcCall(dataSource);
		this.functionJdbcCall2 = new SimpleJdbcCall(dataSource);
		this.functionJdbcCall3 = new SimpleJdbcCall(dataSource);

	}

	@GetMapping("/")
	public String Login(Model model) {
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);

		return "login";
	}

	@GetMapping("/logout")
	public String LogOut(HttpServletResponse response, Model model) {
		LoginModel login = new LoginModel();
		model.addAttribute("login", login);
		Cookie cookie = new Cookie("user_name", null);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		Cookie cookie1 = new Cookie("officeCode", null);
		cookie1.setMaxAge(0);
		response.addCookie(cookie1);
		return "login";
	}

	@GetMapping("/ResetPassword")
	public String Reseta(Model model) {
		Reset reset = new Reset();
		model.addAttribute("reset", reset);

		return "resetPassword";
	}

	@PostMapping("/ResetPassword")
	public String Reset(Model model, Reset reset) {

		LoginModel user1 = icDao.getLogin(reset.getP_User_Id(), reset.getP_Password());

		if (reset.getP_User_Id().equals("")) {
			String msg1 = "*Enter User Name";
			model.addAttribute("msg1", msg1);
			return "resetPassword";

		} else {

			if (user1 == null) {
				String msg = "User Id OR Password didn't match";
				model.addAttribute("msg", msg);
				return "resetPassword";
			} else {
				if (user1.getP_User_Id().equals(reset.getP_User_Id())
						&& user1.getP_Password().equals(reset.getP_Password())) {

					if (reset.getP_New_Pass().equals(reset.getP_confirm_Pass())) {
						icDao.passwordReset(reset);
						return "redirect:/";
					} else {

						String msg = "New password and confirm password didn't match";
						model.addAttribute("msg", msg);
						return "resetPassword";
					}
				} else {
					String msg2 = "*Wrong Password";
					model.addAttribute("msg2", msg2);
					return "resetPassword";

				}

			}

		}

	}

	@PostMapping("/")
	public String loginUser(HttpServletResponse response, Model model, LoginModel user) {
		LoginModel user1 = icDao.getLogin(user.getP_User_Id(), user.getP_Password());

//		System.out.println(user);
		if (user1 != null) {
			if (user1.getP_User_Id().equals(user.getP_User_Id())
					&& user1.getP_Password().equals(user.getP_Password())) {
				String dynamicMenu= icDao.getDynamicMenu(user1.getP_User_Id());
				Cookie cookie = new Cookie("user_name", user1.getP_User_Id());
				Cookie cookie1 = new Cookie("officeCode", user1.getOfficeCode());
				response.addCookie(cookie);
				response.addCookie(cookie1);

				return "redirect:/Home";
			} else {
				return "redirect:/";
			}

		} else {

			LoginModel login = new LoginModel();
			model.addAttribute("login", login);

			String msg = "User Id Password Missmatch! Login Failed";
			model.addAttribute("msg", msg);
			return "login";
		}

	}

	@GetMapping("/Home")
	public String Home(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "Home";
	}

	@GetMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_YEAR_MST ic_YEAR_MST = new IC_YEAR_MST();

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@GetMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_YEAR_MST ic_YEAR_MST = icDao.singleIC_YEAR_MST(id);

		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("ic_YEAR_MST", ic_YEAR_MST);
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YEAR_MST";
	}

	@PostMapping("/IC_YEAR_MST")
	public String IC_YEAR_MST_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_YEAR_MST ic_YEAR_MST) {

		String out = icDao.insertIC_YEAR_MST(ic_YEAR_MST,user_name);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}

	}

	@PostMapping("/IC_YEAR_MST/{id}")
	public String IC_YEAR_MST_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_YEAR_MST ic_YEAR_MST) {

		ic_YEAR_MST.setYR_ID(id);

		String out = icDao.editIC_YEAR_MST(ic_YEAR_MST,user_name);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_delete/{id}")
	public String IC_YEAR_MST_delete(@PathVariable("id") int id) {

		String out = icDao.deleteIC_YEAR_MST(id);

		if (out.equals("1")) {
			return "redirect:/IC_YEAR_MST";
		} else {
			return null;
		}
	}

	@PostMapping("/IC_YEAR_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_YEAR_MST";
	}

	@GetMapping("/IC_YR_TARGET")
	public String IC_YR_TARGET(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<IC_YEAR_MST> listIC_YEAR_MST = icDao.listIC_YEAR_MST();
		model.addAttribute("listIC_YEAR_MST", listIC_YEAR_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_YR_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET/{YEAR_CODE}")
	public String IC_BPDB_TARGET(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("YEAR_CODE") String YEAR_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//yearCode = id;
		String flag = "0";

		IC_BPDB_TARGET ic_bpdb_target = new IC_BPDB_TARGET();

		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(YEAR_CODE);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		//model.addAttribute("yearCode", yearCode);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_BPDB_TARGET";
	}

	@GetMapping("/IC_BPDB_TARGET_S/{YEAR_CODE}/{id}")
	public String IC_BPDB_TARGET_single(@CookieValue(value = "user_name", defaultValue = "") String user_name, 
			@PathVariable("id") String id,@PathVariable("YEAR_CODE") String YEAR_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_BPDB_TARGET ic_bpdb_target = icDao.singleIC_BPDB_TARGET(Integer.valueOf(id));
		
		
		ArrayList<IC_BPDB_TARGET> listIC_BPDB_TARGET = icDao.listIC_BPDB_TARGET(YEAR_CODE);
		model.addAttribute("IC_BPDB_TARGET", ic_bpdb_target);
		model.addAttribute("listIC_BPDB_TARGET", listIC_BPDB_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		//model.addAttribute("yearCode", yearCode);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_BPDB_TARGET";
	}

	@PostMapping("/IC_BPDB_TARGET")
	public String IC_BPDB_TARGET_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_BPDB_TARGET ic_BPDB_TARGET) {

		String out = icDao.insertIC_BPDB_TARGET(ic_BPDB_TARGET,user_name);
		String ss = "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET/{id}")
	public String IC_BPDB_TARGET_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {

		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);

		String out = icDao.updateIC_BPDB_TARGET(ic_BPDB_TARGET,user_name);
		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_BPDB_TARGET_delete/{id}")
	public String IC_BPDB_TARGET_delete(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {
		ic_BPDB_TARGET.setBPDB_TARGET_ID(id);
		String out = icDao.deleteIC_BPDB_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_BPDB_MST_clear/{id}")
	public String IC_YEAR_TYPE_clear(@PathVariable("id") int id, Model model, IC_BPDB_TARGET ic_BPDB_TARGET) {

		return "redirect:/IC_BPDB_TARGET/" + ic_BPDB_TARGET.getYEAR_CODE();
	}

	@GetMapping("/IC_ZONE_TARGET/{YEAR_CODE}/{id}")
	public String IC_ZONE_TARGET(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String id,@PathVariable("YEAR_CODE") String YEAR_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_ZONE_TARGET iC_ZONE_TARGET = new IC_ZONE_TARGET();

		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(YEAR_CODE);
		model.addAttribute("iC_ZONE_TARGET", iC_ZONE_TARGET);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@GetMapping("/IC_ZONE_TARGET_S/{YEAR_CODE}/{id}")
	public String IC_ZONE_TARGET_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String id, @PathVariable("YEAR_CODE") String YEAR_CODE,Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_ZONE_TARGET iC_ZONE_TARGET = icDao.singleIC_ZONE_TARGET(Integer.valueOf(id));
		//zoneName = ic_ZONE_target.ZONE_NAME;
		//yearCode = ic_ZONE_target.YEAR_CODE;
		ArrayList<IC_ZONE_TARGET> listIC_ZONE_TARGET = icDao.listIC_ZONE_TARGET(YEAR_CODE);

		model.addAttribute("iC_ZONE_TARGET", iC_ZONE_TARGET);
		model.addAttribute("listIC_ZONE_TARGET", listIC_ZONE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		//model.addAttribute(ZONE_CODE, ZONE_CODE);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_ZONE_MST> ic_ZONE_MSTs = icDao.listIC_ZONE_MST();
		model.addAttribute("ic_ZONE_MSTs", ic_ZONE_MSTs);
		return "IC_ZONE_TARGET";
	}

	@PostMapping("/IC_ZONE_TARGET")
	public String IC_ZONE_TARGET_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_ZONE_TARGET iC_ZONE_TARGET) {

		String out = icDao.insertIC_ZONE_TARGET(iC_ZONE_TARGET,user_name);
		String ss = "redirect:/IC_ZONE_TARGET/" + iC_ZONE_TARGET.getYEAR_CODE()+'/'+ iC_ZONE_TARGET.getZONE_TARGET_ID();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_ZONE_TARGET/{id}")
	public String IC_ZONE_TARGET_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_ZONE_TARGET iC_ZONE_TARGET) {

		iC_ZONE_TARGET.setZONE_TARGET_ID(id);

		String out = icDao.updateIC_ZONE_TARGET(iC_ZONE_TARGET,user_name);
		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + iC_ZONE_TARGET.getYEAR_CODE()+'/'+ iC_ZONE_TARGET.getZONE_TARGET_ID();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_ZONE_TARGET_delete/{id}")
	public String IC_ZONE_TARGET_delete(@PathVariable("id") int id, Model model, IC_ZONE_TARGET iC_ZONE_TARGET) {
		iC_ZONE_TARGET.setZONE_TARGET_ID(id);
		String out = icDao.deleteIC_ZONE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_ZONE_TARGET/" + iC_ZONE_TARGET.getYEAR_CODE()+'/'+ iC_ZONE_TARGET.getZONE_TARGET_ID();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_ZONE_TARGET_clear/{id}")
	public String IC_IC_ZONE_TARGET_clear(@PathVariable("id") int id, Model model, IC_ZONE_TARGET iC_ZONE_TARGET) {

		return "redirect:/IC_ZONE_TARGET/" + iC_ZONE_TARGET.getYEAR_CODE()+'/'+ iC_ZONE_TARGET.getZONE_TARGET_ID();
	}

	@GetMapping("/IC_CIRCLE_TARGET/{YEAR_CODE}/{ZONE_CODE}")
	public String IC_CIRCLE_TARGET(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("YEAR_CODE") String YEAR_CODE,@PathVariable("ZONE_CODE") String ZONE_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//zoneCode = id;
		String flag = "0";

		IC_CIRCLE_TARGET iC_CIRCLE_TARGET = new IC_CIRCLE_TARGET();

		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(YEAR_CODE, ZONE_CODE);

		model.addAttribute("iC_CIRCLE_TARGET", iC_CIRCLE_TARGET);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("ZONE_CODE", ZONE_CODE);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		//model.addAttribute("ZONE_CODE", ZONE_CODE);
		//model.addAttribute("zoneName", zoneName);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(ZONE_CODE);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@GetMapping("/IC_CIRCLE_TARGET_S/{YEAR_CODE}/{ZONE_CODE}/{id}")
	public String IC_CIRCLE_TARGET_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String id,@PathVariable("YEAR_CODE") String YEAR_CODE,@PathVariable("ZONE_CODE") String ZONE_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_CIRCLE_TARGET ic_CIRCLE_target = icDao.singleIC_CIRCLE_TARGET(Integer.valueOf(id));
		//circleName = ic_CIRCLE_target.CIRCLE_NAME;
		ArrayList<IC_CIRCLE_TARGET> listIC_CIRCLE_TARGET = icDao.listIC_CIRCLE_TARGET(YEAR_CODE, ZONE_CODE);

		model.addAttribute("iC_CIRCLE_TARGET", ic_CIRCLE_target);
		model.addAttribute("listIC_CIRCLE_TARGET", listIC_CIRCLE_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		model.addAttribute("ZONE_CODE", ZONE_CODE);
		//model.addAttribute("zoneName", zoneName);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_CIRCLE_MST> ic_CIRCLE_MSTs = icDao.listIC_CIRCLE_MST(ZONE_CODE);
		model.addAttribute("ic_CIRCLE_MSTs", ic_CIRCLE_MSTs);
		return "IC_CIRCLE_TARGET";
	}

	@PostMapping("/IC_CIRCLE_TARGET")
	public String IC_CIRCLE_TARGET_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {
		iC_CIRCLE_TARGET.setOFFICE_CODE(officeCode);
		String out = icDao.insertIC_CIRCLE_TARGET(iC_CIRCLE_TARGET,user_name);
		String ss = "redirect:/IC_CIRCLE_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE();
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET/{id}")
	public String IC_CIRCLE_TARGET_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {

		iC_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);

		String out = icDao.updateIC_CIRCLE_TARGET(iC_CIRCLE_TARGET,user_name);
		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE();
		} else {
			return null;
		}

	}

	@PostMapping("/IC_CIRCLE_TARGET_delete/{id}")
	public String IC_CIRCLE_TARGET_delete(@PathVariable("id") int id, Model model, IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {
		iC_CIRCLE_TARGET.setCIRCLE_TARGET_ID(id);
		String out = icDao.deleteIC_CIRCLE_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_CIRCLE_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE();
		} else {
			return null;
		}
	}

	@PostMapping("/IC_CIRCLE_TARGET_clear/{id}")
	public String IC_IC_CIRCLE_TARGET_clear(@PathVariable("id") int id, Model model,
			IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {

		return "redirect:/IC_CIRCLE_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE();
	}

	@GetMapping("/IC_LOC_TARGET/{YEAR_CODE}/{ZONE_CODE}/{CIRCLE_CODE}")
	public String IC_LOC_TARGET(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("YEAR_CODE") String YEAR_CODE,@PathVariable("ZONE_CODE") String ZONE_CODE,
			@PathVariable("CIRCLE_CODE") String CIRCLE_CODE, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		String flag = "0";

		IC_LOC_TARGET iC_LOC_TARGET = new IC_LOC_TARGET();

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(YEAR_CODE, CIRCLE_CODE);

		model.addAttribute("iC_LOC_TARGET", iC_LOC_TARGET);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		/*
		 model.addAttribute("id", id);
		 model.addAttribute("yearCode", yearCode);
		 model.addAttribute("zoneCode", zoneCode);
		model.addAttribute("zoneName", zoneName);
		model.addAttribute("circleCode", circleCode);
		model.addAttribute("circleName", circleName);*/
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> iC_LOCATION_MASTER = icDao.listIC_LOCATION_MASTER(CIRCLE_CODE);
		model.addAttribute("iC_LOCATION_MASTER", iC_LOCATION_MASTER);
		return "IC_LOC_TARGET";
	}

	@GetMapping("/IC_LOC_TARGET_S/{YEAR_CODE}/{ZONE_CODE}/{CIRCLE_CODE}/{id}")
	public String IC_LOC_TARGET_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("YEAR_CODE") String YEAR_CODE,@PathVariable("ZONE_CODE") String ZONE_CODE, @PathVariable("CIRCLE_CODE") String CIRCLE_CODE, @PathVariable("id") String id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_LOC_TARGET iC_LOC_TARGET = icDao.singleIC_LOC_TARGET(Integer.valueOf(id));

		ArrayList<IC_LOC_TARGET> listIC_LOC_TARGET = icDao.listIC_LOC_TARGET(YEAR_CODE, CIRCLE_CODE);
		model.addAttribute("iC_LOC_TARGET", iC_LOC_TARGET);
		model.addAttribute("listIC_LOC_TARGET", listIC_LOC_TARGET);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		model.addAttribute("YEAR_CODE", YEAR_CODE);
		//model.addAttribute("ZONE_CODE", ZONE_CODE);
		//model.addAttribute("zoneName", zoneName);
		model.addAttribute("CIRCLE_CODE", CIRCLE_CODE);
		//model.addAttribute("circleName", circleName);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
//		ArrayList<IC_OFFICE_INFO> ic_OFFICE_INFOs = icDao.listIC_OFFICE_INFO();
//		model.addAttribute("ic_OFFICE_INFOs", ic_OFFICE_INFOs);
		ArrayList<IC_LOCATION_MASTER> iC_LOCATION_MASTER = icDao.listIC_LOCATION_MASTER(CIRCLE_CODE);
		model.addAttribute("iC_LOCATION_MASTER", iC_LOCATION_MASTER);
		return "IC_LOC_TARGET";
	}

	@PostMapping("/IC_LOC_TARGET")
	public String IC_LOC_TARGET_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			IC_LOC_TARGET iC_LOC_TARGET, IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {

		String out = icDao.insertIC_LOC_TARGET(iC_LOC_TARGET,user_name);
		String ss = "redirect:/IC_LOC_TARGET/"+ iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE()+'/' + iC_CIRCLE_TARGET.CIRCLE_CODE;
		if (out.equals("1")) {
			return ss;
		} else {
			return ss;
		}

	}

	@PostMapping("/IC_LOC_TARGET/{id}")
	public String IC_LOC_TARGET_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model, IC_LOC_TARGET iC_LOC_TARGET, IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {

		iC_LOC_TARGET.setLOC_TARGET_ID(id);

		String out = icDao.updateIC_LOC_TARGET(iC_LOC_TARGET,user_name);
		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE()+'/' + iC_CIRCLE_TARGET.CIRCLE_CODE;
		} else {
			return null;
		}

	}

	@PostMapping("/IC_LOC_TARGET_delete/{id}")
	public String IC_LOC_TARGET_delete(@PathVariable("id") int id, Model model,
			IC_LOC_TARGET iC_LOC_TARGET,IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET )
	{
		iC_LOC_TARGET.setLOC_TARGET_ID(id);
		String out = icDao.deleteIC_LOC_TARGET(id);

		if (out.equals("1")) {
			return "redirect:/IC_LOC_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE()+'/' + iC_CIRCLE_TARGET.CIRCLE_CODE;
		} else {
			return null;
		}
	}

	@PostMapping("/IC_LOC_TARGET_clear/{id}")
	public String IC_IC_LOC_TARGET_clear(@PathVariable("id") int id, Model model,
			IC_LOC_TARGET iC_LOC_TARGET, IC_CIRCLE_TARGET iC_CIRCLE_TARGET, IC_ZONE_TARGET iC_ZONE_TARGET) {

		return "redirect:/IC_LOC_TARGET/" + iC_CIRCLE_TARGET.getYEAR_CODE()+'/'+iC_ZONE_TARGET.getZONE_CODE()+'/' + iC_CIRCLE_TARGET.CIRCLE_CODE;
	}

	@GetMapping("/IC_DC_OF_ILLIGAL_USE_ST")
	public String IC_DC_OF_ILLIGAL_USE_ST(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "0";
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = new IC_DC_OF_ILLIGAL_USE_ST();
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST();
		model.addAttribute("ic_DC_OF_ILLIGAL_USE_ST", ic_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("listIC_DC_OF_ILLIGAL_USE_STE", listIC_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("flag", flag);

		return "IC_DC_OF_ILLIGAL_USE_ST";
	}

	@GetMapping("/IC_DC_OF_ILLIGAL_USE_ST/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_S(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") int id,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "1";
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST_S(id);
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST();
		model.addAttribute("ic_DC_OF_ILLIGAL_USE_ST", ic_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("listIC_DC_OF_ILLIGAL_USE_STE", listIC_DC_OF_ILLIGAL_USE_ST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		return "IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST")
	public String IC_DC_OF_ILLIGAL_USE_ST_save(IC_DC_OF_ILLIGAL_USE_ST dc_OF_ILLIGAL_USE_ST) {

		rowSqlDao.insertIC_DC_OF_ILLIGAL_USE_ST(dc_OF_ILLIGAL_USE_ST);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_edit(@PathVariable("id") String id, Model model,
			IC_DC_OF_ILLIGAL_USE_ST dc_OF_ILLIGAL_USE_ST) {

		dc_OF_ILLIGAL_USE_ST.setILL_DC_ID(id);

		rowSqlDao.IC_DC_OF_ILLIGAL_USE_ST_edit(dc_OF_ILLIGAL_USE_ST);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST_delete/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_delete(@PathVariable("id") int id) {

		rowSqlDao.IC_DC_OF_ILLIGAL_USE_ST_delete(id);

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	@PostMapping("/IC_DC_OF_ILLIGAL_USE_ST_clear/{id}")
	public String IC_DC_OF_ILLIGAL_USE_ST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_DC_OF_ILLIGAL_USE_ST";
	}

	//////////////////////// Start Revenue Report

	@GetMapping("/IC_REV_TOP_SHEET")
	public String IC_REV_TOP_SHEET(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_TOP_SHEET";
	}
	@PostMapping("/IC_REV_TOP_SHEET")
	public String IC_REV_TOP_SHEETa(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model,ReportModel rm) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String sCertDate=null;
		try {
			Date date1=new SimpleDateFormat("yyyy-mm-dd").parse(rm.one);
			System.out.println(date1);
			SimpleDateFormat dateFormatYouWant = new SimpleDateFormat("dd-MMMM-YYYY");
			sCertDate = dateFormatYouWant.format(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		model.addAttribute("datea", sCertDate);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_REV_TOP_SHEET";
	}

	@GetMapping("/IC_REV_PER_ZONE")
	public String IC_REV_PER_ZONE(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_REV_PER_ZONE";
	}

	@PostMapping("/IC_REV_PER_ZONE")
	public String IC_REV_PER_ZONE_one(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		ArrayList<IC_REV_PER_ZONE> ic_REV_PER_ZONEs = i.listIC_REV_PER_ZONE(officeCode, rm.one, rm.two);
		model.addAttribute("ic_REV_PER_ZONEs", ic_REV_PER_ZONEs);
		
		ArrayList<IC_REV_PER_ZONE> ic_REV_PER_ZONE=new ArrayList<>();
		ArrayList<IC_REV_PER_ZONE> ic_REV_PER_ZONEa=new ArrayList<>();
		int lsize=ic_REV_PER_ZONEs.size();
		if(!ic_REV_PER_ZONEs.isEmpty()) {
			for(int i=0;i<lsize;i++) {
				if(i==lsize-1) {
					ic_REV_PER_ZONEa.add(ic_REV_PER_ZONEs.get(i));
				}else {
					ic_REV_PER_ZONE.add(ic_REV_PER_ZONEs.get(i));
				}
			}
			
				model.addAttribute("ic_REV_PER_ZONE", ic_REV_PER_ZONE);
				model.addAttribute("ic_REV_PER_ZONEa", ic_REV_PER_ZONEa);
				
		}	

		String zoneName = ic_REV_PER_ZONEs.get(0).getZoneName();
		model.addAttribute("zoneName", zoneName);

		String prvYear = ic_REV_PER_ZONEs.get(0).getPrevYear();
		model.addAttribute("prvYear", prvYear);

		String currYear = ic_REV_PER_ZONEs.get(0).getCurrYear();
		model.addAttribute("currYear", currYear);

		String PREV_YR_MON = ic_REV_PER_ZONEs.get(0).getDateone();
		model.addAttribute("PREV_YR_MON", PREV_YR_MON);

		String CURR_YR_MON = ic_REV_PER_ZONEs.get(0).getDatetwo();
		model.addAttribute("CURR_YR_MON", CURR_YR_MON);

		String PREV_FIN_LAST_MONTH = ic_REV_PER_ZONEs.get(0).getDatethree();
		model.addAttribute("PREV_FIN_LAST_MONTH", PREV_FIN_LAST_MONTH);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_REV_PER_ZONE";
	}

	@GetMapping("/IC_REV_PER_CIRCLE")
	public String IC_REV_PER_CIRCLE(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_REV_PER_CIRCLE";
	}

	@PostMapping("/IC_REV_PER_CIRCLE")
	public String IC_REV_PER_CIRCLE(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<IC_REV_PER_CIRCLE> iC_REV_PER_CIRCLEf = i.listIC_REV_PER_CIRCLE(officeCode, rm.two, rm.three);
		ArrayList<IC_REV_PER_CIRCLE> iC_REV_PER_CIRCLE=new ArrayList<>();
		ArrayList<IC_REV_PER_CIRCLE> iC_REV_PER_CIRCLEa=new ArrayList<>();
		int lsize=iC_REV_PER_CIRCLEf.size();
		if(!iC_REV_PER_CIRCLEf.isEmpty()) {
			for(int i=0;i<lsize;i++) {
				if(i==lsize-1) {
					iC_REV_PER_CIRCLEa.add(iC_REV_PER_CIRCLEf.get(i));
				}else {
					iC_REV_PER_CIRCLE.add(iC_REV_PER_CIRCLEf.get(i));
				}
			}
			
				model.addAttribute("iC_REV_PER_CIRCLE", iC_REV_PER_CIRCLE);
				model.addAttribute("iC_REV_PER_CIRCLEa", iC_REV_PER_CIRCLEa);
				String CIRCLE_NAME = iC_REV_PER_CIRCLE.get(0).getCIRCLE_NAME();
				model.addAttribute("CIRCLE_NAME", CIRCLE_NAME);

				String PREV_YEAR = iC_REV_PER_CIRCLE.get(0).getPREV_YEAR();
				model.addAttribute("PREV_YEAR", PREV_YEAR);

				String CURR_YEAR = iC_REV_PER_CIRCLE.get(0).getCURR_YEAR();
				model.addAttribute("CURR_YEAR", CURR_YEAR);
				
				String PREV_YR_MON = iC_REV_PER_CIRCLE.get(0).getPREV_YR_MON();
				model.addAttribute("PREV_YR_MON", PREV_YR_MON);

				String CURR_YR_MON = iC_REV_PER_CIRCLE.get(0).getCURR_YR_MON();
				model.addAttribute("CURR_YR_MON", CURR_YR_MON);
		}		
		
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		
		return "IC_REV_PER_CIRCLE";
	}

	@GetMapping("/IC_REV_PER_DIV")
	public String IC_REV_PER_DIV(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_REV_PER_DIV";
	}

	@PostMapping("/IC_REV_PER_DIV")
	public String IC_REV_PER_DIV_one(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		ArrayList<IC_REV_PER_DIV_MODEL> iC_REV_PER_DIV_MODEL = i.listIC_REV_PER_DIV(officeCode, rm.two, rm.three);
		model.addAttribute("iC_REV_PER_DIV_MODEL", iC_REV_PER_DIV_MODEL);
		String zone = iC_REV_PER_DIV_MODEL.get(0).getCircleName();
		model.addAttribute("zone", zone);

		return "IC_REV_PER_DIV";
	}

	@GetMapping("/IC_REV_CAT_ACC_REC")
	public String IC_REV_CAT_ACC_REC(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_REV_CAT_ACC_REC";
	}

	@PostMapping("/IC_REV_CAT_ACC_REC")
	public String IC_REV_CAT_ACC_REC_one(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODEL = i.listIC_REV_CAT_ACC_REC_MODEL(officeCode,
				rm.two, rm.three);
		model.addAttribute("iC_REV_CAT_ACC_REC_MODEL", iC_REV_CAT_ACC_REC_MODEL);
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODELE=new ArrayList<>();
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODELa=new ArrayList<>();
		int lsize=iC_REV_CAT_ACC_REC_MODEL.size();
		if(!iC_REV_CAT_ACC_REC_MODEL.isEmpty()) {
			for(int i=0;i<lsize;i++) {
				if(i==lsize-1) {
					iC_REV_CAT_ACC_REC_MODELa.add(iC_REV_CAT_ACC_REC_MODEL.get(i));
				}else {
					iC_REV_CAT_ACC_REC_MODELE.add(iC_REV_CAT_ACC_REC_MODEL.get(i));
				}
			}
			
				model.addAttribute("iC_REV_CAT_ACC_REC_MODELE", iC_REV_CAT_ACC_REC_MODELE);
				model.addAttribute("iC_REV_CAT_ACC_REC_MODELa", iC_REV_CAT_ACC_REC_MODELa);
				
		}	

		String name = iC_REV_CAT_ACC_REC_MODEL.get(0).getCircleName();
		model.addAttribute("name", name);

		return "IC_REV_CAT_ACC_REC";
	}
	@GetMapping("/IC_REV_CAT_ACC_REC_CIRCLE")
	public String IC_REV_CAT_ACC_REC_CIRCLE_three(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		return "IC_REV_CAT_ACC_REC_CIRCLE";
	}

	@PostMapping("/IC_REV_CAT_ACC_REC_CIRCLE")
	public String IC_REV_CAT_ACC_REC_four(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);

		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODEL = i.listIC_REV_CAT_ACC_REC_MODEL_two(officeCode,
				rm.one, rm.three);
		model.addAttribute("iC_REV_CAT_ACC_REC_MODEL", iC_REV_CAT_ACC_REC_MODEL);
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODELE=new ArrayList<>();
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> iC_REV_CAT_ACC_REC_MODELa=new ArrayList<>();
		int lsize=iC_REV_CAT_ACC_REC_MODEL.size();
		if(!iC_REV_CAT_ACC_REC_MODEL.isEmpty()) {
			for(int i=0;i<lsize;i++) {
				if(i==lsize-1) {
					iC_REV_CAT_ACC_REC_MODELa.add(iC_REV_CAT_ACC_REC_MODEL.get(i));
				}else {
					iC_REV_CAT_ACC_REC_MODELE.add(iC_REV_CAT_ACC_REC_MODEL.get(i));
				}
			}
			
				model.addAttribute("iC_REV_CAT_ACC_REC_MODELE", iC_REV_CAT_ACC_REC_MODELE);
				model.addAttribute("iC_REV_CAT_ACC_REC_MODELa", iC_REV_CAT_ACC_REC_MODELa);
				
		}	

		String name = iC_REV_CAT_ACC_REC_MODEL.get(0).getCircleName();
		model.addAttribute("name", name);

		return "IC_REV_CAT_ACC_REC_CIRCLE";
	}

	@GetMapping("/END_SHEET")
	public String END_SHEET(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "END_SHEET";
	}

	// End Revenue Report

	// Start khondokar
	@GetMapping("/IC_USAGE_CATEGORY_CODE")
	public String ic_usage_category_code(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USAGE_CATEGORY_CODE ic_usage_category_code = new IC_USAGE_CATEGORY_CODE();

		ArrayList<IC_USAGE_CATEGORY_CODE> listIC_USAGE_CATEGORY_CODE = i.listIC_USAGE_CATEGORY_CODE();
		model.addAttribute("listIC_USAGE_CATEGORY_CODE", listIC_USAGE_CATEGORY_CODE);

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		model.addAttribute("ic_usage_category_code", ic_usage_category_code);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_CATEGORY_CODE";
	}

	@PostMapping("/IC_USAGE_CATEGORY_CODE")
	public String ic_usage_category_code_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_USAGE_CATEGORY_CODE ic_usage_category_code) {
		System.out.println(ic_usage_category_code);
		i.insertICUsageCatCode(ic_usage_category_code,user_name);

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@GetMapping("/IC_USAGE_CATEGORY_CODE/{id}")
	public String ic_usage_category_code_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_USAGE_CATEGORY_CODE ic_usage_category_code = i.singleIC_USAGE_CATEGORY_CODE(id);

		ArrayList<IC_USAGE_CATEGORY_CODE> listIC_USAGE_CATEGORY_CODE = i.listIC_USAGE_CATEGORY_CODE();

		ArrayList<UsagArea> areaList = i.showAreaName();
		model.addAttribute("areaList", areaList);

		ArrayList<LineType> areaList1 = i.showLine();
		model.addAttribute("areaList1", areaList1);

		model.addAttribute("ic_usage_category_code", ic_usage_category_code);
		model.addAttribute("listIC_USAGE_CATEGORY_CODE", listIC_USAGE_CATEGORY_CODE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_CATEGORY_CODE";
	}

	@PostMapping("/IC_USAGE_CATEGORY_CODE/{id}")
	public String ic_usage_category_code_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model,
			IC_USAGE_CATEGORY_CODE ic_usage_category_code) {

		ic_usage_category_code.setUSAGE_CAT_ID(id);

		i.editICUsageCatCode(ic_usage_category_code,user_name);

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

	@PostMapping("/IC_USAGE_CATEGORY_CODE_delete/{id}")
	public String IC_USAGE_CATEGORY_CODE_delete(@PathVariable("id") int id) {

		i.deleteICUsageCatCode(id);

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

//		CLEAR IC_USAGE_CATEGORY_CODE START
	@PostMapping("/IC_USAGE_CATEGORY_CODE_clear/{id}")
	public String IC_USAGE_CATEGORY_CODE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USAGE_CATEGORY_CODE";
	}

//Updated Location
	@GetMapping("/IC_LOCATION_MASTER_STATUS")
	public String locationNew(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		InsLocation insLocation = new InsLocation();
		model.addAttribute("insLocation", insLocation);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "locationNew";
	}

	@PostMapping("/locationNew")
	public String locationPosts(@CookieValue(value = "user_name", defaultValue = "") String user_name,Model model, InsLocation insLocation) {
		i.insertLocations(insLocation,user_name);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	String aZone;
	String bCircle;
	String cDiv;
	String dComCen;
	String eOffCode;

	@GetMapping("/locationNew/{id}")
	public String locationNewEdit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") int id,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		InsLocation insLocations = new InsLocation();
		model.addAttribute("insLocations", insLocations);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		ArrayList<LocationEditM> locationEditM = i.locationEdits(id);
		model.addAttribute("locationEditM", locationEditM);

		String Code = locationEditM.get(0).getpLOCATION_CODE();
		model.addAttribute("Code", Code);

		String name = locationEditM.get(0).getpLOCATION_NAME();
		model.addAttribute("name", name);

		String zone = locationEditM.get(0).getpZONE_DESC();
		model.addAttribute("zone", zone);

		String circle = locationEditM.get(0).getpCIRCLE_DESC();
		model.addAttribute("circle", circle);

		String subDiv = locationEditM.get(0).getpSUB_DIV_CODE();
		model.addAttribute("subDiv", subDiv);

		String comCen = locationEditM.get(0).getpCOMP_CNTR_NAME();
		model.addAttribute("comCen", comCen);

		String div = locationEditM.get(0).getpDIV_DESC();
		model.addAttribute("div", div);

		aZone = locationEditM.get(0).getpZONE_CODE();
		bCircle = locationEditM.get(0).getpCIRCLE_CODE();
		cDiv = locationEditM.get(0).getpDIV_CODE();
		dComCen = locationEditM.get(0).getpCOMP_CNTR_CODE();
		eOffCode = locationEditM.get(0).getpOFFICE_CODE();

		String ss = "S&D Bhairab";
		model.addAttribute("ss", ss);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "locationnewedit";
	}

	@PostMapping("/locationNew/{id}")
	public String locationNewUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") int id,
			Model model, InsLocation insLocations) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<OfficeDrop> officeDrop = i.officeDropdown();
		model.addAttribute("officeDrop", officeDrop);

		i.updateLocations(insLocations, aZone, bCircle, cDiv, dComCen, eOffCode, id,user_name);

		ArrayList<OfficeDrop> comDrop = i.comDropdown();
		model.addAttribute("comDrop", comDrop);

		ArrayList<LocationListModel> locationListModel = i.locationList();
		model.addAttribute("locationListModel", locationListModel);

		ArrayList<LocationEditM> locationEditM = i.locationEdits(id);
		model.addAttribute("locationEditM", locationEditM);

		String ss = "S&D Bhairab";
		model.addAttribute("ss", ss);

		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = i.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	/*
	 * @GetMapping("/IC_LOCATION_MASTER_STATUS") public String location(Model model)
	 * { if (dynamicMenu.equals("")) { return "redirect:/"; }
	 * ArrayList<LocationShow> locationShow = i.locationShow();
	 * model.addAttribute("locationShow", locationShow);
	 * 
	 * LocationInsert locationInsert = new LocationInsert();
	 * model.addAttribute("locationInsert", locationInsert);
	 * 
	 * model.addAttribute("dataHtml", dynamicMenu);
	 * 
	 * return "location"; }
	 * 
	 * @PostMapping("/IC_LOCATION_MASTER_STATUS") public String locationPost(Model
	 * model, LocationInsert locationInsert) { if (dynamicMenu.equals("")) { return
	 * "redirect:/"; }
	 * 
	 * i.insert_location_master(locationInsert);
	 * 
	 * return "redirect:/IC_LOCATION_MASTER_STATUS"; }
	 */

	@GetMapping("/locationDelete/{id}")
	public String delete_location(@PathVariable("id") int id, Model model) {

		int result = i.deleteLocation(id);
		System.out.println(result);
		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationEdit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}

		ArrayList<LocationShow> locationShow = i.locationShow();
		model.addAttribute("locationShow", locationShow);

		ArrayList<LocationInsert> locationEdit = i.locationEdit(id);
		model.addAttribute("locationEdit", locationEdit);

		String locName = locationEdit.get(0).getLocationName();
		model.addAttribute("locName", locName);

		String locCode = locationEdit.get(0).getLocationCode();
		model.addAttribute("locCode", locCode);

		LocationInsert locationInsert = new LocationInsert();
		model.addAttribute("locationInsert", locationInsert);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "locationEdit";
	}

	@PostMapping("/IC_LOCATION_MASTER_EDIT/{id}")
	public String locationUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, LocationInsert locationInsert) {

		i.location_update(locationInsert, id,user_name);

		return "redirect:/IC_LOCATION_MASTER_STATUS";
	}

	@GetMapping("/IC_GEN_AREA")
	public String ic_gen_area(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_GEN_AREAmain ic_gen_area = new IC_GEN_AREAmain();

		ArrayList<IC_GEN_AREAmain> listIC_GEN_AREA = i.listIC_GEN_AREA();
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);

		model.addAttribute("ic_gen_area", ic_gen_area);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_AREA";
	}

	@PostMapping("/IC_GEN_AREA")
	public String ic_gen_area_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_GEN_AREAmain ic_gen_area) {

		i.insertICGenArea(ic_gen_area,user_name);

		return "redirect:/IC_GEN_AREA";
	}

	@GetMapping("/IC_GEN_AREA/{id}")
	public String ic_gen_area_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_GEN_AREAmain ic_gen_area = i.singleIC_GEN_AREA(id);

		ArrayList<IC_GEN_AREAmain> listIC_GEN_AREA = i.listIC_GEN_AREA();

		model.addAttribute("ic_gen_area", ic_gen_area);
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_AREA";
	}

	@PostMapping("/IC_GEN_AREA/{id}")
	public String ic_demand_phase_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_GEN_AREAmain ic_gen_area) {

		ic_gen_area.setGEN_AREA_ID(id);

		i.editICGenArea(ic_gen_area,user_name);

		return "redirect:/IC_GEN_AREA";
	}

	@PostMapping("/IC_GEN_AREA_delete/{id}")
	public String IC_GEN_AREA_delete(@PathVariable("id") int id) {

		i.deleteICGenArea(id);

		return "redirect:/IC_GEN_AREA";
	}

//		CLEAR IC_GEN_AREA START
	@PostMapping("/IC_GEN_AREA_clear/{id}")
	public String IC_GEN_AREA_clear(@PathVariable("id") int id) {

		return "redirect:/IC_GEN_AREA";
	}

	// IC_POWER_PLANT starts

	@GetMapping("/IC_POWER_PLANT")
	public String ic_power_plantm(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_POWER_PLANTmain ic_power_plantm = new IC_POWER_PLANTmain();

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);

		ArrayList<GenArea> genArea = i.genAreaLists();
		model.addAttribute("genArea", genArea);

		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
		model.addAttribute("pPOwnerList", pPOwnerList);

		ArrayList<GridList> gridList = i.gridLists();
		model.addAttribute("gridList", gridList);

		model.addAttribute("ic_power_plantm", ic_power_plantm);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_POWER_PLANT";
	}

	@PostMapping("/IC_POWER_PLANT")
	public String ic_power_plant_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_POWER_PLANTmain ic_power_plantm) {

		convergeDaoSurovi.insertICPowerPlant(ic_power_plantm,user_name);

		return "redirect:/IC_POWER_PLANT";
	}

	@GetMapping("/IC_POWER_PLANT/{id}")
	public String ic_power_plant_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_POWER_PLANTmain ic_power_plantm = convergeDaoSurovi.singleIC_POWER_PLANT(id);

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();

		ArrayList<GenArea> genArea = i.genAreaLists();
		model.addAttribute("genArea", genArea);

		ArrayList<PPOwnerList> pPOwnerList = i.ppOwnerLists();
		model.addAttribute("pPOwnerList", pPOwnerList);

		ArrayList<GridList> gridList = i.gridLists();
		model.addAttribute("gridList", gridList);

		model.addAttribute("ic_power_plantm", ic_power_plantm);
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_POWER_PLANT";
	}

	@PostMapping("/IC_POWER_PLANT/{id}")
	public String ic_power_plant_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_POWER_PLANTmain ic_power_plantm) {

		ic_power_plantm.setPP_ID(id);

		convergeDaoSurovi.editICPPowerPlant(ic_power_plantm,user_name);

		return "redirect:/IC_POWER_PLANT";
	}

	@PostMapping("/IC_POWER_PLANT_delete/{id}")
	public String IC_POWER_PLANT_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICPowerPlant(id);

		return "redirect:/IC_POWER_PLANT";
	}

//		CLEAR IC_POWER_PLANT START
	@PostMapping("/IC_POWER_PLANT_clear/{id}")
	public String IC_POWER_PLANT_clear(@PathVariable("id") int id) {

		return "redirect:/IC_POWER_PLANT";
	}

	// IC_PP_UNIT_DTL START

	@GetMapping("/IC_PP_UNIT_DTL/{ppC}")
	public String ic_pp_unit_dlt(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("ppC") String ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_UNIT_DTL ic_pp_unit_dlt = new IC_PP_UNIT_DTL();

		ArrayList<IC_VOLT_CAT_MST> listIC_VOLT_CAT_MST = convergeDaoSurovi.listIC_VOLT_CAT_MST();
		model.addAttribute("listIC_VOLT_CAT_MST", listIC_VOLT_CAT_MST);

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);

		ArrayList<IC_PP_UNIT_DTL> listIC_PP_UNIT_DTL = convergeDaoSurovi.listIC_PP_UNIT_DTL(ppCode);
		model.addAttribute("ic_pp_unit_dlt", ic_pp_unit_dlt);
		model.addAttribute("listIC_PP_UNIT_DTL", listIC_PP_UNIT_DTL);
		model.addAttribute("flag", flag);
		model.addAttribute("ppCode", ppCode);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_UNIT_DTL";
	}

	@PostMapping("/IC_PP_UNIT_DTL/{ppC}")
	public String ic_pp_unit_dlt_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("ppC") String ppCode, IC_PP_UNIT_DTL ic_pp_unit_dlt) {

		convergeDaoSurovi.insertIcPpUnitDtl(ic_pp_unit_dlt,user_name);

		System.out.println(ic_pp_unit_dlt);

		return "redirect:/IC_PP_UNIT_DTL/" + ppCode;
	}

	@GetMapping("/IC_PP_UNIT_DTL/{ppC}/{id}")
	public String ic_pp_unit_dlt_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("ppC") String ppCode, @PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_UNIT_DTL ic_pp_unit_dlt = convergeDaoSurovi.singleIC_PP_UNIT_DTL(id);

		ArrayList<IC_PP_UNIT_DTL> listIC_PP_UNIT_DTL = convergeDaoSurovi.listIC_PP_UNIT_DTL(ppCode);

		ArrayList<IC_VOLT_CAT_MST> listIC_VOLT_CAT_MST = convergeDaoSurovi.listIC_VOLT_CAT_MST();
		model.addAttribute("listIC_VOLT_CAT_MST", listIC_VOLT_CAT_MST);

		ArrayList<IC_POWER_PLANTmain> listIC_POWER_PLANT = convergeDaoSurovi.listIC_POWER_PLANT();
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);

		model.addAttribute("ic_pp_unit_dlt", ic_pp_unit_dlt);
		model.addAttribute("listIC_PP_UNIT_DTL", listIC_PP_UNIT_DTL);
		model.addAttribute("flag", flag);
		model.addAttribute("ppCode", ppCode);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_UNIT_DTL";
	}

	@PostMapping("/IC_PP_UNIT_DTL/{ppC}/{id}")
	public String ic_pp_unit_dlt_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("ppC") String ppCode, @PathVariable("id") int id, Model model,
			IC_PP_UNIT_DTL ic_pp_unit_dlt) {

		ic_pp_unit_dlt.setPP_UNIT_ID(id);

		convergeDaoSurovi.editIcPpUnitDtl(ic_pp_unit_dlt,user_name);

		return "redirect:/IC_PP_UNIT_DTL/" + ppCode;
	}

	@PostMapping("/IC_PP_UNIT_DTL_delete/{ppC}/{id}")
	public String IC_PP_UNIT_DTL_delete(@PathVariable("ppC") String ppCode, @PathVariable("id") int id) {

		convergeDaoSurovi.deleteIcPpUnitDtl(id);

		return "redirect:/IC_PP_UNIT_DTL/" + ppCode;
	}

	// CLEAR IC_PP_UNIT_DTL START
	@PostMapping("/IC_PP_UNIT_DTL_clear/{ppC}")
	public String IC_PP_UNIT_DTL_clear(@PathVariable("ppC") int ppCode) {

		return "redirect:/IC_PP_UNIT_DTL/" + ppCode;
	}

	@GetMapping("/IC_DEMAND_PHASE_MST")
	public String ic_demand_phase_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_DEMAND_PHASE_MST ic_demand_phase_mst = new IC_DEMAND_PHASE_MST();

		ArrayList<IC_DEMAND_PHASE_MST> listIC_DEMAND_PHASE_MST = i.listIC_DEMAND_PHASE_MST();
		model.addAttribute("listIC_DEMAND_PHASE_MST", listIC_DEMAND_PHASE_MST);

		model.addAttribute("ic_demand_phase_mst", ic_demand_phase_mst);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DEMAND_PHASE_MST";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST")
	public String ic_demand_phase_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_DEMAND_PHASE_MST ic_demand_phase_mst) {

		i.insertICDemandPhaseMst(ic_demand_phase_mst,user_name);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_DEMAND_PHASE_MST/{id}")
	public String ic_demand_phase_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_DEMAND_PHASE_MST ic_demand_phase_mst = i.singleIC_DEMAND_PHASE_MST(id);

		ArrayList<IC_DEMAND_PHASE_MST> listIC_DEMAND_PHASE_MST = i.listIC_DEMAND_PHASE_MST();

		model.addAttribute("ic_demand_phase_mst", ic_demand_phase_mst);
		model.addAttribute("listIC_DEMAND_PHASE_MST", listIC_DEMAND_PHASE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DEMAND_PHASE_MST";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST/{id}")
	public String ic_demand_phase_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model,
			IC_DEMAND_PHASE_MST ic_demand_phase_mst) {

		ic_demand_phase_mst.setDP_ID(id);

		i.editICDemandPhaseMst(ic_demand_phase_mst,user_name);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@PostMapping("/IC_DEMAND_PHASE_MST_delete/{id}")
	public String IC_DEMAND_PHASE_MST_delete(@PathVariable("id") int id) {

		i.deleteICDemandPhaseMst(id);

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

//		CLEAR IC_DEMAND_PHASE_MST START
	@PostMapping("/IC_DEMAND_PHASE_MST_clear/{id}")
	public String IC_DEMAND_PHASE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_DEMAND_PHASE_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST")
	public String ic_activity_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_ACTIVITY_MST ic_activity_mst = new IC_ACTIVITY_MST();

		ArrayList<IC_ACTIVITY_MST> listIC_ACTIVITY_MST = i.listIC_ACTIVITY_MST();
		model.addAttribute("listIC_ACTIVITY_MST", listIC_ACTIVITY_MST);

		model.addAttribute("ic_activity_mst", ic_activity_mst);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ACTIVITY_MST";
	}

	@PostMapping("/IC_ACTIVITY_MST")
	public String ic_activity_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_ACTIVITY_MST ic_activity_mst) {

		i.insertICActivityMst(ic_activity_mst,user_name);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@GetMapping("/IC_ACTIVITY_MST/{id}")
	public String ic_activity_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_ACTIVITY_MST ic_activity_mst = i.singleIC_ACTIVITY_MST(id);

		ArrayList<IC_ACTIVITY_MST> listIC_ACTIVITY_MST = i.listIC_ACTIVITY_MST();

		model.addAttribute("ic_activity_mst", ic_activity_mst);
		model.addAttribute("listIC_ACTIVITY_MST", listIC_ACTIVITY_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ACTIVITY_MST";
	}

	@PostMapping("/IC_ACTIVITY_MST/{id}")
	public String ic_activity_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model, IC_ACTIVITY_MST ic_activity_mst) {

		ic_activity_mst.setACTIVITY_ID(id);

		i.editICActivityMst(ic_activity_mst,user_name);

		return "redirect:/IC_ACTIVITY_MST";
	}

	@PostMapping("/IC_ACTIVITY_MST_delete/{id}")
	public String IC_ACTIVITY_MST_delete(@PathVariable("id") int id) {

		i.deleteICActivityMst(id);

		return "redirect:/IC_ACTIVITY_MST";
	}

//		CLEAR IC_ACTIVITY_MST START
	@PostMapping("/IC_ACTIVITY_MST_clear/{id}")
	public String IC_ACTIVITY_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_ACTIVITY_MST";
	}


	@GetMapping("/IC_GEN_MOD_APP")
	public String perionList(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlist";
	}

	@GetMapping("/IC_GEN_MOD_APP_BULK")
	public String perionListbulk(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlistBulk";
	}

	@GetMapping("/IC_PP_MOD_UNIT_BULK/{id}")
	public String IC_PP_GEN(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") String id,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ModUnitBulk reportModel = new ModUnitBulk();
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		model.addAttribute("bccode", id);
		ArrayList<Dpd_pp_wise_gen_blk> Dpd_pp_gen = i.IC_ES_GEN_BLK(id, officeCode);
		model.addAttribute("Dpd_pp_gen", Dpd_pp_gen);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "IC_ES_PP_GEN_BLK";
	}

	@GetMapping("/IC_PP_MOD_UNIT_BULK/{id}/{bccode}")
	public String IC_PP_GENa(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") String id,
			@PathVariable("bccode") String bccode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		if (Integer.valueOf(id) > 0) {
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			model.addAttribute("bccode", bccode);

			ArrayList<Dpd_pp_wise_gen_blk> Dpd_pp_gen = i.IC_ES_GEN_BLK(bccode, officeCode);
			model.addAttribute("Dpd_pp_gen", Dpd_pp_gen);

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			ModUnitBulk unitModInset = i.ppUnitEdits(id);
			model.addAttribute("unitModInset", unitModInset);
			return "IC_ES_PP_GEN_BULK";
		} else {
			ModUnitBulk reportModel = new ModUnitBulk();
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			model.addAttribute("bccode", bccode);
			ArrayList<Dpd_pp_wise_gen_blk> Dpd_pp_gen = i.IC_ES_GEN_BLK(bccode, officeCode);
			model.addAttribute("Dpd_pp_gen", Dpd_pp_gen);

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			model.addAttribute("reportModel", reportModel);
			return "IC_ES_PP_GEN_BLK";
		}
	}

	@PostMapping("/IC_PP_MOD_UNIT_BULK/{id}/{bccode}")
	public String modtListUpdatea(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, @PathVariable("bccode") int bccode,
			ModUnitBulk modUnitBulk) {
		i.updatePpModBulk(modUnitBulk,user_name);

		return "redirect:/IC_PP_MOD_UNIT_BULK/" + id + "/" + bccode;
	}

	@GetMapping("/IC_IPP_PAYMENT_BULK")
	public String perionListPPbulk(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlistPPBulk";
	}

	@GetMapping("/IC_PP_PAYMENT_BULK/{id}")
	public String icPpPaymentListBlk(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//paymentData = id;
		model.addAttribute("id", id);
		
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(id,user_name);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(id, user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);
		
		List<DrpDwn> listDrpDwn = rowSqlDao.listDrpDwn();
		model.addAttribute("listDrpDwn", listDrpDwn);
		List<IPP_CURRENCY_DROPDOWN> listDrpDwnC = rowSqlDao.listDrpDwnC();
		model.addAttribute("listDrpDwnC", listDrpDwnC);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppaymentBlk";
	}

	@GetMapping("/IC_IPP_PAYMENT_EDIT_BLK/{id}/{billcycle}")
	public String icPpPaymentEditBlk(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") String id, @PathVariable("billcycle") String billcycle, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList(billcycle,user_name);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<IcPpPaymentEdit> icPpPaymentEdit = i.icPaymentEdit(id);
		model.addAttribute("icPpPaymentEdit", icPpPaymentEdit);
		if(!icPpPaymentEdit.isEmpty()) {
			String billCycle = icPpPaymentEdit.get(0).getBillCycleCode();
			model.addAttribute("billCycle", billCycle);
			
			String country = icPpPaymentEdit.get(0).getCONTRY_NAME();
			model.addAttribute("country", country);
			
			String currency = icPpPaymentEdit.get(0).getCURR_NAME();
			model.addAttribute("currency", currency);
			

			String powerPlantName = icPpPaymentEdit.get(0).getPpName();
			model.addAttribute("powerPlantName", powerPlantName);
			
			String CONTRY_NAME = icPpPaymentEdit.get(0).getCONTRY_NAME();
			model.addAttribute("CONTRY_NAME", CONTRY_NAME);
			
			String CURR_NAME = icPpPaymentEdit.get(0).getCURR_NAME();
			model.addAttribute("CURR_NAME", CURR_NAME);
			String CURR_CODE = icPpPaymentEdit.get(0).getCURR_CODE();
			model.addAttribute("CURR_CODE", CURR_CODE);
			
			String e = icPpPaymentEdit.get(0).getEnrgPuchansed();
			model.addAttribute("e", e);

			String p = icPpPaymentEdit.get(0).getPayAmount();
			model.addAttribute("p", p);
		}		
		
		List<DrpDwn> listDrpDwn = rowSqlDao.listDrpDwn();
		model.addAttribute("listDrpDwn", listDrpDwn);
		List<IPP_CURRENCY_DROPDOWN> listDrpDwnC = rowSqlDao.listDrpDwnC();
		model.addAttribute("listDrpDwnC", listDrpDwnC);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppaymenteditBlk";
	}

	@PostMapping("/IC_IPP_PAYMENT_EDIT_BLK/{id}/{billCycle}")
	public String icPpPaymentUpdateblk(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, @PathVariable("billCycle") int billCycle,
			Model model, IcPpPaymentEdit icPpPaymentEdit) {
		i.updatePayment(icPpPaymentEdit, id,user_name);
		return "redirect:/IC_PP_PAYMENT_BULK/" + billCycle;
	}

	//String pathvar = "";
	//String ppModIdpv = "";

	@GetMapping("/IC_PP_MOD/{billCycleCode}")
	public String modtList(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//pathvar = PERIOD_CODE;
		model.addAttribute("billCycleCode", billCycleCode);
		ArrayList<PpModList> ppModList = i.ppModListListShow(billCycleCode, user_name);
		model.addAttribute("ppModList", ppModList);
		/*if (!ppModList.isEmpty()) {
			pp_code = ppModList.get(0).getPpCode();
		}*/
		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertPpMod insertPpMod = new InsertPpMod();
		model.addAttribute("insertPpMod", insertPpMod);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmod";
	}

	@GetMapping("/IC_PP_MODS/{billCycleCode}/{ppModId}/{ppCode}")
	public String modtLists(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode, @PathVariable("ppModId") String ppModId,@PathVariable("ppCode") String ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//pathvar = id;
		//ppModIdpv = ppModId;
		model.addAttribute("billCycleCode", billCycleCode);
		ArrayList<PpModList> ppModList = i.ppModListListShow(billCycleCode, user_name);
		model.addAttribute("ppModList", ppModList);
		int index = 0;
		for (int i = 0; i < ppModList.size(); i++) {
			if (ppModList.get(i).getPpModId() == Integer.valueOf(ppModId)) {
				index = i;
			}
		}
		/*if(!ppModList.isEmpty()) {
			pp_code = ppModList.get(index).getPpCode();
			model.addAttribute("pp_code", pp_code);
		}*/
		
		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertPpMod insertPpMod = i.ppModListListShows(billCycleCode, ppModId);
		model.addAttribute("insertPpMod", insertPpMod);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmode";
	}

	@PostMapping("/IC_PP_MOD/{billCycleCode}")
	public String modPost(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("billCycleCode") String billCycleCode, InsertPpMod insertPpMod) {
		i.insertPpMod(insertPpMod,user_name);

		return "redirect:/IC_PP_MOD/" + billCycleCode;
	}

	//String pp_code;
	//String pp_names;

	@GetMapping("/IC_PP_MOD_EDIT/{billCycleCode}/{ppModId}/{ppCode}")
	public String modtListEdit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("billCycleCode") String billCycleCode,
			@PathVariable("ppModId") int ppModId,@PathVariable("ppCode") int ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("billCycleCode", billCycleCode);
		ArrayList<PpModList> ppModList = i.ppModListListShow(billCycleCode, user_name);
		model.addAttribute("ppModList", ppModList);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.pppDropdown(user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<PpModEdit> ppModEdit = i.ppModEdit(ppModId);
		model.addAttribute("ppModEdit", ppModEdit);

		String pp_name = ppModEdit.get(0).getPpName();
		model.addAttribute("pp_name", pp_name);

		//pp_names = pp_name;
		/*pp_code = ppModEdit.get(0).getPpCode();
		model.addAttribute("pp_code", pp_code);*/

		InsertPpMod insertPpMod = new InsertPpMod();
		model.addAttribute("insertPpMod", insertPpMod);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icppmode";
	}

	
	@PostMapping("/IC_PP_MOD_EDIT/{billCycleCode}/{ppModId}/{ppCode}")
	public String modtListUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode, @PathVariable("ppModId") int ppModId,
			@PathVariable("ppCode") int ppCode, Model model, InsertPpMod insertPpMod) {
		i.updatePpMod(insertPpMod, insertPpMod.getPpCode(),  insertPpMod.getPpModId(),user_name);

		return "redirect:/IC_PP_MOD/" + billCycleCode;
	}
	
	
	@GetMapping("/IC_PP_MOD_DELETE/{billCycleCode}/{ppModId}/{ppCode}")
	public String modtListdELETE(@PathVariable("billCycleCode") String billCycleCode, @PathVariable("ppModId") int ppModId, 
			@PathVariable("ppCode") int ppCode ) {
		i.deleteIcPpMod(ppModId);

		return "redirect:/IC_PP_MOD/" + billCycleCode;
	}

	//String paymentData;

	@GetMapping("/IC_IPP_PAYMENT/{billCycleCode}/{ppCode}")
	public String icPpPaymentList(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//paymentData = id;
		model.addAttribute("billCycleCode", billCycleCode);
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList1(billCycleCode, ppCode);
		model.addAttribute("ippPaymentList", ippPaymentList);

		//model.addAttribute("pp_code", pp_code);
		//model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(billCycleCode, user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppayment";
	}

	@PostMapping("/IC_IPP_PAYMENT/{billCycleCode}/{ppCode}")
	public String icPpPaymentInsert(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, Model model, InsertIppPayment insertIppPayment) {
		i.insertPppPayment(insertIppPayment,user_name);

		return "redirect:/IC_IPP_PAYMENT/" + billCycleCode+'/'+ppCode;
	}

	@GetMapping("/IC_IPP_PAYMENT_DELETE/{id}")
	public String ic_ipp_payment_delete(Model model,InsertIppPayment insertIppPayment, @PathVariable("id") int id) {
		i.deleteIcPpPayment(id);

		return "redirect:/IC_IPP_PAYMENT/" + insertIppPayment.getBillCycleCode();
	}

	@GetMapping("/IC_IPP_PAYMENT_EDIT/{billCycleCode}/{ppCode}")
	public String icPpPaymentEdit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<IppPaymentList> ippPaymentList = i.ippPaymentList1(billCycleCode, ppCode);
		model.addAttribute("ippPaymentList", ippPaymentList);

		ArrayList<IcPpPaymentEdit> icPpPaymentEdit = i.icPaymentEdit(ippPaymentList.get(0).getPpPayId());
		model.addAttribute("icPpPaymentEdit", icPpPaymentEdit);

		String billCycle = icPpPaymentEdit.get(0).getBillCycleCode();
		model.addAttribute("billCycle", billCycle);

		String powerPlantName = icPpPaymentEdit.get(0).getPpName();
		model.addAttribute("powerPlantName", powerPlantName);

		String e = icPpPaymentEdit.get(0).getEnrgPuchansed();
		model.addAttribute("e", e);

		String p = icPpPaymentEdit.get(0).getPayAmount();
		model.addAttribute("p", p);

		InsertIppPayment insertIppPayment = new InsertIppPayment();
		model.addAttribute("insertIppPayment", insertIppPayment);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icpppaymentedit";
	}

	@PostMapping("/IC_IPP_PAYMENT_EDIT/{billCycleCode}/{ppCode}/{id}")
	public String icPpPaymentUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, @PathVariable("id") int id, Model model, IcPpPaymentEdit icPpPaymentEdit) {
		i.updatePayment(icPpPaymentEdit, id,user_name);
		return "redirect:/IC_IPP_PAYMENT/" +billCycleCode+'/'+ppCode;
	}

	//String bcyclecode;

	@GetMapping("/IC_PP_UNIT_MOD/{billCycleCode}/{ppCode}")
	public String icPpUnitModList(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("billCycleCode", billCycleCode);
		//bcyclecode = id;

		ArrayList<UnitModList> unitModList = i.UnitModShow(billCycleCode, ppCode);
		model.addAttribute("unitModList", unitModList);

		model.addAttribute("pp_code", ppCode);
		//model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(billCycleCode, user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<PpUnitDtlDrop> ppUnitDtlDrop = i.ppUnitDropdown(ppCode);
		model.addAttribute("ppUnitDtlDrop", ppUnitDtlDrop);

		UnitModInset unitModInset = new UnitModInset();
		model.addAttribute("unitModInset", unitModInset);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icunitmod";
	}

	@PostMapping("/IC_PP_UNIT_MOD/{billCycleCode}/{ppCode}/{id}")
	public String icPpUnitModPost(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, Model model, UnitModInset unitModInset) {
		i.insertUnitMod(unitModInset,user_name);

		return "redirect:/IC_PP_UNIT_MOD/"+billCycleCode+'/'+ppCode ;
	}

	//String ppUnitCode;

	@GetMapping("/IC_PP_UNIT_MOD_EDIT/{billCycleCode}/{ppCode}/{id}")
	public String icPpUnitModedit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode,@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<ReportModel> status = new ArrayList<>();
		status.add(new ReportModel("N", "NO", "", "", ""));
		status.add(new ReportModel("Y", "YES", "", "", ""));
		model.addAttribute("status", status);
		model.addAttribute("billCycleCode", billCycleCode);
		
		String flag = "1";
		model.addAttribute("flag", flag);
		
		
		ArrayList<UnitModList> unitModList = i.UnitModShow(billCycleCode, ppCode);
		model.addAttribute("unitModList", unitModList);

		model.addAttribute("pp_code", ppCode);
		//model.addAttribute("pp_names", pp_names);

		ArrayList<PowerPlantDropdown> powerPlantDropdown = i.ppDropdown(billCycleCode, user_name);
		model.addAttribute("powerPlantDropdown", powerPlantDropdown);

		ArrayList<UnirmodEdit> unirmodEdit = i.ppUnitEdit(id);
		model.addAttribute("unirmodEdit", unirmodEdit);
		if (!unirmodEdit.isEmpty()) {
			model.addAttribute("sStatus", unirmodEdit.get(0).getSTATUS());

			String ppUnitCode = unirmodEdit.get(0).getPpUnitCode();
			model.addAttribute("ppUnitCode", ppUnitCode);
			String ppName = unirmodEdit.get(0).getPpUnitName();
			model.addAttribute("ppName", ppName);

			model.addAttribute("enrg_gen", unirmodEdit.get(0).getEngrGen());

			model.addAttribute("enrg_cons_self", unirmodEdit.get(0).getEngrConsSelf());

			model.addAttribute("fuel_used",
					unirmodEdit.get(0).getFuelUsed().equals("0") ? "" : unirmodEdit.get(0).getFuelUsed());
		}
		ArrayList<PpUnitDtlDrop> ppUnitDtlDrop = i.ppUnitDropdown(ppCode);
		model.addAttribute("ppUnitDtlDrop", ppUnitDtlDrop);
		
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.mm(officeCode);
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(unitModList.get(0).getBillCycleCode())) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());
		
		UnitModInset unitModInset = new UnitModInset();
		model.addAttribute("unitModInset", unitModInset);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "icunitmodedit";
	}

	@PostMapping("/IC_PP_UNIT_MOD_EDIT/{billCycleCode}/{ppCode}/{id}")
	public String icPpUnitModUpdate(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("billCycleCode") String billCycleCode,@PathVariable("ppCode") String ppCode, @PathVariable("id") int id, Model model, UnitModInset unitModInset) {
		i.updatePpModUnit(unitModInset, unitModInset.getPpUnitCode(), id,user_name);

		return "redirect:/IC_PP_UNIT_MOD/" +billCycleCode+'/'+ppCode;
	}

	@GetMapping("/IC_PP_UNIT_MOD_DELETE/{billCycleCode}/{ppCode}/{id}")
	public String icPpUnitModDelete(@PathVariable("billCycleCode") String billCycleCode, @PathVariable("ppCode") String ppCode,@PathVariable("id") int id) {
		i.deletePpModUnit(id);

		return "redirect:/IC_PP_UNIT_MOD/" +billCycleCode+'/'+ppCode;
	}

	///////////////////// End khondokar
	/////////////////// Start rafi
	@GetMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_MISC_BILL_TYPE ic_misc_bill_type = new IC_MISC_BILL_TYPE();

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();
		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE")
	public String ic_misc_bill_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_MISC_BILL_TYPE ic_misc_bill_type) {

		iconvDaoRafi.insertICMiscBillType(ic_misc_bill_type,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@GetMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_MISC_BILL_TYPE ic_misc_bill_type = iconvDaoRafi.singleIC_MISC_BILL_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_misc_bill_type", ic_misc_bill_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE/{id}")
	public String ic_misc_bill_type_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model,
			IC_MISC_BILL_TYPE ic_misc_bill_type) {

		ic_misc_bill_type.setMSC_BILL_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICMiscBillType(ic_misc_bill_type,user_name);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

	@PostMapping("/IC_MISC_BILL_TYPE_delete/{id}")
	public String IC_MISC_BILL_TYPE_delete(@PathVariable("id") int id) {

		iconvDaoRafi.deleteICMiscBillType(id);

		return "redirect:/IC_MISC_BILL_TYPE";
	}

//	CLEAR CLEAR IC_MISC_BILL_TYPE START
	@PostMapping("/IC_MISC_BILL_TYPE_clear/{id}")
	public String IC_MISC_BILL_TYPE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_MISC_BILL_TYPE";
	}
//	CLEAR IC_MISC_BILL_TYPE END

	@GetMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_FUEL_TYPE ic_fuel_type = new IC_FUEL_TYPE();

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();
		model.addAttribute("ic_fuel_type", ic_fuel_type);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE")
	public String ic_fuel_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_FUEL_TYPE ic_fuel_type) {

		iconvDaoRafi.insertICFuelType(ic_fuel_type,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_FUEL_TYPE";
	}

	@GetMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_FUEL_TYPE ic_fuel_type = iconvDaoRafi.singleIC_FUEL_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.listIC_FUEL_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_fuel_type", ic_fuel_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE/{id}")
	public String ic_fuel_type_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_FUEL_TYPE ic_fuel_type) {

		ic_fuel_type.setFUEL_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICFuelType(ic_fuel_type,user_name);

		return "redirect:/IC_FUEL_TYPE";
	}

	@PostMapping("/IC_FUEL_TYPE_delete/{id}")
	public String IC_FUEL_TYPE_delete(@PathVariable("id") int id) {

		iconvDaoRafi.deleteICFuelType(id);

		return "redirect:/IC_FUEL_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_FUEL_TYPE_clear/{id}")
	public String IC_FUEL_TYPE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_FUEL_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER_TYPE ic_pp_owner_type = new IC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE")
	public String ic_pp_owner_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_PP_OWNER_TYPE ic_pp_owner_type) {

		iconvDaoRafi.insertICPPOwnerType(ic_pp_owner_type,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@GetMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER_TYPE ic_pp_owner_type = iconvDaoRafi.singleIC_PP_OWNER_TYPE(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner_type", ic_pp_owner_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE/{id}")
	public String ic_pp_owner_type_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_PP_OWNER_TYPE ic_pp_owner_type) {

		ic_pp_owner_type.setOWNER_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwnerType(ic_pp_owner_type,user_name);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

	@PostMapping("/IC_PP_OWNER_TYPE_delete/{id}")
	public String IC_PP_OWNER_TYPE_delete(@PathVariable("id") int id) {

		iconvDaoRafi.deleteICPPOwnerType(id);

		return "redirect:/IC_PP_OWNER_TYPE";
	}

//	CLEAR IC_FUEL_TYPE START
	@PostMapping("/IC_PP_OWNER_TYPE_clear/{id}")
	public String IC_PP_OWNER_TYPE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_PP_OWNER_TYPE";
	}
//	CLEAR IC_FUEL_TYPE END

	@GetMapping("/IC_PP_OWNER")
	public String ic_pp_owner(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PP_OWNER ic_pp_owner = new IC_PP_OWNER();

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();
		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER")
	public String ic_pp_owner_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_PP_OWNER ic_pp_owner) {

		iconvDaoRafi.insertICPPOwner(ic_pp_owner,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_PP_OWNER";
	}

	@GetMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_PP_OWNER ic_pp_owner = iconvDaoRafi.singleIC_PP_OWNER(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.listIC_PP_OWNER_TYPE();

		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = iconvDaoRafi.listIC_PP_OWNER();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_pp_owner", ic_pp_owner);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_PP_OWNER_TYPE", listIC_PP_OWNER_TYPE);
		model.addAttribute("listIC_PP_OWNER", listIC_PP_OWNER);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_PP_OWNER";

	}

	@PostMapping("/IC_PP_OWNER/{id}")
	public String ic_pp_owner_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_PP_OWNER ic_pp_owner) {

		ic_pp_owner.setPP_OWNER_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICPPOwner(ic_pp_owner,user_name);

		return "redirect:/IC_PP_OWNER";
	}

	@PostMapping("/IC_PP_OWNER_delete/{id}")
	public String IC_PP_OWNER(@PathVariable("id") int id) {

		iconvDaoRafi.deleteICPPOwner(id);

		return "redirect:/IC_PP_OWNER";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_PP_OWNER_clear/{id}")
	public String IC_PP_OWNER_clear(@PathVariable("id") int id) {

		return "redirect:/IC_PP_OWNER";
	}
//	CLEAR IC_PP_OWNER END

	@GetMapping("/IC_LINE_TYPE")
	public String ic_line_type(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		String flag = "0";

		IC_LINE_TYPE ic_line_type = new IC_LINE_TYPE();

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();
		model.addAttribute("ic_line_type", ic_line_type);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE")
	public String ic_line_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_LINE_TYPE ic_line_type) {

		iconvDaoRafi.insertICLineType(ic_line_type,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_LINE_TYPE";
	}

	@GetMapping("/IC_LINE_TYPE/{id}")
	public String ic_line_type_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		String flag = "1";

		IC_LINE_TYPE ic_line_type = iconvDaoRafi.singleIC_LINE_TYPE(id);

//		System.out.println(ic_misc_bill_type);

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = iconvDaoRafi.listIC_LINE_TYPE();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_line_type", ic_line_type);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_LINE_TYPE", listIC_LINE_TYPE);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE/{id}")
	public String ic_pp_owner_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_LINE_TYPE ic_line_type) {

		ic_line_type.setLINE_TYPE_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		iconvDaoRafi.editICLineType(ic_line_type,user_name);

		return "redirect:/IC_LINE_TYPE";
	}

	@PostMapping("/IC_LINE_TYPE_delete/{id}")
	public String IC_LINE_TYPE(@PathVariable("id") int id) {

		iconvDaoRafi.deleteICLineType(id);

		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER START
	@PostMapping("/IC_LINE_TYPE_clear/{id}")
	public String IC_LINE_TYPE_clear(@PathVariable("id") int id) {

		return "redirect:/IC_LINE_TYPE";
	}

//	CLEAR IC_PP_OWNER END

//	IC_PERIOD_MST table list start

	@GetMapping("/IC_LOC_MOD")
	public String ic_period_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_PERIOD_MST ic_period_mst = new IC_PERIOD_MST();

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		model.addAttribute("ic_period_mst", ic_period_mst);
		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_PERIOD_MST";
	}

//	IC_PERIOD_MST table list end

//	IC_LOCATION_MASTER  table  list start

	@GetMapping("/IC_LOCATION_MASTER")
	public String ic_location_master(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_LOCATION_MASTER ic_location_master = new IC_LOCATION_MASTER();

		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		model.addAttribute("ic_location_master", ic_location_master);
		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOCATION_MASTER";
	}

//	IC_LOCATION_MASTER  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") int i, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//		System.out.println(i);
		String flag = "0";

		IC_LOC_MOD ic_loc_mod = new IC_LOC_MOD();

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

//		

		System.out.println("fhh");
		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		m.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD.html";

	}
//	IC_LOC_MOD table list end 

//	IC_LOC_MOD table insert start
	@PostMapping("/IC_LOC_MOD/{b}")
	public String ic_loc_mod_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setLOC_MOD_ID(i);

		iconvDaoRafi.insertICLocMod(ic_loc_mod,user_name);

		System.out.println("vdf");
		System.out.println(ic_loc_mod);

		return "redirect:/IC_LOC_MOD/" + i;

	}
//	IC_LOC_MOD table insert end 

//	IC_LOC_MOD table single start 
	@GetMapping("/IC_LOC_MOD/{b}/{c}")
	public String ic_loc_mod_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") int i, @PathVariable("c") int j, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

		IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();

		m.addAttribute("ic_loc_mod", ic_loc_mod);
		m.addAttribute("listIC_LOC_MOD", listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("id", i);
		m.addAttribute("s", b);
		m.addAttribute("i", j);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_LOC_MOD";

	}
//	IC_LOC_MOD table single end

//	IC_LOC_MOD table update start
	@PostMapping("/IC_LOC_MOD/{b}/{id}")
	public String ic_loc_mod_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("id") String id, Model model,
			IC_LOC_MOD ic_loc_mod) {

		ic_loc_mod.setBILL_CYCLE_CODE(i);
		ic_loc_mod.setLOC_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICLocMod(ic_loc_mod,user_name);

		return "redirect:/IC_LOC_MOD/" + i;
	}

//	IC_LOC_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_LOC_MOD_delete/{b}/{id}")
	public String ic_loc_mod_delete(@PathVariable("b") String i, @PathVariable("id") int id) {

		iconvDaoRafi.deleteICLocMod(id);

		return "redirect:/IC_LOC_MOD/" + i;
	}
//	IC_LOC_MOD table delete end

//	CLEAR IC_LOC_MOD  START
	@PostMapping("/IC_LOC_MOD_clear/{id}")
	public String IC_LOC_MOD_clear(@PathVariable("id") int id) {

		return "redirect:/IC_LOC_MOD/" + id;
	}
//	CLEAR IC_LOC_MOD  END

//	IC_SECT_WISE_MOD  table  list start

	@GetMapping("/IC_SECTOR_MST")
	public String ic_sector_mst_mod(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_SECTOR_MST";
	}

//	IC_SECT_WISE_MOD  list table end

//	IC_LOC_MOD table list start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//		System.out.println(i);
		String flag = "0";

		IC_SECT_WISE_MOD ic_sect_wise_mod = new IC_SECT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);

		m.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD.html";

	}
//	IC_SECT_WISE_MOD table list end 

//	IC_SECT_WISE_MOD table insert start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}")
	public String ic_sect_wise_mod_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p,
			IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setSECT_MOD_ID(i);

		iconvDaoRafi.insertICSectWiseMod(ic_sect_wise_mod,user_name);
		
		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;

	}

//	IC_SECT_WISE_MOD table insert end 

//	IC_SECT_WISE_MOD table single start 
	@GetMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, @PathVariable("c") int j, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_SECT_WISE_MOD ic_sect_wise_mod = iconvDaoRafi.singleIC_SECT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_SECT_WISE_MOD> r = iconvDaoRafi.g(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();

		m.addAttribute("ic_sect_wise_mod", ic_sect_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_SECT_WISE_MOD";

	}
//	IC_SECT_WISE_MOD table single end

//	IC_SECT_WISE_MOD table update start
	@PostMapping("/IC_SECT_WISE_MOD/{b}/{l}/{c}")
	public String ic_sect_wise_mod_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_SECT_WISE_MOD ic_sect_wise_mod) {

		ic_sect_wise_mod.setBILL_CYCLE_CODE(i);
		ic_sect_wise_mod.setLOCATION_CODE(p);
		ic_sect_wise_mod.setSECT_MOD_ID(id);

//		System.out.println("test");
//		System.out.println(pkg_rate_mst);
//		

//		System.out.println("Controller:");
//		System.out.println(pkg_type);
		iconvDaoRafi.editICSectWiseMod(ic_sect_wise_mod,user_name);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}

//	IC_SECT_WISE_MOD table update end

//	IC_LOC_MOD table delete start
	@PostMapping("/IC_SECT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_sect_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICSectWiseMod(id);

		return "redirect:/IC_SECT_WISE_MOD/" + i + "/" + p;
	}
//	IC_SECT_WISE_MOD table delete end

//	CLEAR IC_SECT_WISE_MOD  START
	@PostMapping("/IC_SECT_WISE_MOD_clear/{b}/{l}")
	public String IC_SECT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_SECT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_SECT_WISE_MOD  END

//	IC_MISC_MOD table list start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}")

	public String ic_misc_mod(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//		System.out.println(i);
		String flag = "0";

		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", r);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);

		m.addAttribute("flag", flag);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD.html";

	}
//	IC_MISC_MOD table list end 

//	IC_MISC_MOD table insert start
	@PostMapping("/IC_MISC_MOD/{b}/{l}")
	public String ic_misc_mod_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setMSC_MOD_ID(i);

		iconvDaoRafi.insertICMiscMod(ic_misc_mod,user_name);

		System.out.println("cmf");
		System.out.println(ic_misc_mod);
//		
		return "redirect:/IC_MISC_MOD/" + i + "/" + p;

	}

//	IC_MISC_MOD table insert end 

//	IC_MISC_MOD table single start 
	@GetMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, @PathVariable("c") int j, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDao.singleIC_LOC_MOD(j);

		IC_MISC_MOD ic_misc_mod = iconvDaoRafi.singleIC_MISC_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDao.a(i);

		ArrayList<IC_MISC_MOD> r = iconvDaoRafi.d(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDao.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = iconvDaoRafi.listIC_MISC_BILL_TYPE();

		m.addAttribute("ic_misc_mod", ic_misc_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_MISC_BILL_TYPE", listIC_MISC_BILL_TYPE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_MISC_MOD";

	}
//	IC_MISC_MOD table single end

//	IC_MISC_MOD table update start
	@PostMapping("/IC_MISC_MOD/{b}/{l}/{c}")
	public String ic_misc_mod_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_MISC_MOD ic_misc_mod) {

		ic_misc_mod.setBILL_CYCLE_CODE(i);
		ic_misc_mod.setLOCATION_CODE(p);
		ic_misc_mod.setMSC_MOD_ID(id);
		
		iconvDaoRafi.editICMiscMod(ic_misc_mod,user_name);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}

//	IC_MISC_MOD table update end

//	IC_MISC_MOD table delete start
	@PostMapping("/IC_MISC_MOD_delete/{b}/{l}/{c}")
	public String ic_misc_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICMiscMod(id);

		return "redirect:/IC_MISC_MOD/" + i + "/" + p;
	}
//	IC_MISC_MOD table delete end

//	CLEAR IC_MISC_MOD  START
	@PostMapping("/IC_MISC_MOD_clear/{b}/{l}")
	public String IC_MISC_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_MISC_MOD/" + id + "/" + p;
	}
//	CLEAR IC_MISC_MOD  END

//	IC_USAGE_CAT_CODE  table  list start

	@GetMapping("/IC_USAGE_CAT_CODE")
	public String ic_usage_cad_code(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USAGE_CAT_CODE ic_usage_cad_code = new IC_USAGE_CAT_CODE();

		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
		model.addAttribute("ic_usage_cad_code", ic_usage_cad_code);
		model.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		model.addAttribute("flag", flag);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_USAGE_CAT_CODE";
	}

//	IC_USAGE_CAT_CODE  list table end

//	IC_CAT_WISE_MOD table list start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}")

	public String ic_cat_wise_mod(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//		System.out.println(i);
		String flag = "0";
		IC_MISC_MOD ic_misc_mod = new IC_MISC_MOD();

		IC_CAT_WISE_MOD ic_cat_wise_mod = new IC_CAT_WISE_MOD();

//		 ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);
		ArrayList<IC_CAT_WISE_MOD> b = iconvDaoRafi.w(i, p);

//		System.out.println(b);
		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

//		

//		System.out.println("fhh");
//		System.out.println(b);
		m.addAttribute("id", i);
		m.addAttribute("lo", p);
		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("m", b);
		m.addAttribute("s", b);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);

		m.addAttribute("flag", flag);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);
		return "IC_CAT_WISE_MOD.html";

	}
//	IC_CAT_WISE_MOD table list end 

//	IC_CAT_WISE_MOD table insert start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}")
	public String ic_cat_wise_mod_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p,
			IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setCAT_MOD_ID(i);
		ic_cat_wise_mod.setLOCATION_CODE(p);

		iconvDaoRafi.insertICCatWiseMod(ic_cat_wise_mod,user_name);

		System.out.println("hp");
		System.out.println(ic_cat_wise_mod);
//		
		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;

	}

//	IC_CAT_WISE_MOD table insert end 

//	IC_CAT_WISE_MOD table single start 
	@GetMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("b") String i, @PathVariable("l") String p, @PathVariable("c") int j, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//
//		System.out.println(i);
//		System.out.println(j);

		String flag = "1";

//	 IC_LOC_MOD ic_loc_mod = iconvDaoRafi.singleIC_LOC_MOD(j);

		IC_CAT_WISE_MOD ic_cat_wise_mod = iconvDaoRafi.singleIC_CAT_WISE_MOD(j);

//		System.out.println(pkg_rate_mst);

//		System.out.println(pkg_rate_mst);
//		ArrayList<IC_LOC_MOD> listIC_LOC_MOD = iconvDaoRafi.a(i);

		ArrayList<IC_CAT_WISE_MOD> r = iconvDaoRafi.w(i, p);

//		ArrayList<IC_LOC_MOD> b = iconvDaoRafi.a(i);

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = iconvDaoRafi.listIC_SECTOR_MST();
		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();

		m.addAttribute("ic_cat_wise_mod", ic_cat_wise_mod);
//		m.addAttribute("listIC_LOC_MOD",listIC_LOC_MOD);
		m.addAttribute("flag", flag);
		m.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		m.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		m.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		m.addAttribute("listIC_USAGE_CAT_CODE", listIC_USAGE_CAT_CODE);
		m.addAttribute("id", i);
		m.addAttribute("s", r);
		m.addAttribute("i", j);
		m.addAttribute("lo", p);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

		return "IC_CAT_WISE_MOD";

	}
//	IC_CAT_WISE_MOD table single end

//	IC_CAT_WISE_MOD table update start
	@PostMapping("/IC_CAT_WISE_MOD/{b}/{l}/{c}")
	public String ic_cat_wise_mod_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") String id, Model model, IC_CAT_WISE_MOD ic_cat_wise_mod) {

		ic_cat_wise_mod.setBILL_CYCLE_CODE(i);
		ic_cat_wise_mod.setLOCATION_CODE(p);
		ic_cat_wise_mod.setCAT_MOD_ID(id);

		iconvDaoRafi.editICCatWiseMod(ic_cat_wise_mod,user_name);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}

//	IC_CAT_WISE_MOD table update end

//	IC_CAT_WISE_MOD table delete start
	@PostMapping("/IC_CAT_WISE_MOD_delete/{b}/{l}/{c}")
	public String ic_cat_wise_mod_delete(@PathVariable("b") String i, @PathVariable("l") String p,
			@PathVariable("c") int id) {

		iconvDaoRafi.deleteICCatWiseMod(id);

		return "redirect:/IC_CAT_WISE_MOD/" + i + "/" + p;
	}
//	IC_CAT_WISE_MOD table delete end

//	CLEAR IC_CAT_WISE_MOD  START
	@PostMapping("/IC_CAT_WISE_MOD_clear/{b}/{l}")
	public String IC_CAT_WISE_MOD_clear(@PathVariable("b") String id, @PathVariable("l") String p) {

		return "redirect:/IC_CAT_WISE_MOD/" + id + "/" + p;
	}
//	CLEAR IC_CAT_WISE_MOD  END

	/////////////////////// end rafi
	////////////////////// start surovi
	@GetMapping("/ic_sector_mst")
	public String ic_sector_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		String flag = "0";

		IC_SECTOR_MST ic_sector_mst = new IC_SECTOR_MST();

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();
		model.addAttribute("ic_sector_mst", ic_sector_mst);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst")
	public String misc_bill_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_SECTOR_MST ic_sector_mst) {

		convergeDaoSurovi.insertIcSectorMst(ic_sector_mst,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") int id, Model model) {

		String flag = "1";

		IC_SECTOR_MST ic_sector_mst = convergeDaoSurovi.singleIC_SECTOR_MST(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = convergeDaoSurovi.listIC_SECTOR_MST();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_sector_mst", ic_sector_mst);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_SECTOR_MST", listIC_SECTOR_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "ic_sector_mst";
	}

	@PostMapping("/ic_sector_mst/{id}")
	public String ic_sector_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_SECTOR_MST ic_sector_mst) {

		ic_sector_mst.setSECT_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editIcSectorMst(ic_sector_mst,user_name);

		return "redirect:/ic_sector_mst";
	}

//	
	@PostMapping("/ic_sector_mst_delete/{id}")
	public String ic_sector_mst_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteIcSectorMst(id);

		return "redirect:/ic_sector_mst";
	}

	@GetMapping("/IC_USAGE_AREA")
	public String ic_usage_area(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USAGE_AREA ic_usage_area = new IC_USAGE_AREA();

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("ic_usage_area", ic_usage_area);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA")
	public String ic_fuel_type_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_USAGE_AREA ic_usage_area) {

		convergeDaoSurovi.insertICUsageArea(ic_usage_area,user_name);

//		System.out.println(misc_bill_type);
		return "redirect:/IC_USAGE_AREA";
	}

	@GetMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_USAGE_AREA ic_usage_area = convergeDaoSurovi.singleIC_USAGE_AREA(id);

//		System.out.println(misc_bill_type);

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();

//		ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_usage_area", ic_usage_area);
//		model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA/{id}")
	public String ic_usage_area_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_USAGE_AREA ic_usage_area) {

		ic_usage_area.setAREA_ID(id);

//		System.out.println("Controller:");
//		System.out.println(pkg_mst);
		convergeDaoSurovi.editICUsageArea(ic_usage_area,user_name);

		return "redirect:/IC_USAGE_AREA";
	}

	@PostMapping("/IC_USAGE_AREA_delete/{id}")
	public String IC_USAGE_AREA_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUsageArea(id);

		return "redirect:/IC_USAGE_AREA";
	}

//	CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_USAGE_AREA_clear/{id}")
	public String IC_USAGE_AREA_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USAGE_AREA";
	}
	// IC_FORWARD_HEADER_MST Start

	@GetMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = new IC_FORWARD_HEADER_MST();

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();
		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST")
	public String ic_forward_header_mst_save(IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		convergeDaoSurovi.insertICForwardHeaderMst(ic_forward_header_mst);

//			System.out.println(misc_bill_type);
		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@GetMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_FORWARD_HEADER_MST ic_forward_header_mst = convergeDaoSurovi.singleIC_FORWARD_HEADER_MST(id);

		ArrayList<IC_FORWARD_HEADER_MST> listIC_FORWARD_HEADER_MST = convergeDaoSurovi.listIC_FORWARD_HEADER_MST();

//			ArrayList<MISC_BILL_TYPE> listMISC_BILL_TYPE= iconvDaoRafi.listMISC_BILL_TYPE();

		model.addAttribute("ic_forward_header_mst", ic_forward_header_mst);
//			model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
		model.addAttribute("listIC_FORWARD_HEADER_MST", listIC_FORWARD_HEADER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST/{id}")
	public String ic_forward_header_mst_edit(@PathVariable("id") String id, Model model,
			IC_FORWARD_HEADER_MST ic_forward_header_mst) {

		ic_forward_header_mst.setFRD_HDR_ID(id);

//			System.out.println("Controller:");
//			System.out.println(pkg_mst);
		convergeDaoSurovi.editICForwardHeaderMst(ic_forward_header_mst);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	@PostMapping("/IC_FORWARD_HEADER_MST_delete/{id}")
	public String IC_FORWARD_HEADER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICForwardHeaderMst(id);

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

//		CLEAR IC_USAGE_AREA START
	@PostMapping("/IC_FORWARD_HEADER_MST_clear/{id}")
	public String IC_FORWARD_HEADER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_FORWARD_HEADER_MST";
	}

	// IC USER MST starts

	@GetMapping("/IC_USER_MST")
	public String ic_user_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USER_MST ic_user_mst = new IC_USER_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST")
	public String ic_user_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_USER_MST ic_user_mst) {

		convergeDaoSurovi.insertICUserMst(ic_user_mst,user_name);

		return "redirect:/IC_USER_MST";
	}

	@GetMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_USER_MST ic_user_mst = convergeDaoSurovi.singleIC_USER_MST(id);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		model.addAttribute("ic_user_mst", ic_user_mst);
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST/{id}")
	public String ic_user_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_USER_MST ic_user_mst) {

		ic_user_mst.setUSER_ID(id);

		convergeDaoSurovi.editICUserMst(ic_user_mst,user_name);

		return "redirect:/IC_USER_MST";
	}

	@PostMapping("/IC_USER_MST_delete/{id}")
	public String IC_USER_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserMst(id);

		return "redirect:/IC_USER_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_MST_clear/{id}")
	public String IC_USER_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_MST";
	}

	// IC_USER_ACCESS starts

	@GetMapping("/IC_USER_ACCESS/{userName}/{grpC}")
	public String ic_user_access(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("userName") String uName, @PathVariable("grpC") String grpC, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USER_ACCESS ic_user_access = new IC_USER_ACCESS();

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);

		ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown = convergeDaoSurovi.groupAccessModDropdown(grpC);
		model.addAttribute("groupAccessModDropdown", groupAccessModDropdown);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS = convergeDaoSurovi.listIC_USER_ACCESS(uName, grpC);
		model.addAttribute("ic_user_access", ic_user_access);
		model.addAttribute("listIC_USER_ACCESS", listIC_USER_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("uName", uName);
		model.addAttribute("grpC", grpC);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_ACCESS";
	}

	@PostMapping("/IC_USER_ACCESS/{userName}/{grpC}")
	public String ic_user_access_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			IC_USER_ACCESS ic_user_access) {

		ic_user_access.setUSER_NAME(uName);
		ic_user_access.setGRP_CODE(grpC);

		convergeDaoSurovi.insertICUserAccess(ic_user_access,user_name);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;

	}

	@GetMapping("/IC_USER_ACCESS/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_USER_ACCESS ic_user_access = convergeDaoSurovi.singleIC_USER_ACCESS(userAccId);

		model.addAttribute("selected", ic_user_access.getACTIVITY_CODE());

		ArrayList<IC_USER_ACCESS> listIC_USER_ACCESS = convergeDaoSurovi.listIC_USER_ACCESS(uName, grpC);

		ArrayList<IC_USER_MST> listIC_USER_MST = convergeDaoSurovi.listIC_USER_MST();
		model.addAttribute("listIC_USER_MST", listIC_USER_MST);

		ArrayList<IC_GROUP_ACCESS> groupAccessModDropdown = convergeDaoSurovi.groupAccessModDropdown(grpC);
		model.addAttribute("groupAccessModDropdown", groupAccessModDropdown);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);

		model.addAttribute("ic_user_access", ic_user_access);
		model.addAttribute("listIC_USER_ACCESS", listIC_USER_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("uName", uName);
		model.addAttribute("grpC", grpC);
		model.addAttribute("userAccId", userAccId);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_ACCESS";
	}

	@PostMapping("/IC_USER_ACCESS/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId, Model model, IC_USER_ACCESS ic_user_access) {

		ic_user_access.setUSER_ACS_ID(userAccId);
		ic_user_access.setGRP_CODE(grpC);
		ic_user_access.setUSER_NAME(uName);

		convergeDaoSurovi.editICUserAccess(ic_user_access,user_name);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;
	}

	@PostMapping("/IC_USER_ACCESS_delete/{userName}/{grpC}/{userAccId}")
	public String ic_user_access_delete(@PathVariable("userName") String uName, @PathVariable("grpC") String grpC,
			@PathVariable("userAccId") int userAccId) {

		convergeDaoSurovi.deleteICUserAccess(userAccId);

		return "redirect:/IC_USER_ACCESS/" + uName + "/" + grpC;
	}

//		CLEAR IC_USER_ACCESS START
	@PostMapping("/IC_USER_ACCESS_clear/{userAccId}")
	public String IC_USER_ACCESS_clear(@PathVariable("userAccId") int userAccId) {

		return "redirect:/IC_USER_ACCESS";
	}

	// IC_USER_TYPE_MST starts

	@GetMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_USER_TYPE_MST ic_user_type_mst = new IC_USER_TYPE_MST();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST")
	public String ic_user_type_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_USER_TYPE_MST ic_user_type_mst) {

		convergeDaoSurovi.insertICUserTypeMst(ic_user_type_mst,user_name);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@GetMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user_type_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_USER_TYPE_MST ic_user_type_mst = convergeDaoSurovi.singleIC_USER_TYPE_MST(id);

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();

		model.addAttribute("ic_user_type_mst", ic_user_type_mst);
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST/{id}")
	public String ic_user__type_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model,
			IC_USER_TYPE_MST ic_user_type_mst) {

		ic_user_type_mst.setUSER_TYPE_ID(id);

		convergeDaoSurovi.editICUserTypeMst(ic_user_type_mst,user_name);

		return "redirect:/IC_USER_TYPE_MST";
	}

	@PostMapping("/IC_USER_TYPE_MST_delete/{id}")
	public String IC_USER_TYPE_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICUserTypeMst(id);

		return "redirect:/IC_USER_TYPE_MST";
	}

//		CLEAR IC_USER_MST START
	@PostMapping("/IC_USER_TYPE_MST_clear/{id}")
	public String IC_USER_TYPE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_USER_TYPE_MST";
	}
	///////////////////// end surovi

	///////////////////// start graph

//	graph start 
	@GetMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";

		String hdr13 = "";

		String hdr14 = "";

		String hdr40 = "";
		String hdr41 = "";

		String hdr42 = "";
		String hdr43 = "";

		String hdr44 = "";
		String hdr45 = "";

		String hdr46 = "";
		String hdr47 = "";

		String hdr48 = "";
		String hdr49 = "";
		String hdr50 = "";
		String hdr51 = "";
		String hdr52 = "";
		String hdr53 = "";

		String listlast_month_date = iconvDaoRafi.listlast_month_date();

//		 System.out.println("LAST DATE");
//		System.out.println(listlast_month_date);

//		String  = listlast_month_date;
//		String[] parts = string.split("-");
//		String part1 = parts[0]; // 004
//		String part2 = parts[1]; // 034556
//		
//		String part = part1 + part2;

		String date = listlast_month_date; // 034556

//		System.out.println(date);

		String a = date;
		String b = null;
		String c = null;
		String g = null;
		String d = null;
		String e = officeCode;
		String f = "1";

		Map<String, Object> result = getAllStatesJdbcCall101.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.optString("HDR");
			graphData.put(jsonData.optString("LINEX"), Double.valueOf(jsonData.optString("SYS_LOSS")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall102.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.optString("HDR");
			graphData1.put(jsonData1.optString("LINEX"), Double.valueOf(jsonData1.optString("SYS_LOSS")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		Map<String, Object> result2 = getAllStatesJdbcCall103.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
		String fjfhdj2 = json2.get("CUR_DATA").toString();
		JSONArray jsonArray2 = new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData2 = new TreeMap<>();
		for (int i = 0; i < jsonArray2.length(); i++) {
			JSONObject jsonData2 = jsonArray2.getJSONObject(i);

			hdr3 = jsonData2.optString("HDR");
			graphData2.put(jsonData2.optString("LINEX"), Double.valueOf(jsonData2.optString("CI_RATIO")));
		}
		
		
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);

		Map<String, Object> result3 = getAllStatesJdbcCall104.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
		String fjfhdj3 = json3.get("CUR_DATA").toString();
		JSONArray jsonArray3 = new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData3 = new TreeMap<>();
		for (int i = 0; i < jsonArray3.length(); i++) {
			JSONObject jsonData3 = jsonArray3.getJSONObject(i);

			hdr4 = jsonData3.optString("HDR");
			graphData3.put(jsonData3.optString("LINEX"), Double.valueOf(jsonData3.optString("CI_RATIO")));
		}

//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
		model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);

		Map<String, Object> result4 = getAllStatesJdbcCall105.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
		String fjfhdj4 = json4.get("CUR_DATA").toString();
		JSONArray jsonArray4 = new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData4 = new TreeMap<>();
		for (int i = 0; i < jsonArray4.length(); i++) {
			JSONObject jsonData4 = jsonArray4.getJSONObject(i);

			hdr5 = jsonData4.optString("HDR");
			graphData4.put(jsonData4.optString("LINEX"), Double.valueOf(jsonData4.optString("CB_RATIO")));
		}

//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
		model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);

		Map<String, Object> result5 = getAllStatesJdbcCall106.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
		String fjfhdj5 = json5.get("CUR_DATA").toString();
		JSONArray jsonArray5 = new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData5 = new TreeMap<>();
		for (int i = 0; i < jsonArray5.length(); i++) {
			JSONObject jsonData5 = jsonArray5.getJSONObject(i);

			hdr6 = jsonData5.optString("HDR");
			graphData5.put(jsonData5.optString("LINEX"), Double.valueOf(jsonData5.optString("CB_RATIO")));
		}

//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
		model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);

		Map<String, Object> result6 = getAllStatesJdbcCall107.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
		String fjfhdj6 = json6.get("CUR_DATA").toString();
		JSONArray jsonArray6 = new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData6 = new TreeMap<>();
		for (int i = 0; i < jsonArray6.length(); i++) {
			JSONObject jsonData6 = jsonArray6.getJSONObject(i);

			hdr7 = jsonData6.optString("HDR");
			graphData6.put(jsonData6.optString("LINEX"), Double.valueOf(jsonData6.optString("EQ_MONTH")));
		}

//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
		model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);

		Map<String, Object> result7 = getAllStatesJdbcCall108.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
		String fjfhdj7 = json7.get("CUR_DATA").toString();
		JSONArray jsonArray7 = new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData7 = new TreeMap<>();
		for (int i = 0; i < jsonArray7.length(); i++) {
			JSONObject jsonData7 = jsonArray7.getJSONObject(i);

			hdr8 = jsonData7.optString("HDR");
			graphData7.put(jsonData7.optString("LINEX"), Double.valueOf(jsonData7.optString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
		model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);

		Map<String, Object> result8 = getAllStatesJdbcCall109.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
		String fjfhdj8 = json8.get("CUR_DATA").toString();
		JSONArray jsonArray8 = new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData8 = new TreeMap<>();
		for (int i = 0; i < jsonArray8.length(); i++) {
			JSONObject jsonData8 = jsonArray8.getJSONObject(i);

			hdr8 = jsonData8.optString("HDR");
			graphData8.put(jsonData8.optString("LINEX"), Double.valueOf(jsonData8.optString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);

		Map<String, Object> result10 = getAllStatesJdbcCall217.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json10 = new JSONObject(result10);
		String fjfhdj10 = json10.get("CUR_DATA").toString();
		JSONArray jsonArray10 = new JSONArray(fjfhdj10);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData10 = new TreeMap<>();
		for (int i = 0; i < jsonArray10.length(); i++) {
			JSONObject jsonData10 = jsonArray10.getJSONObject(i);

			hdr10 = jsonData10.optString("HDR");
			graphData10.put(jsonData10.optString("LINEX"), Double.valueOf(jsonData10.optString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr10_graph", hdr10);
		model.addAttribute("chartData10", graphData10);

		Map<String, Object> result11 = getAllStatesJdbcCall219.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json11 = new JSONObject(result11);
		String fjfhdj11 = json11.get("CUR_DATA").toString();
		JSONArray jsonArray11 = new JSONArray(fjfhdj11);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData11 = new TreeMap<>();
		for (int i = 0; i < jsonArray11.length(); i++) {
			JSONObject jsonData11 = jsonArray11.getJSONObject(i);

			hdr11 = jsonData11.optString("HDR");
			graphData11.put(jsonData11.optString("LINEX"), Double.valueOf(jsonData11.optString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr11_graph", hdr11);
		model.addAttribute("chartData11", graphData11);

		Map<String, Object> result12 = getAllStatesJdbcCall220.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json12 = new JSONObject(result12);
		String fjfhdj12 = json12.get("CUR_DATA").toString();
		JSONArray jsonArray12 = new JSONArray(fjfhdj12);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData12 = new TreeMap<>();
		for (int i = 0; i < jsonArray12.length(); i++) {
			JSONObject jsonData12 = jsonArray12.getJSONObject(i);

			hdr12 = jsonData12.optString("HDR");
			graphData12.put(jsonData12.optString("LINEX"), Double.valueOf(jsonData12.optString("EQ_MONTH")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr12_graph", hdr12);
		model.addAttribute("chartData12", graphData12);

//		dpd_BILLED_amt_CM start

		Map<String, Object> result13 = getAllStatesJdbcCall517.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json13 = new JSONObject(result13);
		String fjfhdj13 = json13.get("CUR_DATA").toString();
		JSONArray jsonArray13 = new JSONArray(fjfhdj13);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData13 = new TreeMap<>();
		for (int i = 0; i < jsonArray13.length(); i++) {
			JSONObject jsonData13 = jsonArray13.getJSONObject(i);

			hdr13 = jsonData13.optString("HDR");
			graphData13.put(jsonData13.optString("LINEX"), Double.valueOf(jsonData13.optString("BILLED_AMT")));
		}

//	    System.out.println(hdr13);
//	    System.out.println(graphData13);
		model.addAttribute("hdr13_graph", hdr13);
		model.addAttribute("chartData13", graphData13);

//		dpd_BILLED_amt_CM end

//		dpd_BILLED_amt_UP start

		Map<String, Object> result14 = getAllStatesJdbcCall518.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json14 = new JSONObject(result14);
		String fjfhdj14 = json14.get("CUR_DATA").toString();
		JSONArray jsonArray14 = new JSONArray(fjfhdj14);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData14 = new TreeMap<>();
		for (int i = 0; i < jsonArray14.length(); i++) {
			JSONObject jsonData14 = jsonArray14.getJSONObject(i);

			hdr14 = jsonData14.optString("HDR");
			graphData14.put(jsonData14.optString("LINEX"), Double.valueOf(jsonData14.optString("BILLED_AMT")));
		}

//	    System.out.println(hdr14);
//	    System.out.println(graphData14);
		model.addAttribute("hdr14_graph", hdr14);
		model.addAttribute("chartData14", graphData14);

//		dpd_BILLED_amt_UP end

		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall400.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DASHBOARD_DIST> tableList = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray40.length(); i++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(i);

			hdr40 = jsonData40.optString("HDR");

			tableList.add(new DASHBOARD_DIST(jsonData40.optString("HDR"), jsonData40.optString("LINEX"),
					jsonData40.optString("SYS_LOSS"), null, null, jsonData40.optString("NET_IMPORT_KWH"), null, null,
					jsonData40.optString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr40);
		model.addAttribute("tableList", tableList);

		// table show sys_loss current month ends

		// table show sys_loss upto month starts

		Map<String, Object> result41 = getAllStatesJdbcCall401.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json41 = new JSONObject(result41);
		String fjfhdj41 = json41.get("CUR_DATA").toString();
		JSONArray jsonArray41 = new JSONArray(fjfhdj41);
		ArrayList<DASHBOARD_DIST> tableList1 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray41.length(); i++) {
			JSONObject jsonData41 = jsonArray41.getJSONObject(i);

			hdr41 = jsonData41.optString("HDR");

			tableList1.add(new DASHBOARD_DIST(jsonData41.optString("HDR"), jsonData41.optString("LINEX"),
					jsonData41.optString("SYS_LOSS"), null, null, jsonData41.optString("NET_IMPORT_KWH"), null, null,
					jsonData41.optString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr41_table", hdr41);
		model.addAttribute("tableList1", tableList1);

		// table show sys_loss upto month ends

		// table show dpd_CI_Ratio_CM current month starts

		Map<String, Object> result42 = getAllStatesJdbcCall402.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json42 = new JSONObject(result42);
		String fjfhdj42 = json42.get("CUR_DATA").toString();
		JSONArray jsonArray42 = new JSONArray(fjfhdj42);
		ArrayList<DASHBOARD_DIST> tableList2 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray42.length(); i++) {
			JSONObject jsonData42 = jsonArray42.getJSONObject(i);

			hdr42 = jsonData42.optString("HDR");

			tableList2.add(new DASHBOARD_DIST(jsonData42.optString("HDR"), jsonData42.optString("LINEX"), null,
					jsonData42.optString("CI_RATIO"), null, jsonData42.optString("NET_IMPORT_KWH"),
					jsonData42.optString("COLL_AMT"), jsonData42.optString("BILLED_AMT"),
					jsonData42.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr42);
//				System.out.println(tableList2);
		model.addAttribute("hdr42_table", hdr42);
		model.addAttribute("tableList42", tableList2);

		// table show dpd_CI_Ratio_CM current month ends

		// table show dpd_CI_Ratio_CM upto month starts

		Map<String, Object> result43 = getAllStatesJdbcCall403.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json43 = new JSONObject(result43);
		String fjfhdj43 = json43.get("CUR_DATA").toString();
		JSONArray jsonArray43 = new JSONArray(fjfhdj43);
		ArrayList<DASHBOARD_DIST> tableList3 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray43.length(); i++) {
			JSONObject jsonData43 = jsonArray43.getJSONObject(i);

			hdr43 = jsonData43.optString("HDR");

			tableList3.add(new DASHBOARD_DIST(jsonData43.optString("HDR"), jsonData43.optString("LINEX"), null,
					jsonData43.optString("CI_RATIO"), null, jsonData43.optString("NET_IMPORT_KWH"),
					jsonData43.optString("COLL_AMT"), jsonData43.optString("BILLED_AMT"),
					jsonData43.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr43);
//				System.out.println(tableList3);
		model.addAttribute("hdr43_table", hdr43);
		model.addAttribute("tableList43", tableList3);

		// table show dpd_CI_Ratio_CM upto month ends

		// table show dpd_CB_Ratio_CM current month starts

		Map<String, Object> result44 = getAllStatesJdbcCall404.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json44 = new JSONObject(result44);
		String fjfhdj44 = json44.get("CUR_DATA").toString();
		JSONArray jsonArray44 = new JSONArray(fjfhdj44);
		ArrayList<DASHBOARD_DIST> tableList4 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray44.length(); i++) {
			JSONObject jsonData44 = jsonArray44.getJSONObject(i);

			hdr44 = jsonData44.optString("HDR");

			tableList4.add(new DASHBOARD_DIST(jsonData44.optString("HDR"), jsonData44.optString("LINEX"), null, null,
					jsonData44.optString("CB_RATIO"), null, jsonData44.optString("COLL_AMT"),
					jsonData44.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr44_table", hdr44);
		model.addAttribute("tableList44", tableList4);

		// table show dpd_CB_Ratio_CM current month ends

		// table show dpd_CB_Ratio_CM upto month starts

		Map<String, Object> result45 = getAllStatesJdbcCall405.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json45 = new JSONObject(result45);
		String fjfhdj45 = json45.get("CUR_DATA").toString();
		JSONArray jsonArray45 = new JSONArray(fjfhdj45);
		ArrayList<DASHBOARD_DIST> tableList5 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray45.length(); i++) {
			JSONObject jsonData45 = jsonArray45.getJSONObject(i);

			hdr45 = jsonData45.optString("HDR");

			tableList5.add(new DASHBOARD_DIST(jsonData45.optString("HDR"), jsonData45.optString("LINEX"), null, null,
					jsonData45.optString("CB_RATIO"), null, jsonData45.optString("COLL_AMT"),
					jsonData45.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr45_table", hdr45);
		model.addAttribute("tableList45", tableList5);

		// table show dpd_CB_Ratio_CM upto month ends

		// table show dpd_BILLED_UNIT_cm current month starts

		Map<String, Object> result46 = getAllStatesJdbcCall406.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json46 = new JSONObject(result46);
		String fjfhdj46 = json46.get("CUR_DATA").toString();
		JSONArray jsonArray46 = new JSONArray(fjfhdj46);
		ArrayList<DASHBOARD_DIST> tableList6 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray46.length(); i++) {
			JSONObject jsonData46 = jsonArray46.getJSONObject(i);

			hdr46 = jsonData46.optString("HDR");

			tableList6.add(new DASHBOARD_DIST(jsonData46.optString("HDR"), jsonData46.optString("LINEX"),
					jsonData46.optString("SYS_LOSS"), null, null, jsonData46.optString("NET_IMPORT_KWH"), null, null,
					jsonData46.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr46_table", hdr46);
		model.addAttribute("tableList46", tableList6);

		// table show dpd_BILLED_UNIT_cm current month ends

		// table show dpd_BILLED_UNIT_UP upto month starts

		Map<String, Object> result47 = getAllStatesJdbcCall407.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json47 = new JSONObject(result47);
		String fjfhdj47 = json47.get("CUR_DATA").toString();
		JSONArray jsonArray47 = new JSONArray(fjfhdj47);
		ArrayList<DASHBOARD_DIST> tableList7 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray47.length(); i++) {
			JSONObject jsonData47 = jsonArray47.getJSONObject(i);

			hdr47 = jsonData47.optString("HDR");

			tableList7.add(new DASHBOARD_DIST(jsonData47.optString("HDR"), jsonData47.optString("LINEX"),
					jsonData47.optString("SYS_LOSS"), null, null, jsonData47.optString("NET_IMPORT_KWH"), null, null,
					jsonData47.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr47_table", hdr47);
		model.addAttribute("tableList47", tableList7);

		// table show dpd_BILLED_UNIT_UP upto month ends

		// table show dpd_BILLED_amt_CM current month starts

		Map<String, Object> result48 = getAllStatesJdbcCall408.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json48 = new JSONObject(result48);
		String fjfhdj48 = json48.get("CUR_DATA").toString();
		JSONArray jsonArray48 = new JSONArray(fjfhdj48);
		ArrayList<DASHBOARD_DIST> tableList8 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray48.length(); i++) {
			JSONObject jsonData48 = jsonArray48.getJSONObject(i);

			hdr48 = jsonData48.optString("HDR");

			tableList8.add(new DASHBOARD_DIST(jsonData48.optString("HDR"), jsonData48.optString("LINEX"), null, null,
					null, null, null, jsonData48.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr48_table", hdr48);
		model.addAttribute("tableList48", tableList8);

		// table show dpd_BILLED_amt_CM current month ends

		// table show dpd_BILLED_amt_UP upto month starts

		Map<String, Object> result49 = getAllStatesJdbcCall409.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json49 = new JSONObject(result49);
		String fjfhdj49 = json49.get("CUR_DATA").toString();
		JSONArray jsonArray49 = new JSONArray(fjfhdj49);
		ArrayList<DASHBOARD_DIST> tableList9 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray49.length(); i++) {
			JSONObject jsonData49 = jsonArray49.getJSONObject(i);

			hdr49 = jsonData49.optString("HDR");

			tableList9.add(new DASHBOARD_DIST(jsonData49.optString("HDR"), jsonData49.optString("LINEX"), null, null,
					null, null, null, jsonData49.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr49_table", hdr49);
		model.addAttribute("tableList49", tableList9);

		// table show dpd_BILLED_amt_UP upto month ends

		// table show dpd_COLL_amt_CM current month starts

		Map<String, Object> result50 = getAllStatesJdbcCall410.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json50 = new JSONObject(result50);
		String fjfhdj50 = json50.get("CUR_DATA").toString();
		JSONArray jsonArray50 = new JSONArray(fjfhdj50);
		ArrayList<DASHBOARD_DIST> tableList10 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray50.length(); i++) {
			JSONObject jsonData50 = jsonArray50.getJSONObject(i);

			hdr50 = jsonData50.optString("HDR");

			tableList10.add(new DASHBOARD_DIST(jsonData50.optString("HDR"), jsonData50.optString("LINEX"), null, null,
					null, null, jsonData50.optString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr50_table", hdr50);
		model.addAttribute("tableList50", tableList10);

		// table show dpd_COLL_amt_CM current month ends

		// table show dpd_COLL_amt_up upto month starts

		Map<String, Object> result51 = getAllStatesJdbcCall411.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json51 = new JSONObject(result51);
		String fjfhdj51 = json51.get("CUR_DATA").toString();
		JSONArray jsonArray51 = new JSONArray(fjfhdj51);
		ArrayList<DASHBOARD_DIST> tableList11 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray51.length(); i++) {
			JSONObject jsonData51 = jsonArray51.getJSONObject(i);

			hdr51 = jsonData51.optString("HDR");

			tableList11.add(new DASHBOARD_DIST(jsonData51.optString("HDR"), jsonData51.optString("LINEX"), null, null,
					null, null, jsonData51.optString("COLL_AMT"), null, null, null, null));
		}
		System.out.println("table51");
		System.out.println(hdr51);
		System.out.println(tableList11);
		model.addAttribute("hdr51_table", hdr51);
		model.addAttribute("tableList51", tableList11);

		// table show dpd_COLL_amt_up upto month ends

		// table show dpd_EQ_MONTH_CM current month starts

		Map<String, Object> result52 = getAllStatesJdbcCall412.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json52 = new JSONObject(result52);
		String fjfhdj52 = json52.get("CUR_DATA").toString();
		JSONArray jsonArray52 = new JSONArray(fjfhdj52);
		ArrayList<DASHBOARD_DIST> tableList12 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray52.length(); i++) {
			JSONObject jsonData52 = jsonArray52.getJSONObject(i);

			hdr52 = jsonData52.optString("HDR");

			tableList12.add(new DASHBOARD_DIST(jsonData52.optString("HDR"), jsonData52.optString("LINEX"), null, null,
					null, jsonData52.optString("NET_IMPORT_KWH"), null, jsonData52.optString("BILLED_AMT"), null,
					jsonData52.optString("EQ_MONTH"), jsonData52.optString("REC_AMT")));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr52_table", hdr52);
		model.addAttribute("tableList52", tableList12);

		// table show dpd_EQ_MONTH_CM current month ends

		// table show dpd_EQ_MONTH_up upto month starts

		Map<String, Object> result53 = getAllStatesJdbcCall413.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, e, f);
		JSONObject json53 = new JSONObject(result53);
		String fjfhdj53 = json53.get("CUR_DATA").toString();
		JSONArray jsonArray53 = new JSONArray(fjfhdj53);
		ArrayList<DASHBOARD_DIST> tableList13 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray53.length(); i++) {
			JSONObject jsonData53 = jsonArray53.getJSONObject(i);

			hdr53 = jsonData53.optString("HDR");

			tableList13.add(new DASHBOARD_DIST(jsonData53.optString("HDR"), jsonData53.optString("LINEX"), null, null,
					null, jsonData53.optString("NET_IMPORT_KWH"), null, jsonData53.optString("BILLED_AMT"), null,
					jsonData53.optString("EQ_MONTH"), jsonData53.optString("REC_AMT")));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr53_table", hdr53);
		model.addAttribute("tableList53", tableList13);

		// table show dpd_EQ_MONTH_up upto month ends

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		

//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 

//		IC_ZONE_MST drop-down start 
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		IC_ZONE_MST drop-down end 	

		IC_DASHBOARD_DIST abc = new IC_DASHBOARD_DIST();
		abc.setBill(a);
		abc.setReport("1");

		model.addAttribute("xyz", abc);
		
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(abc.getBill())) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_DASHBOARD_DIST";
	}

//	graph end 

	@PostMapping("/IC_DASHBOARD_DIST")
	public String ic_modules_list_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, IC_DASHBOARD_DIST module_list,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";
		String hdr13 = "";
		String hdr14 = "";

		String hdr40 = "";
		String hdr41 = "";
		String hdr42 = "";
		String hdr43 = "";
		String hdr44 = "";
		String hdr45 = "";
		String hdr46 = "";
		String hdr47 = "";
		String hdr48 = "";
		String hdr49 = "";
		String hdr50 = "";
		String hdr51 = "";
		String hdr52 = "";
		String hdr53 = "";
		String hdr54 = "";

		String a = module_list.getBill();
		String b = module_list.getZone();
		String c = module_list.getCircle();
		String g = module_list.getDiv();

		String d = module_list.getLoc();
		String f = module_list.getReport();

//	
//		System.out.println("pera");
//		System.out.println(module_list);

		Map<String, Object> result = getAllStatesJdbcCall110.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);

//	    System.out.println("gfdg");
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.optString("HDR");
			graphData.put(jsonData.optString("LINEX"), Double.valueOf(jsonData.optString("SYS_LOSS")));
		}

//	   
//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall120.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.optString("HDR");
			graphData1.put(jsonData1.optString("LINEX"), Double.valueOf(jsonData1.optString("SYS_LOSS")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		Map<String, Object> result2 = getAllStatesJdbcCall111.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph2");	
//		System.out.println(result2);	    	
		JSONObject json2 = new JSONObject(result2);
		String fjfhdj2 = json2.get("CUR_DATA").toString();
		JSONArray jsonArray2 = new JSONArray(fjfhdj2);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData2 = new TreeMap<>();
		for (int i = 0; i < jsonArray2.length(); i++) {
			JSONObject jsonData2 = jsonArray2.getJSONObject(i);

			hdr3 = jsonData2.optString("HDR");
			graphData2.put(jsonData2.optString("LINEX"), Double.valueOf(jsonData2.optString("CI_RATIO")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr3_graph", hdr3);
		model.addAttribute("chartData2", graphData2);

		Map<String, Object> result3 = getAllStatesJdbcCall112.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json3 = new JSONObject(result3);
		String fjfhdj3 = json3.get("CUR_DATA").toString();
		JSONArray jsonArray3 = new JSONArray(fjfhdj3);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData3 = new TreeMap<>();
		for (int i = 0; i < jsonArray3.length(); i++) {
			JSONObject jsonData3 = jsonArray3.getJSONObject(i);

			hdr4 = jsonData3.optString("HDR");
			graphData3.put(jsonData3.optString("LINEX"), Double.valueOf(jsonData3.optString("CI_RATIO")));
		}

//	    System.out.println(hdr4);
//	    System.out.println(graphData3);
		model.addAttribute("hdr4_graph", hdr4);
		model.addAttribute("chartData3", graphData3);

		Map<String, Object> result4 = getAllStatesJdbcCall113.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json4 = new JSONObject(result4);
		String fjfhdj4 = json4.get("CUR_DATA").toString();
		JSONArray jsonArray4 = new JSONArray(fjfhdj4);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData4 = new TreeMap<>();
		for (int i = 0; i < jsonArray4.length(); i++) {
			JSONObject jsonData4 = jsonArray4.getJSONObject(i);

			hdr5 = jsonData4.optString("HDR");
			graphData4.put(jsonData4.optString("LINEX"), Double.valueOf(jsonData4.optString("CB_RATIO")));
		}

//	    System.out.println(hdr5);
//	    System.out.println(graphData4);
		model.addAttribute("hdr5_graph", hdr5);
		model.addAttribute("chartData4", graphData4);

		Map<String, Object> result5 = getAllStatesJdbcCall114.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json5 = new JSONObject(result5);
		String fjfhdj5 = json5.get("CUR_DATA").toString();
		JSONArray jsonArray5 = new JSONArray(fjfhdj5);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData5 = new TreeMap<>();
		for (int i = 0; i < jsonArray5.length(); i++) {
			JSONObject jsonData5 = jsonArray5.getJSONObject(i);

			hdr6 = jsonData5.optString("HDR");
			graphData5.put(jsonData5.optString("LINEX"), Double.valueOf(jsonData5.optString("CB_RATIO")));
		}

//	    System.out.println(hdr6);
//	    System.out.println(graphData5);
		model.addAttribute("hdr6_graph", hdr6);
		model.addAttribute("chartData5", graphData5);

		Map<String, Object> result6 = getAllStatesJdbcCall115.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json6 = new JSONObject(result6);
		String fjfhdj6 = json6.get("CUR_DATA").toString();
		JSONArray jsonArray6 = new JSONArray(fjfhdj6);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData6 = new TreeMap<>();
		for (int i = 0; i < jsonArray6.length(); i++) {
			JSONObject jsonData6 = jsonArray6.getJSONObject(i);

			hdr7 = jsonData6.optString("HDR");
			graphData6.put(jsonData6.optString("LINEX"), Double.valueOf(jsonData6.optString("EQ_MONTH")));
		}

//	    System.out.println(hdr7);
//	    System.out.println(graphData6);
		model.addAttribute("hdr7_graph", hdr7);
		model.addAttribute("chartData6", graphData6);

		Map<String, Object> result7 = getAllStatesJdbcCall116.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json7 = new JSONObject(result7);
		String fjfhdj7 = json7.get("CUR_DATA").toString();
		JSONArray jsonArray7 = new JSONArray(fjfhdj7);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData7 = new TreeMap<>();
		for (int i = 0; i < jsonArray7.length(); i++) {
			JSONObject jsonData7 = jsonArray7.getJSONObject(i);

			hdr8 = jsonData7.optString("HDR");
			graphData7.put(jsonData7.optString("LINEX"), Double.valueOf(jsonData7.optString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData7);
		model.addAttribute("hdr8_graph", hdr8);
		model.addAttribute("chartData7", graphData7);

		Map<String, Object> result8 = getAllStatesJdbcCall117.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json8 = new JSONObject(result8);
		String fjfhdj8 = json8.get("CUR_DATA").toString();
		JSONArray jsonArray8 = new JSONArray(fjfhdj8);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData8 = new TreeMap<>();
		for (int i = 0; i < jsonArray8.length(); i++) {
			JSONObject jsonData8 = jsonArray8.getJSONObject(i);

			hdr8 = jsonData8.optString("HDR");
			graphData8.put(jsonData8.optString("LINEX"), Double.valueOf(jsonData8.optString("BILLED_UNIT")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr9_graph", hdr8);
		model.addAttribute("chartData8", graphData8);

		Map<String, Object> result10 = getAllStatesJdbcCall217.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json10 = new JSONObject(result10);
		String fjfhdj10 = json10.get("CUR_DATA").toString();
		JSONArray jsonArray10 = new JSONArray(fjfhdj10);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData10 = new TreeMap<>();
		for (int i = 0; i < jsonArray10.length(); i++) {
			JSONObject jsonData10 = jsonArray10.getJSONObject(i);

			hdr10 = jsonData10.optString("HDR");
			graphData10.put(jsonData10.optString("LINEX"), Double.valueOf(jsonData10.optString("COLL_AMT")));
		}

//	    System.out.println("jaan");
//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr10_graph", hdr10);
		model.addAttribute("chartData10", graphData10);

		Map<String, Object> result11 = getAllStatesJdbcCall219.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, g, d, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json11 = new JSONObject(result11);
		String fjfhdj11 = json11.get("CUR_DATA").toString();
		JSONArray jsonArray11 = new JSONArray(fjfhdj11);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData11 = new TreeMap<>();
		for (int i = 0; i < jsonArray11.length(); i++) {
			JSONObject jsonData11 = jsonArray11.getJSONObject(i);

			hdr11 = jsonData11.optString("HDR");
			graphData11.put(jsonData11.optString("LINEX"), Double.valueOf(jsonData11.optString("COLL_AMT")));
		}

//	    System.out.println(hdr10);
//	    System.out.println(graphData10);
		model.addAttribute("hdr11_graph", hdr11);
		model.addAttribute("chartData11", graphData11);

		Map<String, Object> result12 = getAllStatesJdbcCall220.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json12 = new JSONObject(result12);
		String fjfhdj12 = json12.get("CUR_DATA").toString();
		JSONArray jsonArray12 = new JSONArray(fjfhdj12);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData12 = new TreeMap<>();
		for (int i = 0; i < jsonArray12.length(); i++) {
			JSONObject jsonData12 = jsonArray12.getJSONObject(i);

			hdr12 = jsonData12.optString("HDR");
			graphData12.put(jsonData12.optString("LINEX"), Double.valueOf(jsonData12.optString("EQ_MONTH")));
		}

//	    System.out.println(hdr8);
//	    System.out.println(graphData8);
		model.addAttribute("hdr12_graph", hdr12);
		model.addAttribute("chartData12", graphData12);

//		dpd_BILLED_amt_CM start

		Map<String, Object> result13 = getAllStatesJdbcCall517.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json13 = new JSONObject(result13);
		String fjfhdj13 = json13.get("CUR_DATA").toString();
		JSONArray jsonArray13 = new JSONArray(fjfhdj13);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData13 = new TreeMap<>();
		for (int i = 0; i < jsonArray13.length(); i++) {
			JSONObject jsonData13 = jsonArray13.getJSONObject(i);

			hdr13 = jsonData13.optString("HDR");
			graphData13.put(jsonData13.optString("LINEX"), Double.valueOf(jsonData13.optString("BILLED_AMT")));
		}

//	    System.out.println(hdr13);
//	    System.out.println(graphData13);
		model.addAttribute("hdr13_graph", hdr13);
		model.addAttribute("chartData13", graphData13);

//		dpd_BILLED_amt_CM end

//		dpd_BILLED_amt_UP start

		Map<String, Object> result14 = getAllStatesJdbcCall518.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
//		System.out.println("graph3");	
//		System.out.println(result3);	    	
		JSONObject json14 = new JSONObject(result14);
		String fjfhdj14 = json14.get("CUR_DATA").toString();
		JSONArray jsonArray14 = new JSONArray(fjfhdj14);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData14 = new TreeMap<>();
		for (int i = 0; i < jsonArray14.length(); i++) {
			JSONObject jsonData14 = jsonArray14.getJSONObject(i);

			hdr14 = jsonData14.optString("HDR");
			graphData14.put(jsonData14.optString("LINEX"), Double.valueOf(jsonData14.optString("BILLED_AMT")));
		}

//	    System.out.println(hdr14);
//	    System.out.println(graphData14);
		model.addAttribute("hdr14_graph", hdr14);
		model.addAttribute("chartData14", graphData14);

//		dpd_BILLED_amt_UP end

		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall400.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DASHBOARD_DIST> tableList = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray40.length(); i++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(i);

			hdr40 = jsonData40.optString("HDR");

			tableList.add(new DASHBOARD_DIST(jsonData40.optString("HDR"), jsonData40.optString("LINEX"),
					jsonData40.optString("SYS_LOSS"), null, null, jsonData40.optString("NET_IMPORT_KWH"), null, null,
					jsonData40.optString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr40);
		model.addAttribute("tableList", tableList);

		// table show sys_loss current month ends

		// table show sys_loss upto month starts

		Map<String, Object> result41 = getAllStatesJdbcCall401.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Sys_loss_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json41 = new JSONObject(result40);
		String fjfhdj41 = json41.get("CUR_DATA").toString();
		JSONArray jsonArray41 = new JSONArray(fjfhdj41);
		ArrayList<DASHBOARD_DIST> tableList1 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray41.length(); i++) {
			JSONObject jsonData41 = jsonArray41.getJSONObject(i);

			hdr41 = jsonData41.optString("HDR");

			tableList1.add(new DASHBOARD_DIST(jsonData41.optString("HDR"), jsonData41.optString("LINEX"),
					jsonData41.optString("SYS_LOSS"), null, null, jsonData41.optString("NET_IMPORT_KWH"), null, null,
					jsonData41.optString("BILLED_UNIT"), null, null));
		}

//				System.out.println("hdr25");
//				System.out.println(hdr25);
		model.addAttribute("hdr41_table", hdr41);
		model.addAttribute("tableList1", tableList1);

		// table show sys_loss upto month ends

		// table show dpd_CI_Ratio_CM current month starts

		Map<String, Object> result42 = getAllStatesJdbcCall402.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json42 = new JSONObject(result42);
		String fjfhdj42 = json42.get("CUR_DATA").toString();
		JSONArray jsonArray42 = new JSONArray(fjfhdj42);
		ArrayList<DASHBOARD_DIST> tableList2 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray42.length(); i++) {
			JSONObject jsonData42 = jsonArray42.getJSONObject(i);

			hdr42 = jsonData42.optString("HDR");

			tableList2.add(new DASHBOARD_DIST(jsonData42.optString("HDR"), jsonData42.optString("LINEX"), null,
					jsonData42.optString("CI_RATIO"), null, jsonData42.optString("NET_IMPORT_KWH"),
					jsonData42.optString("COLL_AMT"), jsonData42.optString("BILLED_AMT"),
					jsonData42.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table");
//				System.out.println(hdr42);
//				System.out.println(tableList2);
		model.addAttribute("hdr42_table", hdr42);
		model.addAttribute("tableList42", tableList2);

		// table show dpd_CI_Ratio_CM current month ends

		// table show dpd_CI_Ratio_CM upto month starts

		Map<String, Object> result43 = getAllStatesJdbcCall403.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CI_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json43 = new JSONObject(result43);
		String fjfhdj43 = json43.get("CUR_DATA").toString();
		JSONArray jsonArray43 = new JSONArray(fjfhdj43);
		ArrayList<DASHBOARD_DIST> tableList3 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray43.length(); i++) {
			JSONObject jsonData43 = jsonArray43.getJSONObject(i);

			hdr43 = jsonData43.optString("HDR");

			tableList3.add(new DASHBOARD_DIST(jsonData43.optString("HDR"), jsonData43.optString("LINEX"), null,
					jsonData43.optString("CI_RATIO"), null, jsonData43.optString("NET_IMPORT_KWH"),
					jsonData43.optString("COLL_AMT"), jsonData43.optString("BILLED_AMT"),
					jsonData43.optString("BILLED_UNIT"), null, null));
		}
		System.out.println("table");
		System.out.println(hdr43);
		System.out.println(tableList3);
		model.addAttribute("hdr43_table", hdr43);
		model.addAttribute("tableList43", tableList3);

		// table show dpd_CI_Ratio_CM upto month ends

		// table show dpd_CB_Ratio_CM current month starts

		Map<String, Object> result44 = getAllStatesJdbcCall404.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json44 = new JSONObject(result44);
		String fjfhdj44 = json44.get("CUR_DATA").toString();
		JSONArray jsonArray44 = new JSONArray(fjfhdj44);
		ArrayList<DASHBOARD_DIST> tableList4 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray44.length(); i++) {
			JSONObject jsonData44 = jsonArray44.getJSONObject(i);

			hdr44 = jsonData44.optString("HDR");

			tableList4.add(new DASHBOARD_DIST(jsonData44.optString("HDR"), jsonData44.optString("LINEX"), null, null,
					jsonData44.optString("CB_RATIO"), null, jsonData44.optString("COLL_AMT"),
					jsonData44.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr44_table", hdr44);
		model.addAttribute("tableList44", tableList4);

		// table show dpd_CB_Ratio_CM current month ends

		// table show dpd_CB_Ratio_CM upto month starts

		Map<String, Object> result45 = getAllStatesJdbcCall405.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_CB_Ratio_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json45 = new JSONObject(result45);
		String fjfhdj45 = json45.get("CUR_DATA").toString();
		JSONArray jsonArray45 = new JSONArray(fjfhdj45);
		ArrayList<DASHBOARD_DIST> tableList5 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray45.length(); i++) {
			JSONObject jsonData45 = jsonArray45.getJSONObject(i);

			hdr45 = jsonData45.optString("HDR");

			tableList5.add(new DASHBOARD_DIST(jsonData45.optString("HDR"), jsonData45.optString("LINEX"), null, null,
					jsonData45.optString("CB_RATIO"), null, jsonData45.optString("COLL_AMT"),
					jsonData45.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr45_table", hdr45);
		model.addAttribute("tableList45", tableList5);

		// table show dpd_CB_Ratio_CM upto month ends

		// table show dpd_BILLED_UNIT_cm current month starts

		Map<String, Object> result46 = getAllStatesJdbcCall406.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_cm")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json46 = new JSONObject(result46);
		String fjfhdj46 = json46.get("CUR_DATA").toString();
		JSONArray jsonArray46 = new JSONArray(fjfhdj46);
		ArrayList<DASHBOARD_DIST> tableList6 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray46.length(); i++) {
			JSONObject jsonData46 = jsonArray46.getJSONObject(i);

			hdr46 = jsonData46.optString("HDR");

			tableList6.add(new DASHBOARD_DIST(jsonData46.optString("HDR"), jsonData46.optString("LINEX"),
					jsonData46.optString("SYS_LOSS"), null, null, jsonData46.optString("NET_IMPORT_KWH"), null, null,
					jsonData46.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr46_table", hdr46);
		model.addAttribute("tableList46", tableList6);

		// table show dpd_BILLED_UNIT_cm current month ends

		// table show dpd_BILLED_UNIT_UP upto month starts

		Map<String, Object> result47 = getAllStatesJdbcCall407.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_UNIT_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json47 = new JSONObject(result47);
		String fjfhdj47 = json47.get("CUR_DATA").toString();
		JSONArray jsonArray47 = new JSONArray(fjfhdj47);
		ArrayList<DASHBOARD_DIST> tableList7 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray47.length(); i++) {
			JSONObject jsonData47 = jsonArray47.getJSONObject(i);

			hdr47 = jsonData47.optString("HDR");

			tableList7.add(new DASHBOARD_DIST(jsonData47.optString("HDR"), jsonData47.optString("LINEX"),
					jsonData47.optString("SYS_LOSS"), null, null, jsonData47.optString("NET_IMPORT_KWH"), null, null,
					jsonData47.optString("BILLED_UNIT"), null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr47_table", hdr47);
		model.addAttribute("tableList47", tableList7);

		// table show dpd_BILLED_UNIT_UP upto month ends

		// table show dpd_BILLED_amt_CM current month starts

		Map<String, Object> result48 = getAllStatesJdbcCall408.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json48 = new JSONObject(result48);
		String fjfhdj48 = json48.get("CUR_DATA").toString();
		JSONArray jsonArray48 = new JSONArray(fjfhdj48);
		ArrayList<DASHBOARD_DIST> tableList8 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray48.length(); i++) {
			JSONObject jsonData48 = jsonArray48.getJSONObject(i);

			hdr48 = jsonData48.optString("HDR");

			tableList8.add(new DASHBOARD_DIST(jsonData48.optString("HDR"), jsonData48.optString("LINEX"), null, null,
					null, null, null, jsonData48.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr48_table", hdr48);
		model.addAttribute("tableList48", tableList8);

		// table show dpd_BILLED_amt_CM current month ends

		// table show dpd_BILLED_amt_UP upto month starts

		Map<String, Object> result49 = getAllStatesJdbcCall409.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_BILLED_amt_UP")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json49 = new JSONObject(result49);
		String fjfhdj49 = json49.get("CUR_DATA").toString();
		JSONArray jsonArray49 = new JSONArray(fjfhdj49);
		ArrayList<DASHBOARD_DIST> tableList9 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray49.length(); i++) {
			JSONObject jsonData49 = jsonArray49.getJSONObject(i);

			hdr49 = jsonData49.optString("HDR");

			tableList9.add(new DASHBOARD_DIST(jsonData49.optString("HDR"), jsonData49.optString("LINEX"), null, null,
					null, null, null, jsonData49.optString("BILLED_AMT"), null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr49_table", hdr49);
		model.addAttribute("tableList49", tableList9);

		// table show dpd_BILLED_amt_UP upto month ends

		// table show dpd_COLL_amt_CM current month starts

		Map<String, Object> result50 = getAllStatesJdbcCall410.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json50 = new JSONObject(result50);
		String fjfhdj50 = json50.get("CUR_DATA").toString();
		JSONArray jsonArray50 = new JSONArray(fjfhdj50);
		ArrayList<DASHBOARD_DIST> tableList10 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray50.length(); i++) {
			JSONObject jsonData50 = jsonArray50.getJSONObject(i);

			hdr50 = jsonData50.optString("HDR");

			tableList10.add(new DASHBOARD_DIST(jsonData50.optString("HDR"), jsonData50.optString("LINEX"), null, null,
					null, null, jsonData50.optString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr50_table", hdr50);
		model.addAttribute("tableList50", tableList10);

		// table show dpd_COLL_amt_CM current month ends

		// table show dpd_COLL_amt_up upto month starts

		Map<String, Object> result51 = getAllStatesJdbcCall411.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_COLL_amt_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json51 = new JSONObject(result51);
		String fjfhdj51 = json51.get("CUR_DATA").toString();
		JSONArray jsonArray51 = new JSONArray(fjfhdj51);
		ArrayList<DASHBOARD_DIST> tableList11 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray51.length(); i++) {
			JSONObject jsonData51 = jsonArray51.getJSONObject(i);

			hdr51 = jsonData51.optString("HDR");

			tableList11.add(new DASHBOARD_DIST(jsonData51.optString("HDR"), jsonData51.optString("LINEX"), null, null,
					null, null, jsonData51.optString("COLL_AMT"), null, null, null, null));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr51_table", hdr51);
		model.addAttribute("tableList51", tableList11);

		// table show dpd_COLL_amt_up upto month ends

		// table show dpd_EQ_MONTH_CM current month starts

		Map<String, Object> result52 = getAllStatesJdbcCall412.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json52 = new JSONObject(result52);
		String fjfhdj52 = json52.get("CUR_DATA").toString();
		JSONArray jsonArray52 = new JSONArray(fjfhdj52);
		ArrayList<DASHBOARD_DIST> tableList12 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray52.length(); i++) {
			JSONObject jsonData52 = jsonArray52.getJSONObject(i);

			hdr52 = jsonData52.optString("HDR");

			tableList12.add(new DASHBOARD_DIST(jsonData52.optString("HDR"), jsonData52.optString("LINEX"), null, null,
					null, jsonData52.optString("NET_IMPORT_KWH"), null, jsonData52.optString("BILLED_AMT"), null,
					jsonData52.optString("EQ_MONTH"), jsonData52.optString("REC_AMT")));
		}
//				System.out.println("table44");
//				System.out.println(hdr44);
//				System.out.println(tableList4);
		model.addAttribute("hdr52_table", hdr52);
		model.addAttribute("tableList52", tableList12);

		// table show dpd_EQ_MONTH_CM current month ends

		// table show dpd_EQ_MONTH_up upto month starts

		Map<String, Object> result53 = getAllStatesJdbcCall413.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_EQ_MONTH_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, g, officeCode, f);
		JSONObject json53 = new JSONObject(result53);
		String fjfhdj53 = json53.get("CUR_DATA").toString();
		JSONArray jsonArray53 = new JSONArray(fjfhdj53);
		ArrayList<DASHBOARD_DIST> tableList13 = new ArrayList<DASHBOARD_DIST>();
		for (int i = 0; i < jsonArray53.length(); i++) {
			JSONObject jsonData53 = jsonArray53.getJSONObject(i);

			hdr53 = jsonData53.optString("HDR");

			tableList13.add(new DASHBOARD_DIST(jsonData53.optString("HDR"), jsonData53.optString("LINEX"), null, null,
					null, jsonData53.optString("NET_IMPORT_KWH"), null, jsonData53.optString("BILLED_AMT"), null,
					jsonData53.optString("EQ_MONTH"), jsonData53.optString("REC_AMT")));
		}
//				System.out.println("table45");
//				System.out.println(hdr43);
//				System.out.println(tableList5);
		model.addAttribute("hdr53_table", hdr53);
		model.addAttribute("tableList53", tableList13);

		// table show dpd_EQ_MONTH_up upto month ends

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.a(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down start 		

//		IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 

//		Month_Dropdown drop-down start 
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		Month_Dropdown drop-down end 	

//		circle drop-down start 
		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDaoRafi.getCircleList(officeCode, module_list.getZone());
		model.addAttribute("circleList", circleList);
//		circle drop-down end 

//		div drop-down start
		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDaoRafi.getdivList(officeCode, module_list.getCircle());
		model.addAttribute("divList", divList);
//		div drop-down end

//		loc drop-down start	
		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDaoRafi.getlocList(officeCode, module_list.getCircle(), module_list.getDiv());
		model.addAttribute("locList", locList);
//		loc drop-down end

		model.addAttribute("xyz", module_list);
		
		
		int index = 0;
		for (int i = 0; i < billList.size(); i++) {
			if (billList.get(i).getBILL_CYCLE_CODE().equals(module_list.getBill())) {
				index = i;
			}
		}
		model.addAttribute("month", billList.get(index).getBILL_CYCLE_DESC());

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_DIST";

	}

//	Generation Mod start 
	@GetMapping("/IC_DASHBOARD_GEN")
	public String ic_power_plant(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";

		String hdr25 = "";
		String hdr27 = "";

		String listlast_month_date = iconvDaoRafi.listlast_month_date();

//		 System.out.println("LAST DATE");
//		System.out.println(listlast_month_date);

//		String  = listlast_month_date;
//		String[] parts = string.split("-");
//		String part1 = parts[0]; // 004
//		String part2 = parts[1]; // 034556
//		
//		String part = part1 + part2;

		String date = listlast_month_date; // 034556

//		System.out.println(date);

		String a = "000000";
		String b = null;
		String c = null;
		String d = null;
		String e = null;
		String f = null;
		String g = null;
		String h = date;
		String j = "1";

		model.addAttribute("bill", h);

		Map<String, Object> result = getAllStatesJdbcCall118.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
//		System.out.println("graph");	
//		System.out.println(result);		
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.optString("HDR");
			graphData.put(jsonData.optString("LINEX"), Double.valueOf(jsonData.optString("NET_GEN")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall119.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.optString("HDR");
			graphData1.put(jsonData1.optString("LINEX"), Double.valueOf(jsonData1.optString("NET_GEN")));
		}

//	    System.out.println("hh");
//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		// table show generation current month starts

		Map<String, Object> result25 = getAllStatesJdbcCall300.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
		JSONObject json25 = new JSONObject(result25);
		String fjfhdj25 = json25.get("CUR_DATA").toString();
		JSONArray jsonArray25 = new JSONArray(fjfhdj25);
		ArrayList<DASHBOARD> tableList = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray25.length(); i++) {
			JSONObject jsonData25 = jsonArray25.getJSONObject(i);

			hdr25 = jsonData25.optString("HDR");

			tableList.add(new DASHBOARD(jsonData25.optString("HDR"), jsonData25.optString("LINEX"),
					jsonData25.optString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr25);
		model.addAttribute("tableList", tableList);

		// table show generation current month ends

		// table show generation Upto month starts

		Map<String, Object> result27 = getAllStatesJdbcCall301.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(a, b, c, d, e, f, g, h, j);
		JSONObject json27 = new JSONObject(result27);
		String fjfhdj27 = json27.get("CUR_DATA").toString();
		JSONArray jsonArray27 = new JSONArray(fjfhdj27);
		ArrayList<DASHBOARD> tableList1 = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray27.length(); i++) {
			JSONObject jsonData27 = jsonArray27.getJSONObject(i);

			hdr27 = jsonData27.optString("HDR");

			tableList1.add(new DASHBOARD(jsonData27.optString("HDR"), jsonData27.optString("LINEX"),
					jsonData27.optString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr27_table", hdr27);
		model.addAttribute("tableList1", tableList1);

		// table show generation Upto month ends

//		IC_GEN_AREA drop-down start 
		ArrayList<IC_GEN_AREA> listIC_GEN_AREA = iconvDaoRafi.ga(officeCode);
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);
//		IC_GEN_AREA drop-down end 	

//		IC_PP_OWNER_TYPE drop-down start 
		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.ow_ty(officeCode);
		model.addAttribute("owner_typeList", listIC_PP_OWNER_TYPE);
//		IC_PP_OWNER_TYPE drop-down end 	

//		IC_TRANS_GRID drop-down start 
		ArrayList<IC_TRANS_GRID> listIC_TRANS_GRID = iconvDaoRafi.tr(officeCode);
		model.addAttribute("gridList", listIC_TRANS_GRID);
//		IC_TRANS_GRID drop-down end 

//		IC_FUEL_TYPE drop-down start 
		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.fu(officeCode);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
//		IC_FUEL_TYPE drop-down end 		

//		IC_POWER_PLANT drop-down start 
//		ArrayList<IC_POWER_PLANT>listIC_POWER_PLANT = iconvDao.po(officeCode,fuel,ow,grid,gen);
//		model.addAttribute("power_plantList", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.b(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST_GEN", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down end

//		ic_period_mst drop-down start 
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(officeCode);
		model.addAttribute("billList_GEN", billList);

//		ic_period_mst drop-down end 

		IC_DASHBOARD_GEN abc = new IC_DASHBOARD_GEN();
		abc.setBill(h);
		abc.setReport("1");

		model.addAttribute("gen", abc);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_GEN";
	}

	@PostMapping("/IC_DASHBOARD_GEN")
	public String ic_dashboard_gen_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, IC_DASHBOARD_GEN ic_dashboard_gen,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		System.out.println("gen_dash_post");

		String hdr1 = "";
		String hdr2 = "";
		String hdr3 = "";
		String hdr4 = "";
		String hdr5 = "";
		String hdr6 = "";
		String hdr7 = "";
		String hdr8 = "";
		String hdr9 = "";
		String hdr10 = "";
		String hdr11 = "";
		String hdr12 = "";
		String hdr13 = "";
		String hdr14 = "";

		String hdr25 = "";
		String hdr27 = "";

		String b = ic_dashboard_gen.getFuel();
		String c = ic_dashboard_gen.getOwner_type();
		String d = ic_dashboard_gen.getGrid();

		String e = ic_dashboard_gen.getOwner();
		String f = ic_dashboard_gen.getPower_plant();
		String g = ic_dashboard_gen.getArea();

		String h = ic_dashboard_gen.getBill();
		String j = ic_dashboard_gen.getReport();

//	
//		System.out.println("pera");
//		System.out.println(module_list);

		Map<String, Object> result = getAllStatesJdbcCall125.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		System.out.println("graph");
		System.out.println(result);
		JSONObject json = new JSONObject(result);
		String fjfhdj = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(fjfhdj);
//	    System.out.println(jsonArray);	

		Map<String, Double> graphData = new TreeMap<>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			hdr1 = jsonData.optString("HDR");
			graphData.put(jsonData.optString("LINEX"), Double.valueOf(jsonData.optString("NET_GEN")));
		}

//	    System.out.println(hdr1);
//	    System.out.println(graphData);
		model.addAttribute("hdr1_graph", hdr1);
		model.addAttribute("chartData", graphData);

		Map<String, Object> result1 = getAllStatesJdbcCall121.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
//		System.out.println("graph1");	
//		System.out.println(result1);		
		JSONObject json1 = new JSONObject(result1);
		String fjfhdj1 = json1.get("CUR_DATA").toString();
		JSONArray jsonArray1 = new JSONArray(fjfhdj1);
//	    System.out.println(jsonArray1);	

		Map<String, Double> graphData1 = new TreeMap<>();
		for (int i = 0; i < jsonArray1.length(); i++) {
			JSONObject jsonData1 = jsonArray1.getJSONObject(i);

			hdr2 = jsonData1.optString("HDR");
			graphData1.put(jsonData1.optString("LINEX"), Double.valueOf(jsonData1.optString("NET_GEN")));
		}

//	    System.out.println(hdr2);
//	    System.out.println(graphData1);
		model.addAttribute("hdr2_graph", hdr2);
		model.addAttribute("chartData1", graphData1);

		// table show starts

		Map<String, Object> result25 = getAllStatesJdbcCall300.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_CM")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		JSONObject json25 = new JSONObject(result25);
		String fjfhdj25 = json25.get("CUR_DATA").toString();
		JSONArray jsonArray25 = new JSONArray(fjfhdj25);
		ArrayList<DASHBOARD> tableList = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray25.length(); i++) {
			JSONObject jsonData25 = jsonArray25.getJSONObject(i);

			hdr25 = jsonData25.optString("HDR");

			tableList.add(new DASHBOARD(jsonData25.optString("HDR"), jsonData25.optString("LINEX"),
					jsonData25.optString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr2_table", hdr25);
		model.addAttribute("tableList", tableList);

		// table show ends

		// table show generation Upto month starts

		Map<String, Object> result27 = getAllStatesJdbcCall301.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_GEN_up")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, b, c, d, e, f, g, h, j);
		JSONObject json27 = new JSONObject(result27);
		String fjfhdj27 = json27.get("CUR_DATA").toString();
		JSONArray jsonArray27 = new JSONArray(fjfhdj27);
		ArrayList<DASHBOARD> tableList1 = new ArrayList<DASHBOARD>();
		for (int i = 0; i < jsonArray27.length(); i++) {
			JSONObject jsonData27 = jsonArray27.getJSONObject(i);

			hdr27 = jsonData27.optString("HDR");

			tableList1.add(new DASHBOARD(jsonData27.optString("HDR"), jsonData27.optString("LINEX"),
					jsonData27.optString("NET_GEN")));
		}

//		System.out.println("hdr25");
//		System.out.println(hdr25);
		model.addAttribute("hdr27_table", hdr27);
		model.addAttribute("tableList1", tableList1);

		// table show generation Upto month ends

//		IC_GEN_AREA drop-down start 
		ArrayList<IC_GEN_AREA> listIC_GEN_AREA = iconvDaoRafi.ga(officeCode);
		model.addAttribute("listIC_GEN_AREA", listIC_GEN_AREA);
//		IC_GEN_AREA drop-down end 	

//		IC_PP_OWNER_TYPE drop-down start 
		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = iconvDaoRafi.ow_ty(officeCode);
		model.addAttribute("owner_typeList", listIC_PP_OWNER_TYPE);
//		IC_PP_OWNER_TYPE drop-down end 	

//		IC_TRANS_GRID drop-down start 
		ArrayList<IC_TRANS_GRID> listIC_TRANS_GRID = iconvDaoRafi.tr(officeCode);
		model.addAttribute("gridList", listIC_TRANS_GRID);
//		IC_TRANS_GRID drop-down end 

//		IC_FUEL_TYPE drop-down start 
		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = iconvDaoRafi.fu(officeCode);
		model.addAttribute("listIC_FUEL_TYPE", listIC_FUEL_TYPE);
//		IC_FUEL_TYPE drop-down end 		

//		IC_POWER_PLANT drop-down start 
//		ArrayList<IC_POWER_PLANT>listIC_POWER_PLANT = iconvDao.po(officeCode);
//		model.addAttribute("power_plantList", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_POWER_PLANT drop-down start
		ArrayList<IC_POWER_PLANT> listIC_POWER_PLANT = new ArrayList<>();
		listIC_POWER_PLANT = iconvDaoRafi.getIC_POWER_PLANTList(officeCode, ic_dashboard_gen.getFuel(),
				ic_dashboard_gen.getOwner_type(), ic_dashboard_gen.getOwner(), ic_dashboard_gen.getArea(),
				ic_dashboard_gen.getGrid());
		model.addAttribute("listIC_POWER_PLANT", listIC_POWER_PLANT);
//		IC_POWER_PLANT drop-down end 

//		IC_REPORT_LEVEL_MST drop-down start 
		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = iconvDaoRafi.b(officeCode);
		model.addAttribute("listIC_REPORT_LEVEL_MST_GEN", listIC_REPORT_LEVEL_MST);
//		IC_REPORT_LEVEL_MST drop-down end

//		ic_period_mst drop-down start 
		ArrayList<IC_PERIOD_MST1> billList = iconvDaoRafi.d(officeCode);
		model.addAttribute("billList_GEN", billList);

//		ic_period_mst drop-down end 	

//		owner drop-down start 	
		ArrayList<IC_PP_OWNER> ownerList = new ArrayList<>();
		ownerList = iconvDaoRafi.getownerList(officeCode, ic_dashboard_gen.getOwner_type());
//		owner drop-down end 

		model.addAttribute("gen", ic_dashboard_gen);
		model.addAttribute("ownerList", ownerList);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DASHBOARD_GEN";

	}

//	Generation Mod end 

	///////////////////// end graph

	@GetMapping("/IC_ZONE_MST")
	public String ic_zone_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_ZONE_MSTmain ic_zone_mst = new IC_ZONE_MSTmain();

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("ic_zone_mst", ic_zone_mst);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST")
	public String ic_zone_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_ZONE_MSTmain ic_zone_mst) {

		convergeDaoSurovi.insertICZoneMst(ic_zone_mst,user_name);

		return "redirect:/IC_ZONE_MST";
	}

	@GetMapping("/IC_ZONE_MST/{id}")
	public String ic_zone_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_ZONE_MSTmain ic_zone_mst = convergeDaoSurovi.singleIC_ZONE_MST(id);

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();

		model.addAttribute("ic_zone_mst", ic_zone_mst);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST/{id}")
	public String ic_zone_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_ZONE_MSTmain ic_zone_mst) {

		ic_zone_mst.setZONE_ID(id);

		convergeDaoSurovi.editICZoneMst(ic_zone_mst,user_name);

		return "redirect:/IC_ZONE_MST";
	}

	@PostMapping("/IC_ZONE_MST_delete/{id}")
	public String IC_ZONE_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICZoneMst(id);

		return "redirect:/IC_ZONE_MST";
	}

//	CLEAR IC_ZONE_MST START
	@PostMapping("/IC_ZONE_MST_clear/{id}")
	public String IC_ZONE_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_ZONE_MST";
	}

	// IC_CIRCLE_MST START

	@GetMapping("/IC_CIRCLE_MST/{zoneC}")
	public String ic_circle_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("zoneC") String zCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_CIRCLE_MSTmain ic_circle_mst = new IC_CIRCLE_MSTmain();

		ArrayList<IC_CIRCLE_MSTmain> zoneC = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);

		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		model.addAttribute("zCode", zCode);
		model.addAttribute("ic_circle_mst", ic_circle_mst);
		model.addAttribute("listIC_CIRCLE_MST", zoneC);

		return "IC_CIRCLE_MST";

	}

	@PostMapping("/IC_CIRCLE_MST/{zoneC}")
	public String ic_circle_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("zoneC") String zCode, IC_CIRCLE_MSTmain ic_circle_mst) {

		ic_circle_mst.setZONE_CODE(zCode);

		convergeDaoSurovi.insertICCircleMst(ic_circle_mst,user_name);

		return "redirect:/IC_CIRCLE_MST/" + zCode;

	}

	@GetMapping("/IC_CIRCLE_MST/{zoneC}/{cirId}")
	public String ic_circle_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("zoneC") String zCode, @PathVariable("cirId") String cId, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_CIRCLE_MSTmain ic_circle_mst = convergeDaoSurovi.singleIC_CIRCLE_MST(cId);

		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		model.addAttribute("ic_circle_mst", ic_circle_mst);
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("cId", cId);
		model.addAttribute("cCode", ic_circle_mst.getCIRCLE_CODE());
		model.addAttribute("zCode", zCode);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_CIRCLE_MST";
	}

	@PostMapping("/IC_CIRCLE_MST/{zoneC}/{cirId}")
	public String ic_circle_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("zoneC") String zCode, @PathVariable("cirId") String cId,
			Model model, IC_CIRCLE_MSTmain ic_circle_mst) {

		ic_circle_mst.setZONE_CODE(zCode);
		ic_circle_mst.setCIRCLE_ID(cId);

		convergeDaoSurovi.editICCircleMst(ic_circle_mst,user_name);

		return "redirect:/IC_CIRCLE_MST/" + zCode;
	}

	@PostMapping("/IC_CIRCLE_MST_delete/{zoneC}/{cirId}")
	public String ic_circle_mst_delete(@PathVariable("zoneC") String zCode, @PathVariable("cirId") int cId) {

		convergeDaoSurovi.deleteICCircleMst(cId);

		return "redirect:/IC_CIRCLE_MST/" + zCode;
	}

	// CLEAR IC_CIRCLE_MST START
	@PostMapping("/IC_CIRCLE_MST_clear/{cirId}")

	public String IC_CIRCLE_MST_clear(@PathVariable("cirId") int cId) {

		return "redirect:/IC_CIRCLE_MST";
	}

	///////////////

	// IC_DIST_DIV_MST START

	@GetMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}")
	public String ic_dist_div_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("zoneC") String zCode, @PathVariable("cCode") String circle, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_DIST_DIV_MSTmain ic_dist_div_mst = new IC_DIST_DIV_MSTmain();

		ArrayList<IC_DIST_DIV_MSTmain> division = convergeDaoSurovi.listIC_DIST_DIV_MST(circle);

		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();

		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);

		model.addAttribute("ic_dist_div_mst", ic_dist_div_mst);
		model.addAttribute("listIC_DIST_DIV_MST", division);
		model.addAttribute("flag", flag);
		model.addAttribute("cCode", circle);
		model.addAttribute("zCode", zCode);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DIST_DIV_MST";

	}

	@PostMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}")
	public String ic_dist_div_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("zoneC") String i, @PathVariable("cCode") String j,
			IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		ic_dist_div_mst.setZONE_CODE(i);
		ic_dist_div_mst.setCIRCLE_CODE(j);

		convergeDaoSurovi.insertICDivMst(ic_dist_div_mst,user_name);

		return "redirect:/IC_DIST_DIV_MST/" + i + "/" + j;

	}

	@GetMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}/{divId}")
	public String ic_dist_div_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") String dID, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_DIST_DIV_MSTmain ic_dist_div_mst = convergeDaoSurovi.singleIC_DIST_DIV_MST(dID);

		ArrayList<IC_DIST_DIV_MSTmain> listIC_DIST_DIV_MST = convergeDaoSurovi.listIC_DIST_DIV_MST(cirCode);
		ArrayList<IC_CIRCLE_MSTmain> listIC_CIRCLE_MST = convergeDaoSurovi.listIC_CIRCLE_MST(zCode);
		ArrayList<IC_ZONE_MSTmain> listIC_ZONE_MST = convergeDaoSurovi.listIC_ZONE_MST();
		model.addAttribute("listIC_CIRCLE_MST", listIC_CIRCLE_MST);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
		model.addAttribute("ic_dist_div_mst", ic_dist_div_mst);
		model.addAttribute("listIC_DIST_DIV_MST", listIC_DIST_DIV_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("cCode", cirCode);
		model.addAttribute("divId", dID);
		model.addAttribute("zCode", zCode);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_DIST_DIV_MST";
	}

	@PostMapping("/IC_DIST_DIV_MST/{zoneC}/{cCode}/{divId}")
	public String ic_circle_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") String dID, Model model, IC_DIST_DIV_MSTmain ic_dist_div_mst) {

		ic_dist_div_mst.setZONE_CODE(zCode);
		ic_dist_div_mst.setCIRCLE_CODE(cirCode);
		ic_dist_div_mst.setDIST_DIV_ID(dID);

		convergeDaoSurovi.editICDivMst(ic_dist_div_mst,user_name);

		return "redirect:/IC_DIST_DIV_MST/" + zCode + "/" + cirCode;
	}

	@PostMapping("/IC_DIST_DIV_MST_delete/{zoneC}/{cCode}/{divId}")
	public String ic_loc_mod_delete(@PathVariable("zoneC") String zCode, @PathVariable("cCode") String cirCode,
			@PathVariable("divId") int dID) {

		convergeDaoSurovi.deleteICDivMst(dID);

		return "redirect:/IC_DIST_DIV_MST/" + zCode + "/" + cirCode;
	}

	// CLEAR IC_DIST_DIV_MST START
	@PostMapping("/IC_DIST_DIV_MST_clear/{divId}")

	public String IC_DIST_DIV_MST_clear(@PathVariable("divId") int dID) {

		return "redirect:/IC_DIST_DIV_MST";
	}

//	IC_REPORT_LEVEL_MST

	@GetMapping("/IC_REPORT_LEVEL_MST")
	public String ic_report_level_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);

		String flag = "0";

		IC_REPORT_LEVEL_MSTmain ic_report_level_mst = new IC_REPORT_LEVEL_MSTmain();

		ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST = convergeDaoSurovi.listIC_REPORT_LEVEL_MST();
		model.addAttribute("ic_report_level_mst", ic_report_level_mst);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST")
	public String ic_report_level_mst_save(IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {

		convergeDaoSurovi.insertICReportLevelMst(ic_report_level_mst);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

	@GetMapping("/IC_REPORT_LEVEL_MST/{id}")
	public String ic_report_level_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		String flag = "1";

		IC_REPORT_LEVEL_MSTmain ic_report_level_mst = convergeDaoSurovi.singleIC_REPORT_LEVEL_MST(id);

		ArrayList<IC_REPORT_LEVEL_MSTmain> listIC_REPORT_LEVEL_MST = convergeDaoSurovi.listIC_REPORT_LEVEL_MST();

		model.addAttribute("ic_report_level_mst", ic_report_level_mst);
		model.addAttribute("listIC_REPORT_LEVEL_MST", listIC_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST/{id}")
	public String ic_report_level_mst_edit(@PathVariable("id") String id, Model model,
			IC_REPORT_LEVEL_MSTmain ic_report_level_mst) {

		ic_report_level_mst.setREPORT_LV_ID(id);

		convergeDaoSurovi.editICReportLevelMst(ic_report_level_mst);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_REPORT_LEVEL_MST_delete/{id}")
	public String IC_REPORT_LEVEL_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICReportLevelMst(id);

		return "redirect:/IC_REPORT_LEVEL_MST";
	}

//	CLEAR IC_REPORT_LEVEL_MST START
	@PostMapping("/IC_REPORT_LEVEL_MST_clear/{id}")
	public String IC_REPORT_LEVEL_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_REPORT_LEVEL_MST";
	}
//	IC_GEN_REPORT_LEVEL_MST

	@GetMapping("/IC_GEN_REPORT_LEVEL_MST")
	public String ic_gen_report_level_mst(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);

		String flag = "0";

		IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst = new IC_GEN_REPORT_LEVEL_MSTmain();

		ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST = convergeDaoSurovi
				.listIC_GEN_REPORT_LEVEL_MST();
		model.addAttribute("ic_gen_report_level_mst", ic_gen_report_level_mst);
		model.addAttribute("listIC_GEN_REPORT_LEVEL_MST", listIC_GEN_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST")
	public String ic_gen_report_level_mst_save(IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {

		convergeDaoSurovi.insertICGenReportLevelMst(ic_gen_report_level_mst);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

	@GetMapping("/IC_GEN_REPORT_LEVEL_MST/{id}")
	public String ic_gen_report_level_mst_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		String flag = "1";

		IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst = convergeDaoSurovi.singleIC_GEN_REPORT_LEVEL_MST(id);

		ArrayList<IC_GEN_REPORT_LEVEL_MSTmain> listIC_GEN_REPORT_LEVEL_MST = convergeDaoSurovi
				.listIC_GEN_REPORT_LEVEL_MST();

		model.addAttribute("ic_gen_report_level_mst", ic_gen_report_level_mst);
		model.addAttribute("listIC_GEN_REPORT_LEVEL_MST", listIC_GEN_REPORT_LEVEL_MST);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);

		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST/{id}")
	public String ic_gen_report_level_mst_edit(@PathVariable("id") String id, Model model,
			IC_GEN_REPORT_LEVEL_MSTmain ic_gen_report_level_mst) {

		ic_gen_report_level_mst.setGEN_REPORT_LV_ID(id);

		convergeDaoSurovi.editICGenReportLevelMst(ic_gen_report_level_mst);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

	@PostMapping("/IC_GEN_REPORT_LEVEL_MST_delete/{id}")
	public String IC_GEN_REPORT_LEVEL_MST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICGenReportLevelMst(id);

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}

//	CLEAR IC_GEN_REPORT_LEVEL_MST START
	@PostMapping("/IC_GEN_REPORT_LEVEL_MST_clear/{id}")
	public String IC_GEN_REPORT_LEVEL_MST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_GEN_REPORT_LEVEL_MST";
	}
//9/14/2021-Khandker

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL")
	public String magisList(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<IC_MAGIS_COURTS_MODEL> magis = i.magisList();
		model.addAttribute("magis", magis);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		IC_MAGIS_INSERT iC_MAGIS_INSERT = new IC_MAGIS_INSERT();
		model.addAttribute("iC_MAGIS_INSERT", iC_MAGIS_INSERT);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "magis";
	}

	@PostMapping("/IC_MAGIS_COURTS_ACTV_DTL")
	public String magisListInsert(@CookieValue(value = "user_name", defaultValue = "") String user_name,Model model, IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		i.magisListInstrt(iC_MAGIS_INSERT);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL/{id}")
	public String magisEdit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") int id,
			Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		model.addAttribute("ids", id);

		ArrayList<IC_MAGIS_COURTS_MODEL> magis = i.magisList();
		model.addAttribute("magis", magis);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

		IC_MAGIS_INSERT iC_MAGIS_INSERT = new IC_MAGIS_INSERT();
		model.addAttribute("iC_MAGIS_INSERT", iC_MAGIS_INSERT);

		ArrayList<IC_MAGIS_COURTS_MODEL> editMagis = i.magisListEdit(id);
		model.addAttribute("editMagis", editMagis);

		String CYCLE_CODE = editMagis.get(0).getpBILL_CYCLE_CODE();
		model.addAttribute("CYCLE_CODE", CYCLE_CODE);

		int PREV_MONTH = editMagis.get(0).getpBAL_OF_PREV_MONTH();
		model.addAttribute("PREV_MONTH", PREV_MONTH);

		int PDB_OFF = editMagis.get(0).getpCASES_FILED_PDB_OFF();
		model.addAttribute("PDB_OFF", PDB_OFF);

		int MOB_COURT = editMagis.get(0).getpCASES_FILED_MOB_COURT();
		model.addAttribute("MOB_COURT", MOB_COURT);

		int PER_JAILED = editMagis.get(0).getpNO_OF_PER_JAILED();
		model.addAttribute("PER_JAILED", PER_JAILED);

		int PER_FINED = editMagis.get(0).getpNO_OF_PER_FINED();
		model.addAttribute("PER_FINED", PER_FINED);

		int FINE_OR_JAIL = editMagis.get(0).getpNO_OF_PER_FINE_OR_JAIL();
		model.addAttribute("FINE_OR_JAIL", FINE_OR_JAIL);

		int OTHERS = editMagis.get(0).getpOTHERS();
		model.addAttribute("OTHERS", OTHERS);

		int REDEMPTION = editMagis.get(0).getpNO_OF_PER_REDEMPTION();
		model.addAttribute("REDEMPTION", REDEMPTION);

		int JUDGMENT = editMagis.get(0).getpNO_OF_PER_JUDGMENT();
		model.addAttribute("JUDGMENT", JUDGMENT);

		int BAL_NOS = editMagis.get(0).getpBAL_NOS();
		model.addAttribute("BAL_NOS", BAL_NOS);

		int ILLEGAL_CON = editMagis.get(0).getpDC_ILLEGAL_CON();
		model.addAttribute("ILLEGAL_CON", ILLEGAL_CON);

		int COURT_CONDU = editMagis.get(0).getpNO_OF_MOB_COURT_CONDU();
		model.addAttribute("COURT_CONDU", COURT_CONDU);

		int REALISED_TK = editMagis.get(0).getpFINES_REALISED_TK();
		model.addAttribute("REALISED_TK", REALISED_TK);

		String MONTHS = editMagis.get(0).getpMONTHS();
		model.addAttribute("MONTHS", MONTHS);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "magisedit";
	}

	@PostMapping("/IC_MAGIS_COURTS_ACTV_DTL/{id}")
	public String magisUpdate(@PathVariable("id") int id, Model model, IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		i.magisListUpdate(iC_MAGIS_INSERT, id);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	@GetMapping("/IC_MAGIS_COURTS_ACTV_DTL_DELETE/{id}")
	public String magiDelete(@PathVariable("id") int id, Model model) {
		i.magisListDelte(id);

		return "redirect:/IC_MAGIS_COURTS_ACTV_DTL";
	}

	// IC_LDC_MONTH_MAX_DATA starts
	@GetMapping("/IC_LDC_MONTH_MAX_DATA")
	public String perionListMax(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ArrayList<PeriodList> periodList = i.periodListShow();
		model.addAttribute("periodList", periodList);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "periodlistMax";
	}

	@GetMapping("/IC_LDC_MONTH_MAX_DATA/{month}")
	public String ic_ldc_month_max_data(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("month") String month, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data = new IC_LDC_MONTH_MAX_DATA();

		ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA = convergeDaoSurovi.listIC_LDC_MONTH_MAX_DATA();
		model.addAttribute("ic_ldc_month_max_data", ic_ldc_month_max_data);
		ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE = convergeDaoSurovi.listIC_LDC_TYPE();
		model.addAttribute("listIC_LDC_TYPE", listIC_LDC_TYPE);

//		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
//		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("month", month);

		model.addAttribute("listIC_LDC_MONTH_MAX_DATA", listIC_LDC_MONTH_MAX_DATA);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LDC_MONTH_MAX_DATA";
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA/{month}")
	public String ic_gen_report_level_mst_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("month") int month,
			IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {

		convergeDaoSurovi.insertICLdcMonthMaxData(ic_ldc_month_max_data,user_name);

		return "redirect:/IC_LDC_MONTH_MAX_DATA/" + month;
	}

	@GetMapping("/IC_LDC_MONTH_MAX_DATA/{month}/{id}")
	public String ic_ldc_month_max_data_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("month") int month, @PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		String flag = "1";

		IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data = convergeDaoSurovi.singleIC_LDC_MONTH_MAX_DATA(id);

		ArrayList<IC_LDC_MONTH_MAX_DATA> listIC_LDC_MONTH_MAX_DATA = convergeDaoSurovi.listIC_LDC_MONTH_MAX_DATA();

		model.addAttribute("ic_ldc_month_max_data", ic_ldc_month_max_data);
		model.addAttribute("listIC_LDC_MONTH_MAX_DATA", listIC_LDC_MONTH_MAX_DATA);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		ArrayList<IC_LDC_TYPE> listIC_LDC_TYPE = convergeDaoSurovi.listIC_LDC_TYPE();
		model.addAttribute("listIC_LDC_TYPE", listIC_LDC_TYPE);

//		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = iconvDaoRafi.listIC_PERIOD_MST();
//		model.addAttribute("listIC_PERIOD_MST", listIC_PERIOD_MST);
		model.addAttribute("month", month);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_LDC_MONTH_MAX_DATA";
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA/{month}/{id}")
	public String ic_ldc_month_max_data_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("month") int month, @PathVariable("id") int id, Model model,
			IC_LDC_MONTH_MAX_DATA ic_ldc_month_max_data) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		ic_ldc_month_max_data.setLDC_ID(id);

		convergeDaoSurovi.editICGenReportLevelMst(ic_ldc_month_max_data,user_name);

		return "redirect:/IC_LDC_MONTH_MAX_DATA/" + month;
	}

	@PostMapping("/IC_LDC_MONTH_MAX_DATA_delete/{month}/{id}")
	public String IC_LDC_MONTH_MAX_DATA_delete(@PathVariable("month") int month, @PathVariable("id") int id) {

		convergeDaoSurovi.deleteICLdcMonthMaxData(id);

		return "redirect:/IC_LDC_MONTH_MAX_DATA/" + month;
	}

//		CLEAR IC_LDC_MONTH_MAX_DATA START
	@PostMapping("/IC_LDC_MONTH_MAX_DATA_clear/{month}/{id}")
	public String IC_LDC_MONTH_MAX_DATA_clear(@PathVariable("month") int month, @PathVariable("id") int id) {

		return "redirect:/IC_LDC_MONTH_MAX_DATA/" + month;
	}

	// IC_RC_DC_ST
	@GetMapping("/IC_RC_DC_ST")
	public String IC_RC_DC_ST(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model)
	{
		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		String flag = "0";
		model.addAttribute("flag", flag);
		
		IC_DC_RC iC_DC_RC = new IC_DC_RC();
		model.addAttribute("iC_DC_RC", iC_DC_RC);
		
		List<IC_DC_RC> listIC_DC_RC = rowSqlDao.listIC_DC_RC();
		model.addAttribute("listIC_DC_RCE", listIC_DC_RC);
		
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		
		return "IC_RC_DC_ST";
	}
	
	@GetMapping("/IC_RC_DC_ST/{id}")
	public String IC_RC_DC_ST_S(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, @PathVariable("id") int id, Model model)
	{
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";
		model.addAttribute("flag", flag);
		
		IC_DC_RC iC_DC_RC = rowSqlDao.listIC_DC_RC_S(id);
		model.addAttribute("iC_DC_RC", iC_DC_RC);
		model.addAttribute("id", id);
		
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
		
		List<IC_DC_RC> listIC_DC_RC = rowSqlDao.listIC_DC_RC();
		model.addAttribute("listIC_DC_RCE", listIC_DC_RC);
		
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		
		return "IC_RC_DC_ST";
	}

	@PostMapping("/IC_RC_DC_ST")
	public String IC_RC_DC_ST_save(IC_DC_RC iC_DC_RC)
	{
		rowSqlDao.insert_IC_DC_RC(iC_DC_RC);
		return "redirect:/IC_RC_DC_ST";
	}

	@PostMapping("/IC_RC_DC_ST/{id}")
	public String IC_RC_DC_ST_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name, @PathVariable("id") String id, Model model,
			IC_DC_RC iC_DC_RC)
	{
		
		if (user_name.equals("")) {
			return "redirect:/";
		}
		
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		
		iC_DC_RC.setRC_DC_ID(id);
		
		rowSqlDao.IC_DC_RC_edit(iC_DC_RC);
		return "redirect:/IC_RC_DC_ST";
	}

	@PostMapping("/IC_RC_DC_ST_delete/{id}")
	public String IC_RC_DC_ST_delete(@PathVariable("id") int id)
	{
		rowSqlDao.IC_DC_RC_delete(id);
		return "redirect:/IC_RC_DC_ST";
	}

	@PostMapping("/IC_RC_DC_ST_clear/{id}")
	public String IC_RC_DC_ST_clear(@PathVariable("id") int id)
	{

		return "redirect:/IC_RC_DC_ST";
	}
	
	
	@GetMapping("/IC_GROUP_INFO")
	public String ic_group_info(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_GROUP_INFO ic_group_info = new IC_GROUP_INFO();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("ic_group_info", ic_group_info);
		model.addAttribute("listIC_GROUP_INFO", listIC_GROUP_INFO);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO")
	public String ic_group_info_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_GROUP_INFO ic_group_info) {

		convergeDaoSurovi.insertICGroupInfo(ic_group_info,user_name);

		System.out.println("gd");
		System.out.println(ic_group_info);

		return "redirect:/IC_GROUP_INFO";
	}

	@GetMapping("/IC_GROUP_INFO/{id}")
	public String ic_group_info_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_GROUP_INFO ic_group_info = convergeDaoSurovi.singleIC_GROUP_INFO(id);

		ArrayList<IC_GROUP_INFO> listIC_GROUP_INFO = convergeDaoSurovi.listIC_GROUP_INFO();

		ArrayList<IC_USER_TYPE_MST> listIC_USER_TYPE_MST = convergeDaoSurovi.listIC_USER_TYPE_MST();
		model.addAttribute("listIC_USER_TYPE_MST", listIC_USER_TYPE_MST);

		model.addAttribute("ic_group_info", ic_group_info);
		model.addAttribute("listIC_GROUP_INFO", listIC_GROUP_INFO);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO/{id}")
	public String ic_group_info_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_GROUP_INFO ic_group_info) {

		ic_group_info.setGRP_ID(id);

		convergeDaoSurovi.editICGroupInfo(ic_group_info,user_name);

		return "redirect:/IC_GROUP_INFO";
	}

	@PostMapping("/IC_GROUP_INFO_delete/{id}")
	public String IC_GROUP_INFO_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICGroupInfo(id);

		return "redirect:/IC_GROUP_INFO";
	}

//	CLEAR IC_GROUPINFO START
	@PostMapping("/IC_GROUP_INFO_clear/{id}")
	public String IC_GROUP_INFO_clear(@PathVariable("id") int id) {

		return "redirect:/IC_GROUP_INFO";
	}

	// IC_GROUP_ACCESS START

	@GetMapping("/IC_GROUP_ACCESS/{grpCode}")
	public String ic_group_access(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("grpCode") String gCode, Model m) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
//		System.out.println(i);
		String flag = "0";

		IC_GROUP_ACCESS ic_group_access = new IC_GROUP_ACCESS();

		ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS = convergeDaoSurovi.listIC_GROUP_ACCESS(gCode);

		m.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		m.addAttribute("dataHtml", dynamicMenu);

//		
		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		m.addAttribute("groupDorpdownList", groupDorpdownList);
//		
//		System.out.println(groupDorpdownList);
//		
		ArrayList<ModuleDropdownList> moduleDropdownList = convergeDaoSurovi.moduleDropdownList();
		m.addAttribute("moduleDropdownList", moduleDropdownList);

		m.addAttribute("gCode", gCode);
		m.addAttribute("ic_group_access", ic_group_access);
		m.addAttribute("listIC_GROUP_ACCESS", listIC_GROUP_ACCESS);

		return "IC_GROUP_ACCESS.html";

	}

	@PostMapping("/IC_GROUP_ACCESS/{grpCode}")
	public String ic_group_access_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("grpCode") String gCode, IC_GROUP_ACCESS ic_group_access) {

		ic_group_access.setGRP_CODE(gCode);

		convergeDaoSurovi.insertICGroupAccess(ic_group_access,user_name);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;

	}

	@GetMapping("/IC_GROUP_ACCESS/{grpCode}/{gAccId}")
	public String ic_group_access_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_GROUP_ACCESS ic_group_access = convergeDaoSurovi.singleIC_GROUP_ACCESS(gAId);

		System.out.println("test");
		System.out.println(ic_group_access);

		ArrayList<IC_GROUP_ACCESS> listIC_GROUP_ACCESS = convergeDaoSurovi.listIC_GROUP_ACCESS(gCode);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

//		
		ArrayList<IC_GROUP_INFO> groupDorpdownList = convergeDaoSurovi.listIC_GROUP_INFO();
		model.addAttribute("groupDorpdownList", groupDorpdownList);
//		
//		System.out.println(groupDorpdownList);
//		
		ArrayList<ModuleDropdownList> moduleDropdownList = convergeDaoSurovi.moduleDropdownList();
		model.addAttribute("moduleDropdownList", moduleDropdownList);

		model.addAttribute("gCode", gCode);
		model.addAttribute("ic_group_access", ic_group_access);
		model.addAttribute("listIC_GROUP_ACCESS", listIC_GROUP_ACCESS);
		model.addAttribute("gAId", gAId);

		return "IC_GROUP_ACCESS";
	}

	@PostMapping("/IC_GROUP_ACCESS/{grpCode}/{gAccId}")
	public String ic_group_access_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId,
			Model model, IC_GROUP_ACCESS ic_group_access) {

		ic_group_access.setGRP_CODE(gCode);
		ic_group_access.setGRP_ACS_ID(gAId);

		convergeDaoSurovi.editICGroupAccess(ic_group_access,user_name);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;
	}

	@PostMapping("/IC_GROUP_ACCESS_delete/{grpCode}/{gAccId}")
	public String ic_group_access_delete(@PathVariable("grpCode") String gCode, @PathVariable("gAccId") int gAId) {

		convergeDaoSurovi.deleteICGroupAccess(gAId);

		return "redirect:/IC_GROUP_ACCESS/" + gCode;
	}

	// CLEAR IC_CIRCLE_MST START
	@PostMapping("/IC_GROUP_ACCESS_clear/{gAccId}")

	public String IC_GROUP_ACCESS_clear(@PathVariable("gAccId") int gAId) {

		return "redirect:/IC_GROUP_ACCESS";
	}

//	IC_LOC_MOD_DF table list start 
	@GetMapping("/IC_LOC_MOD_DF/{b}/{l}/{id}")
	public String ic_loc_mod_df(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@CookieValue(value = "user_name", defaultValue = "") String user_name, @PathVariable("b") String bill_cycle,
			@PathVariable("l") String l, @PathVariable("id") String id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		// table show sys_loss current month starts

		Map<String, Object> result40 = getAllStatesJdbcCall1000.withCatalogName("pkg_dist_mod_view")
				.withProcedureName("dpd_mod_view")
				.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
				.execute(officeCode, bill_cycle, l);
		JSONObject json40 = new JSONObject(result40);
		String fjfhdj40 = json40.get("CUR_DATA").toString();
		JSONArray jsonArray40 = new JSONArray(fjfhdj40);
		ArrayList<DpdModView> tableList = new ArrayList<DpdModView>();
		for (int k = 0; k < jsonArray40.length(); k++) {
			JSONObject jsonData40 = jsonArray40.getJSONObject(k);

			tableList.add(new DpdModView(jsonData40.optString("SL_NO"), jsonData40.optString("ITEM_NAME"),
					jsonData40.optString("CURR_MONTH"), jsonData40.optString("UPTO_MONTH"), "", ""));
		}

		model.addAttribute("tableList", tableList);

		model.addAttribute("BILL_CYCLE_CODE", bill_cycle);
		model.addAttribute("LOCATION_CODE", l);
		model.addAttribute("LOC_MOD_ID", id);
		model.addAttribute("PP_USER", user_name);
		model.addAttribute("PP_OFFICE", officeCode);

		String LOCATION_NAME = rowSqlDao.sLOCATION_NAME(l);
		model.addAttribute("LOCATION_NAME", LOCATION_NAME);
		List<NextUserAndOffice> listbackWORD = rowSqlDao.listbackWORD(user_name, l);
		model.addAttribute("listbackWORD", listbackWORD);
				
//		if (listbackWORD.isEmpty()) {
//			model.addAttribute("flag", "0");
//		} else if (!user_name.equals(listbackWORD.get(0).NEXT_USER)) {
//			model.addAttribute("flag", "1");
//		} else {
//			model.addAttribute("flag", "0");
//		}
//		
		String outp= rowSqlDao.flagNums(user_name);
		if(outp.equals("1")) {
			model.addAttribute("flagNum", "T");
		}else {
			model.addAttribute("flagNum", "F");
		}
		String outpb= rowSqlDao.flagNum(user_name);
		if(outpb.equals("1")) {
			model.addAttribute("flagNumb", "T");
//			Map<String, Object> resultback=functionJdbcCall3
//		            .withFunctionName("DFN_RAO_COLL_VALIDATION_NEW")
//		            .declareParameters(
//		            		new SqlOutParameter("results", OracleTypes.INTEGER))
//		            .execute(bill_cycle,l,"BPDB","BPDB");
//			JSONObject json = new JSONObject(resultback);
			model.addAttribute("datamm","0");
		}else {
			model.addAttribute("flagNumb", "F");
			model.addAttribute("datamm","0");
		}
//		String puser= rowSqlDao.flagpuser(user_name);
//		if(puser.equals("1")) {
//			model.addAttribute("puser", "T");
//		}else {
//			model.addAttribute("puser", "F");
//		}
		Map<String, Object> resultback=functionJdbcCall1
	            .withFunctionName("dfn_apvl_back")
	            .declareParameters(
	            		new SqlOutParameter("results", OracleTypes.INTEGER))
	            .execute(user_name,l,bill_cycle);
		JSONObject json = new JSONObject(resultback);
		model.addAttribute("flagbw",json.get("results").toString());
		Map<String, Object> resultfword=functionJdbcCall2
	            .withFunctionName("dfn_apvl_forward")
	            .declareParameters(
	            		new SqlOutParameter("results", OracleTypes.INTEGER))
	            .execute(user_name,l,bill_cycle);
		JSONObject json1 = new JSONObject(resultfword);
		model.addAttribute("flagfw",json1.get("results").toString());
		List<DoubleDataModel> single= rowSqlDao.remarks(user_name,l);
		if(!single.isEmpty()) {
			model.addAttribute("remarks", single.get(0).getREMARKS());
			model.addAttribute("fromuser", single.get(0).getPR_USER());
		}		

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		IC_LOC_MOD_DF_R ic_LOC_MOD_DF_R = new IC_LOC_MOD_DF_R();
		ic_LOC_MOD_DF_R.setBILL_CYCLE_CODE(bill_cycle);
		ic_LOC_MOD_DF_R.setLOCATION_CODE(l);
		ic_LOC_MOD_DF_R.setLOC_MOD_ID(id);
		ic_LOC_MOD_DF_R.setPR_USER(user_name);
		ic_LOC_MOD_DF_R.setPR_OFFICE_CODE(officeCode);
		ic_LOC_MOD_DF_R.setREMARKS("");
		model.addAttribute("ic_LOC_MOD_DF_R", ic_LOC_MOD_DF_R);

		IC_LOC_MOD_DFF ic_LOC_MOD_DFF = new IC_LOC_MOD_DFF();
		ic_LOC_MOD_DFF.setBILL_CYCLE_CODE(bill_cycle);
		ic_LOC_MOD_DFF.setLOCATION_CODE(l);
		ic_LOC_MOD_DFF.setLOC_MOD_ID(id);
		ic_LOC_MOD_DFF.setPR_USER(user_name);
		ic_LOC_MOD_DFF.setPR_OFFICE_CODE(officeCode);
		model.addAttribute("ic_LOC_MOD_DFF", ic_LOC_MOD_DFF);

		List<NextUserAndOffice> listFORWORD = rowSqlDao.listFORWORD(user_name, officeCode,l,bill_cycle);
		model.addAttribute("listFORWORD", listFORWORD);

		return "IC_LOC_MOD_DF_R.html";

	}

//	IC_LOC_MOD_DF table list end 
	@GetMapping("/IC_LOC_MOD_DF")
	public String IC_LOC_MOD_DF(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF = rowSqlDao.listIC_LOC_MOD_DF(user_name);
		model.addAttribute("listIC_LOC_MOD_DF", listIC_LOC_MOD_DF);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOC_MOD_DF";
	}

	@PostMapping("/IC_LOC_MOD_DF")
	public String ic_loc_mod_df_back(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			IC_LOC_MOD_DF_R ic_LOC_MOD_DF_R, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String output = iconvDaoRafi.bacckwordModDf(ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE(),
				ic_LOC_MOD_DF_R.getLOCATION_CODE(), ic_LOC_MOD_DF_R.getLOC_MOD_ID(), ic_LOC_MOD_DF_R.getPR_USER(),
				ic_LOC_MOD_DF_R.getPR_OFFICE_CODE(), ic_LOC_MOD_DF_R.getREMARKS(), ic_LOC_MOD_DF_R.getNEXT_USER());

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "redirect:/IC_LOC_MOD_DF";
		// return "IC_LOC_MOD_DF";
	}

	@PostMapping("/IC_LOC_MOD_DFF")
	public String ic_loc_mod_df_fw(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			IC_LOC_MOD_DFF ic_LOC_MOD_DF_R, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		Map<String, Object> resultback=functionJdbcCall3
	            .withFunctionName("DFN_RAO_COLL_VALIDATION_NEW")
	            .declareParameters(
	            		new SqlOutParameter("results", OracleTypes.INTEGER))
	            .execute(ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE(),ic_LOC_MOD_DF_R.getLOCATION_CODE(),user_name,ic_LOC_MOD_DF_R.getNEXT_USER());
		JSONObject json = new JSONObject(resultback);
		
		if(json.get("results").toString().equals("0")) {
			String output = iconvDaoRafi.bacckwordModDff(ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE(),
					ic_LOC_MOD_DF_R.getLOCATION_CODE(), ic_LOC_MOD_DF_R.getLOC_MOD_ID(), ic_LOC_MOD_DF_R.getPR_USER(),
					ic_LOC_MOD_DF_R.getPR_OFFICE_CODE(), ic_LOC_MOD_DF_R.getNEXT_USER());
			//return "redirect:/IC_LOC_MOD_DF/"+ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE()+"/"+ic_LOC_MOD_DF_R.getLOCATION_CODE()+"/"+ic_LOC_MOD_DF_R.getLOC_MOD_ID();
		}else {
			model.addAttribute("datamm",json.get("results").toString());
			return "redirect:/IC_LOC_MOD_DF/"+ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE()+"/"+ic_LOC_MOD_DF_R.getLOCATION_CODE()+"/"+ic_LOC_MOD_DF_R.getLOC_MOD_ID();
		}		
		return "redirect:/IC_LOC_MOD_DF/"+ic_LOC_MOD_DF_R.getBILL_CYCLE_CODE()+"/"+ic_LOC_MOD_DF_R.getLOCATION_CODE()+"/"+ic_LOC_MOD_DF_R.getLOC_MOD_ID();

	}
	// IC_MODULES_LIST START

	@GetMapping("/IC_MODULES_LIST")
	public String ic_module_list(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_MODULES_LIST ic_module_list = new IC_MODULES_LIST();

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		/*
		 * ArrayList<IC_MODULE_LIST> listIC_MODULE_LIST =
		 * convergeDaoSurovi.listIC_MODULE_LIST();
		 */
		model.addAttribute("ic_module_list", ic_module_list);
		/* model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST); */
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST")
	public String ic_module_list_save(IC_MODULES_LIST ic_module_list) {

		convergeDaoSurovi.insertICModulesList(ic_module_list);

		System.out.println(ic_module_list);

		return "redirect:/IC_MODULES_LIST";
	}

	@GetMapping("/IC_MODULES_LIST/{id}")
	public String ic_module_list_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_MODULES_LIST ic_module_list = convergeDaoSurovi.singleIC_MODULES_LIST(id);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		model.addAttribute("ic_module_list", ic_module_list);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST/{id}")
	public String ic_module_list_edit(@PathVariable("id") int id, Model model, IC_MODULES_LIST ic_module_list) {

		ic_module_list.setMOD_ID(id);

		convergeDaoSurovi.editICModulesList(ic_module_list);

		return "redirect:/IC_MODULES_LIST";
	}

	@PostMapping("/IC_MODULES_LIST_delete/{id}")
	public String IC_MODULES_LIST_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICModulesList(id);

		return "redirect:/IC_MODULES_LIST";
	}

//	CLEAR IC_MODULES_LIST START
	@PostMapping("/IC_MODULES_LIST_clear/{id}")
	public String IC_MODULES_LIST_clear(@PathVariable("id") int id) {

		return "redirect:/IC_MODULES_LIST";
	}

// IC_MODULE_ACCESS START

	@GetMapping("/IC_MODULE_ACCESS/{modC}")
	public String ic_module_access(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("modC") String mCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_MODULE_ACCESS ic_module_access = new IC_MODULE_ACCESS();

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS = convergeDaoSurovi.listIC_MODULE_ACCESS(mCode);
		model.addAttribute("ic_module_access", ic_module_access);
		model.addAttribute("listIC_MODULE_ACCESS", listIC_MODULE_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("mCode", mCode);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULE_ACCESS";
	}

	@PostMapping("/IC_MODULE_ACCESS/{modC}")
	public String ic_module_access_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("modC") String mCode, IC_MODULE_ACCESS ic_module_access) {

		convergeDaoSurovi.insertICModuleAccess(ic_module_access,user_name);

		System.out.println(ic_module_access);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@GetMapping("/IC_MODULE_ACCESS/{modC}/{mAid}")
	public String ic_module_access_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("modC") String mCode, @PathVariable("mAid") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_MODULE_ACCESS ic_module_access = convergeDaoSurovi.singleIC_MODULE_ACCESS(id);

		ArrayList<IC_MODULE_ACCESS> listIC_MODULE_ACCESS = convergeDaoSurovi.listIC_MODULE_ACCESS(mCode);

		ArrayList<ActivityDrop> activityDropDown = convergeDaoSurovi.activityDropDown();
		model.addAttribute("activityDropDown", activityDropDown);

		ArrayList<IC_MODULES_LIST> listIC_MODULES_LIST = convergeDaoSurovi.listIC_MODULES_LIST();
		model.addAttribute("listIC_MODULES_LIST", listIC_MODULES_LIST);

		model.addAttribute("ic_module_access", ic_module_access);
		model.addAttribute("listIC_MODULE_ACCESS", listIC_MODULE_ACCESS);
		model.addAttribute("flag", flag);
		model.addAttribute("mCode", mCode);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_MODULE_ACCESS";
	}

	@PostMapping("/IC_MODULE_ACCESS/{modC}/{mAid}")
	public String ic_module_access_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("modC") String mCode, @PathVariable("mAid") int id, Model model,
			IC_MODULE_ACCESS ic_module_access) {

		ic_module_access.setMOD_ACS_ID(id);

		convergeDaoSurovi.editICModuleAccess(ic_module_access,user_name);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@PostMapping("/IC_MODULE_ACCESS_delete/{modC}/{mAid}")
	public String IC_MODULE_ACCESS_delete(@PathVariable("modC") String mCode, @PathVariable("mAid") int id) {

		convergeDaoSurovi.deleteICModulesAccess(id);

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

//CLEAR IC_MODULE_ACCESS START
	@PostMapping("/IC_MODULE_ACCESS_clear/{modC}")
	public String IC_MODULE_ACCESS_clear(@PathVariable("modC") int mCode) {

		return "redirect:/IC_MODULE_ACCESS/" + mCode;
	}

	@GetMapping("/IC_TRANS_GRID")
	public String ic_trans_grid(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "0";

		IC_TRANS_GRIDmain ic_trans_grid = new IC_TRANS_GRIDmain();

		ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID = convergeDaoSurovi.listIC_TRANS_GRID();
		model.addAttribute("ic_trans_grid", ic_trans_grid);

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);

		model.addAttribute("listIC_TRANS_GRID", listIC_TRANS_GRID);
		model.addAttribute("flag", flag);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID")
	public String ic_trans_grid_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_TRANS_GRIDmain ic_trans_grid) {

		convergeDaoSurovi.insertICTransGrid(ic_trans_grid,user_name);

		return "redirect:/IC_TRANS_GRID";
	}

	@GetMapping("/IC_TRANS_GRID/{id}")
	public String ic_trans_grid_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@PathVariable("id") int id, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		String flag = "1";

		IC_TRANS_GRIDmain ic_trans_grid = convergeDaoSurovi.singleIC_TRANS_GRID(id);

		ArrayList<IC_TRANS_GRIDmain> listIC_TRANS_GRID = convergeDaoSurovi.listIC_TRANS_GRID();

		ArrayList<IC_USAGE_AREA> listIC_USAGE_AREA = convergeDaoSurovi.listIC_USAGE_AREA();
		model.addAttribute("listIC_USAGE_AREA", listIC_USAGE_AREA);

		model.addAttribute("ic_trans_grid", ic_trans_grid);
		model.addAttribute("listIC_TRANS_GRID", listIC_TRANS_GRID);
		model.addAttribute("flag", flag);
		model.addAttribute("id", id);
		String  dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);

		return "IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID/{id}")
	public String ic_zone_mst_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_TRANS_GRIDmain ic_trans_grid) {

		ic_trans_grid.setGRID_ID(id);

		convergeDaoSurovi.editICTransGrid(ic_trans_grid,user_name);

		return "redirect:/IC_TRANS_GRID";
	}

	@PostMapping("/IC_TRANS_GRID_delete/{id}")
	public String IC_TRANS_GRID_delete(@PathVariable("id") int id) {

		convergeDaoSurovi.deleteICTransGrid(id);

		return "redirect:/IC_TRANS_GRID";
	}

//	CLEAR IC_TRANS_GRID START
	@PostMapping("/IC_TRANS_GRID_clear/{id}")
	public String IC_TRANS_GRID_clear(@PathVariable("id") int id) {

		return "redirect:/IC_TRANS_GRID";
	}

	@GetMapping("/MIS_Div_cat_wise_Sale")
	public String MIS_Div_cat_wise_Sale(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_Sale";
	}

	@PostMapping("/MIS_Div_cat_wise_Sale")
	public String MIS_Div_cat_wise_Sale(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		ArrayList<MIS_Div_cat_wise_Sale> listMIS_Div_cat_wise_Sale = icDao.listMIS_Div_cat_wise_Sale(officeCode, rm.one,
				rm.two);
		model.addAttribute("listMIS_Div_cat_wise_Sale", listMIS_Div_cat_wise_Sale);

		String month = listMIS_Div_cat_wise_Sale.get(0).getCURR_MONTH();
		model.addAttribute("mon", month);

		String loc1 = listMIS_Div_cat_wise_Sale.get(0).getLOCATION_NAME();
		model.addAttribute("loc", loc1);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_Sale";
	}
	
	@GetMapping("/MIS_Div_cat_wise_COLL")
	public String MIS_Div_cat_wise_COLL(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_COLL";
	}

	@PostMapping("/MIS_Div_cat_wise_COLL")
	public String MIS_Div_cat_wise_COLL(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		ArrayList<MIS_Div_cat_wise_COLL> listMIS_Div_cat_wise_COLL = icDao.listMIS_Div_cat_wise_COLL(officeCode, rm.one,
				rm.two);
		model.addAttribute("listMIS_Div_cat_wise_COLL", listMIS_Div_cat_wise_COLL);

		String month = listMIS_Div_cat_wise_COLL.get(0).getCURR_MONTH();
		model.addAttribute("mon", month);

		String loc1 = listMIS_Div_cat_wise_COLL.get(0).getLOCATION_NAME();
		model.addAttribute("loc", loc1);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_COLL";
	}
	
	
	@GetMapping("/MIS_Div_cat_wise_BILLED")
	public String MIS_Div_cat_wise_BILLED(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_BILLED";
	}

	@PostMapping("/MIS_Div_cat_wise_BILLED")
	public String MIS_Div_cat_wise_BILLED(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, ReportModel rm, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		ReportModel reportModel = new ReportModel();
		
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);

//		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
//		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

		ArrayList<MIS_Div_cat_wise_BILLED> listMIS_Div_cat_wise_BILLED = icDao.listMIS_Div_cat_wise_BILLED(officeCode, rm.one,
				rm.two);
		model.addAttribute("listMIS_Div_cat_wise_BILLED", listMIS_Div_cat_wise_BILLED);

		String month = listMIS_Div_cat_wise_BILLED.get(0).getCURR_MONTH();
		model.addAttribute("mon", month);

		String loc1 = listMIS_Div_cat_wise_BILLED.get(0).getLOCATION_NAME();
		model.addAttribute("loc", loc1);

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("reportModel", reportModel);
		return "MIS_Div_cat_wise_BILLED";
	}
	
	
	
	
	/* MIS_LOC_CAT_WISE_SUMMARY*/
	
	@GetMapping("/MIS_LOC_CAT_WISE_SUMMARY")
	public String MIS_LOC_CAT_WISE_SUMMARY(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		MIS_FORM mIS_FORM = new MIS_FORM();
		
		
		
//		Month_Dropdown drop-down start 
		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
//		Month_Dropdown drop-down end 		
		
//      IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 


//		circle drop-down start 
		/*ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDaoRafi.getCircleList(officeCode, reportModel.getThree() ); //, dashboard_data.getZone()
		model.addAttribute("circleList", circleList);*/
//		circle drop-down end 


//		loc drop-down start	
		/*ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDaoRafi.getlocList1(officeCode, reportModel.getFour()); //, dashboard_data.getCircle()
		model.addAttribute("locList", locList);*/
//		loc drop-down end
		
		
		/*
		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);*/

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		model.addAttribute("mIS_FORM", mIS_FORM);
		return "MIS_LOC_CAT_WISE_SUMMARY";
	}

	@PostMapping("/MIS_LOC_CAT_WISE_SUMMARY")
	public String MIS_LOC_CAT_WISE_SUMMARY(@CookieValue(value = "user_name", defaultValue = "") String user_name,
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode, MIS_FORM mIS_FORM, Model model) {
		if (user_name.equals("")) {
			return "redirect:/";
		}
		//ReportModel reportModel = new ReportModel();

		ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
		model.addAttribute("billList", billList);
//      IC_ZONE_MST drop-down start 
		ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
		model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//		IC_ZONE_MST drop-down end 


		/*ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
		model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);*/
		
		String a = mIS_FORM.getMonth();
		String b = mIS_FORM.getZone();
		String c = mIS_FORM.getCircle();
		String d = mIS_FORM.getLoc();

		ArrayList<MIS_LOC_CAT_WISE_SUMMARY> listMIS_LOC_CAT_WISE_SUMMARY = icDao.listMIS_LOC_CAT_WISE_SUMMARY(officeCode, a,
				b, c, d);
		model.addAttribute("listMIS_LOC_CAT_WISE_SUMMARY", listMIS_LOC_CAT_WISE_SUMMARY);
		String e = listMIS_LOC_CAT_WISE_SUMMARY.get(0).getLOCATION_NAME();
		//String month = mIS_FORM.getMonth();
		model.addAttribute("mon", a);
		model.addAttribute("loc", e);
/*
		String loc1 = listMIS_LOC_CAT_WISE_SUMMARY.get(0).getLOCATION_NAME();
		model.addAttribute("loc", loc1);*/

		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		//model.addAttribute("reportModel", reportModel);
		return "MIS_LOC_CAT_WISE_SUMMARY";
	}
	/* first route */
	@GetMapping("/IC_LOC_IMPORT_DROPDOWN")
	public String IC_LOC_IMPORT_DROPDOWN(@CookieValue(value = "user_name", defaultValue = "") String user_name,Model model) {
		
		/* first e land korbe then ager value dhore rakhar jonno */
		Dropdown_model dropdown_model = new Dropdown_model();
		model.addAttribute("dropdown_model", dropdown_model); 
		
		/* select bill cycle code */
		List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown = rowSqlDao.listIC_PERIOD_MST_Dropdown();
		model.addAttribute("listIC_PERIOD_MST_Dropdown", listIC_PERIOD_MST_Dropdown);
		
		/* select zone code */
		List<IC_ZONE_MST_Dropdown> listIC_ZONE_MST_Dropdown = rowSqlDao.listIC_ZONE_MST_Dropdown();
		model.addAttribute("listIC_ZONE_MST_Dropdown", listIC_ZONE_MST_Dropdown);
		String dynamicMenu= icDao.getDynamicMenu(user_name);
		model.addAttribute("dataHtml", dynamicMenu);
		return "IC_LOC_IMPORT_DROPDOWN";
	}
	
	
	String circleCode1="";
	
	/* after submit Next button hit this http route */
	@PostMapping("/IC_LOC_IMPORT_DROPDOWN")
	public String IC_LOC_IMPORT_1(@CookieValue(value = "user_name", defaultValue = "") String user_name,Dropdown_model dropdown_model, Model model) 
	{ 
		  
		 
		 /* select location code */
		 List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATON_MASTER_Dropdown = rowSqlDao.listIC_LOCATION_MASTER_Dropdown(dropdown_model.getCIRCLE_CODE());
		 
		 model.addAttribute("listIC_LOCATON_MASTER_Dropdown", listIC_LOCATON_MASTER_Dropdown); 
		 
		 circleCode1=dropdown_model.getCIRCLE_CODE();
		 
		 /* object er jonno */
		 com.example.demo.model.IC_LOC_IMPORT iC_LOC_IMPORT = new com.example.demo.model.IC_LOC_IMPORT();
		 model.addAttribute("iC_LOC_IMPORT", iC_LOC_IMPORT);
		
		 /* table show */
		 List<com.example.demo.model.IC_LOC_IMPORT> listIC_LOC_IMPORT = rowSqlDao.listIC_LOC_IMPORT(dropdown_model.getPERIOD_CODE(),dropdown_model.getCIRCLE_CODE());
		 model.addAttribute("listIC_LOC_IMPORTE", listIC_LOC_IMPORT);
	
		 String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
		  return "IC_LOC_IMPORT";
	}

	
	  @GetMapping("/IC_LOC_IMPORT/{PERIOD_CODE}")
	  public String IC_LOC_IMPORT(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable String PERIOD_CODE, Model model,Dropdown_model dropdown_model)
	  { 
		  com.example.demo.model.IC_LOC_IMPORT iC_LOC_IMPORT= new com.example.demo.model.IC_LOC_IMPORT();
		  List<com.example.demo.model.IC_LOC_IMPORT> listIC_LOC_IMPORT = rowSqlDao.listIC_LOC_IMPORT(PERIOD_CODE,circleCode1 );
		  model.addAttribute("iC_LOC_IMPORT", iC_LOC_IMPORT);
		  model.addAttribute("listIC_LOC_IMPORTE", listIC_LOC_IMPORT);
		  List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER_Dropdown = rowSqlDao.listIC_LOCATION_MASTER_Dropdown(dropdown_model.getCIRCLE_CODE());
		  model.addAttribute("listIC_LOCATON_MASTER_Dropdown", listIC_LOCATION_MASTER_Dropdown); 
		  String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
		  return "IC_LOC_IMPORT";
	  }
	 
	 
	 
	  /* ble e click korar por */
	  @GetMapping("/IC_LOC_IMPORT/{Code}/{id}")
	  public String IC_LOC_IMPORT_S(@CookieValue(value = "user_name", defaultValue = "") String user_name, @PathVariable("Code") String Code, @PathVariable("id") int id, Model model)
	  { 
			
		  /* To find location code */
		  com.example.demo.model.IC_LOC_IMPORT iC_LOC_IMPORT = rowSqlDao.listIC_LOC_IMPORT_S(id);
		  //model.addAttribute("LOC_CODE", iC_LOC_IMPORT.LOCATION_CODE);
		  
		  List<com.example.demo.model.IC_LOC_IMPORT> listIC_LOC_IMPORT = rowSqlDao.listIC_LOC_IMPORT(Code, circleCode1);
		  
		  /* input field e value rakha */
		  model.addAttribute("iC_LOC_IMPORT", iC_LOC_IMPORT);
		  
		  /* might be unused */
		  model.addAttribute("listIC_LOC_IMPORTE", listIC_LOC_IMPORT);
		
		  model.addAttribute("Code", Code);
		  model.addAttribute("id", id); 
		  
		  /* Circle code finding*/
		  List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER = rowSqlDao.listIC_LOCATION_MASTER(iC_LOC_IMPORT.LOCATION_CODE);
		  model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
		  
		  /* circle code wise all location code */
		  IC_LOCATION_MASTER_Dropdown row = listIC_LOCATION_MASTER.get(0);
		  List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER_Dropdown = rowSqlDao.listIC_LOCATION_MASTER_Dropdown(row.CIRCLE_CODE);
		  model.addAttribute("listIC_LOCATION_MASTER_Dropdown",listIC_LOCATION_MASTER_Dropdown);
		 
		  String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
		  return "IC_LOC_IMPORT";
	  }
	  
		
		/*
		 * @PostMapping("/IC_LOC_IMPORT") public String IC_LOC_IMPORT_save(
		 * com.example.demo.model.IC_LOC_IMPORT iC_LOC_IMPORT, Model model) {
		 * 
		 * rowSqlDao.insert_IC_LOC_IMPORT(iC_LOC_IMPORT); return
		 * "redirect:/IC_LOC_IMPORT_DROPDOWN"; }
		 */
		  
		  
	  @PostMapping("/IC_LOC_IMPORT/{id}")
	  public String IC_LOC_IMPORT_edit(@PathVariable String id, Model model, com.example.demo.model.IC_LOC_IMPORT iC_LOC_IMPORT)
	  { 
		 
		  iC_LOC_IMPORT.setIMP_ID(id);
		  rowSqlDao.IC_LOC_IMPORT_edit(iC_LOC_IMPORT);
		  return "redirect:/IC_LOC_IMPORT/"+iC_LOC_IMPORT.BILL_CYCLE_CODE;
	  }
		  
	
  
	  @PostMapping("/IC_LOC_IMPORT_clear/{id}") public
	  String IC_LOC_IMPORT_clear(@PathVariable String id, Model model)
	  {
		
		  return "redirect:/IC_LOC_IMPORT";
	  }

	  
		@GetMapping("/IC_RAO_INFO")
		public String ic_rao_info(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String flag = "0";

			IC_RAO_INFO ic_rao_info = new IC_RAO_INFO();

			ArrayList<IC_RAO_INFO> listIC_RAO_INFO = convergeDaoSurovi.listIC_RAO_INFO();
			model.addAttribute("ic_rao_info", ic_rao_info);
			model.addAttribute("listIC_RAO_INFO", listIC_RAO_INFO);
			model.addAttribute("flag", flag);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "IC_RAO_INFO";
		}

		@PostMapping("/IC_RAO_INFO")
		public String ic_rao_info_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,IC_RAO_INFO ic_rao_info) {

			convergeDaoSurovi.insertICRaoInfo(ic_rao_info,user_name);

			return "redirect:/IC_RAO_INFO";
		}

		@GetMapping("/IC_RAO_INFO/{id}")
		public String ic_rao_info_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@PathVariable("id") int id, Model model) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String flag = "1";

			IC_RAO_INFO ic_rao_info = convergeDaoSurovi.singleIC_RAO_INFO(id);


			ArrayList<IC_RAO_INFO> listIC_RAO_INFO = convergeDaoSurovi.listIC_RAO_INFO();


			model.addAttribute("ic_rao_info", ic_rao_info);
//			model.addAttribute("listMISC_BILL_TYPE", listMISC_BILL_TYPE);
			model.addAttribute("listIC_RAO_INFO", listIC_RAO_INFO);
			model.addAttribute("flag", flag);
			model.addAttribute("id", id);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "IC_RAO_INFO";
		}

		@PostMapping("/IC_RAO_INFO/{id}")
		public String ic_rao_info_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id, Model model, IC_RAO_INFO ic_rao_info) {

			ic_rao_info.setRAO_ID(id);

			convergeDaoSurovi.editICRaoInfo(ic_rao_info,user_name);

			return "redirect:/IC_RAO_INFO";
		}

		@PostMapping("/IC_RAO_INFO_delete/{id}")
		public String IC_RAO_INFO_delete(@PathVariable("id") int id) {

			convergeDaoSurovi.deleteICRaoInfo(id);

			return "redirect:/IC_RAO_INFO";
		}

//		CLEAR IC_RAO_INFO START
		@PostMapping("/IC_RAO_INFO_clear/{id}")
		public String IC_RAO_INFO_clear(@PathVariable("id") int id) {

			return "redirect:/IC_RAO_INFO";
		}
		
		@GetMapping("/IC_RAO_LOC_COLL/{cycle}/{location}")
		public String ic_rao_loc_coll(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("location") String location,@PathVariable("cycle") String cycle,Model model) {

			String flag = "0";

			IC_RAO_LOC_COLL ic_rao_loc_coll = new IC_RAO_LOC_COLL();
			
			ArrayList<IC_RAO_INFO> listIC_RAO_INFO = convergeDaoSurovi.listIC_RAO_INFO();
			model.addAttribute("listIC_RAO_INFO", listIC_RAO_INFO);
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			
			ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
			model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

			ArrayList<IC_RAO_LOC_COLL> listIC_RAO_LOC_COLL = convergeDaoSurovi.listIC_RAO_LOC_COLL(location,cycle);
			model.addAttribute("ic_rao_loc_coll", ic_rao_loc_coll);
			model.addAttribute("listIC_RAO_LOC_COLL", listIC_RAO_LOC_COLL);
			model.addAttribute("flag", flag);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			if(!billList.isEmpty()) {
				String puser= rowSqlDao.flagpuser(user_name,cycle,location);
				if(puser.equals("1")) {
					model.addAttribute("puser", "T");
				}else {
					model.addAttribute("puser", "F");
				}
			}
			
			return "IC_RAO_LOC_COLL";
		}
		
		@GetMapping("/IC_RAO_LOC_COLL/{location}/{id}/{cycle}")
		public String ic_rao_loc_coll_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("id") String id,@PathVariable("location") String location,@PathVariable("cycle") String cycle, Model model) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String flag = "1";

			IC_RAO_LOC_COLL ic_rao_loc_coll = convergeDaoSurovi.singleIC_RAO_LOC_COLL(id);
			
			ArrayList<IC_RAO_INFO> listIC_RAO_INFO = convergeDaoSurovi.listIC_RAO_INFO();
			model.addAttribute("listIC_RAO_INFO", listIC_RAO_INFO);
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			
			ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
			model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

			ArrayList<IC_RAO_LOC_COLL> listIC_RAO_LOC_COLL = convergeDaoSurovi.listIC_RAO_LOC_COLL(location,cycle);
			model.addAttribute("ic_rao_loc_coll", ic_rao_loc_coll);
			model.addAttribute("listIC_RAO_LOC_COLL", listIC_RAO_LOC_COLL);
			model.addAttribute("flag", flag);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			String puser= rowSqlDao.flagpuser(user_name,cycle,location);
			if(puser.equals("1")) {
				model.addAttribute("puser", "T");
			}else {
				model.addAttribute("puser", "F");
			}
			return "IC_RAO_LOC_COLL";
		}

		@PostMapping("/IC_RAO_LOC_COLL/{location}/{id}/{cycle}")
		public String ic_rao_loc_coll_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@PathVariable("id") String id,@PathVariable("location") String location, Model model, IC_RAO_LOC_COLL ic_rao_loc_coll,@PathVariable("cycle") String cycle) {

			ic_rao_loc_coll.setRLC_ID(Integer.valueOf(id));

			convergeDaoSurovi.editIcRaoLocColl(ic_rao_loc_coll,user_name);

			return "redirect:/IC_RAO_LOC_COLL/"+location+'/'+id+'/'+cycle;
		}

		@PostMapping("/IC_RAO_LOC_COLL_delete/{id}")
		public String IC_RAO_LOC_COLL_delete(@PathVariable("id") int id) {

			convergeDaoSurovi.deleteIcRaoLocColl(id);

			return "redirect:/IC_RAO_LOC_COLL";
		}

		@GetMapping("/IC_RAO_LOC_CAT_COLL/{BILL_CYCLE_CODE}/{location}")
		public String ic_rao_loc_cat_coll(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,Model model,@PathVariable("location") String location, @PathVariable("BILL_CYCLE_CODE") String BILL_CYCLE_CODE) {

			String flag = "0";

			IC_RAO_LOC_CAT_COLL ic_rao_loc_cat_coll = new IC_RAO_LOC_CAT_COLL();
			ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CATEGORY_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
			model.addAttribute("listIC_USAGE_CATEGORY_CODE", listIC_USAGE_CATEGORY_CODE);
			
			
			
			//Rony IC RAO LOC MISC COLL
			IC_RAO_LOC_MISC_COLL iC_RAO_LOC_MISC_COLL = new IC_RAO_LOC_MISC_COLL();
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL(location, BILL_CYCLE_CODE);
			model.addAttribute("iC_RAO_LOC_MISC_COLL", iC_RAO_LOC_MISC_COLL);
			model.addAttribute("listIC_RAO_LOC_MISC_COLL", listIC_RAO_LOC_MISC_COLL);
			//END Rony IC RAO LOC MISC COLL
			
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL1 = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL1(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_MISC_COLL1", listIC_RAO_LOC_MISC_COLL1);
			
			List<TotalSumModel> listTotalSumModelRo = rowSqlDao.listRouSumRo(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelRo.isEmpty()) {
				model.addAttribute("SYS_COLLRo", listTotalSumModelRo.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLRo", listTotalSumModelRo.get(0).getRAO_COLL());				
			}
			
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			
			ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
			model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);

			ArrayList<IC_RAO_LOC_CAT_COLL> listIC_RAO_LOC_CAT_COLL = convergeDaoSurovi.listIC_RAO_LOC_CAT_COLL(location, BILL_CYCLE_CODE);
			model.addAttribute("ic_rao_loc_cat_coll", ic_rao_loc_cat_coll);
			model.addAttribute("listIC_RAO_LOC_CAT_COLL", listIC_RAO_LOC_CAT_COLL);
			model.addAttribute("flag", flag);
			List<TotalSumModel> listTotalSumModel = rowSqlDao.listRouSum(location,BILL_CYCLE_CODE);
			if(!listTotalSumModel.isEmpty()) {
				model.addAttribute("SYS_COLL", listTotalSumModel.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLL", listTotalSumModel.get(0).getRAO_COLL());		
				/*
				model.addAttribute("SYS_COLLTot", Double.valueOf( listTotalSumModelRo.get(0).getSYS_COLL().trim())+Double.valueOf(listTotalSumModel.get(0).getSYS_COLL().trim()));
				model.addAttribute("RAO_COLLTot", Double.valueOf(listTotalSumModelRo.get(0).getRAO_COLL().trim())+Double.valueOf(listTotalSumModel.get(0).getRAO_COLL().trim()));
				*/
			}
			
			List<TotalSumModel> listRouSumtotal = rowSqlDao.listRouSumtotal(location,BILL_CYCLE_CODE);
			if(!listRouSumtotal.isEmpty()) {
				model.addAttribute("SYS_COLLTot", listRouSumtotal.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLTot", listRouSumtotal.get(0).getRAO_COLL());		
				
			}
			List<TotalSumModel> listTotalSumModelR = rowSqlDao.listRouSumR(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR.isEmpty()) {
				model.addAttribute("SYS_COLLR", listTotalSumModelR.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLR", listTotalSumModelR.get(0).getRAO_COLL());				
			}
			
			List<TotalSumModel> listTotalSumModelR_VAT = rowSqlDao.listRouSumR_VAT(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR_VAT.isEmpty()) {
				model.addAttribute("SYS_VAT_COLL", listTotalSumModelR_VAT.get(0).getSYS_COLL());
				model.addAttribute("RAO_VAT_COLL", listTotalSumModelR_VAT.get(0).getRAO_COLL());				
			}
			
			List<TotalSumModel> listRouSumVAT = rowSqlDao.listRouSumVAT(location,BILL_CYCLE_CODE);
			List<TotalSumModel> listTotalSumModelRR = rowSqlDao.listRouSumRR(location,BILL_CYCLE_CODE);
			
			if((listRouSumtotal.get(0).getRAO_COLL().equals(listTotalSumModelRR.get(0).getRAO_COLL()))&&(listTotalSumModelR_VAT.get(0).getRAO_COLL().equals(listRouSumVAT.get(0).getRAO_COLL())) ) {
				model.addAttribute("color", "S");
			}else {
				model.addAttribute("color", "N");
			}
			
			
			
			
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			
			return "IC_RAO_LOC_CAT_COLL";
		}
		
		@GetMapping("/IC_RAO_LOC_CAT_COLL/{BILL_CYCLE_CODE}/{location}/{id}")
		public String ic_rao_loc_cat_coll_single(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
				 Model model,@PathVariable("id") String id,@PathVariable("location") String location, @PathVariable("BILL_CYCLE_CODE") String BILL_CYCLE_CODE) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String flag = "1";

			try {
				IC_RAO_LOC_CAT_COLL ic_rao_loc_cat_coll = convergeDaoSurovi.singleIC_RAO_LOC_CAT_COLL(id);
				model.addAttribute("ic_rao_loc_cat_coll", ic_rao_loc_cat_coll);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CATEGORY_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
			model.addAttribute("listIC_USAGE_CATEGORY_CODE", listIC_USAGE_CATEGORY_CODE);
			
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			
			ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
			model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
			
			
			
			
			//Rony IC RAO LOC MISC COLL
			
			try {
				IC_RAO_LOC_MISC_COLL iC_RAO_LOC_MISC_COLL = rowSqlDao.listIC_RAO_LOC_MISC_COLL_S(id);
				model.addAttribute("iC_RAO_LOC_MISC_COLL", iC_RAO_LOC_MISC_COLL);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_MISC_COLL", listIC_RAO_LOC_MISC_COLL);
			
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL1 = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL1(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_MISC_COLL1", listIC_RAO_LOC_MISC_COLL1);
			
			List<TotalSumModel> listTotalSumModelRo = rowSqlDao.listRouSumRo(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelRo.isEmpty()) {
				model.addAttribute("SYS_COLLRo", listTotalSumModelRo.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLRo", listTotalSumModelRo.get(0).getRAO_COLL());				
			}
			
			
			
			//END Rony IC RAO LOC MISC COLL
			
			

			ArrayList<IC_RAO_LOC_CAT_COLL> listIC_RAO_LOC_CAT_COLL = convergeDaoSurovi.listIC_RAO_LOC_CAT_COLL(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_CAT_COLL", listIC_RAO_LOC_CAT_COLL);
			model.addAttribute("flag", flag);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			String puser= rowSqlDao.flagpuser(user_name,BILL_CYCLE_CODE,location);
			if(puser.equals("1")) {
				model.addAttribute("puser", "T");
			}else {
				model.addAttribute("puser", "F");
			}
			
			List<TotalSumModel> listTotalSumModel = rowSqlDao.listRouSum(location,BILL_CYCLE_CODE);
			if(!listTotalSumModel.isEmpty()) {
				model.addAttribute("SYS_COLL", listTotalSumModel.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLL", listTotalSumModel.get(0).getRAO_COLL());
				/*
				model.addAttribute("SYS_COLLTot", Double.valueOf(listTotalSumModelRo.get(0).getSYS_COLL().trim())+Double.valueOf(listTotalSumModel.get(0).getSYS_COLL().trim()));
				model.addAttribute("RAO_COLLTot", Double.valueOf(listTotalSumModelRo.get(0).getRAO_COLL().trim())+Double.valueOf(listTotalSumModel.get(0).getRAO_COLL().trim()));
				
				*/
			}
			
			List<TotalSumModel> listRouSumtotal = rowSqlDao.listRouSumtotal(location,BILL_CYCLE_CODE);
			if(!listRouSumtotal.isEmpty()) {
				model.addAttribute("SYS_COLLTot", listRouSumtotal.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLTot", listRouSumtotal.get(0).getRAO_COLL());		
				
			}
			List<TotalSumModel> listTotalSumModelR = rowSqlDao.listRouSumR(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR.isEmpty()) {
				model.addAttribute("SYS_COLLR", listTotalSumModelR.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLR", listTotalSumModelR.get(0).getRAO_COLL());				
			}
			List<TotalSumModel> listTotalSumModelR_VAT = rowSqlDao.listRouSumR_VAT(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR_VAT.isEmpty()) {
				model.addAttribute("SYS_VAT_COLL", listTotalSumModelR_VAT.get(0).getSYS_COLL());
				model.addAttribute("RAO_VAT_COLL", listTotalSumModelR_VAT.get(0).getRAO_COLL());				
			}
			/*if(!listRouSumtotal.isEmpty()&&!listTotalSumModelR.isEmpty()) {
				if(listRouSumtotal.get(0).getRAO_COLL().equals(listTotalSumModelR.get(0).getRAO_COLL())) {
					model.addAttribute("color", "S");
				}else {
					model.addAttribute("color", "N");
				}
			}*/
			List<TotalSumModel> listRouSumVAT = rowSqlDao.listRouSumVAT(location,BILL_CYCLE_CODE);
			List<TotalSumModel> listTotalSumModelRR = rowSqlDao.listRouSumRR(location,BILL_CYCLE_CODE);
			
			if((listRouSumtotal.get(0).getRAO_COLL().equals(listTotalSumModelRR.get(0).getRAO_COLL()))&&(listTotalSumModelR_VAT.get(0).getRAO_COLL().equals(listRouSumVAT.get(0).getRAO_COLL())) ) {
				model.addAttribute("color", "S");
			}else {
				model.addAttribute("color", "N");
			}
			
			
			
			
			
			
			return "IC_RAO_LOC_CAT_COLL";
		}
		
		@GetMapping("/IC_RAO_LOC_MISC_COLL/{BILL_CYCLE_CODE}/{location}/{id}")
		public String IC_RAO_LOC_MISC_COLL_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name,@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
				 Model model,@PathVariable("id") String id,@PathVariable("location") String location, @PathVariable("BILL_CYCLE_CODE") String BILL_CYCLE_CODE) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			
			String flag = "1";
			try {
				IC_RAO_LOC_CAT_COLL ic_rao_loc_cat_coll = convergeDaoSurovi.singleIC_RAO_LOC_CAT_COLL(id);
				model.addAttribute("ic_rao_loc_cat_coll", ic_rao_loc_cat_coll);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CATEGORY_CODE = iconvDaoRafi.listIC_USAGE_CAT_CODE();
			model.addAttribute("listIC_USAGE_CATEGORY_CODE", listIC_USAGE_CATEGORY_CODE);
			
			
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			
			ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = iconvDaoRafi.listIC_LOCATION_MASTER();
			model.addAttribute("listIC_LOCATION_MASTER", listIC_LOCATION_MASTER);
			
			
			
			
			//Rony IC RAO LOC MISC COLL
			
			try {
				IC_RAO_LOC_MISC_COLL iC_RAO_LOC_MISC_COLL = rowSqlDao.listIC_RAO_LOC_MISC_COLL_S(id);
				model.addAttribute("iC_RAO_LOC_MISC_COLL", iC_RAO_LOC_MISC_COLL);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_MISC_COLL", listIC_RAO_LOC_MISC_COLL);
			
			ArrayList<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL1 = (ArrayList<IC_RAO_LOC_MISC_COLL>) rowSqlDao.listIC_RAO_LOC_MISC_COLL1(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_MISC_COLL1", listIC_RAO_LOC_MISC_COLL1);
			
			List<TotalSumModel> listTotalSumModelRo = rowSqlDao.listRouSumRo(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelRo.isEmpty()) {
				model.addAttribute("SYS_COLLRo", listTotalSumModelRo.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLRo", listTotalSumModelRo.get(0).getRAO_COLL());				
			}
			
			List<TotalSumModel> listRouSumtotal = rowSqlDao.listRouSumtotal(location,BILL_CYCLE_CODE);
			if(!listRouSumtotal.isEmpty()) {
				model.addAttribute("SYS_COLLTot", listRouSumtotal.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLTot", listRouSumtotal.get(0).getRAO_COLL());		
				
			}
			
			List<TotalSumModel> listTotalSumModelR_VAT = rowSqlDao.listRouSumR_VAT(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR_VAT.isEmpty()) {
				model.addAttribute("SYS_VAT_COLL", listTotalSumModelR_VAT.get(0).getSYS_COLL());
				model.addAttribute("RAO_VAT_COLL", listTotalSumModelR_VAT.get(0).getRAO_COLL());				
			}
			
			//END Rony IC RAO LOC MISC COLL
			
			ArrayList<IC_RAO_LOC_CAT_COLL> listIC_RAO_LOC_CAT_COLL = convergeDaoSurovi.listIC_RAO_LOC_CAT_COLL(location, BILL_CYCLE_CODE);
			
			model.addAttribute("listIC_RAO_LOC_CAT_COLL", listIC_RAO_LOC_CAT_COLL);

			model.addAttribute("flag", flag);
			String  dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			String puser= rowSqlDao.flagpuser(user_name,BILL_CYCLE_CODE,location);
			if(puser.equals("1")) {
				model.addAttribute("puser", "T");
			}else {
				model.addAttribute("puser", "F");
			}
			List<TotalSumModel> listTotalSumModel = rowSqlDao.listRouSum(location,BILL_CYCLE_CODE);
			
			if(!listTotalSumModel.isEmpty()) {
				model.addAttribute("SYS_COLL", listTotalSumModel.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLL", listTotalSumModel.get(0).getRAO_COLL());		
				
			}
			
			
			List<TotalSumModel> listTotalSumModelR = rowSqlDao.listRouSumR(location,BILL_CYCLE_CODE);
			if(!listTotalSumModelR.isEmpty()) {
				model.addAttribute("SYS_COLLR", listTotalSumModelR.get(0).getSYS_COLL());
				model.addAttribute("RAO_COLLR", listTotalSumModelR.get(0).getRAO_COLL());				
			}
			
			List<TotalSumModel> listRouSumVAT = rowSqlDao.listRouSumVAT(location,BILL_CYCLE_CODE);
			List<TotalSumModel> listTotalSumModelRR = rowSqlDao.listRouSumRR(location,BILL_CYCLE_CODE);
			
			if((listRouSumtotal.get(0).getRAO_COLL().equals(listTotalSumModelRR.get(0).getRAO_COLL()))&&(listTotalSumModelR_VAT.get(0).getRAO_COLL().equals(listRouSumVAT.get(0).getRAO_COLL())) ) {
				model.addAttribute("color", "S");
			}else {
				model.addAttribute("color", "N");
			}
			return "IC_RAO_LOC_MISC_COLL";
		}

		@PostMapping("/IC_RAO_LOC_CAT_COLL/{BILL_CYCLE_CODE}/{location}/{id}")
		public String ic_rao_loc_cat_coll_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model, IC_RAO_LOC_CAT_COLL ic_rao_loc_cat_coll,@PathVariable("id") String id,@PathVariable("location") String location,@PathVariable("BILL_CYCLE_CODE") String BILL_CYCLE_CODE) {

			ic_rao_loc_cat_coll.setRAO_LOC_ID(Integer.valueOf(id));
			

			convergeDaoSurovi.editIcRaoLocCatColl(ic_rao_loc_cat_coll,user_name);
			

			return "redirect:/IC_RAO_LOC_CAT_COLL/"+BILL_CYCLE_CODE+'/'+location;
		}
		
		@PostMapping("/IC_RAO_LOC_MISC_COLL/{BILL_CYCLE_CODE}/{location}/{id}")
		public String IC_RAO_LOC_MISC_COLL_edit(@CookieValue(value = "user_name", defaultValue = "") String user_name, Model model, IC_RAO_LOC_MISC_COLL iC_RAO_LOC_MISC_COLL,@PathVariable("id") String id,@PathVariable("location") String location, @PathVariable("BILL_CYCLE_CODE") String BILL_CYCLE_CODE) {

			
			
			//Rony IC RAO LOC MISC COLL
			iC_RAO_LOC_MISC_COLL.setRAO_LOC_MISC_ID(String.valueOf(id));
			iC_RAO_LOC_MISC_COLL.setUPDATE_BY(user_name);
			rowSqlDao.IC_RAO_LOC_MISC_COLL_edit(iC_RAO_LOC_MISC_COLL);
			//END Rony IC RAO LOC MISC COLL
			
			

			return "redirect:/IC_RAO_LOC_CAT_COLL/"+BILL_CYCLE_CODE+'/'+location;
		}

		@PostMapping("/IC_RAO_LOC_CAT_COLL_delete/{id}")
		public String IC_RAO_LOC_CAT_COLL_delete(@PathVariable("id") int id) {

			convergeDaoSurovi.deleteIcRaoLocCatColl(id);

			return "redirect:/IC_RAO_LOC_CAT_COLL";
		}
		
		
		

		@GetMapping("/MOD_ACC_RECV_SECT_REPORT/{bill}/{loc}")
		public String MOD_ACC_RECV_SECT_REPORT(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,  Model model,@PathVariable("bill") String bill,@PathVariable("loc") String loc) {
			if (user_name.equals("")) {
				return "redirect:/";
			}

			ArrayList<com.example.demo.model.MOD_ACC_RECV_SECT_REPORT> listMOD_ACC_RECV_SECT_REPORT = icDao.listMOD_ACC_RECV_SECT_REPORT(officeCode, loc,
					bill);
			model.addAttribute("listMOD_ACC_RECV_SECT_REPORT", listMOD_ACC_RECV_SECT_REPORT);
			if(!listMOD_ACC_RECV_SECT_REPORT.isEmpty()) {
				model.addAttribute("location", listMOD_ACC_RECV_SECT_REPORT.get(0).getLOCATION_NAME()+" ("+listMOD_ACC_RECV_SECT_REPORT.get(0).getLOCATION_CODE()+")");
			model.addAttribute("circle", listMOD_ACC_RECV_SECT_REPORT.get(0).getCIRCLE_NAME());
			model.addAttribute("rao", listMOD_ACC_RECV_SECT_REPORT.get(0).getRAO_NAME());
			model.addAttribute("month", listMOD_ACC_RECV_SECT_REPORT.get(0).getBILL_MONTH());
			}
			

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			return "MOD_ACC_RECV_SECT_REPORT";
		}
		
		

		@GetMapping("/BC_MOD_BILLED_AMOUNT/{bill}/{locationCode}")
		public String BC_MOD_BILLED_AMOUNT(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("bill") String bill, @PathVariable("locationCode") String locationCode, Model model) {
			
			ArrayList<BC_MOD_BILLED_AMOUNT> listBC_MOD_BILLED_AMOUNT = icDao.listBC_MOD_BILLED_AMOUNT(officeCode,bill, locationCode);
			model.addAttribute("listBC_MOD_BILLED_AMOUNT", listBC_MOD_BILLED_AMOUNT);
			if(!listBC_MOD_BILLED_AMOUNT.isEmpty())
			{
				model.addAttribute("location", listBC_MOD_BILLED_AMOUNT.get(0).getLOCATION_NAME());
				model.addAttribute("circle", listBC_MOD_BILLED_AMOUNT.get(0).getCIRCLE_DESC());
				model.addAttribute("rao", listBC_MOD_BILLED_AMOUNT.get(0).getRAO_NAME());
				model.addAttribute("month", listBC_MOD_BILLED_AMOUNT.get(0).getBILL_MONTH());
			}
			
			
			ArrayList<MISC_BILLED_AMT> listMISC_BILLED_AMT = icDao.listMISC_BILLED_AMT(officeCode,bill, locationCode);
			model.addAttribute("listMISC_BILLED_AMT", listMISC_BILLED_AMT);
			
			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			return "BC_MOD_BILLED_AMOUNT";
		}
		
		@GetMapping("/MOD_ENERGY_SOLD_REPORT/{bill}/{loc}")
		public String MOD_ENERGY_SOLD_REPORT(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,  Model model,@PathVariable("bill") String bill,@PathVariable("loc") String loc) {
			if (user_name.equals("")) {
				return "redirect:/";
			}

			ArrayList<MOD_ENERGY_SOLD_REPORT> listMOD_ENERGY_SOLD_REPORT = icDao.listMOD_ENERGY_SOLD_REPORT(officeCode, loc,
					bill);
			if(!listMOD_ENERGY_SOLD_REPORT.isEmpty()) {
				model.addAttribute("listMOD_ENERGY_SOLD_REPORT", listMOD_ENERGY_SOLD_REPORT);
			model.addAttribute("location", listMOD_ENERGY_SOLD_REPORT.get(0).getLOCATION_NAME()+" ("+listMOD_ENERGY_SOLD_REPORT.get(0).getLOCATION_CODE()+")");
			model.addAttribute("circle", listMOD_ENERGY_SOLD_REPORT.get(0).getCIRCLE_NAME());
			model.addAttribute("rao", listMOD_ENERGY_SOLD_REPORT.get(0).getRAO_NAME());
			model.addAttribute("month", listMOD_ENERGY_SOLD_REPORT.get(0).getBILL_MONTH());
			int index=listMOD_ENERGY_SOLD_REPORT.size()-1;
			model.addAttribute("total", listMOD_ENERGY_SOLD_REPORT.get(index).getNEW_CONSUMER_IN_MONTH());
			listMOD_ENERGY_SOLD_REPORT.remove(index);
			}
			

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			return "MOD_ENERGY_SOLD_REPORT";
		}
		
		
		@GetMapping("/BC_MOD_COLLECTED_AMOUNT/{bill}/{locationCode}")
		public String BC_MOD_COLLECTED_AMOUNT(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("bill") String bill, @PathVariable("locationCode") String locationCode, Model model) {
			
//			ArrayList<BC_MOD_COLLECTED_AMOUNT> listBC_MOD_COLLECTED_AMOUNT = icDao.listBC_MOD_COLLECTED_AMOUNT(officeCode,bill, locationCode);
//			model.addAttribute("listBC_MOD_COLLECTED_AMOUNT", listBC_MOD_COLLECTED_AMOUNT);
//			if(!listBC_MOD_COLLECTED_AMOUNT.isEmpty()) {
//				model.addAttribute("location", listBC_MOD_COLLECTED_AMOUNT.get(0).getLOCATION_NAME());
//				model.addAttribute("circle", listBC_MOD_COLLECTED_AMOUNT.get(0).getCIRCLE_DESC());
//				model.addAttribute("rao", listBC_MOD_COLLECTED_AMOUNT.get(0).getRAO_NAME());
//				model.addAttribute("month", listBC_MOD_COLLECTED_AMOUNT.get(0).getBILL_MONTH());
//			}			
//			
//			ArrayList<MISC_COLLECTED_AMOUNT> listMISC_COLLECTED_AMOUNT = icDao.listMISC_COLLECTED_AMOUNT(officeCode,bill, locationCode);
//			model.addAttribute("listMISC_COLLECTED_AMOUNT", listMISC_COLLECTED_AMOUNT);
			ArrayList<BC_MOD_COLLECTED_AMOUNT> listBC_MOD_COLLECTED_AMOUNT = icDao.listBC_MOD_COLLECTED_AMOUNT(officeCode,
					bill, locationCode);
			model.addAttribute("listBC_MOD_COLLECTED_AMOUNT", listBC_MOD_COLLECTED_AMOUNT);
			if(!listBC_MOD_COLLECTED_AMOUNT.isEmpty()) {
				model.addAttribute("location", listBC_MOD_COLLECTED_AMOUNT.get(0).getLOCATION_NAME()+" ("+listBC_MOD_COLLECTED_AMOUNT.get(0).getLOCATION_CODE()+")");
			model.addAttribute("circle", listBC_MOD_COLLECTED_AMOUNT.get(0).getCIRCLE_DESC());
			model.addAttribute("rao", listBC_MOD_COLLECTED_AMOUNT.get(0).getRAO_NAME());
			model.addAttribute("month", listBC_MOD_COLLECTED_AMOUNT.get(0).getBILL_MONTH());
			}
			
			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			
			
			return "BC_MOD_COLLECTED_AMOUNT";
		}
		@GetMapping("/BC_MOD_ACC_RECEVABLE_BI/{bill}/{locationCode}")
		public String BC_MOD_ACC_RECEVABLE_BI(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("bill") String bill, @PathVariable("locationCode") String locationCode, Model model) {
			
			ArrayList<dpd_MOD_ACC_REC_CAT_REPORT5> listBC_MOD_COLLECTED_AMOUNT = icDao.dpd_MOD_ACC_REC_CAT_REPORT5(officeCode,bill, locationCode);
			model.addAttribute("listBC_MOD_COLLECTED_AMOUNT", listBC_MOD_COLLECTED_AMOUNT);
			if(!listBC_MOD_COLLECTED_AMOUNT.isEmpty()) {
				model.addAttribute("location", listBC_MOD_COLLECTED_AMOUNT.get(0).getLOCATION_NAME());
			model.addAttribute("circle", listBC_MOD_COLLECTED_AMOUNT.get(0).getCIRCLE_NAME());
			model.addAttribute("rao", listBC_MOD_COLLECTED_AMOUNT.get(0).getRAO_NAME());
			model.addAttribute("month", listBC_MOD_COLLECTED_AMOUNT.get(0).getBILL_MONTH());
			}		
			
			ArrayList<dpd_MOD_ACC_REC_CAT_REPORT6> listMISC_COLLECTED_AMOUNT = icDao.dpd_MOD_ACC_REC_CAT_REPORT6(officeCode,bill, locationCode);
			model.addAttribute("listMISC_COLLECTED_AMOUNT", listMISC_COLLECTED_AMOUNT);
			
			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			
			
			return "BC_MOD_ACC_RECEVABLE_BI";
		}
		
		

		@GetMapping("/BC_MOD_SUMMERY_REPORT/{bill}/{locationCode}")
		public String BC_MOD_SUMMERY_REPORT(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("bill") String bill, @PathVariable("locationCode") String locationCode,MOD_REPORT mod_report, Model model ) {
			
			ArrayList<BC_MOD_SUMMERY_REPORT> listBC_MOD_SUMMERY_REPORT = icDao.listBC_MOD_SUMMERY_REPORT(officeCode,bill, locationCode);
			model.addAttribute("listBC_MOD_SUMMERY_REPORT", listBC_MOD_SUMMERY_REPORT);
			if(!listBC_MOD_SUMMERY_REPORT.isEmpty()) {
			model.addAttribute("location", listBC_MOD_SUMMERY_REPORT.get(0).getLOCATION_NAME());
			model.addAttribute("circle", listBC_MOD_SUMMERY_REPORT.get(0).getCIRCLE_DESC());
			model.addAttribute("rao", listBC_MOD_SUMMERY_REPORT.get(0).getRAO_NAME());
			model.addAttribute("month", listBC_MOD_SUMMERY_REPORT.get(0).getBILL_CYCLE_DESCR());
			}
			/*
			ArrayList<BC_MOD_SUMMERY_REPORT> listMISC_COLLECTED_AMOUNT = icDao.listBC_MOD_SUMMERY_REPORT(officeCode,bill, locationCode);
			model.addAttribute("listMISC_COLLECTED_AMOUNT", listMISC_COLLECTED_AMOUNT);
			*/
			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			
			return "BC_MOD_SUMMERY_REPORT";
		}
		@GetMapping("/IC_DASHBOARD_DATA")
		public String ic_dashboard_data(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String hdr1 = "";
			String hdr2 = "";
			String hdr3 = "";
			String hdr4 = "";
			String hdr5 = "";
			String hdr6 = "";
			String hdr7 = "";
			String hdr8 = "";
			String hdr9 = "";
			String hdr10 = "";
			String hdr11 = "";
			String hdr12 = "";

			String hdr13 = "";

			String hdr14 = "";

			String hdr40 = "";
			String hdr41 = "";

			String hdr42 = "";
			String hdr43 = "";

			String hdr44 = "";
			String hdr45 = "";

			String hdr46 = "";
			String hdr47 = "";

			String hdr48 = "";
			String hdr49 = "";
			String hdr50 = "";
			String hdr51 = "";
			String hdr52 = "";
			String hdr53 = "";
			
			String hdr99 = "";

			String listlast_month_date = iconvDaoRafi.listlast_month_date();

			String date = listlast_month_date; // 034556

			String a = date;
			String b = null;
			String c = null;
			String g = null;
			String d = null;
			String e = "000000";
			String f = "1";

			
//			IC_REPORT_LEVEL_MST drop-down start 
			ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST1 = convergeDaoSurovi.listIC_REPORT_LEVEL_MST1();
			model.addAttribute("listIC_REPORT_LEVEL_MST1", listIC_REPORT_LEVEL_MST1);
//			IC_REPORT_LEVEL_MST drop-down start 		
			
//			IC_RAO_INFO drop-down start 
			
			ArrayList<IC_RAO_INFO> listIC_RAO_INFO1 = convergeDaoSurovi.listIC_RAO_INFO1(  );
			model.addAttribute("listIC_RAO_INFO1", listIC_RAO_INFO1);
			
//			IC_RAO_INFO drop-down end 

			
//			IC_ZONE_MST drop-down start 
			ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
			model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//			IC_ZONE_MST drop-down end 

//			IC_ZONE_MST drop-down start 
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);

//			IC_ZONE_MST drop-down end 	
			
			

			IC_DASHBOARD_DATA abc = new IC_DASHBOARD_DATA();
			abc.setBill(a);
			abc.setReport("1");

			model.addAttribute("xyz", abc);

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			return "IC_DASHBOARD_DATA";
		}
		
		@PostMapping("/IC_DASHBOARD_DATA")
		public String ic_dashboard_data_save(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, IC_DASHBOARD_DATA dashboard_data,
				Model model) {
			if (user_name.equals("")) {
				return "redirect:/";
			}
			String hdr1 = "";
			String hdr2 = "";
			String hdr3 = "";
			String hdr4 = "";
			String hdr5 = "";
			String hdr6 = "";
			String hdr7 = "";
			String hdr8 = "";
			String hdr9 = "";
			String hdr10 = "";
			String hdr11 = "";
			String hdr12 = "";
			String hdr13 = "";
			String hdr14 = "";

			String hdr40 = "";
			String hdr41 = "";
			String hdr42 = "";
			String hdr43 = "";
			String hdr44 = "";
			String hdr45 = "";
			String hdr46 = "";
			String hdr47 = "";
			String hdr48 = "";
			String hdr49 = "";
			String hdr50 = "";
			String hdr51 = "";
			String hdr52 = "";
			String hdr53 = "";
			String hdr54 = "";
			
			
			String hdr99 = "";

			String a = dashboard_data.getBill();
			String b = dashboard_data.getZone();
			String c = dashboard_data.getCircle();
			String g = dashboard_data.getDiv();
			String h = dashboard_data.getRAO();
			String d = dashboard_data.getLoc();
			String f = dashboard_data.getReport();

			Map<String, Object> result = getAllStatesJdbcCall520.withCatalogName("pkg_dist_DF_Dash_board")
					.withProcedureName("dpd_DF_GRAPH")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(a, b, c, g,  d, officeCode,f, h);
	
			JSONObject json = new JSONObject(result);
			String fjfhdj = json.get("CUR_DATA").toString();
			JSONArray jsonArray = new JSONArray(fjfhdj);

			Map<String, Double> graphData = new TreeMap<>();
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				hdr99 = jsonData.optString("ORD");
				graphData.put(jsonData.optString("USER_TYPE"), Double.valueOf(jsonData.optString("MOD")));
			}

			model.addAttribute("hdr99_graph", hdr99);
			model.addAttribute("chartData", graphData);




			// table show sys_loss upto month starts

			
			JSONObject json41 = new JSONObject(result);
			String fjfhdj41 = json41.get("CUR_DATA").toString();
			JSONArray jsonArray41 = new JSONArray(fjfhdj41);
			
			ArrayList<DASHBOARD_DATA> tableList1 = new ArrayList<DASHBOARD_DATA>();
			for (int i = 0; i < jsonArray41.length(); i++) {
				JSONObject jsonData41 = jsonArray41.getJSONObject(i);

				hdr41 = jsonData41.optString("ORD");

				tableList1.add(new DASHBOARD_DATA(jsonData41.optString("ORD"), jsonData41.optString("USER_TYPE"),
						jsonData41.optString("MOD")));
			}

			model.addAttribute("hdr41_table", hdr41);
			model.addAttribute("tableList1", tableList1);
			
			ArrayList<DPD_DF_report> listDPD_DF_report = new ArrayList<>();
			
			Map<String, Object> result1 = getAllStatesJdbcCall523.withCatalogName("pkg_dist_DF_Dash_board")
					.withProcedureName("dpd_DF_report")
					.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(a, b, c, g,  d, officeCode,f, h);

			JSONObject json1 = new JSONObject(result1);
		
			String out = json1.get("CUR_DATA").toString();
			JSONArray jsonArray1 = new JSONArray(out);

			System.out.println(jsonArray1);

			for (int i = 0; i < jsonArray1.length(); i++) {
				JSONObject jsonData = jsonArray1.getJSONObject(i);
				listDPD_DF_report.add(new DPD_DF_report(jsonData.optInt("LOC_MOD_ID"),
						jsonData.optString("BILL_CYCLE_CODE"),jsonData.optString("LOCATION_CODE"),
						jsonData.optString("LOCATION_NAME"),
						jsonData.optString("FROM_USER"),jsonData.optString("FROM_USER_TYPE"),jsonData.optString("TO_USER"),
						jsonData.optString("TO_USER_TYPE"),
						jsonData.optString("COMMENTS"),jsonData.optString("RECEIVED_AT")));
			}
			model.addAttribute("listDPD_DF_report", listDPD_DF_report);

			// table show sys_loss upto month ends

//			IC_REPORT_LEVEL_MST drop-down start 
			ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST1 = convergeDaoSurovi.listIC_REPORT_LEVEL_MST1();
			model.addAttribute("listIC_REPORT_LEVEL_MST1", listIC_REPORT_LEVEL_MST1);
//			IC_REPORT_LEVEL_MST drop-down end 		
			
			
//			IC_RAO_INFO drop-down start 
			
			ArrayList<IC_RAO_INFO> listIC_RAO_INFO1 = convergeDaoSurovi.listIC_RAO_INFO1();
			model.addAttribute("listIC_RAO_INFO1", listIC_RAO_INFO1);
			
//			IC_RAO_INFO drop-down end 

//			IC_ZONE_MST drop-down start 
			ArrayList<IC_ZONE_MST_R> listIC_ZONE_MST = iconvDaoRafi.r(officeCode);
			model.addAttribute("listIC_ZONE_MST", listIC_ZONE_MST);
//			IC_ZONE_MST drop-down end 

//			Month_Dropdown drop-down start 
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);

//			Month_Dropdown drop-down end 	

//			circle drop-down start 
			ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
			circleList = iconvDaoRafi.getCircleList(officeCode, dashboard_data.getZone());
			model.addAttribute("circleList", circleList);
//			circle drop-down end 

//			div drop-down start
			ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
			divList = iconvDaoRafi.getdivList(officeCode, dashboard_data.getCircle());
			model.addAttribute("divList", divList);
//			div drop-down end

//			loc drop-down start	
			ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
			locList = iconvDaoRafi.getlocList(officeCode, dashboard_data.getCircle(), dashboard_data.getDiv());
			model.addAttribute("locList", locList);
//			loc drop-down end
			
			
		//   rao drop-down start	
			
//			ArrayList<IC_RAO_INFO> RaoList = new ArrayList<>();
//			RaoList = iconvDaoRafi.getraoList(officeCode, dashboard_data.getLoc());
//			model.addAttribute("RaoList", RaoList);
//			
//			rao drop-down end

			


			model.addAttribute("xyz", dashboard_data);

			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "IC_DASHBOARD_DATA";

		}
		
		
		@GetMapping("/IC_DASHBOARD_DATA_DETAILS/{bill}/{locationCode}")
		public String IC_DASHBOARD_DATA_DETAILS(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode,@PathVariable("bill") String bill, @PathVariable("locationCode") String locationCode, Model model) {
			String zoneCode = null, circleCode = null,divCode = null,reportLevel = null,rao=null;
			ArrayList<IC_DASHBOARD_DATA_DETAILS> listIC_DASHBOARD_DATA_DETAILS = convergeDaoSurovi.listIC_DASHBOARD_DATA_DETAILS(bill,zoneCode,circleCode,divCode, locationCode,officeCode,reportLevel,rao );
			model.addAttribute("listIC_DASHBOARD_DATA_DETAILS", listIC_DASHBOARD_DATA_DETAILS);
			
			
			String dynamicMenu= icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);
			
			return "IC_DASHBOARD_DATA_DETAILS";
		}
		
		
		@GetMapping("/IC_SMS_DASHBOARD")
		public String IC_SMS_DASHBOARD(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, -1);
			Date result = cal.getTime();
			SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
			String fromDate=formatter1.format(result);
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String toDate=formatter.format(date);
			//model.addAttribute("TO_DATE", toDate);
			SMS_LOG sMS_LOG = new SMS_LOG();
			sMS_LOG.setTO_DATE(toDate);
			sMS_LOG.setFROM_DATE(fromDate);
			model.addAttribute("sMS_LOG", sMS_LOG);

			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "SMS_DASHBOARD";
		}

		@PostMapping("/IC_SMS_DASHBOARD")
		public String IC_SMS_DASHBOARD_Table(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model, SMS_LOG sMS_LOG) {

			
			String FROM_DATE = sMS_LOG.FROM_DATE;
			String TO_DATE1 = sMS_LOG.TO_DATE;
			 
			List<SMS_LOG_DETAILS> listSMSLOG = rowSqlDao.listSMSLOG(FROM_DATE, TO_DATE1);
			model.addAttribute("listSMSLOG", listSMSLOG);
			model.addAttribute("sMS_LOG", sMS_LOG);
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "SMS_DASHBOARD";
		}
		
		
		@GetMapping("/IC_DATAAVAIL_DASHBOARD_GEN")
		public String PP_GEN_DASHBOARD(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
			
			List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown = rowSqlDao.listIC_PERIOD_MST_Dropdown();
			model.addAttribute("listIC_PERIOD_MST_Dropdown", listIC_PERIOD_MST_Dropdown);
			
			List<DrpDwn> listDrpDwnPP = rowSqlDao.listDrpDwnPP();
			model.addAttribute("listDrpDwnPP", listDrpDwnPP);
			
			PP_GEN_DASHBOARD pP_GEN_DASHBOARD = new PP_GEN_DASHBOARD();
			model.addAttribute("pP_GEN_DASHBOARD", pP_GEN_DASHBOARD);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "PPGENDASHBOARD";
		}

		@PostMapping("/IC_DATAAVAIL_DASHBOARD_GEN")
		public String PP_GEN_DASHBOARD_Table(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model, PP_GEN_DASHBOARD pP_GEN_DASHBOARD) {

			String BILL_CYCLE_CODE = pP_GEN_DASHBOARD.getPERIOD_CODE();
			String PP_CODE = pP_GEN_DASHBOARD.getPP_CODE();
			
			List<PP_GEN_DASHBOARD_TABLE> listPP_GEN_DASHBOARD_TABLE = rowSqlDao.listPP_GEN_DASHBOARD_TABLE(PP_CODE, BILL_CYCLE_CODE);
			model.addAttribute("listPP_GEN_DASHBOARD_TABLE", listPP_GEN_DASHBOARD_TABLE);
			
			
			List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown = rowSqlDao.listIC_PERIOD_MST_Dropdown();
			model.addAttribute("listIC_PERIOD_MST_Dropdown", listIC_PERIOD_MST_Dropdown);
			
			List<DrpDwn> listDrpDwnPP = rowSqlDao.listDrpDwnPP();
			model.addAttribute("listDrpDwnPP", listDrpDwnPP);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "PPGENDASHBOARD";
		}
		
		
		@GetMapping("/IC_DATAAVAIL_DASHBOARD_COM")
		public String IC_DATAAVAIL_DASHBOARD_COM(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
			
			
			String listlast_month_date = iconvDaoRafi.listlast_month_date();

			String date = listlast_month_date;
			
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);

			IC_DASHBOARD_DATA iC_DASHBOARD_DATA = new IC_DASHBOARD_DATA();
			iC_DASHBOARD_DATA.setBill(date);

			model.addAttribute("iC_DASHBOARD_DATA", iC_DASHBOARD_DATA);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "COMMON_DASHBOARD";
		}
		
		@PostMapping("/IC_DATAAVAIL_DASHBOARD_COM")
		public String IC_DATAAVAIL_DASHBOARD_COM(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model, IC_DASHBOARD_DATA iC_DASHBOARD_DATA) {

			
			ArrayList<Month_Dropdown> billList = iconvDaoRafi.m(officeCode);
			model.addAttribute("billList", billList);
			model.addAttribute("iC_DASHBOARD_DATA", iC_DASHBOARD_DATA);
			
			String hdr99 = "";

			String a = iC_DASHBOARD_DATA.getBill();
			String b = iC_DASHBOARD_DATA.getZone();
			String c = iC_DASHBOARD_DATA.getCircle();
			String g = iC_DASHBOARD_DATA.getDiv();
			String h = iC_DASHBOARD_DATA.getRAO();
			String d = iC_DASHBOARD_DATA.getLoc();
			String f = iC_DASHBOARD_DATA.getReport();

			Map<String, Object> result = getAllStatesJdbcCall524.withCatalogName("pkg_dist_DF_Dash_board")
					.withProcedureName("dpd_DF_GRAPH")
					.declareParameters(new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
					.execute(a, b, c, g,  d, officeCode,f, h);
	
			JSONObject json = new JSONObject(result);
			String fjfhdj = json.get("CUR_DATA").toString();
			JSONArray jsonArray = new JSONArray(fjfhdj);

			Map<String, Double> graphData1 = new TreeMap<>();
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				hdr99 = jsonData.optString("ORD");
				graphData1.put(jsonData.optString("USER_TYPE"), Double.valueOf(jsonData.optString("MOD")));
			}

			model.addAttribute("hdr99_graph", hdr99);
			model.addAttribute("chartData1", graphData1);
			
			List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH=rowSqlDao.listPP_GEN_DASHBOARD_GRAPH(a);
			
			Map<String, Double> graphData2 = new TreeMap<>();
			if(!listPP_GEN_DASHBOARD_GRAPH.isEmpty()) {
				graphData2.put("DATA_NOT_ENTERED",Double.valueOf(listPP_GEN_DASHBOARD_GRAPH.get(0).getDATA_NOT_ENTERED()) );
				graphData2.put("DATA_ENTERED",Double.valueOf(listPP_GEN_DASHBOARD_GRAPH.get(0).getDATA_ENTERED()) );
				
			}			

			model.addAttribute("chartData2", graphData2);
			
			
			List<PP_GEN_DASHBOARD_GRAPH> listIPP_GEN_DASHBOARD_GRAPH =rowSqlDao.listIPP_GEN_DASHBOARD_GRAPH(a);
			
			Map<String, Double> graphData3 = new TreeMap<>();
			if(!listIPP_GEN_DASHBOARD_GRAPH.isEmpty()) {
				graphData3.put("DATA_NOT_ENTERED",Double.valueOf(listIPP_GEN_DASHBOARD_GRAPH.get(0).getDATA_NOT_ENTERED()) );
				graphData3.put("DATA_ENTERED",Double.valueOf(listIPP_GEN_DASHBOARD_GRAPH.get(0).getDATA_ENTERED()) );
				
			}			

			model.addAttribute("chartData3", graphData3);
			
			List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX=rowSqlDao.listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX(a);
			
			Map<String, Double> graphData4 = new TreeMap<>();
			if(!listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX.isEmpty()) {
				graphData4.put("DATA_ENTERED",Double.valueOf(listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX.get(0).getDATA_ENTERED()) );
				
			}			

			model.addAttribute("chartData4", graphData4);
			
			
			List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST=rowSqlDao.listIC_DC_OF_ILLIGAL_USE_ST(a);
			
			Map<String, Double> graphData5 = new TreeMap<>();
			if(!listIC_DC_OF_ILLIGAL_USE_ST.isEmpty()) {
				graphData5.put("NO_OF_DC_LINE",Double.valueOf(listIC_DC_OF_ILLIGAL_USE_ST.get(0).getNO_OF_DC_LINE()) );
				graphData5.put("NO_OF_CASE_FILED",Double.valueOf(listIC_DC_OF_ILLIGAL_USE_ST.get(0).getNO_OF_CASE_FILED()) );
				//graphData5.put("FINE_REALISE",Double.valueOf(listIC_DC_OF_ILLIGAL_USE_ST.get(0).getFINE_REALISE()) );
			}			

			model.addAttribute("chartData5", graphData5);
			
			
			List<IC_RC_DC_ST> listIC_DC_RC=rowSqlDao.listIC_DC_RC(a);
			
			Map<String, Double> graphData6 = new TreeMap<>();
			if(!listIC_DC_RC.isEmpty()) {
				graphData6.put("NO_OF_DC_LINE",Double.valueOf(listIC_DC_RC.get(0).getNO_OF_DC_LINE()) );
				//graphData6.put("COLL_AGAINST_DC",Double.valueOf(listIC_DC_RC.get(0).getCOLL_AGAINST_DC()) );
				graphData6.put("NO_OF_RC_LINE",Double.valueOf(listIC_DC_RC.get(0).getNO_OF_RC_LINE()) );
				//graphData6.put("COLL_AGAINST_RC",Double.valueOf(listIC_DC_RC.get(0).getCOLL_AGAINST_RC()) );
			}			

			model.addAttribute("chartData6", graphData6);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "COMMON_DASHBOARD";
		}
		
		
		@GetMapping("/IC_DASHBOARD_IPP")
		public String IPP_GEN_DASHBOARD(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model) {
			
			List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown = rowSqlDao.listIC_PERIOD_MST_Dropdown();
			model.addAttribute("listIC_PERIOD_MST_Dropdown", listIC_PERIOD_MST_Dropdown);
			
			List<DrpDwn> listDrpDwnIPP = rowSqlDao.listDrpDwnIPP();
			model.addAttribute("listDrpDwnPP", listDrpDwnIPP);
			
			PP_GEN_DASHBOARD pP_GEN_DASHBOARD = new PP_GEN_DASHBOARD();
			model.addAttribute("pP_GEN_DASHBOARD", pP_GEN_DASHBOARD);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "IPP_GEN_DASHBOARD";
		}

		@PostMapping("/IC_DASHBOARD_IPP")
		public String IPP_GEN_DASHBOARD_Table(@CookieValue(value = "user_name", defaultValue = "") String user_name,
				@CookieValue(value = "officeCode", defaultValue = "") String officeCode, Model model, PP_GEN_DASHBOARD pP_GEN_DASHBOARD) {

			String BILL_CYCLE_CODE = pP_GEN_DASHBOARD.getPERIOD_CODE();
			String PP_CODE = pP_GEN_DASHBOARD.getPP_CODE();
			
			List<PP_GEN_DASHBOARD_TABLE> listIPP_GEN_DASHBOARD_TABLE = rowSqlDao.listIPP_GEN_DASHBOARD_TABLE(PP_CODE, BILL_CYCLE_CODE);
			model.addAttribute("listPP_GEN_DASHBOARD_TABLE", listIPP_GEN_DASHBOARD_TABLE);
			
			
			List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown = rowSqlDao.listIC_PERIOD_MST_Dropdown();
			model.addAttribute("listIC_PERIOD_MST_Dropdown", listIC_PERIOD_MST_Dropdown);
			
			List<DrpDwn> listDrpDwnIPP = rowSqlDao.listDrpDwnIPP();
			model.addAttribute("listDrpDwnPP", listDrpDwnIPP);
			
			String dynamicMenu = icDao.getDynamicMenu(user_name);
			model.addAttribute("dataHtml", dynamicMenu);

			return "IPP_GEN_DASHBOARD";
		}
		
}
