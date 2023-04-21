package com.reto.nttData.repository;

import com.reto.nttData.domain.entities.Client;
import com.reto.nttData.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    //@Query(value = "select * from Transactions where date between :initDate and :endDate", nativeQuery = true)
    /*@Query(value = "select * from Transactions t " +
            "inner join Accounts ac on t.account_id = ac.id " +
            "where t.date between :initDate and :endDate and ac.id = :id"
            , nativeQuery = true)*/

    @Query(value = "SELECT T.DATE, C.NAME, AC.ACCOUNT_NUMBER, AC.ACCOUNT_TYPE, AC.STATUS, T.BALANCE, " +
                    " T.AMOUNT * CASE WHEN T.TRANSACTION_TYPE = 'DEBIT' THEN -1 ELSE 1 END AS AMOUNT" +
                    " FROM TRANSACTIONS T " +
                    " INNER JOIN ACCOUNTS AC ON T.ACCOUNT_ID = AC.ID " +
                    " INNER JOIN CLIENTS C ON C.CLIENT_ID = AC.CLIENT_ID " +
                    " WHERE T.DATE BETWEEN :initDate AND :endDate " +
                    " AND C.CLIENT_ID = :clientId "
            , nativeQuery = true)
    List<Object[]> findAllTransactionByDate(@Param("initDate") Date initDate, @Param("endDate") Date endDate, @Param("clientId") Long clientId);

    @Query(value = "SELECT NVL(SUM(T.AMOUNT), 0) AS TOTALAMOUNT" +
            " FROM TRANSACTIONS T WHERE LEFT(T.DATE, 10) = :date " +
            " AND T.TRANSACTION_TYPE = :type " +
            " AND T.ACCOUNT_ID = :id "
            , nativeQuery = true)
    Double findAllTransactionByTransactionType(String date, String type, Long id);
}
