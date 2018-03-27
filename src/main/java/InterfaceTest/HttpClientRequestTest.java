package InterfaceTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import getexcel.GetTestExcel;
import getexcel.ReadExcel;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import datainfo.AppData;

public class HttpClientRequestTest implements ITest{


	public String getTestName(){
		return "API test";
	}

//	    
//	    @BeforeTest
//	    @Parameters("workbookpath")
//	    public void setup(String workbookpath) {
//	    	AppData.testCasePath = workbookpath;
//	    	GetTestExcel.setExcel();
//			GetTestExcel.getSheet(0);
//			GetTestExcel.getWritableSheet(0);
//	    }
//	    
//	    @DataProvider(name = "testParameters")
//	    protected Iterator<Object[]> testParameters (ITestContext context){
//	    	List<Object []> testparameters = new ArrayList<Object []>();
//
//	    	for (int i = 0,row = 1; i < GetTestExcel.sheet.getRows()-1; i++) {			
//	    		String request = ReadExcel.getRequest(row);
//				String url= ReadExcel.getUrl(row);
//				String affirm= ReadExcel.getAffirm(row);
//				
//				testparameters.add(new String []{request,url,affirm,row+""});
//				row++;
//			}
//	    	
//	    	return testparameters.iterator();
//	    }
//	    
//	    //读取用例并请求，并写入结果
//	    @Test(dataProvider="testParameters")
//	    public static void requestAndWriteResult (String request,String url,String affirm,String rowstring){
//	    	try {
//				String respone = HttpRequest.sendPost(url, request);
//				
//				int row = Integer.parseInt(rowstring);
//				if (respone.contains(affirm)) {
//					ReadExcel.writeResult(row, respone, true);
//				}else{
//					ReadExcel.writeResult(row, respone, false);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	    }

//	    ------------------------------------------分割线-----------------------------------------------------------------
	    
	    
//	    @DataProvider(name = "WorkBookData")
//	    protected Iterator<Object[]> testProvider(ITestContext context) {
//
//	        List<Object[]> test_IDs = new ArrayList<Object[]>();
//
//	            myInputData = new DataReader(inputSheet, true, true, 0);
//	            Map<String, RecordHandler> myInput = myInputData.get_map();
//
//	            // sort map in order so that test cases ran in a fixed order
//	            Map<String, RecordHandler> sortmap = Utils.sortmap(myInput);
//	            
//	            for (Map.Entry<String, RecordHandler> entry : sortmap.entrySet()) {
//	                String test_ID = entry.getKey();
//	                String test_case = entry.getValue().get("TestCase");
//	                if (!test_ID.equals("") && !test_case.equals("")) {
//	                    test_IDs.add(new Object[] { test_ID, test_case });
//	                }
//	                totalcase++;
//	            }
//	            
//	            myBaselineData = new DataReader(baselineSheet, true, true, 0);
//
//	        return test_IDs.iterator();
//	    }
//
//	    @Test(dataProvider = "WorkBookData", description = "ReqGenTest")
//	    public void api_test(String ID, String test_case) {
//
//	        HTTPReqGen myReqGen = new HTTPReqGen();
//
//	        try {
//	            myReqGen.generate_request(template, myInputData.get_record(ID));
//	            response = myReqGen.perform_request();
//	        } catch (Exception e) {
//	            Assert.fail("Problem using HTTPRequestGenerator to generate response: " + e.getMessage());
//	        }
//	        
//	        String baseline_message = myBaselineData.get_record(ID).get("Response");
//
//	        if (response.statusCode() == 200)
//	            try {
//	                DataWriter.writeData(outputSheet, response.asString(), ID, test_case);
//	                
//	                JSONCompareResult result = JSONCompare.compareJSON(baseline_message, response.asString(), JSONCompareMode.NON_EXTENSIBLE);
//	                if (!result.passed()) {
//	                    DataWriter.writeData(comparsionSheet, result, ID, test_case);
//	                    DataWriter.writeData(resultSheet, "false", ID, test_case, 0);
//	                    DataWriter.writeData(outputSheet);
//	                    failedcase++;
//	                } else {
//	                    DataWriter.writeData(resultSheet, "true", ID, test_case, 0);
//	                }
//	            } catch (JSONException e) {
//	                DataWriter.writeData(comparsionSheet, "", "Problem to assert Response and baseline messages: "+e.getMessage(), ID, test_case);
//	                DataWriter.writeData(resultSheet, "error", ID, test_case, 0);
//	                failedcase++;
//	                Assert.fail("Problem to assert Response and baseline messages: " + e.getMessage());
//	            }
//	        else {
//	            DataWriter.writeData(outputSheet, response.statusLine(), ID, test_case);
//
//	            if (baseline_message.equals(response.statusLine())) {
//	                DataWriter.writeData(resultSheet, "true", ID, test_case, 0);
//	            } else {
//	                DataWriter.writeData(comparsionSheet, baseline_message, response.statusLine(), ID, test_case);
//	                DataWriter.writeData(resultSheet, "false", ID, test_case, 0);
//	                DataWriter.writeData(outputSheet);
//	                failedcase++;
//	            }
//	        }
//	    }
//
//	    @AfterTest
//	    public void teardown() {
//	        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	        endTime = sf.format(new Date());
//	        DataWriter.writeData(resultSheet, totalcase, failedcase, startTime, endTime);
//	        
//	        try {
//	            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
//	            wb.write(fileOutputStream);
//	            fileOutputStream.close();
//	        } catch (FileNotFoundException e) {
//	            e.printStackTrace();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }

	}
	
	

