package id.brainmaster.iso20022;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories(basePackages = "id.brainmaster.iso20022.repository")
public class CassandraConfig extends AbstractReactiveCassandraConfiguration {

    @Bean
    public CassandraMappingContext cassandraMapping()
            throws ClassNotFoundException {
        return new CassandraMappingContext();
    }

    @Override
    protected String getKeyspaceName() {
        return "demodb";
    }

    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster =
                new CassandraClusterFactoryBean();
        cluster.setContactPoints("127.0.0.1");
        cluster.setPort(9142);
        return cluster;
    }

}