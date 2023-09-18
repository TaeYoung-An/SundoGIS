package egovframework.ddan.service;

import java.util.List;
import java.util.Map;

import egovframework.ddan.vo.CarVo;
import egovframework.ddan.vo.CleanVo;
import egovframework.ddan.vo.CsvVO;
import egovframework.ddan.vo.LocationVo;
import egovframework.ddan.vo.PointsVo;


public interface PointService {
	
	
	public int insertList(List<LocationVo> list);
	
	public List<PointsVo> getCarList();

	public CleanVo getCleanData(PointsVo points);

	public int insertCsv(CsvVO vo);  
	
	public List<CleanVo> getStaics(PointsVo points);
	
	public CleanVo monthData();
	
	public Map<String, Object> getDateList(String car_num);

	public Map<String, Object> getCleanTimeRatio(String date, String car_num);
	
	public List<LocationVo> goLive(LocationVo obj);

	public MemberVo login(MemberVo member);

	public int addCar(CarVo carVo);
	
	public int insertLive(LocationVo vo);
	
	public int liveTempInsert(LocationVo vo);
	
	public String getLiveTime();
}
