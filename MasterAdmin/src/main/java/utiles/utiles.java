package utiles;

import org.openqa.selenium.Proxy;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ApiResponseElement;
import org.zaproxy.clientapi.core.ApiResponseList;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

public class utiles {
	private static ClientApi clientapi;
	public static Proxy proxy;
	
	private static final String ZAP_PROXY_ADDRESS="localhost";
	private static final int ZAP_PROXY_PORT=8081;
	private static final String ZAP_API_KEY="a0h97bl0mpm016uaouf9cctq7n";
	
	static {
		clientapi=new ClientApi(ZAP_PROXY_ADDRESS, ZAP_PROXY_PORT, ZAP_API_KEY);
		String proxyServerUrl= ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;
		
		proxy=new Proxy();
		proxy.setHttpProxy(proxyServerUrl);
		proxy.setSslProxy(proxyServerUrl);
	}
	public static void waitTillPassiveScanCompleted() {
		try {
			ApiResponse api=clientapi.pscan.recordsToScan();
			String tempval=((ApiResponseElement)api).getValue();
			while(!tempval.equals("0")) {
				System.out.println("passive scan is in progress");
				api=clientapi.pscan.recordsToScan();
				tempval=((ApiResponseElement)api).getValue();
			}
			ApiResponseList urls = (ApiResponseList) clientapi.core.urls();
			for (ApiResponse item : urls.getItems()) {
			    System.out.println("Found URL: " + ((ApiResponseElement) item).getValue());
			}

			System.out.println("passive scan is completed");
		} catch (ClientApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public static void generateZapReport(String site_to_test) {
	        String title = "Master Admin";
	        String template = "traditional-html";
	        String theme = null;
	        String description = "Master Admin Approved License";
	        String contexts = null;
	        String sites = site_to_test;
	        String sections = null;
	        String includedconfidences = null;
	        String includedrisks = null;
	        String reportfilename = "MasterAdmin_Approved_License";
	        String reportfilenamepattern = null;
	        String reportdir = "/home/tvisha/eclipse-workspace2/Zap/target/MasterAdmin";
	        String display = null;

	        try {
	            clientapi.reports.generate(title, template, theme, description, contexts, sites, sections,
	                    includedconfidences, includedrisks, reportfilename, reportfilenamepattern, reportdir, display);
	        } catch (ClientApiException e) {
	            e.printStackTrace();
	        }
	 }
}

