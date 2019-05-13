package io.arcblock.forge.did

import com.google.common.io.*
import io.arcblock.forge.utils.*

class WalletInfo (var address: String){
  lateinit var pk: ByteArray
  lateinit var sk: ByteArray
  var token: String?= null

  fun getAccountType():RoleType{
    return DidUtils.decodeDidRoleType(address)
  }

  fun getHashType(): HashType{
    return DidUtils.decodeDidHashType(address)
  }

  fun getSignType(): KeyType{
    return DidUtils.decodeDidSignType(address)
  }

  fun pkBase58():String = Base58Btc.encode(pk)
}
