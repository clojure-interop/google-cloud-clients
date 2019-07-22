(ns com.google.cloud.compute.deprecated.ComputeOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ComputeOptions]))

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (ComputeOptions/getDefaultHttpTransportOptions )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.deprecated.ComputeOptions`"
  (^com.google.cloud.compute.deprecated.ComputeOptions []
    (ComputeOptions/getDefaultInstance )))

(defn *new-builder
  "returns: `com.google.cloud.compute.deprecated.ComputeOptions$Builder`"
  (^com.google.cloud.compute.deprecated.ComputeOptions$Builder []
    (ComputeOptions/newBuilder )))

(defn to-builder
  "returns: `com.google.cloud.compute.deprecated.ComputeOptions$Builder`"
  (^com.google.cloud.compute.deprecated.ComputeOptions$Builder [^ComputeOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ComputeOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ComputeOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

