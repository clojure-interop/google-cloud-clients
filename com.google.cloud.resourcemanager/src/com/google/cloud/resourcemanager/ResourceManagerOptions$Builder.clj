(ns com.google.cloud.resourcemanager.ResourceManagerOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ResourceManagerOptions$Builder]))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.resourcemanager.ResourceManagerOptions$Builder`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions$Builder [^ResourceManagerOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn build
  "returns: `com.google.cloud.resourcemanager.ResourceManagerOptions`"
  (^com.google.cloud.resourcemanager.ResourceManagerOptions [^ResourceManagerOptions$Builder this]
    (-> this (.build))))

