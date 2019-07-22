(ns com.google.cloud.bigquery.FieldValue
  "Google BigQuery Table Field Value class. Objects of this class represent values of a BigQuery
  Table Field. A list of values forms a table row. Tables rows can be gotten as the result of a
  query or when listing table data."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery FieldValue]))

(defn *of
  "Creates an instance of FieldValue, useful for testing.

   If the attribute is FieldValue.Attribute.PRIMITIVE, the value should be the
   string representation of the underlying value, eg \"123\" for number 123.

   If the attribute is FieldValue.Attribute.REPEATED or FieldValue.Attribute.RECORD, the
   value should be List of FieldValues or FieldValueList,
   respectively.

   This method is unstable. See this discussion for more
   context.

  attribute - `com.google.cloud.bigquery.FieldValue$Attribute`
  value - `java.lang.Object`

  returns: `com.google.cloud.bigquery.FieldValue`"
  (^com.google.cloud.bigquery.FieldValue [^com.google.cloud.bigquery.FieldValue$Attribute attribute ^java.lang.Object value]
    (FieldValue/of attribute value)))

(defn get-repeated-value
  "Returns this field's value as a list of FieldValue. This method should only be used if
   the corresponding field has Field.Mode.REPEATED mode (i.e. getAttribute() is
   FieldValue.Attribute.REPEATED).

  returns: `java.util.List<com.google.cloud.bigquery.FieldValue>`

  throws: java.lang.ClassCastException - if the field has not Field.Mode.REPEATED mode"
  (^java.util.List [^FieldValue this]
    (-> this (.getRepeatedValue))))

(defn get-record-value
  "Returns this field's value as a FieldValueList instance. This method should only be
   used if the corresponding field has LegacySQLTypeName.RECORD type (i.e. getAttribute() is FieldValue.Attribute.RECORD).

  returns: `com.google.cloud.bigquery.FieldValueList`

  throws: java.lang.ClassCastException - if the field is not a LegacySQLTypeName.RECORD type"
  (^com.google.cloud.bigquery.FieldValueList [^FieldValue this]
    (-> this (.getRecordValue))))

(defn get-bytes-value
  "Returns this field's value as a byte array. This method should only be used if the
   corresponding field has primitive type (LegacySQLTypeName.BYTES.

  returns: `byte[]`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  ([^FieldValue this]
    (-> this (.getBytesValue))))

(defn null?
  "Returns true if this field's value is null, false otherwise.

  returns: `boolean`"
  (^Boolean [^FieldValue this]
    (-> this (.isNull))))

(defn get-long-value
  "Returns this field's value as a long. This method should only be used if the
   corresponding field has LegacySQLTypeName.INTEGER type.

  returns: `long`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^Long [^FieldValue this]
    (-> this (.getLongValue))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FieldValue this]
    (-> this (.toString))))

(defn get-value
  "Returns this field's value as an Object. If isNull() is true this
   method returns null.

  returns: `java.lang.Object`"
  (^java.lang.Object [^FieldValue this]
    (-> this (.getValue))))

(defn get-attribute
  "Returns the attribute of this Field Value.

  returns: FieldValue.Attribute.PRIMITIVE if the field is a primitive type (LegacySQLTypeName.BYTES, LegacySQLTypeName.BOOLEAN, LegacySQLTypeName.STRING, LegacySQLTypeName.FLOAT, LegacySQLTypeName.INTEGER, LegacySQLTypeName.NUMERIC, LegacySQLTypeName.TIMESTAMP, LegacySQLTypeName.GEOGRAPHY) or is null.
       Returns FieldValue.Attribute.REPEATED if the corresponding field has (Field.Mode.REPEATED) mode. Returns FieldValue.Attribute.RECORD if the corresponding field is
       a LegacySQLTypeName.RECORD type. - `com.google.cloud.bigquery.FieldValue$Attribute`"
  (^com.google.cloud.bigquery.FieldValue$Attribute [^FieldValue this]
    (-> this (.getAttribute))))

(defn get-numeric-value
  "Returns this field's value as a BigDecimal. This method should only be used
   if the corresponding field has LegacySQLTypeName.NUMERIC type.

  returns: `java.math.BigDecimal`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^java.math.BigDecimal [^FieldValue this]
    (-> this (.getNumericValue))))

(defn get-string-value
  "Returns this field's value as a String. This method should only be used if the
   corresponding field has primitive type (LegacySQLTypeName.BYTES, LegacySQLTypeName.BOOLEAN, LegacySQLTypeName.STRING, LegacySQLTypeName.FLOAT,
   LegacySQLTypeName.INTEGER, LegacySQLTypeName.NUMERIC LegacySQLTypeName.TIMESTAMP).

  returns: `java.lang.String`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^java.lang.String [^FieldValue this]
    (-> this (.getStringValue))))

(defn get-timestamp-value
  "Returns this field's value as a long, representing a timestamp in microseconds since
   epoch (UNIX time). This method should only be used if the corresponding field has LegacySQLTypeName.TIMESTAMP type.

  returns: `long`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^Long [^FieldValue this]
    (-> this (.getTimestampValue))))

(defn get-double-value
  "Returns this field's value as a Double. This method should only be used if the
   corresponding field has LegacySQLTypeName.FLOAT type.

  returns: `double`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^Double [^FieldValue this]
    (-> this (.getDoubleValue))))

(defn get-boolean-value?
  "Returns this field's value as a Boolean. This method should only be used if the
   corresponding field has LegacySQLTypeName.BOOLEAN type.

  returns: `boolean`

  throws: java.lang.ClassCastException - if the field is not a primitive type"
  (^Boolean [^FieldValue this]
    (-> this (.getBooleanValue))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FieldValue this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FieldValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

