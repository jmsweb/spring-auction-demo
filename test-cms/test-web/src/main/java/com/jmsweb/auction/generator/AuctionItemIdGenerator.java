package com.jmsweb.auction.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AuctionItemIdGenerator implements IdentifierGenerator {

    private String nextValue = "SELECT next_val FROM auction_seq";
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        Connection connection = session.connection();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(nextValue);
            if (result.next()) {
                int id = result.getInt(1);
                String generatedId = Integer.toString(id);
                return generatedId;
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return null;
    }

}
