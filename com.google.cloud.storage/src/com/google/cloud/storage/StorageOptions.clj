(ns com.google.cloud.storage.StorageOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage StorageOptions]))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (StorageOptions/getDefaultHttpTransportOptions )))

(defn *get-default-instance
  "Returns a default StorageOptions instance.

  returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions []
    (StorageOptions/getDefaultInstance )))

(defn *get-unauthenticated-instance
  "Returns a unauthenticated StorageOptions instance.

  returns: `com.google.cloud.storage.StorageOptions`"
  (^com.google.cloud.storage.StorageOptions []
    (StorageOptions/getUnauthenticatedInstance )))

(defn *new-builder
  "returns: `com.google.cloud.storage.StorageOptions$Builder`"
  (^com.google.cloud.storage.StorageOptions$Builder []
    (StorageOptions/newBuilder )))

(defn to-builder
  "returns: `com.google.cloud.storage.StorageOptions$Builder`"
  (^com.google.cloud.storage.StorageOptions$Builder [^StorageOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StorageOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StorageOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

