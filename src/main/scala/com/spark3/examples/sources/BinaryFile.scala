package com.spark3.examples.sources

import org.apache.spark.sql.SparkSession

object BinaryFile {

  def main(args: Array[String]): Unit = {

    val sparkSession = SparkSession.builder().
      appName("simple").master("local").getOrCreate()

    val df = sparkSession.read.format("binaryFile")
        .load("src/main/resources/sample.bin")

    df.select("content").show()

  }

}
