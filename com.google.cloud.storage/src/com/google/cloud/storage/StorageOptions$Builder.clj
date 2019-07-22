(ns com.google.cloud.storage.StorageOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.storage.StorageOptions$Builder`"
  (^com.google.cloud.storage.StorageOptions$Builder [^StorageOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions [^StorageOptions$Builder this]
    (-> this (.build))))

