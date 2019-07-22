(ns com.google.cloud.compute.deprecated.ComputeOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ComputeOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.compute.deprecated.ComputeOptions$Builder`"
  (^com.google.cloud.compute.deprecated.ComputeOptions$Builder [^ComputeOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.compute.deprecated.ComputeOptions`"
  (^com.google.cloud.compute.deprecated.ComputeOptions [^ComputeOptions$Builder this]
    (-> this (.build))))

