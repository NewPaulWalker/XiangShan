package cache.TLBTest

import cache.TestComponentBase

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class TLBSequencer(isDtlb: Boolean, tlbWidth: Int, ID: Int = 2, name: String = "TLBSequencer", start_clock: Int = 0)
  extends TestComponentBase(ID, name, start_clock) with TlbCsrConst
{

  val tlbTransList: ListBuffer[TLBCallerTransaction] = ListBuffer()
  val ptwTransList: ListBuffer[(BigInt, PTWCalleeTransaction)] = ListBuffer()

  def issueTlbReqTrans(): Option[TLBCallerTransaction] = {
    val newTrans = new TLBCallerTransaction()

    None
  }

  def handleTlbRespTrans(trans: TLBCallerTransaction): Unit = {

  }

  def checkPtwAvailable(): Boolean = {
    true
  }

  def handlePtwReqTrans(id: BigInt, trans: PTWCalleeTransaction): Unit = {

  }

  def issuePtwRespTrans(): Option[(BigInt, PTWCalleeTransaction)] = {
    None
  }
}