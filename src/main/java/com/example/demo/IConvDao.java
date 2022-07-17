package com.example.demo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

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
public class IConvDao {
	@Autowired
	private JdbcTemplate jdbcTemplete;
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

	SimpleJdbcCall getAllStatesJdbcCall55;
	SimpleJdbcCall getAllStatesJdbcCall56;
	SimpleJdbcCall getAllStatesJdbcCall560;
	SimpleJdbcCall getAllStatesJdbcCall57;
	SimpleJdbcCall getAllStatesJdbcCall58;
	SimpleJdbcCall getAllStatesJdbcCall59;
	SimpleJdbcCall getAllStatesJdbcCall60;
	SimpleJdbcCall getAllStatesJdbcCall61;
	SimpleJdbcCall getAllStatesJdbcCall62;
	SimpleJdbcCall getAllStatesJdbcCall63;
	SimpleJdbcCall getAllStatesJdbcCall64;
	SimpleJdbcCall getAllStatesJdbcCall65;
	SimpleJdbcCall getAllStatesJdbcCall66;
	SimpleJdbcCall getAllStatesJdbcCall666;
	SimpleJdbcCall getAllStatesJdbcCall67;
	SimpleJdbcCall getAllStatesJdbcCall68;
	SimpleJdbcCall getAllStatesJdbcCall69;
	SimpleJdbcCall getAllStatesJdbcCall70;
	SimpleJdbcCall getAllStatesJdbcCall71;
	SimpleJdbcCall getAllStatesJdbcCall72;
	SimpleJdbcCall getAllStatesJdbcCall720;
	SimpleJdbcCall getAllStatesJdbcCall590;

	SimpleJdbcCall getAllStatesJdbcCall1000;
	SimpleJdbcCall getAllStatesJdbcCall1001;
	SimpleJdbcCall getAllStatesJdbcCall1002;
	SimpleJdbcCall getAllStatesJdbcCall1003;
	SimpleJdbcCall getAllStatesJdbcCall1004;
	SimpleJdbcCall getAllStatesJdbcCall1063;
	SimpleJdbcCall getAllStatesJdbcCall1064;
	SimpleJdbcCall getAllStatesJdbcCall1065;
	SimpleJdbcCall getAllStatesJdbcCall1066;
	SimpleJdbcCall getAllStatesJdbcCall1067;
	SimpleJdbcCall getAllStatesJdbcCall1068;
	SimpleJdbcCall getAllStatesJdbcCall1069;
	SimpleJdbcCall getAllStatesJdbcCall1070;
	SimpleJdbcCall getAllStatesJdbcCall1071;

	SimpleJdbcCall getAllStatesJdbcCall5000;
	SimpleJdbcCall getAllStatesJdbcCall5001;
	SimpleJdbcCall getAllStatesJdbcCall3000;
	SimpleJdbcCall getAllStatesJdbcCall3001;

	SimpleJdbcCall getAllStatesJdbcCall3002;
	SimpleJdbcCall getAllStatesJdbcCall3003;
	SimpleJdbcCall getAllStatesJdbcCall3004;
	SimpleJdbcCall getAllStatesJdbcCall3005;
	SimpleJdbcCall getAllStatesJdbcCall3006;
	SimpleJdbcCall getAllStatesJdbcCall3007;
	SimpleJdbcCall getAllStatesJdbcCall3008;
	SimpleJdbcCall getAllStatesJdbcCall3009;
	SimpleJdbcCall getAllStatesJdbcCall30010;
	SimpleJdbcCall getAllStatesJdbcCall3015;
	SimpleJdbcCall getAllStatesJdbcCall3016;
	SimpleJdbcCall getAllStatesJdbcCall3017;
	SimpleJdbcCall getAllStatesJdbcCall3018;
	SimpleJdbcCall getAllStatesJdbcCall3019;

	SimpleJdbcCall getAllStatesJdbcCall4000;
	SimpleJdbcCall getAllStatesJdbcCall4001;
	SimpleJdbcCall getAllStatesJdbcCall4002;
	SimpleJdbcCall getAllStatesJdbcCall4003;
	SimpleJdbcCall getAllStatesJdbcCall4004;

	SimpleJdbcCall getAllStatesJdbcCall420;
	SimpleJdbcCall getAllStatesJdbcCall421;
	SimpleJdbcCall getAllStatesJdbcCall422;
	SimpleJdbcCall getAllStatesJdbcCall423;
	SimpleJdbcCall getAllStatesJdbcCall424;
	SimpleJdbcCall getAllStatesJdbcCall425;
	SimpleJdbcCall getAllStatesJdbcCall426;
	SimpleJdbcCall getAllStatesJdbcCall427;
	SimpleJdbcCall getAllStatesJdbcCall428;
	SimpleJdbcCall getAllStatesJdbcCall640;
	SimpleJdbcCall getAllStatesJdbcCall650;
	SimpleJdbcCall getAllStatesJdbcCall690;
	SimpleJdbcCall getAllStatesJdbcCall670;
	SimpleJdbcCall getAllStatesJdbcCall680;
	SimpleJdbcCall getAllStatesJdbcCall710;
	SimpleJdbcCall getAllStatesJdbcCall429;
	SimpleJdbcCall getAllStatesJdbcCall430;
	SimpleJdbcCall getAllStatesJdbcCall431;
	SimpleJdbcCall getAllStatesJdbcCall432;
	SimpleJdbcCall getAllStatesJdbcCall10000;
	SimpleJdbcCall getAllStatesJdbcCall10022;

	public IConvDao(DataSource dataSource) {
		// TODO Auto-generated method stub
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

		this.getAllStatesJdbcCall55 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall56 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall560 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall57 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall58 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall59 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall60 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall61 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall62 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall63 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall64 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall65 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall66 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall666 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall67 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall68 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall69 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall70 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall71 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall72 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall720 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall590 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall640 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall650 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall690 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall670 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall680 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall1000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1063 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1064 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1065 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1066 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1067 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1068 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1069 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1070 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall1071 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall5000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall5001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3001 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall3002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3004 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3005 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3006 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3007 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3008 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3009 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall30010 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3015 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3016 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3017 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3018 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall3019 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall4000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4001 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4002 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4003 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall4004 = new SimpleJdbcCall(dataSource);

		this.getAllStatesJdbcCall420 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall421 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall422 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall423 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall424 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall425 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall426 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall427 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall428 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall710 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall429 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall430 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall431 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall432 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall10000 = new SimpleJdbcCall(dataSource);
		this.getAllStatesJdbcCall10022 = new SimpleJdbcCall(dataSource);

	}

	public void insertICUsageCatCode(IC_USAGE_CATEGORY_CODE ic_usage_category_code,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall1.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_usage_category_code.getUSAGE_CAT_CODE(), ic_usage_category_code.getUSAGE_CAT_NAME(),
						ic_usage_category_code.getUSAGE_TYPE(), ic_usage_category_code.getLINE_TYPE(),
						ic_usage_category_code.getAREA_CODE(),user_name);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	public ArrayList<IC_USAGE_CATEGORY_CODE> listIC_USAGE_CATEGORY_CODE() {

		ArrayList<IC_USAGE_CATEGORY_CODE> listIC_USAGE_CATEGORY_CODE = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall429.withCatalogName("USAGE_INFO")
				.withProcedureName("SHOW_USAGE_CAT_CODE")
				.declareParameters(new SqlOutParameter("USAGEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);

		String out = json.get("USAGEDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_USAGE_CATEGORY_CODE.add(new IC_USAGE_CATEGORY_CODE(jsonData.optString("USAGE_CAT_CODE"),
					jsonData.optString("USAGE_CAT_NAME"), jsonData.optString("USAGE_TYPE"),
					jsonData.optString("LINE_TYPE"), jsonData.optString("LINE_TYPE_NAME"),
					jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME"), jsonData.optInt("USAGE_CAT_ID")));
		}

		return listIC_USAGE_CATEGORY_CODE;
	}

	public void editICUsageCatCode(IC_USAGE_CATEGORY_CODE ic_usage_category_code,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall7.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_usage_category_code.getUSAGE_CAT_CODE(), ic_usage_category_code.getUSAGE_CAT_NAME(),
						ic_usage_category_code.getUSAGE_TYPE(), ic_usage_category_code.getLINE_TYPE(),
						ic_usage_category_code.getAREA_CODE(), ic_usage_category_code.getUSAGE_CAT_ID(),user_name);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	public void deleteICUsageCatCode(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_USAGE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

//			System.out.println(out);   

	}

	public IC_USAGE_CATEGORY_CODE singleIC_USAGE_CATEGORY_CODE(int id) {

		IC_USAGE_CATEGORY_CODE singleIC_USAGE_CATEGORY_CODE = new IC_USAGE_CATEGORY_CODE();

		Map<String, Object> result = getAllStatesJdbcCall6.withCatalogName("USAGE_INFO").withProcedureName("EDIT_USAGE")
				.declareParameters(new SqlOutParameter("USAGEEDIT", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

//				System.out.println(result);

		String out = json.get("USAGEEDIT").toString();
		JSONArray jsonArray = new JSONArray(out);

//			    System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_USAGE_CATEGORY_CODE = new IC_USAGE_CATEGORY_CODE(jsonData.optString("USAGE_CAT_CODE"),
					jsonData.optString("USAGE_CAT_NAME"), jsonData.optString("USAGE_TYPE"),
					jsonData.optString("LINE_TYPE"), jsonData.optString("LINE_TYPE_NAME"),
					jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME"), jsonData.optInt("USAGE_CAT_ID"));
		}
		return singleIC_USAGE_CATEGORY_CODE;
	}

	public ArrayList<UsagArea> showAreaName() {
		ArrayList<UsagArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall2.withCatalogName("USAGE_INFO").withProcedureName("AREA_NAME")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new UsagArea(jsonData.optString("AREA_CODE"), jsonData.optString("AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<LineType> showLine() {
		ArrayList<LineType> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3.withCatalogName("USAGE_INFO").withProcedureName("LINETYPE")
				.declareParameters(new SqlOutParameter("LINEDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LINEDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LineType(jsonData.optString("LINE_TYPE"), jsonData.optString("LINE_TYPE_NAME")));
		}
		return showList;
	}

	public ArrayList<LocationShow> locationShow() {
		ArrayList<LocationShow> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall8.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_MASTER_LIST")
				.declareParameters(new SqlOutParameter("LOCDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationShow(Integer.valueOf(jsonData.optString("LOCATION_ID")),
					jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME"),
					jsonData.optString("STATUS")));
		}
		return showList;
	}

	public int insert_location_master(LocationInsert locationInsert) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall9.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public int deleteLocation(int locationId) {

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_LOCATION_MASTER")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<LocationInsert> locationEdit(int locationId) {
		ArrayList<LocationInsert> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("EDIT_LOCATION")
				.declareParameters(new SqlOutParameter("LOCEDIT", OracleTypes.CURSOR)).execute(locationId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCEDIT").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationInsert(jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME"),
					jsonData.optString("STATUS")));
		}
		return showList;
	}

	public int location_update(LocationInsert locationInsert, int locationId,String user_name) {
		if (locationInsert.getStatus() == null) {
			locationInsert.setStatus("A");
		}

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_LOCATION")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),user_name,
						locationId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

//	public ArrayList<Area> areaShow() {
//		ArrayList<Area> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
//				.withProcedureName("IC_GEN_AREA_LIST")
//				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("AREADATA").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new Area(jsonData.optString("GEN_AREA_CODE"), jsonData.optString("GEN_AREA_NAME"),
//					jsonData.optString("STATUS"), Integer.valueOf(jsonData.optString("GEN_AREA_ID"))));
//		}
//		return showList;
//	}
//
//	public int insert_area(LocationInsert locationInsert) {
//		if (locationInsert.getStatus() == null) {
//			locationInsert.setStatus("C");
//		}
//		System.out.println(locationInsert);
//
//		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
//				.withProcedureName("INSERT_IC_GEN_AREA")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
//						locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus());
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//		System.out.println(val);
//		return val;
//	}
//
//	public int deleteArea(int areaId) {
//
//		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("USAGE_INFO")
//				.withProcedureName("DETELE_IC_GEN_AREA")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(areaId);
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//
//		return val;
//	}
//
//	public ArrayList<LocationInsert> areaEdit(int areaId) {
//		ArrayList<LocationInsert> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("USAGE_INFO")
//				.withProcedureName("EDIT_IC_GEN_AREA")
//				.declareParameters(new SqlOutParameter("AREAEDIT", OracleTypes.CURSOR)).execute(areaId);
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("AREAEDIT").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new LocationInsert(jsonData.optString("GEN_AREA_CODE"), jsonData.optString("GEN_AREA_NAME"),
//					jsonData.optString("STATUS")));
//		}
//		return showList;
//	}
//
//	public int areaUpdate(LocationInsert locationInsert, int areaId) {
//		if (locationInsert.getStatus() == null) {
//			locationInsert.setStatus("A");
//		}
//
//		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("USAGE_INFO")
//				.withProcedureName("UPDATE_IC_GEN_AREA")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
//				.execute(locationInsert.getLocationCode(), locationInsert.getLocationName(), locationInsert.getStatus(),
//						areaId);
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//
//		return val;
//	}
	public ArrayList<IC_GEN_AREAmain> listIC_GEN_AREA() {
		ArrayList<IC_GEN_AREAmain> listIC_GEN_AREA = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_LIST")
				.declareParameters(new SqlOutParameter("AREADATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("AREADATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_GEN_AREA
					.add(new IC_GEN_AREAmain(jsonData.getString("GEN_AREA_CODE"), jsonData.getString("GEN_AREA_NAME"),
							jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("GEN_AREA_ID"))));
		}
		return listIC_GEN_AREA;
	}

	public void insertICGenArea(IC_GEN_AREAmain ic_gen_area,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall431.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_INSERT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_gen_area.getGEN_AREA_CODE(), ic_gen_area.getGEN_AREA_NAME(), ic_gen_area.getSTATUS(),user_name);

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();

	}

	// IC_GEN_AREA insert ends

//	IC_GEN_AREA single starts 

	public IC_GEN_AREAmain singleIC_GEN_AREA(int id) {

		IC_GEN_AREAmain singleIC_GEN_AREA = new IC_GEN_AREAmain();

		Map<String, Object> result = getAllStatesJdbcCall15.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_SINGLE")
				.declareParameters(new SqlOutParameter("PPDATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("PPDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_GEN_AREA = new IC_GEN_AREAmain(jsonData.optString("GEN_AREA_CODE"),
					jsonData.optString("GEN_AREA_NAME"), jsonData.optString("STATUS"), jsonData.optInt("GEN_AREA_ID"));
		}

		return singleIC_GEN_AREA;
	}

//	IC_GEN_AREA single ends

	// IC_GEN_AREA update starts

	public void editICGenArea(IC_GEN_AREAmain ic_gen_area,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall16.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_UPDATE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_gen_area.getGEN_AREA_CODE(), ic_gen_area.getGEN_AREA_NAME(), ic_gen_area.getSTATUS(),
						user_name,ic_gen_area.getGEN_AREA_ID());

		JSONObject json = new JSONObject(result);
//	System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	// IC_GEN_AREA update ends

	// IC_GEN_AREA delete starts

	public void deleteICGenArea(int id) {

		Map<String, Object> result = getAllStatesJdbcCall17.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_GEN_AREA_DELETE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();

	}

	public ArrayList<PowerPlantList> powerPlantShow() {
		ArrayList<PowerPlantList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall18.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_POWER_PLANT_LIST")
				.declareParameters(new SqlOutParameter("PLANTDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PLANTDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantList(jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME"),
					Integer.valueOf(jsonData.optString("NO_OF_UNIT")),
					Double.valueOf(jsonData.optString("INSTALLED_CAPACITY")),
					Double.valueOf(jsonData.optString("MAX_CAPACITY")), jsonData.optString("GRID_CODE"),
					jsonData.optString("GRID_DESC"), jsonData.optString("STATUS"), jsonData.optString("OWNER_CODE"),
					jsonData.optString("OWNER_NAME"), jsonData.optString("SHORT_NAME"),
					jsonData.optString("GEN_AREA_CODE"), jsonData.optString("GEN_AREA_NAME"),
					Integer.valueOf(jsonData.optString("PP_ID"))));
		}
		return showList;
	}

	public ArrayList<GenArea> genAreaLists() {
		ArrayList<GenArea> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall19.withCatalogName("USAGE_INFO")
				.withProcedureName("GENAREALIST").declareParameters(new SqlOutParameter("GENAREA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GENAREA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GenArea(jsonData.optString("GEN_AREA_CODE"), jsonData.optString("GEN_AREA_NAME")));
		}
		return showList;
	}

	public ArrayList<PPOwnerList> ppOwnerLists() {
		ArrayList<PPOwnerList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall20.withCatalogName("USAGE_INFO")
				.withProcedureName("PPOWNERLIST").declareParameters(new SqlOutParameter("PODATA", OracleTypes.CURSOR))
				.execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PPOwnerList(jsonData.optString("OWNER_CODE"), jsonData.optString("OWNER_NAME")));
		}
		return showList;
	}

	public ArrayList<GridList> gridLists() {
		ArrayList<GridList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall21.withCatalogName("USAGE_INFO").withProcedureName("GRIDLIST")
				.declareParameters(new SqlOutParameter("GRIDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("GRIDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new GridList(jsonData.optString("GRID_CODE"), jsonData.optString("GRID_DESC")));
		}
		return showList;
	}

	public int insert_power_plant(PowerPlantInsert powerPlantInsert) {
		if (powerPlantInsert.getStatus() == null) {
			powerPlantInsert.setStatus("C");
		}

		Map<String, Object> result = getAllStatesJdbcCall22.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(powerPlantInsert.getPowerPointCode(), powerPlantInsert.getPowerPointName(),
						powerPlantInsert.getNoOfUnit(), powerPlantInsert.getInstallenCapacity(),
						powerPlantInsert.getGridCode(), powerPlantInsert.getOwnerCode(),
						powerPlantInsert.getGenAreaCode(), powerPlantInsert.getMaxCapacity(),
						powerPlantInsert.getShortName(), powerPlantInsert.getStatus());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PowerPlantList> powerPlantEdits(String ppCode) {
		ArrayList<PowerPlantList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall23.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_POWER_PLANT_EDIT")
				.declareParameters(new SqlOutParameter("PPDATA", OracleTypes.CURSOR)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PPDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantList(jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME"),
					Integer.valueOf(jsonData.optString("NO_OF_UNIT")),
					Double.valueOf(jsonData.optString("INSTALLED_CAPACITY")),
					Double.valueOf(jsonData.optString("MAX_CAPACITY")), jsonData.optString("GRID_CODE"),
					jsonData.optString("GRID_DESC"), jsonData.optString("STATUS"), jsonData.optString("OWNER_CODE"),
					jsonData.optString("OWNER_NAME"), jsonData.optString("SHORT_NAME"),
					jsonData.optString("GEN_AREA_CODE"), jsonData.optString("GEN_AREA_NAME"),
					Integer.valueOf(jsonData.optString("PP_ID"))));
		}
		return showList;
	}

	public int update_power_plant(PowerPlantInsert powerPlantInsert, String id, String genACode, String OwnerCode,
			String gridCode) {
		if (powerPlantInsert.getStatus() == null) {
			powerPlantInsert.setStatus("YES");
		}
		if (powerPlantInsert.getGenAreaCode() == null) {
			powerPlantInsert.setGenAreaCode(genACode);
		}
		if (powerPlantInsert.getOwnerCode() == null) {
			powerPlantInsert.setOwnerCode(OwnerCode);
		}
		if (powerPlantInsert.getGridCode() == null) {
			powerPlantInsert.setGridCode(gridCode);
		}

		Map<String, Object> result = getAllStatesJdbcCall24.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(powerPlantInsert.getPowerPointName(), powerPlantInsert.getNoOfUnit(),
						powerPlantInsert.getInstallenCapacity(), powerPlantInsert.getGridCode(),
						powerPlantInsert.getOwnerCode(), powerPlantInsert.getGenAreaCode(),
						powerPlantInsert.getMaxCapacity(), powerPlantInsert.getShortName(),
						powerPlantInsert.getStatus(), id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deletePowerPoint(String ppCode) {

		Map<String, Object> result = getAllStatesJdbcCall25.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_POWER_PLANT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	// IC_DEMAND_PHASE_MST starts

	public ArrayList<IC_DEMAND_PHASE_MST> listIC_DEMAND_PHASE_MST() {

		ArrayList<IC_DEMAND_PHASE_MST> listIC_DEMAND_PHASE_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall26.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_LIST")
				.declareParameters(new SqlOutParameter("DEMANDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("DEMANDDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			listIC_DEMAND_PHASE_MST.add(new IC_DEMAND_PHASE_MST(jsonData.getString("DP_CODE"),
					jsonData.getString("DEMAND_PHASE"), Integer.valueOf(jsonData.getString("SRL_NO")),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("DP_ID"))));
		}

		return listIC_DEMAND_PHASE_MST;
	}

	// IC_DEMAND_PHASE_MST list ends

	// IC_DEMAND_PHASE_MST insert starts

	public void insertICDemandPhaseMst(IC_DEMAND_PHASE_MST ic_demand_phase_mst,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall27.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_demand_phase_mst.getDP_CODE(), ic_demand_phase_mst.getDEMAND_PHASE(),
						ic_demand_phase_mst.getSRL_NO(), ic_demand_phase_mst.getSTATUS(),user_name);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	public IC_DEMAND_PHASE_MST singleIC_DEMAND_PHASE_MST(int id) {

		IC_DEMAND_PHASE_MST singleIC_DEMAND_PHASE_MST = new IC_DEMAND_PHASE_MST();

		Map<String, Object> result = getAllStatesJdbcCall28.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_DEMAND_PHASE_MST_EDIT")
				.declareParameters(new SqlOutParameter("DPMDATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("DPMDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_DEMAND_PHASE_MST = new IC_DEMAND_PHASE_MST(jsonData.getString("DP_CODE"),
					jsonData.getString("DEMAND_PHASE"), Integer.valueOf(jsonData.getString("SRL_NO")),
					jsonData.getString("STATUS"), Integer.valueOf(jsonData.getString("DP_ID")));
		}

		return singleIC_DEMAND_PHASE_MST;
	}

//			IC_DEMAND_PHASE_MST single ends

	// IC_DEMAND_PHASE_MST update starts

	public void editICDemandPhaseMst(IC_DEMAND_PHASE_MST ic_demand_phase_mst,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall29.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_demand_phase_mst.getDEMAND_PHASE(), ic_demand_phase_mst.getSRL_NO(),
						ic_demand_phase_mst.getSTATUS(), ic_demand_phase_mst.getDP_CODE(),user_name,
						ic_demand_phase_mst.getDP_ID());

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();

	}

	// IC_DEMAND_PHASE_MST update ends

	// IC_DEMAND_PHASE_MST delete starts

	public void deleteICDemandPhaseMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall30.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_DEMAND_PHASE_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

//	public ArrayList<ActivityList> activityListShow() {
//		ArrayList<ActivityList> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
//				.withProcedureName("IC_ACTIVITY_MST_LIST")
//				.declareParameters(new SqlOutParameter("ACTIVITYDATA", OracleTypes.CURSOR)).execute();
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("ACTIVITYDATA").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new ActivityList(Integer.valueOf(jsonData.optString("ACTIVITY_ID")),
//					jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"),
//					jsonData.optString("STATUS")));
//		}
//		return showList;
//	}
//
//	public int insert_activity(ActivityInsert activityInsert) {
//		if (activityInsert.getStatus() == null) {
//			activityInsert.setStatus("C");
//		}
//		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
//				.withProcedureName("INSERT_IC_ACTIVITY_MST")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(
//						activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus());
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//		return val;
//	}
//
//	public ArrayList<ActivityInsert> activityedit(int activityId) {
//		ArrayList<ActivityInsert> showList = new ArrayList<>();
//
//		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
//				.withProcedureName("IC_ACTIVITY_MST_EDIT")
//				.declareParameters(new SqlOutParameter("ACTIDATA", OracleTypes.CURSOR)).execute(activityId);
//
//		JSONObject json = new JSONObject(result);
//		String jesonString = json.get("ACTIDATA").toString();
//		JSONArray jsonArray = new JSONArray(jesonString);
//
//		for (int i = 0; i < jsonArray.length(); i++) {
//			JSONObject jsonData = jsonArray.getJSONObject(i);
//			showList.add(new ActivityInsert(jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"),
//					jsonData.optString("STATUS")));
//		}
//		return showList;
//	}
//
//	public int updateActivity(ActivityInsert activityInsert, int activityId) {
//		if (activityInsert.getStatus() == null) {
//			activityInsert.setStatus("C");
//		}
//		Map<String, Object> result = getAllStatesJdbcCall13.withCatalogName("USAGE_INFO")
//				.withProcedureName("UPDATE_IC_ACTIVITY_MST")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
//				.execute(activityInsert.getActivityCode(), activityInsert.getActivityName(), activityInsert.getStatus(),
//						activityId);
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//		return val;
//	}
//
//	public int deleteActivity(int activityId) {
//
//		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
//				.withProcedureName("DETELE_IC_ACTIVITY_MST")
//				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(activityId);
//
//		JSONObject json = new JSONObject(result);
//		int val = Integer.valueOf(json.get("OUTPUT").toString());
//
//		return val;
//	}
	// IC_ACTIVITY_MST starts

	public ArrayList<IC_ACTIVITY_MST> listIC_ACTIVITY_MST() {

		ArrayList<IC_ACTIVITY_MST> listIC_ACTIVITY_MST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_LIST")
				.declareParameters(new SqlOutParameter("ACTIVITYDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String out = json.get("ACTIVITYDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			String stat = jsonData.optString("STATUS");

			if (stat.equals("Y")) {

				stat = "YES";
			} else if (stat.equals("N")) {

				stat = "NO";
			}

			listIC_ACTIVITY_MST.add(new IC_ACTIVITY_MST(jsonData.optInt("ACTIVITY_ID"),
					jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"), stat));
		}

		return listIC_ACTIVITY_MST;
	}

	// IC_ACTIVITY_MST list ends

	// IC_ACTIVITY_MST insert starts

	public void insertICActivityMst(IC_ACTIVITY_MST ic_activity_mst,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall11.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_activity_mst.getACTIVITY_CODE(), ic_activity_mst.getACTIVITY_NAME(),
						ic_activity_mst.getSTATUS(),user_name);

		JSONObject json = new JSONObject(result);
		String out = json.get("OUTPUT").toString();

	}

	public IC_ACTIVITY_MST singleIC_ACTIVITY_MST(int id) {

		IC_ACTIVITY_MST singleIC_ACTIVITY_MST = new IC_ACTIVITY_MST();

		Map<String, Object> result = getAllStatesJdbcCall12.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_ACTIVITY_MST_EDIT")
				.declareParameters(new SqlOutParameter("ACTIDATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);

		String out = json.get("ACTIDATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			singleIC_ACTIVITY_MST = new IC_ACTIVITY_MST(jsonData.optInt("ACTIVITY_ID"),
					jsonData.optString("ACTIVITY_CODE"), jsonData.optString("ACTIVITY_NAME"),
					jsonData.optString("STATUS"));
		}

		return singleIC_ACTIVITY_MST;
	}

//			IC_ACTIVITY_MST single ends

	// IC_ACTIVITY_MST update starts

	public void editICActivityMst(IC_ACTIVITY_MST ic_activity_mst,String user_name) {

		Map<String, Object> result = getAllStatesJdbcCall430.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(ic_activity_mst.getACTIVITY_ID(), ic_activity_mst.getACTIVITY_CODE(),
						ic_activity_mst.getACTIVITY_NAME(), ic_activity_mst.getSTATUS(),user_name);

		JSONObject json = new JSONObject(result);

		String out = json.get("OUTPUT").toString();

	}

	// IC_ACTIVITY_MST update ends

	// IC_ACTIVITY_MST delete starts

	public void deleteICActivityMst(int id) {

		Map<String, Object> result = getAllStatesJdbcCall14.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_ACTIVITY_MST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
//			System.out.println(result);
		String out = json.get("OUTPUT").toString();

	}

	public ArrayList<PeriodList> periodListShow() {
		ArrayList<PeriodList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall55.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IC_PERIOD_MST")
				.declareParameters(new SqlOutParameter("PEROPDDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PEROPDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PeriodList(jsonData.optString("YEAR_CODE"), jsonData.optString("PERIOD_CODE"),
					jsonData.optString("PERIOD_DESC"), jsonData.optString("FROM_DATE"), jsonData.optString("TO_DATE"),
					jsonData.optString("STATUS"), Integer.valueOf(jsonData.optString("PR_ID"))));
		}

		return showList;
	}

	public ArrayList<IppPaymentList> ippPaymentList1(String billCycleCode,String ppCode) {
		ArrayList<IppPaymentList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall56.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("PAYDATA", OracleTypes.CURSOR)).execute(billCycleCode, ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IppPaymentList(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("PP_CODE"),
					jsonData.optString("PP_NAME"), jsonData.optString("ENRG_PURCHASED"),
					jsonData.optString("PAY_AMOUNT"), jsonData.optString("PAY_DATE"),
					jsonData.optString("IPP_PAY_ID"),
					jsonData.optString("COUNTRY_CODE"),jsonData.optString("CONTRY_NAME"),
					jsonData.optString("CURR_CODE"), jsonData.optString("CURR_NAME"),
					jsonData.optString("STATUS")));
		}
		return showList;
	}

	public ArrayList<IppPaymentList> ippPaymentList(String billCycleCode,String user) {
		ArrayList<IppPaymentList> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall560.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_LIST_BLK")
				.declareParameters(new SqlOutParameter("PAYDATA", OracleTypes.CURSOR)).execute(billCycleCode,user);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IppPaymentList(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("PP_CODE"),
					jsonData.optString("PP_NAME").trim(), jsonData.optString("ENRG_PURCHASED"),
					jsonData.optString("PAY_AMOUNT"), jsonData.optString("PAY_DATE"),
					jsonData.optString("IPP_PAY_ID"),
					jsonData.optString("COUNTRY_CODE"),jsonData.optString("CONTRY_NAME"),
					jsonData.optString("CURR_CODE"), jsonData.optString("CURR_NAME"),
					jsonData.optString("STATUS")));
		}
		return showList;
	}

	public ArrayList<PowerPlantDropdown> pppDropdown(String user_name) {
		ArrayList<PowerPlantDropdown> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall57.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_POWER_PLANT_DROPDOWN")
				.declareParameters(new SqlOutParameter("PDDATA", OracleTypes.CURSOR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantDropdown(jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME")));
		}

		return showList;
	}

	public int insertPppPayment(InsertIppPayment insertIppPayment,String user_name) {
		if (insertIppPayment.getStatus() == null) {
			insertIppPayment.setStatus("C");
		}
		System.out.println("tHIUS" + insertIppPayment);

		Map<String, Object> result = getAllStatesJdbcCall58.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IPP_PAYMENT_LIST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertIppPayment.getBillCycleCode(), insertIppPayment.getPpCode(),
						insertIppPayment.getEngrPurchased(), insertIppPayment.getPayAmount(),
						insertIppPayment.getPayDate(), insertIppPayment.getStatus(),user_name);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PpModList> ppModListListShow(String periodCode, String user_name) {
		ArrayList<PpModList> ppModList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall59.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MOD_DATA").declareParameters(new SqlOutParameter("MODATA", OracleTypes.CURSOR))
				.execute(periodCode, user_name);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList.add(new PpModList(Integer.valueOf(jsonData.optString("PP_MOD_ID")),
					jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("STATUS"), jsonData.optString("PP_CODE"),
					jsonData.optString("PP_NAME")));
		}
		return ppModList;
	}

	public InsertPpMod ppModListListShows(String periodCode, String ppc) {
		InsertPpMod ppModList = null;

		Map<String, Object> result = getAllStatesJdbcCall590.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MOD_DATAS").declareParameters(new SqlOutParameter("MODATA", OracleTypes.CURSOR))
				.execute(periodCode, ppc);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList = new InsertPpMod(jsonData.optString("PP_MOD_ID"), jsonData.optString("FUEL_CODE"),
					jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("PP_CODE"), jsonData.optString("STATUS"));
		}
		return ppModList;
	}

	public int insertPpMod(InsertPpMod insertPpMod,String user_name) {
		System.out.println("This is in the dao " + insertPpMod);
		Map<String, Object> result = getAllStatesJdbcCall60.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertPpMod.getBillCycleCode(), insertPpMod.getPpCode(), insertPpMod.getStatus(),user_name);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int deleteIcPpPayment(int id) {

		Map<String, Object> result = getAllStatesJdbcCall61.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public int deletePpModUnit(int id) {

		Map<String, Object> result = getAllStatesJdbcCall720.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_UNIT_CODE")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public int deleteIcPpMod(int ppModId) {

		Map<String, Object> result = getAllStatesJdbcCall72.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(ppModId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<IcPpPaymentEdit> icPaymentEdit(String iPpPayId) {
		ArrayList<IcPpPaymentEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall62.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_PAYMENT_EDIT")
				.declareParameters(new SqlOutParameter("PAYMENTDATA", OracleTypes.CURSOR)).execute(iPpPayId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PAYMENTDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IcPpPaymentEdit(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("PP_NAME"),
					jsonData.optString("COUNTRY_CODE"),jsonData.optString("CONTRY_NAME"),
					String.valueOf(jsonData.optString("ENRG_PURCHASED")), jsonData.optString("PAY_AMOUNT"),
					jsonData.optString("CURR_CODE"), jsonData.optString("CURR_NAME"),jsonData.optString("STATUS")));
		}

		return showList;
	}

	public int updatePayment(IcPpPaymentEdit icPpPaymentEdit, int payId,String user_name) {
		if (icPpPaymentEdit.getStatus() == null) {
			icPpPaymentEdit.setStatus("C");
		}
		Map<String, Object> result = getAllStatesJdbcCall63.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_IPP_PAYMENT")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(icPpPaymentEdit.getPayAmount(), icPpPaymentEdit.getEnrgPuchansed(),icPpPaymentEdit.getCURR_CODE(),
						icPpPaymentEdit.getStatus(),user_name, payId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PowerPlantDropdown> ppDropdown(String billCycleCode, String user_name) {
		ArrayList<PowerPlantDropdown> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall64.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_IPP_POWER_PLANT_DROPDOWN")
				.declareParameters(new SqlOutParameter("PDDATAS", OracleTypes.CURSOR)).execute(user_name);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("PDDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PowerPlantDropdown(jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME")));
		}

		return showList;
	}

	public ArrayList<PpModEdit> ppModEdit(int ppModId) {
		ArrayList<PpModEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall65.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_MOD_EDIT")
				.declareParameters(new SqlOutParameter("EMODDATA", OracleTypes.CURSOR)).execute(ppModId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("EMODDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PpModEdit(jsonData.optString("PP_MOD_ID"), jsonData.optString("BILL_CYCLE_CODE"),
					jsonData.optString("PP_CODE"), jsonData.optString("PP_NAME")));
		}

		return showList;
	}

	public int updatePpModBulk(ModUnitBulk modUnitBulk,String user_name) {
		if (modUnitBulk.getFusc().equals("")) {
			modUnitBulk.setFusc("0");
		}
		Map<String, Object> result = getAllStatesJdbcCall710.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_PP_UNIT_MOD_BLK")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(modUnitBulk.grGen, modUnitBulk.stuse, modUnitBulk.fusc,user_name, modUnitBulk.unitid);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int updatePpMod(InsertPpMod insertPpMod, String pp_code, String id,String user_name) {
		if (insertPpMod.getPpCode() == null) {
			insertPpMod.setPpCode(pp_code);
		}
		Map<String, Object> result = getAllStatesJdbcCall66.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_PP_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(insertPpMod.getBillCycleCode(), insertPpMod.getPpCode(),user_name, id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<PpUnitDtlDrop> ppUnitDropdown(String ppCode) {
		ArrayList<PpUnitDtlDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall67.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_UNIT_DTL_DROP")
				.declareParameters(new SqlOutParameter("UNITDILDATA", OracleTypes.CURSOR)).execute(ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNITDILDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new PpUnitDtlDrop(jsonData.optString("PP_UNIT_CODE"), jsonData.optString("PP_UNIT_NAME")));
		}

		return showList;
	}

	public ArrayList<UnitModList> UnitModShow(String billCycleCode, String ppCode) {
		ArrayList<UnitModList> ppModList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall68.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_PP_UNIT_MOD_LIST")
				.declareParameters(new SqlOutParameter("UNDATA", OracleTypes.CURSOR)).execute(billCycleCode, ppCode);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			ppModList.add(new UnitModList(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("PP_CODE"),
					jsonData.optString("PP_NAME"), jsonData.optString("PP_UNIT_CODE"),
					jsonData.optString("PP_UNIT_NAME"), jsonData.optString("ENRG_GEN"),
					jsonData.optString("ENRG_CONS_SELF"), jsonData.optString("FUEL_USED"), jsonData.optString("STATUS"),
					Integer.valueOf(jsonData.optString("PP_UNIT_MOD_ID"))));
		}
		return ppModList;
	}

	public int insertUnitMod(UnitModInset unitModInset,String user_name) {
		if (unitModInset.getSTATUS() == null) {
			unitModInset.setSTATUS("N");
		}
		//if (unitModInset.getFuelUsed().equals("")) {
			unitModInset.setFuelUsed("0");
		//}
		Map<String, Object> result = getAllStatesJdbcCall69.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IPP_UNIT_MOD_LIST")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(unitModInset.getBillCycleCode(), unitModInset.getPpUnitCode(), unitModInset.getEnrgGen(),
						unitModInset.getEnrgConsSelf(), unitModInset.getSTATUS(), unitModInset.getFuelUsed(),
						unitModInset.getPpCode(),user_name);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ModUnitBulk ppUnitEdits(String id) {
		ModUnitBulk showList = null;

		Map<String, Object> result = getAllStatesJdbcCall432.withCatalogName("USAGE_INFO")
				.withProcedureName("PP_UNIT_CODE_EDIT")
				.declareParameters(new SqlOutParameter("UNCODATA", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNCODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList = new ModUnitBulk(jsonData.optString("PP_UNIT_MOD_ID"), jsonData.optString("PP_NAME"),
					jsonData.optString("ENRG_GEN"), jsonData.optString("ENRG_CONS_SELF"),
					jsonData.optString("FUEL_USED"), jsonData.optString("STATUS"));
		}

		return showList;
	}

	public ArrayList<UnirmodEdit> ppUnitEdit(int ppUnitModId) {
		ArrayList<UnirmodEdit> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall70.withCatalogName("USAGE_INFO")
				.withProcedureName("PP_UNIT_CODE_EDIT")
				.declareParameters(new SqlOutParameter("UNCODATA", OracleTypes.CURSOR)).execute(ppUnitModId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("UNCODATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new UnirmodEdit(jsonData.optString("PP_UNIT_CODE"), jsonData.optString("PP_UNIT_NAME"),
					jsonData.optString("ENRG_GEN"), jsonData.optString("ENRG_CONS_SELF"),
					jsonData.optString("FUEL_USED"), jsonData.optString("STATUS"),
					Integer.valueOf(jsonData.optString("PP_UNIT_MOD_ID"))));
		}

		return showList;
	}

	public int updatePpModUnit(UnitModInset unitModInset, String ppUnitCode, int id,String user_name) {
		if (unitModInset.getPpUnitCode() == null) {
			unitModInset.setPpUnitCode(ppUnitCode);
		}
		//if (unitModInset.getFuelUsed().equals("")) {
			unitModInset.setFuelUsed("0");
		//}
		Map<String, Object> result = getAllStatesJdbcCall71.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_PP_UNIT_MOD")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(unitModInset.getPpUnitCode(), unitModInset.getEnrgGen(), unitModInset.getEnrgConsSelf(),
						unitModInset.getFuelUsed(), unitModInset.getSTATUS(),user_name, id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_REV_PER_ZONE> listIC_REV_PER_ZONE(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_ZONE> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1000.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_Zone_wize_performance")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_PER_ZONE(jsonData.optString("TP"), jsonData.optString("ZONE_NAME"),
					jsonData.optString("ZC_NAME"), jsonData.optString("PREV_YEAR"), jsonData.optString("CURR_YEAR"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_SL_TARGET"))),
					jsonData.optString("PREV_YR_SL_ACHIVE"), jsonData.optString("PREV_YR_SL_UPTO"),
					jsonData.optString("CURR_YR_SL_TARGET"), jsonData.optString("CURR_MONTH_SL"),
					jsonData.optString("CURR_YR_SL_UPTO"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_CI_TARGET"))),
					jsonData.optString("CURR_YR_CI_UPTO"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_CB_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_REC"))),
					jsonData.optString("PREV_YR_EQM"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_MONTH_REC"))),
					jsonData.optString("CURR_MONTH_EQM"), jsonData.optString("PREV_YR_MON"),
					jsonData.optString("CURR_YR_MON"), jsonData.optString("PREV_FIN_LAST_MONTH")));
		}
		return showList;
	}

	public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> listIC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(String officeCode,
			String two) {
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5000.withCatalogName("pkg_ES_circle_wise_com_stat")
				.withProcedureName("dpd_circle_wise_com_stat")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(orepless(jsonData.optString("TP1")),
					jsonData.optString("ZONE_NAME"), orepless(jsonData.optString("TP2")), jsonData.optString("CIRCLE_NAME"),
					orepless(jsonData.optString("NO_OF_ACTIVE_CONS")), orepless(jsonData.optString("IMPORT_MKWH")),
					orepless(jsonData.optString("SALE_MKWH")), orepless(jsonData.optString("DIST_SYS_LOSS")), "",
					orepless(jsonData.optString("NET_BILL_MTK")), orepless(jsonData.optString("NET_COLL_MTK")),
					orepless(jsonData.optString("CB_RATIO")), orepless(jsonData.optString("CI_RATIO")),
					orepless(jsonData.optString("BILL_RATE")),
					orepless(jsonData.optString("REC_AMT")), orepless(jsonData.optString("EQM"))));
		}
		return showList;
	}

	public ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> listIC_ES_Z_C_COM_OPR_STAT_BPDB_FY(String officeCode,
			String two) {
		ArrayList<IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall5001.withCatalogName("pkg_ES_circle_wise_com_st_upto")
				.withProcedureName("dpd_circle_wise_com_stat_upto")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_ES_Z_C_COM_OPR_STAT_BPDB_CR_MON(jsonData.optString("TP1"),
					jsonData.optString("ZONE_NAME"), jsonData.optString("TP2"), jsonData.optString("CIRCLE_NAME"),
					jsonData.optString("NO_OF_ACTIVE_CONS"), jsonData.optString("IMPORT_MKWH"),
					jsonData.optString("SALE_MKWH"), jsonData.optString("DIST_SYS_LOSS"), "",
					jsonData.optString("NET_BILL_MTK"), jsonData.optString("NET_COLL_MTK"),
					jsonData.optString("CB_RATIO"), jsonData.optString("CI_RATIO"), jsonData.optString("BILL_RATE"),
					jsonData.optString("REC_AMT"), jsonData.optString("EQM")));
		}
		return showList;
	}

	public ArrayList<IC_REV_PER_CIRCLE> listIC_REV_PER_CIRCLE(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_CIRCLE> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10000.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_circle_wize_performance")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_PER_CIRCLE(jsonData.optString("TP"), jsonData.optString("CIRCLE_NAME"),
					jsonData.optString("CL_NAME"), jsonData.optString("PREV_YEAR"), jsonData.optString("CURR_YEAR"),
					jsonData.optString("PREV_YR_MON"),
					jsonData.optString("CURR_YR_MON"),
					jsonData.optString("PREV_FIN_LAST_MON"),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_SL_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_SL_ACHIVE"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_SL_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_SL_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_MONTH_SL"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_SL_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_CI_TARGET"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_CI_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_YR_CB_UPTO"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_REC"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("PREV_YR_EQM"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_MONTH_REC"))),
					String.format(Locale.US, "%.2f", Float.valueOf(jsonData.optString("CURR_MONTH_EQM")))));
		}
		return showList;
	}

	public ArrayList<IC_CIRCLE_MST> getCircleList(String officeCode, String id) {

		ArrayList<IC_CIRCLE_MST> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall1003.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_circle").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(id, officeCode);
		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {
			JSONObject f = e.getJSONObject(i);
			b.add(new IC_CIRCLE_MST(f.optString("CIRCLE_CODE"), f.optString("CIRCLE_NAME")));
		}
		return b;
	}

	public ArrayList<IC_REV_PER_DIV_MODEL> listIC_REV_PER_DIV(String officeCode, String one, String two) {
		ArrayList<IC_REV_PER_DIV_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1004.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_Sector_wise_rec")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);

			showList.add(new IC_REV_PER_DIV_MODEL(jsonData.optString("TP"), jsonData.optString("CIRCLE_NAME"),
					jsonData.optString("CL_NAME"), jsonData.optString("REC_GOVT"), jsonData.optString("EQM_GOVT"),
					jsonData.optString("REC_AUTO"), jsonData.optString("EQM_AUTO"), jsonData.optString("REC_PRIV"),
					jsonData.optString("REC_TOT"), jsonData.optString("EQM_TOT")));
		}
		return showList;
	}

	public ArrayList<IC_REV_CAT_ACC_REC_MODEL> listIC_REV_CAT_ACC_REC_MODEL(String officeCode, String one, String two) {
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1002.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_cat_wise_rec_snd")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, two);
		// System.out.println(result);
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_CAT_ACC_REC_MODEL(jsonData.optString("TP"), jsonData.optString("CIRCLE_NAME"),
					jsonData.optString("CL_NAME"), jsonData.optString("REC_LTA"), jsonData.optString("EQM_LTA"),
					jsonData.optString("REC_LTB"), jsonData.optString("EQM_LTB"), jsonData.optString("REC_LTC1"),
					jsonData.optString("EQM_LTC1"), jsonData.optString("REC_LTD1"), jsonData.optString("EQM_LTD1"),
					jsonData.optString("REC_LTD2"), jsonData.optString("EQM_LTD2"), jsonData.optString("REC_LTE"),
					jsonData.optString("EQM_LTE"), jsonData.optString("REC_MT2"), jsonData.optString("EQM_MT2"),
					jsonData.optString("REC_MT3"), jsonData.optString("EQM_MT3"), jsonData.optString("REC_MT5"),
					jsonData.optString("EQM_MT5"), jsonData.optString("REC_TOT"), jsonData.optString("EQM_TOT")));
		}
		return showList;
	}
	
	public ArrayList<IC_REV_CAT_ACC_REC_MODEL> listIC_REV_CAT_ACC_REC_MODEL_two(String officeCode, String one, String three) {
		ArrayList<IC_REV_CAT_ACC_REC_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall10022.withCatalogName("pkg_Revenue_Report")
				.withProcedureName("dpd_cat_wise_rec_circle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, one, three);
		// System.out.println(result);
		JSONObject json = new JSONObject(result);
		String jesonString = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_REV_CAT_ACC_REC_MODEL(jsonData.optString("TP"), jsonData.optString("CIRCLE_NAME"),
					jsonData.optString("CL_NAME"), jsonData.optString("REC_LTA"), jsonData.optString("EQM_LTA"),
					jsonData.optString("REC_LTB"), jsonData.optString("EQM_LTB"), jsonData.optString("REC_LTC1"),
					jsonData.optString("EQM_LTC1"), jsonData.optString("REC_LTD1"), jsonData.optString("EQM_LTD1"),
					jsonData.optString("REC_LTD2"), jsonData.optString("EQM_LTD2"), jsonData.optString("REC_LTE"),
					jsonData.optString("EQM_LTE"), jsonData.optString("REC_MT2"), jsonData.optString("EQM_MT2"),
					jsonData.optString("REC_MT3"), jsonData.optString("EQM_MT3"), jsonData.optString("REC_MT5"),
					jsonData.optString("EQM_MT5"), jsonData.optString("REC_TOT"), jsonData.optString("EQM_TOT")));
		}
		return showList;
	}
	public ArrayList<Month_Dropdown> months(String officeCode) {
		ArrayList<Month_Dropdown> monthDropdown = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall1063.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_bill_cycle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

		JSONObject json = new JSONObject(result);
		String jsonString = json.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(jsonString);
		for (int i = 0; i < e.length(); i++) {
			JSONObject obj = e.getJSONObject(i);
			monthDropdown.add(new Month_Dropdown(obj.optString("BILL_CYCLE_CODE"), obj.optString("BILL_CYCLE_DESC")));
		}
		return monthDropdown;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_ACC_REC(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall640.withCatalogName("pkg_ES_cat_wise_bill")
				.withProcedureName("dpd_cat_wise_bill_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.optString("YEAR_CODE"),
						jsonData.optString("REC_A"), jsonData.optString("REC_B"), jsonData.optString("REC_C"),
						jsonData.optString("REC_D"), jsonData.optString("REC_E"), jsonData.optString("REC_F"),
						jsonData.optString("REC_J"), jsonData.optString("REC_G1"), jsonData.optString("REC_G2"),
						jsonData.optString("REC_G3"), jsonData.optString("REC_H"), jsonData.optString("REC_I1"),
						jsonData.optString("REC_I2"), jsonData.optString("REC_I3"), jsonData.optString("REC_I5"),
						jsonData.optString("REC_DESA"), jsonData.optString("TOTAL")));
			}
		}

		System.out.println(iC_ES_CAT_ACC_REC_K);

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_ACC_REC2(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall650.withCatalogName("pkg_ES_cat_wise_bill")
				.withProcedureName("dpd_cat_wise_bill_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.optString("YRMON"),
						jsonData.optString("REC_LTA"), jsonData.optString("REC_LTB"), jsonData.optString("REC_LTC1"),
						jsonData.optString("REC_LTC2"), jsonData.optString("REC_LTD1"), jsonData.optString("REC_LTD3"),
						jsonData.optString("REC_LTE"), jsonData.optString("REC_LTT"), jsonData.optString("REC_MT1"),
						jsonData.optString("REC_MT2"), jsonData.optString("REC_MT3"), jsonData.optString("REC_MT4"),
						jsonData.optString("REC_MT5"), jsonData.optString("REC_MT6"), jsonData.optString("REC_EHT1"),
						jsonData.optString("REC_EHT2"), jsonData.optString("REC_HT1"), jsonData.optString("REC_HT2"),
						jsonData.optString("REC_HT3"), jsonData.optString("REC_HT4"), jsonData.optString("REC_LTD2"),
						jsonData.optString("REC_G1"), jsonData.optString("REC_I1"), jsonData.optString("REC_I2"),
						jsonData.optString("REC_I3"), jsonData.optString("REC_I5"), jsonData.optString("REC_DESA"),
						jsonData.optString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_BILL_AMT(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall666.withCatalogName("pkg_ES_cat_wise_Bill_AMT")
				.withProcedureName("dpd_cat_wise_Bill_AMT_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.optString("YEAR_CODE"),
						jsonData.optString("REC_A"), jsonData.optString("REC_B"), jsonData.optString("REC_C"),
						jsonData.optString("REC_D"), jsonData.optString("REC_E"), jsonData.optString("REC_F"),
						jsonData.optString("REC_J"), jsonData.optString("REC_G1"), jsonData.optString("REC_G2"),
						jsonData.optString("REC_G3"), jsonData.optString("REC_H"), jsonData.optString("REC_I1"),
						jsonData.optString("REC_I2"), jsonData.optString("REC_I3"), jsonData.optString("REC_I5"),
						jsonData.optString("REC_DESA"), jsonData.optString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_BILL_AMT2(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall670.withCatalogName("pkg_ES_cat_wise_Bill_AMT")
				.withProcedureName("dpd_cat_wise_Bill_AMT_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.optString("YRMON"),
						jsonData.optString("REC_LTA"), jsonData.optString("REC_LTB"), jsonData.optString("REC_LTC1"),
						jsonData.optString("REC_LTC2"), jsonData.optString("REC_LTD1"), jsonData.optString("REC_LTD3"),
						jsonData.optString("REC_LTE"), jsonData.optString("REC_LTT"), jsonData.optString("REC_MT1"),
						jsonData.optString("REC_MT2"), jsonData.optString("REC_MT3"), jsonData.optString("REC_MT4"),
						jsonData.optString("REC_MT5"), jsonData.optString("REC_MT6"), jsonData.optString("REC_EHT1"),
						jsonData.optString("REC_EHT2"), jsonData.optString("REC_HT1"), jsonData.optString("REC_HT2"),
						jsonData.optString("REC_HT3"), jsonData.optString("REC_HT4"), jsonData.optString("REC_LTD2"),
						jsonData.optString("REC_G1"), jsonData.optString("REC_I1"), jsonData.optString("REC_I2"),
						jsonData.optString("REC_I3"), jsonData.optString("REC_I5"), jsonData.optString("REC_DESA"),
						jsonData.optString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_K> listIC_ES_CAT_BILL_RATE(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_K> iC_ES_CAT_ACC_REC_K = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall680.withCatalogName("pkg_ES_cat_wise_Billrate")
				.withProcedureName("dpd_cat_wise_Billrate_upto1617")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_K.add(new IC_ES_CAT_ACC_REC_K(jsonData.optString("YEAR_CODE"),
						jsonData.optString("REC_A"), jsonData.optString("REC_B"), jsonData.optString("REC_C"),
						jsonData.optString("REC_D"), jsonData.optString("REC_E"), jsonData.optString("REC_F"),
						jsonData.optString("REC_J"), jsonData.optString("REC_G1"), jsonData.optString("REC_G2"),
						jsonData.optString("REC_G3"), jsonData.optString("REC_H"), jsonData.optString("REC_I1"),
						jsonData.optString("REC_I2"), jsonData.optString("REC_I3"), jsonData.optString("REC_I5"),
						jsonData.optString("REC_DESA"), jsonData.optString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_K;
	}

	public ArrayList<IC_ES_CAT_ACC_REC_KK> listIC_ES_CAT_BILL_RATE2(String month, String officeCode) {
		ArrayList<IC_ES_CAT_ACC_REC_KK> iC_ES_CAT_ACC_REC_KK = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall690.withCatalogName("pkg_ES_cat_wise_Billrate")
				.withProcedureName("dpd_cat_wise_Billrate_from1718")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);

		JSONObject json = new JSONObject(result);

		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);

		System.out.println(jsonArray);

		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				iC_ES_CAT_ACC_REC_KK.add(new IC_ES_CAT_ACC_REC_KK(jsonData.optString("YRMON"),
						jsonData.optString("REC_LTA"), jsonData.optString("REC_LTB"), jsonData.optString("REC_LTC1"),
						jsonData.optString("REC_LTC2"), jsonData.optString("REC_LTD1"), jsonData.optString("REC_LTD3"),
						jsonData.optString("REC_LTE"), jsonData.optString("REC_LTT"), jsonData.optString("REC_MT1"),
						jsonData.optString("REC_MT2"), jsonData.optString("REC_MT3"), jsonData.optString("REC_MT4"),
						jsonData.optString("REC_MT5"), jsonData.optString("REC_MT6"), jsonData.optString("REC_EHT1"),
						jsonData.optString("REC_EHT2"), jsonData.optString("REC_HT1"), jsonData.optString("REC_HT2"),
						jsonData.optString("REC_HT3"), jsonData.optString("REC_HT4"), jsonData.optString("REC_LTD2"),
						jsonData.optString("REC_G1"), jsonData.optString("REC_I1"), jsonData.optString("REC_I2"),
						jsonData.optString("REC_I3"), jsonData.optString("REC_I5"), jsonData.optString("REC_DESA"),
						jsonData.optString("TOTAL")));
			}
		}

		return iC_ES_CAT_ACC_REC_KK;
	}

	public ArrayList<DpdBrebStatementDetail> listIC_ES_COM_OPR_STAT_REB(String month, String officeCode) {
		ArrayList<DpdBrebStatementDetail> dpdBrebStatementDetail = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3000.withCatalogName("pkg_ES_BREB_STATEMENT_11_12")
				.withProcedureName("dpd_BREB_STATEMENT_detail")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpdBrebStatementDetail.add(new DpdBrebStatementDetail(jsonData.optString("TP"),
						jsonData.optString("LOCATION_NAME"), jsonData.optString("TP2"),
						jsonData.optString("CUSTOMER_NAME"), jsonData.optString("ENRG_UNIT"),
						jsonData.optString("PFC_UNIT"), jsonData.optString("BUS_LOSS"),
						jsonData.optString("TOTAL_UNIT"), jsonData.optString("ENRG_CHARGE"),
						jsonData.optString("PFC_CHARGE"), jsonData.optString("BUS_LOSS_CHARGE"),
						jsonData.optString("TOTAL_BILL"), jsonData.optString("TOTAL_COLL"),
						jsonData.optString("REC_PREV"), jsonData.optString("REC_CURR")));
			}
		}
		return dpdBrebStatementDetail;
	}

	public ArrayList<BrebStatementSummary> listIC_ES_COM_OPR_STAT_REB_two(String month, String officeCode) {
		ArrayList<BrebStatementSummary> brebStatementSummary = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3001.withCatalogName("pkg_ES_BREB_STATEMENT_11_12")
				.withProcedureName("dpd_BREB_STATEMENT_summary")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				brebStatementSummary.add(new BrebStatementSummary(jsonData.optString("YRMON"),
						jsonData.optString("ENRGSALE"), jsonData.optString("PFCSALE"), jsonData.optString("BUSSALE"),
						jsonData.optString("TOTENRGSALE"), jsonData.optString("ENRGBILLAMT"),
						jsonData.optString("PFCBILLAMT"), jsonData.optString("BUSBILLAMT"),
						jsonData.optString("TOTBILLAMT"), jsonData.optString("COLL"),
						jsonData.optString("REC_ENRG_PFC"), jsonData.optString("REC_LPS"),
						jsonData.optString("REC_TOT")));
			}
		}
		return brebStatementSummary;
	}

	public ArrayList<IC_PERIOD_MST1> d(String officeCode) {
		ArrayList<IC_PERIOD_MST1> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall3002.withCatalogName("PKG_GEN_DASH_BOARD")
				.withProcedureName("dpd_bill_cycle")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode);

		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_PERIOD_MST1(null, f.optString("BILL_CYCLE_CODE"), f.optString("BILL_CYCLE_DESC"), null));
		}
		return b;
	}

	public ArrayList<DPD_MON_SALE_LOSS_MODEL> IC_ES_YR_MON_SALES_one(String month, String officeCode) {
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3003.withCatalogName("pkg_ES_yr_mon_gen_sale_loss")
				.withProcedureName("dpd_mon_gen_sale_loss")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				dPD_MON_SALE_LOSS_MODEL.add(new DPD_MON_SALE_LOSS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
						jsonData.optString("TP"), jsonData.optString("OWNER_TYPE"),
						!jsonData.optString("ENRG_GEN").equals("0") ? jsonData.optString("ENRG_GEN") : "",
						!jsonData.optString("NET_GEN").equals("0") ? jsonData.optString("NET_GEN") : "",
						!jsonData.optString("AUX_USEF").equals("0") ? jsonData.optString("AUX_USEF") : "",
						!jsonData.optString("AUX_USE_PER").equals("0") ? jsonData.optString("AUX_USE_PER") : "",
						!jsonData.optString("PDB_ZONE").equals("0") ? jsonData.optString("PDB_ZONE") : "",
						!jsonData.optString("DPDC").equals("0") ? jsonData.optString("DPDC") : "",
						!jsonData.optString("DESCO").equals("0") ? jsonData.optString("DESCO") : "",
						!jsonData.optString("WZPDCL").equals("0") ? jsonData.optString("WZPDCL") : "",
						!jsonData.optString("PBS").equals("0") ? jsonData.optString("PBS") : "",
						!jsonData.optString("NESCO").equals("0") ? jsonData.optString("NESCO") : "",
						!jsonData.optString("TOTAL_IMPORT").equals("0") ? jsonData.optString("TOTAL_IMPORT") : "",
						!jsonData.optString("NON_GRID_GEN").equals("0") ? jsonData.optString("NON_GRID_GEN") : "",
						!jsonData.optString("TRANS_LOSS").equals("0") ? jsonData.optString("TRANS_LOSS") : "",
						!jsonData.optString("TRANS_LOSS_PER").equals("0") ? jsonData.optString("TRANS_LOSS_PER") : ""));
			}
		}
		return dPD_MON_SALE_LOSS_MODEL;
	}

	/*public ArrayList<DPD_MON_SALE_LOSS_MODEL> IC_ES_YR_MON_SALES_two(String month, String officeCode) {
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3004.withCatalogName("pkg_ES_yr_mon_gen_sale_loss")
				.withProcedureName("dpd_yr_gen_sale_loss")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		System.out.println(out);
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				dPD_MON_SALE_LOSS_MODEL.add(new DPD_MON_SALE_LOSS_MODEL(jsonData.optString("YEAR_CODE"),
						jsonData.optString("TP"), jsonData.optString("OWNER_TYPE"),
						!jsonData.optString("ENRG_GEN").equals("0") ? jsonData.optString("ENRG_GEN") : "",
						!jsonData.optString("NET_GEN").equals("0") ? jsonData.optString("NET_GEN") : "",
						!jsonData.optString("AUX_USEF").equals("0") ? jsonData.optString("AUX_USEF") : "",
						!jsonData.optString("AUX_USE_PER").equals("0") ? jsonData.optString("AUX_USE_PER") : "",
						!jsonData.optString("PDB_ZONE").equals("0") ? jsonData.optString("PDB_ZONE") : "",
						!jsonData.optString("DPDC").equals("0") ? jsonData.optString("DPDC") : "",
						!jsonData.optString("DESCO").equals("0") ? jsonData.optString("DESCO") : "",
						!jsonData.optString("WZPDCL").equals("0") ? jsonData.optString("WZPDCL") : "",
						!jsonData.optString("PBS").equals("0") ? jsonData.optString("PBS") : "",
						!jsonData.optString("NESCO").equals("0") ? jsonData.optString("NESCO") : "",
						!jsonData.optString("TOTAL_IMPORT").equals("0") ? jsonData.optString("TOTAL_IMPORT") : "",
						!jsonData.optString("NON_GRID_GEN").equals("0") ? jsonData.optString("NON_GRID_GEN") : "",
						!jsonData.optString("TRANS_LOSS").equals("0") ? jsonData.optString("TRANS_LOSS") : "",
						!jsonData.optString("TRANS_LOSS_PER").equals("0") ? jsonData.optString("TRANS_LOSS_PER") : ""));
			}
		}
		return dPD_MON_SALE_LOSS_MODEL;

	}*/
	public String orepless(String geto) {
		String emptstr="";
		if(geto.equals("0")) {
			emptstr="";
		}else {
			emptstr=geto;
		}
		return emptstr;
	}
	public ArrayList<DPD_MON_SALE_LOSS_MODEL> IC_ES_YR_MON_SALES_two(String month, String officeCode) {
		ArrayList<DPD_MON_SALE_LOSS_MODEL> dPD_MON_SALE_LOSS_MODEL = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3004.withCatalogName("pkg_ES_yr_mon_gen_sale_loss")
				.withProcedureName("dpd_yr_gen_sale_loss")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);

				dPD_MON_SALE_LOSS_MODEL.add(new DPD_MON_SALE_LOSS_MODEL(
				orepless(jsonData.optString("YEAR_CODE")),
				orepless(jsonData.optString("TP")),
				orepless(jsonData.optString("OWNER_TYPE")),
				orepless(jsonData.optString("ENRG_GEN")),
				orepless(jsonData.optString("NET_GEN")),
				orepless(jsonData.optString("AUX_USEF")),
				orepless(jsonData.optString("AUX_USE_PER")),
				orepless(jsonData.optString("PDB_ZONE")),
				orepless(jsonData.optString("DPDC")),
				orepless(jsonData.optString("DESCO")),
				orepless(jsonData.optString("WZPDCL")),
				orepless(jsonData.optString("PBS")),
				orepless(jsonData.optString("NESCO")),
				orepless(jsonData.optString("TOTAL_IMPORT")),
				orepless(jsonData.optString("NON_GRID_GEN")),
				orepless(jsonData.optString("TRANS_LOSS")),
																																			orepless(jsonData.optString("TRANS_LOSS_PER"))));
			}
		}
		return dPD_MON_SALE_LOSS_MODEL;

	}

	public ArrayList<Dpd_Year> Dpd_Year_Gen_sale(String month, String officeCode) {
		ArrayList<Dpd_Year> dpd_year = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3005.withCatalogName("pkg_ES_yr_mon_gen_sale")
				.withProcedureName("dpd_yr_gen_sale")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpd_year.add(new Dpd_Year(jsonData.optString("YEAR_CODE"), jsonData.optString("OWNER_TYPE"),
						orepless(jsonData.optString("ENRG_GEN")),
						orepless(jsonData.optString("AUX_USEF")),
						orepless(jsonData.optString("NET_GEN")),
						orepless(jsonData.optString("UT_SALES")),
						orepless(jsonData.optString("UT_SYSTEM_LOSS")),
						orepless(jsonData.optString("UT_NET_BILL")),
						orepless(jsonData.optString("UT_NET_COLL")),
						orepless(jsonData.optString("UT_CB_RATIO")),
						orepless(jsonData.optString("UT_CI_RARIO")),
						orepless(jsonData.optString("DT_IMPORT")),
						orepless(jsonData.optString("DT_SALES")),
						orepless(jsonData.optString("DT_SYSTEM_LOSS")),
						orepless(jsonData.optString("DT_NET_BILL")),
						orepless(jsonData.optString("DT_NET_COLL")),
						orepless(jsonData.optString("DT_CB_RATIO")),
						orepless(jsonData.optString("DT_CI_RARIO")),
						orepless(jsonData.optString("DT_REC")),
						orepless(jsonData.optString("DT_EQM"))));
			}
		}

		return dpd_year;
	}

	public ArrayList<Dpd_Month> Dpd_Month_Gen_sale(String month, String officeCode) {
		ArrayList<Dpd_Month> dpd_month = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3006.withCatalogName("pkg_ES_yr_mon_gen_sale")
				.withProcedureName("dpd_mon_gen_sale")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				dpd_month.add(new Dpd_Month(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("OWNER_TYPE"),
							orepless(jsonData.optString("ENRG_GEN")),
							orepless(jsonData.optString("AUX_USEF")),
							orepless(jsonData.optString("NET_GEN")),
							orepless(jsonData.optString("UT_SALES")),
							orepless(jsonData.optString("UT_SYSTEM_LOSS")),
							orepless(jsonData.optString("UT_NET_BILL")),
							orepless(jsonData.optString("UT_NET_COLL")),
							orepless(jsonData.optString("UT_CB_RATIO")),
							orepless(jsonData.optString("UT_CI_RARIO")),
							orepless(jsonData.optString("DT_IMPORT")),
							orepless(jsonData.optString("DT_SALES")),
							orepless(jsonData.optString("DT_SYSTEM_LOSS")),
							orepless(jsonData.optString("DT_NET_BILL")),
							orepless(jsonData.optString("DT_NET_COLL")),
							orepless(jsonData.optString("DT_CB_RATIO")),
							orepless(jsonData.optString("DT_CI_RARIO")),
							orepless(jsonData.optString("DT_REC")),
							orepless(jsonData.optString("DT_EQM"))));
			}
		}

		return dpd_month;
	}

	public ArrayList<Dpd_pp_wise_gen> IC_ES_GEN(String month, String officeCode) {
		ArrayList<Dpd_pp_wise_gen> Dpd_wise_gen = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3007.withCatalogName("pkg_ES_PP_wise_gen")
				.withProcedureName("dpd_PP_wise_gen")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_wise_gen.add(new Dpd_pp_wise_gen(jsonData.optString("CURR_MONTH"), jsonData.optString("UPTO_MONTH"),
						jsonData.optString("POWER_PLANT"), jsonData.optString("OWNER_TYPE"),
						jsonData.optString("VOLTAGE_LEVEL"), jsonData.optString("FUEL_NAME"),
						jsonData.optString("ENRG_GEN"), jsonData.optString("ENRG_CONS_SELF"),
						jsonData.optString("ENRG_CONS_SELF_PER"), jsonData.optString("NET_GEN"),
						jsonData.optString("ENRG_GEN_YR"), jsonData.optString("NET_GEN_YR")));
			}
		}

		return Dpd_wise_gen;
	}

	public ArrayList<Dpd_pp_wise_gen_blk> IC_ES_GEN_BLK(String month, String officeCode) {
		ArrayList<Dpd_pp_wise_gen_blk> Dpd_wise_gen = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3007.withCatalogName("pkg_ES_PP_wise_gen")
				.withProcedureName("dpd_PP_wise_gen")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_wise_gen.add(new Dpd_pp_wise_gen_blk(jsonData.optString("PP_UNIT_MOD_ID"),
						jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("CURR_MONTH"),
						jsonData.optString("UPTO_MONTH"), jsonData.optString("POWER_PLANT"),
						jsonData.optString("OWNER_TYPE"), jsonData.optString("VOLTAGE_LEVEL"),
						jsonData.optString("FUEL_NAME"), jsonData.optString("ENRG_GEN"),
						jsonData.optString("ENRG_CONS_SELF"), jsonData.optString("ENRG_CONS_SELF_PER"),
						jsonData.optString("NET_GEN"), jsonData.optString("ENRG_GEN_YR"),
						jsonData.optString("NET_GEN_YR")));
			}
		}

		return Dpd_wise_gen;
	}

	public ArrayList<Dpd_Illigal_Use> IC_ES_ILLE_USER(String month, String officeCode) {
		ArrayList<Dpd_Illigal_Use> Dpd_St_Illigal_Use = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3008.withCatalogName("pkg_ES_DC_OF_ILLIGAL_USE_ST")
				.withProcedureName("dpd_DC_OF_ILLIGAL_USE_ST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_St_Illigal_Use
						.add(new Dpd_Illigal_Use(jsonData.optString("MON"), jsonData.optString("NO_OF_DC_LINE"),
								jsonData.optString("NO_OF_CASE_FILED"), jsonData.optString("FINE_REALISE")));
			}
		}

		return Dpd_St_Illigal_Use;
	}

	public ArrayList<Dpd_Rc_Dc_St> IC_DISC_OF_ILLE_USER(String month, String officeCode) {
		ArrayList<Dpd_Rc_Dc_St> Dpd_Dc_St = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3009.withCatalogName("pkg_ES_RC_DC_ST")
				.withProcedureName("dpd_RC_DC_ST")
				.declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR)).execute(officeCode, month);
		JSONObject json = new JSONObject(result);
		String out = json.get("CUR_DATA").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				Dpd_Dc_St.add(new Dpd_Rc_Dc_St(jsonData.optString("MON"), jsonData.optString("NO_OF_DC_LINE"),
						jsonData.optString("COLL_AGAINST_DC"), jsonData.optString("NO_OF_RC_LINE"),
						jsonData.optString("COLL_AGAINST_RC")));
			}
		}

		return Dpd_Dc_St;
	}

	public ArrayList<IC_MAGIS_COURTS_MODEL> magisList() {
		ArrayList<IC_MAGIS_COURTS_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3015.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MAGIS_COURTS_LIST")
				.declareParameters(new SqlOutParameter("MAGISDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MAGISDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_MAGIS_COURTS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
					Integer.valueOf(jsonData.optString("BAL_OF_PREV_MONTH")),
					Integer.valueOf(jsonData.optString("CASES_FILED_PDB_OFF")),
					Integer.valueOf(jsonData.optString("CASES_FILED_MOB_COURT")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_JAILED")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_FINED")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_FINE_OR_JAIL")),
					Integer.valueOf(jsonData.optString("OTHERS")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_REDEMPTION")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_JUDGMENT")),
					Integer.valueOf(jsonData.optString("BAL_NOS")),
					Integer.valueOf(jsonData.optString("DC_ILLEGAL_CON")),
					Integer.valueOf(jsonData.optString("NO_OF_MOB_COURT_CONDU")),
					Integer.valueOf(jsonData.optString("FINES_REALISED_TK")), jsonData.optString("MONTHS"),
					Integer.valueOf(jsonData.optString("MAG_CT_ACT_ID"))

			));
		}
		return showList;
	}

	public int magisListInstrt(IC_MAGIS_INSERT iC_MAGIS_INSERT) {
		Map<String, Object> result = getAllStatesJdbcCall3016.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_MAGIS_ACTV_DTL")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_MAGIS_INSERT.getpBILL_CYCLE_CODE(), iC_MAGIS_INSERT.getpBAL_OF_PREV_MONTH(),
						iC_MAGIS_INSERT.getpCASES_FILED_PDB_OFF(), iC_MAGIS_INSERT.getpCASES_FILED_MOB_COURT(),
						iC_MAGIS_INSERT.getpNO_OF_PER_JAILED(), iC_MAGIS_INSERT.getpNO_OF_PER_FINED(),
						iC_MAGIS_INSERT.getpNO_OF_PER_FINE_OR_JAIL(), iC_MAGIS_INSERT.getpOTHERS(),
						iC_MAGIS_INSERT.getpNO_OF_PER_REDEMPTION(), iC_MAGIS_INSERT.getpNO_OF_PER_JUDGMENT(),
						iC_MAGIS_INSERT.getpBAL_NOS(), iC_MAGIS_INSERT.getpDC_ILLEGAL_CON(),
						iC_MAGIS_INSERT.getpNO_OF_MOB_COURT_CONDU(), iC_MAGIS_INSERT.getpFINES_REALISED_TK(),
						iC_MAGIS_INSERT.getpMONTHS());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_MAGIS_COURTS_MODEL> magisListEdit(int mId) {
		ArrayList<IC_MAGIS_COURTS_MODEL> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall3017.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_MAGIS_COURTS_EDIT")
				.declareParameters(new SqlOutParameter("MAGIDATA", OracleTypes.CURSOR)).execute(mId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("MAGIDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new IC_MAGIS_COURTS_MODEL(jsonData.optString("BILL_CYCLE_CODE"),
					Integer.valueOf(jsonData.optString("BAL_OF_PREV_MONTH")),
					Integer.valueOf(jsonData.optString("CASES_FILED_PDB_OFF")),
					Integer.valueOf(jsonData.optString("CASES_FILED_MOB_COURT")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_JAILED")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_FINED")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_FINE_OR_JAIL")),
					Integer.valueOf(jsonData.optString("OTHERS")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_REDEMPTION")),
					Integer.valueOf(jsonData.optString("NO_OF_PER_JUDGMENT")),
					Integer.valueOf(jsonData.optString("BAL_NOS")),
					Integer.valueOf(jsonData.optString("DC_ILLEGAL_CON")),
					Integer.valueOf(jsonData.optString("NO_OF_MOB_COURT_CONDU")),
					Integer.valueOf(jsonData.optString("FINES_REALISED_TK")), jsonData.optString("MONTHS"),
					Integer.valueOf(jsonData.optString("MAG_CT_ACT_ID"))

			));
		}
		return showList;
	}

	public int magisListUpdate(IC_MAGIS_INSERT iC_MAGIS_INSERT, int mId) {

		Map<String, Object> result = getAllStatesJdbcCall3018.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_MAGIS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_MAGIS_INSERT.getpBILL_CYCLE_CODE(), iC_MAGIS_INSERT.getpBAL_OF_PREV_MONTH(),
						iC_MAGIS_INSERT.getpCASES_FILED_PDB_OFF(), iC_MAGIS_INSERT.getpCASES_FILED_MOB_COURT(),
						iC_MAGIS_INSERT.getpNO_OF_PER_JAILED(), iC_MAGIS_INSERT.getpNO_OF_PER_FINED(),
						iC_MAGIS_INSERT.getpNO_OF_PER_FINE_OR_JAIL(), iC_MAGIS_INSERT.getpOTHERS(),
						iC_MAGIS_INSERT.getpNO_OF_PER_REDEMPTION(), iC_MAGIS_INSERT.getpNO_OF_PER_JUDGMENT(),
						iC_MAGIS_INSERT.getpBAL_NOS(), iC_MAGIS_INSERT.getpDC_ILLEGAL_CON(),
						iC_MAGIS_INSERT.getpNO_OF_MOB_COURT_CONDU(), iC_MAGIS_INSERT.getpFINES_REALISED_TK(),
						iC_MAGIS_INSERT.getpMONTHS(), mId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public int magisListDelte(int mId) {

		Map<String, Object> result = getAllStatesJdbcCall3019.withCatalogName("USAGE_INFO")
				.withProcedureName("DETELE_MAGIS")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(mId);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	/*public ArrayList<IC_DC_RC> IC_RC_DC_one() {
		ArrayList<IC_DC_RC> pIC_RC_DC_ST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4000.withCatalogName("pkg_ES_IC_RC_DC_ST")
				.withProcedureName("dpd_IC_RC_DC_ST").declareParameters(new SqlOutParameter("cur_data", OracleTypes.CURSOR))
				.execute();
		JSONObject json = new JSONObject(result);
		String out = json.get("cur_data").toString();
		JSONArray jsonArray = new JSONArray(out);
		if (jsonArray.length() > 0) {
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonData = jsonArray.getJSONObject(i);
				pIC_RC_DC_ST.add(new IC_DC_RC(jsonData.optString("BILL_CYCLE_CODE"),
						jsonData.optString("NO_OF_DC_LINE"), jsonData.optString("COLL_AGAINST_DC"),
						jsonData.optString("NO_OF_RC_LINE"), jsonData.optString("COLL_AGAINST_RC")
						,jsonData.optString("RC_DC_ID"), jsonData.optString("STATUS")

				));
			}
		}

		return pIC_RC_DC_ST;
	}

	public int insert_DC_RC(IC_DC_RC ic_dc_rc_insert) {

		Map<String, Object> result = getAllStatesJdbcCall4001.withCatalogName("IC_RC_DC_One")
				.withProcedureName("INSERT_IC_RC_DC")
				.declareParameters(new SqlOutParameter("RCDATA", OracleTypes.CURSOR))
				.execute(ic_dc_rc_insert.getpBILL_CYCLE_CODE(), Integer.valueOf(ic_dc_rc_insert.getpNO_OF_DC_LINE()),
						Integer.valueOf(ic_dc_rc_insert.getpCOLL_AGAINST_DC()),
						Integer.valueOf(ic_dc_rc_insert.getpNO_OF_RC_LINE()),
						Integer.valueOf(ic_dc_rc_insert.getpCOLL_AGAINST_RC()), ic_dc_rc_insert.getpSTATUS());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}
*/
	public int delete_RC_DC(int id) {

		Map<String, Object> result = getAllStatesJdbcCall4002.withCatalogName("IC_RC_DC_One")
				.withProcedureName("DETELE_IC").declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(id);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

	public ArrayList<IC_DC_RC> RC_DC_Edit(int id) {
		ArrayList<IC_DC_RC> pIC_RC_DC_ST = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall4003.withCatalogName("IC_RC_DC_One")
				.withProcedureName("IC_RC_EDIT_DATA")
				.declareParameters(new SqlOutParameter("RCDATAS", OracleTypes.CURSOR)).execute(id);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("RCDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			pIC_RC_DC_ST.add(new IC_DC_RC(jsonData.optString("BILL_CYCLE_CODE"), jsonData.optString("NO_OF_DC_LINE"),
					jsonData.optString("COLL_AGAINST_DC"), jsonData.optString("NO_OF_RC_LINE"),
					jsonData.optString("COLL_AGAINST_RC"), jsonData.optString("RC_DC_ID"),
					jsonData.optString("STATUS")));
		}

		System.out.println("This is dao DATA " + pIC_RC_DC_ST);
		return pIC_RC_DC_ST;
	}

	/*
	public int RC_DC_update(IC_DC_RC iC_DC_RC, int id) {
		Map<String, Object> result = getAllStatesJdbcCall4004.withCatalogName("IC_RC_DC_One")
				.withProcedureName("UPDATE_IC").declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER))
				.execute(iC_DC_RC.getpBILL_CYCLE_CODE(), Integer.valueOf(iC_DC_RC.getpNO_OF_DC_LINE()),
						Integer.valueOf(iC_DC_RC.getpCOLL_AGAINST_DC()), Integer.valueOf(iC_DC_RC.getpNO_OF_RC_LINE()),
						Integer.valueOf(iC_DC_RC.getpCOLL_AGAINST_RC()), iC_DC_RC.getpSTATUS(), id

				);

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());

		return val;
	}

*/
	// location

	public ArrayList<OfficeDrop> officeDropdown() {
		ArrayList<OfficeDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall421.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_OFFICE_INFO_DROP")
				.declareParameters(new SqlOutParameter("OFDATAS", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("OFDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new OfficeDrop(jsonData.optString("OFFICE_CODE"), jsonData.optString("OFFICE_DESC")));
		}

		return showList;
	}

	public ArrayList<OfficeDrop> comDropdown() {
		ArrayList<OfficeDrop> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall422.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_COMP_CNTR_MST_DROP")
				.declareParameters(new SqlOutParameter("COMDATAS", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("COMDATAS").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new OfficeDrop(jsonData.optString("COMP_CNTR_CODE"), jsonData.optString("COMP_CNTR_NAME")));
		}

		return showList;
	}

	public ArrayList<LocationListModel> locationList() {
		ArrayList<LocationListModel> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall423.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_LIST")
				.declareParameters(new SqlOutParameter("LOCATIONDATA", OracleTypes.CURSOR)).execute();

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCATIONDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationListModel(Integer.valueOf(jsonData.optString("LOCATION_ID")),
					jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("ZONE_DESC"), jsonData.optString("CIRCLE_DESC"),
					jsonData.optString("DIV_DESC"), jsonData.optString("COMP_CNTR_NAME")));
		}
		return showList;
	}

	public int insertLocations(InsLocation insLocation,String user_name) {
		if (insLocation.getStatus() == "C") {
			insLocation.setStatus("Yes");
		}

		Map<String, Object> result = getAllStatesJdbcCall424.withCatalogName("USAGE_INFO")
				.withProcedureName("INSERT_IC_LOCATION_MASTERR")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(insLocation.getCode(),
						insLocation.getName(), insLocation.getStatus(),user_name, insLocation.getZone(), insLocation.getCircle(),
						insLocation.getDiv(), insLocation.getSubDiv(), insLocation.getOfficeCode(),
						insLocation.getComputerSec());

		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<LocationEditM> locationEdits(int locationId) {
		ArrayList<LocationEditM> showList = new ArrayList<>();

		Map<String, Object> result = getAllStatesJdbcCall425.withCatalogName("USAGE_INFO")
				.withProcedureName("IC_LOCATION_LIST_EDID")
				.declareParameters(new SqlOutParameter("LOCAEDITDATA", OracleTypes.CURSOR)).execute(locationId);

		JSONObject json = new JSONObject(result);
		String jesonString = json.get("LOCAEDITDATA").toString();
		JSONArray jsonArray = new JSONArray(jesonString);

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			showList.add(new LocationEditM(Integer.valueOf(jsonData.optString("LOCATION_ID")),
					jsonData.optString("LOCATION_CODE"), jsonData.optString("LOCATION_NAME"),
					jsonData.optString("STATUS"), jsonData.optString("ZONE_DESC"), jsonData.optString("CIRCLE_DESC"),
					jsonData.optString("DIV_DESC"), jsonData.optString("COMP_CNTR_NAME"),
					jsonData.optString("ZONE_CODE"), jsonData.optString("CIRCLE_CODE"), jsonData.optString("DIV_CODE"),
					jsonData.optString("SUB_DIV_CODE"), jsonData.optString("COMP_CNTR_CODE"),
					jsonData.optString("OFFICE_CODE")));
		}
		return showList;
	}

	public int updateLocations(InsLocation insLocation, String aZone, String bCircle, String cDiv, String dComCen,
			String eOffCode, int id,String user_name) {
		if (insLocation.getStatus() == "C") {
			insLocation.setStatus("Yes");
		}
		if (insLocation.getZone() == null) {
			insLocation.setZone(aZone);
		}
		if (insLocation.getCircle() == null) {
			insLocation.setCircle(bCircle);
		}
		if (insLocation.getDiv() == null) {
			insLocation.setDiv(cDiv);
		}
		if (insLocation.getComputerSec() == null) {
			insLocation.setComputerSec(dComCen);
		}
		if (insLocation.getOfficeCode() == null) {
			insLocation.setOfficeCode(eOffCode);
		}

		Map<String, Object> result = getAllStatesJdbcCall426.withCatalogName("USAGE_INFO")
				.withProcedureName("UPDATE_IC_LOCATION_MASTERR")
				.declareParameters(new SqlOutParameter("results", OracleTypes.INTEGER)).execute(insLocation.getCode(),
						insLocation.getName(), insLocation.getStatus(), insLocation.getZone(), insLocation.getCircle(),
						insLocation.getDiv(), insLocation.getSubDiv(), insLocation.getOfficeCode(),
						insLocation.getComputerSec(),user_name, id);
		JSONObject json = new JSONObject(result);
		int val = Integer.valueOf(json.get("OUTPUT").toString());
		return val;
	}

	public ArrayList<IC_ZONE_MST_R> r(String officeCode) {

		ArrayList<IC_ZONE_MST_R> b = new ArrayList<>();

		Map<String, Object> c = getAllStatesJdbcCall428.withCatalogName("pkg_dist_Dash_board")
				.withProcedureName("dpd_Zone").declareParameters(new SqlOutParameter("CUR_DATA", OracleTypes.CURSOR))
				.execute(officeCode);
		JSONObject j = new JSONObject(c);
		String d = j.get("CUR_DATA").toString();
		JSONArray e = new JSONArray(d);

		for (int i = 0; i < e.length(); i++) {

			JSONObject f = e.getJSONObject(i);

			b.add(new IC_ZONE_MST_R(f.optString("ZONE_CODE"), f.optString("ZONE_NAME")

			));
		}

		return b;

	}
}
