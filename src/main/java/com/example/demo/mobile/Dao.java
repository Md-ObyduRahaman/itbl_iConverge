package com.example.demo.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import oracle.jdbc.OracleTypes;

@Repository
public class Dao {
	
	
	  SimpleJdbcCall getAllStatesJdbcCall1;
	  SimpleJdbcCall getAllStatesJdbcCall2;
	  SimpleJdbcCall getAllStatesJdbcCall3;
	  SimpleJdbcCall getAllStatesJdbcCall4;
	  SimpleJdbcCall getAllStatesJdbcCall5;
	  SimpleJdbcCall getAllStatesJdbcCall6;
	  SimpleJdbcCall getAllStatesJdbcCall7;
	  SimpleJdbcCall getAllStatesJdbcCall8;
	  SimpleJdbcCall getAllStatesJdbcCall9;
	  SimpleJdbcCall getAllStatesJdbcCall10;
	  SimpleJdbcCall getAllStatesJdbcCall11;
	  SimpleJdbcCall getAllStatesJdbcCall12;
	  SimpleJdbcCall getAllStatesJdbcCall13;
	  SimpleJdbcCall getAllStatesJdbcCall14;
	  SimpleJdbcCall getAllStatesJdbcCall15;
	  SimpleJdbcCall getAllStatesJdbcCall16;
	  SimpleJdbcCall getAllStatesJdbcCall17;
	  SimpleJdbcCall getAllStatesJdbcCall18;
	  SimpleJdbcCall getAllStatesJdbcCall19;
	  SimpleJdbcCall getAllStatesJdbcCall20;
	  SimpleJdbcCall getAllStatesJdbcCall21;
	  SimpleJdbcCall getAllStatesJdbcCall22;
	  SimpleJdbcCall getAllStatesJdbcCall23;
	  SimpleJdbcCall getAllStatesJdbcCall24;
	  SimpleJdbcCall getAllStatesJdbcCall25;
	  SimpleJdbcCall getAllStatesJdbcCall26;
	  SimpleJdbcCall getAllStatesJdbcCall27;
	  SimpleJdbcCall getAllStatesJdbcCall28;
	  SimpleJdbcCall getAllStatesJdbcCall29;
	  SimpleJdbcCall getAllStatesJdbcCall30;
	  SimpleJdbcCall getAllStatesJdbcCall31;
	  SimpleJdbcCall getAllStatesJdbcCall32;
	  SimpleJdbcCall getAllStatesJdbcCall33;
	  SimpleJdbcCall getAllStatesJdbcCall34;
	  SimpleJdbcCall getAllStatesJdbcCall35;
	  
	  public Dao(DataSource dataSource) {
			
					this.getAllStatesJdbcCall1 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall2 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall3 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall4 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall5 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall6 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall7 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall8 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall9 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall10 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall11 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall12 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall13 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall14 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall15 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall16 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall17 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall18 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall19 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall20 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall21 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall22 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall23 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall24 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall25 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall26 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall27 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall28 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall29 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall30 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall31 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall32 = new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall33= new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall34= new SimpleJdbcCall(dataSource);
					this.getAllStatesJdbcCall35 = new SimpleJdbcCall(dataSource);
					}
	  
	
	  @Autowired
		private JdbcTemplate jdbcTemplate;
	  
	  public String login(String uid,String ps) {	
			Map<String, Object> result =
		    		getAllStatesJdbcCall1.withCatalogName("PKG_SELECT_USER").
		        withProcedureName("USER_LOGIN")
		            .declareParameters(
		                    new SqlOutParameter("CURSOR", OracleTypes.CURSOR))
		            .execute(uid,ps);
			JSONObject json = new JSONObject(result);
			String a=json.get("CUR_DATA").toString();
			return a;
		}
	  
	  
	  public List<Zone> zonelist(String office_code) {
			ArrayList<Zone> zonelist=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall2.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_Zone")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	zonelist.add(new
		    			Zone(jsonData.getString("ZONE_CODE"),jsonData.getString("ZONE_NAME")));
		    }

			
			return zonelist;		
		}
	  
	  
	  public List<Circle> circleList(String zone_code,String office_code) {
		  if(zone_code.equals("0")) {
			  zone_code=null;
		  }
			ArrayList<Circle> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall3.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_circle")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(zone_code,office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			Circle(jsonData.getString("CIRCLE_CODE"),jsonData.getString("CIRCLE_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  public List<Division> divList(String circle_code,String office_code) {
		  if(circle_code.equals("0")) {
			  circle_code=null;
		  }
			ArrayList<Division> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall4.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_div")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(circle_code,office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			Division(jsonData.getString("DIV_CODE"),jsonData.getString("DIV_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  public List<Location> locList(String circle_code,String div_code,String office_code) {
		  if(circle_code.equals("0")) {
			  circle_code=null;
		  }
		  
		  if(div_code.equals("0")) {
			  div_code=null;
		  }
			ArrayList<Location> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall5.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_location")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(circle_code,div_code,office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			Location(jsonData.getString("LOCATION_CODE"),jsonData.getString("LOCATION_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  
	  public List<ReportingLevel> reportingLevel(String office_code) {
			ArrayList<ReportingLevel> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall6.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_reporting_level")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			ReportingLevel(jsonData.getString("REPORT_LEVEL_CODE"),jsonData.getString("REPORT_LEVEL_DESC")));
		    }

			
			return list;		
		}
	  
	  
	  public List<BillCycle> billCycle(String office_code) {
			ArrayList<BillCycle> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall7.withCatalogName("pkg_dist_Dash_board").
		        withProcedureName("dpd_bill_cycle")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			BillCycle(jsonData.getString("BILL_CYCLE_CODE"),jsonData.getString("BILL_CYCLE_DESC")));
		    }

			
			return list;		
		}
	  
	  
	  
	  
	  public  List<DASHBOARD_DIST> SystemLossCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall8.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),
	    			jsonData.getString("SYS_LOSS"),null,null,jsonData.getString("NET_IMPORT_KWH"),
					null,null,jsonData.getString("BILLED_UNIT"),null,null));  
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  
	  public  List<DASHBOARD_DIST> SystemLossUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall9.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_Sys_loss_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),
	    			jsonData.getString("SYS_LOSS"),null,null,jsonData.getString("NET_IMPORT_KWH"),
					null,null,jsonData.getString("BILLED_UNIT"),null,null));  
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> CIRatioCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall10.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,
					jsonData.getString("CI_RATIO"),null,jsonData.getString("NET_IMPORT_KWH"),jsonData.getString("COLL_AMT"),
					jsonData.getString("BILLED_AMT"),
					jsonData.getString("BILLED_UNIT"),null,null));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> CIRatioUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall11.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CI_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,
					jsonData.getString("CI_RATIO"),null,jsonData.getString("NET_IMPORT_KWH"),jsonData.getString("COLL_AMT"),
					jsonData.getString("BILLED_AMT"),
					jsonData.getString("BILLED_UNIT"),null,null));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  
	  public  List<DASHBOARD_DIST> CBRatioCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall12.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
	    			jsonData.getString("CB_RATIO"),null,jsonData.getString("COLL_AMT"),
	    			jsonData.getString("BILLED_AMT"),
					null,null,null));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> CBRatioUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall13.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_CB_Ratio_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
	    			jsonData.getString("CB_RATIO"),null,jsonData.getString("COLL_AMT"),
	    			jsonData.getString("BILLED_AMT"),
					null,null,null));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  public  List<DASHBOARD_DIST> BilledUnitCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall14.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_cm")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),jsonData.getString("SYS_LOSS"),null,
					null,jsonData.getString("NET_IMPORT_KWH"),null,null,
					jsonData.getString("BILLED_UNIT"),null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  
	  public  List<DASHBOARD_DIST> BilledUnitUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall15.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_UNIT_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),jsonData.getString("SYS_LOSS"),null,
					null,jsonData.getString("NET_IMPORT_KWH"),null,null,
					jsonData.getString("BILLED_UNIT"),null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> BilledAmtCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall16.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_amt_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,null,null,jsonData.getString("BILLED_AMT"),
					null,null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> BilledAmtUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall17.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_BILLED_amt_UP")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,null,null,jsonData.getString("BILLED_AMT"),
					null,null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> CollectionAmtCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall18.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_COLL_amt_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,null,jsonData.getString("COLL_AMT"),null,
					null,null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST> CollectionAmtUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall19.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_COLL_amt_up")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,null,jsonData.getString("COLL_AMT"),null,
					null,null,null
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST>EQMonthCM(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall20.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_EQ_MONTH_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,jsonData.getString("NET_IMPORT_KWH"),null,jsonData.getString("BILLED_AMT"),null,jsonData.getString("EQ_MONTH"),
					jsonData.getString("REC_AMT")
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<DASHBOARD_DIST>EQMonthUpto(String month,String zone,String circle,String div,String loc,String officeCode,String reportCycle) {
		  if(zone.equals("0"))
				  zone=null;
		  
		  if(circle.equals("0"))
			  circle=null;
		  
		  if(div.equals("0"))
			  div=null;
		  
		  if(loc.equals("0"))
			  loc=null;
		  
		  ArrayList<DASHBOARD_DIST> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall21.withCatalogName("pkg_dist_Dash_board").
		    withProcedureName("dpd_EQ_MONTH_up")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(month,zone,circle,div,loc, officeCode,reportCycle);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new DASHBOARD_DIST(jsonData.getString("HDR"),jsonData.getString("LINEX"),null,null,
					null,jsonData.getString("NET_IMPORT_KWH"),null,jsonData.getString("BILLED_AMT"),null,jsonData.getString("EQ_MONTH"),
					jsonData.getString("REC_AMT")
					));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public List<BillCycle> billCycleGen(String office_code) {
			ArrayList<BillCycle> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall22.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_bill_cycle")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			BillCycle(jsonData.getString("BILL_CYCLE_CODE"),jsonData.getString("BILL_CYCLE_DESC")));
		    }

			
			return list;		
		}
	  
	  
	  
	  public List<FuelType> fuelTypeGen(String office_code) {
			ArrayList<FuelType> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall23.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_FUEL_TYPE")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			FuelType(jsonData.getString("FUEL_CODE"),jsonData.getString("FUEL_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  public List<ReportingLevel> reportingLevelGen(String office_code) {
			ArrayList<ReportingLevel> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall24.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_reporting_level")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			ReportingLevel(jsonData.getString("REPORT_LEVEL_CODE"),jsonData.getString("REPORT_LEVEL_DESC")));
		    }

			
			return list;		
		}
	  
	  
	  public List<GEN_AREA> GenArea(String office_code) {
			ArrayList<GEN_AREA> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall25.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_GEN_AREA")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			GEN_AREA(jsonData.getString("GEN_AREA_CODE"),jsonData.getString("GEN_AREA_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  public List<OWNER_TYPE> ownerType(String office_code) {
			ArrayList<OWNER_TYPE> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall26.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_PP_OWNER_type")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			OWNER_TYPE(jsonData.getString("OWNER_TYPE"),jsonData.getString("OWNER_TYPE_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  public List<SELECT_OWNER> select_owner(String office_code ,String owner_type) {
			ArrayList<SELECT_OWNER> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall27.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_PP_OWNER")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code,owner_type);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			SELECT_OWNER(jsonData.getString("OWNER_CODE"),jsonData.getString("OWNER_NAME")));
		    }

			
			return list;		
		}
	  
	  public List<TRANS_GRID> gridType(String office_code) {
			ArrayList<TRANS_GRID> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall28.withCatalogName("pkg_GEN_Dash_board").
		        withProcedureName("dpd_TRANS_GRID")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			TRANS_GRID(jsonData.getString("GRID_CODE"),jsonData.getString("GRID_DESC")));
		    }

			
			return list;		
		}
	  
	  
	  public  List<PowerPlant> powerplant(String officeCode,String fuelCode,String ownerType,String ownerCode,String gridCode,String genArea) {
		  if(fuelCode.equals("0"))
			  fuelCode=null;
		  
		  if(ownerType.equals("0"))
			  ownerType=null;
		  
		  if(ownerCode.equals("0"))
			  ownerCode=null;
		  
		  if(gridCode.equals("0"))
			  gridCode=null;
		    
		  if(genArea.equals("0"))
			  genArea=null;
		  
		  ArrayList<PowerPlant> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall29.withCatalogName("pkg_GEN_Dash_board").
		    withProcedureName("dpd_Power_plant")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(officeCode,fuelCode,ownerType,ownerCode,gridCode, genArea);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new PowerPlant(jsonData.getString("PP_CODE"),jsonData.getString("PP_NAME")));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  public  List<GenerationDash> genDashCM(String officeCode,String fuelCode,String ownerType,String gridCode,String ownerCode,String ppCode,String genArea,
			  String billcycle,String reportLevel) {
		  if(fuelCode.equals("0"))
			  fuelCode=null;
		  
		  if(ownerType.equals("0"))
			  ownerType=null;
		  
		  if(ownerCode.equals("0"))
			  ownerCode=null;
		  
		  if(gridCode.equals("0"))
			  gridCode=null;
		    
		  if(genArea.equals("0"))
			  genArea=null;
		  
		  if(ppCode.equals("0"))
			  ppCode=null;
		  
		  
		  ArrayList<GenerationDash> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall30.withCatalogName("pkg_GEN_Dash_board").
		    withProcedureName("dpd_PP_GEN_CM")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(officeCode,fuelCode,ownerType,gridCode,ownerCode,ppCode, genArea,billcycle,reportLevel);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new GenerationDash(jsonData.getString("HDR"),jsonData.getString("LINEX"),jsonData.getString("NET_GEN")));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }
	  
	  
	  public  List<GenerationDash> genDashUpto(String officeCode,String fuelCode,String ownerType,String gridCode,String ownerCode,String ppCode,String genArea,
			  String billcycle,String reportLevel) {
		  if(fuelCode.equals("0"))
			  fuelCode=null;
		  
		  if(ownerType.equals("0"))
			  ownerType=null;
		  
		  if(ownerCode.equals("0"))
			  ownerCode=null;
		  
		  if(gridCode.equals("0"))
			  gridCode=null;
		    
		  if(genArea.equals("0"))
			  genArea=null;
		  
		  if(ppCode.equals("0"))
			  ppCode=null;
		  
		  
		  ArrayList<GenerationDash> list=new ArrayList<>();	  
	  Map<String, Object> result =
				getAllStatesJdbcCall31.withCatalogName("pkg_GEN_Dash_board").
		    withProcedureName("dpd_PP_GEN_up")
		        .declareParameters(
		                new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		        .execute(officeCode,fuelCode,ownerType,gridCode,ownerCode,ppCode, genArea,billcycle,reportLevel);
		JSONObject json = new JSONObject(result);
	    String data=json.get("CUR_DATA").toString();
	    JSONArray jsonArray=new JSONArray(data);
	    for(int i=0;i<jsonArray.length();i++) {
	    	JSONObject jsonData=jsonArray.getJSONObject(i);
	    	
	    	list.add(new GenerationDash(jsonData.getString("HDR"),jsonData.getString("LINEX"),jsonData.getString("NET_GEN")));
	    }
	    System.out.println(list);
	    
	    return list;
	    
   
	    }  
	  public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> report4(String officeCode,
				String two) {
			ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

			Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("pkg_ES_circle_wise_com_stat")
					.withProcedureName("dpd_circle_wise_com_stat")
					.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

			JSONObject json = new JSONObject(result);
			String jesonString = json.get("CUR_DATA").toString();
			JSONArray jsonArray = new JSONArray(jesonString);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(jsonData.getString("TP1"),
						jsonData.getString("ZONE_NAME"), jsonData.getString("TP2"), jsonData.getString("CIRCLE_NAME"),
						jsonData.getString("NO_OF_ACTIVE_CONS"), jsonData.getString("IMPORT_MKWH"),
						jsonData.getString("SALE_MKWH"), jsonData.getString("DIST_SYS_LOSS"), "",
						jsonData.getString("NET_BILL_MTK"), jsonData.getString("NET_COLL_MTK"),
						jsonData.getString("CB_RATIO"), jsonData.getString("CI_RATIO"), jsonData.getString("BILL_RATE"),
						jsonData.getString("REC_AMT"), jsonData.getString("EQM")));
			}
			return showList;
		}
	  public List<DASHBOARD_REPORT> dash_report(String office_code, String parentId) {
			ArrayList<DASHBOARD_REPORT> list=new ArrayList<>();
		    Map<String, Object> result =
		    		getAllStatesJdbcCall33.withCatalogName("pkg_apps_Menu").
		        withProcedureName("dpd_apps_Report")
		            .declareParameters(
		                    new SqlOutParameter("results_cursor", OracleTypes.CURSOR))
		            .execute(office_code,parentId);
		    JSONObject json = new JSONObject(result);
		    String data=json.get("CUR_DATA").toString();
		    JSONArray jsonArray=new JSONArray(data);
		    for(int i=0;i<jsonArray.length();i++) {
		    	JSONObject jsonData=jsonArray.getJSONObject(i);
		    	list.add(new
		    			DASHBOARD_REPORT(jsonData.getString("MOD_ID"),jsonData.getString("SHORT_NAME")));
		    }

			
			return list;		
		}
	  
	  
	  
	  public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> report5(String officeCode,
				String two) {
			ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

			Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("pkg_ES_circle_wise_com_st_upto")
					.withProcedureName("dpd_circle_wise_com_stat_upto")
					.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

			JSONObject json = new JSONObject(result);
			String jesonString = json.get("CUR_DATA").toString();
			JSONArray jsonArray = new JSONArray(jesonString);

			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(jsonData.getString("TP1"),
						jsonData.getString("ZONE_NAME"), jsonData.getString("TP2"), jsonData.getString("CIRCLE_NAME"),
						jsonData.getString("NO_OF_ACTIVE_CONS"), jsonData.getString("IMPORT_MKWH"),
						jsonData.getString("SALE_MKWH"), jsonData.getString("DIST_SYS_LOSS"), "",
						jsonData.getString("NET_BILL_MTK"), jsonData.getString("NET_COLL_MTK"),
						jsonData.getString("CB_RATIO"), jsonData.getString("CI_RATIO"), jsonData.getString("BILL_RATE"),
						jsonData.getString("REC_AMT"), jsonData.getString("EQM")));
			}
			return showList;
		}
	  
	  public ArrayList<DpdBrebStatementDetail> report07(String officeCode,String month) {
			ArrayList<DpdBrebStatementDetail> dpdBrebStatementDetail = new ArrayList<>();

			Map<String, Object> result = getAllStatesJdbcCall33.withCatalogName("pkg_ES_BREB_STATEMENT_11_12")
					.withProcedureName("dpd_BREB_STATEMENT_detail")
					.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
					.execute(officeCode, month);
			JSONObject json = new JSONObject(result);
			String out = json.get("CUR_DATA").toString();
			JSONArray jsonArray = new JSONArray(out);
			if (jsonArray.length() > 0) {
				for (int i = 0; i < jsonArray.length(); i++) {
					JSONObject jsonData = jsonArray.getJSONObject(i);
					dpdBrebStatementDetail.add(new DpdBrebStatementDetail(jsonData.getString("TP"),
							jsonData.getString("LOCATION_NAME"), jsonData.getString("TP2"),
							jsonData.getString("CUSTOMER_NAME"), jsonData.getString("ENRG_UNIT"),
							jsonData.getString("PFC_UNIT"), jsonData.getString("BUS_LOSS"),
							jsonData.getString("TOTAL_UNIT"), jsonData.getString("ENRG_CHARGE"),
							jsonData.getString("PFC_CHARGE"), jsonData.getString("BUS_LOSS_CHARGE"),
							jsonData.getString("TOTAL_BILL"), jsonData.getString("TOTAL_COLL"),
							jsonData.getString("REC_PREV"), jsonData.getString("REC_CURR")));
				}
			}
			return dpdBrebStatementDetail;
		}
	  
}
