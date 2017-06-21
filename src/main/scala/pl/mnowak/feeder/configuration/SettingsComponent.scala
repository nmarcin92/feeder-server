package pl.mnowak.feeder.configuration

import com.typesafe.config.ConfigFactory

trait SettingsComponent {

  val settings

  class Settings {

    private val config = ConfigFactory.load()

    final val mongoDbUri: String = config.getString("persistence.mongo.uri")

  }

}