(ns com.google.cloud.spanner.TimestampBound$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner TimestampBound$Mode]))

(def STRONG
  "Enum Constant.

  type: com.google.cloud.spanner.TimestampBound$Mode"
  TimestampBound$Mode/STRONG)

(def READ_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.spanner.TimestampBound$Mode"
  TimestampBound$Mode/READ_TIMESTAMP)

(def MIN_READ_TIMESTAMP
  "Enum Constant.

  type: com.google.cloud.spanner.TimestampBound$Mode"
  TimestampBound$Mode/MIN_READ_TIMESTAMP)

(def EXACT_STALENESS
  "Enum Constant.

  type: com.google.cloud.spanner.TimestampBound$Mode"
  TimestampBound$Mode/EXACT_STALENESS)

(def MAX_STALENESS
  "Enum Constant.

  type: com.google.cloud.spanner.TimestampBound$Mode"
  TimestampBound$Mode/MAX_STALENESS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TimestampBound.Mode c : TimestampBound.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.TimestampBound$Mode[]`"
  ([]
    (TimestampBound$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.TimestampBound$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.TimestampBound$Mode [^java.lang.String name]
    (TimestampBound$Mode/valueOf name)))

