(ns com.google.cloud.bigquery.FieldValue$Attribute
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery FieldValue$Attribute]))

(def PRIMITIVE
  "Enum Constant.

  A primitive field value. A FieldValue is primitive when the corresponding field has
   type LegacySQLTypeName.BYTES, LegacySQLTypeName.BOOLEAN, LegacySQLTypeName.STRING, LegacySQLTypeName.FLOAT, LegacySQLTypeName.INTEGER, LegacySQLTypeName.NUMERIC, LegacySQLTypeName.TIMESTAMP, LegacySQLTypeName.GEOGRAPHY or the value is set to
   null.

  type: com.google.cloud.bigquery.FieldValue$Attribute"
  FieldValue$Attribute/PRIMITIVE)

(def REPEATED
  "Enum Constant.

  A FieldValue for a field with Field.Mode.REPEATED mode.

  type: com.google.cloud.bigquery.FieldValue$Attribute"
  FieldValue$Attribute/REPEATED)

(def RECORD
  "Enum Constant.

  A FieldValue for a field of type LegacySQLTypeName.RECORD.

  type: com.google.cloud.bigquery.FieldValue$Attribute"
  FieldValue$Attribute/RECORD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (FieldValue.Attribute c : FieldValue.Attribute.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigquery.FieldValue$Attribute[]`"
  ([]
    (FieldValue$Attribute/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigquery.FieldValue$Attribute`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigquery.FieldValue$Attribute [^java.lang.String name]
    (FieldValue$Attribute/valueOf name)))

