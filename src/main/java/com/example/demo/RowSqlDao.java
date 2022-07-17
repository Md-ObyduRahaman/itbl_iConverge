package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DoubleDataModel;
import com.example.demo.model.IC_CIRCLE_MST_Dropdown;
import com.example.demo.model.IC_LOCATION_MASTER_Dropdown;
import com.example.demo.model.IC_LOC_IMPORT;
import com.example.demo.model.IC_PERIOD_MST_Dropdown;
import com.example.demo.model.IC_ZONE_MST_Dropdown;
import com.example.demo.model.SingleDataModel;
import com.example.demo.model.TotalSumModel;

@Repository
public class RowSqlDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST() {

		String sql = "SELECT BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, ILL_DC_ID, STATUS FROM IC_DC_OF_ILLIGAL_USE_ST";
		List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(IC_DC_OF_ILLIGAL_USE_ST.class));

		return listIC_DC_OF_ILLIGAL_USE_ST;
	}

	public IC_DC_OF_ILLIGAL_USE_ST listIC_DC_OF_ILLIGAL_USE_ST_S(int id) {

		String sql = "SELECT BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, ILL_DC_ID, STATUS FROM IC_DC_OF_ILLIGAL_USE_ST where ILL_DC_ID=?";
		Object[] args = { id };
		@SuppressWarnings("deprecation")
		IC_DC_OF_ILLIGAL_USE_ST ic_DC_OF_ILLIGAL_USE_ST = jdbcTemplate.queryForObject(sql, args,
				BeanPropertyRowMapper.newInstance(IC_DC_OF_ILLIGAL_USE_ST.class));

		return ic_DC_OF_ILLIGAL_USE_ST;
	}

	public void insertIC_DC_OF_ILLIGAL_USE_ST(IC_DC_OF_ILLIGAL_USE_ST sale) {
		String sql = "INSERT INTO IC_DC_OF_ILLIGAL_USE_ST (BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, STATUS)VALUES(:BILL_CYCLE_CODE, :NO_OF_DC_LINE, :NO_OF_CASE_FILED, :FINE_REALISE, :STATUS)";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);
	}

	public void IC_DC_OF_ILLIGAL_USE_ST_edit(IC_DC_OF_ILLIGAL_USE_ST sale) {
		String sql = "UPDATE IC_DC_OF_ILLIGAL_USE_ST SET BILL_CYCLE_CODE=:BILL_CYCLE_CODE, NO_OF_DC_LINE=:NO_OF_DC_LINE, NO_OF_CASE_FILED=:NO_OF_CASE_FILED, FINE_REALISE=:FINE_REALISE, STATUS=:STATUS where ILL_DC_ID=:ILL_DC_ID";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);
	}

	public void IC_DC_OF_ILLIGAL_USE_ST_delete(int id) {
		String sql = "DELETE FROM IC_DC_OF_ILLIGAL_USE_ST WHERE ILL_DC_ID = ?";
		jdbcTemplate.update(sql, id);
	}
	
	public List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF(String ST) {

//		String sql = "select BILL_CYCLE_CODE,IC_LOC_MOD_DF.LOCATION_CODE,LOCATION_NAME,LOC_MOD_ID,PR_USER,PR_OFFICE_CODE,NEXT_USER,NEXT_OFFICE_CODE from IC_LOC_MOD_DF,IC_LOCATION_MASTER\r\n"
//				+ "where  IC_LOC_MOD_DF.LOCATION_CODE=IC_LOCATION_MASTER.LOCATION_CODE AND (PR_USER='"+ST+"' OR NEXT_USER='"+ST+"')";
		String sql = "select  BILL_CYCLE_CODE,IC_LOC_MOD_DF.LOCATION_CODE,IC_LOC_MOD_DF.LOCATION_CODE||'-'||LOCATION_NAME LOCATION_NAME,LOC_MOD_ID,PR_USER,(select OFFICE_DESC  from ic_office_info where office_code= PR_OFFICE_CODE) PR_OFFICE_CODE,NEXT_USER,(select OFFICE_DESC  from ic_office_info where office_code= NEXT_OFFICE_CODE) NEXT_OFFICE_CODE from IC_LOC_MOD_DF,IC_LOCATION_MASTER\r\n"
	               + " where  IC_LOC_MOD_DF.LOCATION_CODE=IC_LOCATION_MASTER.LOCATION_CODE AND (PR_USER='"+ST+"' OR NEXT_USER='"+ST+"') AND PR_USER IS NOT NULL AND NEXT_USER IS NOT NULL";
		
		List<IC_LOC_MOD_DF> listIC_LOC_MOD_DF = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(IC_LOC_MOD_DF.class));

		return listIC_LOC_MOD_DF;
	}
	public String sLOCATION_NAME(String ST) {

//		String sql = "select BILL_CYCLE_CODE,IC_LOC_MOD_DF.LOCATION_CODE,LOCATION_NAME,LOC_MOD_ID,PR_USER,PR_OFFICE_CODE,NEXT_USER,NEXT_OFFICE_CODE from IC_LOC_MOD_DF,IC_LOCATION_MASTER\r\n"
//				+ "where  IC_LOC_MOD_DF.LOCATION_CODE=IC_LOCATION_MASTER.LOCATION_CODE AND (PR_USER='"+ST+"' OR NEXT_USER='"+ST+"')";
		String sql = " select LOCATION_NAME as outFlag  from ic_location_master  where LOCATION_CODE='"+ST+"'";
		
		List<SingleDataModel> listIC_LOC_MOD_DF = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(SingleDataModel.class));
		String out = null;
		if(!listIC_LOC_MOD_DF.isEmpty()) {
			out=listIC_LOC_MOD_DF.get(0).getOutFlag();
		}
		
		return out;
	}
	public List<ReportIndex> listReportIndex() {

		String sql = "select MOD_APP,MOD_NAME,PAGE_RANG  from IC_MODULES_LIST AA\r\n"
				+ "where  parent='6200'\r\n"
				+ "and PAGE_RANG is not null\r\n"
				+ "order by mod_id";
		List<ReportIndex> listReportIndex = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(ReportIndex.class));

		return listReportIndex;
	}
	public List<NextUserAndOffice> listFORWORD(String p_PR_USER,String p_PR_OFFICE_CODE,String location,String billcycle) {

		String sql = "SELECT NEXT_USER,NEXT_OFFICE_CODE  FROM IC_USER_FLOW_DIST \r\n"
				+ "WHERE PR_USER='" + p_PR_USER +"' and DFN_RAO_COLL_VALIDATION_NEW('"+billcycle+"','"+location+"','"+p_PR_USER+"',NEXT_USER)=0" ;
		List<NextUserAndOffice> listFORWORD = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(NextUserAndOffice.class));
		System.out.println(sql);
		System.out.println(listFORWORD);
		return listFORWORD;
	}
	public List<NextUserAndOffice> listbackWORD(String p_PR_USER,String location) {

		String sql = "SELECT PR_USER as NEXT_USER,PR_OFFICE_CODE as NEXT_OFFICE_CODE FROM IC_USER_FLOW_DIST \r\n"
				+ "WHERE NEXT_USER='"+p_PR_USER +"' and PR_USER in (select user_name from IC_SND_ACCESS_MAP where LOCATION_CODE='"+location+"')";
		List<NextUserAndOffice> listFORWORD = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(NextUserAndOffice.class));

		return listFORWORD;
	}
	public  String flagNums(String id)
	  {
	  
		  String sql ="SELECT COUNT(*) outFlag  FROM IC_USER_MST WHERE USER_TYPE IN (08) AND USER_NAME ='"+id+"'";
		  List<SingleDataModel> single = jdbcTemplate.query(sql,
				  BeanPropertyRowMapper.newInstance(SingleDataModel.class));
		  
		  String out=single.get(0).getOutFlag();
		  
		  return out;
	  }
	public  String flagNum(String id)
	  {
	  
		  String sql ="SELECT COUNT(*) outFlag  FROM IC_USER_MST WHERE USER_TYPE IN (06) AND USER_NAME ='"+id+"'";
		  List<SingleDataModel> single = jdbcTemplate.query(sql,
				  BeanPropertyRowMapper.newInstance(SingleDataModel.class));
		  
		  String out=single.get(0).getOutFlag();
		  
		  return out;
	  }
	public  String flagpuser(String id,String cycle,String loc)
	  {
	  
		  String sql ="select count(*) outFlag from IC_LOC_MOD_DF where NEXT_USER='"+id+"' and BILL_CYCLE_CODE='"+cycle+"' and LOCATION_CODE='"+loc+"'";
		  List<SingleDataModel> single = jdbcTemplate.query(sql,
				  BeanPropertyRowMapper.newInstance(SingleDataModel.class));
		  
		  String out=single.get(0).getOutFlag();
		  
		  return out;
	  }
	public  List<DoubleDataModel> remarks(String id,String loc)
	  {
		List<DoubleDataModel> single=new ArrayList<DoubleDataModel>();
		try {
			String sql ="select REMARKS,PR_USER  from IC_LOC_MOD_DF_HST where NEXT_USER='"+id+"'  AND LOCATION_CODE='"+loc+"'  order by LOC_MOD_DF_ID desc";
			  single = jdbcTemplate.query(sql,
					  BeanPropertyRowMapper.newInstance(DoubleDataModel.class));
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		  
		  return single;
	  }
	public List<IC_PERIOD_MST_Dropdown> listIC_PERIOD_MST_Dropdown()
	{

		String sql = "SELECT PERIOD_CODE, PERIOD_DESC FROM IC_PERIOD_MST ORDER BY PERIOD_CODE DESC";
		List<IC_PERIOD_MST_Dropdown> listZone_Code_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(IC_PERIOD_MST_Dropdown.class));

		return listZone_Code_Dropdown;
	}
	public List<TotalSumModel> listRouSum(String location, String cycle)
	{

		String sql = "select sum(NVL(RC.SYS_COLL,0)) SYS_COLL,sum(NVL(RC.RAO_COLL,0)) RAO_COLL from\r\n"
				+ " IC_RAO_LOC_CAT_COLL RC ,IC_USAGE_CAT_CODE UA ,IC_LOCATION_MASTER LOC  where RC.USAGE_CAT_CODE=UA.USAGE_CAT_CODE AND \r\n"
				+ " RC.LOCATION_CODE=LOC.LOCATION_CODE and RC.LOCATION_CODE='"+location+"' and RC.BILL_CYCLE_CODE='"+cycle+"'";
		List<TotalSumModel> listZone_Code_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(TotalSumModel.class));

		return listZone_Code_Dropdown;
	}
	public List<TotalSumModel> listRouSumR(String location, String cycle)
	{

		String sql =" SELECT NVL(SYS_COLL,0) SYS_COLL,NVL(RAO_COLL,0) RAO_COLL FROM IC_RAO_LOC_COLL WHERE LOCATION_CODE='"+location+"' and BILL_CYCLE_CODE='"+cycle+"' ";
		List<TotalSumModel> listZone_Code_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(TotalSumModel.class));

		return listZone_Code_Dropdown;
	}
	public List<TotalSumModel> listRouSumRR(String location, String cycle)
	{

		String sql =" SELECT NVL(RAO_COLL,0) RAO_COLL FROM IC_RAO_LOC_COLL WHERE LOCATION_CODE='"+location+"' and BILL_CYCLE_CODE='"+cycle+"' ";
		List<TotalSumModel> listZone_Code_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(TotalSumModel.class));

		return listZone_Code_Dropdown;
	}
	public List<TotalSumModel> listRouSumR_VAT(String location, String cycle)
	{

		String sql = "SELECT NVL(SYS_VAT_COLL,0) SYS_COLL,NVL(RAO_VAT_COLL,0) RAO_COLL FROM IC_RAO_LOC_COLL WHERE LOCATION_CODE='"+location+"' and BILL_CYCLE_CODE='"+cycle+"' ";
		List<TotalSumModel> listZone_Code_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(TotalSumModel.class));

		return listZone_Code_Dropdown;
	}
	
	
	public List<IC_ZONE_MST_Dropdown> listIC_ZONE_MST_Dropdown()
	{

		String sql = "SELECT ZONE_CODE, ZONE_DESC FROM IC_ZONE_MST where ZONE_CODE not in (9)";
		List<IC_ZONE_MST_Dropdown> listIC_ZONE_MST_Dropdown =
				jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(IC_ZONE_MST_Dropdown.class));

		return listIC_ZONE_MST_Dropdown;
	}
	
	
	  public List<IC_CIRCLE_MST_Dropdown> listIC_CIRCLE_MST_Dropdown(String id)
	  {
	  
		  String sql = "SELECT ZONE_CODE, CIRCLE_CODE, CIRCLE_DESC FROM IC_CIRCLE_MST where ZONE_CODE='"+id+"'";
		  List<IC_CIRCLE_MST_Dropdown> listIC_CIRCLE_MST_Dropdown =
		  jdbcTemplate.query(sql,
		  BeanPropertyRowMapper.newInstance(IC_CIRCLE_MST_Dropdown.class));
		  
		  return listIC_CIRCLE_MST_Dropdown; 
	  }
	  
		/* Circle Code Finding */
	  List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER(String location_code){
		  
		  String sql = "SELECT CIRCLE_CODE FROM IC_LOCATION_MASTER WHERE LOCATION_CODE = '"+location_code+"'";
		  
		  List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER = jdbcTemplate.query(sql,
		  BeanPropertyRowMapper.newInstance(IC_LOCATION_MASTER_Dropdown.class));
		  
		  return listIC_LOCATION_MASTER;
	  }
	  
	  

public List<IC_LOC_IMPORT> listIC_LOC_IMPORT(String id, String circleCode) {
		  
			
		  
		 
		  
		  String sql = "SELECT IC_LOC_IMPORT.BILL_CYCLE_CODE, IC_LOCATION_MASTER.LOCATION_NAME, IC_LOC_IMPORT.KWH, IC_LOC_IMPORT.KVARH,  DECODE(IC_LOC_IMPORT.STATUS,'N','NO','Y','YES') STATUS, IC_LOC_IMPORT.IMP_ID FROM IC_LOC_IMPORT INNER JOIN IC_LOCATION_MASTER ON IC_LOC_IMPORT.LOCATION_CODE = IC_LOCATION_MASTER.LOCATION_CODE WHERE IC_LOC_IMPORT.BILL_CYCLE_CODE = '"+id+"' AND CIRCLE_CODE='"+circleCode+"'";
		  
		  List<IC_LOC_IMPORT> listIC_LOC_IMPORT = jdbcTemplate.query(sql,
		  BeanPropertyRowMapper.newInstance(IC_LOC_IMPORT.class));
		  
		  return listIC_LOC_IMPORT;
	  }
	  public  IC_LOC_IMPORT listIC_LOC_IMPORT_S(int id)
	  {
	  
		  String sql ="SELECT BILL_CYCLE_CODE, LOCATION_CODE, KWH, KVARH, DECODE(STATUS,'N','NO','Y','YES') STATUS ,IMP_ID FROM IC_LOC_IMPORT where IMP_ID=?";
		  Object[] args = { id };
		  @SuppressWarnings("deprecation")
				  IC_LOC_IMPORT listIC_LOC_IMPORT =  jdbcTemplate.queryForObject(sql,args,
						  BeanPropertyRowMapper.newInstance(IC_LOC_IMPORT.class));
		  
		  return listIC_LOC_IMPORT;
	  }
	  
	  
	  
	  public void insert_IC_LOC_IMPORT(IC_LOC_IMPORT sale)
	  {
		  String sql ="INSERT INTO IC_LOC_IMPORT (BILL_CYCLE_CODE, LOCATION_CODE, KWH, KVARH, STATUS)VALUES(:BILL_CYCLE_CODE, :LOCATION_CODE, :KWH, :KVARH, :STATUS)";
		  BeanPropertySqlParameterSource param = new
		  BeanPropertySqlParameterSource(sale);
		  NamedParameterJdbcTemplate template =
		  new NamedParameterJdbcTemplate(jdbcTemplate); template.update(sql, param);
	  }
	  
	  public void IC_LOC_IMPORT_edit(IC_LOC_IMPORT sale)
	  {
		  if(sale.getSTATUS().equals("NO")) {
			  sale.setSTATUS("N");
		  }else {
			  sale.setSTATUS("Y");
		  }
		  String sql ="UPDATE IC_LOC_IMPORT SET LOCATION_CODE=:LOCATION_CODE, KWH=:KWH, KVARH=:KVARH, STATUS=:STATUS where IMP_ID=:IMP_ID";
		  BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		  NamedParameterJdbcTemplate template =new NamedParameterJdbcTemplate(jdbcTemplate);
		  template.update(sql, param);
	  }
	  
	  public void IC_LOC_IMPORT_delete(String id)
	  { 
		  String sql = "DELETE FROM IC_LOC_IMPORT WHERE  IMP_ID= ?";
		  jdbcTemplate.update(sql, id);
	  }
	  
	  
	  public List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER_Dropdown(String CIRCLE_CODE)
		{

			String sql = "SELECT LOCATION_CODE, LOCATION_NAME FROM IC_LOCATION_MASTER where CIRCLE_CODE='"+CIRCLE_CODE+"' ORDER BY LOCATION_CODE ASC";
			List<IC_LOCATION_MASTER_Dropdown> listIC_LOCATION_MASTER_Dropdown =
					jdbcTemplate.query(sql,
							BeanPropertyRowMapper.newInstance(IC_LOCATION_MASTER_Dropdown.class));

			return listIC_LOCATION_MASTER_Dropdown;
		}
	  
	  
	  
		//Rony IC RAO LOC MISC COLL
	  public List<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL(String location, String BILL_CYCLE_CODE) {
		  
			
		  String sql = "SELECT BILL_CYCLE_CODE, LOC.LOCATION_CODE, LOC.LOCATION_CODE||'-'||LOC.LOCATION_NAME LOCATION_NAME,MSC_TYPE_CODE,\r\n"
		  		+ " MSC_TYPE_CODE||'-'||MTC.MSC_BILL_TYPE_NAME MSC_BILL_TYPE_NAME , SYS_COLL, RAO_COLL, misc.STATUS, RAO_LOC_MISC_ID\r\n"
		  		+ " FROM IC_RAO_LOC_MISC_COLL misc, IC_LOCATION_MASTER loc, IC_MISC_BILL_TYPE mtc\r\n"
		  		+ "  WHERE MISC.LOCATION_CODE=LOC.LOCATION_CODE and MISC.MSC_TYPE_CODE=MTC.MSC_BILL_TYPE_CODE and misc.LOCATION_CODE = '"+location+"' and misc.MSC_TYPE_CODE not in ('06','05') and misc.BILL_CYCLE_CODE = '"+BILL_CYCLE_CODE+"'  ";
		  
		  List<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL = jdbcTemplate.query(sql,
		  BeanPropertyRowMapper.newInstance(IC_RAO_LOC_MISC_COLL.class));
		  
		  return listIC_RAO_LOC_MISC_COLL;
	  }
		  
	  public List<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL1(String location, String BILL_CYCLE_CODE) {
		  
			
		  String sql = "SELECT BILL_CYCLE_CODE, LOC.LOCATION_CODE, LOC.LOCATION_CODE||'-'||LOC.LOCATION_NAME LOCATION_NAME,MSC_TYPE_CODE,\r\n"
		  		+ " MSC_TYPE_CODE||'-'||MTC.MSC_BILL_TYPE_NAME MSC_BILL_TYPE_NAME , SYS_COLL, RAO_COLL, misc.STATUS, RAO_LOC_MISC_ID\r\n"
		  		+ " FROM IC_RAO_LOC_MISC_COLL misc, IC_LOCATION_MASTER loc, IC_MISC_BILL_TYPE mtc\r\n"
		  		+ "  WHERE MISC.LOCATION_CODE=LOC.LOCATION_CODE and MISC.MSC_TYPE_CODE=MTC.MSC_BILL_TYPE_CODE and misc.LOCATION_CODE = '"+location+"' and misc.MSC_TYPE_CODE in('06','05')  and misc.BILL_CYCLE_CODE = '"+BILL_CYCLE_CODE+"'  ";
		  
		  List<IC_RAO_LOC_MISC_COLL> listIC_RAO_LOC_MISC_COLL = jdbcTemplate.query(sql,
		  BeanPropertyRowMapper.newInstance(IC_RAO_LOC_MISC_COLL.class));
		  
		  return listIC_RAO_LOC_MISC_COLL;
	  }  
		  
	  public IC_RAO_LOC_MISC_COLL listIC_RAO_LOC_MISC_COLL_S(String id)
	  {
	  
		  String sql ="SELECT BILL_CYCLE_CODE, LOCATION_CODE, MSC_TYPE_CODE, SYS_COLL, RAO_COLL, DECODE(STATUS,'N','NO','Y','YES') STATUS, UPDATE_BY,RAO_LOC_MISC_ID FROM IC_RAO_LOC_MISC_COLL where RAO_LOC_MISC_ID=?";
		  Object[] args = { id };
		  
		  @SuppressWarnings("deprecation")
		  IC_RAO_LOC_MISC_COLL iC_RAO_LOC_MISC_COLL = jdbcTemplate.queryForObject(sql, args,
		  BeanPropertyRowMapper.newInstance(IC_RAO_LOC_MISC_COLL.class));
		  
		  return iC_RAO_LOC_MISC_COLL;
	  }
		  
		 
		  public void IC_RAO_LOC_MISC_COLL_edit(IC_RAO_LOC_MISC_COLL sale)
		  {
			  String sql ="UPDATE IC_RAO_LOC_MISC_COLL SET RAO_COLL=:RAO_COLL, UPDATE_BY=:UPDATE_BY where RAO_LOC_MISC_ID=:RAO_LOC_MISC_ID ";
			  BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
			  NamedParameterJdbcTemplate template =new NamedParameterJdbcTemplate(jdbcTemplate);
			  template.update(sql, param);
		  }
		  
		  
		  
          
          public List<TotalSumModel> listRouSumtotal(String location,String cycle)
		{

			String sql = "SELECT (ONE.SYS_COLL+TWO.SYS_COLL) SYS_COLL,(ONE.RAO_COLL+TWO.RAO_COLL) RAO_COLL FROM \r\n"
					+ "(select sum(NVL(SYS_COLL,0)) SYS_COLL,sum(NVL(RAO_COLL,0)) RAO_COLL from\r\n"
					+ "                 IC_RAO_LOC_CAT_COLL    where LOCATION_CODE='"+location+"'  and BILL_CYCLE_CODE='"+cycle+"') ONE,                \r\n"
					+ "                (SELECT sum(NVL(SYS_COLL,0)) SYS_COLL, sum(NVL(RAO_COLL,0)) RAO_COLL FROM IC_RAO_LOC_MISC_COLL WHERE MSC_TYPE_CODE not in(5, 6) and LOCATION_CODE='"+location+"' and BILL_CYCLE_CODE='"+cycle+"') TWO";
			List<TotalSumModel> listZone_Code_Dropdown =
					jdbcTemplate.query(sql,
							BeanPropertyRowMapper.newInstance(TotalSumModel.class));

			return listZone_Code_Dropdown;
		}
		  
		  public List<TotalSumModel> listRouSumRo(String location,String cycle)
			{

				String sql = "SELECT sum(NVL(SYS_COLL,0)) SYS_COLL, sum(NVL(RAO_COLL,0)) RAO_COLL FROM IC_RAO_LOC_MISC_COLL WHERE LOCATION_CODE='"+location+"' and MSC_TYPE_CODE not in ('06','05') and BILL_CYCLE_CODE='"+cycle+"' ";
				List<TotalSumModel> listZone_Code_Dropdown =
						jdbcTemplate.query(sql,
								BeanPropertyRowMapper.newInstance(TotalSumModel.class));

				return listZone_Code_Dropdown;
			}
		  public List<TotalSumModel> listRouSumVAT(String location,String cycle)
			{

				String sql = " SELECT NVL(SYS_COLL, 0),  NVL(RAO_COLL,0) RAO_COLL FROM IC_RAO_LOC_MISC_COLL WHERE LOCATION_CODE='"+location+"' and BILL_CYCLE_CODE='"+cycle+"' and MSC_TYPE_CODE='06'";
				List<TotalSumModel> listZone_Code_Dropdown =
						jdbcTemplate.query(sql,
								BeanPropertyRowMapper.newInstance(TotalSumModel.class));

				return listZone_Code_Dropdown;
			}
		 
		  
		//END Rony IC RAO LOC MISC COLL
		  
		  
		  public List<IC_ZONE_MST> listIC_ZONE_MST(String ZONE_CODE)
			{

				String sql = "SELECT ZONE_CODE, ZONE_DESC FROM IC_ZONE_MST where ZONE_CODE='"+ZONE_CODE+"'";
				List<IC_ZONE_MST> listIC_ZONE_TARGET =
						jdbcTemplate.query(sql,
								BeanPropertyRowMapper.newInstance(IC_ZONE_MST.class));

				return listIC_ZONE_TARGET;
			}
		  
		  
		  
		  public List<DrpDwn> listDrpDwn() {

				String sql = "SELECT COUNTRY_CODE DCODE,CONTRY_NAME DNAME FROM IC_COUNTRY_MST";
				List<DrpDwn> listDrpDwn = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(DrpDwn.class));

				return listDrpDwn;
			}
		  
		  public List<IPP_CURRENCY_DROPDOWN> listDrpDwnC() {

				String sql = "SELECT CURR_CODE,CURR_NAME FROM IC_CURR_MST";
				List<IPP_CURRENCY_DROPDOWN> listDrpDwnC = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(IPP_CURRENCY_DROPDOWN.class));

				return listDrpDwnC;
			}
		  
		  public List<SMS_LOG_DETAILS> listSMSLOG(String FROM_DATE, String TO_DATE) {

				String sql = "SELECT  MOBILE_NO||'('||USER_NAME||')' MOBILE_NO, sms.CREATE_BY, SEND_TIME, SMS_BODY, sms.CREATE_DATE,DECODE(sms.STATUS,'N','Generated','T','SMS Sent') STATUS FROM IC_SMS_DTL sms ,IC_USER_MST userm where SMS.MOBILE_NO=USERM.MOBILE and trunc(SEND_TIME)>=to_date('"+FROM_DATE+"','rrrr-mm-dd') and trunc(SEND_TIME)<=to_date('"+TO_DATE+"','rrrr-mm-dd')";
				List<SMS_LOG_DETAILS> listSMSLOG = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(SMS_LOG_DETAILS.class));

				return listSMSLOG;
			}
		  
		  
		  
		  public List<DrpDwn> listDrpDwnPP() {

				String sql = "SELECT PP_CODE DCODE,PP_NAME DNAME FROM IC_POWER_PLANT where OWNER_CODE in ('001') ";
				List<DrpDwn> listDrpDwnPP = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(DrpDwn.class));

				return listDrpDwnPP;
			}
		  
		public List<PP_GEN_DASHBOARD_TABLE> listPP_GEN_DASHBOARD_TABLE( String PP_CODE, String BILL_CYCLE_CODE) {

				String sql = " SELECT BILL_CYCLE_CODE,a.PP_UNIT_CODE,b.PP_UNIT_NAME,ENRG_GEN,a.UPDATE_DATE from IC_PP_UNIT_MOD a,IC_PP_UNIT_DTL b,  ic_power_plant c "
						+ "		where a.PP_CODE=b.PP_CODE and B.PP_CODE=c.pp_code   and C.OWNER_CODE in ('001') "
						+ "		and BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"'"
						+ "	or a.PP_CODE='"+PP_CODE+"'";
				List<PP_GEN_DASHBOARD_TABLE> listPP_GEN_DASHBOARD_TABLE = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(PP_GEN_DASHBOARD_TABLE.class));

				return listPP_GEN_DASHBOARD_TABLE;
			}
		
		public List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH( String BILL_CYCLE_CODE) {

			String sql = " SELECT count(1)-count(a.UPDATE_DATE) DATA_NOT_ENTERED, count(a.UPDATE_DATE) DATA_ENTERED"
					+ " from IC_PP_UNIT_MOD a,IC_PP_UNIT_DTL b, ic_power_plant c where a.PP_CODE=b.PP_CODE"
					+ "                          and BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"'"
					+ "                          and B.PP_CODE=c.pp_code"
					+ "                          and C.OWNER_CODE in ('001')"
					+ "                          group by BILL_CYCLE_CODE";
			List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(PP_GEN_DASHBOARD_GRAPH.class));

			return listPP_GEN_DASHBOARD_GRAPH;
		}
		
		
		public List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX( String BILL_CYCLE_CODE) {

			String sql = " SELECT  count(LDC) DATA_ENTERED from IC_LDC_MONTH_MAX_DATA where BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"' ";
			List<PP_GEN_DASHBOARD_GRAPH> listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(PP_GEN_DASHBOARD_GRAPH.class));

			return listPP_GEN_DASHBOARD_GRAPH_MONTH_MAX;
		}
		
		
		public List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST( String BILL_CYCLE_CODE) {

			String sql = " SELECT NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE from IC_DC_OF_ILLIGAL_USE_ST where BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"' ";
			List<IC_DC_OF_ILLIGAL_USE_ST> listIC_DC_OF_ILLIGAL_USE_ST = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(IC_DC_OF_ILLIGAL_USE_ST.class));

			return listIC_DC_OF_ILLIGAL_USE_ST;
		}
		
		public List<IC_RC_DC_ST> listIC_DC_RC( String BILL_CYCLE_CODE) {

			String sql = " SELECT NO_OF_DC_LINE, COLL_AGAINST_DC, NO_OF_RC_LINE, COLL_AGAINST_RC from IC_RC_DC_ST where BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"'  ";
			List<IC_RC_DC_ST> listIC_DC_RC = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(IC_RC_DC_ST.class));

			return listIC_DC_RC;
		}
		
		
		
		public List<PP_GEN_DASHBOARD_GRAPH> listIPP_GEN_DASHBOARD_GRAPH( String BILL_CYCLE_CODE) {

			String sql = " SELECT count(1)-count(a.UPDATE_DATE) DATA_NOT_ENTERED, count(a.UPDATE_DATE) DATA_ENTERED"
					+ " from IC_PP_UNIT_MOD a,IC_PP_UNIT_DTL b, ic_power_plant c where a.PP_CODE=b.PP_CODE"
					+ "                          and BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"'"
					+ "                          and B.PP_CODE=c.pp_code"
					+ "                          and C.OWNER_CODE not in ('001')"
					+ "                          group by BILL_CYCLE_CODE";
			List<PP_GEN_DASHBOARD_GRAPH> listIPP_GEN_DASHBOARD_GRAPH = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(PP_GEN_DASHBOARD_GRAPH.class));

			return listIPP_GEN_DASHBOARD_GRAPH;
		}
		
		
		 public List<DrpDwn> listDrpDwnIPP() {

				String sql = "SELECT PP_CODE DCODE,PP_NAME DNAME FROM IC_POWER_PLANT where OWNER_CODE not in ('001') ";
				List<DrpDwn> listDrpDwnIPP = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(DrpDwn.class));

				return listDrpDwnIPP;
			}
		  
		public List<PP_GEN_DASHBOARD_TABLE> listIPP_GEN_DASHBOARD_TABLE( String PP_CODE, String BILL_CYCLE_CODE) {

				String sql = " SELECT BILL_CYCLE_CODE,a.PP_UNIT_CODE,b.PP_UNIT_NAME,ENRG_GEN,a.UPDATE_DATE from IC_PP_UNIT_MOD a,IC_PP_UNIT_DTL b,  ic_power_plant c "
						+ "		where a.PP_CODE=b.PP_CODE and B.PP_CODE=c.pp_code   and C.OWNER_CODE not in ('001') "
						+ "		and BILL_CYCLE_CODE='"+BILL_CYCLE_CODE+"'"
						+ "		or a.PP_CODE='"+PP_CODE+"'";
				List<PP_GEN_DASHBOARD_TABLE> listIPP_GEN_DASHBOARD_TABLE = jdbcTemplate.query(sql,
						BeanPropertyRowMapper.newInstance(PP_GEN_DASHBOARD_TABLE.class));

				return listIPP_GEN_DASHBOARD_TABLE;
			}
		
		
		
		
		
		
		
		
		
		
		
		public List<IC_DC_RC> listIC_DC_RC() {

			String sql = "Select BILL_CYCLE_CODE, NO_OF_DC_LINE, COLL_AGAINST_DC, NO_OF_RC_LINE, COLL_AGAINST_RC, RC_DC_ID, STATUS from IC_RC_DC_ST";
			List<IC_DC_RC> listIC_DC_RC = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(IC_DC_RC.class));

			return listIC_DC_RC;
		}

		public IC_DC_RC listIC_DC_RC_S(int id) {

			String sql = "Select BILL_CYCLE_CODE, NO_OF_DC_LINE, COLL_AGAINST_DC, NO_OF_RC_LINE, COLL_AGAINST_RC, STATUS from IC_RC_DC_ST where RC_DC_ID=?";

			Object[] args = { id };
			@SuppressWarnings("deprecation")
			IC_DC_RC iC_DC_RC = jdbcTemplate.queryForObject(sql, args,
					BeanPropertyRowMapper.newInstance(IC_DC_RC.class));

			return iC_DC_RC;
		}

		public void insert_IC_DC_RC(IC_DC_RC sale) {
			String sql = "INSERT INTO IC_RC_DC_ST (BILL_CYCLE_CODE, NO_OF_DC_LINE, COLL_AGAINST_DC, NO_OF_RC_LINE, COLL_AGAINST_RC, STATUS)VALUES(:BILL_CYCLE_CODE, :NO_OF_DC_LINE, :COLL_AGAINST_DC, :NO_OF_RC_LINE, :COLL_AGAINST_RC, :STATUS)";
			BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
			NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
			template.update(sql, param);
		}

		public void IC_DC_RC_edit(IC_DC_RC sale) {
			String sql = "UPDATE IC_RC_DC_ST SET BILL_CYCLE_CODE=:BILL_CYCLE_CODE, NO_OF_DC_LINE=:NO_OF_DC_LINE, COLL_AGAINST_DC=:COLL_AGAINST_DC, NO_OF_RC_LINE=:NO_OF_RC_LINE, COLL_AGAINST_RC=:COLL_AGAINST_RC,  STATUS=:STATUS where RC_DC_ID=:RC_DC_ID";
			BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
			NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
			template.update(sql, param);
		}

		public void IC_DC_RC_delete(int id) {
			String sql = "DELETE FROM IC_RC_DC_ST WHERE  RC_DC_ID= :RC_DC_ID";
			jdbcTemplate.update(sql, id);
		} 
		
		public List<MOD_ENERGY_SOLD_REPORT> listMOD_ENERGY_SOLD_REPORT(String BILL_CYCLE_CODE, String LOCATION_CODE) {

			String sql = "select sum(NEW_CONS) TOTAL_NEW_CONSUMER_IN_MONTH from IC_CAT_WISE_MOD where BILL_CYCLE_CODE ='"+BILL_CYCLE_CODE+"'   AND LOCATION_CODE ='"+LOCATION_CODE+"' ";
			List<MOD_ENERGY_SOLD_REPORT> listMOD_ENERGY_SOLD_REPORT = jdbcTemplate.query(sql,
					BeanPropertyRowMapper.newInstance(MOD_ENERGY_SOLD_REPORT.class));

			return listMOD_ENERGY_SOLD_REPORT;
		}
		
		
}
