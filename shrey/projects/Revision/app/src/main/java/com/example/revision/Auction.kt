package com.example.revision

fun main(){
    val winningBid = Bid(5000,"privateCollector")
    println("Item A is sold at ${auctionPrice(winningBid,2000)}.")
    println("Item B is sold at ${auctionPrice(null,3000)}.")
}
class Bid(val amount : Int , val bidder :String)
fun auctionPrice(bid: Bid?, MinPrice: Int): Int{
    return bid?.amount?:MinPrice
}
