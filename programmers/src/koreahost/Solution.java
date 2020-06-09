package koreahost;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Solution {

	public static void main(String[] args) {
		
		String testData= "[{\"company\":\"회사1\",\"name\":\"김아무개3\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사2\",\"name\":\"김아무개2\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사1\",\"name\":\"김아무개2\",\"date\":\"2020-02-09 10:43:19\",\"result\":\"불합격\"}, "
				+ "{\"company\":\"회사3\",\"name\":\"김아무개3\",\"date\":\"2020-05-19 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사1\",\"name\":\"김아무개5\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사4\",\"name\":\"김아무개3\",\"date\":\"2020-02-19 10:43:19\",\"result\":\"불합격\"},"
				+ " {\"company\":\"회사1\",\"name\":\"김아무개4\",\"date\":\"2020-01-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사5\",\"name\":\"김아무개4\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사3\",\"name\":\"김아무개2\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"불합격\"}, "
				+ "{\"company\":\"회사1\",\"name\":\"김아무개1\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
				+ "{\"company\":\"회사2\",\"name\":\"김아무개4\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"불합격\"}, "
				+ "{\"company\":\"회사3\",\"name\":\"김아무개1\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"불합격\"}]";
		
		


		System.out.println(testData);
		JSONArray jArr = new JSONArray();
		int cnt = jArr.length;
		List company = new ArrayList(cnt);
		List name = new ArrayList(cnt);
		List date = new ArrayList(cnt);
		List result = new ArrayList(cnt);
		List resultCnt = new ArrayList(cnt);
		
		for(int i=0; i<cnt; i++) {
			JSONObject jObj = jArr.getJSONObject(i);
			company.add(jObj.getString("company"));
			name.add(jObj.getString("name"));
			date.add(jObj.getString("date"));
			result.add(jObj.getString("result"));
		}
		
		List company1 = new ArrayList<>();
		for(int i=0; i<company.size(); i++) {
			if(!company1.contains(company.get(i))) {
				company1.add(company.get(i));
			}
			if(company==null) {
				company1.add(company.get(i));
			}
		}
		int [] hab = new int[company1.size()];
		int [] boolhab = new int[company1.size()];
		
		for(int i=0; i<result.size(); i++) {
			for(int j=0; j<company1.size(); j++) {
				if(company.get(i).equals(company1.get(j)) && result.get(i).equals("합격")) {
					hab[i]++;
				}else {
					boolhab[i]++;
				}
			}
		}
		System.out.println("지원자   |합격자수   |불합격자수");
		for(int i=0; i<company1.size(); i++) {
			System.out.println(company.get(i)+  "|"+hab[i]+  "  |"+boolhab[i]);
		}
	}

}
