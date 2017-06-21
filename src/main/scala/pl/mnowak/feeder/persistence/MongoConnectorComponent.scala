package pl.mnowak.feeder.persistence

import reactivemongo.api.{MongoConnection, MongoDriver}

class MongoConnector {

  private val driver = MongoDriver()
  private val parsedUri = MongoConnection.parseURI()

}
