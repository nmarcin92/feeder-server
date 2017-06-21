package pl.mnowak.feeder.user.model

class User(login: String, name: String, pwdHash: PwdHash)

case class PwdHash(hash: String) {
  require(hash.length == 60)
}