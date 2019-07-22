(ns com.google.cloud.compute.deprecated.Network$Builder
  "A builder for Network objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Network$Builder]))

(defn set-network-id
  "Description copied from class: NetworkInfo.Builder

  network-id - `com.google.cloud.compute.deprecated.NetworkId`

  returns: `com.google.cloud.compute.deprecated.Network$Builder`"
  (^com.google.cloud.compute.deprecated.Network$Builder [^Network$Builder this ^com.google.cloud.compute.deprecated.NetworkId network-id]
    (-> this (.setNetworkId network-id))))

(defn set-description
  "Description copied from class: NetworkInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.Network$Builder`"
  (^com.google.cloud.compute.deprecated.Network$Builder [^Network$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-configuration
  "Description copied from class: NetworkInfo.Builder

  configuration - `com.google.cloud.compute.deprecated.NetworkConfiguration`

  returns: `com.google.cloud.compute.deprecated.Network$Builder`"
  (^com.google.cloud.compute.deprecated.Network$Builder [^Network$Builder this ^com.google.cloud.compute.deprecated.NetworkConfiguration configuration]
    (-> this (.setConfiguration configuration))))

(defn build
  "Description copied from class: NetworkInfo.Builder

  returns: `com.google.cloud.compute.deprecated.Network`"
  (^com.google.cloud.compute.deprecated.Network [^Network$Builder this]
    (-> this (.build))))

