(ns com.google.cloud.resourcemanager.ResourceManagerOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManagerOptions]))

(defn *get-default-instance
  "Returns a default ResourceManagerOptions instance.

  returns: `com.google.cloud.resourcemanager.ResourceManagerOptions`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions []
    (ResourceManagerOptions/getDefaultInstance )))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (ResourceManagerOptions/getDefaultHttpTransportOptions )))

(defn *new-builder
  "returns: `com.google.cloud.resourcemanager.ResourceManagerOptions$Builder`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions$Builder []
    (ResourceManagerOptions/newBuilder )))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceManagerOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceManagerOptions this]
    (-> this (.hashCode))))

(defn to-builder
  "returns: `com.google.cloud.resourcemanager.ResourceManagerOptions$Builder`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions$Builder [^ResourceManagerOptions this]
    (-> this (.toBuilder))))

