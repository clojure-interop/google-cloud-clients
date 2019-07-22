(ns com.google.cloud.bigquery.DatastoreBackupOptions
  "Google BigQuery options for Cloud Datastore backup."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery DatastoreBackupOptions]))

(defn *new-builder
  "Returns a builder for a DatastoreBackupOptions object.

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions$Builder`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions$Builder []
    (DatastoreBackupOptions/newBuilder )))

(defn get-projection-fields
  "Returns the value of which entity properties to load into BigQuery from a Cloud Datastore
   backup.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DatastoreBackupOptions this]
    (-> this (.getProjectionFields))))

(defn to-builder
  "Returns a builder for the DatastoreBackupOptions object.

  returns: `com.google.cloud.bigquery.DatastoreBackupOptions$Builder`"
  (^com.google.cloud.bigquery.DatastoreBackupOptions$Builder [^DatastoreBackupOptions this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DatastoreBackupOptions this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatastoreBackupOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatastoreBackupOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

