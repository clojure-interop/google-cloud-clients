(ns com.google.cloud.bigquery.TimePartitioning$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery TimePartitioning$Type]))

(def DAY
  "Enum Constant.

  Table is partitioned per day, based on data loading time.

  type: com.google.cloud.bigquery.TimePartitioning$Type"
  TimePartitioning$Type/DAY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TimePartitioning.Type c : TimePartitioning.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.TimePartitioning$Type[]`"
  ([]
    (TimePartitioning$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.TimePartitioning$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.TimePartitioning$Type [^java.lang.String name]
    (TimePartitioning$Type/valueOf name)))

