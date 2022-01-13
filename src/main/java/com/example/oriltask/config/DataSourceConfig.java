package com.example.oriltask.config;

import com.example.oriltask.repository.CryptoRepository;
import lombok.SneakyThrows;
import model.ModelCrypto;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.FluentQuery;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
@EnableJpaRepositories

public class DataSourceConfig {
    Connection connection = null;
        Statement statement = null;
    ResultSet resultSet = null;
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/cryptocurrency")
                .username("root")
                .password("RootRoot")
                .build();
    }

    @Bean
    CryptoRepository cryptoRepository() {
        return new CryptoRepository() {


            @Override
            public List<ModelCrypto> findByFirstName(String firstName) {
                List<ModelCrypto> list = new ArrayList<>();
                list.add(new ModelCrypto(1, "BTC/USD", "BTC", "USD", 42940.9));
                return list;
            }

            @Override
            public List<ModelCrypto> findAll() {
                List<ModelCrypto> list = new ArrayList<>();
                list.add(new ModelCrypto(1, "BTC/USD", "BTC", "USD", 42940.9));
                list.add(new ModelCrypto(2, "ETH/USD", "ETH", "USD", 3372.6));
                list.add(new ModelCrypto(3, "XRP/USD", "XRP", "USD", 0.79076));

                return list;
            }




            @Override
            public List<ModelCrypto> findAll(Sort sort) {
//                List<ModelCrypto> list = new ArrayList<>();
//                list.sort(new Comparator<ModelCrypto>() {
//                    @Override
//                    public int compare(ModelCrypto o1, ModelCrypto o2) {
//                        return (int) (o1.getLastPrice()-o2.getLastPrice());
//                    }
//                });
                return null;
            }

            @Override
            public List<ModelCrypto> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends ModelCrypto> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends ModelCrypto> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends ModelCrypto> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<ModelCrypto> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public ModelCrypto getOne(Long aLong) {
                return null;
            }


            @SneakyThrows
            @Override
            public ModelCrypto getById(Long aLong) {
                int k = 0;
                ResultSet rs = statement.executeQuery("select count(*) FROM Users");
                rs.next();
                k = rs.getInt("count(*)");
                String sql = "select id FROM Users where id= " + k;
                rs = statement.executeQuery(sql);
                ModelCrypto contact = new ModelCrypto(1, "BTC/USD", "BTC", "USD", 42940.9);
                while (rs.next()) {
                    contact.setId(rs.getInt("id"));
                }
                return  contact;


            }

            @Override
            public <S extends ModelCrypto> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends ModelCrypto> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<ModelCrypto> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ModelCrypto> S save(S entity) {
                return null;
            }

            @Override
            public Optional<ModelCrypto> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(ModelCrypto entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends ModelCrypto> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends ModelCrypto> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends ModelCrypto> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends ModelCrypto> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends ModelCrypto> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends ModelCrypto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }
}




