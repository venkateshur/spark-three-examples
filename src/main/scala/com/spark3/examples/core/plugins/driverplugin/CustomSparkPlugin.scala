package com.spark3.examples.core.plugins.driverplugin

import org.apache.spark.api.plugin.{DriverPlugin, ExecutorPlugin, SparkPlugin}

class CustomSparkPlugin extends SparkPlugin{
  override def driverPlugin(): DriverPlugin = new CustomDriverPlugin

  override def executorPlugin(): ExecutorPlugin = null
}
