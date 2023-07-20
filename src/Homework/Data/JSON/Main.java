package Homework.Data.JSON;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
public class Main {
    public static void main(String[] args) {
        try{
            String requestUrl = "https://api.fiscaldata.treasury.gov/services/api/fiscal_service/v2/debt/tror/data_act_compliance?fields=record_date,agency_bureau_indicator,agency_nm,bureau_nm,total_eligible_debt_amt";

            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder res = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                res.append(line);
            }
            reader.close();

            JSONObject resObj = new JSONObject(res.toString());
            String pretty = resObj.toString(4);

            System.out.println(pretty);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
