package jdbc;

import Entity.HistoryEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import Servlets.CRUDConfig;
import Servlets.HistoryCRUDInterface;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlCRUD implements HistoryCRUDInterface<HistoryEntity> {
    Connection connection;
    List<HistoryEntity> list = new ArrayList<>();

    public SqlCRUD() {
        this.connection = new Connect().getCon();
        System.out.println(connection);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void create(HistoryEntity historyent) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(HistoryEntity.class)
                .buildMetadata()
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            int num = CRUDConfig.getNextNum(list);

            session.save(new HistoryEntity(
                    num,
                    historyent.getId(),
                    historyent.getClas(),
                    historyent.getYear(),
                    historyent.getImgsrc(),
                    historyent.getText()
            ));

            session.getTransaction().commit();



        }
    }

    @Override
    public List<HistoryEntity> read() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(HistoryEntity.class)
                .buildMetadata()
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            list = (List<HistoryEntity>) session.createQuery("from HistoryEntity").list();

            session.getTransaction().commit();
        }

        return list;
    }

    @Override
    public void update(int num, HistoryEntity historyent) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(HistoryEntity.class)
                .buildMetadata()
                .buildSessionFactory()) {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            HistoryEntity updateHistory = new HistoryEntity(
                    num,
                    historyent.getId(),
                    historyent.getClas(),
                    historyent.getYear(),
                    historyent.getImgsrc(),
                    historyent.getText()
            );

            session.update(updateHistory);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(int Num) {
        try (PreparedStatement st = connection
                .prepareStatement("DELETE")) {
            st.setInt(1, Num);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}