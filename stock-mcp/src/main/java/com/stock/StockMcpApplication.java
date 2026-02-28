package com.stock;

import com.stock.mcp.tool.DateTool;
import com.stock.mcp.tool.EmailTool;
import com.stock.mcp.tool.StockTool;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StockMcpApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockMcpApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider registMCPTools(DateTool dateTool,
                                               EmailTool emailTool,
                                               StockTool stockTool) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(dateTool, emailTool, stockTool)
                .build();
    }

}