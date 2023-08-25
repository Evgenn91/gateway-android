package com.github.Evgenn91.server;

import com.github.Evgenn91.core.GatewayCoreConfiguration;
import com.github.Evgenn91.port.rest.GatewayPortRestConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.github.Evgenn91.server"})
@Import({GatewayPortRestConfiguration.class, GatewayCoreConfiguration.class})
public class ServerConfiguration {
}
