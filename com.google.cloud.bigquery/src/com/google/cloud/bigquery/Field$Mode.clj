(ns com.google.cloud.bigquery.Field$Mode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Field$Mode]))

(def NULLABLE
  "Enum Constant.

  type: com.google.cloud.bigquery.Field$Mode"
  Field$Mode/NULLABLE)

(def REQUIRED
  "Enum Constant.

  type: com.google.cloud.bigquery.Field$Mode"
  Field$Mode/REQUIRED)

(def REPEATED
  "Enum Constant.

  type: com.google.cloud.bigquery.Field$Mode"
  Field$Mode/REPEATED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Field.Mode c : Field.Mode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.Field$Mode[]`"
  ([]
    (Field$Mode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.Field$Mode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.Field$Mode [^java.lang.String name]
    (Field$Mode/valueOf name)))

