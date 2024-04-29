class ValidAnagram {
  def isAnagram(s: String, t: String): Boolean = {
    val mapS = s.toList.groupBy(identity).map{
      case(x,y) => x->y.size
    }
    val mapT = t.toList.groupBy(identity).map{
      case(x,y) => x->y.size
    }
    return mapS==mapT
  }
}
