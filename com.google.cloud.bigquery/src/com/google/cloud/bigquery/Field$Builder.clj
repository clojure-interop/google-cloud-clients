(ns com.google.cloud.bigquery.Field$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Field$Builder]))

(defn set-name
  "Sets the field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   underscores (_), and must start with a letter or underscore. The maximum length is 128
   characters.

  name - `java.lang.String`

  returns: `com.google.cloud.bigquery.Field$Builder`"
  (^com.google.cloud.bigquery.Field$Builder [^Field$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-type
  "Sets the type of the field.

  type - BigQuery data type - `com.google.cloud.bigquery.LegacySQLTypeName`
  sub-fields - nested schema fields in case if type is LegacySQLTypeName.RECORD, empty otherwise - `com.google.cloud.bigquery.Field`

  returns: `com.google.cloud.bigquery.Field$Builder`

  throws: java.lang.IllegalArgumentException - if type == LegacySQLTypeName.RECORD && subFields.length == 0 or if type != LegacySQLTypeName.RECORD && subFields.length != 0"
  (^com.google.cloud.bigquery.Field$Builder [^Field$Builder this ^com.google.cloud.bigquery.LegacySQLTypeName type ^com.google.cloud.bigquery.Field sub-fields]
    (-> this (.setType type sub-fields))))

(defn set-mode
  "Sets the mode of the field. When not specified Field.Mode.NULLABLE is used.

  mode - `com.google.cloud.bigquery.Field$Mode`

  returns: `com.google.cloud.bigquery.Field$Builder`"
  (^com.google.cloud.bigquery.Field$Builder [^Field$Builder this ^com.google.cloud.bigquery.Field$Mode mode]
    (-> this (.setMode mode))))

(defn set-description
  "Sets the field description. The maximum length is 16K characters.

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.Field$Builder`"
  (^com.google.cloud.bigquery.Field$Builder [^Field$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn build
  "Creates a Field object.

  returns: `com.google.cloud.bigquery.Field`"
  (^com.google.cloud.bigquery.Field [^Field$Builder this]
    (-> this (.build))))

