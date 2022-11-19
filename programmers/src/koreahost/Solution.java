//package programmers.src.koreahost;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
//public class Solution {
//
//	public static void main(String[] args) {
//
//		String testData= "[{\"company\":\"회사1\",\"name\":\"김아무개3\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사2\",\"name\":\"김아무개2\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사1\",\"name\":\"김아무개2\",\"date\":\"2020-02-09 10:43:19\",\"result\":\"불합격\"}, "
//				+ "{\"company\":\"회사3\",\"name\":\"김아무개3\",\"date\":\"2020-05-19 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사1\",\"name\":\"김아무개5\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사4\",\"name\":\"김아무개3\",\"date\":\"2020-02-19 10:43:19\",\"result\":\"불합격\"},"
//				+ " {\"company\":\"회사1\",\"name\":\"김아무개4\",\"date\":\"2020-01-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사5\",\"name\":\"김아무개4\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사3\",\"name\":\"김아무개2\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"불합격\"}, "
//				+ "{\"company\":\"회사1\",\"name\":\"김아무개1\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"합격\"}, "
//				+ "{\"company\":\"회사2\",\"name\":\"김아무개4\",\"date\":\"2020-06-09 10:43:19\",\"result\":\"불합격\"}, "
//				+ "{\"company\":\"회사3\",\"name\":\"김아무개1\",\"date\":\"2020-04-09 10:43:19\",\"result\":\"불합격\"}]";
//
//		JSONObject data1 = new JSONObject();
//		data1.put("company", "회사1");
//		data1.put("name", "김아무개3");
//		data1.put("date", "2020-06-09 10:43:191");
//		data1.put("result", "합격");
//		JSONObject data2 = new JSONObject();
//		data2.put("company", "회사2");
//		data2.put("name", "김아무개2");
//		data2.put("date", "2020-04-09 10:43:191");
//		data2.put("result", "합격");
//		JSONObject data3 = new JSONObject();
//		data3.put("company", "회사1");
//		data3.put("name", "김아무개2");
//		data3.put("date", "2020-02-09 10:43:191");
//		data3.put("result", "불합격");
//		JSONObject data4 = new JSONObject();
//		data4.put("company", "회사3");
//		data4.put("name", "김아무개3");
//		data4.put("date", "2020-05-19 10:43:191");
//		data4.put("result", "합격");
//		JSONObject data5 = new JSONObject();
//		data5.put("company", "회사1");
//		data5.put("name", "김아무개5");
//		data5.put("date", "2020-06-09 10:43:191");
//		data5.put("result", "합격");
//		JSONObject data6 = new JSONObject();
//		data6.put("company", "회사4");
//		data6.put("name", "김아무개3");
//		data6.put("date", "2020-02-19 10:43:191");
//		data6.put("result", "불합격");
//		JSONObject data7 = new JSONObject();
//		data7.put("company", "회사1");
//		data7.put("name", "김아무개4");
//		data7.put("date", "2020-01-09 10:43:191");
//		data7.put("result", "합격");
//		JSONObject data8 = new JSONObject();
//		data8.put("company", "회사5");
//		data8.put("name", "김아무개4");
//		data8.put("date", "2020-04-09 10:43:191");
//		data8.put("result", "합격");
//		JSONObject data9 = new JSONObject();
//		data9.put("company", "회사3");
//		data9.put("name", "김아무개2");
//		data9.put("date", "2020-06-09 10:43:191");
//		data9.put("result", "불합격");
//		JSONObject data10 = new JSONObject();
//		data10.put("company", "회사1");
//		data10.put("name", "김아무개1");
//		data10.put("date", "2020-06-09 10:43:191");
//		data10.put("result", "합격");
//		JSONObject data11 = new JSONObject();
//		data11.put("company", "회사2");
//		data11.put("name", "김아무개4");
//		data11.put("date", "2020-06-09 10:43:191");
//		data11.put("result", "불합격");
//		JSONObject data12 = new JSONObject();
//		data12.put("company", "회사3");
//		data12.put("name", "김아무개1");
//		data12.put("date", "2020-04-09 10:43:191");
//		data12.put("result", "불합격");
//
//
//		JSONArray jArr = new JSONArray();
//		jArr.add(data1);
//		jArr.add(data2);
//		jArr.add(data3);
//		jArr.add(data4);
//		jArr.add(data5);
//		jArr.add(data6);
//		jArr.add(data7);
//		jArr.add(data8);
//		jArr.add(data9);
//		jArr.add(data10);
//		jArr.add(data11);
//		jArr.add(data12);
//
//		int cnt = jArr.size();
//		List company = new ArrayList(cnt);
//		List name = new ArrayList(cnt);
//		List date = new ArrayList(cnt);
//		List result = new ArrayList(cnt);
//
//		for(int i=0; i<cnt; i++) {
//			JSONObject ob = (JSONObject)jArr.get(i);
//			company.add(ob.get("company"));
//			name.add(ob.get("name"));
//			date.add(ob.get("date").toString().substring(0,7));
//			result.add(ob.get("result"));
//		}
//
//		List name1 = new ArrayList<>();
//		for(int i=0; i<name.size(); i++) {
//			if(!name1.contains(name.get(i))) {
//				name1.add(name.get(i));
//			}
//		}
//		Collections.sort(name1);
//		int [] pass = new int[name1.size()];
//		int [] failure = new int[name1.size()];
//
//		for(int i=0; i<result.size(); i++) {
//			for(int j=0; j<name1.size(); j++) {
//				if(name.get(i).equals(name1.get(j)) && result.get(i).equals("합격")) {
//					pass[j]++;
//				}else if(name.get(i).equals(name1.get(j)) && result.get(i).equals("불합격")){
//					failure[j]++;
//				}
//			}
//		}
//		System.out.println("지원자   |합격자수  |불합격자수");
//		for(int i=0; i<name1.size(); i++) {
//			System.out.println(name1.get(i)+" |"+pass[i]+  "       |"+failure[i]);
//		}
//
//		List date1 = new ArrayList<>();
//		for(int i=0; i<date.size(); i++) {
//			if(!date1.contains(date.get(i))) {
//				date1.add(date.get(i));
//			}
//		}
//		date1.add("2020-03");
//		Collections.sort(date1);
//		int [] pass1 = new int[date1.size()];
//		int [] failure1 = new int[date1.size()];
//
//		for(int i=0; i<result.size(); i++) {
//			for(int j=0; j<date1.size(); j++) {
//				if(date.get(i).equals(date1.get(j)) && result.get(i).equals("합격")) {
//					pass1[j]++;
//				}else if(date.get(i).equals(date1.get(j)) && result.get(i).equals("불합격")){
//					failure1[j]++;
//				}
//			}
//		}
//		System.out.println("월         |합격자수   |불합격자수");
//		for(int i=0; i<date1.size(); i++) {
//			System.out.println(date1.get(i)+  "   |"+pass1[i]+  "        |"+failure1[i]);
//		}
//
//		List company1 = new ArrayList<>();
//		for(int i=0; i<company.size(); i++) {
//			if(!company1.contains(company.get(i))) {
//				company1.add(company.get(i));
//			}
//		}
//		int [] sup = new int[company1.size()];
//		Collections.sort(company1);
//		int [] pass2 = new int[company1.size()];
//		int [] passrool = new int[company1.size()];
//
//		for(int i=0; i<result.size(); i++) {
//			for(int j=0; j<company1.size(); j++) {
//				if(company.get(i).equals(company1.get(j)) && result.get(i).equals("합격")) {
//					pass2[j]++;
//				}
//				if(company.get(i).equals(company1.get(j))){
//					sup[j]++;
//				}
//			}
//		}
//		System.out.println("회사   |지원자수   |합격률");
//		for(int i=0; i<company1.size(); i++) {
//			System.out.println(company1.get(i)+"  |"+sup[i]+"        |"+Math.round(((double)pass2[i]/(double)sup[i])*100)+"%");
//		}
//	}
//
//}
