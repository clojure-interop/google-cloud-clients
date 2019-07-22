(ns com.google.cloud.datastore.DatastoreOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreOptions]))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (DatastoreOptions/getDefaultHttpTransportOptions )))

(defn *get-default-instance
  "Returns a default DatastoreOptions instance.

  returns: `com.google.cloud.datastore.DatastoreOptions`"
  (^com.google.cloud.datastore.DatastoreOptions []
    (DatastoreOptions/getDefaultInstance )))

(defn *new-builder
  "returns: `com.google.cloud.datastore.DatastoreOptions$Builder`"
  (^com.google.cloud.datastore.DatastoreOptions$Builder []
    (DatastoreOptions/newBuilder )))

(defn get-namespace
  "Returns the default namespace to be used by the datastore service.

  returns: `java.lang.String`"
  (^java.lang.String [^DatastoreOptions this]
    (-> this (.getNamespace))))

(defn to-builder
  "returns: `com.google.cloud.datastore.DatastoreOptions$Builder`"
  (^com.google.cloud.datastore.DatastoreOptions$Builder [^DatastoreOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatastoreOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatastoreOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

