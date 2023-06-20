package com.careerit.jfs.cj.day22;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RestClient {
  public static void main(String[] args) {
    try {
      // Specify the URL of the REST API endpoint
      String apiUrl = "https://restcountries.com/v3.1/all";

      // Create a URL object from the API URL
      URL url = new URL(apiUrl);

      // Open a connection to the API endpoint
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      // Set the request method (GET, POST, PUT, DELETE, etc.)
      connection.setRequestMethod("GET");

      // Get the response code
      int responseCode = connection.getResponseCode();

      // Check if the request was successful (HTTP 200-299)
      if (responseCode >= 200 && responseCode <= 299) {
        // Read the response body
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
          response.append(line);
        }
        reader.close();
        ObjectMapper objectMapper = new ObjectMapper();
        Object[] countries = objectMapper.readValue(response.toString(), Object[].class);
        List<CountryInfo> countryInfoList = new ArrayList<>();
        for (Object country : countries) {
          String jsonData = objectMapper.writeValueAsString(country);
          Map<String, Object> map = objectMapper.readValue(jsonData, Map.class);
          Map<String, Object> nameMap = objectMapper.readValue(objectMapper.writeValueAsString(map.get("name")), Map.class);
          String commonName = nameMap.get("common").toString();
          String officialName = nameMap.get("official").toString();
          List<String> capital = objectMapper.readValue(objectMapper.writeValueAsString(map.getOrDefault("capital", Collections.emptyList())), List.class);
          String region = map.get("region").toString();
          double area = Double.parseDouble(map.get("area").toString());
          double population =Double.parseDouble(map.get("population").toString());

          CountryInfo countryInfo = CountryInfo.builder()
              .population(population)
              .area(area)
              .capital(capital)
              .officialName(officialName)
              .commonName(commonName)
              .build();
          countryInfoList.add(countryInfo);
        }
        System.out.println(countryInfoList);
      } else {
        // Handle error responses
        System.out.println("Error: " + responseCode);
      }

      // Close the connection
      connection.disconnect();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
