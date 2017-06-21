package pl.mnowak.feeder.persistence

import pl.mnowak.feeder.configuration.SettingsComponent
import reactivemongo.api.{MongoConnection, MongoDriver}

trait MongoConnectorComponent {
  this: SettingsComponent =>

  val mongoConnector: MongoConnector

  class MongoConnector {

    private val driver = MongoDriver()
    private val parsedUri = MongoConnection.parseURI(settings.mongoDbUri)
    private val connection = parsedUri.map(driver.connection)




  }

}