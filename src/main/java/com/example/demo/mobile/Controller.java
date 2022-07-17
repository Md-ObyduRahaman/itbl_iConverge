package com.example.demo.mobile;

import java.util.List;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/apps")
public class Controller {

	@Resource
	private Dao dao;

	@PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
	public String save(@RequestBody String a) {
		JSONObject json = new JSONObject(a);
		// a= new Login(a.getUSER_NAME(),a.getUSER_PASSWORD());
		return dao.login(json.getString("USER_NAME"), json.getString("USER_PASSWORD"));
	}

	@GetMapping("/zonelist/{officeCode}")
	public List<Zone> showEditForm1(@PathVariable(name = "officeCode") String officeCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<Zone> pakg = dao.zonelist(officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/circlelist/{zoneCode}/{officeCode}")
	public List<Circle> showEditForm2(@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "zoneCode") String zoneCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<Circle> pakg = dao.circleList(zoneCode, officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/divlist/{circleCode}/{officeCode}")
	public List<Division> showEditForm3(@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "circleCode") String circleCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<Division> pakg = dao.divList(circleCode, officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/location/{circleCode}/{divCode}/{officeCode}")
	public List<Location> showEditForm4(@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "circleCode") String circleCode, @PathVariable(name = "divCode") String divCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<Location> pakg = dao.locList(circleCode, divCode, officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/reportinglevel/{officeCode}")
	public List<ReportingLevel> showEditForm5(@PathVariable(name = "officeCode") String officeCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<ReportingLevel> pakg = dao.reportingLevel(officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/billcycle/{officeCode}")
	public List<BillCycle> showEditForm6(@PathVariable(name = "officeCode") String officeCode) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<BillCycle> pakg = dao.billCycle(officeCode);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/systemLossCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm7(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.SystemLossCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/systemLossUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm8(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.SystemLossUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CIRatioCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm9(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CIRatioCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CIRatioUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm10(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CIRatioUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CBRatioCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm11(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CBRatioCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CBRatioUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm12(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CBRatioUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/BilledUnitCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm13(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.BilledUnitCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/BilledUnitUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm14(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.BilledUnitUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/BilledAmtCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm15(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.BilledAmtCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/BilledAmtUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm16(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.BilledAmtUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CollectionAmtCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm17(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CollectionAmtCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/CollectionAmtUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm18(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.CollectionAmtUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/EQMonthCM/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm19(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.EQMonthCM(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}

	@GetMapping("/EQMonthUpto/{month}/{zone}/{circle}/{div}/{loc}/{officeCode}/{reportcycle}")
	public List<DASHBOARD_DIST> showEditForm20(@PathVariable(name = "month") String month,
			@PathVariable(name = "zone") String zone, @PathVariable(name = "circle") String circle,
			@PathVariable(name = "div") String div, @PathVariable(name = "loc") String loc,
			@PathVariable(name = "officeCode") String officeCode,
			@PathVariable(name = "reportcycle") String reportcycle) {
		ModelAndView mav = new ModelAndView("edit_form");
		List<DASHBOARD_DIST> pakg = dao.EQMonthUpto(month, zone, circle, div, loc, officeCode, reportcycle);
		mav.addObject("package", pakg);

		return pakg;

	}
	@GetMapping("/billcycleGen/{officeCode}")
	public List<BillCycle> showEditForm21(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<BillCycle> pakg = dao.billCycleGen(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	@GetMapping("/fuelTypeGen/{officeCode}")
	public List<FuelType> showEditForm22(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<FuelType> pakg = dao.fuelTypeGen(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	@GetMapping("/reportinglevelGen/{officeCode}")
	public List<ReportingLevel> showEditForm23(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<ReportingLevel> pakg = dao.reportingLevelGen(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	
	@GetMapping("/GenArea/{officeCode}")
	public List<GEN_AREA> showEditForm24(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<GEN_AREA> pakg = dao.GenArea(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	

	@GetMapping("/ownerType/{officeCode}")
	public List<OWNER_TYPE> showEditForm25(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<OWNER_TYPE> pakg = dao.ownerType(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	

	@GetMapping("/SelectOwner/{officeCode}/{ownerType}")
	public List<SELECT_OWNER> showEditForm26(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "ownerType") String ownerType) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<SELECT_OWNER> pakg = dao.select_owner(officeCode,ownerType);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	@GetMapping("/Grid/{officeCode}")
	public List<TRANS_GRID> showEditForm27(@PathVariable(name = "officeCode") String officeCode) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<TRANS_GRID> pakg = dao.gridType(officeCode);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	

	@GetMapping("/powerplant/{officeCode}/{fuel}/{ownerType}/{ownerCode}/{gridCode}/{genArea}")
	public List<PowerPlant>showEditForm28(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "fuel") String fuel,
			@PathVariable(name = "ownerType") String ownerType,@PathVariable(name = "ownerCode") String ownerCode,@PathVariable(name = "gridCode") String gridCode,
			@PathVariable(name = "genArea") String genArea) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<PowerPlant> pakg = dao.powerplant(officeCode,fuel,ownerType,ownerCode,gridCode,genArea);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	
	@GetMapping("/GenDashCM/{officeCode}/{fuel}/{ownerType}/{gridCode}/{ownerCode}/{ppCode}/{genArea}/{billcycle}/{reportlevel}")
	public List<GenerationDash>showEditForm29(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "fuel") String fuel,
			@PathVariable(name = "ownerType") String ownerType,@PathVariable(name = "gridCode") String gridCode,@PathVariable(name = "ownerCode") String ownerCode,@PathVariable(name = "ppCode") String ppCode,
			@PathVariable(name = "genArea") String genArea,@PathVariable(name = "billcycle") String billcycle,@PathVariable(name = "reportlevel") String reportlevel) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<GenerationDash> pakg = dao.genDashCM(officeCode,fuel,ownerType,gridCode,ownerCode,ppCode,genArea,billcycle,reportlevel);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	
	@GetMapping("/GenDashUpto/{officeCode}/{fuel}/{ownerType}/{gridCode}/{ownerCode}/{ppCode}/{genArea}/{billcycle}/{reportlevel}")
	public List<GenerationDash>showEditForm30(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "fuel") String fuel,
			@PathVariable(name = "ownerType") String ownerType,@PathVariable(name = "gridCode") String gridCode,@PathVariable(name = "ownerCode") String ownerCode,@PathVariable(name = "ppCode") String ppCode,
			@PathVariable(name = "genArea") String genArea,@PathVariable(name = "billcycle") String billcycle,@PathVariable(name = "reportlevel") String reportlevel) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<GenerationDash> pakg = dao.genDashUpto(officeCode,fuel,ownerType,gridCode,ownerCode,ppCode,genArea,billcycle,reportlevel);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	@GetMapping("/report04/{officeCode}/{month}")
	public List<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showEditForm31(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "month") String month) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> pakg = dao.report4(officeCode,month);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	@GetMapping("/reportDash/{officeCode}/{parentId}")
	public List<DASHBOARD_REPORT> showEditForm32(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "parentId") String parentId) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<DASHBOARD_REPORT> pakg = dao.dash_report(officeCode,parentId);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	@GetMapping("/report05/{officeCode}/{month}")
	public List<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showEditForm33(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "month") String month) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> pakg = dao.report5(officeCode,month);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
	
	
	

	@GetMapping("/report07/{officeCode}/{month}")
	public List<DpdBrebStatementDetail> showEditForm34(@PathVariable(name = "officeCode") String officeCode,@PathVariable(name = "month") String month) {
	    ModelAndView mav = new ModelAndView("edit_form");
	    List<DpdBrebStatementDetail> pakg = dao.report07(officeCode,month);
	    mav.addObject("package", pakg);
	     
	    return pakg;
	    
	}
}
