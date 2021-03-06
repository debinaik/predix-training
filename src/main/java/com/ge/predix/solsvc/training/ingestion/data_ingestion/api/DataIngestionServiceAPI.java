package com.ge.predix.solsvc.training.ingestion.data_ingestion.api;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author predix -
 */
public interface DataIngestionServiceAPI
{
    /**
     * @param authorization -
     * @param fileName -
     * @param clientId -
     * @param tenantId -
     * @param file -
     * @return -
     */
    public @ResponseBody String handleFileUpload(String authorization, String fileName, String clientId,
            String tenantId, MultipartFile file);

    /**
     * @return -
     */
    public @ResponseBody String handleRequest();

    /**
     * @param authorization -
     * @param clientId -
     * @param tenantId -
     * @param content -
     * @return -
     */
    public @ResponseBody String cargoTimeSeriesData(
            @RequestHeader(value = "authorization", required = false) String authorization,
            @RequestParam("clientId") String clientId, @RequestParam("tenantId") String tenantId,
            @RequestParam("content") String content);
    
   // public @ResponseBody String cargoTimeSeriesData(@RequestHeader String json_data);

}
