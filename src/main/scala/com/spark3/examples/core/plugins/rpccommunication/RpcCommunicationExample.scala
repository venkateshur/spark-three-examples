package com.spark3.examples.core.plugins.rpccommunication

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object RpcCommunicationExample {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf()
      .setMaster("local[2]")
      .set("spark.plugins","RpcSparkPlugin")
      .setAppName("rpc communication example")

    val sparkSession = SparkSession.builder.config(sparkConf).getOrCreate()
    sparkSession.stop()

  }
}
