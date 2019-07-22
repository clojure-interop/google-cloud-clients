(ns com.google.cloud.bigquery.Field
  "Google BigQuery Table schema field. A table field has a name, a type, a mode and possibly a
  description."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Field]))

(defn *of
  "Returns a Field object with given name and type.

  name - `java.lang.String`
  type - `com.google.cloud.bigquery.LegacySQLTypeName`
  sub-fields - `com.google.cloud.bigquery.Field`

  returns: `com.google.cloud.bigquery.Field`"
  (^com.google.cloud.bigquery.Field [^java.lang.String name ^com.google.cloud.bigquery.LegacySQLTypeName type ^com.google.cloud.bigquery.Field sub-fields]
    (Field/of name type sub-fields)))

(defn *new-builder
  "Returns a builder for a Field object with given name and type.

  name - `java.lang.String`
  type - `com.google.cloud.bigquery.LegacySQLTypeName`
  sub-fields - `com.google.cloud.bigquery.Field`

  returns: `com.google.cloud.bigquery.Field$Builder`"
  (^com.google.cloud.bigquery.Field$Builder [^java.lang.String name ^com.google.cloud.bigquery.LegacySQLTypeName type ^com.google.cloud.bigquery.Field sub-fields]
    (Field/newBuilder name type sub-fields)))

(defn get-mode
  "Returns the field mode. By default Field.Mode.NULLABLE is used.

  returns: `com.google.cloud.bigquery.Field$Mode`"
  (^com.google.cloud.bigquery.Field$Mode [^Field this]
    (-> this (.getMode))))

(defn get-type
  "Returns the field type.

  returns: `com.google.cloud.bigquery.LegacySQLTypeName`"
  (^com.google.cloud.bigquery.LegacySQLTypeName [^Field this]
    (-> this (.getType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Field this]
    (-> this (.toString))))

(defn get-name
  "Returns the field name.

  returns: `java.lang.String`"
  (^java.lang.String [^Field this]
    (-> this (.getName))))

(defn get-sub-fields
  "Returns the list of sub-fields if getType() is a LegacySQLTypeName.RECORD.
   Returns null otherwise.

  returns: `com.google.cloud.bigquery.FieldList`"
  (^com.google.cloud.bigquery.FieldList [^Field this]
    (-> this (.getSubFields))))

(defn get-description
  "Returns the field description.

  returns: `java.lang.String`"
  (^java.lang.String [^Field this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Field this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Field this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the Field object.

  returns: `com.google.cloud.bigquery.Field$Builder`"
  (^com.google.cloud.bigquery.Field$Builder [^Field this]
    (-> this (.toBuilder))))

