package psvm_code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadWebsite {
	public static void main(String[] args) throws Exception {
		String url = "https://wisdomquotes.com/happiness-quotes/";
		
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("GET");
		
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}
}