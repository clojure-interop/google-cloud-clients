(ns com.google.cloud.bigquery.DatastoreBackupOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery DatastoreBackupOptions$Builder]))

(defn set-projection-fields
  "Sets which entity properties to load into BigQuery from a Cloud Datastore backup. Property
   names are case sensitive and must be top-level properties. If no properties are specified,
   BigQuery loads all properties. If any named property isn't found in the Cloud Datastore
   backup, an invalid error is returned in the job result.

  projection-fields - `java.util.List`

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions$Builder`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions$Builder [^DatastoreBackupOptions$Builder this ^java.util.List projection-fields]
    (-> this (.setProjectionFields projection-fields))))

(defn build
  "Creates a DatastoreBackupOptions object.

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions [^DatastoreBackupOptions$Builder this]
    (-> this (.build))))

