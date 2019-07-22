(ns com.google.cloud.logging.Logging$SortingOrder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Logging$SortingOrder]))

(def DESCENDING
  "Enum Constant.

  type: com.google.cloud.logging.Logging$SortingOrder"
  Logging$SortingOrder/DESCENDING)

(def ASCENDING
  "Enum Constant.

  type: com.google.cloud.logging.Logging$SortingOrder"
  Logging$SortingOrder/ASCENDING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Logging.SortingOrder c : Logging.SortingOrder.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.logging.Logging$SortingOrder[]`"
  ([]
    (Logging$SortingOrder/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.logging.Logging$SortingOrder`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.logging.Logging$SortingOrder [^java.lang.String name]
    (Logging$SortingOrder/valueOf name)))

