package enumeratum

import enumeratum.EnumEntry._

sealed trait EmptyEnum extends EnumEntry

object EmptyEnum extends Enum[EmptyEnum] {
  val values = findValues
}

sealed trait DummyEnum extends EnumEntry

object DummyEnum extends Enum[DummyEnum] {

  val values = findValues

  case object Hello   extends DummyEnum
  case object GoodBye extends DummyEnum
  case object Hi      extends DummyEnum

}

sealed trait SnakeEnum extends EnumEntry with Snakecase

object SnakeEnum extends Enum[SnakeEnum] {

  val values = findValues

  case object Hello        extends SnakeEnum
  case object GoodBye      extends SnakeEnum
  case object ShoutGoodBye extends SnakeEnum with Uppercase

}

sealed trait UpperSnakeEnum extends EnumEntry with UpperSnakecase

object UpperSnakeEnum extends Enum[UpperSnakeEnum] {

  val values = findValues

  case object Hello          extends UpperSnakeEnum
  case object GoodBye        extends UpperSnakeEnum
  case object WhisperGoodBye extends UpperSnakeEnum with Lowercase

}

sealed trait CapitalSnakeEnum extends EnumEntry with CapitalSnakecase

object CapitalSnakeEnum extends Enum[CapitalSnakeEnum] {

  val values = findValues

  case object Hello          extends CapitalSnakeEnum
  case object GoodBye        extends CapitalSnakeEnum
  case object WhisperGoodBye extends CapitalSnakeEnum with Lowercase

}

sealed trait HyphenEnum extends EnumEntry with Hyphencase

object HyphenEnum extends Enum[HyphenEnum] {

  val values = findValues

  case object Hello        extends HyphenEnum
  case object GoodBye      extends HyphenEnum
  case object ShoutGoodBye extends HyphenEnum with Uppercase

}

sealed trait UpperHyphenEnum extends EnumEntry with UpperHyphencase

object UpperHyphenEnum extends Enum[UpperHyphenEnum] {

  val values = findValues

  case object Hello          extends UpperHyphenEnum
  case object GoodBye        extends UpperHyphenEnum
  case object WhisperGoodBye extends UpperHyphenEnum with Lowercase

}

sealed trait CapitalHyphenEnum extends EnumEntry with CapitalHyphencase

object CapitalHyphenEnum extends Enum[CapitalHyphenEnum] {

  val values = findValues

  case object Hello          extends CapitalHyphenEnum
  case object GoodBye        extends CapitalHyphenEnum
  case object WhisperGoodBye extends CapitalHyphenEnum with Lowercase

}

sealed trait DotEnum extends EnumEntry with Dotcase

object DotEnum extends Enum[DotEnum] {

  val values = findValues

  case object Hello        extends DotEnum
  case object GoodBye      extends DotEnum
  case object ShoutGoodBye extends DotEnum with Uppercase

}

sealed trait UpperDotEnum extends EnumEntry with UpperDotcase

object UpperDotEnum extends Enum[UpperDotEnum] {

  val values = findValues

  case object Hello          extends UpperDotEnum
  case object GoodBye        extends UpperDotEnum
  case object WhisperGoodBye extends UpperDotEnum with Lowercase

}

sealed trait CapitalDotEnum extends EnumEntry with CapitalDotcase

object CapitalDotEnum extends Enum[CapitalDotEnum] {

  val values = findValues

  case object Hello          extends CapitalDotEnum
  case object GoodBye        extends CapitalDotEnum
  case object WhisperGoodBye extends CapitalDotEnum with Lowercase

}

sealed trait WordsEnum extends EnumEntry with Words

object WordsEnum extends Enum[WordsEnum] {

  val values = findValues

  case object Hello        extends WordsEnum
  case object GoodBye      extends WordsEnum
  case object ShoutGoodBye extends WordsEnum with Uppercase

}

sealed trait UpperWordsEnum extends EnumEntry with UpperWords

object UpperWordsEnum extends Enum[UpperWordsEnum] {

  val values = findValues

  case object Hello          extends UpperWordsEnum
  case object GoodBye        extends UpperWordsEnum
  case object WhisperGoodBye extends UpperWordsEnum with Lowercase

}

sealed trait CapitalWordsEnum extends EnumEntry with CapitalWords

object CapitalWordsEnum extends Enum[CapitalWordsEnum] {

  val values = findValues

  case object Hello          extends CapitalWordsEnum
  case object GoodBye        extends CapitalWordsEnum
  case object WhisperGoodBye extends CapitalWordsEnum with Lowercase

}

sealed trait ColonEnum extends EnumEntry with Coloncase

object ColonEnum extends Enum[ColonEnum] {

  val values = findValues

  case object Hello        extends ColonEnum
  case object GoodBye      extends ColonEnum
  case object ShoutGoodBye extends ColonEnum with Uppercase

}

sealed trait UpperColonEnum extends EnumEntry with UpperColoncase

object UpperColonEnum extends Enum[UpperColonEnum] {

  val values = findValues

  case object Hello          extends UpperColonEnum
  case object GoodBye        extends UpperColonEnum
  case object WhisperGoodBye extends UpperColonEnum with Lowercase

}

sealed trait CapitalColonEnum extends EnumEntry with CapitalColoncase

object CapitalColonEnum extends Enum[CapitalColonEnum] {

  val values = findValues

  case object Hello          extends CapitalColonEnum
  case object GoodBye        extends CapitalColonEnum
  case object WhisperGoodBye extends CapitalColonEnum with Lowercase

}

sealed trait UpperEnum extends EnumEntry with Uppercase

object UpperEnum extends Enum[UpperEnum] {

  val values = findValues

  case object Hello   extends UpperEnum
  case object GoodBye extends UpperEnum
  case object Sike    extends UpperEnum with Lowercase

}

sealed trait LowerEnum extends EnumEntry with Lowercase

object LowerEnum extends Enum[LowerEnum] {

  val values = findValues

  case object Hello   extends LowerEnum
  case object GoodBye extends LowerEnum
  case object Sike    extends LowerEnum with Uppercase

}

sealed trait CamelcaseEnum extends EnumEntry with Camelcase

object CamelcaseEnum extends Enum[CamelcaseEnum] {

  val values = findValues

  case object HELLO      extends CamelcaseEnum
  case object GOOD_BYE   extends CamelcaseEnum
  case object SIKE_AGAIN extends CamelcaseEnum with Lowercase
  case object _PRIVATE   extends CamelcaseEnum
  case object CamelCase  extends CamelcaseEnum

}

sealed trait LowerCamelcaseEnum extends EnumEntry with LowerCamelcase

object LowerCamelcaseEnum extends Enum[LowerCamelcaseEnum] {

  val values = findValues

  case object HELLO      extends LowerCamelcaseEnum
  case object GOOD_BYE   extends LowerCamelcaseEnum
  case object SIKE_AGAIN extends LowerCamelcaseEnum with Uppercase
  case object _PRIVATE   extends LowerCamelcaseEnum

}

sealed trait UncapitalisedEnum extends EnumEntry with Uncapitalised

object UncapitalisedEnum extends Enum[UncapitalisedEnum] {

  val values = findValues

  case object Hello   extends UncapitalisedEnum
  case object GoodBye extends UncapitalisedEnum
  case object Sike    extends UncapitalisedEnum with Uppercase
  case object a       extends UncapitalisedEnum

}

sealed trait NestedObjectEnum extends EnumEntry

object NestedObjectEnum extends Enum[NestedObjectEnum] {

  val values = findValues

  case object Hello   extends NestedObjectEnum
  case object GoodBye extends NestedObjectEnum

  object nested1 {
    case object Hello extends NestedObjectEnum
    case object GoodBye extends NestedObjectEnum {
      case object NestedInsideMember extends NestedObjectEnum
    }
  }

  object nested2 {
    case object Hello   extends NestedObjectEnum
    case object GoodBye extends NestedObjectEnum

    object nested3 {
      case object Hello extends NestedObjectEnum
    }
  }

  class NestedClass {
    case object NotFound extends NestedObjectEnum
  }

  case object BackToRoot extends NestedObjectEnum

  object nested4 {
    case object NestedAgain extends NestedObjectEnum
  }

}

sealed class MultiEnum(override val entryName: String, val alternateNames: String*)
    extends EnumEntry

case object MultiEnum extends Enum[MultiEnum] {
  val values = findValues

  override lazy val namesToValuesMap: Map[String, MultiEnum] =
    values.flatMap { n =>
      (n.entryName -> n) +: n.alternateNames.map(_ -> n)
    }.toMap

  case object One extends MultiEnum("one", "1", "eins")
  case object Two extends MultiEnum("two", "2", "zwei")
}

object Wrapper {

  sealed trait SmartEnum extends EnumEntry

  object SmartEnum extends Enum[SmartEnum] {

    val values = findValues

    case object Hello   extends SmartEnum
    case object GoodBye extends SmartEnum
    case object Hi      extends SmartEnum

  }

}

object InTheWoods {
  sealed abstract class Mushroom(val toxic: Boolean) extends EnumEntry

  object Mushroom extends Enum[Mushroom] {

    val values = findValues

    case object FlyAgaric extends Mushroom(true)
    case object LSD       extends Mushroom(false)
    case object Shimeji   extends Mushroom(false)

  }
}
