package com.example.demo;

public class IC_TRANS_GRID {
	
private String  GRID_CODE;

private String  GRID_DESC;

public IC_TRANS_GRID() {
	super();
	// TODO Auto-generated constructor stub
}

public IC_TRANS_GRID(String gRID_CODE, String gRID_DESC) {
	super();
	GRID_CODE = gRID_CODE;
	GRID_DESC = gRID_DESC;
}

public String getGRID_CODE() {
	return GRID_CODE;
}

public void setGRID_CODE(String gRID_CODE) {
	GRID_CODE = gRID_CODE;
}

public String getGRID_DESC() {
	return GRID_DESC;
}

public void setGRID_DESC(String gRID_DESC) {
	GRID_DESC = gRID_DESC;
}

@Override
public String toString() {
	return "IC_TRANS_GRID [GRID_CODE=" + GRID_CODE + ", GRID_DESC=" + GRID_DESC + "]";
}


}
