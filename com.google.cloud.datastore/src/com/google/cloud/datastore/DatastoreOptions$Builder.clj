(ns com.google.cloud.datastore.DatastoreOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore DatastoreOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.datastore.DatastoreOptions$Builder`"
  (^com.google.cloud.datastore.DatastoreOptions$Builder [^DatastoreOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.datastore.DatastoreOptions`"
  (^com.google.cloud.datastore.DatastoreOptions [^DatastoreOptions$Builder this]
    (-> this (.build))))

(defn set-namespace
  "Sets the default namespace to be used by the datastore service.

  namespace - `java.lang.String`

  returns: `com.google.cloud.datastore.DatastoreOptions$Builder`"
  (^com.google.cloud.datastore.DatastoreOptions$Builder [^DatastoreOptions$Builder this ^java.lang.String namespace]
    (-> this (.setNamespace namespace))))

