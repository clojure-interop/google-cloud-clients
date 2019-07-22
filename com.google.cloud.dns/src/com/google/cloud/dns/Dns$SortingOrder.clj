(ns com.google.cloud.dns.Dns$SortingOrder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns Dns$SortingOrder]))

(def DESCENDING
  "Enum Constant.

  type: com.google.cloud.dns.Dns$SortingOrder"
  Dns$SortingOrder/DESCENDING)

(def ASCENDING
  "Enum Constant.

  type: com.google.cloud.dns.Dns$SortingOrder"
  Dns$SortingOrder/ASCENDING)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Dns.SortingOrder c : Dns.SortingOrder.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.dns.Dns$SortingOrder[]`"
  ([]
    (Dns$SortingOrder/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.dns.Dns$SortingOrder`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.dns.Dns$SortingOrder [^java.lang.String name]
    (Dns$SortingOrder/valueOf name)))

(defn selector
  "returns: `java.lang.String`"
  (^java.lang.String [^Dns$SortingOrder this]
    (-> this (.selector))))

