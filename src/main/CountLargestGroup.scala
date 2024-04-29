class CountLargestGroup {
  def countLargestGroup(n: Int): Int = {
    val list = (1 to n).toList
    def sumOfDigits(x: Int): Int = {
      def loop(x: Int, sum: Int): Int = {
        if(x<=0)
          return sum
        loop(x/10,sum+x%10)
      }
      loop(x,0)
    }
    val myList = list.groupBy(x => sumOfDigits(x)).map{
      case(x,y) => y.size
    }
    val maxi = myList.max
    (for{
      ele <- myList
      if(ele==maxi)
    } yield 1).sum
  }
}
