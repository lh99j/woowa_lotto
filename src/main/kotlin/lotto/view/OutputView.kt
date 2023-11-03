package lotto.view

import lotto.model.LottoTicket

class OutputView {
    fun printGameStartMessage() {
        println("구입금액을 입력해 주세요.")
    }

    fun printPurchaseCount(purchaseCount: Int) {
        println("${purchaseCount}개를 구매했습니다.")
    }

    fun printLottoTicket(lottoTicket: LottoTicket) {
        val numbers = lottoTicket.numbers
        numbers.forEach {
            println(it)
        }
    }
}