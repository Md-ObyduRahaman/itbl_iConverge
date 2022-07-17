package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.IC_CIRCLE_MST_Dropdown;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
	@Autowired
	ICONVDaoRafi iconvDao;
	@Autowired
	IConvergeDaoSurovi is;
	@Autowired
	RowSqlDao rawSQLDao;

	@GetMapping("/circle/{id}")
	public List<IC_CIRCLE_MST_R> getCircle(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("id") String id) {

		ArrayList<IC_CIRCLE_MST_R> circleList = new ArrayList<>();
		circleList = iconvDao.getCircleList(officeCode, id);

		return circleList;

	}

	@GetMapping("/div/{id}")
	public List<IC_DIST_DIV_MST> getDiv(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("id") String id) {

		ArrayList<IC_DIST_DIV_MST> divList = new ArrayList<>();
		divList = iconvDao.getdivList(officeCode, id);

		return divList;

	}

	@GetMapping("/loc/{id}/{div}")
	public List<IC_LOCATION_MASTER> getDiv(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("id") String id, @PathVariable("div") String div) {

		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDao.getlocList(officeCode, id, div);

		return locList;

	}
	
	@GetMapping("/loc/{id}")
	public List<IC_LOCATION_MASTER> getLoc(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("id") String id) {

		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDao.getlocList1(officeCode, id);

		return locList;

	}
	
	@GetMapping("/location/{x}/{y}")
	public List<IC_LOCATION_MASTER> getLoc(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x,@PathVariable("y") String y) {

		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		
		locList = iconvDao.getlocList2(officeCode, x, y);
		
		

		return locList;

	}
	
	@GetMapping("/location/{x}")
	public List<IC_LOCATION_MASTER> getLocation(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x) {

		ArrayList<IC_LOCATION_MASTER> locList = new ArrayList<>();
		locList = iconvDao.getlocList2(officeCode, x, null);
		
		

		return locList;

	}

	@GetMapping("/rao/{x}")
	public List<IC_RAO_INFO> getRao(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x) {

		ArrayList<IC_RAO_INFO> raoList = new ArrayList<>();
		raoList = iconvDao.getraoList(officeCode, x);
		
		

		return raoList;

	}
	@GetMapping("/rao/{x}/{y}")
	public List<IC_RAO_INFO> getRao(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x,@PathVariable("y") String y) {

		ArrayList<IC_RAO_INFO> raoList = new ArrayList<>();
		
		raoList = iconvDao.getraoList1(officeCode, x, y);
		
		

		return raoList;

	}
	@GetMapping("/rao/{x}/{y}/{z}")
	public List<IC_RAO_INFO> getRao(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x,@PathVariable("y") String y,@PathVariable("z") String z) {

		ArrayList<IC_RAO_INFO> raoList = new ArrayList<>();
		
		
		raoList = iconvDao.getraoList2(officeCode, x, y, z);
		
		

		return raoList;

	}
	@GetMapping("/rao/{x}/{y}/{z}/{w}")
	public List<IC_RAO_INFO> getRao(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("x") String x,@PathVariable("y") String y, @PathVariable("z") String z,@PathVariable("w") String w) {

		ArrayList<IC_RAO_INFO> raoList = new ArrayList<>();
		
		
		raoList = iconvDao.getraoList3(officeCode, x, y, z, w);
		

		return raoList;

	}

	@GetMapping("/owner/{id}")
	public List<IC_PP_OWNER> getownerList(@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("id") String id) {

		ArrayList<IC_PP_OWNER> ownerList = new ArrayList<>();
		ownerList = iconvDao.getownerList(officeCode, id);

		return ownerList;

	}

	@GetMapping("/activity/{id}")
	public List<ActivityList> getActivity(@PathVariable("id") String id) {

		ArrayList<ActivityList> activityList = new ArrayList<>();
		activityList = is.activityListShow(id);

		return activityList;

	}

	@GetMapping("/power_plant/{fuel}")
	public List<IC_POWER_PLANT> getlistIC_POWER_PLANT(
			@CookieValue(value = "officeCode", defaultValue = "") String officeCode,
			@PathVariable("fuel") String fuel1) {
		System.out.println(fuel1);

		String fuel = null;
		String owner_type = null;
		String owner = null;
		String gen = null;
		String grid = null;

		if (fuel1.contains("_")) {

			System.out.println("test");

			String string = fuel1;
			String[] parts = string.split("_");

			for (int i = 0; i < parts.length; i++) {

				if (parts.length == 2) {

					if (!parts[0].equals("0")) {
						fuel = parts[0];
					}

					owner_type = parts[1];

					break;
				} else if (parts.length == 3) {

					System.out.println("ex");

					if (!parts[0].equals("0")) {
						fuel = parts[0];
					}

					if (!parts[1].equals("0")) {
						owner_type = parts[1];
					}

					owner = parts[2];

					break;
				} else if (parts.length == 4) {

					System.out.println("ex");

					if (!parts[0].equals("0")) {
						fuel = parts[0];
					}

					if (!parts[1].equals("0")) {
						owner_type = parts[1];
					}
					if (!parts[2].equals("0")) {
						owner = parts[2];
					}

					gen = parts[3];

					break;
				}

				else {

					if (!parts[0].equals("0")) {
						fuel = parts[0];
					}
					if (!parts[1].equals("0")) {
						owner_type = parts[1];
					}
					if (!parts[2].equals("0")) {
						owner = parts[2];
					}

					if (!parts[3].equals("0")) {
						gen = parts[3];
					}

					grid = parts[4];

					break;
				}

			}

		} else {

			fuel = fuel1;

		}

		ArrayList<IC_POWER_PLANT> listIC_POWER_PLANT = new ArrayList<>();
		listIC_POWER_PLANT = iconvDao.getIC_POWER_PLANTList(officeCode, fuel, owner_type, owner, gen, grid);

		System.out.println(listIC_POWER_PLANT);

		return listIC_POWER_PLANT;

	}
	@GetMapping("/circlesql/{id}")
	public List<IC_CIRCLE_MST_Dropdown> listIC_CIRCLE_MST_Dropdown(@PathVariable("id") String id) {

		List<IC_CIRCLE_MST_Dropdown> listIC_CIRCLE_MST_Dropdown = new ArrayList<>();
		listIC_CIRCLE_MST_Dropdown = rawSQLDao.listIC_CIRCLE_MST_Dropdown(id);

		return listIC_CIRCLE_MST_Dropdown;

	}

}
