package com.epam.mongo.db;

import com.mongodb.Block;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db = mongoClient.getDatabase("myFirstMongo");
        mongoClient.listDatabaseNames().forEach((Block<? super String>) System.out::println);

        db.createCollection("customers");
        db.listCollectionNames().forEach((Block<? super String>) c -> System.out.println(c));



    }

}
