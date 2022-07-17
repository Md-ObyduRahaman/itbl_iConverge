package com.example.demo;

import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;

@Repository
public class ICONVDaoRafi {

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
	SimpleJdbcCall getAllStatesJdbcCall36;
	SimpleJdbcCall getAllStatesJdbcCall37;
	SimpleJdbcCall getAllStatesJdbcCall38;
	SimpleJdbcCall getAllStatesJdbcCall39;

	SimpleJdbcCall getAllStatesJdbcCall40;
	SimpleJdbcCall getAllStatesJdbcCall41;
	SimpleJdbcCall getAllStatesJdbcCall42;
	SimpleJdbcCall getAllStatesJdbcCall43;
	SimpleJdbcCall getAllStatesJdbcCall44;

	SimpleJdbcCall getAllStatesJdbcCall45;
	SimpleJdbcCall getAllStatesJdbcCall46;
	SimpleJdbcCall getAllStatesJdbcCall47;
	SimpleJdbcCall getAllStatesJdbcCall48;
	SimpleJdbcCall getAllStatesJdbcCall49;

	SimpleJdbcCall getAllStatesJdbcCall50;
	SimpleJdbcCall getAllStatesJdbcCall51;
	SimpleJdbcCall getAllStatesJdbcCall52;
	SimpleJdbcCall getAllStatesJdbcCall53;
	SimpleJdbcCall getAllStatesJdbcCall54;
	SimpleJdbcCall getAllStatesJdbcCall55;
	SimpleJdbcCall getAllStatesJdbcCall56;
	SimpleJdbcCall getAllStatesJdbcCall57;
	SimpleJdbcCall getAllStatesJdbcCall58;
	SimpleJdbcCall getAllStatesJdbcCall59;

	SimpleJdbcCall getAllStatesJdbcCall60;
	SimpleJdbcCall getAllStatesJdbcCall61;
	SimpleJdbcCall getAllStatesJdbcCall62;
	SimpleJdbcCall getAllStatesJdbcCall63;
	SimpleJdbcCall getAllStatesJdbcCall64;
	
	
	
	SimpleJdbcCall getAllStatesJdbcCall600;
	SimpleJdbcCall getAllStatesJdbcCall601;
	SimpleJdbcCall getAllStatesJdbcCall602;
	SimpleJdbcCall getAllStatesJdbcCall603;
	SimpleJdbcCall getAllStatesJdbcCall604;
	SimpleJdbcCall getAllStatesJdbcCall605;
	SimpleJdbcCall getAllStatesJdbcCall606;
	SimpleJdbcCall getAllStatesJdbcCall607;
	SimpleJdbcCall getAllStatesJdbcCall608;
	SimpleJdbcCall getAllStatesJdbcCall609;
	SimpleJdbcCall getAllStatesJdbcCall610;
	SimpleJdbcCall getAllStatesJdbcCall611;
	SimpleJdbcCall getAllStatesJdbcCall612;
	SimpleJdbcCall getAllStatesJdbcCall613;
	SimpleJdbcCall getAllStatesJdbcCall614;
	SimpleJdbcCall getAllStatesJdbcCall615;
	
	
	SimpleJdbcCall getAllStatesJdbcCall700;
	SimpleJdbcCall getAllStatesJdbcCall701;
	SimpleJdbcCall getAllStatesJdbcCall540;
	
	
	

//	pacakge name start
	SimpleJdbcCall getAllStatesJdbcCall100;
//	pacakge name end
	
	
	SimpleJdbcCall getAllStatesJdbcCall5400;
	SimpleJdbcCall getAllStatesJdbcCall5401;
	SimpleJdbcCall getAllStatesJdbcCall5402;
	SimpleJdbcCall getAllStatesJdbcCall5403;
	SimpleJdbcCall getAllStatesJdbcCall5404;
	SimpleJdbcCall getAllStatesJdbcCall5405;
	SimpleJdbcCall getAllStatesJdbcCall5406;
	SimpleJdbcCall getAllStatesJdbcCall5407;
	SimpleJdbcCall getAllStatesJdbcCall5408;

	public ICONVDaoRafi(DataSource dataSource) {

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
		this.getAllStatesJdbcCall33 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall34 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall35 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall36 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall37 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall38 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall39 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall40 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall41 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall42 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall43 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall44 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall45 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall46 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall47 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall48 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall49 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall50 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall51 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall52 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall53 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall54 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall55 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall56 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall57 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall58 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall59 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall60 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall61 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall62 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall63 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall64 = new SimpleJdbcCall(dataSource);
//		pacakge name start
		this.getAllStatesJdbcCall100 = new SimpleJdbcCall(dataSource);
//		pacakge name end

		this.getAllStatesJdbcCall600 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall601 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall602 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall603 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall604 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall605 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall606 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall607 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall608 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall609 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall610 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall611= new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall612 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall613 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall614 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall615 = new SimpleJdbcCall(dataSource);
		
		this.getAllStatesJdbcCall700 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall701 = new SimpleJdbcCall(dataSource);
		
		
		
		
		
		this.getAllStatesJdbcCall540 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5400 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5401 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5402 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5403 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5404 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5405 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5406 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5407 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5408 = new SimpleJdbcCall(dataSource);
		
	}

//	ic misc bill type list starts 

	public ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE() {

		ArrayList<IC_MISC_BILL_TYPE> listIC_MISC_BILL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//	    System.out.println("npnp");
//		System.out.println(result);
//		
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_MISC_BILL_TYPE.add(new IC_MISC_BILL_TYPE(jsonData.optString("MSC_BILL_TYPE_CODE"),
					jsonData.optString("MSC_BILL_TYPE_NAME"), jsonData.optString("GROSS_FLAG"),
					jsonData.optString("STATUS"), jsonData.optString("MSC_BILL_TYPE_ID")));
		}

//	    System.out.println("npnp");
//	    System.out.println(listIC_FUEL_TYPE);
		return listIC_MISC_BILL_TYPE;
	}

//	ic misc bill type list ends 

	// ic misc bill type insert starts

	public void insertICMiscBillType(IC_MISC_BILL_TYPE ic_misc_bill_type,String user_name) {

//		System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_misc_bill_type.getMSC_BILL_TYPE_CODE();
		String b = ic_misc_bill_type.getMSC_BILL_TYPE_NAME();
		String c = ic_misc_bill_type.getGROSS_FLAG();
		String d = ic_misc_bill_type.getSTATUS();

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c,user_name, d);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println("TEST");
//	System.out.println(out);   

	}

	// ic misc bill type insert ends

//	ic misc bill type single starts 

	public IC_MISC_BILL_TYPE singleIC_MISC_BILL_TYPE(int id) {

		IC_MISC_BILL_TYPE singleIC_MISC_BILL_TYPE = new IC_MISC_BILL_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//	    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_MISC_BILL_TYPE = new IC_MISC_BILL_TYPE(jsonData.optString("MSC_BILL_TYPE_CODE"),
					jsonData.optString("MSC_BILL_TYPE_NAME"), jsonData.optString("GROSS_FLAG"),
					jsonData.optString("STATUS"), jsonData.optString("MSC_BILL_TYPE_ID"));
		}

//	    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_MISC_BILL_TYPE;
	}

//	ic misc bill type single ends

	// ic misc bill type update starts

	public void editICMiscBillType(IC_MISC_BILL_TYPE ic_misc_bill_type,String user_name) {

//		System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_misc_bill_type.getMSC_BILL_TYPE_CODE();
		String b = ic_misc_bill_type.getMSC_BILL_TYPE_NAME();
		String c = ic_misc_bill_type.getGROSS_FLAG();
		String d = ic_misc_bill_type.getSTATUS();

		int e = Integer.valueOf(ic_misc_bill_type.getMSC_BILL_TYPE_ID());

//		SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
//
//		String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c,user_name, d, e);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic misc bill type update ends

	// ic misc bill type delete starts

	public void deleteICMiscBillType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_BILL_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

//	System.out.println(out);   

	}

	// ic misc bill type delete ends

//		ic fuel type list starts 

	public ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE() {

		ArrayList<IC_FUEL_TYPE> listIC_FUEL_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_FUEL_TYPE.add(new IC_FUEL_TYPE(jsonData.optString("FUEL_CODE"), jsonData.optString("FUEL_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("UNIT"), jsonData.optString("FUEL_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_FUEL_TYPE;
	}

//		ic fuel type list ends 

	// ic fuel type insert starts

	public void insertICFuelType(IC_FUEL_TYPE ic_fuel_type,String user_name) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_fuel_type.getFUEL_CODE();
		String b = ic_fuel_type.getFUEL_NAME();
		String c = ic_fuel_type.getSTATUS();
		String d = ic_fuel_type.getUNIT();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name, c, d);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// ic fuel types insert ends

//		ic fuel types single starts 

	public IC_FUEL_TYPE singleIC_FUEL_TYPE(int id) {

		IC_FUEL_TYPE singleIC_FUEL_TYPE = new IC_FUEL_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_FUEL_TYPE = new IC_FUEL_TYPE(jsonData.optString("FUEL_CODE"), jsonData.optString("FUEL_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("UNIT"), jsonData.optString("FUEL_ID"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_FUEL_TYPE;
	}

//		ic fuel types single ends

	// ic fuel types type update starts

	public void editICFuelType(IC_FUEL_TYPE ic_fuel_type,String user_name) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);
		String a = ic_fuel_type.getFUEL_CODE();
		String b = ic_fuel_type.getFUEL_NAME();
		String c = ic_fuel_type.getSTATUS();
		String d = ic_fuel_type.getUNIT();
		int e = Integer.valueOf(ic_fuel_type.getFUEL_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name, c, d, e);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic fuel types update ends

	// ic fuel types delete starts

	public void deleteICFuelType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("DATA_PKG")
				.withProcedureName("IC_FUEL_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic fuel types delete ends

//		IC_PP_OWNER_TYPE list starts 

	public ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE() {

		ArrayList<IC_PP_OWNER_TYPE> listIC_PP_OWNER_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PP_OWNER_TYPE
					.add(new IC_PP_OWNER_TYPE(jsonData.optString("OWNER_TYPE_ID"), jsonData.optString("OWNER_TYPE"),
							jsonData.optString("OWNER_TYPE_NAME"), jsonData.optString("SHORT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PP_OWNER_TYPE;
	}

//		IC_PP_OWNER_TYPE list ends 

	// IC_PP_OWNER_TYPE insert starts

	public void insertICPPOwnerType(IC_PP_OWNER_TYPE ic_pp_owner_type,String user_name) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_pp_owner_type.getOWNER_TYPE();
		String b = ic_pp_owner_type.getOWNER_TYPE_NAME();
		String c = ic_pp_owner_type.getSHORT_NAME();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name, c);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE insert ends

//		IC_PP_OWNER_TYPE single starts 

	public IC_PP_OWNER_TYPE singleIC_PP_OWNER_TYPE(int id) {

		IC_PP_OWNER_TYPE singleIC_PP_OWNER_TYPE = new IC_PP_OWNER_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_PP_OWNER_TYPE = new IC_PP_OWNER_TYPE(jsonData.optString("OWNER_TYPE_ID"),
					jsonData.optString("OWNER_TYPE"), jsonData.optString("OWNER_TYPE_NAME"),
					jsonData.optString("SHORT_NAME"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_PP_OWNER_TYPE;
	}

//		IC_PP_OWNER_TYPE single ends

	// IC_PP_OWNER_TYPE type update starts

	public void editICPPOwnerType(IC_PP_OWNER_TYPE ic_pp_owner_type,String user_name) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_pp_owner_type.getOWNER_TYPE();
		String b = ic_pp_owner_type.getOWNER_TYPE_NAME();
		String c = ic_pp_owner_type.getSHORT_NAME();
		int d = Integer.valueOf(ic_pp_owner_type.getOWNER_TYPE_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name, c, d);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE update ends

	// IC_PP_OWNER_TYPEdelete starts

	public void deleteICPPOwnerType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER_TYPE delete ends

//		IC_PP_OWNER  list starts 

	public ArrayList<IC_PP_OWNER> listIC_PP_OWNER() {

		ArrayList<IC_PP_OWNER> listIC_PP_OWNER = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PP_OWNER.add(new IC_PP_OWNER(jsonData.optString("OWNER_CODE"), jsonData.optString("OWNER_NAME"),
					jsonData.optString("OWNER_TYPE"), jsonData.optString("OWNER_TYPE_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("SHORT_NAME"), jsonData.optString("PP_OWNER_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PP_OWNER;
	}

//		IC_PP_OWNER list ends 

	// IC_PP_OWNER insert starts

	public void insertICPPOwner(IC_PP_OWNER ic_pp_owner,String user_name) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_pp_owner.getOWNER_CODE();
		String b = ic_pp_owner.getOWNER_NAME();
		String c = ic_pp_owner.getOWNER_TYPE();
		String d = ic_pp_owner.getSTATUS();
		String e = ic_pp_owner.getSHORT_NAME();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c,user_name, d, e);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// IC_PP_OWNER insert ends

//		IC_PP_OWNER single starts 

	public IC_PP_OWNER singleIC_PP_OWNER(int id) {

		IC_PP_OWNER singleIC_PP_OWNER = new IC_PP_OWNER();

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_PP_OWNER = new IC_PP_OWNER(jsonData.optString("OWNER_CODE"), jsonData.optString("OWNER_NAME"),
					jsonData.optString("OWNER_TYPE"), null, jsonData.optString("STATUS"),
					jsonData.optString("SHORT_NAME"), jsonData.optString("PP_OWNER_ID"));
		}

		System.out.println("ICONV");
		System.out.println(singleIC_PP_OWNER);
		return singleIC_PP_OWNER;
	}

//		IC_PP_OWNER single ends

	// IC_PP_OWNER update starts

	public void editICPPOwner(IC_PP_OWNER ic_pp_owner,String user_name) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_pp_owner.getOWNER_CODE();
		String b = ic_pp_owner.getOWNER_NAME();
		String c = ic_pp_owner.getOWNER_TYPE();
		String d = ic_pp_owner.getSTATUS();
		String e = ic_pp_owner.getSHORT_NAME();

		int f = Integer.valueOf(ic_pp_owner.getPP_OWNER_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c,user_name, d, e, f);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out); 

	}

	// IC_PP_OWNER update ends

	// IC_PP_OWNER delete starts

	public void deleteICPPOwner(int id) {

		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PP_OWNER_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_PP_OWNER delete ends

//		ic line type list starts 

	public ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE() {

		ArrayList<IC_LINE_TYPE> listIC_LINE_TYPE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LINE_TYPE.add(new IC_LINE_TYPE(jsonData.optString("LINE_TYPE"), jsonData.optString("LINE_TYPE_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("LINE_TYPE_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_LINE_TYPE;
	}

//		ic line type  list ends 

	// ic line type insert starts

	public void insertICLineType(IC_LINE_TYPE ic_line_type,String user_name) {

//			System.out.println(pkg_mst);
		// System.out.println(sfmodel);
		String a = ic_line_type.getLINE_TYPE();
		String b = ic_line_type.getLINE_TYPE_NAME();
		String c = ic_line_type.getSTATUS();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name,c);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("TEST");
//		System.out.println(out);   

	}

	// ic line type insert ends

//		ic line type single starts 

	public IC_LINE_TYPE singleIC_LINE_TYPE(int id) {

		IC_LINE_TYPE singleIC_LINE_TYPE = new IC_LINE_TYPE();

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_LINE_TYPE = new IC_LINE_TYPE(jsonData.optString("LINE_TYPE"), jsonData.optString("LINE_TYPE_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("LINE_TYPE_ID"));
		}

//		    System.out.println(singleMISC_BILL_TYPE);
		return singleIC_LINE_TYPE;
	}

//		ic line type single ends

	// ic line type update starts

	public void editICLineType(IC_LINE_TYPE ic_line_type,String user_name) {

//			System.out.println(misc_bill_type);
		// System.out.println(sfmodel);

		String a = ic_line_type.getLINE_TYPE();
		String b = ic_line_type.getLINE_TYPE_NAME();
		String c = ic_line_type.getSTATUS();

		int d = Integer.valueOf(ic_line_type.getLINE_TYPE_ID());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b,user_name, c, d);

		JSONObject json = new JSONObject(result);

//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out); 

	}

	// ic line type update ends

	// ic line type delete starts

	public void deleteICLineType(int id) {

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LINE_TYPE_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// ic line type delete ends

//		IC_PERIOD_MST list starts 

	public ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST() {

		ArrayList<IC_PERIOD_MST> listIC_PERIOD_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("DATA_PKG")
				.withProcedureName("IC_PERIOD_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_PERIOD_MST.add(new IC_PERIOD_MST(jsonData.optString("YEAR_CODE"), jsonData.optString("PERIOD_CODE"),
					jsonData.optString("PERIOD_DESC"), jsonData.optString("PR_ID")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_PERIOD_MST;
	}

//		IC_PERIOD_MST type list ends 

//		IC_LOCATION_MASTER list starts 

	public ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER() {

		ArrayList<IC_LOCATION_MASTER> listIC_LOCATION_MASTER = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOCATION_MASTER_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_LOCATION_MASTER.add(
					new IC_LOCATION_MASTER(jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_LOCATION_MASTER;
	}

//		IC_LOCATION_MASTER list ends 

//		IC_LOC_MOD list starts 

	public ArrayList<IC_LOC_MOD> a(int z) {

		ArrayList<IC_LOC_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall27.withCatalogName("DATA_PKG").withProcedureName("IC_LOC_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_LOC_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					f.optString("LOCATION_NAME"), f.optString("NET_IMPORT_KWH"), f.optString("NET_GEN_KWH"),
					f.optString("STATUS"), f.optString("SYS_LOSS"), f.optString("CI_RATIO"),
					f.optString("SYS_LOSS_WO_REB"), f.optString("CI_RATIO_WO_REB"), f.optString("BILLING_RATE"),
					f.optString("LOC_MOD_ID")));
		}

		System.out.println("GGG");
		System.out.println(b);

		return b;

	}

//		IC_LOC_MOD list ends 

	// IC_LOC_MOD insert starts

	public void insertICLocMod(IC_LOC_MOD ic_loc_mod,String user_name) {


		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_loc_mod.getBILL_CYCLE_CODE(), ic_loc_mod.getLOCATION_CODE(), ic_loc_mod.getNET_IMPORT_KWH(), ic_loc_mod.getNET_GEN_KWH(),user_name, ic_loc_mod.getSTATUS(),
						ic_loc_mod.getSYS_LOSS(), ic_loc_mod.getCI_RATIO(), ic_loc_mod.getSYS_LOSS_WO_REB(),
						ic_loc_mod.getCI_RATIO_WO_REB(), ic_loc_mod.getBILLING_RATE());

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("mhhh");
		System.out.println(out);

	}

	// IC_LOC_MOD insert ends

//		IC_LOC_MOD  single starts 

	public IC_LOC_MOD singleIC_LOC_MOD(int id) {

		IC_LOC_MOD singleIC_LOC_MOD = new IC_LOC_MOD();

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_LOC_MOD = new IC_LOC_MOD(jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("LOCATION_CODE"), null, jsonData.optString("NET_IMPORT_KWH"),
					jsonData.optString("NET_GEN_KWH"), jsonData.optString("STATUS"), jsonData.optString("SYS_LOSS"),
					jsonData.optString("CI_RATIO"), jsonData.optString("SYS_LOSS_WO_REB"),
					jsonData.optString("CI_RATIO_WO_REB"), jsonData.optString("BILLING_RATE"), null);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_LOC_MOD;
	}

//		IC_LOC_MOD  single ends 

	// IC_LOC_MOD update starts

	public void editICLocMod(IC_LOC_MOD ic_loc_mod,String user_name) {


		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_loc_mod.getBILL_CYCLE_CODE(), ic_loc_mod.getLOCATION_CODE(), ic_loc_mod.getNET_IMPORT_KWH(), ic_loc_mod.getNET_GEN_KWH(),user_name, ic_loc_mod.getSTATUS(),
						ic_loc_mod.getSYS_LOSS(), ic_loc_mod.getCI_RATIO(), ic_loc_mod.getSYS_LOSS_WO_REB(),
						ic_loc_mod.getCI_RATIO_WO_REB(), ic_loc_mod.getBILLING_RATE(), ic_loc_mod.getLOC_MOD_ID());

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_LOC_MOD update ends

	// IC_LOC_MOD delete starts

	public void deleteICLocMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall31.withCatalogName("DATA_PKG")
				.withProcedureName("IC_LOC_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_LOC_MOD delete ends

//		IC_SECT_WISE_MOD list starts 

	public ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST() {

		ArrayList<IC_SECTOR_MST> listIC_SECTOR_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall32.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECTOR_MST_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_SECTOR_MST.add(new IC_SECTOR_MST(jsonData.optString("SECT_CODE"), jsonData.optString("SECT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_SECTOR_MST;
	}

//		IC_LOCATION_MASTER list ends 

//		IC_SECT_WISE_MOD list starts 

	public ArrayList<IC_SECT_WISE_MOD> g(String z, String o) {

		ArrayList<IC_SECT_WISE_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall33.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_SECT_WISE_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					f.optString("LOCATION_NAME"), f.optString("SECT_CODE"), f.optString("SECT_NAME"),
					f.optString("BILLED_AMT"), f.optString("COLL_AMT"), f.optString("REC_AMT"), f.optString("EQ_MONTH"),
					f.optString("SECT_MOD_ID")

			));
		}

		System.out.println("GGG");
		System.out.println(b);

		return b;

	}

//		IC_SECT_WISE_MOD list ends 

//		//IC_SECT_WISE_MOD  insert starts

	public void insertICSectWiseMod(IC_SECT_WISE_MOD ic_sect_wise_mod,String user_name) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_sect_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_sect_wise_mod.getLOCATION_CODE();
		String c = ic_sect_wise_mod.getSECT_CODE();

		int d = Integer.valueOf(ic_sect_wise_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_sect_wise_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_sect_wise_mod.getREC_AMT());
		int g = Integer.valueOf(ic_sect_wise_mod.getEQ_MONTH());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall34.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f,user_name, g);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("mhhh");
		System.out.println(out);

	}

//		//IC_SECT_WISE_MOD  insert ends

//		IC_SECT_WISE_MOD  single starts 

	public IC_SECT_WISE_MOD singleIC_SECT_WISE_MOD(int id) {

		IC_SECT_WISE_MOD singleIC_SECT_WISE_MOD = new IC_SECT_WISE_MOD();

		Map<String, Object> result = getAllStatesJdbcCall35.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_SECT_WISE_MOD = new IC_SECT_WISE_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					null, f.optString("SECT_CODE"), null, f.optString("BILLED_AMT"), f.optString("COLL_AMT"),
					f.optString("REC_AMT"), f.optString("EQ_MONTH"), f.optString("SECT_MOD_ID")

			);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_SECT_WISE_MOD;
	}

//		//IC_SECT_WISE_MOD  single ends

	// IC_SECT_WISE_MOD update starts

	public void editICSectWiseMod(IC_SECT_WISE_MOD ic_sect_wise_mod,String user_name) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_sect_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_sect_wise_mod.getLOCATION_CODE();
		String c = ic_sect_wise_mod.getSECT_CODE();

		int d = Integer.valueOf(ic_sect_wise_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_sect_wise_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_sect_wise_mod.getREC_AMT());
		int g = Integer.valueOf(ic_sect_wise_mod.getEQ_MONTH());

		int h = Integer.valueOf(ic_sect_wise_mod.getSECT_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall36.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f,user_name, g, h);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_SECT_WISE_MOD update ends

	// IC_SECT_WISE_MOD delete starts

	public void deleteICSectWiseMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall37.withCatalogName("DATA_PKG")
				.withProcedureName("IC_SECT_WISE_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_SECT_WISE_MOD delete ends

//		IC_MISC_MOD list starts 

	public ArrayList<IC_MISC_MOD> d(String z, String o) {

		ArrayList<IC_MISC_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall38.withCatalogName("DATA_PKG").withProcedureName("IC_MISC_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_MISC_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					f.optString("LOCATION_NAME"), f.optString("MSC_TYPE_CODE"), f.optString("MSC_BILL_TYPE_NAME"),
					f.optString("BILLED_AMT"), f.optString("COLL_AMT"), f.optString("REC_AMT"),
					f.optString("MSC_MOD_ID")

			));
		}

//			System.out.println("GGG");
//			System.out.println(b);

		return b;

	}

//		IC_MISC_MOD list ends

//		IC_CAT_WISE_MOD list starts 

	public ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE() {

		ArrayList<IC_USAGE_CAT_CODE> listIC_USAGE_CAT_CODE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("DATA_PKG")
				.withProcedureName("IC_USAGE_CAT_CODE_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
//		    System.out.println("npnp");
//			System.out.println(result);
//			
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USAGE_CAT_CODE.add(
					new IC_USAGE_CAT_CODE(jsonData.optString("USAGE_CAT_CODE"), jsonData.optString("USAGE_CAT_NAME")));
		}

//		    System.out.println("npnp");
//		    System.out.println(listIC_FUEL_TYPE);
		return listIC_USAGE_CAT_CODE;
	}

//		IC_USAGE_CAT_CODE list ends 

//		IC_CAT_WISE_MOD list starts 

	public ArrayList<IC_CAT_WISE_MOD> w(String z, String o) {

		ArrayList<IC_CAT_WISE_MOD> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall40.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(z, o);

//			System.out.println(c);

		JSONObject j = new JSONObject(c);
//			System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//			System.out.println(d);

		JSONArray e = new JSONArray(d);

//			System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_CAT_WISE_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					f.optString("LOCATION_NAME"), f.optString("USAGE_CAT_CODE"), f.optString("USAGE_CAT_NAME"),
					f.optString("NEW_CONS"), f.optString("PD_CONS"), f.optString("TOT_CONS"), f.optString("TD_CONS"),
					f.optString("ACTIVE_CONS"), f.optString("BILLED_CONS"), f.optString("BILLED_UNIT"),
					f.optString("BILLED_AMT"), f.optString("COLL_AMT"), f.optString("REC_AMT"),
					f.optString("BILLING_RATE"), f.optString("EQ_MONTH"), f.optString("CAT_MOD_ID")

			));
		}

//			System.out.println("GGG");
//			System.out.println(b);

		return b;

	}

//		IC_CAT_WISE_MOD list ends

//		//IC_CAT_WISE_MOD  insert starts

	public void insertICCatWiseMod(IC_CAT_WISE_MOD ic_cat_wise_mod,String user_name) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_cat_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_cat_wise_mod.getLOCATION_CODE();
		String c = ic_cat_wise_mod.getUSAGE_CAT_CODE();
		String d = !ic_cat_wise_mod.getNEW_CONS().equals("")?ic_cat_wise_mod.getNEW_CONS():"0";
		String e = !ic_cat_wise_mod.getPD_CONS().equals("")?ic_cat_wise_mod.getPD_CONS():"0";
		String f = !ic_cat_wise_mod.getTOT_CONS().equals("")?ic_cat_wise_mod.getTOT_CONS():"0";
		String g = !ic_cat_wise_mod.getTD_CONS().equals("")?ic_cat_wise_mod.getTD_CONS():"0";
		String h = !ic_cat_wise_mod.getACTIVE_CONS().equals("")?ic_cat_wise_mod.getACTIVE_CONS():"0";
		String i = !ic_cat_wise_mod.getBILLED_CONS().equals("")?ic_cat_wise_mod.getBILLED_CONS():"0";
		String j = !ic_cat_wise_mod.getBILLED_UNIT().equals("")?ic_cat_wise_mod.getBILLED_UNIT():"0";
		String k = !ic_cat_wise_mod.getBILLED_AMT().equals("")?ic_cat_wise_mod.getBILLED_AMT():"0";
		String l = !ic_cat_wise_mod.getCOLL_AMT().equals("")?ic_cat_wise_mod.getCOLL_AMT():"0";
		String m = !ic_cat_wise_mod.getREC_AMT().equals("")?ic_cat_wise_mod.getREC_AMT():"0";
		String n = !ic_cat_wise_mod.getBILLING_RATE().equals("")?ic_cat_wise_mod.getBILLING_RATE():"0";
		String o = !ic_cat_wise_mod.getEQ_MONTH().equals("")?ic_cat_wise_mod.getEQ_MONTH():"0";

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall45.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j, k, l, m,user_name, n, o);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

		System.out.println("humm");
		System.out.println(out);

	}

//		//IC_CAT_WISE_MOD  insert ends

//		IC_CAT_WISE_MOD  single starts 

//		
	public IC_CAT_WISE_MOD singleIC_CAT_WISE_MOD(int id) {

		IC_CAT_WISE_MOD singleIC_CAT_WISE_MOD = new IC_CAT_WISE_MOD();

		Map<String, Object> result = getAllStatesJdbcCall46.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_CAT_WISE_MOD = new IC_CAT_WISE_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"),
					null, f.optString("USAGE_CAT_CODE"), null, f.optString("NEW_CONS"), f.optString("PD_CONS"),
					f.optString("TOT_CONS"), f.optString("TD_CONS"), f.optString("ACTIVE_CONS"),
					f.optString("BILLED_CONS"), f.optString("BILLED_UNIT"), f.optString("BILLED_AMT"),
					f.optString("COLL_AMT"), f.optString("REC_AMT"), f.optString("BILLING_RATE"),
					f.optString("EQ_MONTH"), f.optString("CAT_MOD_ID")

			);
		}
//		    			

//	    System.out.println(singleIC_CAT_WISE_MOD);
		return singleIC_CAT_WISE_MOD;
	}

//		//IC_CAT_WISE_MOD  single ends

	// IC_CAT_WISE_MOD update starts

	public void editICCatWiseMod(IC_CAT_WISE_MOD ic_cat_wise_mod,String user_name) {

		String a = ic_cat_wise_mod.getBILL_CYCLE_CODE();
		String b = ic_cat_wise_mod.getLOCATION_CODE();
		String c = ic_cat_wise_mod.getUSAGE_CAT_CODE();
		String d = !ic_cat_wise_mod.getNEW_CONS().equals("")?ic_cat_wise_mod.getNEW_CONS():"0";
		String e = !ic_cat_wise_mod.getPD_CONS().equals("")?ic_cat_wise_mod.getPD_CONS():"0";
		String f = !ic_cat_wise_mod.getTOT_CONS().equals("")?ic_cat_wise_mod.getTOT_CONS():"0";
		String g = !ic_cat_wise_mod.getTD_CONS().equals("")?ic_cat_wise_mod.getTD_CONS():"0";
		String h = !ic_cat_wise_mod.getACTIVE_CONS().equals("")?ic_cat_wise_mod.getACTIVE_CONS():"0";
		String i = !ic_cat_wise_mod.getBILLED_CONS().equals("")?ic_cat_wise_mod.getBILLED_CONS():"0";
		String j = !ic_cat_wise_mod.getBILLED_UNIT().equals("")?ic_cat_wise_mod.getBILLED_UNIT():"0";
		String k = !ic_cat_wise_mod.getBILLED_AMT().equals("")?ic_cat_wise_mod.getBILLED_AMT():"0";
		String l = !ic_cat_wise_mod.getCOLL_AMT().equals("")?ic_cat_wise_mod.getCOLL_AMT():"0";
		String m = !ic_cat_wise_mod.getREC_AMT().equals("")?ic_cat_wise_mod.getREC_AMT():"0";
		String n = !ic_cat_wise_mod.getBILLING_RATE().equals("")?ic_cat_wise_mod.getBILLING_RATE():"0";
		String o = !ic_cat_wise_mod.getEQ_MONTH().equals("")?ic_cat_wise_mod.getEQ_MONTH():"0";
		int p = Integer.valueOf(ic_cat_wise_mod.getCAT_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall47.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(a, b, c, d, e, f, g, h, i, j, k, l, m,user_name, n, o, p);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_CAT_WISE_MOD update ends

	// IC_CAT_WISE_MOD delete starts

	public void deleteICCatWiseMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall48.withCatalogName("DATA_PKG")
				.withProcedureName("IC_CAT_WISE_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_CAT_WISE_MOD delete ends

//		//IC_MISC_MOD  insert starts

	public void insertICMiscMod(IC_MISC_MOD ic_misc_mod,String user_name) {

//			System.out.println(pkg_rate_mst);

//		System.out.println(sfmodel);

		String a = ic_misc_mod.getBILL_CYCLE_CODE();
		String b = ic_misc_mod.getLOCATION_CODE();
		String c = ic_misc_mod.getMSC_TYPE_CODE();

		int d = Integer.valueOf(ic_misc_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_misc_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_misc_mod.getREC_AMT());

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");

//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall39.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f,user_name);

		JSONObject json = new JSONObject(result);
		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println("mhhh");  
		System.out.println(out);

	}

//		//IC_MISC_MOD  insert ends

//		IC_MISC_MOD  single starts 

	public IC_MISC_MOD singleIC_MISC_MOD(int id) {

		IC_MISC_MOD singleIC_MISC_MOD = new IC_MISC_MOD();

		Map<String, Object> result = getAllStatesJdbcCall40.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_SINGLE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//			System.out.println(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

//		    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			singleIC_MISC_MOD = new IC_MISC_MOD(f.optString("BILL_CYCLE_CODE"), f.optString("LOCATION_CODE"), null,
					f.optString("MSC_TYPE_CODE"), null, f.optString("BILLED_AMT"), f.optString("COLL_AMT"),
					f.optString("REC_AMT"), f.optString("MSC_MOD_ID")

			);
		}

//		    System.out.println(singlePKG_RATE_MST);
		return singleIC_MISC_MOD;
	}

//		//IC_MISC_MOD  single ends

	// IC_MISC_MOD update starts

	public void editICMiscMod(IC_MISC_MOD ic_misc_mod,String user_name) {

//			System.out.println(pkg_rate_mst);
		// System.out.println(sfmodel);
//			String f = pkg_rate_mst.getPKG_ID();
		String a = ic_misc_mod.getBILL_CYCLE_CODE();
		String b = ic_misc_mod.getLOCATION_CODE();
		String c = ic_misc_mod.getMSC_TYPE_CODE();

		int d = Integer.valueOf(ic_misc_mod.getBILLED_AMT());
		int e = Integer.valueOf(ic_misc_mod.getCOLL_AMT());
		int f = Integer.valueOf(ic_misc_mod.getREC_AMT());

		int g = Integer.valueOf(ic_misc_mod.getMSC_MOD_ID());
//			String K = ic_loc_mod.getLOC_MOD_ID();

//			SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
		//
//			String o = formatter.format(Date.valueOf(newProjectModel.getDPP_APPR_DATE()));

		Map<String, Object> result = getAllStatesJdbcCall41.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(a, b, c, d, e, f,user_name, g);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out4 = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_MISC_MOD update ends

	// IC_MISC_MOD delete starts

	public void deleteICMiscMod(int id) {

		Map<String, Object> result = getAllStatesJdbcCall42.withCatalogName("DATA_PKG")
				.withProcedureName("IC_MISC_MOD_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//		System.out.println(result);
		String out = json.get("OUTPUT").toString();

//		System.out.println(out);   

	}

	// IC_MISC_MOD delete ends

	// nav bar list start

//	IC_REPORT_LEVEL_MST list starts 

	public ArrayList<IC_REPORT_LEVEL_MST> a(String officeCode) {

		ArrayList<IC_REPORT_LEVEL_MST> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall49.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_reporting_level")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_REPORT_LEVEL_MST(f.optString("REPORT_LEVEL_CODE"), f.optString("REPORT_LEVEL_DESC")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}

//	IC_REPORT_LEVEL_MST list end 

//	IC_ZONE_MST list starts 

	public ArrayList<IC_ZONE_MST_R> r(String officeCode) {

		ArrayList<IC_ZONE_MST_R> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall50.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Zone").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_ZONE_MST_R(f.optString("ZONE_CODE"), f.optString("ZONE_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}

//	IC_ZONE_MST list end 

//	IC_CIRCLE_MST list starts 

	// nav bar dropdown list start

	public ArrayList<IC_CIRCLE_MST_R> getCircleList(String officeCode, String id) {

		ArrayList<IC_CIRCLE_MST_R> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall51.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_circle").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(id, officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_CIRCLE_MST_R(f.optString("CIRCLE_CODE"), f.optString("CIRCLE_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);
//		

		return b;

	}

//	IC_CIRCLE_MST list end 

//	Division list starts 

	public ArrayList<IC_DIST_DIV_MST> getdivList(String officeCode, String id) {

		ArrayList<IC_DIST_DIV_MST> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall52.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_div").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(id, officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_DIST_DIV_MST(f.optString("DIV_CODE"), f.optString("DIV_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);
//		

		return b;

	}

//	Division list end 

//	Location list starts 

	public ArrayList<IC_LOCATION_MASTER> getlocList(String officeCode, String id, String div) {

		ArrayList<IC_LOCATION_MASTER> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall53.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_location")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(div,id, officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_LOCATION_MASTER(f.optString("LOCATION_CODE"), f.optString("LOCATION_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}
	
//	Location list starts 

	public ArrayList<IC_LOCATION_MASTER> getlocList1(String officeCode, String id) {

		ArrayList<IC_LOCATION_MASTER> b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall5404.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_location")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute( id,null ,officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_LOCATION_MASTER(f.optString("LOCATION_CODE"), f.optString("LOCATION_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}

//	RAO list starts 

	public ArrayList<IC_RAO_INFO> getraoList(String officeCode, String x) {

		ArrayList<IC_RAO_INFO> b = new ArrayList<>();
		String a= null, h= x, m= null,k= null, l= null, n= officeCode, g = null;
		
		Map<String, Object> c = getAllStatesJdbcCall5400.withCatalogName("pkg_dist_DF_Dash_board")
				.withProcedureName("dpd_RAO_INFO").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute( a, h, m, k, l, n, g );



		JSONObject j = new JSONObject(c);


		String d = j.get("CUR_DATA").toString();



		JSONArray e = new JSONArray(d);



		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_RAO_INFO(f.optString("RAO_CODE"), f.optString("RAO_NAME")

			));
		}



		return b;

	}
	
//	RAO list starts 

	public ArrayList<IC_RAO_INFO> getraoList1(String officeCode, String x, String y) {

		ArrayList<IC_RAO_INFO> b = new ArrayList<>();
		String a= null, h= x , m= y,k= null, l= null, n= officeCode, g = null;
		
		Map<String, Object> c = getAllStatesJdbcCall5401.withCatalogName("pkg_dist_DF_Dash_board")
				.withProcedureName("dpd_RAO_INFO").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute( a, h, m, k, l, n, g );



		JSONObject j = new JSONObject(c);


		String d = j.get("CUR_DATA").toString();



		JSONArray e = new JSONArray(d);



		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_RAO_INFO(f.optString("RAO_CODE"), f.optString("RAO_NAME")

			));
		}



		return b;

	}
	
	
	//RAO list end 

//	RAO list starts 

	public ArrayList<IC_RAO_INFO> getraoList2(String officeCode, String x, String y, String z) {

		ArrayList<IC_RAO_INFO> b = new ArrayList<>();
		String a= null, h= x , m= y,k= z, l= null, n= officeCode, g = null;
		
		Map<String, Object> c = getAllStatesJdbcCall5402.withCatalogName("pkg_dist_DF_Dash_board")
				.withProcedureName("dpd_RAO_INFO").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute( a, h, m, k, l, n, g );



		JSONObject j = new JSONObject(c);


		String d = j.get("CUR_DATA").toString();



		JSONArray e = new JSONArray(d);



		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_RAO_INFO(f.optString("RAO_CODE"), f.optString("RAO_NAME")

			));
		}



		return b;

	}
	
	
	//RAO list end 
	
//	RAO list starts 

	public ArrayList<IC_RAO_INFO> getraoList3(String officeCode,String x, String y, String z, String w) {

		ArrayList<IC_RAO_INFO> b = new ArrayList<>();
		String a= null, h= x , m= y,k= z, l= w, n= officeCode, g = null;
		
		Map<String, Object> c = getAllStatesJdbcCall5403.withCatalogName("pkg_dist_DF_Dash_board")
				.withProcedureName("dpd_RAO_INFO").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute( a, h, m, k, l, n, g );



		JSONObject j = new JSONObject(c);


		String d = j.get("CUR_DATA").toString();



		JSONArray e = new JSONArray(d);



		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_RAO_INFO(f.optString("RAO_CODE"), f.optString("RAO_NAME")

			));
		}



		return b;

	}
//	RAO list ends 

//	Month list starts 

	public ArrayList<Month_Dropdown> m(String officeCode) {

		ArrayList<Month_Dropdown> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall54.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_bill_cycle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);
		System.out.println("find");
		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new Month_Dropdown(f.optString("BILL_CYCLE_CODE"), f.optString("BILL_CYCLE_DESC")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}

//	Month  list end 

	// nav bar dropdown list end

	// nav bar list end

//last_month_date list start

	public String listlast_month_date() {

		String g = null;

		Map<String, Object> c = getAllStatesJdbcCall55.withCatalogName("DATA_PKG").withProcedureName("last_month_date")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute();

		JSONObject j = new JSONObject(c);
//System.out.println(j);

		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

//				 g=f.optString("LAST_DATE").substring(0,7);

			g = f.optString("LAST_DATE");

		}

//System.out.println(d);

		return g;
	}

//last_month_date list end

//IC_GEN_AREA list starts 

	public ArrayList<IC_GEN_AREA> ga(String officeCode) {

		ArrayList<IC_GEN_AREA> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall56.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_GEN_AREA")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

//	System.out.println(c);

		JSONObject j = new JSONObject(c);
//	System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//	System.out.println(d);

		JSONArray e = new JSONArray(d);

//	System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_GEN_AREA(f.optString("GEN_AREA_CODE"), f.optString("GEN_AREA_NAME")

			));
		}

//	System.out.println("GGG");
//	System.out.println(b);

		return b;

	}

//IC_GEN_AREA list starts 

//IC_TRANS_GRID list starts 

	public ArrayList<IC_TRANS_GRID> tr(String officeCode) {

		ArrayList<IC_TRANS_GRID> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall58.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_TRANS_GRID")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

//	System.out.println(c);

		JSONObject j = new JSONObject(c);
//	System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//	System.out.println(d);

		JSONArray e = new JSONArray(d);

//	System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_TRANS_GRID(

					f.optString("GRID_CODE"), f.optString("GRID_DESC")

			));
		}

//	System.out.println("GGG");
//	System.out.println(b);

		return b;

	}

//IC_TRANS_GRID list starts 

//IC_FUEL_TYPE list starts 

	public ArrayList<IC_FUEL_TYPE> fu(String officeCode) {

		ArrayList<IC_FUEL_TYPE> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall59.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_FUEL_TYPE")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

//	System.out.println(c);

		JSONObject j = new JSONObject(c);
//	System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//	System.out.println(d);

		JSONArray e = new JSONArray(d);

//	System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_FUEL_TYPE(

					f.optString("FUEL_CODE"), f.optString("FUEL_NAME"), null, null, null

			));
		}

//	System.out.println("GGG");
//	System.out.println(b);

		return b;

	}

//IC_FUEL_TYPE list starts 

	//IC_POWER_PLANT list starts 

	public ArrayList<IC_POWER_PLANT>getIC_POWER_PLANTList(String officeCode, String fuel,String ow_ty,String ow,String grid,String gen){
		
		ArrayList<IC_POWER_PLANT>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall60.withCatalogName("PKG_GEN_DASH_BOARD")
								.withProcedureName("dpd_Power_plant")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode,fuel,ow_ty,ow,grid,gen);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_POWER_PLANT(
					    
						f.optString("PP_CODE"),
						f.optString("PP_NAME")
					
						
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
	//	

		
		return b;
		
	}

	//IC_POWER_PLANT list end 



//IC_PP_OWNER_TYPE list starts 

	public ArrayList<IC_PP_OWNER_TYPE> ow_ty(String officeCode) {

		ArrayList<IC_PP_OWNER_TYPE> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall57.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_PP_OWNER_type")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

//	System.out.println(c);

		JSONObject j = new JSONObject(c);
//	System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//	System.out.println(d);

		JSONArray e = new JSONArray(d);

//	System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_PP_OWNER_TYPE(null, f.optString("OWNER_TYPE"), f.optString("OWNER_TYPE_NAME"), null

			));
		}

//	System.out.println("GGG");
//	System.out.println(b);

		return b;

	}

//IC_PP_OWNER_TYPE list starts 

//IC_PP_OWNER list starts 

//nav bar dropdown list start	

	public ArrayList<IC_PP_OWNER> getownerList(String officeCode, String id) {

		ArrayList<IC_PP_OWNER> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall61.withCatalogName("pkg_GEN_Dash_board")
				.withProcedureName("dpd_PP_OWNER")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, id);

//	System.out.println(c);

		JSONObject j = new JSONObject(c);
//	System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//	System.out.println(d);

		JSONArray e = new JSONArray(d);

//	System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_PP_OWNER(f.optString("OWNER_CODE"), f.optString("OWNER_NAME"), null, null, null, null, null

			));
		}

//	System.out.println("GGG");
//	System.out.println(b);
//	

		return b;

	}

//nav bar dropdown list end	

//IC_PP_OWNER list end 
	
	
	//IC_REPORT_LEVEL_MST list starts 

	public ArrayList<IC_REPORT_LEVEL_MST>b(String officeCode){
		
		ArrayList<IC_REPORT_LEVEL_MST>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall62.withCatalogName("PKG_GEN_DASH_BOARD")
								.withProcedureName("dpd_reporting_level")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_REPORT_LEVEL_MST(
						f.optString("REPORT_LEVEL_CODE"),
						f.optString("REPORT_LEVEL_DESC")
						
						) 
					);
		}
		
//		System.out.println("GGG");
//		System.out.println(b);
		

		
		return b;
		
	}

	//IC_REPORT_LEVEL_MST GEN list end 

	//last_month_date  GEN list start


	public ArrayList<IC_PERIOD_MST1>d(String officeCode){
		
		ArrayList<IC_PERIOD_MST1>  b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall63.withCatalogName("PKG_GEN_DASH_BOARD")
								.withProcedureName("dpd_bill_cycle1")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		System.out.println("jk");
		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
		System.out.println("cm");
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_PERIOD_MST1(
					null,
						f.optString("BILL_CYCLE_CODE"),
						f.optString("BILL_CYCLE_DESC"),
						null
						
						) 
					);
		}
		
		System.out.println("GGG");
		System.out.println(b);
		

		
		return b;
	}

	//last_month_date  GEN list end
	
	

	//FORWARDING REPORT list starts 

	//dpd_single_line_param start

	public ArrayList<IC_ES_FORWARDING> fw(String officeCode){
		
		ArrayList<IC_ES_FORWARDING>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall600.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_single_line_param")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING(
						f.optString("CURR_MONTH"),
						f.optString("CURR_MONTH_NET_GEN"),
						f.optString("CURR_MONTH_ENRG_SALE"),
						f.optString("CURR_MONTH_DIST_LOSS"),
						
						f.optString("PREV_MONTH"),
						f.optString("PREV_MONTH_NET_GEN"),
						f.optString("MONTH_NET_GEN_DIFF"),
						f.optString("ISOLATED_GEN"),
						
						f.optString("SALES_INC"),
						f.optString("CURR_YR"),
						f.optString("PREV_YR"),
						f.optString("CUR_YR_NET_GEN"),
						
						f.optString("PREV_YR_NET_GEN"),
						f.optString("PREV_YR_MONTH"),
						f.optString("TOT_NO_BULK_CUST"),
						f.optString("TOT_NO_REB_CUST"),
						f.optString("TOT_NO_RETAIL_CUST"),
						f.optString("TOT_NO_ACTIVE_CUST"),
						f.optString("REC_BULK_CUST"),
						f.optString("REC_DESA"),
						f.optString("REC_DPDC"),
						f.optString("DPDC_EQM"),
						f.optString("REC_BPDB_RETAIL"),
						f.optString("EQM_BPDB_RETAIL")
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}



	public ArrayList<IC_ES_FORWARDING> listIC_ES_FORWARDING(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall601.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_single_line_param")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList.add(new IC_ES_FORWARDING(	f.optString("CURR_MONTH"),
					f.optString("CURR_MONTH_NET_GEN"),
					f.optString("CURR_MONTH_ENRG_SALE"),
					f.optString("CURR_MONTH_DIST_LOSS"),
					
					f.optString("PREV_MONTH"),
					f.optString("PREV_MONTH_NET_GEN"),
					f.optString("MONTH_NET_GEN_DIFF"),
					f.optString("ISOLATED_GEN"),
					
					f.optString("SALES_INC"),
					f.optString("CURR_YR"),
					f.optString("PREV_YR"),
					f.optString("CUR_YR_NET_GEN"),
					
					f.optString("PREV_YR_NET_GEN"),
					f.optString("PREV_YR_MONTH"),
					f.optString("TOT_NO_BULK_CUST"),
					f.optString("TOT_NO_REB_CUST"),
					f.optString("TOT_NO_RETAIL_CUST"),
					f.optString("TOT_NO_ACTIVE_CUST"),
					f.optString("REC_BULK_CUST"),
					f.optString("REC_DESA"),
					f.optString("REC_DPDC"),
					f.optString("DPDC_EQM"),
					f.optString("REC_BPDB_RETAIL"),
					f.optString("EQM_BPDB_RETAIL")
					
					
					

					));
		}
		
		
//		System.out.println("showList210");
//		System.out.println(showList);
		
		return showList;
	}

	//dpd_single_line_param start



	//forward dropdown start
	//dpd_month_yr_gen_tab start
	public ArrayList<IC_ES_FORWARDING1_1> fw1_1(String officeCode){
		
		ArrayList<IC_ES_FORWARDING1_1>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall602.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_month_yr_gen_tab")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING1_1(
						
					
						
						f.optString("MONTH_YR"),
						f.optString("GROSS_GEN"),
						f.optString("STATION_USE"),
						f.optString("NET_GEN"),
						f.optString("JV"),
						f.optString("IPP"),
						f.optString("RENTAL"),
						f.optString("IMPORTED"),
						f.optString("OTHER"),
						f.optString("NET_TOTAL")
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	//FORWARDING REPORT list  ends


	public ArrayList<IC_ES_FORWARDING1_1> listIC_ES_FORWARDING1_1(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING1_1> showList1 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall603.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_month_yr_gen_tab")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList1.add(new IC_ES_FORWARDING1_1(	
					
					
					
					f.optString("MONTH_YR"),
					f.optString("GROSS_GEN"),
					f.optString("STATION_USE"),
					f.optString("NET_GEN"),
					f.optString("JV"),
					f.optString("IPP"),
					f.optString("RENTAL"),
					f.optString("IMPORTED"),
					f.optString("OTHER"),
					f.optString("NET_TOTAL")
					));
		}
		return showList1;
	}

	//dpd_month_yr_gen_tab end





	//dpd_LDC_data start
	public ArrayList<IC_ES_FORWARDING1_3> fw1_3(String officeCode){
		
		ArrayList<IC_ES_FORWARDING1_3>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall604.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_LDC_data")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING1_3(
						
					
						

					f.optString("LDC_TYPE_CODE"),
					f.optString("LDC_TYPE_NAME"),
					null,
//					f.optString("PM_LDC_DATE"),
					f.optString("PM_LDC"),
					
					f.optString("CM_LDC_DATE"),
					f.optString("CM_LDC"),
					f.optString("UP_LDC_DATE"),
					f.optString("UP_LDC")
					
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING1_3> listIC_ES_FORWARDING1_3(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING1_3> showList2 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall605.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_LDC_data")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList2.add(new IC_ES_FORWARDING1_3(	
					
					
					
					f.optString("LDC_TYPE_CODE"),
					f.optString("LDC_TYPE_NAME"),
					
					!f.optString("PM_LDC_DATE").equals("")?f.optString("PM_LDC_DATE").substring(0, 10):"",
					f.optString("PM_LDC"),
					!f.optString("CM_LDC_DATE").equals("")?f.optString("CM_LDC_DATE").substring(0, 10):"",
					f.optString("CM_LDC"),
				    !f.optString("UP_LDC_DATE").equals("")?f.optString("UP_LDC_DATE").substring(0, 10):"",
					f.optString("UP_LDC")
				
					
					
					));
		}
	//	
//		System.out.println("data");
//		System.out.println(showList2);
		
		
		return showList2;
	}

	//dpd_LDC_data end




	//dpd_yr_month_sales start
	public ArrayList<IC_ES_FORWARDING2_1> fw2_1(String officeCode){
		
		ArrayList<IC_ES_FORWARDING2_1>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall606.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_yr_month_sales")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING2_1(
						
					
						

					f.optString("TP"),
					f.optString("UC_TYPE"),
//					null,
					f.optString("PREV_YR_SALES"),
					f.optString("CURR_YR_UPTO_SALES"),
					f.optString("PREV_MONTH_SALES"),
					f.optString("PREV_YR_MONTH_SALES"),
					f.optString("CURR_MONTH_SALES")
				
					
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING2_1> listIC_ES_FORWARDING2_1(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING2_1> showList3 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall607.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

//		System.out.println(result+"result100");
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList3.add(new IC_ES_FORWARDING2_1(	
					
					
					f.optString("TP"),
				
					f.optString("UC_TYPE"),
					f.optString("PREV_YR_SALES"),
				
					f.optString("CURR_YR_UPTO_SALES"),	

					f.optString("PREV_MONTH_SALES"),
					f.optString("PREV_YR_MONTH_SALES"),
					f.optString("CURR_MONTH_SALES")
		
					
					));
		}
		
//		System.out.println("data3");
//		System.out.println(showList3);
		
		
		return showList3;
	}

	//dpd_yr_month_sales end





	//dpd_yr_month_sales_coll start
	public ArrayList<IC_ES_FORWARDING3_1_1> fw3_1_1(String officeCode){
		
		ArrayList<IC_ES_FORWARDING3_1_1>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall610.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_yr_month_sales_coll")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING3_1_1(
						
					
						

					f.optString("TP"),
					f.optString("UC_TYPE"),

					f.optString("PREV_YR_SALES_AMT"),
					f.optString("PREV_YR_COLL"),
					f.optString("PREV_YR_CB"),
					f.optString("PREV_YR_MONTH_SALES_AMT"),
					f.optString("PREV_YR_MONTH_COLL"),
					
					f.optString("PREV_YR_MONTH_CB"),
					f.optString("CURR_MONTH_SALES_AMT"),

					f.optString("CURR_MONTH_COLL"),
					
					f.optString("CURR_MONTH_CB"),
					f.optString("CURR_YR_UPTO_SALES_AMT"),
					
					f.optString("CURR_YR_UPTO_COLL"),
					f.optString("CURR_YR_UPTO_CB")
					
				
					
					
			
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING3_1> listIC_ES_FORWARDING3_1(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING3_1> showList4 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall609.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_coll")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		System.out.println(result+"result1036");
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList4.add(new IC_ES_FORWARDING3_1(	
					
					
					f.optString("TP"),
					f.optString("UC_TYPE"),
//					null,
					f.optString("PREV_YR_SALES_AMT"),
					f.optString("PREV_YR_COLL"),
					f.optString("PREV_YR_CB"),
					f.optString("PREV_YR_MONTH_SALES_AMT"),
					f.optString("PREV_YR_MONTH_COLL"),
					
					f.optString("PREV_YR_MONTH_CB"),
					f.optString("CURR_MONTH_SALES_AMT"),
//					null,
					f.optString("CURR_MONTH_COLL"),
					
					f.optString("CURR_MONTH_CB"),
					f.optString("CURR_YR_UPTO_SALES_AMT"),
					
					f.optString("CURR_YR_UPTO_COLL"),
					f.optString("CURR_YR_UPTO_CB")
					
					));
		}
		
//		System.out.println("data5");
//		System.out.println(showList4);
		
		
		return showList4;
	}

	//dpd_yr_month_sales_coll end



	//dpd_yr_month_sales_coll start
	public ArrayList<IC_ES_FORWARDING3_1> fw3_1(String officeCode){
		
		ArrayList<IC_ES_FORWARDING3_1>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall608.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_yr_month_sales_coll")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING3_1(
						
					
						

					f.optString("TP"),
					f.optString("UC_TYPE"),

					f.optString("PREV_YR_SALES_AMT"),
					f.optString("PREV_YR_COLL"),
					f.optString("PREV_YR_CB"),
					f.optString("PREV_YR_MONTH_SALES_AMT"),
					f.optString("PREV_YR_MONTH_COLL"),
					
					f.optString("PREV_YR_MONTH_CB"),
					f.optString("CURR_MONTH_SALES_AMT"),

					f.optString("CURR_MONTH_COLL"),
					
					f.optString("CURR_MONTH_CB"),
					f.optString("CURR_YR_UPTO_SALES_AMT"),
					
					f.optString("CURR_YR_UPTO_COLL"),
					f.optString("CURR_YR_UPTO_CB")
					
				
					
					
			
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING3_1_1> listIC_ES_FORWARDING3_1_1(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING3_1_1> showList5 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall611.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_coll_total")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

//		System.out.println(result+"result1036");
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList5.add(new IC_ES_FORWARDING3_1_1(	
					
					
					f.optString("TP"),
					f.optString("UC_TYPE"),
//					null,
					f.optString("PREV_YR_SALES_AMT"),
					f.optString("PREV_YR_COLL"),
					f.optString("PREV_YR_CB"),
					f.optString("PREV_YR_MONTH_SALES_AMT"),
					f.optString("PREV_YR_MONTH_COLL"),
					
					f.optString("PREV_YR_MONTH_CB"),
					f.optString("CURR_MONTH_SALES_AMT"),
//					null,
					f.optString("CURR_MONTH_COLL"),
					
					f.optString("CURR_MONTH_CB"),
					f.optString("CURR_YR_UPTO_SALES_AMT"),
					
					f.optString("CURR_YR_UPTO_COLL"),
					f.optString("CURR_YR_UPTO_CB")
					
					));
		}
		
//		System.out.println("data5");
//		System.out.println(showList4);
		
		
		return showList5;
	}

	//dpd_yr_month_sales_coll_total end







	//dpd_yr_month_sales_coll_total start
	public ArrayList<IC_ES_FORWARDING2_2> fw2_2(String officeCode){
		
		ArrayList<IC_ES_FORWARDING2_2>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall612.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_yr_month_sales_total")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING2_2(
						
					
						

					f.optString("TP"),
					f.optString("UC_TYPE"),

					f.optString("PREV_YR_SALES"),
					f.optString("CURR_YR_UPTO_SALES"),
					f.optString("PREV_MONTH_SALES"),
					f.optString("PREV_YR_MONTH_SALES"),
					
					f.optString("CURR_MONTH_SALES")
					
				
					
					
			
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING2_2> listIC_ES_FORWARDING2_2(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING2_2> showList9 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall613.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_sales_total")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

//		System.out.println(result+"result136");
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList9.add(new IC_ES_FORWARDING2_2(	
					

					f.optString("TP"),
					f.optString("UC_TYPE"),

					f.optString("PREV_YR_SALES"),
					f.optString("CURR_YR_UPTO_SALES"),
					f.optString("PREV_MONTH_SALES"),
					f.optString("PREV_YR_MONTH_SALES"),
					
					f.optString("CURR_MONTH_SALES")
					
					));
		}
	//	
//		System.out.println("data51");
//		System.out.println(showList9);
		
		
		return showList9;
	}

	//dpd_yr_month_sales_coll_total end



	//dpd_yr_month_perf_bpdb_dist start
	public ArrayList<IC_ES_FORWARDING4_1> fw4_1(String officeCode){
		
		ArrayList<IC_ES_FORWARDING4_1>  b = new ArrayList<>();
		

		
		Map<String, Object> c = getAllStatesJdbcCall614.withCatalogName("pkg_ES_forwarding")
								.withProcedureName("dpd_yr_month_perf_bpdb_dist")
								.declareParameters(
										new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
								.execute(officeCode);
		
//		System.out.println(c);
		
		JSONObject j = new JSONObject(c);
//		System.out.println(j);
		
		String d = j.get("CUR_DATA").toString();
		
//		System.out.println(d);
		
		JSONArray e = new JSONArray(d);
		
//		System.out.println(e);
		
		for(int i=0; i<e.length(); i++) {
			
			JSONObject f = e.getJSONObject(i);
			
			b.add( new IC_ES_FORWARDING4_1(
						
					
						

					f.optString("ZONE_CODE"),
					f.optString("ZONE_NAME"),
					f.optString("CM_MONTH"),
					f.optString("CM_IMPORT_MKWH"),
					f.optString("CM_SALE_MKWH"),
					f.optString("CM_DIST_SYS_LOSS"),
					f.optString("CM_NET_BILL_MTK"),
					f.optString("CM_NET_COLL_MTK"),
					f.optString("CM_CB_RATIO"),
					f.optString("CM_CI_RATIO"),
					f.optString("UPTOM_MONTH"),
					f.optString("UPTOM_IMPORT_MKWH"),
					f.optString("UPTOM_SALE_MKWH"),
					f.optString("UPTOM_DIST_SYS_LOSS"),
					f.optString("UPTOM_NET_BILL_MTK"),
					f.optString("UPTOM_NET_COLL_MTK"),
					f.optString("UPTOM_CB_RATIO"),
					f.optString("UPTOM_CI_RATIO"),
					f.optString("PVYRM_MONTH"),
					f.optString("PVYRM_IMPORT_MKWH"),
					f.optString("PVYRM_SALE_MKWH"),
					f.optString("PVYRM_DIST_SYS_LOSS"),
					f.optString("PVYRM_NET_BILL_MTK"),
					f.optString("PVYRM_NET_COLL_MTK"),
					f.optString("PVYRM_CB_RATIO"),
					f.optString("PVYRM_CI_RATIO"),
					f.optString("PVYR_MONTH"),
					f.optString("PVYR_IMPORT_MKWH"),
					
					
					f.optString("PVYR_SALE_MKWH"),
					f.optString("PVYR_DIST_SYS_LOSS"),
					f.optString("PVYR_NET_BILL_MTK"),
					f.optString("PVYR_NET_COLL_MTK"),
					f.optString("PVYR_CB_RATIO"),
					f.optString("PVYR_CI_RATIO")
					
				
					
					
			
					
					
						) 
					);
		}
		
//		System.out.println("Reee");
//		System.out.println(b);
		

		
		return b;
		
	}




	public ArrayList<IC_ES_FORWARDING4_1> listIC_ES_FORWARDING4_1(String officeCode,String two) {
		ArrayList<IC_ES_FORWARDING4_1> showList10 = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall615.withCatalogName("pkg_ES_forwarding")
				.withProcedureName("dpd_yr_month_perf_bpdb_dist")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

//		System.out.println(result+"result41");
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject f = jsonArray.getJSONObject(i);
			showList10.add(new IC_ES_FORWARDING4_1(	
					

					f.optString("ZONE_CODE"),
					f.optString("ZONE_NAME"),
					f.optString("CM_MONTH"),
					f.optString("CM_IMPORT_MKWH"),
					f.optString("CM_SALE_MKWH"),
					f.optString("CM_DIST_SYS_LOSS"),
					f.optString("CM_NET_BILL_MTK"),
					f.optString("CM_NET_COLL_MTK"),
					f.optString("CM_CB_RATIO"),
					f.optString("CM_CI_RATIO"),
					f.optString("UPTOM_MONTH"),
					f.optString("UPTOM_IMPORT_MKWH"),
					f.optString("UPTOM_SALE_MKWH"),
					f.optString("UPTOM_DIST_SYS_LOSS"),
					f.optString("UPTOM_NET_BILL_MTK"),
					f.optString("UPTOM_NET_COLL_MTK"),
					f.optString("UPTOM_CB_RATIO"),
					f.optString("UPTOM_CI_RATIO"),
					f.optString("PVYRM_MONTH"),
					f.optString("PVYRM_IMPORT_MKWH"),
					f.optString("PVYRM_SALE_MKWH"),
					f.optString("PVYRM_DIST_SYS_LOSS"),
					f.optString("PVYRM_NET_BILL_MTK"),
					f.optString("PVYRM_NET_COLL_MTK"),
					f.optString("PVYRM_CB_RATIO"),
					f.optString("PVYRM_CI_RATIO"),
					f.optString("PVYR_MONTH"),
					f.optString("PVYR_IMPORT_MKWH"),
					f.optString("PVYR_SALE_MKWH"),
					f.optString("PVYR_DIST_SYS_LOSS"),
					f.optString("PVYR_NET_BILL_MTK"),
					f.optString("PVYR_NET_COLL_MTK"),
					f.optString("PVYR_CB_RATIO"),
					f.optString("PVYR_CI_RATIO")
					
					
					));
		}
	//	
//		System.out.println("data51");
//		System.out.println(showList9);
		
		
		return showList10;
	}

	//dpd_yr_month_perf_bpdb_dist end






	//FORWARDING REPORT list  ends

	//forward dropdown end
	
	
	public String bacckwordModDf(String bill,String loc,String id,String user,String office,String remarks,String next) {

		Map<String, Object> result = getAllStatesJdbcCall700.withCatalogName("PKG_VERIFICATION_AND_APPROVAL")
				.withProcedureName("DPD_LOC_MOD_DF_BACKWORD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(user,office,id,bill,loc,remarks,next);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();
		return out;

	}
	public String bacckwordModDff(String bill,String loc,String id,String user,String office,String next) {

		Map<String, Object> result = getAllStatesJdbcCall701.withCatalogName("PKG_VERIFICATION_AND_APPROVAL")
				.withProcedureName("DPD_LOC_MOD_DF_FORWORD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(user,office,id,bill,loc,next);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();
		return out;

	}

	public ArrayList<Month_Dropdown> mm(String officeCode) {

		ArrayList<Month_Dropdown> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall540.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_bill_cycle_all")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);
		//System.out.println("find");
		//System.out.println(c);

		JSONObject j = new JSONObject(c);
		//System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

		//System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new Month_Dropdown(f.optString("BILL_CYCLE_CODE"), f.optString("BILL_CYCLE_DESC")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}
	
	public ArrayList<DPD_REV_REPORT_GRAPH_MON> listDPD_REV_REPORT_GRAPH_MON(String officeCode,String a1,String b,String c, String d, String e) {

		ArrayList<DPD_REV_REPORT_GRAPH_MON> listDPD_REV_REPORT_GRAPH_MON = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5405.withCatalogName("PKG_ES_FORWARDING")
				.withProcedureName("DPD_REV_REPORT_GRAPH_MON")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, a1, b, c, d, e  );

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);



		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listDPD_REV_REPORT_GRAPH_MON.add(new DPD_REV_REPORT_GRAPH_MON(jsonData.optString("REPORT_LEVEL"),jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("MONTH_DESC"),
					jsonData.optString("IMPORT_MKWH"), jsonData.optString("SALE_MKWH"),
					jsonData.optString("DIST_SYS_LOSS"), jsonData.optString("NET_BILL_MTK"), jsonData.optString("NET_COLL_MTK"),
					jsonData.optString("CB_RATIO"), jsonData.optString("CI_RATIO")));
		}


		return listDPD_REV_REPORT_GRAPH_MON;
	}
	
	
	public ArrayList<DPD_REV_REPORT_GRAPH> listDPD_REV_REPORT_GRAPH_YR(String officeCode,String a1,String b,String c, String d) {

		ArrayList<DPD_REV_REPORT_GRAPH> listDPD_REV_REPORT_GRAPH_YR = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5407.withCatalogName("PKG_ES_FORWARDING")
				.withProcedureName("DPD_REV_REPORT_GRAPH_YR")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, a1, b, c, d  );

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);



		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listDPD_REV_REPORT_GRAPH_YR.add(new DPD_REV_REPORT_GRAPH(jsonData.optString("YEAR_CODE"),
					jsonData.optString("IMPORT_MKWH"), jsonData.optString("SALE_MKWH"),
					jsonData.optString("DIST_SYS_LOSS"), jsonData.optString("NET_BILL_MTK"), jsonData.optString("NET_COLL_MTK"),
					jsonData.optString("CB_RATIO"), jsonData.optString("CI_RATIO")));
		}


		return listDPD_REV_REPORT_GRAPH_YR;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	Location list starts 

	public ArrayList<IC_LOCATION_MASTER> getlocList2(String officeCode, String x, String y) {

		ArrayList<IC_LOCATION_MASTER> b = new ArrayList<>();
		
		Map<String, Object> c = getAllStatesJdbcCall5406.withCatalogName("PKG_ES_FORWARDING")
				.withProcedureName("DPD_LOCATION_LIST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute( x,y ,officeCode);

//		System.out.println(c);

		JSONObject j = new JSONObject(c);
//		System.out.println(j);

		String d = j.get("CUR_DATA").toString();

//		System.out.println(d);

		JSONArray e = new JSONArray(d);

//		System.out.println(e);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_LOCATION_MASTER(f.optString("LOCATION_CODE"), f.optString("LOCATION_NAME")

			));
		}

//		System.out.println("GGG");
//		System.out.println(b);

		return b;

	}
	
	
	
	public ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST(String officeCode) {

		ArrayList<IC_REPORT_LEVEL_MST> listIC_REPORT_LEVEL_MST = new ArrayList<>();
		
		Map<String, Object> result = getAllStatesJdbcCall5408.withCatalogName("PKG_ES_FORWARDING")
				.withProcedureName("DPD_REPORTING_LEVEL")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

		JSONObject json = new JSONObject(result);
	
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_REPORT_LEVEL_MST.add(new IC_REPORT_LEVEL_MST(jsonData.optString("REPORT_LEVEL_CODE"),
					jsonData.optString("REPORT_LEVEL_DESC")));
		}


		return listIC_REPORT_LEVEL_MST;
	}

	
	
	
	


}
