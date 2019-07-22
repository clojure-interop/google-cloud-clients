(ns com.google.cloud.bigquery.DatasetInfo$Builder
  "A builder for DatasetInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery DatasetInfo$Builder]))

(defn ->builder
  "Constructor."
  (^DatasetInfo$Builder []
    (new DatasetInfo$Builder )))

(defn set-dataset-id
  "Sets the dataset identity.

  dataset-id - `com.google.cloud.bigquery.DatasetId`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^com.google.cloud.bigquery.DatasetId dataset-id]
    (-> this (.setDatasetId dataset-id))))

(defn set-acl
  "Sets the dataset's access control configuration.

  acl - `java.util.List`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.util.List acl]
    (-> this (.setAcl acl))))

(defn set-default-table-lifetime
  "Sets the default lifetime of all tables in the dataset, in milliseconds. The minimum value is
   3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the
   dataset will have an expirationTime property set to the creation time plus the value in this
   property, and changing the value will only affect new tables, not existing ones. When the
   expirationTime for a given table is reached, that table will be deleted automatically. If a
   table's expirationTime is modified or removed before the table expires, or if you provide an
   explicit expirationTime when creating a table, that value takes precedence over the default
   expiration time indicated by this property. This property is experimental and might be
   subject to change or removed.

  default-table-lifetime - `java.lang.Long`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.lang.Long default-table-lifetime]
    (-> this (.setDefaultTableLifetime default-table-lifetime))))

(defn set-description
  "Sets a user-friendly description for the dataset.

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-friendly-name
  "Sets a user-friendly name for the dataset.

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-location
  "Sets the geographic location where the dataset should reside. This property is experimental
   and might be subject to change or removed.

  location - `java.lang.String`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-labels
  "labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn build
  "Creates a DatasetInfo object.

  returns: `com.google.cloud.bigquery.DatasetInfo`"
  (^com.google.cloud.bigquery.DatasetInfo [^DatasetInfo$Builder this]
    (-> this (.build))))

