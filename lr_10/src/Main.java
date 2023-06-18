package org.example;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {

        SparkSession spark = SparkSession.builder()
                .appName("RandomSplitExample")
                .master("local[*]")
                .getOrCreate();

        Dataset<Row> dataset = spark.read().format("csv")
                .option("header", "true")
                .load("/Users/sergey/IdeaProjects/lr_10/src");
        dataset.createOrReplaceTempView("dota");

        spark.sql("select * from dota").show();
        spark.sql("select * from dota where Rank <= 5").show();
        spark.sql("select * from dota where Rank%5=0").show();
        spark.sql("select * from dota where Strength >= 100000000").show();
        spark.sql("select * from dota where Title like '%abaddon%'").show();
        spark.sql("select * from dota where Hero = 'Io'").show();
        spark.sql("select * from dota where Hero = 'Lina'").show();
        spark.sql("select * from dota where Hero = 'Pudge'").show();
        spark.sql("select * from dota where Hero = 'Riki'").show();
        spark.sql("select * from dota where Hero = 'Slark'").show();
        spark.stop();
    }
}